package com.bytedance.tux.container;

import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C252709vu;
import X.C26338AVi;
import X.C3C5;
import X.C61328O5c;
import X.C73305Spp;
import X.C73306Spq;
import X.C74291TDr;
import X.C76800UCe;
import X.C7MY;
import X.SY9;
import Y.ARunnableS40S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.BaseSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS3S1102000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TuxWebViewContainer extends BaseSheet {
    public int LJLLI;
    public View LJLLILLLL;
    public C252709vu LJLLJ;
    public FrameLayout LJLLL;
    public C73305Spp LJLLLL;

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final void _$_clearFindViewByIdCache() {
        throw null;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final int vl() {
        return R.style.ad4;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        throw null;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        View findViewById;
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS40S0100000_4(this, 19));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null && (findViewById = window2.findViewById(R.id.c8m)) != null) {
            findViewById.setBackgroundColor(0);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJI = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        if (context == null) {
            try {
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.buo, R.attr.bup, R.attr.buq, R.attr.bur, R.attr.bus, R.attr.but, R.attr.buu, R.attr.buv, R.attr.buw, R.attr.bux, R.attr.buy, R.attr.buz, R.attr.bv0, R.attr.bv1, R.attr.bv2, R.attr.bv3, R.attr.bv4, R.attr.bv5, R.attr.bv6, R.attr.bv7, R.attr.bv8}, R.attr.kx, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut…,\n            0\n        )");
        obtainStyledAttributes.getResourceId(10, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        int color = obtainStyledAttributes.getColor(15, 0);
        int color2 = obtainStyledAttributes.getColor(14, 0);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 20);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 7);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 19);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 2);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 6);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 12);
        String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 16);
        int integer = obtainStyledAttributes.getInteger(13, 0);
        int integer2 = obtainStyledAttributes.getInteger(17, 0);
        int integer3 = obtainStyledAttributes.getInteger(11, 0);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 4);
        C16880lQ.LLLZLZ(obtainStyledAttributes, 9);
        int color3 = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        this.LJLLI = color3;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cr, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.le6);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.top_background)");
        this.LJLLILLLL = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.agn);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.bar_nb)");
        this.LJLLJ = (C252709vu) findViewById2;
        o.LJIIIIZZ(LLLLIILL.findViewById(R.id.iaw), "rootView.findViewById(R.id.progress_pl)");
        View findViewById3 = LLLLIILL.findViewById(R.id.dn2);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.frame_layout_fl)");
        this.LJLLL = (FrameLayout) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.kfp);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.status_view_sv)");
        this.LJLLLL = (C73305Spp) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ilw);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.radius_layout)");
        ((C74291TDr) findViewById5).setRadius(0.0f);
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setBackgroundColor(color3);
            C73305Spp c73305Spp = this.LJLLLL;
            if (c73305Spp != null) {
                c73305Spp.setLayoutVariant(0);
                FrameLayout frameLayout = this.LJLLL;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(color3);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZIZ = C7MY.LIZIZ(48);
                    c2068389v.LIZJ = C7MY.LIZIZ(48);
                    c2068389v.LIZ = resourceId;
                    c2068389v.LIZLLL = Integer.valueOf(color);
                    Context context2 = getContext();
                    o.LJI(context2);
                    SY9 LIZ = c2068389v.LIZ(context2);
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZ = Integer.valueOf(color2);
                    c110614Vt.LIZJ = C61328O5c.LIZJ(72);
                    c110614Vt.LJII = C7MY.LIZIZ(72);
                    c110614Vt.LJI = C7MY.LIZIZ(72);
                    Context context3 = getContext();
                    o.LJI(context3);
                    C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context3));
                    new C73306Spq();
                    new AqS3S1102000_4(LLLZLZ, integer, integer3, this, 0);
                    new C73306Spq();
                    new C2068389v();
                    Integer.valueOf(color);
                    new AqS3S1102000_4(LLLZLZ2, integer2, integer3, this, 1);
                    new C73306Spq();
                    new C2068389v();
                    Integer.valueOf(color);
                    new AqS3S1102000_4(LLLZLZ, integer, integer3, this, 2);
                    throw null;
                }
                o.LJIJI("frameLayoutFL");
                throw null;
            }
            o.LJIJI("statusViewSV");
            throw null;
        }
        o.LJIJI("topBackground");
        throw null;
    }
}
