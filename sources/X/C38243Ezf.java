package X;

import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;

/* renamed from: X.Ezf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38243Ezf implements InterfaceC39517Ff7 {
    @Override // X.InterfaceC39517Ff7
    public final void LIZIZ(C39489Fef c39489Fef) {
    }

    @Override // X.InterfaceC39517Ff7
    public final void LIZ(C39489Fef c39489Fef) {
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LJIIIZ(c39489Fef);
        }
    }

    @Override // X.InterfaceC39517Ff7
    public final boolean LIZJ(C39489Fef c39489Fef) {
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LJIIJJI(c39489Fef);
            return false;
        }
        return false;
    }
}
