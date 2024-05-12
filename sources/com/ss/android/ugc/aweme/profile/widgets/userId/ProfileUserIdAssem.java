package com.ss.android.ugc.aweme.profile.widgets.userId;

import X.AJ9;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C235699Mv;
import X.C26045AKb;
import X.C36922EeM;
import X.C45804HyK;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78605Ut7;
import X.C78857UxB;
import X.C78926UyI;
import X.C79045V0n;
import X.C8VC;
import X.C9AC;
import X.C9AE;
import X.C9ID;
import X.C9KV;
import X.C9NG;
import X.C9T4;
import X.G27;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC82683Wch;
import X.OHT;
import X.Q0C;
import X.QZZ;
import X.SJU;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewmodel.MainActivityProfileSwitchAccountViewModel;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;
import yq4.a;

/* loaded from: classes5.dex */
public final class ProfileUserIdAssem extends UIContentAssem implements G27 {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public TextView LJLJI;
    public InterfaceC82683Wch LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    public ProfileUserIdAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        C65776Prg LIZ = C65352Pkq.LIZ(MyProfileUserIdVM.class);
        this.LJLILLLLZI = new C214298b3(new AqS154S0100000_4(LIZ, 755), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C235699Mv.INSTANCE, LIZ);
    }

    public final boolean C3() {
        Fragment LIZLLL;
        Fragment LIZLLL2;
        Fragment LIZLLL3;
        boolean z;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return true;
        }
        boolean isFinishing = LIZ.isFinishing();
        Fragment LIZLLL4 = C212428Vi.LIZLLL(this);
        if ((LIZLLL4 != null && LIZLLL4.isRemoving()) || (((LIZLLL = C212428Vi.LIZLLL(this)) != null && LIZLLL.isDetached()) || (LIZLLL2 = C212428Vi.LIZLLL(this)) == null || LIZLLL2.getView() == null || (LIZLLL3 = C212428Vi.LIZLLL(this)) == null || LIZLLL3.getFragmentManager() == null)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = ((MainActivityProfileSwitchAccountViewModel) ViewModelProviders.of(LIZ).get(MainActivityProfileSwitchAccountViewModel.class)).LJLIL;
        if (isFinishing || z || z2) {
            return true;
        }
        return false;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJJL = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        this.LJLJJL = true;
        this.LJLJJLL = a.LJ().LJ(4);
    }

    public final void A3(User user) {
        if (this.LJLJI == null || user == null) {
            return;
        }
        AJ9.LJI(getContext(), new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null), this.LJLJI);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TextView textView;
        o.LJIIIZ(view, "view");
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        this.LJLJI = textView;
        if (textView != null) {
            textView.setText("@");
        }
        TextView textView2 = this.LJLJI;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS24S0100000_4(this, 158));
        }
        h0.LJIJI(view, new IDaS88S0000000_1(8));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Id
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 754));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9K1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 755));
        if (C9T4.LIZ()) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9IY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PN) obj).LJIIIIZZ;
                }
            }, new AqS170S0100000_4(this, 756));
        }
        C9AE.LIZ(view, C9AC.ALPHA, 0.0f);
    }

    public final void v3(String str) {
        Context context = getContext();
        if (context != null) {
            try {
                OHT.LIZ("user_id", str, context, C78857UxB.LJJIIJ(1476399109, "bpea-108"));
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    c26045AKb.LJIIIIZZ(R.string.dfw);
                    c26045AKb.LJIIJ();
                }
            } catch (Q0C e) {
                C36922EeM.LIZ(e);
            } catch (SecurityException e2) {
                C36922EeM.LIZ(e2);
            }
        }
    }

    public final void x3(User user) {
        String uniqueId;
        Integer LJI;
        CharSequence charSequence;
        Integer LJI2;
        if (getContext() == null || user == null) {
            return;
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        String LIZIZ = QZZ.LIZIZ('@', uniqueId);
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(LIZIZ);
        }
        A3(user);
        if (!this.LJLJJLL && (!C9NG.LIZIZ() || (!user.isSecret() && user.nicknameUpdateReminder()))) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TextView textView2 = this.LJLJI;
            if (textView2 != null) {
                charSequence = textView2.getText();
            } else {
                charSequence = null;
            }
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((CharSequence) " T");
            spannableStringBuilder.setSpan(new SJU(R.drawable.bxw, getContext()), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            TextView textView3 = this.LJLJI;
            if (textView3 != null) {
                textView3.setText(spannableStringBuilder);
            }
            Context context = getContext();
            if (context != null && (LJI2 = C79045V0n.LJI(R.attr.go, C78605Ut7.LJIIIIZZ(context))) != null) {
                int intValue = LJI2.intValue();
                TextView textView4 = this.LJLJI;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                    return;
                }
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 == null || (LJI = C79045V0n.LJI(R.attr.gu, C78605Ut7.LJIIIIZZ(context2))) == null) {
            return;
        }
        int intValue2 = LJI.intValue();
        TextView textView5 = this.LJLJI;
        if (textView5 == null) {
            return;
        }
        textView5.setTextColor(intValue2);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }
}
