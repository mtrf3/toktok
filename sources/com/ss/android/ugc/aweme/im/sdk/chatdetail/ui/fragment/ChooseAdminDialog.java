package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C117464jG;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC88472Yns;
import X.SYL;
import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ChooseAdminDialog extends BaseFragment {
    public final List<IMUser> LJLIL;
    public final InterfaceC88472Yns<IMUser, C76800UCe> LJLILLLLZI;
    public IMUser LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final void vl(IMUser iMUser) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (IMUser iMUser2 : this.LJLIL) {
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                IMUser iMUser3 = iMUser2;
                if (iMUser != null) {
                    str = iMUser.getUid();
                }
                arrayList.add(new C117464jG(iMUser3, o.LJ(str, iMUser3.getUid()), new AqS167S0100000_1(this, 152)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        ((SYL) _$_findCachedViewById(R.id.bal)).getState().LJIILLIIL(arrayList);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.bai), new ACListenerS21S0100000_1(this, 195));
        SYL syl = (SYL) _$_findCachedViewById(R.id.bal);
        syl.LLLF.LJZL(AdminChooseCell.class);
        syl.setLayoutManager(new LinearLayoutManager(1, false));
        vl(this.LJLJI);
    }

    public ChooseAdminDialog(Activity activity, List list, AqS167S0100000_1 aqS167S0100000_1) {
        this.LJLIL = list;
        this.LJLILLLLZI = aqS167S0100000_1;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b1e, viewGroup, false);
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
