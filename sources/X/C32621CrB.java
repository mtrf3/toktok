package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CrB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32621CrB extends LinearLayout {
    public final C47061t0 LJLIL;
    public final C47121t6 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32621CrB(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        LinearLayout.inflate(context, R.layout.d5p, this);
        View findViewById = findViewById(R.id.dsg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.gift_bubble_hint_icon)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = findViewById(R.id.dsh);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.gift_bubble_hint_text)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
    }

    public final void setText(CharSequence charSequence) {
        this.LJLILLLLZI.setText(charSequence);
    }
}
