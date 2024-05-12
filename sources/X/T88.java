package X;

import Y.ACListenerS46S0200000_12;
import Y.ACListenerS46S1100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T88 extends T8F {
    public final T84 LJLILLLLZI;
    public T8C LJLJI;
    public final SmartImageView LJLJJI;

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        T8C t8c = (T8C) c74125T7h;
        C74143T7z c74143T7z = t8c.LJIIIIZZ;
        C71799SFv c71799SFv = (C71799SFv) this.LJLIL.findViewById(R.id.ik5);
        String str5 = null;
        if (c71799SFv != null) {
            T8C t8c2 = this.LJLJI;
            if (t8c2 != null) {
                str3 = t8c2.LJII;
            } else {
                str3 = null;
            }
            if (!o.LJ(str3, t8c.LJII) && (str4 = t8c.LJII) != null) {
                C71799SFv.LJIIJ(c71799SFv, str4, null, false, null, 126);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJLIL.findViewById(R.id.ik7);
        if (constraintLayout != null && (str2 = c74125T7h.LIZIZ) != null) {
            constraintLayout.setOnLongClickListener(new T8B(this, str2, c74143T7z, c74125T7h));
            C16880lQ.LJIL(constraintLayout, new ACListenerS46S1100000_12(this, str2, 7));
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.ik6);
        if (textView != null) {
            textView.setText(t8c.LJ);
        }
        TextView textView2 = (TextView) this.LJLIL.findViewById(R.id.ik_);
        if (textView2 != null) {
            textView2.setText(t8c.LJIIJ);
        }
        TextView textView3 = (TextView) this.LJLIL.findViewById(R.id.ik8);
        if (textView3 != null) {
            String str6 = t8c.LJFF;
            if (str6 != null) {
                str5 = QZP.LIZIZ("(?m)^[ \t]*\r?\n", str6, "");
            }
            textView3.setText(str5);
            int i2 = 3;
            if (C90193gN.LIZ()) {
                i = 4;
            } else {
                i = 3;
            }
            textView3.setTextDirection(i);
            if (C90193gN.LIZ()) {
                i2 = 5;
            }
            textView3.setGravity(i2);
        }
        C76S c76s = (C76S) this.LJLIL.findViewById(R.id.lk9);
        if (c76s != null) {
            if (c74143T7z.LIZIZ) {
                c76s.setVisibility(0);
                c76s.setLoading(true);
                c76s.setLoadingText(R.string.dm9);
            } else {
                c76s.setVisibility(8);
            }
        }
        TextView textView4 = (TextView) this.LJLIL.findViewById(R.id.ik9);
        if (textView4 != null) {
            textView4.setText(t8c.LJI);
        }
        SmartImageView smartImageView = this.LJLJJI;
        C71830SHa c71830SHa = t8c.LIZLLL;
        if (c71830SHa != null && (str = c71830SHa.LIZJ) != null) {
            o.LJIIIZ(smartImageView, "<this>");
            smartImageView.setImageURI(UriProtector.parse(str));
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS46S0200000_12(this, t8c, 31));
            smartImageView.setVisibility(0);
        } else {
            smartImageView.setVisibility(8);
        }
        this.LJLJI = t8c;
    }

    public T88(T84 t84, View view) {
        super(view);
        int i;
        this.LJLILLLLZI = t84;
        if (C99W.LIZ) {
            i = R.id.ikb;
        } else {
            i = R.id.ika;
        }
        View findViewById = view.findViewById(i);
        o.LJIIIIZZ(findViewById, "view.findViewById(if (Pr…n_tab_video_thumbnail_iv)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.LJLJJI = smartImageView;
        smartImageView.setVisibility(0);
    }
}
