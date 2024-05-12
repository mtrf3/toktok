package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Buy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30308Buy extends FrameLayout {
    public DataChannel LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30308Buy(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30308Buy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final DataChannel getDataChannel() {
        return this.LJLIL;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    public final void setTipText(String text) {
        o.LJIIIZ(text, "text");
        TextView textView = (TextView) LIZ(R.id.mo3);
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30308Buy(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r4, r0)
            r3.LJLILLLLZI = r0
            r0 = 0
            r3.<init>(r4, r5, r0)
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r4)
            r1 = 2131564210(0x7f0d16b2, float:1.8753899E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r3, r0)
            r0 = 2131379778(0x7f0a4642, float:1.8379826E38)
            android.view.View r1 = r3.LIZ(r0)
            X.1t6 r1 = (X.C47121t6) r1
            if (r1 == 0) goto L2d
            r0 = 2131887191(0x7f120457, float:1.9408982E38)
            r1.LJJIJIL(r0)
        L2d:
            r0 = 2131363907(0x7f0a0843, float:1.8347636E38)
            android.view.View r2 = r3.LIZ(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L42
            Y.ACListenerS25S0100000_5 r1 = new Y.ACListenerS25S0100000_5
            r0 = 197(0xc5, float:2.76E-43)
            r1.<init>(r3, r0)
            X.C16880lQ.LJIIZILJ(r2, r1)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30308Buy.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
