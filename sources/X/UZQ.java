package X;

import Y.ACListenerS33S0100000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZQ extends UZN {
    public List<String> LJLZ;
    public List<String> LJZ;
    public final ValueAnimator LJZI;

    @Override // X.AbstractC77394UZa
    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // X.UZN, X.UZX
    public final void LIZ(UZR uzr) {
        super.LIZ(uzr);
        List<String> list = uzr.LJFF;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJLZ = list;
        List<String> list2 = uzr.LJI;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        this.LJZ = list2;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                W5U.LJIIIIZZ(it.next()).LJI();
            }
            List<String> list3 = this.LJZ;
            if (list3 != null) {
                Iterator<String> it2 = list3.iterator();
                while (it2.hasNext()) {
                    W5U.LJIIIIZZ(it2.next()).LJI();
                }
                return;
            }
            o.LJIJI("smallPngUrlList");
            throw null;
        }
        o.LJIJI("bigPngUrlList");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZQ(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, C77395UZb c77395UZb) {
        super(context, view, smartImageView, smartImageView2, view2, view3, c77395UZb);
        o.LJIIIZ(context, "context");
        View findViewById = view.findViewById(R.id.alf);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.id.big_twinkle_img)");
        View findViewById2 = view.findViewById(R.id.k5t);
        o.LJIIIIZZ(findViewById2, "content.findViewById(R.id.small_twinkle_img)");
        C16880lQ.LJJIJLIJ((SmartImageView) findViewById, new ACListenerS33S0100000_13(c77395UZb, 194));
        C16880lQ.LJJIJLIJ((SmartImageView) findViewById2, new ACListenerS33S0100000_13(c77395UZb, 195));
        ValueAnimator ofInt = ValueAnimator.ofInt(0);
        o.LJIIIIZZ(ofInt, "ofInt(0)");
        this.LJZI = ofInt;
    }
}
