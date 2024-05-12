package X;

import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.JwY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50790JwY extends AbstractC38911fr {
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LJLILLLLZI;

    public C50790JwY(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew) {
        this.LJLILLLLZI = dynamicSingleIntermediateFragmentNew;
    }

    @Override // X.AbstractC38911fr
    public final void LJJIL(Object data) {
        C50789JwX c50789JwX;
        C50789JwX c50789JwX2;
        o.LJIIIZ(data, "data");
        boolean z = false;
        if ((data instanceof String) && s.LJJJLZIJ((CharSequence) data, "historyList", false)) {
            z = true;
        }
        if (z && (c50789JwX2 = C50768JwC.LIZIZ) != null && c50789JwX2.LIZJ > 0 && c50789JwX2.LJIIL > 0) {
            c50789JwX2.LJJIFFI = System.currentTimeMillis() - c50789JwX2.LJIIL;
        }
        if (C50768JwC.LIZ(data) && (c50789JwX = C50768JwC.LIZIZ) != null && c50789JwX.LIZJ > 0 && c50789JwX.LJIILIIL > 0) {
            c50789JwX.LJJII = System.currentTimeMillis() - c50789JwX.LJIILIIL;
        }
    }

    @Override // X.AbstractC38911fr
    public final void LJJIZ(Object data) {
        o.LJIIIZ(data, "data");
        if (C50768JwC.LIZ(data)) {
            FN6.LIZJ(new ARunnableS44S0100000_8(this.LJLILLLLZI, 94));
            C50789JwX c50789JwX = C50768JwC.LIZIZ;
            if (c50789JwX != null && c50789JwX.LIZJ > 0) {
                c50789JwX.LJIILIIL = System.currentTimeMillis();
            }
        }
        if ((data instanceof String) && s.LJJJLZIJ((CharSequence) data, "historyList", false)) {
            FN6.LIZJ(RunnableC50791JwZ.LJLIL);
            C50789JwX c50789JwX2 = C50768JwC.LIZIZ;
            if (c50789JwX2 != null && c50789JwX2.LIZJ > 0) {
                c50789JwX2.LJIIL = System.currentTimeMillis();
            }
        }
    }
}
