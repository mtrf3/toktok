package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeUserCardRootAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mj7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57601Mj7 implements G27 {
    public final /* synthetic */ RecSwipeUserCardRootAssem LJLIL;

    public C57601Mj7(RecSwipeUserCardRootAssem recSwipeUserCardRootAssem) {
        this.LJLIL = recSwipeUserCardRootAssem;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        Integer num;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(newConfig, "newConfig");
        RecSwipeUserCardRootAssem recSwipeUserCardRootAssem = this.LJLIL;
        C57591Mix c57591Mix = (C57591Mix) recSwipeUserCardRootAssem.LLD.getValue();
        Context context = recSwipeUserCardRootAssem.getContext();
        c57591Mix.getClass();
        ViewGroup.LayoutParams layoutParams = null;
        if (context != null) {
            num = Integer.valueOf((C63081OpJ.LJJJJL(context) - c57591Mix.LIZ(context)) / 2);
        } else {
            num = null;
        }
        View adjustButtonForTablet$lambda$1 = recSwipeUserCardRootAssem._$_findCachedViewById(R.id.akk);
        o.LJIIIIZZ(adjustButtonForTablet$lambda$1, "adjustButtonForTablet$lambda$1");
        ViewGroup.LayoutParams layoutParams2 = adjustButtonForTablet$lambda$1.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i6 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        ViewGroup.LayoutParams layoutParams3 = adjustButtonForTablet$lambda$1.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i2 = 0;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        ViewGroup.LayoutParams layoutParams4 = adjustButtonForTablet$lambda$1.getLayoutParams();
        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams4 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        if (marginLayoutParams2 != null) {
            i3 = marginLayoutParams2.bottomMargin;
        } else {
            i3 = 0;
        }
        C26338AVi.LJI(adjustButtonForTablet$lambda$1, num, valueOf, valueOf2, Integer.valueOf(i3), false, 16);
        View adjustButtonForTablet$lambda$2 = recSwipeUserCardRootAssem._$_findCachedViewById(R.id.akj);
        o.LJIIIIZZ(adjustButtonForTablet$lambda$2, "adjustButtonForTablet$lambda$2");
        ViewGroup.LayoutParams layoutParams5 = adjustButtonForTablet$lambda$2.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            i4 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams5);
        } else {
            i4 = 0;
        }
        Integer valueOf3 = Integer.valueOf(i4);
        ViewGroup.LayoutParams layoutParams6 = adjustButtonForTablet$lambda$2.getLayoutParams();
        if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams6 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
        if (marginLayoutParams3 != null) {
            i5 = marginLayoutParams3.topMargin;
        } else {
            i5 = 0;
        }
        Integer valueOf4 = Integer.valueOf(i5);
        ViewGroup.LayoutParams layoutParams7 = adjustButtonForTablet$lambda$2.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = layoutParams7;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams4 != null) {
            i6 = marginLayoutParams4.bottomMargin;
        }
        C26338AVi.LJI(adjustButtonForTablet$lambda$2, valueOf3, valueOf4, num, Integer.valueOf(i6), false, 16);
    }
}
