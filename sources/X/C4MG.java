package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4MG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MG extends LinearLayout {
    public final int LJLIL;
    public final TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public int LJLJJI;

    public final void setCountDown(long j) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        int i = 0;
        int i2 = 1;
        if (this.LJLJI == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTuxFont(this.LJLIL);
            tuxTextView.setTextColorRes(R.attr.dm);
            tuxTextView.setMaxLines(1);
            this.LJLJI = tuxTextView;
            int LIZJ = C47959Irz.LIZJ(4, (int) tuxTextView.getPaint().measureText("23:59:59"));
            View view = this.LJLJI;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LIZJ, -1);
                layoutParams.setMarginStart(C79081V1x.LJII(4));
                addView(view, layoutParams);
            } else {
                o.LJIJI("countDownView");
                throw null;
            }
        }
        if (j <= 86400000 && j >= 0) {
            i2 = 2;
        }
        if (this.LJLJJI != i2) {
            this.LJLJJI = i2;
            TuxTextView tuxTextView2 = this.LJLJI;
            if (tuxTextView2 != null) {
                if (2 != i2) {
                    i = 8;
                }
                tuxTextView2.setVisibility(i);
            } else {
                o.LJIJI("countDownView");
                throw null;
            }
        }
        TuxTextView tuxTextView3 = this.LJLJI;
        if (tuxTextView3 != null) {
            long j2 = j / 1000;
            long j3 = 60;
            long j4 = j2 / j3;
            long j5 = j4 / j3;
            long j6 = j2 % j3;
            long j7 = j4 % j3;
            long j8 = j5 % 24;
            StringBuilder LIZ = X1D.LIZ();
            if (j8 < 10) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('0');
                LIZ2.append(j8);
                valueOf = X1D.LIZIZ(LIZ2);
            } else {
                valueOf = String.valueOf(j8);
            }
            LIZ.append(valueOf);
            LIZ.append(':');
            if (j7 < 10) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('0');
                LIZ3.append(j7);
                valueOf2 = X1D.LIZIZ(LIZ3);
            } else {
                valueOf2 = String.valueOf(j7);
            }
            LIZ.append(valueOf2);
            LIZ.append(':');
            if (j6 < 10) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append('0');
                LIZ4.append(j6);
                valueOf3 = X1D.LIZIZ(LIZ4);
            } else {
                valueOf3 = String.valueOf(j6);
            }
            LIZ.append(valueOf3);
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …)\n            .toString()");
            tuxTextView3.setText(LIZIZ);
            return;
        }
        o.LJIJI("countDownView");
        throw null;
    }

    public final void setFlashSaleInfo(String info) {
        o.LJIIIZ(info, "info");
        if (!o.LJ(info, this.LJLILLLLZI.getText())) {
            this.LJLILLLLZI.setText(info);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4MG(Context context, int i) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = i;
        setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(R.attr.dm);
        tuxTextView.setMaxLines(1);
        this.LJLILLLLZI = tuxTextView;
        addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
