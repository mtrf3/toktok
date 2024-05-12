package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import X.ActivityC45651qj;
import X.C10A;
import X.C111334Yn;
import X.C111354Yp;
import X.C141335gf;
import X.C16880lQ;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.InterfaceC111364Yq;
import X.InterfaceC65350Pko;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupInviteFragment extends Hilt_GroupInviteFragment {
    public InterfaceC111364Yq LJLJJI;
    public final C214298b3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public GroupInviteFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 83);
        C65776Prg LIZ = C65352Pkq.LIZ(GroupInviteViewModel.class);
        AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 82);
        C111354Yp c111354Yp = C111354Yp.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), aqS151S0100000_1, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c111354Yp, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS151S0100000_1, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c111354Yp, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJL = c214298b3;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        Serializable serializable;
        GroupInfo groupInfo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            l = Long.valueOf(arguments.getLong("arg_invite_sender"));
        } else {
            l = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("arg_default_group");
        } else {
            serializable = null;
        }
        if (serializable instanceof GroupInfo) {
            groupInfo = (GroupInfo) serializable;
        } else {
            groupInfo = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("arg_invite_id");
        }
        C8VV.LIZ(this, false, new AqS132S0200000_1(this, new C111334Yn(l, groupInfo, str, (GroupInviteViewModel) this.LJLJJL.getValue()), 7));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1u, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
