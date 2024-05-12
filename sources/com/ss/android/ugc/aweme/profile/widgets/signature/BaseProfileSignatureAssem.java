package com.ss.android.ugc.aweme.profile.widgets.signature;

import X.AnonymousClass030;
import X.C149985uc;
import X.C214298b3;
import X.C2YV;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6DJ;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C8YN;
import X.C9NI;
import X.C9X4;
import X.C9X9;
import X.C9XG;
import X.C9XN;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.TBV;
import X.WHL;
import X.Y01;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeOriginalInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeTranslationInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalShowInBioEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationShowInBioEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS64S0201000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseProfileSignatureAssem extends UIContentAssem {
    public TuxTextView LJLIL;
    public LinearLayout LJLILLLLZI;
    public ObjectAnimator LJLJI;
    public InterfaceC82683Wch LJLJJI;
    public final C214298b3 LJLJJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public Map<Integer, View> LJLJLLL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public BaseProfileSignatureAssem() {
        C9XN c9xn = C9XN.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileSignatureTranslationViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9xn, new AqS154S0100000_4(LIZ, 754), C9X9.INSTANCE, null);
    }

    private final void E3() {
        ClickSeeOriginalInBioEvent clickSeeOriginalInBioEvent = new ClickSeeOriginalInBioEvent();
        clickSeeOriginalInBioEvent.LIZ().add(new C2YV(null, Y01.LIZIZ.LJJIIZI(), x3().getState().LJLILLLLZI));
        clickSeeOriginalInBioEvent.LJFF();
    }

    private final void F3() {
        ClickSeeTranslationInBioEvent clickSeeTranslationInBioEvent = new ClickSeeTranslationInBioEvent();
        clickSeeTranslationInBioEvent.LIZ().add(new C2YV(null, Y01.LIZIZ.LJJIIZI(), null));
        clickSeeTranslationInBioEvent.LJFF();
    }

    public final void K3() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.go);
        }
    }

    public final void L3() {
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.gx);
        }
    }

    public final ProfileSignatureTranslationViewModel x3() {
        return (ProfileSignatureTranslationViewModel) this.LJLJJL.getValue();
    }

    public final void C3() {
        if (x3().getState().LJLJJI == C9XG.ORIGINAL) {
            F3();
        } else {
            E3();
        }
    }

    public final void Ej() {
        if (C9NI.LIZ()) {
            LinearLayout linearLayout = this.LJLILLLLZI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            ObjectAnimator objectAnimator = this.LJLJI;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setAlpha(1.0f);
        }
    }

    public final void LJJI() {
        if (C9NI.LIZ()) {
            LinearLayout linearLayout = this.LJLILLLLZI;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ObjectAnimator objectAnimator = this.LJLJI;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setAlpha(0.0f);
        }
    }

    private final void H3(C9X4 c9x4) {
        SeeOriginalShowInBioEvent seeOriginalShowInBioEvent = new SeeOriginalShowInBioEvent();
        seeOriginalShowInBioEvent.LIZ().add(new C2YV(c9x4.getValue(), Y01.LIZIZ.LJJIIZI(), x3().getState().LJLILLLLZI));
        seeOriginalShowInBioEvent.LJFF();
    }

    private final void I3(C9X4 c9x4) {
        SeeTranslationShowInBioEvent seeTranslationShowInBioEvent = new SeeTranslationShowInBioEvent();
        seeTranslationShowInBioEvent.LIZ().add(new C2YV(c9x4.getValue(), Y01.LIZIZ.LJJIIZI(), null));
        seeTranslationShowInBioEvent.LJFF();
    }

    public final void A3(TuxIconView view) {
        o.LJIIIZ(view, "view");
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.LJLJI = duration;
        if (duration != null) {
            C149985uc.LIZ(duration);
        }
        ObjectAnimator objectAnimator = this.LJLJI;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.setRepeatCount(-1);
    }

    public final void M3(View view) {
        AnonymousClass030.LJ(view, R.string.in);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (C9NI.LIZ()) {
            C8YN.LJII(this, x3(), new TBV() { // from class: X.9X5
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C9X8) obj).LJLJJI;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    C9X8 c9x8 = (C9X8) obj;
                    C9XG c9xg = (C9XG) obj2;
                    c9x8.getClass();
                    o.LJIIIZ(c9xg, "<set-?>");
                    c9x8.LJLJJI = c9xg;
                }
            }, null, new AqS167S0200000_4(this, view, 20), 6);
        }
    }

    public final InterfaceC82683Wch v3(View view, Context context, C9X4 enterMethod, InterfaceC88472Yns<? super String, C76800UCe> displayUserSignature) {
        int i;
        int i2;
        Integer LJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(displayUserSignature, "displayUserSignature");
        this.LJLJJLL = displayUserSignature;
        C9XG c9xg = x3().getState().LJLJJI;
        C9XG c9xg2 = C9XG.ORIGINAL;
        if (c9xg == c9xg2) {
            i = R.string.qfs;
        } else {
            i = R.string.qfr;
        }
        InterfaceC82683Wch interfaceC82683Wch = null;
        if (view != null) {
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "it.context");
            C6DJ c6dj = new C6DJ(context2);
            c6dj.LIZ.LIZIZ = view;
            if (context != null && (LJI = C79045V0n.LJI(R.attr.gy, context)) != null) {
                i2 = LJI.intValue();
            } else {
                i2 = -16777216;
            }
            c6dj.LJIIIIZZ(i2);
            c6dj.LIZ.LJII = -1001L;
            c6dj.LJIIJJI(new AqS64S0201000_15(i, this, view, 6));
            c6dj.LJFF();
            c6dj.LIZ.LJIJJLI = true;
            c6dj.LJI(WHL.BOTTOM);
            c6dj.LJ(new AqS154S0100000_4(this, 753));
            interfaceC82683Wch = c6dj.LIZJ();
        }
        this.LJLJJI = interfaceC82683Wch;
        if (x3().getState().LJLJJI == c9xg2) {
            I3(enterMethod);
        } else {
            H3(enterMethod);
        }
        return this.LJLJJI;
    }
}
