package X;

import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.contact.service.IIMContactService;
import com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.List;

/* renamed from: X.3GN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GN implements IIMContactService {
    public static final C3GN LIZIZ = new C3GN();
    public final /* synthetic */ IIMContactService LIZ;

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LIZIZ(int i, String str) {
        this.LIZ.LIZIZ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final IMUser LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final EE1 LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final MAFIMUser LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final Object LJII(InterfaceC67352kd<? super List<IMUserBaseInfo>> interfaceC67352kd) {
        return this.LIZ.LJII(interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final MAFIMUser LJIIIIZZ(String str) {
        return this.LIZ.LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final EFM LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    public C3GN() {
        IIMContactService iIMContactService;
        Object LIZ = C58096Mr6.LIZ(IIMContactService.class, false);
        if (LIZ != null) {
            iIMContactService = (IIMContactService) LIZ;
        } else {
            if (C58096Mr6.k == null) {
                synchronized (IIMContactService.class) {
                    if (C58096Mr6.k == null) {
                        C58096Mr6.k = new IMContactServiceImpl();
                    }
                }
            }
            iIMContactService = C58096Mr6.k;
        }
        this.LIZ = iIMContactService;
    }
}
