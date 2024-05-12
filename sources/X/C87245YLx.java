package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdSetting;
import com.bytedance.compression.zstd.ZstdDecompress;
import com.bytedance.compression.zstd.ZstdDecompressCtx;
import com.bytedance.compression.zstd.ZstdDictDecompress;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import kotlin.jvm.internal.o;

/* renamed from: X.YLx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87245YLx {
    public static final C87245YLx LIZ = new C87245YLx();
    public static int LIZIZ = -1;
    public static String LIZJ;
    public static byte[] LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static boolean LIZJ() {
        byte[] bArr;
        if (!LiveMessageZstdSetting.INSTANCE.enable() || LIZIZ <= 0 || (bArr = LIZLLL) == null || bArr.length == 0 || LJFF) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if ((!r0) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LIZ(com.ss.ugc.live.sdk.message.data.PayloadItem r4) {
        /*
            java.lang.String r0 = "payloadItem"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            byte[] r3 = r4.getPayload()     // Catch: java.lang.Throwable -> L46
            byte[] r1 = X.C87245YLx.LIZLLL     // Catch: java.lang.Throwable -> L46
            r2 = 1
            if (r3 != 0) goto L11
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L46
            goto L1f
        L11:
            com.bytedance.compression.zstd.ZstdDictDecompress r0 = new com.bytedance.compression.zstd.ZstdDictDecompress     // Catch: java.lang.Throwable -> L46
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L46
            byte[] r1 = com.bytedance.compression.zstd.ZstdDecompress.decompress(r3, r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "decompress(source, ZstdDictDecompress(zstdDict))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L46
        L1f:
            int r0 = r1.length
            if (r0 != 0) goto L3a
            r0 = 1
        L23:
            if (r0 == 0) goto L35
            byte[] r0 = r4.getPayload()
            if (r0 == 0) goto L38
            int r0 = r0.length
            if (r0 != 0) goto L36
            r0 = 1
        L2f:
            r0 = r0 ^ 1
            if (r0 != r2) goto L38
        L33:
            if (r2 != 0) goto L3c
        L35:
            return r1
        L36:
            r0 = 0
            goto L2f
        L38:
            r2 = 0
            goto L33
        L3a:
            r0 = 0
            goto L23
        L3c:
            X.YM2 r3 = new X.YM2
            r2 = 2
            r1 = 0
            java.lang.String r0 = "decompress empty"
            r3.<init>(r0, r1, r2, r1)
            throw r3
        L46:
            r2 = move-exception
            X.YM2 r1 = new X.YM2
            java.lang.String r0 = "decompress exception"
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87245YLx.LIZ(com.ss.ugc.live.sdk.message.data.PayloadItem):byte[]");
    }

    public static void LIZIZ(PayloadItem payloadItem, C84689XLp out) {
        o.LJIIIZ(payloadItem, "payloadItem");
        o.LJIIIZ(out, "out");
        try {
            ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
            out.LIZ((int) ZstdDecompress.decompressedSize(payloadItem.getPayload()));
            zstdDecompressCtx.loadDict(new ZstdDictDecompress(LIZLLL));
            byte[] bArr = out.LJLILLLLZI;
            out.LJLIL = zstdDecompressCtx.decompressByteArray(bArr, 0, bArr.length, payloadItem.getPayload(), 0, payloadItem.getPayload().length);
        } catch (Throwable th) {
            throw new YM2("decompress exception", th);
        }
    }
}
