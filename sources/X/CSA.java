package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSA extends ConstraintLayout {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final C31470CWs LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "ctx");
        o.LJII(ViewGroup.inflate(context, R.layout.d7h, this), "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = findViewById(R.id.b9x);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.chat_message_content)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.name)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.ag1);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.badge_view)");
        this.LJLJI = (C31470CWs) findViewById3;
    }
}
