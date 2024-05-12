package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZsX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91309ZsX {
    public static final C91309ZsX LIZJ = new C91309ZsX("dsp_recommend", "dsp_recommend");
    public static final C91309ZsX LIZLLL = new C91309ZsX("collection_recommend", "collection_recommend");
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C91309ZsX.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.playerservice.enums.PlayableQueueType");
        C91309ZsX c91309ZsX = (C91309ZsX) obj;
        if (o.LJ(this.LIZ, c91309ZsX.LIZ) && o.LJ(this.LIZIZ, c91309ZsX.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C91309ZsX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
