package com.ss.android.ugc.gamora.recorder.navi.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ResolvedEffect {

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("path")
    public final String path;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedEffect)) {
            return false;
        }
        ResolvedEffect resolvedEffect = (ResolvedEffect) obj;
        return o.LJ(this.path, resolvedEffect.path) && o.LJ(this.effectId, resolvedEffect.effectId);
    }

    public final int hashCode() {
        String str = this.path;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResolvedEffect(path=");
        LIZ.append(this.path);
        LIZ.append(", effectId=");
        return q.LIZIZ(LIZ, this.effectId, ')', LIZ);
    }

    public ResolvedEffect(String str, String str2) {
        this.path = str;
        this.effectId = str2;
    }
}
