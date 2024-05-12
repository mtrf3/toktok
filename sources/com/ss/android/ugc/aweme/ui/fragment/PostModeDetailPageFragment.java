package com.ss.android.ugc.aweme.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C1807677o;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C54297LSr;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C84I;
import X.C90903hW;
import X.GG5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;

/* loaded from: classes4.dex */
public final class PostModeDetailPageFragment extends Hilt_PostModeDetailPageFragment {
    public C54297LSr LJLJJI;
    public PostModeDetailParams LJLJJL;
    public ScrollSwitchStateManager LJLJJLL;
    public C84I LJLJL;
    public Aweme LJLJLJ;
    public final C214378bB LJLJLLL;
    public final C62822Ol8 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    public PostModeDetailPageFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3((Fragment) this, 1671);
        C1807677o c1807677o = C1807677o.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJLLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c1807677o, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1149));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GG5.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.previousPage, "personal_homepage") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x013f, code lost:
    
        r2 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0144, code lost:
    
        if (r7 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0146, code lost:
    
        r0 = r7.getString("photo_shared_vm_unique_key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014c, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014e, code lost:
    
        r2.putString("photo_shared_vm_unique_key", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0151, code lost:
    
        r0 = r10.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0153, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0155, code lost:
    
        r1 = r0.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0159, code lost:
    
        r2.putSerializable("author", r1);
        r0 = r10.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0160, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        r1 = r0.getSecAuthorUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0166, code lost:
    
        r2.putString("secUid", r1);
        r0 = r10.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016d, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016f, code lost:
    
        r1 = r0.getAuthorUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0173, code lost:
    
        r2.putString("uid", r1);
        r0 = r10.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017a, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017c, code lost:
    
        r2.putString("related_gid", r0.awemeId);
        r0 = r10.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0185, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0187, code lost:
    
        r2.putParcelable("POST_DETAIL_PARAMS", r0);
        r0 = r10.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x018c, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x018e, code lost:
    
        r2.putString("BUNDLE_KEY_EVENT_TYPE", r0.eventType);
        r3.LIZ(r2, com.ss.android.ugc.aweme.ui.fragment.PostModeProfileWrapperFragment.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r3.LIZIZ = new X.C202737xV(r10);
        r10.LJLJJI = r3.LIZJ(getFragmentManager());
        r1 = (X.C80769Vmv) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.nb6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r10.LJLJL = (X.C84I) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.nb6);
        r2 = (X.C80769Vmv) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.nb6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
    
        r2.LJFF(new Y.IDiS267S0100000_3(r10, 7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        ((com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel) r10.LJLL.getValue()).LJLL.observe(r10, new Y.AObserverS71S0100000_3(r10, 89));
        r3 = r10.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r2 = requireActivity();
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "requireActivity()");
        r3.LJLJJI.observe(r2, new Y.AObserverS71S0100000_3(r10, 90));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        r3 = r10.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
    
        r2 = requireActivity();
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "requireActivity()");
        r3.LJLLL.observe(r2, new Y.AObserverS71S0100000_3(r10, 91));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r0 = r10.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
    
        r0.notifyDataSetChanged();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        r1 = r10.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        r1.E50("page_feed", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        r1.setAdapter(r10.LJLJJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ad, code lost:
    
        kotlin.jvm.internal.o.LJIJI("postModeDetailParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b1, code lost:
    
        kotlin.jvm.internal.o.LJIJI("postModeDetailParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b5, code lost:
    
        kotlin.jvm.internal.o.LJIJI("postModeDetailParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0097, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.tabName, "like") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        if (X.C025908h.LJFF(false, r0) != false) goto L24;
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.c1n, viewGroup, false, "inflater.inflate(R.layou…agment, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
