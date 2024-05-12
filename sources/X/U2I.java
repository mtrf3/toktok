package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2I extends LinearLayout {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final U2K LJLIL;
    public final U2K LJLILLLLZI;
    public final U2K LJLJI;
    public final U2K LJLJJI;
    public final U2K LJLJJL;
    public final U2K LJLJJLL;
    public final ArrayList<U2K> LJLJL;
    public final ArrayList<C74050T4k> LJLJLJ;

    public final void setTextColor(int i) {
        Iterator<U2K> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(i);
        }
        Iterator<C74050T4k> it2 = this.LJLJLJ.iterator();
        while (it2.hasNext()) {
            it2.next().setTextColor(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U2I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = new ArrayList<>();
        this.LJLJLJ = new ArrayList<>();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.diz, this, true);
        View findViewById = findViewById(R.id.mnm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_time_hour_1)");
        U2K u2k = (U2K) findViewById;
        this.LJLIL = u2k;
        View findViewById2 = findViewById(R.id.mnn);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_time_hour_2)");
        U2K u2k2 = (U2K) findViewById2;
        this.LJLILLLLZI = u2k2;
        View findViewById3 = findViewById(R.id.mno);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_time_hour_end)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.mnq);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_time_minute_1)");
        U2K u2k3 = (U2K) findViewById4;
        this.LJLJI = u2k3;
        View findViewById5 = findViewById(R.id.mnr);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.tv_time_minute_2)");
        U2K u2k4 = (U2K) findViewById5;
        this.LJLJJI = u2k4;
        View findViewById6 = findViewById(R.id.mns);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.tv_time_minute_end)");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.mnt);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.tv_time_second_1)");
        U2K u2k5 = (U2K) findViewById7;
        this.LJLJJL = u2k5;
        View findViewById8 = findViewById(R.id.mnu);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.tv_time_second_2)");
        U2K u2k6 = (U2K) findViewById8;
        this.LJLJJLL = u2k6;
        setLayoutDirection(0);
        ArrayList<U2K> LJII = C47261Igj.LJII(u2k, u2k2, u2k3, u2k4, u2k5, u2k6);
        this.LJLJL = LJII;
        this.LJLJLJ = C47261Igj.LJII(textView, textView2);
        textView.setText(":");
        textView2.setText(":");
        int LIZIZ = C259910h.LIZIZ(R.attr.bmp, context);
        int LIZIZ2 = C259910h.LIZIZ(R.attr.bmu, context);
        int LIZ = (int) B9K.LIZ(context, 4.0f);
        Iterator<U2K> it = LJII.iterator();
        while (it.hasNext()) {
            U2K next = it.next();
            next.LJLJI.LJJIJIL(R.style.a3v);
            next.LJLJI.setStrokeColor(LIZIZ);
            next.LJLJI.setTextColor(LIZIZ2);
            next.LJLJI.setStrokeWidth(LIZ);
            next.LJLJJI.LJJIJIL(R.style.a3v);
            next.LJLJJI.setStrokeColor(LIZIZ);
            next.LJLJJI.setTextColor(LIZIZ2);
            next.LJLJJI.setStrokeWidth(LIZ);
            next.LJLJI.setText(String.valueOf(next.LJLJJLL));
            next.LJLJJI.setText(String.valueOf(next.LJLJJLL));
            next.LJLJJI.setVisibility(8);
        }
        Iterator<C74050T4k> it2 = this.LJLJLJ.iterator();
        while (it2.hasNext()) {
            C74050T4k next2 = it2.next();
            next2.LJJIJIL(R.style.a3v);
            next2.setStrokeColor(LIZIZ);
            next2.setTextColor(LIZIZ2);
            next2.setStrokeWidth(LIZ);
        }
    }

    public final void LIZ(long j, boolean z) {
        long j2 = 60;
        long j3 = j / j2;
        long j4 = (j3 / j2) % 24;
        long j5 = j3 % j2;
        long j6 = j % j2;
        long j7 = 10;
        this.LJLIL.LIZ((int) (j4 / j7), z);
        this.LJLILLLLZI.LIZ((int) (j4 % j7), z);
        this.LJLJI.LIZ((int) (j5 / j7), z);
        this.LJLJJI.LIZ((int) (j5 % j7), z);
        this.LJLJJL.LIZ((int) (j6 / j7), z);
        this.LJLJJLL.LIZ((int) (j6 % j7), z);
    }
}
