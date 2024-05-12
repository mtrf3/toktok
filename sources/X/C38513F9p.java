package X;

/* renamed from: X.F9p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38513F9p implements InterfaceC37489EnV {
    public final /* synthetic */ C38515F9r LIZ;

    public C38513F9p(C38515F9r c38515F9r) {
        this.LIZ = c38515F9r;
    }

    @Override // X.InterfaceC37489EnV
    public final void release() {
        C38515F9r c38515F9r = this.LIZ;
        if (c38515F9r != null) {
            if (c38515F9r.LJ == EnumC38514F9q.FETCHING || c38515F9r.LJ == EnumC38514F9q.PENDING) {
                c38515F9r.LJ = EnumC38514F9q.CANCELED;
                C61284O3k c61284O3k = c38515F9r.LIZLLL;
                if (c61284O3k == null || c61284O3k.LIZ) {
                    return;
                }
                c61284O3k.LIZ = true;
            }
        }
    }
}
