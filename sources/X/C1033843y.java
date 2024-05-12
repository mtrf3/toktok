package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.43y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1033843y extends ConstraintLayout {
    public final C119624mk LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final LinearLayout LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1033843y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033843y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.b32, C16880lQ.LLZIL(context), this).setLayoutParams(new C018905p(-1, -2));
        View findViewById = findViewById(R.id.i6u);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.profile_avatar)");
        this.LJLIL = (C119624mk) findViewById;
        View findViewById2 = findViewById(R.id.i9h);
        o.LJIIIIZZ(findViewById2, "this.findViewById(R.id.profile_nickname)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.i_0);
        o.LJIIIIZZ(findViewById3, "this.findViewById(R.id.profile_stats_container)");
        this.LJLJI = (LinearLayout) findViewById3;
    }
}
