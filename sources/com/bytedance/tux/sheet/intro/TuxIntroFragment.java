package com.bytedance.tux.sheet.intro;

import X.AR4;
import X.ARR;
import X.AnonymousClass391;
import X.C16880lQ;
import X.C1A7;
import X.C26224AQy;
import X.C26338AVi;
import X.C32151Nz;
import X.C63081OpJ;
import X.C76800UCe;
import X.C7MY;
import X.InterfaceC88472Yns;
import X.O6R;
import X.SY4;
import X.SY9;
import Y.ACListenerS30S0300000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS451S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TuxIntroFragment extends Fragment {
    public C26224AQy LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public LinearLayout LJLLLL;
    public Drawable LJLLLLLL;
    public SY9 LJLZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final IDqS451S0100000_4 LJZ = new IDqS451S0100000_4(this, 0);

    public static LinearLayout.LayoutParams wl() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZI).clear();
    }

    public final void vl(LinearLayout linearLayout, C26224AQy c26224AQy) {
        boolean z;
        if (linearLayout == null) {
            return;
        }
        Context ctx = linearLayout.getContext();
        o.LJIIIIZZ(ctx, "ctx");
        SY4 sy4 = new SY4(ctx, null, 6, 0);
        sy4.setButtonSize(this.LJLLI);
        CharSequence charSequence = c26224AQy.LJII;
        CharSequence charSequence2 = c26224AQy.LJIIIIZZ;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && charSequence2 != null && charSequence2.length() > 0) {
            int LJJJJL = ((C63081OpJ.LJJJJL(ctx) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(72))) / 2) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(8.0f))) * 4);
            TextPaint textPaint = new TextPaint();
            StaticLayout LJJIIJ = C1A7.LJJIIJ(sy4, charSequence, textPaint, LJJJJL, null);
            StaticLayout LJJIIJ2 = C1A7.LJJIIJ(sy4, charSequence2, textPaint, LJJJJL, null);
            sy4.setButtonVariant(this.LJLLILLLL);
            sy4.setText(charSequence);
            if (LJJIIJ.getLineCount() > 1 || LJJIIJ2.getLineCount() > 1 || c26224AQy.LJIILL) {
                linearLayout.setOrientation(1);
                linearLayout.addView(sy4, wl());
                ARR arr = new ARR(ctx);
                arr.setButtonVariant(this.LJLLJ);
                arr.setButtonSize(this.LJLLI);
                arr.setTextColor(this.LJLLL);
                arr.setText(charSequence2);
                LinearLayout.LayoutParams wl = wl();
                wl.topMargin = C7MY.LIZIZ(6);
                linearLayout.addView(arr, wl);
                C26338AVi.LJI(linearLayout, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), false, 23);
                xl(sy4, c26224AQy.LJIIIZ);
                xl(arr, c26224AQy.LJIIJ);
                return;
            }
            linearLayout.setOrientation(0);
            SY4 sy42 = new SY4(ctx, null, 6, 0);
            sy42.setButtonVariant(this.LJLLJ);
            sy42.setButtonSize(this.LJLLI);
            sy42.setText(charSequence2);
            LinearLayout.LayoutParams wl2 = wl();
            wl2.weight = 1.0f;
            linearLayout.addView(sy42, wl2);
            linearLayout.addView(new FrameLayout(ctx), new LinearLayout.LayoutParams(C7MY.LIZIZ(8), -2));
            LinearLayout.LayoutParams wl3 = wl();
            wl3.weight = 1.0f;
            linearLayout.addView(sy4, wl3);
            C26338AVi.LJI(linearLayout, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), false, 23);
            xl(sy4, c26224AQy.LJIIIZ);
            xl(sy42, c26224AQy.LJIIJ);
            return;
        }
        if (charSequence != null && charSequence.length() > 0) {
            sy4.setButtonVariant(this.LJLLILLLL);
            sy4.setText(charSequence);
            linearLayout.addView(sy4, wl());
            C26338AVi.LJI(linearLayout, null, null, null, AnonymousClass391.LIZJ(28), false, 23);
            xl(sy4, c26224AQy.LJIIIZ);
            return;
        }
        if (charSequence2 != null && charSequence2.length() > 0) {
            sy4.setButtonVariant(this.LJLLJ);
            sy4.setText(charSequence2);
            linearLayout.addView(sy4, wl());
            C26338AVi.LJI(linearLayout, null, null, null, AnonymousClass391.LIZJ(28), false, 23);
            xl(sy4, c26224AQy.LJIIJ);
            return;
        }
        linearLayout.setVisibility(4);
        C26338AVi.LJI(linearLayout, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))), false, 23);
    }

    public final void xl(SY4 sy4, InterfaceC88472Yns<? super AR4, C76800UCe> interfaceC88472Yns) {
        if (interfaceC88472Yns == null) {
            return;
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS30S0300000_4(sy4, this, interfaceC88472Yns, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Type inference failed for: r5v51, types: [X.29S] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r31, android.view.ViewGroup r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 2082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.intro.TuxIntroFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
