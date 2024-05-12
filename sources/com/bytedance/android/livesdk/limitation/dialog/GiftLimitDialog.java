package com.bytedance.android.livesdk.limitation.dialog;

import X.C10A;
import X.C16880lQ;
import X.C169696lJ;
import X.C28507BGt;
import X.C32833Cub;
import X.C47121t6;
import X.C73318Sq2;
import X.C73943T0h;
import X.EnumC35442Dva;
import X.L7S;
import X.X1D;
import X.ZCL;
import Y.ACListenerS29S0100000_9;
import Y.AfS61S0100000_9;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftLimitDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C47121t6 LJLIL;
    public C47121t6 LJLILLLLZI;
    public long LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C73318Sq2 LJLJI = new C73318Sq2();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxg);
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 17;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LJLJI.LIZLLL();
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        EnumC35442Dva enumC35442Dva = EnumC35442Dva.ItemCountdown;
        o.LJIIIZ(enumC35442Dva, "<set-?>");
        C32833Cub.LIZLLL = enumC35442Dva;
        C73943T0h.LIZ().LIZIZ(new ZCL(C32833Cub.LIZ, C32833Cub.LIZIZ()));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final void vl(long j) {
        String LIZIZ;
        String LIZIZ2;
        int i = (int) (j / 1000);
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 >= 10) {
            LIZIZ = String.valueOf(i2);
        } else {
            LIZIZ = C169696lJ.LIZIZ('0', i2);
        }
        if (i3 >= 10) {
            LIZIZ2 = String.valueOf(i3);
        } else {
            LIZIZ2 = C169696lJ.LIZIZ('0', i3);
        }
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            c47121t6.setText(LIZIZ);
            C47121t6 c47121t62 = this.LJLILLLLZI;
            if (c47121t62 != null) {
                c47121t62.setText(LIZIZ2);
                return;
            } else {
                o.LJIJI("countdownSecond");
                throw null;
            }
        }
        o.LJIJI("countdownMinute");
        throw null;
    }

    public final void wl(L7S l7s) {
        long j = l7s.LIZ;
        if (j > 0) {
            vl(j);
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.bw9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.countdown_minute)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.bw_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.countdown_second)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        C16880lQ.LJJIIZ((C47121t6) view.findViewById(R.id.frr), new ACListenerS29S0100000_9(this, 197));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 198), view.findViewById(R.id.fro));
        TextView textView = (TextView) view.findViewById(R.id.frp);
        Resources resources = getResources();
        o.LJIIIIZZ(resources, "resources");
        int i = (int) this.LJLJJI;
        String quantityString = resources.getQuantityString(R.plurals.o3, i, Integer.valueOf(i));
        o.LJIIIIZZ(quantityString, "res.getQuantityString(\n …ndCoins.toInt()\n        )");
        int i2 = this.LJLJJL;
        String quantityString2 = resources.getQuantityString(R.plurals.o4, i2, Integer.valueOf(i2));
        o.LJIIIIZZ(quantityString2, "res.getQuantityString(\n …CountdownMinute\n        )");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(quantityString);
        LIZ.append(quantityString2);
        textView.setText(X1D.LIZIZ(LIZ));
        vl(this.LJLJJLL * 1000);
        this.LJLJI.LIZ(C73943T0h.LIZ().LIZJ(this, L7S.class).LIZIZ(new AfS61S0100000_9(this, 93)));
    }
}
