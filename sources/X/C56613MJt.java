package X;

import Y.ACListenerS30S0100000_10;
import Y.IDCListenerS246S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MJt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56613MJt extends AbstractC56614MJu {
    public KUR LIZ;

    @Override // X.AbstractC56614MJu
    public void LIZIZ(int i) {
        KUR kur;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 || (kur = this.LIZ) == null) {
                        return;
                    }
                    kur.setStatus(2);
                    return;
                }
                KUR kur2 = this.LIZ;
                if (kur2 == null) {
                    return;
                }
                kur2.setStatus(1);
                return;
            }
            KUR kur3 = this.LIZ;
            if (kur3 == null) {
                return;
            }
            kur3.setStatus(0);
            return;
        }
        KUR kur4 = this.LIZ;
        if (kur4 == null) {
            return;
        }
        kur4.setStatus(-1);
    }

    @Override // X.AbstractC56614MJu
    public final KUR LIZ(ViewGroup parent, C61938OSo wrapper) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(wrapper, "wrapper");
        KUR kur = new KUR(parent.getContext(), null);
        kur.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) KL2.LIZJ(parent.getContext(), 60.0f)));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(parent.getContext()), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) LLLZIIL;
        textView.setGravity(17);
        View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(parent.getContext()), null);
        o.LJII(LLLZIIL2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) LLLZIIL2;
        textView2.setText(R.string.hve);
        C16880lQ.LJIJI(textView2, new ACListenerS30S0100000_10(wrapper, 222));
        textView2.setGravity(17);
        C8ID c8id = new C8ID(parent.getContext(), null);
        c8id.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c8id.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(kur, 12));
        KUY kuy = new KUY(parent.getContext());
        kuy.LIZIZ = c8id;
        c8id.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kuy.LIZIZ(textView);
        kuy.LIZJ(textView2);
        kur.setBuilder(kuy);
        this.LIZ = kur;
        return kur;
    }
}
