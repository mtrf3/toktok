package com.ss.android.ugc.aweme.detail.prefab;

import X.AnonymousClass391;
import X.C26338AVi;
import X.C7MY;
import X.C8VL;
import X.C8VV;
import X.O6R;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.detail.prefab.HeaderBtnsAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class HeaderBtnsAssem extends DynamicAssem {
    public LinearLayout LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public HeaderBtnsAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, C8VL>> it = getConfig().LJIIIZ.entrySet().iterator();
        while (it.hasNext()) {
            C8VL value = it.next().getValue();
            value.LJI = R.id.c90;
            arrayList.add(value);
        }
        C8VV.LIZJ(this, new AqS134S0200000_3(this, (HeaderBtnsAssem) arrayList, (List<C8VL>) 36));
    }

    public final LinearLayout L3() {
        LinearLayout linearLayout = this.LJLJLLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("btnContainer");
        throw null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setScrollBarSize(0);
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C7MY.LIZIZ(8);
        marginLayoutParams.bottomMargin = C7MY.LIZIZ(8);
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setOrientation(0);
        this.LJLJLLL = linearLayout;
        horizontalScrollView.addView(L3());
        E3(horizontalScrollView);
        super.onCreateView();
        L3().setId(R.id.c90);
    }

    public static void M3(LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams;
        float f;
        DisplayMetrics displayMetrics;
        float f2;
        DisplayMetrics displayMetrics2;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = null;
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                if (i == 0) {
                    f = 16;
                    displayMetrics = Resources.getSystem().getDisplayMetrics();
                } else {
                    f = 4;
                    displayMetrics = Resources.getSystem().getDisplayMetrics();
                }
                layoutParams.setMarginStart(O6R.LJJIIZ(TypedValue.applyDimension(1, f, displayMetrics)));
                if (i == linearLayout.getChildCount() - 1) {
                    f2 = 16;
                    displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                } else {
                    f2 = 4;
                    displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                }
                layoutParams.setMarginEnd(O6R.LJJIIZ(TypedValue.applyDimension(1, f2, displayMetrics2)));
                if (linearLayout.getChildCount() <= 2) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    childAt.measure(0, 0);
                    layoutParams.width = childAt.getMeasuredWidth();
                    layoutParams.weight = 0.0f;
                }
                layoutParams3 = layoutParams;
            }
            childAt.setLayoutParams(layoutParams3);
        }
        if (linearLayout.getChildCount() > 0) {
            C26338AVi.LJI(linearLayout, 0, AnonymousClass391.LIZJ(8), 0, AnonymousClass391.LIZJ(8), false, 16);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        L3().setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.7TS
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view2, View view3) {
                int i;
                View x3 = HeaderBtnsAssem.this.x3();
                if (HeaderBtnsAssem.this.L3().getChildCount() > 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                x3.setVisibility(i);
                HeaderBtnsAssem.this.L3().post(new ARunnableS39S0100000_3(HeaderBtnsAssem.this, 36));
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view2, View view3) {
                int i;
                View x3 = HeaderBtnsAssem.this.x3();
                if (HeaderBtnsAssem.this.L3().getChildCount() > 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                x3.setVisibility(i);
                HeaderBtnsAssem.this.L3().post(new ARunnableS39S0100000_3(HeaderBtnsAssem.this, 37));
            }
        });
    }
}
