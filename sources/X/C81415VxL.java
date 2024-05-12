package X;

import Y.ARunnableS33S0200000_14;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.VxL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81415VxL implements InterfaceC81422VxS {
    public final /* synthetic */ C81431Vxb LIZ;

    public C81415VxL(C81431Vxb c81431Vxb) {
        this.LIZ = c81431Vxb;
    }

    @Override // X.InterfaceC81422VxS
    public final void LIZ(Object obj, int i, int i2, boolean z, boolean z2) {
        C81366VwY c81366VwY;
        TextView textView;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LIZ.LJLJLLL;
        if (viewOnTouchListenerC81419VxP != null) {
            Object LIZLLL = viewOnTouchListenerC81419VxP.LIZLLL(i);
            o.LJI(LIZLLL);
            WS0 ws0 = new WS0(obj, LIZLLL, i2, z2, false, false, null, 112);
            ws0.LJII = z;
            this.LIZ.LJLILLLLZI.LJII(ws0);
            C119344mI c119344mI = this.LIZ.LJLL;
            if (c119344mI != null) {
                int childCount = c119344mI.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    C119344mI c119344mI2 = this.LIZ.LJLL;
                    if (c119344mI2 != null) {
                        View childAt = c119344mI2.getChildAt(i3);
                        if ((childAt instanceof C81366VwY) && (c81366VwY = (C81366VwY) childAt) != null && (textView = c81366VwY.getTextView()) != null) {
                            C81431Vxb c81431Vxb = this.LIZ;
                            if (i3 == i) {
                                textView.setShadowLayer(8.0f, 0.0f, 1.0f, ColorProtector.parseColor("#80000000"));
                                textView.post(new ARunnableS33S0200000_14(textView, c81431Vxb, 41));
                            } else {
                                textView.setShadowLayer(8.0f, 0.0f, 1.0f, ColorProtector.parseColor("#40000000"));
                            }
                        }
                    } else {
                        o.LJIJI("tabContainer");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("tabContainer");
            throw null;
        }
        o.LJIJI("tabHost");
        throw null;
    }
}
