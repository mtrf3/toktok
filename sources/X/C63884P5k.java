package X;

import defpackage.i0;

/* renamed from: X.P5k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63884P5k implements PIS {
    public final String LIZ;

    @Override // X.PIS
    public final String generate() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(C63887P5n.LIZ());
        return X1D.LIZIZ(LIZ);
    }

    public C63884P5k(String str) {
        String[] split = str.split("-");
        if (split.length > 0 && "03".equals(split[0])) {
            this.LIZ = split[1].substring(0, 16);
            return;
        }
        throw new IllegalArgumentException(i0.LJFF("traceparent format not supported: ", str));
    }
}
