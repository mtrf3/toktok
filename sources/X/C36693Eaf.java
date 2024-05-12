package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse;

/* renamed from: X.Eaf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36693Eaf<T> implements InterfaceC86003Zc {
    public final /* synthetic */ CutoutResponse LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ CreativeInfo LJLJI;

    public C36693Eaf(long j, CreativeInfo creativeInfo, CutoutResponse cutoutResponse) {
        this.LJLIL = cutoutResponse;
        this.LJLILLLLZI = j;
        this.LJLJI = creativeInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r1 == null) goto L16;
     */
    @Override // X.InterfaceC86003Zc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subscribe(X.InterfaceC73573Su9<com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData> r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse r0 = r8.LJLIL
            r5 = 1
            r4 = 0
            if (r0 != 0) goto Lf
            X.Eae r0 = new X.Eae
            r0.<init>(r4, r5, r4)
            r9.tryOnError(r0)
        Le:
            return
        Lf:
            int r0 = r0.status_code
            if (r0 != 0) goto L88
            long r0 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r2 = r8.LJLILLLLZI
            long r0 = r0 - r2
            java.lang.String r2 = "duration"
            r6.put(r2, r0)
            X.6mr r1 = X.C43882HKc.LIZ
            java.lang.String r0 = "custom_sticker_imageclip_cost"
            r1.LJIILIIL(r0, r6, r4)
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse r0 = r8.LJLIL
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResult r7 = r0.getData()
            if (r7 != 0) goto L3c
            X.Eae r0 = new X.Eae
            r0.<init>(r4, r5, r4)
            r9.tryOnError(r0)
            return
        L3c:
            com.ss.android.ugc.aweme.creative.CreativeInfo r6 = r8.LJLJI
            java.lang.String r1 = r7.getContent()
            java.lang.String r0 = "creativeInfo"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r3 = 0
            if (r1 == 0) goto L50
            int r0 = r1.length()
            if (r0 != 0) goto L62
        L50:
            r1 = r4
        L51:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            java.io.File r3 = X.C43080GvU.LIZJ(r6, r1, r0)
            if (r3 != 0) goto L77
            X.Eae r0 = new X.Eae
            r0.<init>(r4, r5, r4)
            r9.tryOnError(r0)
            goto Le
        L62:
            byte[] r2 = android.util.Base64.decode(r1, r3)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.inPreferredConfig = r0
            int r0 = r2.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r0, r1)
            if (r1 != 0) goto L51
            goto L50
        L77:
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData r2 = new com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData
            java.util.List r1 = r7.getContoursPoint()
            com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location r0 = r7.getBbox()
            r2.<init>(r3, r1, r0)
            r9.onNext(r2)
            goto Le
        L88:
            X.Eae r1 = new X.Eae
            com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse r0 = r8.LJLIL
            java.lang.String r0 = r0.message
            r1.<init>(r0)
            r9.tryOnError(r1)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36693Eaf.subscribe(X.Su9):void");
    }
}
