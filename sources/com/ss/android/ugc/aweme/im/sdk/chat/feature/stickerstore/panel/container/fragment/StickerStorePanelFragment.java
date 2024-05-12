package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.container.fragment;

import X.ASQ;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C34B;
import X.C3C5;
import X.C62048OWu;
import X.C65300Pk0;
import X.C71572rR;
import X.C76800UCe;
import X.C78924UyG;
import X.C88113d1;
import X.C90903hW;
import X.C91023hi;
import X.C91093hp;
import X.HG3;
import X.InterfaceC25830ABu;
import X.InterfaceC71602rU;
import X.InterfaceC90983he;
import X.RBX;
import X.X1D;
import Y.IDObjectS0S0101000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerStorePanelFragment extends BaseFragment implements InterfaceC25830ABu, InterfaceC71602rU {
    public static final /* synthetic */ int LJLJL = 0;
    public C62048OWu LJLILLLLZI;
    public String LJLJI;
    public Integer LJLJJI;
    public Integer LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final List<InterfaceC90983he> LJLIL = new ArrayList();

    static {
        new C88113d1();
    }

    @Override // X.InterfaceC71602rU
    public final void Cs0(StickerSetInfo info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.InterfaceC71602rU
    public final void Ge() {
    }

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

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

    @Override // X.InterfaceC71602rU
    public final void hi(List<StickerSetInfo> list) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Integer num = this.LJLJJI;
        if (num != null) {
            int intValue = num.intValue();
            Keva kevaRepo = C91093hp.LIZLLL();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("last_opened_sticker_store_tab");
            LIZ.append(curUserId);
            kevaRepo.storeInt(X1D.LIZIZ(LIZ), intValue);
        }
        C71572rR.LJII.LJIJ(this);
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC71602rU
    public final void kI(StickerSetInfo stickerSetInfo) {
        ASQ.LJ(this, C91023hi.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "6706247914855088158");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/im/sdk/chat/feature/stickerstore/panel/container/fragment/StickerStorePanelFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/im/sdk/chat/feature/stickerstore/panel/container/fragment/StickerStorePanelFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        C62048OWu c62048OWu = this.LJLILLLLZI;
        if (c62048OWu != null) {
            Iterator<View> it = C78924UyG.LIZLLL(c62048OWu).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                View findViewById = ((View) iDObjectS0S0101000.next()).findViewById(R.id.kk3);
                o.LJIIIIZZ(findViewById, "tab.findViewById<ViewPag…ker_store_tab_view_pager)");
                ViewGroup viewGroup = (ViewGroup) findViewById;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    o.LJIIIIZZ(childAt, "getChildAt(index)");
                    RecyclerView recyclerView = (RecyclerView) childAt.findViewById(R.id.kj5);
                    if (recyclerView != null) {
                        recyclerView.setNestedScrollingEnabled(!z);
                    }
                    RecyclerView recyclerView2 = (RecyclerView) childAt.findViewById(R.id.n8h);
                    if (recyclerView2 != null) {
                        recyclerView2.setNestedScrollingEnabled(!z);
                    }
                }
            }
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/im/sdk/chat/feature/stickerstore/panel/container/fragment/StickerStorePanelFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offset=");
        LIZ.append(f);
        C34B.LIZIZ("sticker_store_panel", X1D.LIZIZ(LIZ));
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC90983he) it.next()).D2(f);
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state=");
        LIZ.append(i);
        C34B.LIZIZ("sticker_store_panel", X1D.LIZIZ(LIZ));
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC90983he) it.next()).LJJJLZIJ(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "v2s") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.container.fragment.StickerStorePanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b2e, viewGroup, false);
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
