package Y;

import X.AYY;
import X.AbstractC030109x;
import X.C16880lQ;
import X.C57865MnN;
import X.M6W;
import X.MXH;
import X.SYL;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* loaded from: classes10.dex */
public class ARunnableS9S0301000_9 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS9S0301000_9 aRunnableS9S0301000_9) {
        switch (aRunnableS9S0301000_9.i3) {
            case 0:
                ((M6W) aRunnableS9S0301000_9.l1).LIZJ.jv0();
                return;
            default:
                Context context = (Context) aRunnableS9S0301000_9.l1;
                Intent intent = (Intent) aRunnableS9S0301000_9.l2;
                Bundle bundle = (Bundle) aRunnableS9S0301000_9.l0;
                context.getClass();
                C16880lQ.LJ(context, intent, bundle);
                return;
        }
    }

    public static final void run$1(ARunnableS9S0301000_9 aRunnableS9S0301000_9) {
        boolean LIZ;
        try {
            TextView textView = (TextView) aRunnableS9S0301000_9.l0;
            MXH.LIZ(textView, (SpannableStringBuilder) aRunnableS9S0301000_9.l1, (BaseNotice) aRunnableS9S0301000_9.l2, aRunnableS9S0301000_9.i3, textView.getWidth());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S0301000_9 aRunnableS9S0301000_9) {
        boolean LIZ;
        try {
            TextView textView = (TextView) aRunnableS9S0301000_9.l0;
            MXH.LIZIZ(textView, (SpannableStringBuilder) aRunnableS9S0301000_9.l1, (BaseNotice) aRunnableS9S0301000_9.l2, aRunnableS9S0301000_9.i3, textView.getWidth());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS9S0301000_9 aRunnableS9S0301000_9) {
        boolean LIZ;
        try {
            AYY.LIZ.getClass();
            AYY.LIZIZ("HLayoutController", "insert end!");
            if (aRunnableS9S0301000_9.i3 == 0) {
                ((C57865MnN) aRunnableS9S0301000_9.l0).LJJJJLL(false);
            }
            ((SYL) aRunnableS9S0301000_9.l1).setItemAnimator((AbstractC030109x) aRunnableS9S0301000_9.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0301000_9(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
