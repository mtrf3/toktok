package X;

/* renamed from: X.L5o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53696L5o implements InterfaceC53698L5q {
    public final L5S LIZ;

    public C53696L5o() {
        L5S l5s;
        if (C2304092m.LIZ()) {
            l5s = L5S.LOTTIE_ANIMATION;
        } else {
            l5s = L5S.PROGRESS_BAR;
        }
        this.LIZ = l5s;
    }

    @Override // X.InterfaceC53698L5q
    public final L5S LIZ() {
        return this.LIZ;
    }
}
