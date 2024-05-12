package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GRc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41516GRc implements GQ2<C41512GQy> {
    public final boolean LIZ;

    public C41516GRc(boolean z) {
        this.LIZ = z;
    }

    @Override // X.GQ2
    public final Spannable LIZ(GRT renderContext, C41512GQy c41512GQy) {
        C208198Fb c208198Fb;
        C41512GQy block = c41512GQy;
        o.LJIIIZ(renderContext, "renderContext");
        o.LJIIIZ(block, "block");
        String LJIILL = block.LJIILL();
        GRQ LIZIZ = renderContext.LIZIZ();
        Spannable LIZIZ2 = GRQ.LIZIZ(LJIILL);
        int length = LIZIZ2.length();
        LIZIZ2.setSpan(LIZIZ.LIZ(renderContext.LIZLLL(), block), 0, length, 33);
        int i = GRC.LIZ[block.LJIIJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Activity LIZLLL = renderContext.LIZLLL();
                    c208198Fb = new C208198Fb(LIZLLL, new C41522GRi(renderContext));
                    if (this.LIZ) {
                        c208198Fb.LJLLILLLL = BitmapFactory.decodeResource(LIZLLL.getResources(), R.drawable.c7s);
                    } else {
                        Resources resources = LIZLLL.getResources();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = 4;
                        c208198Fb.LJLLILLLL = BitmapFactory.decodeResource(resources, R.drawable.c7t, options);
                    }
                } else {
                    throw new C162476Zf();
                }
            } else {
                Activity LIZLLL2 = renderContext.LIZLLL();
                c208198Fb = new C208198Fb(LIZLLL2, new C41521GRh(renderContext));
                if (this.LIZ) {
                    c208198Fb.LJLLILLLL = BitmapFactory.decodeResource(LIZLLL2.getResources(), R.drawable.c7u);
                } else {
                    Resources resources2 = LIZLLL2.getResources();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = false;
                    options2.inSampleSize = 4;
                    c208198Fb.LJLLILLLL = BitmapFactory.decodeResource(resources2, R.drawable.c7v, options2);
                }
            }
            LIZIZ2.setSpan(c208198Fb, 0, length, 33);
        }
        renderContext.LIZJ().LIZ(block.LJIIJ);
        return LIZIZ2;
    }
}
