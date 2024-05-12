package com.ss.android.ugc.feed.platform.panel.forcevideo;

import X.AbstractC48820JEa;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C245009jU;
import X.C2LA;
import X.C46710IUw;
import X.C48277Ix7;
import X.C48278Ix8;
import X.C48281IxB;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C8MM;
import X.C8YN;
import X.C90383gg;
import X.C9BE;
import X.EnumC221088m0;
import X.InterfaceC64592gB;
import X.InterfaceC65350Pko;
import X.JA6;
import X.JA9;
import X.JAC;
import X.JAE;
import X.JAK;
import X.JAO;
import X.KU4;
import X.ORZ;
import X.T16;
import X.TBT;
import X.X1D;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class StrongInteractiveFeedBackComponent extends BasePanelComponent {
    public final C5H3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C62822Ol8 LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public StrongInteractiveFeedBackComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 397), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 7));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 398));
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 395);
        JAK.LIZ.getClass();
        if (((Number) JAK.LIZIZ.getValue()).intValue() == 2) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, aqS158S0100000_8, null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(aqS158S0100000_8);
        }
        this.LJLJI = c62822Ol82;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(InstantFeedVm.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 396), JA6.INSTANCE, null);
        this.LJLJJL = C221108m2.LIZIZ(JAC.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(C245009jU.LJLILLLLZI, (AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.JAB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C48279Ix9) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 42), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_render_first_frame", C48281IxB.LJLIL);
        c8mm.LIZ("event_digg_click", new AqS174S0100000_8(this, 147));
        c8mm.LIZ("event_favorite_click", new AqS174S0100000_8(this, 148));
    }

    public final void v3(Aweme aweme, String str) {
        String aid;
        int intValue;
        if (!JA9.LIZIZ()) {
            return;
        }
        String settingsValue = (String) JAE.LIZ.getValue();
        o.LJIIIIZZ(settingsValue, "settingsValue");
        int i = 0;
        if (!s.LJJJLZIJ(settingsValue, str, false) || aweme == null || aweme.isAd() || aweme.isLive() || aweme.getIsSubAweme() || aweme.isWithSurvey() || (aid = aweme.getAid()) == null) {
            return;
        }
        C46710IUw c46710IUw = C48278Ix8.LIZIZ;
        Integer num = (Integer) c46710IUw.get((Object) aid);
        if (num == null || num.intValue() < C48278Ix8.LIZ) {
            Integer num2 = (Integer) c46710IUw.get((Object) aid);
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
            }
            c46710IUw.put(aid, Integer.valueOf(C48278Ix8.LIZ));
            Iterator<Map.Entry<String, List<String>>> it = C48278Ix8.LIZJ.entrySet().iterator();
            while (it.hasNext()) {
                List<String> value = it.next().getValue();
                if (value.contains(aid)) {
                    for (String aid2 : value) {
                        o.LJIIIZ(aid2, "aid");
                        C48278Ix8.LIZIZ.put(aid2, Integer.valueOf(C48278Ix8.LIZ));
                    }
                }
            }
            int i2 = intValue + 1;
            ((AbstractC48820JEa) this.LJLJJL.getValue()).LJIIJ(new C2LA(i2, aid, str));
            if (C90383gg.LIZ()) {
                return;
            }
            int LIZ = JA9.LIZ();
            if (LIZ != 0) {
                i = 2;
                if (LIZ == 2) {
                    i = 1;
                }
            }
            InstantFeedVm instantFeedVm = (InstantFeedVm) this.LJLJJI.getValue();
            C78999UzT.LJFF(new JAO(i, aid, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C48277Ix7(instantFeedVm, aid, i2), new InterfaceC64592gB() { // from class: X.2OA
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C36922EeM.LJFF((Throwable) obj);
                }
            }), instantFeedVm.getDisposables());
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(aid);
        LIZ2.append(" reach limit");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("StrongInteractiveFeedBackComponent", X1D.LIZIZ(LIZ2));
    }

    public final void x3(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == 1) {
            TryInsertVideoAbility tryInsertVideoAbility = (TryInsertVideoAbility) this.LJLJI.getValue();
            if (tryInsertVideoAbility != null) {
                tryInsertVideoAbility.BB(i, (Aweme) ORZ.LJLLJ(list));
                return;
            }
            return;
        }
        TryInsertVideoAbility tryInsertVideoAbility2 = (TryInsertVideoAbility) this.LJLJI.getValue();
        if (tryInsertVideoAbility2 == null) {
            return;
        }
        tryInsertVideoAbility2.zP(i, arrayList.size(), list);
    }
}
