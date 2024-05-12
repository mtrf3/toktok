package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NKL implements InterfaceC59736NcS {
    public final FrameLayout LIZ;
    public Aweme LIZIZ;
    public LiveAdCardModel LIZJ;
    public CardStruct LIZLLL;
    public NKN LJ;
    public boolean LJFF;
    public int LJI = -1;
    public final C62822Ol8 LJII;
    public final NKQ LJIIIIZZ;

    public final void LJI() {
        NKR nkr;
        this.LIZLLL = null;
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LJ = null;
        this.LJI = -1;
        this.LJFF = false;
        this.LJIIIIZZ.LIZJ();
        NKN nkn = this.LJ;
        if (nkn != null && (nkr = nkn.LJIIJ) != null) {
            nkr.LIZLLL = false;
            nkr.LJ = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    @Override // X.InterfaceC59736NcS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            X.NKN r0 = r6.LJ
            r2 = 0
            if (r0 == 0) goto Lc
            r0.LJ()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L10
        Lc:
            r0 = 1
            r6.LJ(r0)
        L10:
            X.NKN r5 = r6.LJ
            java.lang.String r4 = "container"
            r3 = 0
            if (r5 == 0) goto L38
            X.NKR r0 = r5.LJIIJ
            if (r0 == 0) goto L28
            android.widget.FrameLayout r1 = r6.LIZ
            kotlin.jvm.internal.o.LJIIIZ(r1, r4)
            r0.LIZIZ()
            X.NtS r0 = r0.LIZ
            r1.addView(r0)
        L28:
            X.NKR r0 = r5.LJIIJ
            if (r0 == 0) goto L2f
            r0.LIZJ(r2)
        L2f:
            android.widget.FrameLayout r0 = r6.LIZ
            r0.setVisibility(r3)
            r6.LJFF()
            return
        L38:
            boolean r0 = r6.LJFF
            if (r0 == 0) goto L5c
            X.NKQ r0 = r6.LJIIIIZZ
            android.widget.FrameLayout r1 = r6.LIZ
            r0.getClass()
            kotlin.jvm.internal.o.LJIIIZ(r1, r4)
            r0.LIZIZ()
            X.NtS r0 = r0.LIZ
            r1.addView(r0)
            X.NKQ r0 = r6.LJIIIIZZ
            r0.LIZLLL(r2)
            android.widget.FrameLayout r0 = r6.LIZ
            r0.setVisibility(r3)
            r6.LJFF()
        L5b:
            return
        L5c:
            com.ss.android.ugc.aweme.feed.model.LiveAdCardModel r0 = r6.LIZJ
            java.lang.String r4 = "load_timeout"
            if (r0 != 0) goto L95
            java.lang.String r3 = "no_live_product"
        L64:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LIZIZ
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
        L6c:
            java.lang.String r1 = "draw_ad"
            java.lang.String r0 = "othershow_fail"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r2)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "card"
            r2.LIZJ(r0, r1)
            java.lang.String r0 = "fail_reason"
            r2.LIZIZ(r3, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r4)
            if (r0 == 0) goto L91
            int r0 = r6.LJI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "failed_reason_status"
            r2.LIZIZ(r1, r0)
        L91:
            r2.LJI()
            goto L5b
        L95:
            X.NKQ r0 = r6.LJIIIIZZ
            boolean r0 = r0.LJ
            if (r0 != 0) goto L9e
            java.lang.String r3 = "data_load_fail"
            goto L64
        L9e:
            r3 = r4
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKL.LIZ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // X.InterfaceC59736NcS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r2 = this;
            X.NKN r0 = r2.LJ
            if (r0 == 0) goto Lf
            X.NKR r0 = r0.LJIIJ
            if (r0 == 0) goto Lf
            r0.LIZIZ()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L14
        Lf:
            X.NKQ r0 = r2.LJIIIIZZ
            r0.LIZIZ()
        L14:
            android.widget.FrameLayout r1 = r2.LIZ
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKL.LIZJ():void");
    }

    public final void LJFF() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("card", "refer");
        LIZLLL.LIZIZ(C59406NTe.LJI(this.LIZIZ), "room_id");
        LIZLLL.LIZIZ(C59406NTe.LIZIZ(this.LIZIZ), "anchor_id");
        LIZLLL.LJI();
    }

    @Override // X.InterfaceC59736NcS
    public final void release() {
        NKQ nkq = this.LJIIIIZZ;
        nkq.LJ = false;
        nkq.LIZIZ = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(nkq.LIZ);
    }

    @Override // X.InterfaceC59736NcS
    public final void LIZLLL() {
        C42625Go9.LIZJ(this);
        LJI();
    }

    public NKL(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(NKK.LJLIL);
        this.LJII = LIZIZ;
        Context context = frameLayout.getContext();
        o.LJIIIIZZ(context, "container.context");
        this.LJIIIIZZ = new NKQ(context, (NLW) LIZIZ.getValue());
    }

    @Override // X.InterfaceC59736NcS
    public final void LIZIZ(Aweme aweme) {
        LiveAdCardModel liveAdCardModel;
        CardStruct cardStruct;
        ComponentData componentData;
        AwemeRawAd awemeRawAd;
        LJI();
        C42625Go9.LIZIZ(this);
        this.LIZIZ = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            liveAdCardModel = awemeRawAd.getLiveAdCardModel();
        } else {
            liveAdCardModel = null;
        }
        this.LIZJ = liveAdCardModel;
        if (liveAdCardModel != null && (componentData = liveAdCardModel.getComponentData()) != null) {
            cardStruct = componentData.getCardInfo();
        } else {
            cardStruct = null;
        }
        this.LIZLLL = cardStruct;
        LJ(false);
        if (this.LJ == null) {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new NKI(this, null), 3);
        }
    }

    public final void LJ(boolean z) {
        String aid;
        Aweme aweme = this.LIZIZ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            FeedAdServiceImpl.LJJIJLIJ().LJIILJJIL();
            NKN nkn = (NKN) NKM.LIZ.LIZ(aid);
            if (nkn != null) {
                if (nkn.LIZ == 3) {
                    this.LJ = nkn;
                }
                if (z) {
                    nkn.LJ();
                }
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI != this.LJIIIIZZ.LIZ.hashCode()) {
            return;
        }
        int i = event.LJLIL;
        this.LJI = i;
        if (i == 1) {
            this.LJFF = true;
        }
    }
}
