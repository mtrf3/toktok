package com.ss.android.ugc.aweme.authorize;

import X.AJ9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C61949OSz;
import X.C62846OlW;
import X.C76800UCe;
import X.C78765Uvh;
import X.C90903hW;
import X.HG3;
import X.InterfaceC36163EHf;
import X.OT6;
import X.OTK;
import X.OTT;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class I18nLiteAuthorizeFragment extends Fragment implements InterfaceC36163EHf {
    public AuthCommonViewModel LJLIL;
    public AwemeAuthorizePlatformDepend LJLILLLLZI;
    public OTK LJLJI;
    public OT6 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OT6 ot6 = new OT6(getArguments());
        this.LJLJJI = ot6;
        if (ot6.callerPackage == null) {
            ot6.callerPackage = requireActivity().getCallingPackage();
        }
        this.LJLILLLLZI = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LJLILLLLZI;
        if (awemeAuthorizePlatformDepend != null) {
            this.LJLJI = new OTK(context, awemeAuthorizePlatformDepend);
            Application application = requireActivity().getApplication();
            o.LJIIIIZZ(application, "requireActivity().application");
            AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LJLILLLLZI;
            if (awemeAuthorizePlatformDepend2 != null) {
                OTK otk = this.LJLJI;
                if (otk != null) {
                    OT6 ot62 = this.LJLJJI;
                    if (ot62 != null) {
                        this.LJLIL = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new OTT(application, awemeAuthorizePlatformDepend2, otk, ot62, C61949OSz.LIZ(getArguments()))).get(AuthCommonViewModel.class);
                        return;
                    } else {
                        o.LJIJI("request");
                        throw null;
                    }
                }
                o.LJIJI("model");
                throw null;
            }
            o.LJIJI("depend");
            throw null;
        }
        o.LJIJI("depend");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User curUser;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getContext() == null || (curUser = HG3.LJIILL().getCurUser()) == null) {
            return;
        }
        C78765Uvh.LJFF((C62846OlW) _$_findCachedViewById(R.id.fuk), curUser.getAvatarThumb());
        ((TextView) _$_findCachedViewById(R.id.fum)).setText(curUser.getNickname());
        String uniqueId = curUser.getUniqueId();
        TextView textView = (TextView) _$_findCachedViewById(R.id.fup);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(uniqueId);
        textView.setText(X1D.LIZIZ(LIZ));
        AJ9.LJ(getContext(), curUser.getCustomVerify(), curUser.getEnterpriseVerifyReason(), (TextView) _$_findCachedViewById(R.id.fup));
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.fug);
        String string = getResources().getString(R.string.sa1);
        o.LJIIIIZZ(string, "resources.getString(R.st…tok_login_conformation_2)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{curUser.getUniqueId()}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        textView2.setText(LLLZ);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.fug), new ACListenerS30S0100000_10(this, 1));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.fuf), new ACListenerS30S0100000_10(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ej, inflater, null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLZIIL;
    }
}
