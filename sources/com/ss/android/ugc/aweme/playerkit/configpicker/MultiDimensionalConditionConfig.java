package com.ss.android.ugc.aweme.playerkit.configpicker;

import X.InterfaceC65349Pkn;
import com.google.gson.j;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class MultiDimensionalConditionConfig {

    @InterfaceC65349Pkn("config_list")
    public List<ConditionConfig> configList;

    @InterfaceC65349Pkn("libra_vid")
    public String libraVid;

    @InterfaceC65349Pkn("priority_config")
    public List<String> priorityConfig;

    /* loaded from: classes15.dex */
    public static class ConditionConfig {

        @InterfaceC65349Pkn("client_filter_requirement")
        public Map<String, List<String>> clientFilterRequirement;

        @InterfaceC65349Pkn("config")
        public j configContent;

        @InterfaceC65349Pkn("config_id")
        public String configId;

        @InterfaceC65349Pkn("server_filter_requirement")
        public Map<String, List<String>> serverFilterRequirement;
    }
}
