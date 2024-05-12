package Y;

import X.ActivityC45651qj;
import X.C06530Nl;
import X.C110944Xa;
import X.C245319jz;
import X.C252669vq;
import X.C3WT;
import X.C3X8;
import X.C45804HyK;
import X.C47261Igj;
import X.C4XS;
import X.C4XW;
import X.C55888Lwa;
import X.C98523to;
import X.Q8U;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS10S1101000_1 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS10S1101000_1 aCListenerS10S1101000_1, View view) {
        C4XW c4xw = ((C4XS) aCListenerS10S1101000_1.l1).LJLILLLLZI;
        if (c4xw != null) {
            c4xw.LIZIZ(aCListenerS10S1101000_1.i2, aCListenerS10S1101000_1.s0);
        }
    }

    public static final void onClick$1(ACListenerS10S1101000_1 aCListenerS10S1101000_1, View view) {
        C4XW c4xw = ((C110944Xa) aCListenerS10S1101000_1.l1).LJLILLLLZI;
        if (c4xw != null) {
            c4xw.LIZIZ(aCListenerS10S1101000_1.i2, aCListenerS10S1101000_1.s0);
        }
    }

    public static final void onClick$2(ACListenerS10S1101000_1 aCListenerS10S1101000_1, View view) {
        FragmentManager supportFragmentManager;
        if (C55888Lwa.LIZIZ.LJJI(true)) {
            Context context = ((C3WT) aCListenerS10S1101000_1.l1).getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                C3WT c3wt = (C3WT) aCListenerS10S1101000_1.l1;
                String str = aCListenerS10S1101000_1.s0;
                int i = aCListenerS10S1101000_1.i2;
                C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.e_c);
                LIZIZ.LIZJ = 0;
                LIZIZ.LJ = new ACListenerS20S0101000_1(c3wt, i, 0);
                C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.e_d);
                LIZIZ2.LIZJ = 0;
                LIZIZ2.LJ = new ACListenerS20S0101000_1(c3wt, i, 1);
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(LIZIZ, LIZIZ2);
                C245319jz c245319jz = new C245319jz();
                String string = c3wt.getContext().getString(R.string.e_b);
                o.LJIIIIZZ(string, "context.getString(R.stri…hat_actionSheet_headline)");
                c245319jz.LIZ.LJLLILLLL = Q8U.LIZIZ(new Object[]{str}, 1, string, "format(format, *args)");
                c245319jz.LJFF(LJJIJIIJI);
                c245319jz.LIZLLL(R.string.e_e);
                c245319jz.LIZJ().show(supportFragmentManager, "StrangerChatRiskHint");
                return;
            }
            return;
        }
        C3WT c3wt2 = (C3WT) aCListenerS10S1101000_1.l1;
        C98523to c98523to = c3wt2.LJLJI;
        if (c98523to == null) {
            return;
        }
        c3wt2.LIZLLL(c98523to, aCListenerS10S1101000_1.i2, null);
    }

    public static final void onClick$3(ACListenerS10S1101000_1 aCListenerS10S1101000_1, View view) {
        ((C3X8) aCListenerS10S1101000_1.l1).LJLILLLLZI.invoke(Integer.valueOf(aCListenerS10S1101000_1.i2), aCListenerS10S1101000_1.s0);
    }

    public ACListenerS10S1101000_1(Object obj, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
