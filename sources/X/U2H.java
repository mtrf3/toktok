package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2H extends LinearLayout {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final U2J LJLIL;
    public final U2J LJLILLLLZI;
    public final U2J LJLJI;
    public final U2J LJLJJI;
    public final U2J LJLJJL;
    public final U2J LJLJJLL;
    public final C74049T4j LJLJL;
    public final C74049T4j LJLJLJ;
    public final boolean LJLJLLL;
    public final ArrayList<U2J> LJLL;
    public final ArrayList<C74049T4j> LJLLI;

    public final void setTextColor(int i) {
        Iterator<U2J> it = this.LJLL.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(i);
        }
        Iterator<C74049T4j> it2 = this.LJLLI.iterator();
        while (it2.hasNext()) {
            it2.next().setTextColor(i);
        }
    }

    public final void setTextSize(float f) {
        U2J u2j = this.LJLIL;
        if (u2j != null) {
            u2j.setTextSize(f);
        }
        U2J u2j2 = this.LJLILLLLZI;
        if (u2j2 != null) {
            u2j2.setTextSize(f);
        }
        C74049T4j c74049T4j = this.LJLJL;
        if (c74049T4j != null) {
            c74049T4j.setTextSize(f);
        }
        U2J u2j3 = this.LJLJI;
        if (u2j3 != null) {
            u2j3.setTextSize(f);
        }
        U2J u2j4 = this.LJLJJI;
        if (u2j4 != null) {
            u2j4.setTextSize(f);
        }
        C74049T4j c74049T4j2 = this.LJLJLJ;
        if (c74049T4j2 != null) {
            c74049T4j2.setTextSize(f);
        }
        U2J u2j5 = this.LJLJJL;
        if (u2j5 != null) {
            u2j5.setTextSize(f);
        }
        U2J u2j6 = this.LJLJJLL;
        if (u2j6 != null) {
            u2j6.setTextSize(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLL = new ArrayList<>();
        this.LJLLI = new ArrayList<>();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dew, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ain});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…TimeStickerCountdownView)");
            this.LJLJLLL = obtainStyledAttributes.getBoolean(0, this.LJLJLLL);
            obtainStyledAttributes.recycle();
        }
        View findViewById = findViewById(R.id.mnm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_time_hour_1)");
        U2J u2j = (U2J) findViewById;
        this.LJLIL = u2j;
        View findViewById2 = findViewById(R.id.mnn);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_time_hour_2)");
        U2J u2j2 = (U2J) findViewById2;
        this.LJLILLLLZI = u2j2;
        View findViewById3 = findViewById(R.id.mno);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_time_hour_end)");
        C74049T4j c74049T4j = (C74049T4j) findViewById3;
        this.LJLJL = c74049T4j;
        View findViewById4 = findViewById(R.id.mnq);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_time_minute_1)");
        U2J u2j3 = (U2J) findViewById4;
        this.LJLJI = u2j3;
        View findViewById5 = findViewById(R.id.mnr);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.tv_time_minute_2)");
        U2J u2j4 = (U2J) findViewById5;
        this.LJLJJI = u2j4;
        View findViewById6 = findViewById(R.id.mns);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.tv_time_minute_end)");
        C74049T4j c74049T4j2 = (C74049T4j) findViewById6;
        this.LJLJLJ = c74049T4j2;
        View findViewById7 = findViewById(R.id.mnt);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.tv_time_second_1)");
        U2J u2j5 = (U2J) findViewById7;
        this.LJLJJL = u2j5;
        View findViewById8 = findViewById(R.id.mnu);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.tv_time_second_2)");
        U2J u2j6 = (U2J) findViewById8;
        this.LJLJJLL = u2j6;
        if (!this.LJLJLLL) {
            C87277YNd.LJJIIZ(u2j);
            C87277YNd.LJJIIZ(u2j2);
            C87277YNd.LJJIIZ(c74049T4j);
        }
        setLayoutDirection(0);
        ArrayList<U2J> LJII = C47261Igj.LJII(u2j, u2j2, u2j3, u2j4, u2j5, u2j6);
        this.LJLL = LJII;
        this.LJLLI = C47261Igj.LJII(c74049T4j, c74049T4j2);
        c74049T4j.setText(":");
        c74049T4j2.setText(":");
        int LIZIZ = C259910h.LIZIZ(R.attr.bmp, context);
        int LIZIZ2 = C259910h.LIZIZ(R.attr.bmu, context);
        Iterator<U2J> it = LJII.iterator();
        while (it.hasNext()) {
            U2J next = it.next();
            next.LJLIL.LJJIJIL(R.style.a3v);
            next.LJLIL.setStrokeColor(LIZIZ);
            next.LJLIL.setTextColor(LIZIZ2);
            next.LJLILLLLZI.LJJIJIL(R.style.a3v);
            next.LJLILLLLZI.setStrokeColor(LIZIZ);
            next.LJLILLLLZI.setTextColor(LIZIZ2);
            next.LJLIL.setText(String.valueOf(next.LJLJJI));
            next.LJLILLLLZI.setText(String.valueOf(next.LJLJJI));
            next.LJLILLLLZI.setVisibility(8);
        }
        Iterator<C74049T4j> it2 = this.LJLLI.iterator();
        while (it2.hasNext()) {
            C74049T4j next2 = it2.next();
            next2.LJJIJIL(R.style.a3v);
            next2.setStrokeColor(LIZIZ);
            next2.setTextColor(LIZIZ2);
        }
    }
}
