package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252969wK extends LinearLayout {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final TextView LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLJL;
        Integer valueOf = Integer.valueOf(R.id.ize);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.ize);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252969wK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = C62850Ola.LJFF(context, "context");
        this.LJLJJLL = true;
        int LJIILL = C17N.LJIILL(0.5d);
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.dt, context);
        this.LJLJJI = LJIIIIZZ;
        this.LJLJJL = AnonymousClass636.LJIIIIZZ(R.attr.e7, context);
        this.LJLJJLL = true;
        View.inflate(context, R.layout.zm, this);
        View findViewById = findViewById(R.id.izf);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.result_indicator_group_line)");
        this.LJLIL = findViewById;
        View findViewById2 = findViewById(R.id.izd);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.result_indicator_group_content)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = findViewById(R.id.izg);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.result_indicator_group_text)");
        this.LJLJI = (TextView) findViewById3;
        C27570Aru.LJII(LJIILL, findViewById);
        findViewById.setVisibility(0);
        findViewById.setBackgroundColor(LJIIIIZZ);
        findViewById2.setVisibility(8);
    }
}
