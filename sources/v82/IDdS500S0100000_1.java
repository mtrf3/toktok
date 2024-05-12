package v82;

import X.AbstractC85293Wj;
import X.C018905p;
import X.C119414mP;
import X.C141335gf;
import X.C2068389v;
import X.C32151Nz;
import X.C3C4;
import X.C3C5;
import X.C4JW;
import X.KL2;
import X.O6R;
import X.XJL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class IDdS500S0100000_1 extends AbstractC85293Wj {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
    }

    public static final void onFailed$2(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
    }

    public static final void onFailed$3(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
    }

    public static final void onFailed$4(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, bitmap);
                return;
            case 1:
                LIZIZ$1(this, bitmap);
                return;
            case 2:
                LIZIZ$2(this, bitmap);
                return;
            case 3:
                LIZIZ$3(this, bitmap);
                return;
            case 4:
                LIZIZ$4(this, bitmap);
                return;
            case 5:
                LIZIZ$5(this, bitmap);
                return;
            case 6:
                LIZIZ$6(this, bitmap);
                return;
            default:
                super.LIZIZ(bitmap);
                return;
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                return;
            case 1:
                onFailed$1(this, th);
                return;
            case 2:
                onFailed$2(this, th);
                return;
            case 3:
                onFailed$3(this, th);
                return;
            case 4:
                onFailed$4(this, th);
                return;
            case 5:
                onFailed$5(this, th);
                return;
            case 6:
                onFailed$6(this, th);
                return;
            default:
                super.onFailed(th);
                return;
        }
    }

    public IDdS500S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        if (bitmap != null) {
            C4JW c4jw = (C4JW) iDdS500S0100000_1.l0;
            TextView textView = c4jw.LJLJL;
            Context context = c4jw.LJLLLL;
            String string = c4jw.LJLLL.extras.getString("comment_author_name", "");
            String string2 = ((C4JW) iDdS500S0100000_1.l0).LJLLL.extras.getString("comment_reply_user_name", "");
            String string3 = ((C4JW) iDdS500S0100000_1.l0).LJLLL.extras.getString("comment_text", "");
            int LIZJ = (int) KL2.LIZJ(((C4JW) iDdS500S0100000_1.l0).LJLLLL, 16.0f);
            int i = ((C4JW) iDdS500S0100000_1.l0).LJLLL.extras.getInt("comment_media_type", 0);
            CommentSharePackage.Companion.getClass();
            textView.setText(C119414mP.LIZ(context, string, string2, string3, bitmap, LIZJ, i));
        }
    }

    public static final void LIZIZ$1(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        if (!((XJL) iDdS500S0100000_1.l0).isActive()) {
            return;
        }
        if (bitmap == null) {
            XJL xjl = (XJL) iDdS500S0100000_1.l0;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("image download fail with null result"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            return;
        }
        XJL xjl2 = (XJL) iDdS500S0100000_1.l0;
        C3C5.m7constructorimpl(bitmap);
        xjl2.resumeWith(bitmap);
    }

    public static final void LIZIZ$2(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) iDdS500S0100000_1.l0).setBackground(null);
        ((TuxIconView) iDdS500S0100000_1.l0).setBackgroundDrawable(bitmapDrawable);
        C018905p c018905p = new C018905p(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        c018905p.bottomToBottom = R.id.byt;
        c018905p.endToEnd = R.id.byt;
        c018905p.topToTop = R.id.byt;
        c018905p.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        ((TuxIconView) iDdS500S0100000_1.l0).setLayoutParams(c018905p);
    }

    public static final void LIZIZ$3(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        ((View) iDdS500S0100000_1.l0).setBackground(new BitmapDrawable(bitmap));
        View view = (View) iDdS500S0100000_1.l0;
        C018905p c018905p = new C018905p(((View) iDdS500S0100000_1.l0).getWidth(), ((View) iDdS500S0100000_1.l0).getHeight());
        c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        view.setLayoutParams(c018905p);
    }

    public static final void LIZIZ$4(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        ((View) iDdS500S0100000_1.l0).setBackground(new BitmapDrawable(bitmap));
        View view = (View) iDdS500S0100000_1.l0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((View) iDdS500S0100000_1.l0).getWidth(), ((View) iDdS500S0100000_1.l0).getHeight());
        layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        view.setLayoutParams(layoutParams);
    }

    public static final void LIZIZ$5(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        ((TuxIconView) iDdS500S0100000_1.l0).setBackground(null);
        ((TuxIconView) iDdS500S0100000_1.l0).setBackgroundDrawable(bitmapDrawable);
    }

    public static final void LIZIZ$6(IDdS500S0100000_1 iDdS500S0100000_1, Bitmap bitmap) {
        if (!((XJL) iDdS500S0100000_1.l0).isActive()) {
            return;
        }
        if (bitmap == null) {
            XJL xjl = (XJL) iDdS500S0100000_1.l0;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("image download fail with null result"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            return;
        }
        XJL xjl2 = (XJL) iDdS500S0100000_1.l0;
        C3C5.m7constructorimpl(bitmap);
        xjl2.resumeWith(bitmap);
    }

    public static final void onFailed$1(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
        if (!((XJL) iDdS500S0100000_1.l0).isActive()) {
            return;
        }
        XJL xjl = (XJL) iDdS500S0100000_1.l0;
        if (th == null) {
            th = new RuntimeException("image download fail with unknown exception");
        }
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    public static final void onFailed$5(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
        ((TuxIconView) iDdS500S0100000_1.l0).setBackgroundResource(R.drawable.c91);
        TuxIconView tuxIconView = (TuxIconView) iDdS500S0100000_1.l0;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZ = R.raw.icon_effect_house;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView.setTuxIcon(c2068389v);
    }

    public static final void onFailed$6(IDdS500S0100000_1 iDdS500S0100000_1, Throwable th) {
        if (!((XJL) iDdS500S0100000_1.l0).isActive()) {
            return;
        }
        XJL xjl = (XJL) iDdS500S0100000_1.l0;
        if (th == null) {
            th = new RuntimeException("image download fail with unknown exception");
        }
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }
}
