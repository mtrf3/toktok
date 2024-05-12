package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.B8k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28290B8k extends ConstraintLayout {
    public final View LJLIL;
    public final C47061t0 LJLILLLLZI;
    public final C47121t6 LJLJI;

    public final View getBgView() {
        return this.LJLIL;
    }

    public final C47061t0 getIcon() {
        return this.LJLILLLLZI;
    }

    public final C47121t6 getTitle() {
        return this.LJLJI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28290B8k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28290B8k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dgu, this, true);
        View findViewById = findViewById(R.id.aig);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.benefit_bg)");
        this.LJLIL = findViewById;
        View findViewById2 = findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.icon)");
        this.LJLILLLLZI = (C47061t0) findViewById2;
        View findViewById3 = findViewById(R.id.m0j);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_benefit_title)");
        this.LJLJI = (C47121t6) findViewById3;
    }
}
