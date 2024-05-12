package X;

import com.fackbook.drawee.IDraweeConfigOutService;
import com.ss.android.ugc.aweme.image.DraweeConfigOutService;

/* renamed from: X.Nrz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60699Nrz extends AbstractC65781Prl implements InterfaceC65784Pro<W4P<? extends AbstractC81686W4c<?, ?, ?, ?>>> {
    public static final C60699Nrz LJLIL = new C60699Nrz();

    public C60699Nrz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W4P<? extends AbstractC81686W4c<?, ?, ?, ?>> invoke() {
        IDraweeConfigOutService iDraweeConfigOutService;
        Object LIZ = C58096Mr6.LIZ(IDraweeConfigOutService.class, false);
        if (LIZ != null) {
            iDraweeConfigOutService = (IDraweeConfigOutService) LIZ;
        } else {
            if (C58096Mr6.m1 == null) {
                synchronized (IDraweeConfigOutService.class) {
                    if (C58096Mr6.m1 == null) {
                        C58096Mr6.m1 = new DraweeConfigOutService();
                    }
                }
            }
            iDraweeConfigOutService = C58096Mr6.m1;
        }
        if (iDraweeConfigOutService != null) {
            return iDraweeConfigOutService.LIZ();
        }
        return null;
    }
}
