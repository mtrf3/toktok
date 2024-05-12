package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199657sX {
    public final Context LIZ;
    public final InterfaceC199707sc LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final ImageView LJ;
    public final ImageView LJFF;
    public final AVS LJI;
    public final C208248Fg LJII;
    public final ImageView LJIIIIZZ;
    public C199667sY LJIIIZ;

    public C199657sX(Context context) {
        this.LIZ = context;
        M3W.LIZ.getClass();
        this.LIZIZ = M3W.LIZ().LIZIZ();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bwd, new FrameLayout(context), false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …meLayout(context), false)");
        this.LIZJ = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.caz);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.discovery_avatar_bg)");
        this.LIZLLL = (ImageView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.cay);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.discovery_avatar)");
        this.LJ = (ImageView) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.cbd);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.discovery_triangle)");
        this.LJFF = (ImageView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.cb0);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.discovery_cluster_num)");
        this.LJI = (AVS) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.cbb);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.discovery_title)");
        this.LJII = (C208248Fg) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.cb_);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.discovery_shadow)");
        this.LJIIIIZZ = (ImageView) findViewById6;
        this.LJIIIZ = new C199667sY(0);
    }

    public final C199667sY LIZ(C191707fi showMarker, int i) {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(showMarker, "showMarker");
        this.LJIIIZ = new C199667sY(0);
        if (AnonymousClass636.LJIILJJIL(this.LIZ)) {
            C208248Fg c208248Fg = this.LJII;
            c208248Fg.LJLZ = false;
            Context context = c208248Fg.getContext();
            o.LJIIIIZZ(context, "this.context");
            Integer LJI = C79045V0n.LJI(R.attr.gu, context);
            if (LJI != null) {
                this.LJII.setTextColor(LJI.intValue());
            }
        } else {
            C208248Fg c208248Fg2 = this.LJII;
            c208248Fg2.LJLZ = true;
            Context context2 = c208248Fg2.getContext();
            o.LJIIIIZZ(context2, "this.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.go, context2);
            if (LJI2 != null) {
                this.LJII.setTextColor(LJI2.intValue());
            }
        }
        this.LJII.invalidate();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (showMarker.LIZLLL) {
            this.LJFF.setVisibility(0);
            C26338AVi.LJI(this.LJII, 0, AnonymousClass391.LIZJ(8), 0, 0, false, 16);
            this.LJII.setStrokeWidth$nearby_release(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
            this.LJI.setVisibility(8);
            ImageView imageView = this.LJ;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i4 = C199687sa.LIZ;
            int i5 = i4 - (C199687sa.LIZLLL * 2);
            layoutParams.height = i5;
            layoutParams.width = i5;
            imageView.setLayoutParams(layoutParams);
            ImageView imageView2 = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.height = i4;
            layoutParams2.width = i4;
            imageView2.setLayoutParams(layoutParams2);
            ImageView imageView3 = this.LJIIIIZZ;
            ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            int i6 = C199687sa.LJ;
            int i7 = i4 + i6;
            layoutParams3.height = i7;
            layoutParams3.width = i7;
            imageView3.setLayoutParams(layoutParams3);
            ImageView imageView4 = this.LJFF;
            ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
            if ((layoutParams4 instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.topMargin = ((i6 / 2) + i4) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
                marginLayoutParams2 = marginLayoutParams;
            }
            imageView4.setLayoutParams(marginLayoutParams2);
        } else {
            this.LJFF.setVisibility(8);
            C26338AVi.LJI(this.LJII, 0, AnonymousClass391.LIZJ(4), 0, 0, false, 16);
            this.LJII.setStrokeWidth$nearby_release(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() > 1) {
                int intValue = valueOf.intValue();
                this.LJI.setVisibility(0);
                this.LJI.setCount(intValue);
                valueOf.intValue();
            } else {
                this.LJI.setVisibility(8);
            }
            ImageView imageView5 = this.LJ;
            ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
            int i8 = C199687sa.LIZIZ;
            int i9 = i8 - (C199687sa.LIZJ * 2);
            layoutParams5.height = i9;
            layoutParams5.width = i9;
            imageView5.setLayoutParams(layoutParams5);
            ImageView imageView6 = this.LIZLLL;
            ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
            layoutParams6.height = i8;
            layoutParams6.width = i8;
            imageView6.setLayoutParams(layoutParams6);
            ImageView imageView7 = this.LJIIIIZZ;
            ViewGroup.LayoutParams layoutParams7 = imageView7.getLayoutParams();
            int i10 = i8 + C199687sa.LJ;
            layoutParams7.height = i10;
            layoutParams7.width = i10;
            imageView7.setLayoutParams(layoutParams7);
        }
        Bitmap bitmap = showMarker.LIZIZ;
        if (bitmap == null) {
            if (showMarker.LIZLLL) {
                i3 = C199687sa.LIZ;
            } else {
                i3 = C199687sa.LIZIZ;
            }
            bitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(R.attr.ck);
            C199667sY c199667sY = this.LJIIIZ;
            Bitmap bitmap2 = c199667sY.LIZIZ;
            c199667sY.getClass();
            this.LJIIIZ = new C199667sY(bitmap2, true);
        }
        ImageView imageView8 = this.LJ;
        Resources resources = this.LIZ.getResources();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            i2 = height;
        } else {
            i2 = width;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (width - i2) / 2, (height - i2) / 2, i2, i2);
        o.LJIIIIZZ(createBitmap, "createBitmap(\n          …    finalWidth,\n        )");
        C1M5 c1m5 = new C1M5(resources, createBitmap);
        c1m5.LIZIZ();
        imageView8.setImageDrawable(c1m5);
        String str = showMarker.LIZJ;
        if (TextUtils.isEmpty(str)) {
            this.LJII.setVisibility(8);
        } else {
            this.LJII.setText(str);
        }
        C199667sY c199667sY2 = this.LJIIIZ;
        Bitmap LIZ = this.LIZIZ.LIZ(this.LIZJ);
        boolean z = c199667sY2.LIZ;
        c199667sY2.getClass();
        return new C199667sY(LIZ, z);
    }
}
