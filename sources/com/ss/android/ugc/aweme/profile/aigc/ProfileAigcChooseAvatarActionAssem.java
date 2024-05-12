package com.ss.android.ugc.aweme.profile.aigc;

import X.C110614Vt;
import X.C116414hZ;
import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72132SSq;
import X.C78926UyI;
import X.C9BE;
import X.SIN;
import X.SRW;
import X.SSP;
import X.SSR;
import X.SSS;
import X.SST;
import X.SSV;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcChooseAvatarActionAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public View LJLJI;
    public C116414hZ LJLJJI;
    public TuxTextView LJLJJL;
    public View LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    public ProfileAigcChooseAvatarActionAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 823), C72132SSq.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, SRW.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
        this.LJLJLLL = C221108m2.LIZIZ(SSS.LJLIL);
        this.LJLL = C221108m2.LIZIZ(SST.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 822));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A3() {
        View view = this.LJLJLJ;
        if (view != null) {
            int i = SSV.LIZ[((SSR) this.LJLLI.getValue()).ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b8z);
                if (((SIN) v3().getState()).LJLJI.LIZ == null) {
                    z = false;
                }
                x3(view, tuxTextView, z);
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.b8y);
            if (((SIN) v3().getState()).LJLJI.LIZ == null) {
                z = false;
            }
            x3(view, tuxTextView2, z);
        }
    }

    public final ProfileAigcAvatarViewModel v3() {
        return (ProfileAigcAvatarViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = getContainerView().findViewById(R.id.nx);
        o.LJIIIIZZ(findViewById, "containerView.action_button");
        this.LJLJI = findViewById;
        C116414hZ c116414hZ = (C116414hZ) getContainerView().findViewById(R.id.o1);
        o.LJIIIIZZ(c116414hZ, "containerView.action_button_spinner");
        this.LJLJJI = c116414hZ;
        TuxTextView tuxTextView = (TuxTextView) getContainerView().findViewById(R.id.o2);
        o.LJIIIIZZ(tuxTextView, "containerView.action_button_text");
        this.LJLJJL = tuxTextView;
        if (this.LJLLI.getValue() == SSR.MULTIPLE_HORIZONTAL) {
            View view2 = this.LJLJI;
            if (view2 != null) {
                view2.setVisibility(4);
                this.LJLJJLL = ((ViewStub) getContainerView().findViewById(R.id.e6p)).inflate();
                this.LJLJL = (TuxTextView) getContainerView().findViewById(R.id.byy);
                this.LJLJLJ = getContainerView().findViewById(R.id.b8x);
                A3();
            } else {
                o.LJIJI("singleActionButton");
                throw null;
            }
        } else if (this.LJLLI.getValue() == SSR.MULTIPLE_VERTICAL) {
            View view3 = this.LJLJI;
            if (view3 != null) {
                view3.setVisibility(4);
                this.LJLJJLL = ((ViewStub) getContainerView().findViewById(R.id.n3e)).inflate();
                this.LJLJL = (TuxTextView) getContainerView().findViewById(R.id.byz);
                this.LJLJLJ = getContainerView().findViewById(R.id.b90);
                A3();
            } else {
                o.LJIJI("singleActionButton");
                throw null;
            }
        }
        TuxTextView tuxTextView2 = this.LJLJL;
        if (tuxTextView2 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context = tuxTextView2.getContext();
            o.LJIIIIZZ(context, "it.context");
            tuxTextView2.setBackground(c110614Vt.LIZ(context));
            tuxTextView2.setTextColorRes(R.attr.go);
        }
        selectSubscribe(r7, new TBT() { // from class: X.SSK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.SSL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJI;
            }
        }, new TBT() { // from class: X.SSM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.SSN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJLJ;
            }
        }, new TBT() { // from class: X.SSO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJL;
            }
        }, C213688a4.LIZIZ(v3().usedInReusedScene), null, new SSP(this, view));
        View view4 = this.LJLJI;
        if (view4 != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 70), view4);
            View view5 = this.LJLJLJ;
            if (view5 != null) {
                C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 71), view5);
            }
            TuxTextView tuxTextView3 = this.LJLJL;
            if (tuxTextView3 != null) {
                C16880lQ.LJJJJI(tuxTextView3, new ACListenerS32S0100000_12(this, 69));
                return;
            }
            return;
        }
        o.LJIJI("singleActionButton");
        throw null;
    }

    public final void x3(View view, TuxTextView tuxTextView, boolean z) {
        view.setEnabled(z);
        if (z) {
            C110614Vt c110614Vt = (C110614Vt) this.LJLL.getValue();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "button.context");
            view.setBackground(c110614Vt.LIZ(context));
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.dj);
                return;
            }
            return;
        }
        C110614Vt c110614Vt2 = (C110614Vt) this.LJLJLLL.getValue();
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "button.context");
        view.setBackground(c110614Vt2.LIZ(context2));
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setTextColorRes(R.attr.gp);
    }
}
