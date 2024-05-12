package com.bytedance.android.live.broadcast.fragment;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C276716t;
import X.C29S;
import X.C30922CBq;
import X.C32151Nz;
import X.C3C5;
import X.C46891sj;
import X.C62705OjF;
import X.C62822Ol8;
import X.C73933Szx;
import X.C73969T1h;
import X.C76800UCe;
import X.C7MY;
import X.C8FR;
import X.C90903hW;
import X.InterfaceC29856Bng;
import X.InterfaceC64592gB;
import X.O6R;
import Y.IDCListenerS135S0100000;
import Y.IDfS124S0200000;
import Y.IDfS292S0100000;
import Y.IDhS93S0100000;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes.dex */
public final class GameDualDeviceQRCodeFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public GameDualDeviceQRCodeFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new C46891sj(this));
        this.LJLILLLLZI = C221108m2.LIZIZ(new IDqS420S0100000(this, 36));
        this.LJLJI = C221108m2.LIZIZ(new IDqS420S0100000(this, 37));
    }

    public static SpannableStringBuilder vl(CharSequence charSequence, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            int LJJLIIIJL = s.LJJLIIIJL(charSequence, str, 0, false, 6);
            if (LJJLIIIJL >= 0) {
                spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, str.length() + LJJLIIIJL, 33);
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageView imageView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) this.LJLJI.getValue();
        if (textView != null) {
            ((InterfaceC29856Bng) AbstractC73672Svk.LJJIJIL(1).LJJIJL(new IDhS93S0100000(this, 4)).LJII(new C62705OjF()).LIZJ(C73933Szx.LIZJ(textView))).LIZJ(new IDfS292S0100000(textView, 42), new IDfS124S0200000(textView, this, 14));
        }
        if (C30922CBq.LIZIZ && (imageView = (ImageView) this.LJLILLLLZI.getValue()) != null) {
            C16880lQ.LJIILLIIL(imageView, new IDCListenerS135S0100000(this, 81));
        }
        ((InterfaceC29856Bng) C276716t.LIZJ.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZJ(new IDfS124S0200000(this, view, 15), new InterfaceC64592gB() { // from class: X.1Zv
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJ("GameDualDeviceQRCodeFragment", android.util.Log.getStackTraceString((Throwable) obj));
            }
        });
    }

    public static void wl(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        Drawable LIZ = C15490jB.LIZ("tiktok_live_game_demand_2", str);
        if (LIZ != null) {
            LIZ.setBounds(0, 0, C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
            if (LJJLIIIJL != -1) {
                spannableStringBuilder.setSpan(new C8FR(LIZ, 2), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d44, viewGroup, false);
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
