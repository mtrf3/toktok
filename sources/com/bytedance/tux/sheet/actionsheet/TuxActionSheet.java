package com.bytedance.tux.sheet.actionsheet;

import X.ActivityC45651qj;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C252659vp;
import X.C252669vq;
import X.C252679vr;
import X.C26338AVi;
import X.C278817o;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C47261Igj;
import X.C74291TDr;
import X.C76800UCe;
import X.C78897Uxp;
import X.C90903hW;
import X.InterfaceC88472Yns;
import X.O6R;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS37S0100000_1;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.BaseSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TuxActionSheet extends BaseSheet {
    public CharSequence LJLLILLLL;
    public Integer LJLLJ;
    public String LJLLLL;
    public Integer LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final List<List<C252679vr<?>>> LJLLI = new ArrayList();
    public int LJLLL = -1;

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS37S0100000_1(this, 16));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public static CharSequence Al(Context context, CharSequence charSequence, Integer num) {
        if (charSequence != null) {
            return charSequence;
        }
        if (num != null) {
            String string = context.getResources().getString(num.intValue());
            o.LJIIIIZZ(string, "ctx.resources.getString(textRes)");
            return string;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29, types: [X.29S] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        float f;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        View view = null;
        if (context == null) {
            LLLLIILL = null;
        } else {
            Integer num = this.LJLJJLL;
            if (num != null) {
                context = new ContextThemeWrapper(context, num.intValue());
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6}, R.attr.kh, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut… R.attr.TuxSheetStyle, 0)");
            int i5 = obtainStyledAttributes.getInt(20, 0);
            int i6 = obtainStyledAttributes.getInt(19, 0);
            int color = obtainStyledAttributes.getColor(8, 0);
            int color2 = obtainStyledAttributes.getColor(7, 0);
            int color3 = obtainStyledAttributes.getColor(12, 0);
            int i7 = obtainStyledAttributes.getInt(15, 0);
            int color4 = obtainStyledAttributes.getColor(2, 0);
            int color5 = obtainStyledAttributes.getColor(0, 0);
            int i8 = obtainStyledAttributes.getInt(14, 0);
            int i9 = obtainStyledAttributes.getInt(13, 0);
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 4);
            int i10 = obtainStyledAttributes.getInt(18, 0);
            int color6 = obtainStyledAttributes.getColor(17, 0);
            int dimension = (int) obtainStyledAttributes.getDimension(21, C32151Nz.LJIIZILJ(12));
            int dimension2 = (int) obtainStyledAttributes.getDimension(16, C32151Nz.LJIIZILJ(16));
            float dimension3 = obtainStyledAttributes.getDimension(1, C32151Nz.LJIIZILJ(8));
            boolean z5 = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bo, viewGroup, false);
            C74291TDr c74291TDr = (C74291TDr) LLLLIILL.findViewById(R.id.ilw);
            float f2 = BaseSheet.LJLL;
            c74291TDr.LIZ(f2, f2, 0.0f, 0.0f);
            TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.oz);
            CharSequence Al = Al(context, this.LJLLILLLL, this.LJLLJ);
            tuxTextView.setText(Al);
            if (Al.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
            tuxTextView.setTuxFont(i5);
            tuxTextView.setTextColor(i6);
            C26338AVi.LJIIIZ(tuxTextView, null, Integer.valueOf(dimension), null, Integer.valueOf(dimension), 21);
            int i11 = this.LJLLL;
            if (i11 > 0) {
                tuxTextView.setMaxLines(i11);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            }
            ViewGroup groupContainer = (ViewGroup) LLLLIILL.findViewById(R.id.oy);
            int size = ((ArrayList) this.LJLLI).size();
            if (!z && !this.LJLZ) {
                o.LJIIIIZZ(groupContainer, "groupContainer");
                C26338AVi.LJIIIZ(groupContainer, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
            }
            if (z5) {
                o.LJIIIIZZ(groupContainer, "groupContainer");
                xl(groupContainer, C32151Nz.LJIIZILJ(Double.valueOf(0.5d)), color4, 0.0f);
            }
            Iterator it = ((ArrayList) this.LJLLI).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                i12 += ((List) it.next()).size();
            }
            Iterator it2 = ((ArrayList) this.LJLLI).iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    List list = (List) next;
                    int size2 = list.size();
                    int i15 = 0;
                    for (Object obj : list) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            C252679vr c252679vr = (C252679vr) obj;
                            if (c252679vr instanceof C252659vp) {
                                i3 = R.layout.bp;
                            } else {
                                i3 = R.layout.bq;
                            }
                            View actionView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i3, groupContainer, false);
                            o.LJIIIIZZ(actionView, "actionView");
                            C78897Uxp.LJJJJJL(actionView, 0.0f);
                            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c252679vr, this, 6), actionView);
                            C26338AVi.LJIIIZ(actionView, null, Integer.valueOf(dimension2), null, Integer.valueOf(dimension2), 21);
                            if (!c252679vr.LIZLLL) {
                                i4 = color;
                            } else if (c252679vr.LIZJ == 1) {
                                i4 = color2;
                            } else {
                                i4 = color3;
                            }
                            TuxTextView tuxTextView2 = (TuxTextView) actionView.findViewById(R.id.on);
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(Al(context, c252679vr.LIZ, c252679vr.LIZIZ));
                                tuxTextView2.setTextDirection(5);
                                tuxTextView2.setTuxFont(i7);
                                tuxTextView2.setTextColor(i4);
                            }
                            boolean z6 = c252679vr instanceof C252659vp;
                            if (z6) {
                                TuxIconView tuxIconView = (TuxIconView) actionView.findViewById(R.id.oo);
                                C252659vp c252659vp = (C252659vp) c252679vr;
                                Integer num2 = c252659vp.LJFF;
                                InterfaceC88472Yns<? super TuxIconView, C76800UCe> interfaceC88472Yns = c252659vp.LJI;
                                View view2 = c252659vp.LJII;
                                if (num2 != null) {
                                    tuxIconView.setIconRes(num2.intValue());
                                    tuxIconView.setTintColor(i4);
                                } else if (interfaceC88472Yns != null) {
                                    tuxIconView.LIZ();
                                    interfaceC88472Yns.invoke(tuxIconView);
                                }
                                if (view2 != null) {
                                    ViewGroup viewGroup2 = (ViewGroup) actionView.findViewById(R.id.caj);
                                    viewGroup2.removeAllViews();
                                    viewGroup2.addView(view2);
                                    viewGroup2.setVisibility(0);
                                }
                            } else if (c252679vr instanceof C252669vq) {
                                TuxTextView tuxTextView3 = (TuxTextView) actionView.findViewById(R.id.op);
                                C252669vq c252669vq = (C252669vq) c252679vr;
                                CharSequence Al2 = Al(context, c252669vq.LJFF, c252669vq.LJI);
                                if (Al2.length() > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    tuxTextView3.setVisibility(0);
                                    tuxTextView3.setText(Al2);
                                    tuxTextView3.setTuxFont(i10);
                                    tuxTextView3.setTextColor(color6);
                                } else {
                                    tuxTextView3.setVisibility(8);
                                }
                            }
                            groupContainer.addView(actionView);
                            if (i15 < size2 - 1) {
                                if (z6) {
                                    f = 16.0f;
                                } else {
                                    f = 0.0f;
                                }
                                xl(groupContainer, C32151Nz.LJIIZILJ(Double.valueOf(0.5d)), color4, f);
                            }
                            i15 = i16;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    if (i13 < size - 1) {
                        o.LJIIIIZZ(groupContainer, "groupContainer");
                        xl(groupContainer, dimension3, color5, 0.0f);
                    }
                    i13 = i14;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            view = null;
            view = null;
            if (this.LJZ) {
                if (i12 <= 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    o.LJIIIIZZ(groupContainer, "groupContainer");
                    xl(groupContainer, C32151Nz.LJIIZILJ(Double.valueOf(0.5d)), color4, 16.0f);
                }
                o.LJIIIIZZ(groupContainer, "groupContainer");
                if (z3) {
                    i2 = 52;
                } else {
                    i2 = 16;
                }
                C26338AVi.LJIIIZ(groupContainer, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2)))), 23);
            }
            if (this.LJLZ) {
                o.LJIIIIZZ(groupContainer, "groupContainer");
                xl(groupContainer, dimension3, color5, 0.0f);
                CharSequence Al3 = Al(context, this.LJLLLL, this.LJLLLLLL);
                if (Al3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Al3 = Al(context, LLLZLZ, Integer.valueOf(android.R.string.cancel));
                }
                View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bq, groupContainer, false);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.b_r});
                o.LJIIIIZZ(obtainStyledAttributes2, "theme.obtainStyledAttrib…electableItemBackground))");
                LLLLIILL2.setBackground(C04270Et.LIZIZ(context, obtainStyledAttributes2.getResourceId(0, 0)));
                C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 13), LLLLIILL2);
                C26338AVi.LJIIIZ(LLLLIILL2, null, Integer.valueOf(dimension2), null, Integer.valueOf(dimension2), 21);
                TuxTextView tuxTextView4 = (TuxTextView) LLLLIILL2.findViewById(R.id.on);
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(Al3);
                    tuxTextView4.setTuxFont(i8);
                    tuxTextView4.setTextColor(i9);
                }
                groupContainer.addView(LLLLIILL2);
            }
        }
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = view;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                ?? r5 = view;
                if (mo49getActivity instanceof C29S) {
                    r5 = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(r5);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public static void xl(ViewGroup viewGroup, float f, int i, float f2) {
        View frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) f);
        if (f2 > 0.0f) {
            marginLayoutParams.leftMargin = C278817o.LIZ(f2);
            marginLayoutParams.rightMargin = C278817o.LIZ(f2);
        }
        frameLayout.setBackgroundColor(i);
        viewGroup.addView(frameLayout, marginLayoutParams);
    }
}
