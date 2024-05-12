package com.bytedance.geckox.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes11.dex */
public class CleanPolicyModel {

    @InterfaceC65349Pkn("group_clean")
    public GroupCleanPolicy groupClean;

    @InterfaceC65349Pkn("specified_clean")
    public List<ChannelCleanPolicy> specifiedClean;

    /* loaded from: classes11.dex */
    public static class GroupCleanPolicy {

        @InterfaceC65349Pkn("limit")
        public int limit;

        @InterfaceC65349Pkn("policy")
        public int policy;

        @InterfaceC65349Pkn("rule")
        public int rule;
    }

    /* loaded from: classes11.dex */
    public class ChannelCleanPolicy {

        @InterfaceC65349Pkn("c")
        public String channel;

        @InterfaceC65349Pkn("clean_type")
        public int cleanType;

        @InterfaceC65349Pkn("err_code")
        public int errCode;

        @InterfaceC65349Pkn("err_msg")
        public String errMsg;

        @InterfaceC65349Pkn("pkg_id")
        public int pkgId;

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("version")
        public List<Long> versions;

        public ChannelCleanPolicy(CleanPolicyModel cleanPolicyModel) {
        }
    }
}
