package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LL8 {
    public static final /* synthetic */ int LIZ = 0;

    public static TuxIconView LIZ(Context context) {
        o.LJIIIZ(context, "context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZ = R.raw.icon_inbox;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C7FC.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c2068389v);
        tuxIconView.setClickable(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
        layoutParams.gravity = 17;
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }

    public static ImageView LIZIZ(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        boolean LIZ2 = C52237Ken.LIZ();
        int LJIILL = C17N.LJIILL(10.0d);
        if (LIZ2) {
            i = C17N.LJIILL(16.0d);
            LJIILL = C17N.LJIILL(16.0d);
        } else {
            i = 0;
        }
        imageView.setPadding(i, LJIILL, i, LJIILL);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(24);
        c2068389v.LIZJ = C7MY.LIZIZ(24);
        c2068389v.LIZ = R.raw.icon_live;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = true;
        imageView.setImageDrawable(c2068389v.LIZ(context));
        imageView.setVisibility(8);
        return imageView;
    }

    public static C119624mk LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C17N.LJIILL(28.0d), C17N.LJIILL(28.0d));
        C119624mk c119624mk = new C119624mk(context);
        c119624mk.setLayoutParams(layoutParams);
        c119624mk.LJLLL = true;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && !((RBX) LJIILL).isLogin()) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_default_avatar;
            c119624mk.setImageDrawable(c2068389v.LIZ(context));
            return c119624mk;
        }
        HG3.LJIIL();
        C78765Uvh.LJIIIZ(c119624mk, HG3.LJLJL.LJFF().getAvatarUrl(), -1, -1);
        return c119624mk;
    }

    public static View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        int LJIILL = C17N.LJIILL(12.0d);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(LJIILL, LJIILL, LJIILL, LJIILL);
        imageView.setImageResource(R.drawable.b58);
        double d = 44;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(C17N.LJIILL(d), C17N.LJIILL(d)));
        return imageView;
    }

    public static TuxIconView LJFF(Context context) {
        int LJIILL;
        o.LJIIIZ(context, "context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZ = R.raw.icon_magnifying_glass_offset;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C7FC.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c2068389v);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (SearchServiceImpl.LLLZI().LLLJL()) {
            LJIILL = C17N.LJIILL(56.0d);
        } else {
            LJIILL = C17N.LJIILL(44.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJIILL, LJIILL);
        layoutParams.setMargins(0, 0, 0, 0);
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }

    public static C51588KMm LJI(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        C51588KMm c51588KMm = new C51588KMm(context);
        c51588KMm.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (LNZ.LIZIZ.getMainTabTextSizeHelper().LIZ()) {
            i = 56;
        } else {
            i = 40;
        }
        double d = i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C17N.LJIILL(d), C17N.LJIILL(d));
        double d2 = 8;
        layoutParams.setMargins(0, 0, C17N.LJIILL(d2), 0);
        layoutParams.setMarginEnd(C17N.LJIILL(d2));
        c51588KMm.setLayoutParams(layoutParams);
        return c51588KMm;
    }

    public static OSJ LJ(int i, Context context) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZ = R.raw.icon_magnifying_glass;
        Integer valueOf = Integer.valueOf(R.attr.dk);
        c2068389v.LJ = valueOf;
        SY9 LIZ2 = c2068389v.LIZ(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(LIZ2, (Drawable) null, (Drawable) null, (Drawable) null);
        tuxTextView.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextColorRes(R.attr.dk);
        tuxTextView.setText(C42124Gg4.LIZ(context));
        tuxTextView.setTuxFont(62);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), 0);
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
        layoutParams2.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0);
        frameLayout.setLayoutParams(layoutParams2);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(32));
        if (SearchServiceImpl.LLLZI().LLLIIIL()) {
            c110614Vt.LJFF = valueOf;
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        } else {
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        }
        frameLayout.setBackground(c110614Vt.LIZ(context));
        frameLayout.addView(tuxTextView);
        return new OSJ(frameLayout, tuxTextView, Integer.valueOf((i - O6R.LJJIIZ(C32151Nz.LJIIZILJ(38))) - 10));
    }
}
