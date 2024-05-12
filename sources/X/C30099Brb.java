package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Brb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30099Brb extends GestureDetector {
    public final C30100Brc LIZ;

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent e) {
        InterfaceC88472Yns<MotionEvent, Boolean> interfaceC88472Yns;
        o.LJIIIZ(e, "e");
        if (e.getAction() == 1 && (interfaceC88472Yns = this.LIZ.LJLJLJ) != null && interfaceC88472Yns.invoke(e).booleanValue()) {
            return true;
        }
        return super.onTouchEvent(e);
    }

    public C30099Brb(Context context, C30100Brc c30100Brc) {
        super(context, c30100Brc);
        this.LIZ = c30100Brc;
    }
}
