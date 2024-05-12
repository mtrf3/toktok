package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CDa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30958CDa extends ConstraintLayout {
    public final C47121t6 LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final C47121t6 LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;

    public final LinearLayout getBadgeContainer() {
        return this.LJLILLLLZI;
    }

    public final View getBadgeDot() {
        return this.LJLJJL;
    }

    public final C47061t0 getBadgeIcon() {
        return this.LJLJI;
    }

    public final View getBadgeLine() {
        return this.LJLJJLL;
    }

    public final C47121t6 getBadgeStr() {
        return this.LJLJJI;
    }

    public final C47121t6 getDes() {
        return this.LJLIL;
    }

    public C30958CDa(Context context) {
        this(context, null);
    }

    public final void setItemScale(float f) {
        this.LJLIL.setPivotX(0.0f);
        this.LJLIL.setScaleX(f);
        this.LJLIL.setPivotY(r1.getMeasuredHeight());
        this.LJLIL.setScaleY(f);
        float f2 = 1;
        float f3 = f2 - (((f2 - f) * 0.39999998f) / 0.27999997f);
        this.LJLIL.setAlpha(f3);
        this.LJLILLLLZI.setPivotX(0.0f);
        this.LJLILLLLZI.setScaleX(f);
        this.LJLILLLLZI.setPivotY(0.0f);
        this.LJLILLLLZI.setScaleY(f);
        this.LJLILLLLZI.setAlpha(f3);
        this.LJLJJL.setScaleX(f);
        this.LJLJJL.setScaleY(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30958CDa(Context context, Object obj) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dgs, this, true);
        View findViewById = findViewById(R.id.afp);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.badge_des)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.afo);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.badge_container)");
        this.LJLILLLLZI = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.afs);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.badge_icon)");
        this.LJLJI = (C47061t0) findViewById3;
        View findViewById4 = findViewById(R.id.afz);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.badge_str)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = findViewById(R.id.afq);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.badge_dot)");
        this.LJLJJL = findViewById5;
        View findViewById6 = findViewById(R.id.afv);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.badge_line)");
        this.LJLJJLL = findViewById6;
    }
}
