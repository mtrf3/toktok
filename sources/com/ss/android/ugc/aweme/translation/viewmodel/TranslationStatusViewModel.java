package com.ss.android.ugc.aweme.translation.viewmodel;

import X.AK4;
import X.AbstractC86724Y1w;
import X.C16880lQ;
import X.C221108m2;
import X.C2305192x;
import X.C25792AAi;
import X.C33Q;
import X.C34K;
import X.C36922EeM;
import X.C41032G8m;
import X.C52929Kpx;
import X.C53150KtW;
import X.C53256KvE;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C68322mC;
import X.C73318Sq2;
import X.C76800UCe;
import X.C86189Xs9;
import X.C86714Y1m;
import X.C86722Y1u;
import X.C86753Y2z;
import X.C86755Y3b;
import X.C86769Y3p;
import X.ILV;
import X.IUQ;
import X.InterfaceC65350Pko;
import X.InterfaceC86772Y3s;
import X.InterfaceC88472Yns;
import X.VIT;
import X.X1D;
import X.XKQ;
import X.XKX;
import X.XME;
import X.XMG;
import X.XMH;
import X.XMJ;
import X.Y01;
import X.Y0N;
import X.Y0Y;
import X.Y1H;
import X.Y1T;
import X.Y1X;
import X.Y1Y;
import X.Y24;
import X.Y25;
import X.Y2B;
import X.Y35;
import X.Y3X;
import X.Y3Z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.statemachine.StateMachine;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TranslationStatusViewModel extends StateMachine<Y1Y, Y24, Y3X> {
    public static final C86755Y3b LLFZ = new C86755Y3b();
    public static Y1Y LLI;
    public boolean LJLLLL;
    public boolean LJLZ;
    public String[] LJZ;
    public Y2B LJZI;
    public ILV LJZL;
    public String LLFII;
    public final C86722Y1u LJLLI = new C86722Y1u();
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 663));
    public final String LJLLJ = "TranslationViewModel";
    public final C73318Sq2 LJLLL = new C73318Sq2();
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(XMG.INSTANCE);
    public final C62822Ol8 LL = C221108m2.LIZIZ(Y1T.LJLIL);
    public final C86189Xs9 LLD = new C86189Xs9(this);
    public final XMH LLF = new XMH(this);
    public final XKQ LLFF = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new XME(this, null), 3);
    public final LifecycleEventObserver LLFFF = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel.2
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            o.LJIIIZ(lifecycleOwner, "<anonymous parameter 0>");
            o.LJIIIZ(event, "event");
            if (event == Lifecycle.Event.ON_DESTROY) {
                TranslationStatusViewModel.this.LLFF.LIZIZ(null);
            }
        }
    };

    public static Y24 lv0() {
        Y1Y y1y = LLI;
        if (y1y != null) {
            LLI = null;
            return new Y24(y1y, null, C41032G8m.LIZ(), false, false);
        }
        return new Y24(Y1X.LIZIZ, null, C41032G8m.LIZ(), false, false);
    }

    public final Y0Y mv0() {
        Y3Z y3z = new Y3Z(Y01.LIZIZ.LJJIIZI());
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            C86714Y1m nv0 = nv0();
            Aweme aweme = gv0.getAweme();
            o.LJIIIIZZ(aweme, "it.aweme");
            nv0.getClass();
            Iterator<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> it = nv0.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LJ(aweme, y3z);
            }
        }
        return new Y0Y(y3z.LIZ, y3z.LIZIZ);
    }

    public final C86714Y1m nv0() {
        return (C86714Y1m) this.LJLLILLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ C33Q defaultState() {
        return lv0();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        new AqS181S0100000_15(this, 161).invoke(this);
    }

    public final boolean ov0() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && aweme.isAd()) {
            return false;
        }
        return VIT.LIZ().LIZLLL();
    }

    public final boolean qv0() {
        VideoItemParams gv0;
        if (gv0() == null || (gv0 = gv0()) == null || gv0.getAweme() == null) {
            return false;
        }
        C86714Y1m nv0 = nv0();
        VideoItemParams gv02 = gv0();
        if (gv02 != null) {
            if (!nv0.LIZ(gv02.getAweme())) {
                return false;
            }
            return true;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void sv0() {
        InterfaceC88472Yns<? super String[], C76800UCe> interfaceC88472Yns;
        if (C53150KtW.LIZ() || (!C52929Kpx.LIZ())) {
            ITranslationLangKevaService LIZ = C25792AAi.LIZ();
            if (!C52929Kpx.LIZ()) {
                interfaceC88472Yns = new XMJ(this);
            } else {
                interfaceC88472Yns = this.LLF;
            }
            LIZ.LJI(interfaceC88472Yns);
        }
    }

    public final void uv0() {
        if (qv0()) {
            onEvent(C86769Y3p.LIZIZ);
        }
    }

    public final void pv0(String[] strArr) {
        String[] strArr2 = this.LJZ;
        if (strArr2 != null && !Arrays.equals(strArr2, strArr) && AK4.LIZ().LJJIIZI()) {
            rv0(Y2B.DO_NOT_TRANSLATE_CHANGED);
        }
        this.LJZ = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rv0(X.Y2B r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.gv0()
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.service.ICLAPerfETService r3 = X.C46290IEs.LIZ()
            X.Y01 r0 = X.Y01.LIZIZ
            java.lang.String r2 = r0.LJJIIZI()
            if (r6 != 0) goto L71
        L12:
            X.Y26 r0 = X.Y26.UNKNOWN
        L14:
            X.Y2H r4 = r3.LIZIZ(r2, r0)
            X.Y1m r3 = r5.nv0()
            java.lang.Object r0 = r5.gv0()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto La7
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            java.lang.String r0 = "requireNotNull(item).aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Object r0 = r5.gv0()
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r1 = r0.mEventType
            java.lang.String r0 = "requireNotNull(item).eventType"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.Svk r1 = r3.LIZIZ(r2, r4, r1)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.Y2i r0 = new X.Y2i
            r0.<init>(r4, r5)
            X.Srj r3 = r1.LJIJ(r0)
            Y.AfS64S0200000_15 r2 = new Y.AfS64S0200000_15
            r0 = 5
            r2.<init>(r4, r5, r0)
            Y.AfS64S0200000_15 r1 = new Y.AfS64S0200000_15
            r0 = 6
            r1.<init>(r4, r5, r0)
            X.3kP r1 = r3.LJJJLIIL(r2, r1)
            X.Sq2 r0 = r5.LJLLL
            r0.LIZ(r1)
        L70:
            return
        L71:
            int[] r1 = X.Y2D.LIZ
            int r0 = r6.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case -1: goto L12;
                case 0: goto L7c;
                case 1: goto L82;
                case 2: goto L85;
                case 3: goto L88;
                case 4: goto L8b;
                case 5: goto L8e;
                case 6: goto L91;
                case 7: goto L94;
                default: goto L7c;
            }
        L7c:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L82:
            X.Y26 r0 = X.Y26.CLICK_SEE_TRANSLATION
            goto L14
        L85:
            X.Y26 r0 = X.Y26.TOOLTIP
            goto L14
        L88:
            X.Y26 r0 = X.Y26.TRANSLATION_TOGGLE_MASTER
            goto L14
        L8b:
            X.Y26 r0 = X.Y26.TRANSLATION_TOGGLE_DESC
            goto L14
        L8e:
            X.Y26 r0 = X.Y26.TRANSLATION_TOGGLE_STICKER
            goto L14
        L91:
            X.Y26 r0 = X.Y26.DO_NOT_TRANSLATE_CHANGED
            goto L14
        L94:
            X.Y26 r0 = X.Y26.LAND_ON_ITEM
            goto L14
        L98:
            X.Y3i r0 = X.C86762Y3i.LIZIZ
            r5.onEvent(r0)
            goto L70
        L9e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        La7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel.rv0(X.Y2B):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C33Q iv0(C33Q state, VideoItemParams item) {
        Y1Y y1y;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        if (!C53256KvE.LIZ()) {
            super.iv0(state, item);
            return state;
        }
        if (o.LJ(item.getAweme().getAid(), this.LLFII)) {
            return state;
        }
        this.LLFII = item.getAweme().getAid();
        Y24 lv0 = lv0();
        if (qv0()) {
            y1y = mv0();
        } else {
            y1y = Y1X.LIZIZ;
        }
        return Y24.LIZ(lv0, y1y, null, false, false, false, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.IUQ, T] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.Y0Y, T] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.Y1X, T] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.Y0N] */
    @Override // com.ss.android.ugc.aweme.statemachine.StateMachine
    public final void kv0(Y1Y y1y, InterfaceC65350Pko<? extends Y1Y> newStateType, Y3X event) {
        boolean z;
        Y0N y0n;
        boolean z2;
        boolean z3;
        Y1Y y1y2 = y1y;
        o.LJIIIZ(newStateType, "newStateType");
        o.LJIIIZ(event, "event");
        String str = this.LJLLJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("from: ");
        LIZ.append(y1y2.LIZ.getId());
        LIZ.append(" to: ");
        LIZ.append(newStateType.LJFF());
        LIZ.append(", event = ");
        LIZ.append(event);
        LIZ.append(", thread = ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C36922EeM.LIZLLL(4, str, X1D.LIZIZ(LIZ));
        C68322mC c68322mC = new C68322mC();
        C34K c34k = new C34K();
        boolean z4 = false;
        if (o.LJ(newStateType, C65352Pkq.LIZ(Y1X.class))) {
            c68322mC.element = Y1X.LIZIZ;
            if (y1y2 instanceof Y0N) {
                tv0(true, false, false);
            }
        } else if (o.LJ(newStateType, C65352Pkq.LIZ(Y0Y.class))) {
            if (C2305192x.LIZIZ() && C2305192x.LIZ(this.LJLJI)) {
                if (C41032G8m.LIZ() || (o.LJ(y1y2, Y1X.LIZIZ) && ov0())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                tv0(true, z3, false);
            } else {
                tv0(true, false, false);
            }
            c68322mC.element = mv0();
            if ((y1y2 instanceof Y0N) && !((Y0N) y1y2).LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJLLLL && ((!((Y24) getState()).LJLJI || C41032G8m.LIZ()) && !z2)) {
                z4 = true;
            }
            c34k.element = z4;
        } else if (o.LJ(newStateType, C65352Pkq.LIZ(IUQ.class))) {
            boolean z5 = this.LJLZ;
            if (this.LJZI == Y2B.TOOLTIP) {
                z4 = true;
            }
            c68322mC.element = new IUQ(z5, z4);
        } else {
            if (!o.LJ(newStateType, C65352Pkq.LIZ(Y0N.class))) {
                return;
            }
            if (y1y2 instanceof IUQ) {
                z = ((IUQ) y1y2).LIZIZ;
            } else {
                z = false;
            }
            tv0(true, true, z);
            C86753Y2z c86753Y2z = new C86753Y2z(Y01.LIZIZ.LJJIIZI(), z);
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                C86714Y1m nv0 = nv0();
                Aweme aweme = gv0.getAweme();
                o.LJIIIIZZ(aweme, "it.aweme");
                nv0.getClass();
                Iterator<Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>>> it = nv0.LIZ.iterator();
                while (it.hasNext()) {
                    it.next().LJFF(aweme, c86753Y2z);
                }
            }
            c68322mC.element = new Y0N(c86753Y2z.LIZ, c86753Y2z.LIZIZ, c86753Y2z.LIZJ, c86753Y2z.LIZLLL, c86753Y2z.LJ);
            Boolean bool = null;
            if ((y1y2 instanceof Y0N) && (y0n = (Y0N) y1y2) != null) {
                bool = Boolean.valueOf(y0n.LIZ());
            }
            boolean LIZ2 = ((Y0N) c68322mC.element).LIZ();
            if (this.LJLLLL && !o.LJ(bool, Boolean.valueOf(LIZ2))) {
                z4 = true;
            }
            c34k.element = z4;
        }
        setState(new AqS146S0200000_15(c34k, c68322mC, 27));
        VideoItemParams gv02 = gv0();
        if (gv02 != null) {
            C86755Y3b c86755Y3b = LLFZ;
            Aweme aweme2 = gv02.getAweme();
            o.LJIIIIZZ(aweme2, "aweme");
            c86755Y3b.LIZLLL(aweme2, new Y1H((Y1Y) c68322mC.element), "");
        }
    }

    public final void tv0(boolean z, boolean z2, boolean z3) {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            Y35 y35 = new Y35(z, z3, z2);
            C86714Y1m nv0 = nv0();
            nv0.getClass();
            for (Y25<AbstractC86724Y1w<? extends InterfaceC86772Y3s>> y25 : nv0.LIZ) {
                if (y25.LIZIZ() == y35.LIZLLL) {
                    if (y25.LIZLLL(aweme, y35)) {
                        withState(new AqS146S0200000_15(this, y35, 26));
                        return;
                    }
                    return;
                }
            }
        }
    }
}
