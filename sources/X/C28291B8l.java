package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.B8l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28291B8l extends ConstraintLayout {
    public final C47061t0 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47121t6 LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28291B8l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public final C47061t0 getIcon() {
        return this.LJLIL;
    }

    public final C47121t6 getSubtitle() {
        return this.LJLJI;
    }

    public final C47121t6 getTitle() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28291B8l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dgx, this, true);
        View findViewById = findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.icon)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = findViewById(R.id.krt);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.subtitle)");
        this.LJLJI = (C47121t6) findViewById3;
    }

    public /* synthetic */ C28291B8l(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
