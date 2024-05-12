package X;

import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.LcP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54637LcP<T> implements Comparator {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ HashMap<String, String> LJLILLLLZI;
    public final /* synthetic */ Collator LJLJI;

    public C54637LcP(boolean z, HashMap<String, String> hashMap, Collator collator) {
        this.LJLIL = z;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = collator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            X.Mm4 r5 = (X.InterfaceC57784Mm4) r5
            X.Mm4 r6 = (X.InterfaceC57784Mm4) r6
            boolean r0 = r5 instanceof X.C86753ap
            java.lang.String r2 = ""
            if (r0 == 0) goto L51
            X.3ap r5 = (X.C86753ap) r5
            java.lang.String r0 = r5.LJLIL
        Le:
            if (r0 != 0) goto L11
            r0 = r2
        L11:
            boolean r1 = r6 instanceof X.C86753ap
            if (r1 == 0) goto L22
            X.3ap r6 = (X.C86753ap) r6
            java.lang.String r1 = r6.LJLIL
        L19:
            if (r1 != 0) goto L4f
        L1b:
            java.text.Collator r1 = r4.LJLJI
            int r0 = r1.compare(r0, r2)
            return r0
        L22:
            boolean r1 = r6 instanceof X.C54638LcQ
            if (r1 == 0) goto L4e
            boolean r1 = r4.LJLIL
            if (r1 == 0) goto L45
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r4.LJLILLLLZI
            if (r3 == 0) goto L45
            X.LcQ r6 = (X.C54638LcQ) r6
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r1 = r6.LJLIL
            java.lang.String r1 = r1.getName()
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L4f
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r1 = r6.LJLIL
            java.lang.String r1 = r1.getName()
            goto L19
        L45:
            X.LcQ r6 = (X.C54638LcQ) r6
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r1 = r6.LJLIL
            java.lang.String r1 = r1.getName()
            goto L19
        L4e:
            r1 = r2
        L4f:
            r2 = r1
            goto L1b
        L51:
            boolean r0 = r5 instanceof X.C54638LcQ
            if (r0 == 0) goto L7d
            boolean r0 = r4.LJLIL
            if (r0 == 0) goto L74
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.LJLILLLLZI
            if (r1 == 0) goto L74
            X.LcQ r5 = (X.C54638LcQ) r5
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r0 = r5.LJLIL
            java.lang.String r0 = r0.getName()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L11
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r0 = r5.LJLIL
            java.lang.String r0 = r0.getName()
            goto Le
        L74:
            X.LcQ r5 = (X.C54638LcQ) r5
            com.ss.android.ugc.tiktok.location_api.service.LocationRegion r0 = r5.LJLIL
            java.lang.String r0 = r0.getName()
            goto Le
        L7d:
            r0 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54637LcP.compare(java.lang.Object, java.lang.Object):int");
    }
}
