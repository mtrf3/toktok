package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nuy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60884Nuy implements InterfaceC60718NsI {
    public final /* synthetic */ C61419O8p LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC60718NsI
    public final void LIZ(String subTitle) {
        o.LJIIIZ(subTitle, "subTitle");
    }

    @Override // X.InterfaceC60718NsI
    public final void LIZIZ(String str) {
        if (this.LIZ.LJLJI == 2 && str != null && C96Q.LIZ(str)) {
            C9KF c9kf = this.LIZ.LJLJLLL;
            c9kf.getClass();
            c9kf.LIZJ = str;
            C252709vu c252709vu = this.LIZ.LJLJLJ;
            if (c252709vu != null) {
                c252709vu.LJIILLIIL(c9kf);
            }
            AbstractC60787NtP abstractC60787NtP = this.LIZ.LJLIL;
            if (abstractC60787NtP != null) {
                abstractC60787NtP.LIZJ(EnumC60885Nuz.TITLE, str, System.currentTimeMillis() - this.LIZIZ);
            }
        }
    }

    public C60884Nuy(C61419O8p c61419O8p, long j) {
        this.LIZ = c61419O8p;
        this.LIZIZ = j;
    }
}
