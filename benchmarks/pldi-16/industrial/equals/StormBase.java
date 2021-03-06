/* ./apache-storm-44e9aaf/storm-core/src/jvm/backtype/storm/generated/StormBase.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-5")
public class StormBase implements org.apache.thrift.TBase<StormBase, StormBase._Fields>, java.io.Serializable, Cloneable, Comparable<StormBase> {
  private String name; // required
  private TopologyStatus status; // required
  private int num_workers; // required
  private MapStringInteger component_executors; // optional
  private int launch_time_secs; // optional
  private String owner; // optional
  private TopologyActionOptions topology_action_options; // optional
  private TopologyStatus prev_status; // optional
  
  boolean is_set_name();
  boolean is_set_status();
  boolean is_set_component_executors();
  boolean is_set_launch_time_secs();
  boolean is_set_owner();
  boolean is_set_topology_action_options();
  boolean is_set_prev_status();
  
  public boolean equals(StormBase o1, StormBase o2) {
    boolean this_present_name = true && o1.is_set_name();
    boolean that_present_name = true && o2.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (equals(o1.name,o2.name) == 0)
        return false;
    }

    boolean this_present_status = true && o1.is_set_status();
    boolean that_present_status = true && o2.is_set_status();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (equals(o1.status,o2.status) == 0)
        return false;
    }

    boolean this_present_num_workers = true;
    boolean that_present_num_workers = true;
    if (this_present_num_workers || that_present_num_workers) {
      if (!(this_present_num_workers && that_present_num_workers))
        return false;
      if (o1.num_workers != o2.num_workers)
        return false;
    }

    boolean this_present_component_executors = true && o1.is_set_component_executors();
    boolean that_present_component_executors = true && o2.is_set_component_executors();
    if (this_present_component_executors || that_present_component_executors) {
      if (!(this_present_component_executors && that_present_component_executors))
        return false;
      if (equals(o1.component_executors,o2.component_executors) == 0)
        return false;
    }

    boolean this_present_launch_time_secs = true && o1.is_set_launch_time_secs();
    boolean that_present_launch_time_secs = true && o2.is_set_launch_time_secs();
    if (this_present_launch_time_secs || that_present_launch_time_secs) {
      if (!(this_present_launch_time_secs && that_present_launch_time_secs))
        return false;
      if (o1.launch_time_secs != o2.launch_time_secs)
        return false;
    }

    boolean this_present_owner = true && o1.is_set_owner();
    boolean that_present_owner = true && o2.is_set_owner();
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (equals(o1.owner,o2.owner) == 0)
        return false;
    }

    boolean this_present_topology_action_options = true && o1.is_set_topology_action_options();
    boolean that_present_topology_action_options = true && o2.is_set_topology_action_options();
    if (this_present_topology_action_options || that_present_topology_action_options) {
      if (!(this_present_topology_action_options && that_present_topology_action_options))
        return false;
      if (equals(o1.topology_action_options,o2.topology_action_options) == 0)
        return false;
    }

    boolean this_present_prev_status = true && o1.is_set_prev_status();
    boolean that_present_prev_status = true && o2.is_set_prev_status();
    if (this_present_prev_status || that_present_prev_status) {
      if (!(this_present_prev_status && that_present_prev_status))
        return false;
      if (equals(o1.prev_status,o2.prev_status)==0)
        return false;
    }

    return true;
  }

}

