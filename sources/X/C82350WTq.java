package X;

import Y.IDCListenerS165S0100000_14;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.WTq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82350WTq implements WTC {
    public final ShortVideoContext LIZ;
    public final ActivityC45651qj LIZIZ;
    public final I3X LIZJ;

    @Override // X.WTC
    public final void LIZ() {
        HZ2.LIZ(this.LIZJ, false, 3);
    }

    @Override // X.WTC
    public final void closeRecording() {
        CommerceToolsStickerServiceImpl.LJIIL().LJ(this.LIZ);
        this.LIZJ.Ti0(false);
    }

    @Override // X.WTC
    public final void LIZIZ(AqS164S0100000_14 aqS164S0100000_14) {
        C26227ARb c26227ARb = new C26227ARb(this.LIZIZ);
        c26227ARb.LIZ(R.string.hom);
        UC0.LIZJ(c26227ARb, new AqS172S0100000_6(aqS164S0100000_14, 20));
        c26227ARb.LJI().LIZLLL();
    }

    public C82350WTq(ActivityC45651qj activity, I3X recordControlApi, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        this.LIZ = shortVideoContext;
        this.LIZIZ = activity;
        this.LIZJ = recordControlApi;
    }

    @Override // X.WTC
    public final void LIZJ(WTP cancel, AqS164S0100000_14 aqS164S0100000_14, AqS164S0100000_14 aqS164S0100000_142) {
        o.LJIIIZ(cancel, "cancel");
        try {
            AnonymousClass025 anonymousClass025 = new AnonymousClass025(this.LIZIZ, R.style.a75);
            anonymousClass025.LIZIZ(R.string.grv);
            anonymousClass025.LIZJ(R.string.cg_, new IDCListenerS165S0100000_14(cancel, 0));
            anonymousClass025.LIZLLL(R.string.byr, new IDCListenerS165S0100000_14(aqS164S0100000_14, 1));
            IDCListenerS165S0100000_14 iDCListenerS165S0100000_14 = new IDCListenerS165S0100000_14(aqS164S0100000_142, 2);
            C008901t c008901t = anonymousClass025.LIZ;
            c008901t.LJIIJ = c008901t.LIZ.getText(R.string.byk);
            anonymousClass025.LIZ.LJIIJJI = iDCListenerS165S0100000_14;
            anonymousClass025.LJ();
        } catch (Exception e) {
            C170666ms.LIZIZ(e.toString());
        }
    }
}
