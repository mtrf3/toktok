package com.ss.android.ugc.aweme.paidcontent.fragments;

import X.A4S;
import X.A4Y;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DJ;
import X.C221108m2;
import X.C25589A2n;
import X.C26045AKb;
import X.C283619k;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.ORZ;
import X.V56;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReplyFragment extends BottomSheetDialogFragment {
    public static CollectionDetailModel LJLJL;
    public CollectionDetailModel LJLIL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 575));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 574));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 576));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 577));

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = LJLJL;
        LJLJL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        User currentUser;
        UrlModel avatarThumb;
        List<String> urlList;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        View view2 = null;
        if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null && (avatarThumb = currentUser.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
            str = (String) ORZ.LJLLLL(urlList);
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view3 = (View) linkedHashMap.get(Integer.valueOf(R.id.iw_));
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null && (view3 = view4.findViewById(R.id.iw_)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.iw_), view3);
            }
            ComposeView composeView = (ComposeView) view2;
            composeView.setViewCompositionStrategy(C283619k.LIZIZ);
            composeView.setContent(C1DJ.LJFF(new V56(str, this), -1563682537, true));
        }
        view2 = view3;
        ComposeView composeView2 = (ComposeView) view2;
        composeView2.setViewCompositionStrategy(C283619k.LIZIZ);
        composeView2.setContent(C1DJ.LJFF(new V56(str, this), -1563682537, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aj4, viewGroup, false);
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

    public static final void vl(ReplyFragment replyFragment, A4Y a4y, String str, String str2) {
        C26045AKb c26045AKb = new C26045AKb(replyFragment);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIIZ(replyFragment.getResources().getString(R.string.rjt));
        c26045AKb.LJIIJ();
        A4S.LJIIIZ(a4y);
        CollectionDetailModel collectionDetailModel = replyFragment.LJLIL;
        if (collectionDetailModel != null) {
            C25589A2n.LJIILIIL(collectionDetailModel, (String) replyFragment.LJLILLLLZI.getValue(), false, str, str2);
        }
        replyFragment.dismiss();
    }
}
