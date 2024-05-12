package com.ss.android.ugc.aweme.notification.creator;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C186627Uc;
import X.C214298b3;
import X.C214528bQ;
import X.C221018lt;
import X.C29S;
import X.C3C5;
import X.C56812MRk;
import X.C56869MTp;
import X.C56871MTr;
import X.C56872MTs;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78926UyI;
import X.C8VV;
import X.C8ZK;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.InterfaceC57784Mm4;
import X.MT8;
import X.MTK;
import X.MTZ;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.power.CreatorFragmentData;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class CreatorNoticeResultFragment extends AmeBaseFragment implements C8ZK {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public CreatorNoticeResultFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeResultVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 363);
        C56871MTr c56871MTr = C56871MTr.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c56871MTr, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c56871MTr, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(LIZ2, 364);
        C56872MTs c56872MTs = C56872MTs.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c56872MTs, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, c9be)) {
            c214298b32 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c56872MTs, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b32;
    }

    public final CreatorNoticeResultVM vl() {
        return (CreatorNoticeResultVM) this.LJLIL.getValue();
    }

    public void wl() {
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 150));
    }

    @Override // X.C8ZK
    public final void Od() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(vl().nv0());
        LIZ.append(": onPageUnSelected");
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        CreatorNoticeResultVM vl = vl();
        vl.getClass();
        vl.setState(new AqS14S0010000_9(false, 12));
    }

    public void xl() {
        CreatorFragmentData creatorFragmentData;
        MTK LIZ;
        List<NoticeTabModel> list;
        NoticeTabModel noticeTabModel;
        Bundle arguments = getArguments();
        if (arguments != null && (creatorFragmentData = (CreatorFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null && (LIZ = ((MT8) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLJI.LIZ()) != null && (list = LIZ.LIZJ) != null && creatorFragmentData.index < list.size() && (noticeTabModel = (NoticeTabModel) ListProtector.get(list, creatorFragmentData.index)) != null) {
            CreatorNoticeResultVM vl = vl();
            vl.getClass();
            vl.setState(new AqS175S0100000_9(noticeTabModel, 535));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78897Uxp.LJII(this, C56869MTp.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xl();
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MTZ(this, null));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        if (context != null) {
            C56812MRk.LIZ = C56812MRk.LIZJ(context);
        }
        wl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ro, viewGroup, false);
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

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
