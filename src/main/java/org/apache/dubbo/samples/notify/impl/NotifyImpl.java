/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.apache.dubbo.samples.notify.impl;

import org.apache.dubbo.samples.notify.api.Notify;

import java.util.HashMap;
import java.util.Map;
//事件通知服务
public class NotifyImpl implements Notify {

    public Map<Integer, Object> ret = new HashMap<>();

    @Override
    public void onReturn(String name, int id) {
        ret.put(id, name);
        System.out.println("onReturn: " + name);
    }

    @Override
    public void onThrow(Throwable ex, int id) {
        ret.put(id, ex);
        System.out.println("onThrow: " + ex);
    }

	@Override
	public void oninvoke(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onreturnWithoutParam(String result) {
		// TODO Auto-generated method stub
		
	}
}
