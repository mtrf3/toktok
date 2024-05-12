package com.ss.android.ugc.aweme.playerkit.configpickerimpl.data;

import X.InterfaceC65349Pkn;
import com.google.gson.j;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class ConditionConfig {

    @InterfaceC65349Pkn("client_filter_requirement")
    public Map<String, List<String>> clientFilterRequirement;

    @InterfaceC65349Pkn("config")
    public j configContent;

    @InterfaceC65349Pkn("server_filter_requirement")
    public Map<String, List<String>> serverFilterRequirement;

    public final int LIZ() {
        int size;
        Map<String, List<String>> map = this.clientFilterRequirement;
        int i = 0;
        if (map == null) {
            size = 0;
        } else {
            size = map.size();
        }
        Map<String, List<String>> map2 = this.serverFilterRequirement;
        if (map2 != null) {
            i = map2.size();
        }
        return size + i;
    }
}
