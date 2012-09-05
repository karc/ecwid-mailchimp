/*
 *  MailChimp API Wrapper
 *  Copyright (c) 2012 Ecwid, Inc
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.ecwid.mailchimp.method;

import com.ecwid.mailchimp.annotation.MailChimpField;
import java.util.List;

/**
 *
 * @author Vasily Karyaev <v.karyaev@gmail.com>
 */
public class ListBatchSubscribeResult extends MailChimpObject {
	
	@MailChimpField
	public Integer add_count;
	
	@MailChimpField
	public Integer update_count;
	
	@MailChimpField
	public Integer error_count;
	
	@MailChimpField
	public List<ListBatchError> errors;
}