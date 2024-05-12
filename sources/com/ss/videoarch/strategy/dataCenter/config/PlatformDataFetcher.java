package com.ss.videoarch.strategy.dataCenter.config;

import X.C79333VBp;
import X.InterfaceC79328VBk;

/* loaded from: classes15.dex */
public class PlatformDataFetcher {
    public InterfaceC79328VBk mAppInfoBundle;

    public static PlatformDataFetcher getInstance() {
        return C79333VBp.LIZ;
    }

    public static void init(InterfaceC79328VBk interfaceC79328VBk) {
        getInstance().mAppInfoBundle = interfaceC79328VBk;
    }

    private <T> T getDolphinSettings(String str, T t) {
        InterfaceC79328VBk interfaceC79328VBk = this.mAppInfoBundle;
        if (interfaceC79328VBk == null) {
            return t;
        }
        return (T) interfaceC79328VBk.LIZ(str, t);
    }

    public int GetDolphinSettings_int(String str, int i) {
        return ((Integer) getDolphinSettings(str, Integer.valueOf(i))).intValue();
    }

    public String GetDolphinSettings_string(String str, String str2) {
        return (String) getDolphinSettings(str, str2);
    }
}
