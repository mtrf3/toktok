package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChallengeElasticLayer implements Serializable {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("tag")
    public final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeElasticLayer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChallengeElasticLayer copy$default(ChallengeElasticLayer challengeElasticLayer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeElasticLayer.tag;
        }
        if ((i & 2) != 0) {
            str2 = challengeElasticLayer.desc;
        }
        return challengeElasticLayer.copy(str, str2);
    }

    public final ChallengeElasticLayer copy(String str, String str2) {
        return new ChallengeElasticLayer(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeElasticLayer)) {
            return false;
        }
        ChallengeElasticLayer challengeElasticLayer = (ChallengeElasticLayer) obj;
        return o.LJ(this.tag, challengeElasticLayer.tag) && o.LJ(this.desc, challengeElasticLayer.desc);
    }

    public int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChallengeElasticLayer(tag=");
        LIZ.append(this.tag);
        LIZ.append(", desc=");
        return q.LIZIZ(LIZ, this.desc, ')', LIZ);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTag() {
        return this.tag;
    }

    public ChallengeElasticLayer(String str, String str2) {
        this.tag = str;
        this.desc = str2;
    }

    public /* synthetic */ ChallengeElasticLayer(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
