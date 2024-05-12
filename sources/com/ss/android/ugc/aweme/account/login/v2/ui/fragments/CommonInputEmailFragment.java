package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C252949wI;
import X.C6X6;
import X.C74088T5w;
import X.C74090T5y;
import X.C85705XkL;
import X.C9W6;
import X.C9WD;
import X.EP5;
import X.EnumC69113RAn;
import X.RBV;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class CommonInputEmailFragment extends BaseAccountBindingsFlowFragment {
    public EditText LLD;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public boolean LLF = true;

    public void Zl() {
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
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

    public abstract void dm(String str);

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public int getLayout() {
        return R.layout.oc;
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final EditText cm() {
        EditText editText = this.LLD;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("emailInput");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo0)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public void LLFII() {
        _$_findCachedViewById(R.id.eny).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo0)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public void Rg() {
        _$_findCachedViewById(R.id.eny).setVisibility(0);
    }

    public final String Xl() {
        if (!EP5.LIZ()) {
            String string = getString(R.string.qvl);
            o.LJIIIIZZ(string, "{\n            getString(…il_verify_text)\n        }");
            return string;
        }
        String string2 = getString(R.string.r0b);
        o.LJIIIIZZ(string2, "{\n            getString(…isclaimer_body)\n        }");
        return string2;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C9W6.LIZ() && Al() != EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN) {
            C9WD.LIZIZ(cm());
        } else {
            cm().requestFocus();
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        C252949wI c252949wI;
        o.LJIIIZ(message, "message");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.enz);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = ((C74090T5y) _$_findCachedViewById(R.id.eoh)).getEditText();
        o.LJIIIZ(editText, "<set-?>");
        this.LLD = editText;
        EditText cm = cm();
        cm.setInputType(32);
        cm.addTextChangedListener(new C85705XkL(this));
        cm.setNextFocusDownId(cm.getId());
        cm.setHint(getString(R.string.doz));
        String LIZIZ = RBV.LIZIZ(this);
        if (!TextUtils.isEmpty(LIZIZ)) {
            cm.setText(LIZIZ);
            cm.setSelection(LIZIZ.length());
        }
        Ol(new ACListenerS35S0100000_15(this, 59), _$_findCachedViewById(R.id.eo0));
        RecyclerView inputEmailDomainHint = (RecyclerView) _$_findCachedViewById(R.id.eny);
        o.LJIIIIZZ(inputEmailDomainHint, "inputEmailDomainHint");
        Yl(inputEmailDomainHint, cm(), LJJLIIIJJI(), LJJLIIIJLLLLLLLZ());
    }

    public void Yl(RecyclerView recyclerView, EditText editText, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C6X6.LIZ(recyclerView, editText, LJJLIIIJJI(), LJJLIIIJLLLLLLLZ(), "");
    }
}
