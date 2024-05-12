package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.IDanmakuService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.DanmakuServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62623Ohv implements IDanmakuService {
    public static final C62623Ohv LIZIZ = new C62623Ohv();
    public final /* synthetic */ IDanmakuService LIZ;

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LIZ(ViewGroup viewGroup, Aweme aweme) {
        this.LIZ.LIZ(viewGroup, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LIZLLL(Aweme aweme, boolean z, int i, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LIZLLL(aweme, z, i, enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJFF(Aweme aweme) {
        return this.LIZ.LJFF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIIZZ(Aweme aweme) {
        return this.LIZ.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIIZ(Aweme aweme) {
        return this.LIZ.LJIIIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final void LJIILIIL(Aweme aweme, String enterFrom, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJIILIIL(aweme, enterFrom, z);
    }

    @Override // com.ss.android.ugc.aweme.IDanmakuService
    public final boolean LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    public C62623Ohv() {
        IDanmakuService iDanmakuService;
        Object LIZ = C58096Mr6.LIZ(IDanmakuService.class, false);
        if (LIZ != null) {
            iDanmakuService = (IDanmakuService) LIZ;
        } else {
            if (C58096Mr6.T4 == null) {
                synchronized (IDanmakuService.class) {
                    if (C58096Mr6.T4 == null) {
                        C58096Mr6.T4 = new DanmakuServiceImpl();
                    }
                }
            }
            iDanmakuService = C58096Mr6.T4;
        }
        this.LIZ = iDanmakuService;
    }
}
