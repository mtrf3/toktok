package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83544Wqa extends ESP implements TGM, InterfaceC81397Vx3 {
    public boolean LJLILLLLZI;
    public Effect LJLJI;
    public final C83549Wqf LJLJJI;
    public final C29901Fi<C76800UCe> LJLJJL;
    public final C29S LJLJJLL;
    public final TEZ LJLJL;
    public final InterfaceC83561Wqr LJLJLJ;
    public final InterfaceC65784Pro<ViewGroup> LJLJLLL;
    public final InterfaceC83566Wqw LJLL;
    public final C5NP LJLLI;
    public final InterfaceC65784Pro<Integer> LJLLILLLL;
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJLLJ;
    public final InterfaceC88472Yns<Effect, Boolean> LJLLL;
    public final InterfaceC88471Ynr<Effect, String, C83562Wqs> LJLLLL;
    public final InterfaceC83485Wpd LJLLLLLL;
    public final boolean LJLZ;
    public final boolean LJZ;
    public final InterfaceC88472Yns<Effect, Boolean> LJZI;

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        this.LJLJI = null;
        C83549Wqf c83549Wqf = this.LJLJJI;
        for (int i = 0; i < c83549Wqf.LIZ.size(); i++) {
            int keyAt = c83549Wqf.LIZ.keyAt(i);
            C83546Wqc c83546Wqc = c83549Wqf.LIZ.get(keyAt);
            C83547Wqd c83547Wqd = c83546Wqc.LIZIZ;
            if (c83547Wqd != null) {
                c83547Wqd.LIZ();
            }
            c83546Wqc.LJ("");
            c83549Wqf.LIZ.get(keyAt).LJIIIZ = false;
        }
        ViewGroup invoke = this.LJLJLLL.invoke();
        if (invoke != null) {
            ArrayList arrayList = new ArrayList();
            int childCount = invoke.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = invoke.getChildAt(i2);
                if (childAt instanceof C83551Wqh) {
                    arrayList.add(childAt);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16880lQ.LJLLL((View) it.next(), invoke);
            }
            arrayList.clear();
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLILLLLZI = true;
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        Effect effect;
        o.LJIIIZ(state, "state");
        this.LJLILLLLZI = false;
        if (state == IDK.AFTER_ANIMATE && (effect = this.LJLJI) != null) {
            C83549Wqf c83549Wqf = this.LJLJJI;
            c83549Wqf.getClass();
            if (!effect.getTags().contains("AR")) {
                effect.getTags().contains("text2d");
            }
            C83545Wqb c83545Wqb = c83549Wqf.LIZIZ;
            C83562Wqs c83562Wqs = c83545Wqb.LIZLLL;
            if (c83562Wqs == null) {
                return;
            }
            c83545Wqb.LIZJ = c83562Wqs;
            c83545Wqb.LIZLLL = null;
            c83545Wqb.LIZ(c83562Wqs);
        }
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        Boolean invoke;
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        InterfaceC88472Yns<Effect, Boolean> interfaceC88472Yns = this.LJLLL;
        if (interfaceC88472Yns != null && (invoke = interfaceC88472Yns.invoke(effect)) != null) {
            return invoke.booleanValue();
        }
        return ID0.LJ(effect);
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        C83551Wqh c83554Wqk;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        this.LJLJI = effect;
        InterfaceC83561Wqr interfaceC83561Wqr = this.LJLJLJ;
        String LIZ = C39391Fd5.LIZ(this.LJLJJLL);
        o.LJIIIIZZ(LIZ, "ARUtils.getLanguage(activity)");
        interfaceC83561Wqr.v4(LIZ);
        ViewGroup invoke = this.LJLJLLL.invoke();
        if (invoke != null) {
            C83549Wqf c83549Wqf = this.LJLJJI;
            InterfaceC83566Wqw interfaceC83566Wqw = this.LJLL;
            C29S c29s = this.LJLJJLL;
            InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLLILLLL;
            boolean z = this.LJZ;
            for (int i = 0; i < c83549Wqf.LIZ.size(); i++) {
                int keyAt = c83549Wqf.LIZ.keyAt(i);
                if (z) {
                    c83554Wqk = new C83553Wqj(c29s, effect);
                } else {
                    if (keyAt != 0) {
                        if (keyAt != 1) {
                            if (keyAt != 2) {
                                c83554Wqk = new C83551Wqh(c29s, null);
                            }
                        } else {
                            c83554Wqk = new C83552Wqi(c29s);
                        }
                    }
                    c83554Wqk = new C83554Wqk(c29s);
                }
                c83554Wqk.setTopMarginSupplier(interfaceC65784Pro);
                invoke.addView(c83554Wqk);
                C83546Wqc c83546Wqc = c83549Wqf.LIZ.get(keyAt);
                c83546Wqc.LIZJ(c83554Wqk);
                c83546Wqc.LJ = interfaceC83566Wqw;
                C83547Wqd c83547Wqd = c83546Wqc.LIZIZ;
                if (c83547Wqd != null) {
                    c83547Wqd.LIZIZ(new C83548Wqe(c83546Wqc));
                }
                c83546Wqc.LJIIIZ = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
    
        if (r0 != null) goto L25;
     */
    @Override // X.InterfaceC81397Vx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(int r7, int r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83544Wqa.onMessageReceived(int, int, int, java.lang.String):void");
    }

    public C83544Wqa(C29S activity, TEZ stickerDataManager, C83589WrJ c83589WrJ, AqS157S0100000_7 aqS157S0100000_7, InterfaceC83566Wqw onEffectShow, AqS157S0100000_7 aqS157S0100000_72, AqS196S0100000_14 aqS196S0100000_14, C83543WqZ c83543WqZ, IBW ibw) {
        C5SL c5sl = C5SL.LIZ;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(onEffectShow, "onEffectShow");
        this.LJLJJLL = activity;
        this.LJLJL = stickerDataManager;
        this.LJLJLJ = c83589WrJ;
        this.LJLJLLL = aqS157S0100000_7;
        this.LJLL = onEffectShow;
        this.LJLLI = c5sl;
        this.LJLLILLLL = aqS157S0100000_72;
        this.LJLLJ = aqS196S0100000_14;
        this.LJLLL = c83543WqZ;
        this.LJLLLL = ibw;
        this.LJLLLLLL = null;
        this.LJLZ = false;
        this.LJZ = false;
        this.LJZI = null;
        this.LJLJJI = new C83549Wqf(activity, stickerDataManager, c83589WrJ, aqS196S0100000_14, c83543WqZ, C78598Ut0.LJI((FrameLayout) aqS157S0100000_7.l0));
        this.LJLJJL = new C29901Fi<>();
    }
}
