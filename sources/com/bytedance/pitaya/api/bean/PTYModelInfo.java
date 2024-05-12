package com.bytedance.pitaya.api.bean;

import X.EAI;
import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PTYModelInfo extends F9E implements ReflectionCall {
    public static final EAI Companion = new EAI();
    public final int engineType;
    public final String modelGroup;
    public final String name;
    public final String originModelPath;
    public final String version;

    public static /* synthetic */ PTYModelInfo copy$default(PTYModelInfo pTYModelInfo, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pTYModelInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = pTYModelInfo.version;
        }
        if ((i2 & 4) != 0) {
            i = pTYModelInfo.engineType;
        }
        if ((i2 & 8) != 0) {
            str3 = pTYModelInfo.modelGroup;
        }
        if ((i2 & 16) != 0) {
            str4 = pTYModelInfo.originModelPath;
        }
        return pTYModelInfo.copy(str, str2, i, str3, str4);
    }

    public final PTYModelInfo copy(String name, String version, int i, String str, String str2) {
        o.LJIIJ(name, "name");
        o.LJIIJ(version, "version");
        return new PTYModelInfo(name, version, i, str, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.version, Integer.valueOf(this.engineType), this.modelGroup, this.originModelPath};
    }

    public final int getEngineType() {
        return this.engineType;
    }

    public final String getModelGroup() {
        return this.modelGroup;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginModelPath() {
        return this.originModelPath;
    }

    public final String getVersion() {
        return this.version;
    }

    public PTYModelInfo(String name, String version, int i, String str, String str2) {
        o.LJIIJ(name, "name");
        o.LJIIJ(version, "version");
        this.name = name;
        this.version = version;
        this.engineType = i;
        this.modelGroup = str;
        this.originModelPath = str2;
    }
}
