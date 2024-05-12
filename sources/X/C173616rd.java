package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173616rd extends C173626re {
    public ClipDrawable LJLZ;

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
        ClipDrawable clipDrawable = this.LJLZ;
        if (clipDrawable != null) {
            o.LJI(clipDrawable);
            clipDrawable.setLevel((i * 10000) / getMax());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C173616rd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        boolean z;
        int i;
        int i2;
        int i3;
        a1.LJFF(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.ym, com.zhiliaoapp.musically.R.attr.z5, com.zhiliaoapp.musically.R.attr.a3n, com.zhiliaoapp.musically.R.attr.ab5, com.zhiliaoapp.musically.R.attr.ad8, com.zhiliaoapp.musically.R.attr.aew, com.zhiliaoapp.musically.R.attr.ai5, com.zhiliaoapp.musically.R.attr.ai6, com.zhiliaoapp.musically.R.attr.ai7, com.zhiliaoapp.musically.R.attr.ai8, com.zhiliaoapp.musically.R.attr.aib, com.zhiliaoapp.musically.R.attr.aic, com.zhiliaoapp.musically.R.attr.aid, com.zhiliaoapp.musically.R.attr.aie, com.zhiliaoapp.musically.R.attr.aif, com.zhiliaoapp.musically.R.attr.aig, com.zhiliaoapp.musically.R.attr.aih, com.zhiliaoapp.musically.R.attr.aii, com.zhiliaoapp.musically.R.attr.aiz, com.zhiliaoapp.musically.R.attr.aj0, com.zhiliaoapp.musically.R.attr.aj1, com.zhiliaoapp.musically.R.attr.ajb, com.zhiliaoapp.musically.R.attr.akq, com.zhiliaoapp.musically.R.attr.aol, com.zhiliaoapp.musically.R.attr.ay2, com.zhiliaoapp.musically.R.attr.b1l, com.zhiliaoapp.musically.R.attr.b25, com.zhiliaoapp.musically.R.attr.b36, com.zhiliaoapp.musically.R.attr.b3k, com.zhiliaoapp.musically.R.attr.b4p, com.zhiliaoapp.musically.R.attr.b4q, com.zhiliaoapp.musically.R.attr.b8z, com.zhiliaoapp.musically.R.attr.b_d, com.zhiliaoapp.musically.R.attr.b_p, com.zhiliaoapp.musically.R.attr.baf, com.zhiliaoapp.musically.R.attr.bag, com.zhiliaoapp.musically.R.attr.bff, com.zhiliaoapp.musically.R.attr.bi_, com.zhiliaoapp.musically.R.attr.bii, com.zhiliaoapp.musically.R.attr.bin, com.zhiliaoapp.musically.R.attr.biw, com.zhiliaoapp.musically.R.attr.bj3, com.zhiliaoapp.musically.R.attr.bjp, com.zhiliaoapp.musically.R.attr.bkc, com.zhiliaoapp.musically.R.attr.bvl, com.zhiliaoapp.musically.R.attr.bvx, com.zhiliaoapp.musically.R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            i = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            i3 = (int) obtainStyledAttributes.getDimension(41, 0.0f);
            i2 = (int) obtainStyledAttributes.getDimension(40, 0.0f);
            z = obtainStyledAttributes.getBoolean(37, false);
        } else {
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        int i4 = C78885Uxd.LIZIZ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i4);
        gradientDrawable.setStroke(0, i4);
        gradientDrawable.setSize(i3, i2);
        setThumb(gradientDrawable);
        setSplitTrack(true);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(com.zhiliaoapp.musically.R.attr.eb, context2);
        ClipDrawable clipDrawable = new ClipDrawable(C78127UlP.LIZJ(LJIIIIZZ, LJIIIIZZ, 0, i), 3, 1);
        this.LJLZ = clipDrawable;
        clipDrawable.setLevel((getProgress() * 10000) / getMax());
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "this.context");
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(com.zhiliaoapp.musically.R.attr.dn, context3);
        ClipDrawable clipDrawable2 = this.LJLZ;
        o.LJI(clipDrawable2);
        setProgressDrawable(new LayerDrawable(new Drawable[]{C78127UlP.LIZJ(LJIIIIZZ2, LJIIIIZZ2, 0, i), clipDrawable2}));
        if (z) {
            setTextColor((16777215 & i4) | LiveLayoutPreloadThreadPriority.DEFAULT);
        }
    }
}
