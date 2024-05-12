package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5S1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5S1 {
    public static long LIZLLL;
    public static String LJ;
    public final Context LIZ;
    public final C26045AKb LIZIZ;
    public String LIZJ;

    public final void LJFF() {
        int i;
        Context context = this.LIZ;
        if (context == null || C84763XOl.LJIIJJI) {
            return;
        }
        C25600zU c25600zU = new C25600zU(context, R.style.ul);
        Toast toast = new Toast(c25600zU);
        toast.setDuration(0);
        toast.setGravity(55, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        Object LLILL = C16880lQ.LLILL(context, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dqv, (LayoutInflater) LLILL, null);
        View findViewById = LLLZIIL.findViewById(R.id.j5n);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.gy);
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        c110614Vt.LJII = C7MY.LIZIZ(36);
        c110614Vt.LJI = C7MY.LIZIZ(18);
        findViewById.setBackgroundDrawable(c110614Vt.LIZ(c25600zU));
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.m2v);
        textView.setText(this.LIZJ);
        Integer LJI = C79045V0n.LJI(R.attr.dj, c25600zU);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        textView.setTextColor(i);
        toast.setView(LLLZIIL);
        C16880lQ.LLZILL(toast);
    }

    public final void LJ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LIZLLL > 2000 || !TextUtils.equals(LJ, this.LIZJ)) {
            LJ = this.LIZJ;
            LIZLLL = currentTimeMillis;
            String str = this.LIZJ;
            if (str == null || str.length() == 0) {
                return;
            }
            C26045AKb c26045AKb = this.LIZIZ;
            if (c26045AKb != null) {
                c26045AKb.LJIIJ();
            } else {
                try {
                    LJFF();
                } catch (Exception unused) {
                }
            }
        }
    }

    public C5S1(Context context) {
        Activity LJIJJ;
        this.LIZ = context;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            this.LIZIZ = c26045AKb;
            c26045AKb.LJ(R.style.ul);
            c26045AKb.LIZLLL(2000L);
        }
    }

    public final void LIZ(int i) {
        C26045AKb c26045AKb = this.LIZIZ;
        if (c26045AKb != null) {
            c26045AKb.LJFF(i);
        }
    }

    public final void LIZIZ(int i) {
        C26045AKb c26045AKb = this.LIZIZ;
        if (c26045AKb != null) {
            c26045AKb.LJII(i);
        }
    }

    public final void LIZJ(int i) {
        String str;
        Resources resources;
        C26045AKb c26045AKb = this.LIZIZ;
        if (c26045AKb != null) {
            c26045AKb.LJIIIIZZ(i);
        }
        Context context = this.LIZ;
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getString(i);
        } else {
            str = null;
        }
        this.LIZJ = str;
    }

    public final void LIZLLL(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        C26045AKb c26045AKb = this.LIZIZ;
        if (c26045AKb != null) {
            c26045AKb.LJIIIZ(charSequence);
        }
        this.LIZJ = charSequence.toString();
    }
}
