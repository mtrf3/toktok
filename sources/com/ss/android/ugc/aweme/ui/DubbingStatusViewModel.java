package com.ss.android.ugc.aweme.ui;

import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C33Q;
import X.C3C5;
import X.C53277KvZ;
import X.C65352Pkq;
import X.C65532hh;
import X.C68322mC;
import X.C78605Ut7;
import X.C86734Y2g;
import X.C86735Y2h;
import X.C86758Y3e;
import X.C86759Y3f;
import X.C86760Y3g;
import X.C86765Y3l;
import X.C86766Y3m;
import X.C86767Y3n;
import X.FFL;
import X.FMX;
import X.IWF;
import X.InterfaceC65350Pko;
import X.X1D;
import X.Y01;
import X.Y0Y;
import X.Y1Y;
import X.Y2S;
import X.Y2X;
import X.Y2Z;
import X.Y3W;
import X.Y3Y;
import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.statemachine.StateMachine;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DubbingStatusViewModel extends StateMachine<Y3Y, Y2S, Y3W> {
    public final long LJLLI;
    public final Handler LJLLILLLL;
    public final ARunnableS51S0100000_15 LJLLJ;
    public boolean LJLLL;
    public Audio.InfoIdType LJLLLL;
    public Y2X LJLLLLLL;
    public boolean LJLZ;
    public Y1Y LJZ;
    public boolean LJZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new Y2S(C86758Y3e.LIZIZ, true, false, false);
    }

    public DubbingStatusViewModel() {
        Object LIZ;
        try {
            FFL.LJIIIZ().getClass();
            LIZ = Long.valueOf(FFL.LJIILIIL(31744, 8000L, "auto_dubbing_timeout"));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Long l = (Long) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        this.LJLLI = l != null ? l.longValue() : 8000L;
        this.LJLLILLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLLJ = new ARunnableS51S0100000_15(this, 53);
        this.LJLLLL = Audio.InfoIdType.ORIGINAL;
        this.LJLLLLLL = Y2X.NO_STATE_CHANGE;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        new AqS181S0100000_15(this, 176).invoke(this);
    }

    public final void lv0(boolean z) {
        Aweme aweme;
        String str;
        String str2;
        if (gv0() == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null) {
            String str3 = gv02.mEventType;
            o.LJIIIIZZ(str3, "requireNotNull(item).eventType");
            C65532hh.LIZ(c188727au, aweme, str3);
            int i = Y2Z.LIZ[this.LJLLLLLL.ordinal()];
            if (i == 1) {
                str = "on";
            } else if (i != 2) {
                str = "";
            } else {
                str = "off";
            }
            c188727au.LIZLLL(this.LJLLL ? 1 : 0, "is_manually_triggered");
            c188727au.LJI("action_type", str);
            if (o.LJ(str, "on")) {
                if (z) {
                    str2 = "success";
                } else {
                    str2 = "failure";
                }
                c188727au.LJI("dubbing_on_status", str2);
            }
            FMX.LJIIL("dubbing_status_change", c188727au.LIZ);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void nv0(boolean z) {
        boolean z2;
        this.LJLLL = z;
        if (z) {
            if (this.LJLLLL != Audio.InfoIdType.TRANSLATED) {
                z2 = true;
            } else {
                z2 = false;
            }
            C53277KvZ.LIZ.storeBoolean("dubbing_default_state_on", z2);
        }
        onEvent(C86767Y3n.LIZIZ);
    }

    public final void mv0(Audio.InfoIdType infoIdType, boolean z) {
        Aweme aweme;
        Y2X y2x;
        String str;
        VideoItemParams gv0;
        Aweme aweme2;
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme = gv02.getAweme()) != null && C78605Ut7.LJIJ(aweme, Y01.LIZIZ.LJJIIZI())) {
            this.LJLZ = z;
            if (this.LJLLLL == infoIdType && this.LJLLLLLL == Y2X.NO_STATE_CHANGE) {
                return;
            }
            if (infoIdType == Audio.InfoIdType.TRANSLATED) {
                y2x = Y2X.AWAITING_DUBBING_ON;
            } else {
                y2x = Y2X.AWAITING_DUBBING_OFF;
            }
            if (this.LJLLLLLL == y2x) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchAudioLanguage Start; awemeID: ");
            VideoItemParams gv03 = gv0();
            if (gv03 == null || (aweme2 = gv03.getAweme()) == null || (str = aweme2.getAid()) == null) {
                str = "";
            }
            LIZ.append(str);
            LIZ.append("; translate: ");
            LIZ.append(infoIdType);
            X1D.LIZIZ(LIZ);
            IWF.LJJLIIIIJ().LJJIJIL().LJJLIIIJILLIZJL(infoIdType.getInfoId());
            setState(C86735Y2h.LJLIL);
            if (this.LJZI) {
                this.LJLLILLLL.removeCallbacksAndMessages(null);
                this.LJLLILLLL.postDelayed(this.LJLLJ, this.LJLLI);
            }
            this.LJLLLLLL = y2x;
            if (this.LJLLLL == infoIdType && (gv0 = gv0()) != null) {
                String aid = gv0.getAweme().getAid();
                o.LJIIIIZZ(aid, "it.aweme.aid");
                d20(aid, infoIdType, true);
            }
        }
    }

    public final void d20(String awemeId, Audio.InfoIdType infoType, boolean z) {
        String str;
        Aweme aweme;
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(infoType, "infoType");
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str, awemeId)) {
            return;
        }
        if (z) {
            this.LJLLILLLL.removeCallbacksAndMessages(null);
            this.LJLLLL = infoType;
            if (infoType == Audio.InfoIdType.ORIGINAL) {
                onEvent(C86765Y3l.LIZIZ);
                if (this.LJZ instanceof Y0Y) {
                    setState(C86734Y2g.LJLIL);
                }
            } else {
                onEvent(C86766Y3m.LIZIZ);
            }
            if (this.LJLZ) {
                lv0(true);
            }
        }
        this.LJLLLLLL = Y2X.NO_STATE_CHANGE;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.Y3f] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.Y3g] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.Y3e] */
    @Override // com.ss.android.ugc.aweme.statemachine.StateMachine
    public final void kv0(Y3Y y3y, InterfaceC65350Pko<? extends Y3Y> newStateType, Y3W event) {
        o.LJIIIZ(newStateType, "newStateType");
        o.LJIIIZ(event, "event");
        C68322mC c68322mC = new C68322mC();
        if (o.LJ(newStateType, C65352Pkq.LIZ(C86758Y3e.class))) {
            c68322mC.element = C86758Y3e.LIZIZ;
        } else if (o.LJ(newStateType, C65352Pkq.LIZ(C86760Y3g.class))) {
            c68322mC.element = C86760Y3g.LIZIZ;
        } else if (o.LJ(newStateType, C65352Pkq.LIZ(C86759Y3f.class))) {
            c68322mC.element = C86759Y3f.LIZIZ;
        }
        if (c68322mC.element != 0) {
            setState(new AqS181S0100000_15(c68322mC, (C68322mC<PoiSearchApi.PoiSearchResultWrapper>) 179));
        }
    }
}
