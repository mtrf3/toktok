package com.ss.android.ugc.aweme.comment.gift.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C28289B8j;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GiftAnimationFragment extends DialogFragment {
    public PlayerController LJLIL;
    public Comment LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PlayerController playerController = this.LJLIL;
        if (playerController != null) {
            playerController.release();
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.clearFlags(2);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                C28289B8j.LIZIZ(0, window3);
            }
            Window window4 = dialog.getWindow();
            if (window4 != null) {
                window4.setLayout(-1, -1);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final void vl() {
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        ActivityC45651qj mo49getActivity;
        FragmentManager supportFragmentManager2;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (supportFragmentManager = mo49getActivity2.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("GiftAnimationFragment")) != null && (mo49getActivity = mo49getActivity()) != null && (supportFragmentManager2 = mo49getActivity.getSupportFragmentManager()) != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager2);
            c1b3.LJJI(LJJJIL);
            c1b3.LJIILJJIL();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            Serializable serializable = arguments.getSerializable("comment");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.model.Comment");
            this.LJLILLLLZI = (Comment) serializable;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)|4|(1:6)(1:62)|7|(1:9)(1:61)|10|(1:60)|13|(6:14|15|(1:17)|18|19|(2:21|22))|(4:24|25|26|27)|28|29|30|(2:32|(1:36))|38|(1:40)|41|42|43|44|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(1:3)|4|(1:6)(1:62)|7|(1:9)(1:61)|10|(1:60)|13|14|15|(1:17)|18|19|(2:21|22)|(4:24|25|26|27)|28|29|30|(2:32|(1:36))|38|(1:40)|41|42|43|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0177, code lost:
    
        r17.LJLIL = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController.get(r6, new com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer());
        X.C34B.LJI("GiftAnimationFragment", "use DefaultSystemPlayer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
    
        vl();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130 A[Catch: Exception -> 0x014a, TryCatch #1 {Exception -> 0x014a, blocks: (B:30:0x012a, B:32:0x0130, B:34:0x013d, B:36:0x0146), top: B:29:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        super.show(manager, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        setCancelable(false);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.pr, viewGroup, false);
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
