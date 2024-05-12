package com.ss.ugc.effectplatform.model.net;

import X.C65352Pkq;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreloadEffectModel {
    public final String effect_id;
    public final String md5;

    public int hashCode() {
        return this.md5.hashCode() + (this.effect_id.hashCode() * 31);
    }

    public final String getEffect_id() {
        return this.effect_id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!o.LJ(C65352Pkq.LIZ(PreloadEffectModel.class), C65352Pkq.LIZ(obj.getClass())))) {
            return false;
        }
        PreloadEffectModel preloadEffectModel = (PreloadEffectModel) obj;
        if (!(!o.LJ(this.effect_id, preloadEffectModel.effect_id)) && !(!o.LJ(this.md5, preloadEffectModel.md5))) {
            return true;
        }
        return false;
    }

    public PreloadEffectModel(String effect_id, String md5) {
        o.LJIIJ(effect_id, "effect_id");
        o.LJIIJ(md5, "md5");
        this.effect_id = effect_id;
        this.md5 = md5;
    }
}
