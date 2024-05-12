package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.35o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783235o extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C783235o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setShippingInfo(String info) {
        o.LJIIIZ(info, "info");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.jxg));
        if (view == null) {
            view = findViewById(R.id.jxg);
            if (view != null) {
                linkedHashMap.put(Integer.valueOf(R.id.jxg), view);
            } else {
                view = null;
            }
        }
        ((TextView) view).setText(info);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C783235o(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r5, r0)
            r4.LJLIL = r0
            r3 = 0
            r4.<init>(r5, r6, r3)
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r5)
            r1 = 2131560229(0x7f0d0725, float:1.8745824E38)
            r0 = 1
            X.C16880lQ.LLLLIILL(r2, r1, r4, r0)
            r0 = 2130968594(0x7f040012, float:1.7545846E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r5)
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
            r4.setBackgroundColor(r0)
        L2c:
            r0 = 51
            r4.setGravity(r0)
            r4.setOrientation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C783235o.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
