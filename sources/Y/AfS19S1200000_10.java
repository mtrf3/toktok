package Y;

import X.InterfaceC64592gB;
import X.InterfaceC88471Ynr;
import X.OYX;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AfS19S1200000_10 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        if (r0.length() == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS19S1200000_10 r6, java.lang.Object r7) {
        /*
            X.OSZ r7 = (X.OSZ) r7
            java.lang.Object r1 = r7.getSecond()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model.GeckoInfoFetchResult.Success"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.Nxl r1 = (X.C61057Nxl) r1
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model.WishListGeckoResponse r0 = r1.LIZ
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model.LynxSchema r0 = r0.getLynxSchema()
            if (r0 == 0) goto L6d
            java.lang.String r5 = r0.getRenderUrl()
            if (r5 == 0) goto L6d
            java.lang.Object r4 = r6.l1
            com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager r4 = (com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager) r4
            java.lang.Object r3 = r6.l2
            com.bytedance.hybrid.spark.page.SparkFragment r3 = (com.bytedance.hybrid.spark.page.SparkFragment) r3
            java.lang.String r6 = r6.s0
            java.lang.String r2 = "aweme://lynxview"
            java.lang.String r1 = "aweme://lynxview/"
            r0 = 0
            java.lang.String r2 = ujb.o.LJJJJZ(r5, r2, r1, r0)
            r5 = 1
            if (r6 == 0) goto L37
            int r0 = r6.length()
            if (r0 != 0) goto L6e
        L37:
            java.lang.String r6 = r2.toString()
            r4.LJLJL = r6
            X.NtS r0 = r3.LJLJI
            if (r0 == 0) goto L6d
            com.bytedance.hybrid.spark.SparkContext r2 = r0.getSparkContext()
            if (r2 == 0) goto L6d
            X.NtS r1 = r3.LJLJI
            if (r1 == 0) goto L66
            r2.LJJIJLIJ(r6)
            com.ss.android.ugc.aweme.ad.experiment.AdForestData r0 = X.C59209NLp.LIZ()
            boolean r0 = r0.enableLynxWishList
            if (r0 == 0) goto L5b
            java.lang.String r0 = "use_forest"
            r2.LJJIIJZLJL(r0, r5)
        L5b:
            X.Nxn r0 = new X.Nxn
            r0.<init>(r4)
            r2.LJIL(r0)
            r1.LJIIJJI(r2)
        L66:
            X.NtS r0 = r3.LJLJI
            if (r0 == 0) goto L6d
            r0.LIZIZ()
        L6d:
            return
        L6e:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            java.lang.String r1 = "page_location"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r1)
            if (r0 == 0) goto L80
            int r0 = r0.length()
            if (r0 != 0) goto L37
        L80:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r6)
            android.net.Uri r2 = r0.build()
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS19S1200000_10.accept$0(Y.AfS19S1200000_10, java.lang.Object):void");
    }

    public static final void accept$1(AfS19S1200000_10 afS19S1200000_10, Object obj) {
        String attachmentUrl = (String) obj;
        try {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS19S1200000_10.l1;
            String str = afS19S1200000_10.s0;
            o.LJIIIIZZ(attachmentUrl, "attachmentUrl");
            interfaceC88471Ynr.invoke(str, attachmentUrl);
            ((SharePackage) afS19S1200000_10.l2).extras.putString("share_url", attachmentUrl);
        } catch (OYX unused) {
        }
    }

    public AfS19S1200000_10(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
