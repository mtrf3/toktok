package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0f4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12940f4 {
    public final String LIZ;
    public Float LIZIZ;
    public String LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveComposerTagNode(tag='");
        LIZ.append(this.LIZ);
        LIZ.append("', value=");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C12940f4(String tag) {
        o.LJIIIZ(tag, "tag");
        this.LIZ = tag;
        this.LIZJ = "";
    }
}
