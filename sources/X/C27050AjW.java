package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S0S1100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AjW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27050AjW extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27050AjW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getTitleText() {
        return ((AppCompatTextView) LIZ(R.id.title)).getText().toString();
    }

    public final void LIZIZ(boolean z) {
        int i;
        ImageView imageView = (ImageView) LIZ(R.id.exx);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setDescColor(int i) {
        ((TextView) LIZ(R.id.desc)).setTextColor(i);
    }

    public final void setDescFont(int i) {
        ((TuxTextView) LIZ(R.id.desc)).setTuxFont(i);
    }

    public final void setDescImage(String str) {
        ((ImageView) LIZ(R.id.c7o)).setVisibility(0);
        if (str == null) {
            str = " ";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = (SmartImageView) LIZ(R.id.c7o);
        C16880lQ.LLJJJ(LJIIIIZZ);
    }

    public final void setDescImageAlpha(float f) {
        if (LIZ(R.id.c7o).getAlpha() == f) {
            return;
        }
        LIZ(R.id.c7o).setAlpha(f);
    }

    public final void setDescText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.desc)).setText(text);
    }

    public final void setSubDescExtraText(String str) {
        View LIZ = LIZ(R.id.knc);
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        LIZ.setVisibility(i);
        ((TextView) LIZ(R.id.knc)).setText(str);
    }

    public final void setSubDescText(String text) {
        o.LJIIIZ(text, "text");
        LIZ(R.id.knb).setVisibility(0);
        ((TextView) LIZ(R.id.knb)).setText(text);
    }

    public final void setTitleColor(int i) {
        ((TextView) LIZ(R.id.title)).setTextColor(i);
    }

    public final void setTitleFont(int i) {
        ((TuxTextView) LIZ(R.id.title)).setTuxFont(i);
    }

    public final void setTitleText(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.title)).setText(text);
    }

    public final void LIZJ(C62562cu c62562cu, String str) {
        ((ImageView) LIZ(R.id.e_q)).setVisibility(0);
        W5F LJIIIZ = W5U.LJIIIZ(c62562cu);
        LJIIIZ.LJJIIJ = (SmartImageView) LIZ(R.id.e_q);
        C16880lQ.LLJJJ(LJIIIZ);
        View icon = LIZ(R.id.e_q);
        o.LJIIIIZZ(icon, "icon");
        C16880lQ.LJIIJ(new Au2S0S1100000_4(this, str, 0), icon);
    }

    public final void LIZLLL(int i, Integer num) {
        if (num == null) {
            ((ImageView) LIZ(R.id.lab)).setVisibility(8);
            return;
        }
        ((ImageView) LIZ(R.id.lab)).setVisibility(0);
        ((TuxIconView) LIZ(R.id.lab)).setIconRes(num.intValue());
        ((TuxIconView) LIZ(R.id.lab)).setTintColor(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27050AjW(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LJLIL = r0
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r4)
            r1 = 2131559670(0x7f0d04f6, float:1.874469E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27050AjW.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
