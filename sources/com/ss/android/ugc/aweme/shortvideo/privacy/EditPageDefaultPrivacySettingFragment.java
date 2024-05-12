package com.ss.android.ugc.aweme.shortvideo.privacy;

import X.AI8;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C150575vZ;
import X.C1535460w;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C25600zU;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C78842Uww;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.G5Q;
import X.G9B;
import X.G9D;
import X.G9V;
import X.H7R;
import X.OSZ;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPageDefaultPrivacySettingFragment extends PublishDefaultPermissionFragment {
    public AI8 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final void Gl() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final void Hl(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment, X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 260));
        int i = 0;
        c235119Kp.LIZIZ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(C1535460w.LIZIZ());
        o.LJIIIIZZ(string, "getString(settingsTextId)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZLLL = false;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            i = LJI.intValue();
        }
        c235119Kp.LIZJ(i);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        VideoPublishEditModel videoPublishEditModel = Al().getVideoPublishEditModel();
        if (videoPublishEditModel == null) {
            return;
        }
        if (videoPublishEditModel.creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2) {
            z = true;
        } else {
            z = false;
        }
        G9B g9b = this.LJLJJL;
        if (g9b != null) {
            g9b.LJ.setValue(new C150575vZ<>(new OSZ(Boolean.valueOf(z), "")));
        }
        if (z && this.LJLJL == 1) {
            wl(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final int xl() {
        if (G9D.LIZ() == 4) {
            return G9D.LIZJ();
        }
        return G9D.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final void Jl(View view) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        o.LJIIIZ(view, "view");
        super.Jl(view);
        VideoPublishEditModel videoPublishEditModel = Al().getVideoPublishEditModel();
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (privacySettingModel = creativeModel.privacySettingModel) == null) {
            return;
        }
        privacySettingModel.isSubscribeOnly = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment
    public final void wl(int i) {
        G9B g9b = this.LJLJJL;
        if (g9b != null) {
            g9b.LIZJ(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        VideoPublishEditModel videoPublishEditModel = Al().getVideoPublishEditModel();
        if (mo49getActivity != null && videoPublishEditModel != null) {
            CommonSettingItemStatus commonSettingItemStatus = (CommonSettingItemStatus) ViewModelProviders.of(this).get(CommentSettingItemStatus.class);
            if (this.LJLLJ == null) {
                View privacy_container = _$_findCachedViewById(R.id.i4f);
                o.LJIIIIZZ(privacy_container, "privacy_container");
                View inflate = ((ViewStub) privacy_container.findViewById(R.id.blm)).inflate();
                o.LJII(inflate, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
                AI8 ai8 = (AI8) inflate;
                ai8.setTitle(G9V.LIZ(privacy_container.getContext()));
                this.LJLLJ = ai8;
                ai8.setIcon((C2068389v) null);
                AI8 ai82 = this.LJLLJ;
                if (ai82 != null) {
                    commonSettingItemStatus.bindView(ai82, this);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            AI8 ai83 = this.LJLLJ;
            if (ai83 != null) {
                ai83.setTitle(G9V.LIZ(getContext()));
            }
            commonSettingItemStatus._visibility.observe(this, new AObserverS75S0100000_7(this, 25));
            G5Q g5q = new G5Q(commonSettingItemStatus, new WeakReference(mo49getActivity));
            HashMap hashMap = new HashMap();
            String creationId = videoPublishEditModel.getCreationId();
            o.LJIIIIZZ(creationId, "editModel.creationId");
            hashMap.put("creation_id", creationId);
            hashMap.put("enter_from", "video_edit_page");
            hashMap.put("content_type", H7R.LJIIIZ(videoPublishEditModel));
            String LJJIFFI = H7R.LJJIFFI(videoPublishEditModel);
            if (LJJIFFI == null) {
                LJJIFFI = "";
            }
            hashMap.put("content_source", LJJIFFI);
            String str = videoPublishEditModel.mShootWay;
            o.LJIIIIZZ(str, "editModel.mShootWay");
            hashMap.put("shoot_way", str);
            C78842Uww.LJIIZILJ(g5q, videoPublishEditModel, hashMap);
        }
        AI8 tcmItem = (AI8) view.findViewById(R.id.l1v);
        ICommerceToolsTcmService LJIJJ = CommerceToolsTcmServiceImpl.LJIJJ();
        o.LJIIIIZZ(tcmItem, "tcmItem");
        LJIJJ.LJI(tcmItem, this, Al().getVideoPublishEditModel());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(new C25600zU(getContext(), R.style.kp)), R.layout.ax4, viewGroup, false);
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
