package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Csz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32733Csz extends LinearLayout {
    public final C2A7 LJLIL;

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C16880lQ.LJJIII(this.LJLIL, new ACListenerS25S0100000_5(interfaceC65784Pro, 158));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32733Csz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        LinearLayout.inflate(context, R.layout.d5w, this);
        View findViewById = findViewById(R.id.h28);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.no_network_try_again)");
        this.LJLIL = (C2A7) findViewById;
    }
}
