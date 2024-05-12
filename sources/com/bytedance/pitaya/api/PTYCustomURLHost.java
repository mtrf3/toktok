package com.bytedance.pitaya.api;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes7.dex */
public final class PTYCustomURLHost extends F9E implements ReflectionCall {
    public final String authURLHost;
    public final String urlHost;

    public static /* synthetic */ PTYCustomURLHost copy$default(PTYCustomURLHost pTYCustomURLHost, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYCustomURLHost.urlHost;
        }
        if ((i & 2) != 0) {
            str2 = pTYCustomURLHost.authURLHost;
        }
        return pTYCustomURLHost.copy(str, str2);
    }

    public final PTYCustomURLHost copy(String str, String str2) {
        return new PTYCustomURLHost(str, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.urlHost, this.authURLHost};
    }

    public final String getAuthURLHost() {
        return this.authURLHost;
    }

    public final String getUrlHost() {
        return this.urlHost;
    }

    public PTYCustomURLHost(String str, String str2) {
        this.urlHost = str;
        this.authURLHost = str2;
    }
}
