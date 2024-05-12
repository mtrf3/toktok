package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AFz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25939AFz extends LinearLayout {
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25939AFz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        View.inflate(getContext(), R.layout.c45, this);
        View findViewById = findViewById(R.id.ftl);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.link_tv)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.fsz);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.link_chevron)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
    }

    public final void LIZ(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL.setText(str);
        C16880lQ.LJJJJI(this.LJLIL, new ACListenerS24S0100000_4(interfaceC65784Pro, 182));
        C16880lQ.LJJJ(this.LJLILLLLZI, new ACListenerS24S0100000_4(interfaceC65784Pro, 183));
    }
}
