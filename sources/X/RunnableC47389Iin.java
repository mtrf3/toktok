package X;

import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Iin, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47389Iin implements Runnable {
    public final ArrayList<String> LJLIL;
    public final ArrayList<String> LJLILLLLZI;
    public final WeakReference<TTVideoEngineImpl> LJLJI;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r15 = this;
            java.lang.ref.WeakReference<com.ss.ttvideoengine.TTVideoEngineImpl> r0 = r15.LJLJI
            java.lang.Object r8 = r0.get()
            com.ss.ttvideoengine.TTVideoEngineImpl r8 = (com.ss.ttvideoengine.TTVideoEngineImpl) r8
            if (r8 == 0) goto Lf
            int r1 = r8.LJIIJJI
            r0 = 5
            if (r1 != r0) goto L10
        Lf:
            return
        L10:
            java.lang.String r7 = r8.LLLZZ
            java.lang.String r6 = r8.P7
            java.util.ArrayList<java.lang.String> r0 = r15.LJLILLLLZI
            r5 = 1
            r11 = 0
            r4 = 10
            r13 = 0
            if (r0 == 0) goto L77
            int r0 = r0.size()
            if (r0 <= 0) goto L77
            r10 = 0
        L25:
            java.util.ArrayList<java.lang.String> r0 = r15.LJLILLLLZI
            int r0 = r0.size()
            if (r10 >= r0) goto Lf
            java.util.ArrayList<java.lang.String> r0 = r15.LJLILLLLZI
            java.lang.Object r12 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            java.lang.String r12 = (java.lang.String) r12
            com.ss.ttvideoengine.DataLoaderHelper r9 = X.C47148Ieu.LIZ
            X.Io8 r0 = r9.LJJ
            r0.LIZJ(r5)
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r9.LJIIIZ     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L41
            goto L56
        L41:
            android.content.Context r0 = r9.LJIIJJI     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = X.C47756Ioi.LJIIL(r0, r12)     // Catch: java.lang.Throwable -> L52
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r9.LJIIIZ     // Catch: java.lang.Throwable -> L52
            long r2 = r0.getCacheSize(r1, r12)     // Catch: java.lang.Throwable -> L52
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L56
            goto L58
        L52:
            r0 = move-exception
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)     // Catch: java.lang.Throwable -> Lb0
        L56:
            r2 = 0
        L58:
            X.Io8 r0 = r9.LJJ
            r0.LJ(r5)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L75
            long r0 = com.ss.ttvideoengine.TTVideoEngine.LJJIJ(r11, r12, r7, r6)
            int r9 = (int) r0
        L66:
            Y.IDHandlerS21S0100000_8 r1 = r8.C1
            if (r1 == 0) goto L72
            int r0 = (int) r2
            android.os.Message r0 = android.os.Message.obtain(r1, r4, r0, r9, r12)
            r1.sendMessage(r0)
        L72:
            int r10 = r10 + 1
            goto L25
        L75:
            r9 = 0
            goto L66
        L77:
            java.util.ArrayList<java.lang.String> r0 = r15.LJLIL
            if (r0 == 0) goto Lf
            int r0 = r0.size()
            if (r0 <= 0) goto Lf
            r10 = 0
        L82:
            java.util.ArrayList<java.lang.String> r0 = r15.LJLIL
            int r0 = r0.size()
            if (r10 >= r0) goto Lf
            java.util.ArrayList<java.lang.String> r0 = r15.LJLIL
            java.lang.Object r11 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            long r2 = com.ss.ttvideoengine.TTVideoEngine.LJIILJJIL(r11)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto Lae
            long r0 = com.ss.ttvideoengine.TTVideoEngine.LJJIJ(r5, r11, r7, r6)
            int r9 = (int) r0
        L9f:
            Y.IDHandlerS21S0100000_8 r1 = r8.C1
            if (r1 == 0) goto Lab
            int r0 = (int) r2
            android.os.Message r0 = android.os.Message.obtain(r1, r4, r0, r9, r11)
            r1.sendMessage(r0)
        Lab:
            int r10 = r10 + 1
            goto L82
        Lae:
            r9 = 0
            goto L9f
        Lb0:
            r1 = move-exception
            X.Io8 r0 = r9.LJJ
            r0.LJ(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC47389Iin.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47389Iin(TTVideoEngineImpl tTVideoEngineImpl, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.LJLJI = new WeakReference<>(tTVideoEngineImpl);
        this.LJLIL = arrayList;
        this.LJLILLLLZI = arrayList2;
    }
}
