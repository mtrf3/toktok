package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.TiM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75390TiM extends AbstractC31414CUo<IOD, C75392TiO> {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    @Override // X.AbstractC31414CUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C75392TiO r5, X.IOD r6) {
        /*
            r4 = this;
            X.TiO r5 = (X.C75392TiO) r5
            X.IOD r6 = (X.IOD) r6
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.Tl5 r1 = X.C75559Tl5.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_DATA_HOLDER"
            java.lang.Object r0 = r1.LIZIZ(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder) r0
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.LJJIL
        L1d:
            java.lang.String r3 = "<get-coinImageView>(...)"
            r2 = 2131235227(0x7f08119b, float:1.8086642E38)
            if (r1 == 0) goto L40
            X.BQO r0 = X.C15650jR.LIZ()
            X.Uuy r1 = r0.setUrl(r1)
            r1.LJIIIIZZ = r2
            X.5H3 r0 = r5.LJLIL
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            android.view.View r0 = (android.view.View) r0
            r1.LJIIJJI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L4e
        L40:
            X.5H3 r0 = r5.LJLIL
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r2)
        L4e:
            X.5H3 r0 = r5.LJLILLLLZI
            java.lang.Object r3 = r0.getValue()
            java.lang.String r0 = "<get-totalPointsNum>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            long r0 = r6.LIZ
            java.lang.String r2 = com.google.gson.internal.b.LJIILJJIL(r0)
            java.lang.String r0 = "getDisplayCountForCoin(item.totalScore)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = "ROOT"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r2.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75390TiM.LIZ(androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }

    @Override // X.AbstractC31414CUo
    public final C75392TiO LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C75392TiO(parent);
    }
}
