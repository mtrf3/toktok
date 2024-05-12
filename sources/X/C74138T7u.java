package X;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T7u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74138T7u extends T8F {
    public C74138T7u(View view) {
        super(view);
    }

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        C73305Spp c73305Spp = (C73305Spp) this.LJLIL.findViewById(R.id.ii4);
        c73305Spp.setLayoutVariant(1);
        Integer num = 64;
        o.LJIIIZ(num, "<this>");
        c73305Spp.setTopMargin(TypedValue.applyDimension(1, num.floatValue(), Resources.getSystem().getDisplayMetrics()));
        if (o.LJ(c74125T7h.LIZIZ, "SearchNoResultsError")) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIIZ(c73306Spq);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = null;
            c73305Spp.setStatus(c73306Spq);
            return;
        }
        C73306Spq c73306Spq2 = new C73306Spq();
        C73312Spw.LJII(c73306Spq2);
        c73306Spq2.LIZJ = 0;
        c73306Spq2.LIZIZ = null;
        c73305Spp.setStatus(c73306Spq2);
    }
}
