package com.ss.android.ugc.aweme.relation.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C113914dX;
import X.C141335gf;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C62101OYv;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.InterfaceC62102OYw;
import Y.AObserverS78S0100000_10;
import Y.IDLListenerS58S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareInviteContentFragment extends BaseFragment implements InterfaceC219588ja {
    public C113914dX LJLIL;
    public ShareInviteContentVM LJLILLLLZI;
    public int LJLJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 332));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Context context;
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS160S0100000_10(this, 331));
        c235119Kp.LIZIZ(LIZJ);
        if (1 == this.LJLJI && (context = getContext()) != null && (LJI = C79045V0n.LJI(R.attr.cv, context)) != null) {
            c235119Kp.LIZJ(LJI.intValue());
        }
        return c235119Kp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.ShareInviteContentFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((InterfaceC62102OYw) this.LJLJJI.getValue()).LIZIZ(view);
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 70);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(view, aqS176S0100000_10, 6));
        }
        C113914dX LIZJ = ((InterfaceC62102OYw) this.LJLJJI.getValue()).LIZJ();
        this.LJLIL = LIZJ;
        if (LIZJ != null) {
            ShareInviteContentVM shareInviteContentVM = this.LJLILLLLZI;
            if (shareInviteContentVM != null) {
                LIZJ.LJIIJ(shareInviteContentVM.LJLIL, false);
                C113914dX c113914dX = this.LJLIL;
                if (c113914dX != null) {
                    c113914dX.LJLJJL = new C62101OYv(this);
                    ShareInviteContentVM shareInviteContentVM2 = this.LJLILLLLZI;
                    if (shareInviteContentVM2 != null) {
                        shareInviteContentVM2.LJLJI.observe(this, new AObserverS78S0100000_10(this, 48));
                        return;
                    } else {
                        o.LJIJI("shareInviteContentVM");
                        throw null;
                    }
                }
                o.LJIJI("shareChannelBar");
                throw null;
            }
            o.LJIJI("shareInviteContentVM");
            throw null;
        }
        o.LJIJI("shareChannelBar");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LIZ = ((InterfaceC62102OYw) this.LJLJJI.getValue()).LIZ(inflater, viewGroup);
        C29S c29s = null;
        if (!(LIZ instanceof View)) {
            LIZ = null;
        }
        if (LIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZ, this);
                C10A.LIZIZ(LIZ, this);
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
        return LIZ;
    }
}
