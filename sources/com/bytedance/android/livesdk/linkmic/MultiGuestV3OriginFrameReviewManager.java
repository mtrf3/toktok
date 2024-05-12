package com.bytedance.android.livesdk.linkmic;

import X.BP4;
import X.C1EW;
import X.C1VE;
import X.C28718BOw;
import X.C30509ByD;
import X.C30520ByO;
import X.C30521ByP;
import X.C30522ByQ;
import X.C30523ByR;
import X.C5H3;
import X.C73318Sq2;
import X.C78996UzQ;
import X.CKJ;
import X.InterfaceC21020s6;
import X.InterfaceC75560Tl6;
import com.bytedance.android.livesdk.api.StickerReportApi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_REVIEW_MANAGER")
/* loaded from: classes6.dex */
public final class MultiGuestV3OriginFrameReviewManager implements C1VE {
    public final long LIZ;
    public LiveEffect LIZIZ;
    public final C5H3 LIZJ = C78996UzQ.LJJIJIIJI(C30523ByR.LJLIL);
    public final C5H3 LIZLLL = C78996UzQ.LJJIJIIJI(C30509ByD.LJLIL);
    public InterfaceC21020s6 LJ;
    public int LJFF;
    public boolean LJI;

    @Override // X.C1VE
    public final void LIZLLL() {
        InterfaceC21020s6 interfaceC21020s6;
        this.LJI = true;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.reviewOriginalFrame && this.LJFF == 1 && (interfaceC21020s6 = this.LJ) != null) {
            ((CKJ) this.LIZLLL.getValue()).LIZJ(interfaceC21020s6, this.LIZ);
        }
    }

    @Override // X.C1VE
    public final void LJI() {
        this.LJFF = 1;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.reviewOriginalFrame && this.LJI) {
            LJIIJ();
        }
    }

    @Override // X.C1VE
    public final void LJII() {
        InterfaceC21020s6 interfaceC21020s6;
        this.LJFF = 1;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.reviewOriginalFrame && this.LJI && (interfaceC21020s6 = this.LJ) != null) {
            ((CKJ) this.LIZLLL.getValue()).LIZJ(interfaceC21020s6, this.LIZ);
        }
    }

    @Override // X.C1VE
    public final void LIZ() {
        ((C73318Sq2) this.LIZJ.getValue()).LIZLLL();
        LJIIJ();
        this.LJFF = 0;
        this.LJI = false;
        this.LJ = null;
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC17140lq
    public final void LIZJ() {
        if (this.LIZIZ == null) {
            return;
        }
        LJIIIZ(null);
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.reviewOriginalFrame) {
            LJIIJ();
        }
        this.LIZIZ = null;
    }

    @Override // X.C1VE
    public final void LJ() {
        ((CKJ) this.LIZLLL.getValue()).LIZ();
    }

    public final void LJIIJ() {
        CKJ ckj = (CKJ) this.LIZLLL.getValue();
        ckj.LJIIJ = 0L;
        ckj.LIZLLL();
    }

    @Override // X.C1VE
    public final void onAppEnterForeground() {
        ((CKJ) this.LIZLLL.getValue()).LIZIZ();
    }

    public MultiGuestV3OriginFrameReviewManager(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC17140lq
    public final void LIZIZ(LiveEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        LJIIIZ(sticker);
        this.LIZIZ = sticker;
    }

    @Override // X.C1VE
    public final void LJFF(InterfaceC21020s6 interfaceC21020s6) {
        this.LJ = interfaceC21020s6;
    }

    @Override // X.InterfaceC17140lq
    public final void LJIIIIZZ(LiveEffect liveEffect) {
        LJIIIZ(liveEffect);
        if (liveEffect.reviewOriginalFrame && this.LJI) {
            InterfaceC21020s6 interfaceC21020s6 = this.LJ;
            if (interfaceC21020s6 != null) {
                ((CKJ) this.LIZLLL.getValue()).LIZJ(interfaceC21020s6, this.LIZ);
            }
        } else {
            LJIIJ();
        }
        this.LIZIZ = liveEffect;
    }

    public final void LJIIIZ(LiveEffect liveEffect) {
        long j;
        String str;
        String resourceId;
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect2 = this.LIZIZ;
        c30522ByQ.getClass();
        if (C30522ByQ.LIZ(liveEffect, liveEffect2)) {
            return;
        }
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        StickerReportApi stickerReportApi = (StickerReportApi) LIZ.LIZIZ(StickerReportApi.class);
        long j2 = this.LIZ;
        long j3 = 0;
        if (liveEffect != null) {
            j = liveEffect.effectId;
        } else {
            j = 0;
        }
        String valueOf = String.valueOf(j);
        LiveEffect liveEffect3 = this.LIZIZ;
        if (liveEffect3 != null) {
            j3 = liveEffect3.effectId;
        }
        String valueOf2 = String.valueOf(j3);
        String str2 = "";
        if (liveEffect == null || (str = liveEffect.getResourceId()) == null) {
            str = "";
        }
        LiveEffect liveEffect4 = this.LIZIZ;
        if (liveEffect4 != null && (resourceId = liveEffect4.getResourceId()) != null) {
            str2 = resourceId;
        }
        ((C73318Sq2) this.LIZJ.getValue()).LIZ(C1EW.LIZ(stickerReportApi.reportEffectChange(j2, 1, valueOf, valueOf2, str, str2, 2)).LJJJLIIL(C30520ByO.LJLIL, C30521ByP.LJLIL));
    }
}
