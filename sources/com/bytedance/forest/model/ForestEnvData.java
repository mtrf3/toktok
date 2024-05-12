package com.bytedance.forest.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ForestEnvData extends F9E {
    public final String name;
    public final ForestEnvType type;

    public static /* synthetic */ ForestEnvData copy$default(ForestEnvData forestEnvData, ForestEnvType forestEnvType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            forestEnvType = forestEnvData.type;
        }
        if ((i & 2) != 0) {
            str = forestEnvData.name;
        }
        return forestEnvData.copy(forestEnvType, str);
    }

    public final ForestEnvData copy(ForestEnvType type, String name) {
        o.LJIIJ(type, "type");
        o.LJIIJ(name, "name");
        return new ForestEnvData(type, name);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.type, this.name};
    }

    public final String getName() {
        return this.name;
    }

    public final ForestEnvType getType() {
        return this.type;
    }

    public ForestEnvData(ForestEnvType type, String name) {
        o.LJIIJ(type, "type");
        o.LJIIJ(name, "name");
        this.type = type;
        this.name = name;
    }
}
