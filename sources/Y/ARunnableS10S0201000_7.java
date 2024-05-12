package Y;

import X.C16880lQ;
import X.C45498HtO;
import X.C45507HtX;
import X.C45658Hvy;
import X.C45662Hw2;
import X.C85962XoU;
import X.GSR;
import X.HZV;
import X.InterfaceC85967XoZ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.widget.TextView;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import java.util.Locale;

/* loaded from: classes8.dex */
public class ARunnableS10S0201000_7 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS10S0201000_7 aRunnableS10S0201000_7) {
        C45658Hvy c45658Hvy = (C45658Hvy) aRunnableS10S0201000_7.l0;
        C45662Hw2 c45662Hw2 = (C45662Hw2) aRunnableS10S0201000_7.l1;
        int i = aRunnableS10S0201000_7.i2;
        c45658Hvy.getClass();
        c45662Hw2.LJLJJLL.setVisibility(4);
        c45662Hw2.LJLJJLL.setAlpha(1.0f);
        c45658Hvy.notifyItemChanged(i);
        c45658Hvy.LJLIL = false;
    }

    public static final void run$1(ARunnableS10S0201000_7 aRunnableS10S0201000_7) {
        switch (aRunnableS10S0201000_7.i2) {
            case 0:
                HZV.LIZ().LJIIIIZZ((Activity) aRunnableS10S0201000_7.l0, (Intent) aRunnableS10S0201000_7.l1);
                return;
            default:
                ((LiveStream) aRunnableS10S0201000_7.l0).lambda$updateSITIConfig$0((TEBundle) aRunnableS10S0201000_7.l1);
                return;
        }
    }

    public static final void run$2(ARunnableS10S0201000_7 aRunnableS10S0201000_7) {
        switch (aRunnableS10S0201000_7.i2) {
            case 0:
                HZV.LIZ().LJIIIIZZ((Activity) ((Context) aRunnableS10S0201000_7.l0), (Intent) aRunnableS10S0201000_7.l1);
                return;
            default:
                C85962XoU.LJII((Context) aRunnableS10S0201000_7.l0, false, (InterfaceC85967XoZ) aRunnableS10S0201000_7.l1, false);
                return;
        }
    }

    public static final void run$3(ARunnableS10S0201000_7 aRunnableS10S0201000_7) {
        String LLLZI;
        C45498HtO c45498HtO = (C45498HtO) aRunnableS10S0201000_7.l0;
        C45507HtX c45507HtX = (C45507HtX) aRunnableS10S0201000_7.l1;
        int i = aRunnableS10S0201000_7.i2;
        c45498HtO.getClass();
        TextView textView = c45507HtX.LJLJJLL;
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        textView.setText(LLLZI);
    }

    public static final void run$4(ARunnableS10S0201000_7 aRunnableS10S0201000_7) {
        GSR gsr = (GSR) aRunnableS10S0201000_7.l0;
        int i = aRunnableS10S0201000_7.i2;
        Editable editable = (Editable) aRunnableS10S0201000_7.l1;
        gsr.getClass();
        gsr.setSelection(Math.min(i, editable.length()));
    }

    public ARunnableS10S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
