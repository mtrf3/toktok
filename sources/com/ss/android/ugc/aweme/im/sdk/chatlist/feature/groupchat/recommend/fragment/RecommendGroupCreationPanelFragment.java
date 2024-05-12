package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.fragment;

import X.ASL;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C38350F3i;
import X.C3C5;
import X.C45804HyK;
import X.C4LN;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C87573c9;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC219588ja;
import X.InterfaceC65350Pko;
import Y.IDDListenerS141S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class RecommendGroupCreationPanelFragment extends BaseFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJI = 0;
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public RecommendGroupCreationPanelFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecommendUserListViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 557);
        C87573c9 c87573c9 = C87573c9.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c87573c9, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS151S0100000_1, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c87573c9, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.gxk);
        o.LJIIIIZZ(string, "getString(R.string.group…_create_inboxCell_header)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 556));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        int i;
        Integer num;
        String string;
        String string2;
        Integer LJJIL;
        String string3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string3 = arguments.getString("uids")) != null) {
            list = s.LJLJJL(string3, new String[]{","}, 0, 6);
        } else {
            list = C61878OQg.INSTANCE;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("entrance_id")) != null && (LJJIL = C38350F3i.LJJIL(string2)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("group")) != null) {
            num = C38350F3i.LJJIL(string);
        } else {
            num = null;
        }
        C8VV.LIZ(this, false, new C4LN(this, list, i, num));
    }

    /* loaded from: classes2.dex */
    public static final class OpenCreateGroupPanelRoute implements IRouteAction {
        @Override // com.bytedance.router.route.IRouteAction
        public Object open(Context context, String str, Bundle bundle) {
            ActivityC45651qj LJJIFFI;
            FragmentManager supportFragmentManager;
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                RecommendGroupCreationPanelFragment recommendGroupCreationPanelFragment = new RecommendGroupCreationPanelFragment();
                recommendGroupCreationPanelFragment.setArguments(bundle);
                ASL asl = new ASL();
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLILLLL = recommendGroupCreationPanelFragment;
                tuxSheet.LJZI = false;
                asl.LJI(1);
                IDDListenerS141S0100000_1 iDDListenerS141S0100000_1 = new IDDListenerS141S0100000_1(recommendGroupCreationPanelFragment, 6);
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJLILLLLZI = iDDListenerS141S0100000_1;
                tuxSheet2.show(supportFragmentManager, "RecommendGroupCreationPanelFragment");
            }
            return Boolean.TRUE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b23, viewGroup, false);
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
