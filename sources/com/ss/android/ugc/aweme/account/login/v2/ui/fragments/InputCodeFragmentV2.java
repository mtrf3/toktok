package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.C113684dA;
import X.C16880lQ;
import X.C252949wI;
import X.C26227ARb;
import X.C35936E8m;
import X.C48479J0x;
import X.C67738QiE;
import X.C67939QlT;
import X.C69093R9t;
import X.C69134RBi;
import X.C69135RBj;
import X.C74086T5u;
import X.C78555UsJ;
import X.C80498ViY;
import X.C85201XcD;
import X.C85621Xiz;
import X.C85710XkQ;
import X.C85714XkU;
import X.C85732Xkm;
import X.C85735Xkp;
import X.C9WD;
import X.EnumC85644XjM;
import X.FMX;
import X.InterfaceC80500Via;
import X.InterfaceC82683Wch;
import X.UC0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class InputCodeFragmentV2 extends BaseAccountBindingsFlowFragment implements InterfaceC80500Via, View.OnClickListener {
    public C85621Xiz LLD;
    public CountDownTimer LLF;
    public C67939QlT LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public InterfaceC82683Wch LLII;
    public boolean LLIIII;
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();
    public boolean LLI = true;
    public boolean LLIFFJFJJ = true;
    public EnumC85644XjM LLIIIILZ = EnumC85644XjM.UNDEFINED;
    public final C85732Xkm LLIIIJ = new C85732Xkm(this);

    public abstract C85621Xiz Xl();

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void fm(String str);

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int getLayout() {
        return R.layout.mj;
    }

    public abstract void hm();

    public void LLFZ() {
        String str;
        C85621Xiz c85621Xiz = this.LLD;
        if (c85621Xiz != null) {
            if (c85621Xiz.LIZIZ) {
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZLLL("login_panel_type", wl());
                c35936E8m.LIZLLL("enter_from", LJJLIIIJJI());
                FMX.LJIIL("start_sms_typing", c35936E8m.LIZ);
                return;
            }
            if (c85621Xiz.LIZJ) {
                return;
            }
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZLLL("enter_from", LJJLIIIJJI());
            c35936E8m2.LIZLLL("enter_method", getEnterMethod());
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("page")) == null) {
                str = "";
            }
            c35936E8m2.LIZLLL("page", str);
            FMX.LJIIL("start_email_code_typing", c35936E8m2.LIZ);
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    public final EnumC85644XjM Yl() {
        C85621Xiz c85621Xiz = this.LLD;
        if (c85621Xiz != null) {
            if (c85621Xiz.LIZIZ) {
                return EnumC85644XjM.PHONE;
            }
            if (c85621Xiz.LIZJ) {
                return EnumC85644XjM.TOTP;
            }
            return EnumC85644XjM.EMAIL;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C67738QiE c67738QiE;
        C67939QlT c67939QlT = this.LLFF;
        if (c67939QlT != null) {
            c67939QlT.LJFF = C78555UsJ.LJIJI(c67939QlT.LIZ);
            boolean LIZ = C48479J0x.LIZ(c67939QlT.LIZ);
            c67939QlT.LJ = LIZ;
            if (LIZ && c67939QlT.LJFF == 0 && (c67738QiE = c67939QlT.LIZIZ) != null) {
                try {
                    C16880lQ.LJJLIIIJL(c67738QiE.LIZ, c67738QiE);
                } catch (Exception unused) {
                }
            }
        }
        this.LLII = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(true);
        _$_findCachedViewById(R.id.enr).setVisibility(8);
        ((C74086T5u) _$_findCachedViewById(R.id.enr)).LIZJ();
    }

    public final void LJII() {
        _$_findCachedViewById(R.id.enr).setVisibility(0);
        ((C74086T5u) _$_findCachedViewById(R.id.enr)).LIZIZ();
    }

    public final void Zl() {
        if (isViewValid()) {
            cm();
        } else {
            this.LLI = true;
        }
    }

    public final void cm() {
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(false);
        ((C85714XkU) _$_findCachedViewById(R.id.env)).setCallback(this.LLIIIJ);
        CountDownTimer LJJJIL = ((C85714XkU) _$_findCachedViewById(R.id.env)).LJJJIL();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C85621Xiz c85621Xiz = this.LLD;
        if (c85621Xiz != null) {
            C69134RBi.LIZIZ(mo49getActivity, c85621Xiz.LIZ(), new C69135RBj(LJJJIL), xl());
            C85621Xiz c85621Xiz2 = this.LLD;
            if (c85621Xiz2 != null) {
                if (c85621Xiz2.LIZIZ && o.LJ(c85621Xiz2.LIZLLL, Boolean.TRUE)) {
                    HashMap LIZ = C85735Xkp.LIZ();
                    C85621Xiz c85621Xiz3 = this.LLD;
                    if (c85621Xiz3 != null) {
                        if (LIZ.containsKey(c85621Xiz3.LIZ())) {
                            HashMap LIZ2 = C85735Xkp.LIZ();
                            C85621Xiz c85621Xiz4 = this.LLD;
                            if (c85621Xiz4 != null) {
                                if (LIZ2.get(c85621Xiz4.LIZ()) != null) {
                                    HashMap LIZ3 = C85735Xkp.LIZ();
                                    C85621Xiz c85621Xiz5 = this.LLD;
                                    if (c85621Xiz5 != null) {
                                        Object obj = LIZ3.get(c85621Xiz5.LIZ());
                                        o.LJI(obj);
                                        this.LLFFF = ((Boolean) obj).booleanValue();
                                        return;
                                    }
                                    o.LJIJI("config");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("config");
                                throw null;
                            }
                        }
                        C85621Xiz c85621Xiz6 = this.LLD;
                        if (c85621Xiz6 != null) {
                            C113684dA.LIZ(c85621Xiz6.LIZ(), new C85710XkQ(this));
                            return;
                        } else {
                            o.LJIJI("config");
                            throw null;
                        }
                    }
                    o.LJIJI("config");
                    throw null;
                }
                return;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    public final void dm() {
        if (_$_findCachedViewById(R.id.env).getVisibility() != 8) {
            _$_findCachedViewById(R.id.env).setVisibility(8);
        }
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(true);
    }

    public final void em() {
        if (_$_findCachedViewById(R.id.env).getVisibility() != 0) {
            _$_findCachedViewById(R.id.env).setVisibility(0);
        }
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C85621Xiz c85621Xiz = this.LLD;
        if (c85621Xiz != null) {
            if (c85621Xiz.LJI) {
                EditText inputCodeView = (EditText) _$_findCachedViewById(R.id.enw);
                o.LJIIIIZZ(inputCodeView, "inputCodeView");
                C9WD.LIZIZ(inputCodeView);
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        LJII();
    }

    @Override // X.InterfaceC80500Via
    public final void LJJLIL(String str) {
        if (!isViewValid()) {
            return;
        }
        if (this.LLFZ) {
            ((TextView) _$_findCachedViewById(R.id.enw)).setText("");
            this.LLFZ = false;
        }
        ((C252949wI) _$_findCachedViewById(R.id.enp)).LIZ();
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJII();
    }

    @Override // X.InterfaceC80500Via
    public final void LJLL(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.enw);
        if (this.LLD != null) {
            textView.setEnabled(!r0.LJFF);
            this.LLFZ = false;
            this.LLIIIILZ = Yl();
            fm(str);
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.ens) {
            hm();
            return;
        }
        if (valueOf.intValue() != R.id.enx) {
            return;
        }
        C85621Xiz c85621Xiz = this.LLD;
        if (c85621Xiz != null) {
            if (c85621Xiz.LIZIZ && o.LJ(c85621Xiz.LIZLLL, Boolean.TRUE)) {
                FMX.onEventV3("request_phone_call");
            }
            if (!this.LLFFF) {
                return;
            }
            this.LLFII = true;
            C85621Xiz c85621Xiz2 = this.LLD;
            if (c85621Xiz2 != null) {
                C69093R9t.LJJIFFI(this, xl(), Al(), this, c85621Xiz2.LIZ(), "user_click").LJIILL();
                return;
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C85621Xiz Xl = Xl();
        this.LLD = Xl;
        if (Xl != null) {
            this.LLI = Xl.LJ;
            if (Xl.LIZIZ) {
                if (this.LLFF == null) {
                    Context context = getContext();
                    o.LJI(context);
                    this.LLFF = new C67939QlT(context);
                }
                C67939QlT c67939QlT = this.LLFF;
                o.LJI(c67939QlT);
                c67939QlT.LIZIZ();
                C67939QlT c67939QlT2 = this.LLFF;
                o.LJI(c67939QlT2);
                c67939QlT2.LIZJ();
                return;
            }
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        String str;
        o.LJIIIZ(message, "message");
        if (this.LLFII && i == 1206) {
            this.LLFII = false;
            Context context = getContext();
            if (context == null) {
                return;
            }
            C26227ARb c26227ARb = new C26227ARb(context);
            Context context2 = getContext();
            if (context2 != null) {
                str = context2.getString(R.string.dqp);
            } else {
                str = null;
            }
            c26227ARb.LIZIZ(str);
            UC0.LIZJ(c26227ARb, C85201XcD.LJLIL);
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            return;
        }
        this.LLFZ = true;
        ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(true);
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJIIIZ();
        ((C252949wI) _$_findCachedViewById(R.id.enp)).LIZIZ(message);
    }

    public final void km(long j, boolean z) {
        if (this.LLFFF && j <= 50000 && _$_findCachedViewById(R.id.enx).getVisibility() != 0) {
            if (z) {
                _$_findCachedViewById(R.id.enx).setVisibility(0);
            } else {
                _$_findCachedViewById(R.id.enx).setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
