package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HSD extends HSS {
    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    public final String LJJJJJ() {
        boolean z;
        String str;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (extra == null || extra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
                    if (anchorCommonStruct2 != null) {
                        str = anchorCommonStruct2.getExtra();
                    } else {
                        str = null;
                    }
                    String optString = new JSONObject(str).optString("organization_type");
                    if (C107244Iu.LIZIZ(optString)) {
                        return "TILTIFY";
                    }
                    return optString;
                } catch (Exception unused) {
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new HSD();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.DONATION_STICKER.getTYPE();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: Exception -> 0x002f, TryCatch #1 {Exception -> 0x002f, blocks: (B:11:0x0038, B:13:0x003e, B:14:0x0042), top: B:10:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // X.HSS, X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C188727au r4) {
        /*
            r3 = this;
            java.lang.String r0 = "eventMapBuilder"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LJLJJL
            java.lang.String r2 = ""
            if (r0 == 0) goto L10
            java.lang.String r1 = r0.getKeyword()     // Catch: java.lang.Exception -> L10
            goto L11
        L10:
            r1 = r2
        L11:
            java.lang.String r0 = "ngo_name"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r3.LJJJJJ()
            java.lang.String r0 = "powered_by"
            r4.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LJLJJL
            if (r0 == 0) goto L2f
            java.lang.String r0 = r0.getExtra()
            if (r0 == 0) goto L2f
            int r0 = r0.length()
            if (r0 != 0) goto L38
        L2f:
            java.lang.String r0 = "link"
            r4.LJI(r0, r2)
            super.LJ(r4)
            return
        L38:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2f
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r3.LJLJJL     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L2f
        L42:
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "donation_url"
            java.lang.String r2 = r1.optString(r0)     // Catch: java.lang.Exception -> L2f
            goto L2f
        L4c:
            r0 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSD.LJ(X.7au):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0102 A[Catch: Exception -> 0x007e, TryCatch #1 {Exception -> 0x007e, blocks: (B:14:0x00fc, B:16:0x0102, B:17:0x0106, B:19:0x0113), top: B:13:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113 A[Catch: Exception -> 0x007e, TryCatch #1 {Exception -> 0x007e, blocks: (B:14:0x00fc, B:16:0x0102, B:17:0x0106, B:19:0x0113), top: B:13:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[Catch: Exception -> 0x0096, TryCatch #3 {Exception -> 0x0096, blocks: (B:27:0x00de, B:29:0x00e4, B:30:0x00e8, B:32:0x00f1), top: B:26:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[Catch: Exception -> 0x0096, TryCatch #3 {Exception -> 0x0096, blocks: (B:27:0x00de, B:29:0x00e4, B:30:0x00e8, B:32:0x00f1), top: B:26:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: Exception -> 0x00ba, TryCatch #2 {Exception -> 0x00ba, blocks: (B:43:0x00ca, B:45:0x00d0, B:46:0x00d4), top: B:42:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    @Override // X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C188727au r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSD.LJIIIIZZ(X.7au):void");
    }
}
