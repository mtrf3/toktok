package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EZ9 {
    public static final EZ9 LIZ = new EZ9();

    public static OSJ LIZ(EZA eza) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(new EZQ(eza.LJII).LIZLLL(), linkedHashMap);
        return new OSJ(LIZJ.first, LIZJ.second, linkedHashMap);
    }

    public static List LIZIZ(EZA eza) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = eza.LIZ;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                C77800Ug8.LJFF(entry.getKey(), entry.getValue(), arrayList);
            }
        }
        String str = eza.LJFF;
        if (str != null) {
            C77800Ug8.LJFF("Content-Type", str, arrayList);
        }
        return arrayList;
    }

    public static TypedOutput LIZJ(EZA eza) {
        LinkedHashMap<String, File> linkedHashMap = eza.LJI;
        TypedByteArray typedByteArray = null;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            java.util.Map<String, String> map = eza.LIZLLL;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            return multipartTypedOutput;
        }
        byte[] bArr = eza.LJ;
        if (bArr != null) {
            typedByteArray = new TypedByteArray(eza.LJFF, bArr, new String[0]);
        }
        return typedByteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #2 {all -> 0x01d6, blocks: (B:3:0x0048, B:5:0x0080, B:6:0x0088, B:14:0x01bf, B:20:0x00a0, B:22:0x00eb, B:24:0x00f5, B:26:0x00fb, B:28:0x0107, B:29:0x010b, B:31:0x0113, B:32:0x0117, B:34:0x011d, B:38:0x0133, B:41:0x013d, B:47:0x0141, B:49:0x016a, B:51:0x0170, B:53:0x017d, B:55:0x0185, B:58:0x018b, B:59:0x00b6, B:62:0x00be, B:64:0x00d4), top: B:2:0x0048, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.UCe] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [T] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable, T, X.Pby] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.Pbv, java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C86623Xz9 LIZLLL(X.EZC r25, X.EZA r26, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r27) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZ9.LIZLLL(X.EZC, X.EZA, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):X.Xz9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fc, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T, X.Pby] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Pbv, java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable, T, X.PaI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C86624XzA LJ(X.EZC r24, X.EZA r25, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r26) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZ9.LJ(X.EZC, X.EZA, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):X.XzA");
    }
}
