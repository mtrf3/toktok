package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Adn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26695Adn extends FrameLayout {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public boolean LJLJJI;

    public final TextView getPre() {
        return this.LJLIL;
    }

    public final TuxIconView getStar() {
        return this.LJLJI;
    }

    public final TextView getSuf() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26695Adn(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a6g, this, true);
        setBackgroundResource(R.drawable.afi);
        this.LJLIL = (TextView) findViewById(R.id.i0m);
        this.LJLILLLLZI = (TextView) findViewById(R.id.kse);
        this.LJLJI = (TuxIconView) findViewById(R.id.kbs);
    }

    public final void LIZ(boolean z) {
        this.LJLJJI = true;
        if (!z) {
            setBackgroundResource(R.drawable.afj);
        } else {
            setBackgroundResource(R.drawable.afv);
        }
        TextView textView = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        TextView textView2 = this.LJLILLLLZI;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
    }

    public final void LIZIZ(boolean z) {
        this.LJLJJI = false;
        if (!z) {
            setBackgroundResource(R.drawable.afi);
        } else {
            setBackgroundResource(R.drawable.afw);
        }
        TextView textView = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        TextView textView2 = this.LJLILLLLZI;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context2));
    }

    public final void setActive(boolean z) {
        this.LJLJJI = z;
    }
}
