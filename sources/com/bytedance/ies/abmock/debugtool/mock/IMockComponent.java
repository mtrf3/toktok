package com.bytedance.ies.abmock.debugtool.mock;

import java.util.Map;

/* loaded from: classes2.dex */
public interface IMockComponent {

    /* loaded from: classes2.dex */
    public interface HostInfo {
        String chineseDesc();

        String englishDesc();

        int hostId();
    }

    Object get(String str);

    Map<String, Object> getExtendInfo(String str);

    Class<?> getFiledType(String str);

    HostInfo hostInfo();

    String mockInfoListJson();
}
