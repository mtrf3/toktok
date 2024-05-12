package X;

import android.webkit.ValueCallback;
import com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment;

/* renamed from: X.Ndn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59819Ndn implements InterfaceC61118Nyk {
    public final /* synthetic */ UploadFileFragment LIZ;
    public final /* synthetic */ ValueCallback<android.net.Uri[]> LIZIZ;
    public final /* synthetic */ String[] LIZJ;

    public C59819Ndn(UploadFileFragment uploadFileFragment, ValueCallback<android.net.Uri[]> valueCallback, String[] strArr) {
        this.LIZ = uploadFileFragment;
        this.LIZIZ = valueCallback;
        this.LIZJ = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5.length == 0) goto L11;
     */
    @Override // X.InterfaceC61118Nyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int[] r9, java.lang.String[] r10) {
        /*
            r8 = this;
            java.lang.String r0 = "grantResults"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment r7 = r8.LIZ
            android.webkit.ValueCallback<android.net.Uri[]> r6 = r8.LIZIZ
            java.lang.String[] r5 = r8.LIZJ
            int r4 = r9.length
            r3 = 0
            r2 = 0
        Le:
            if (r2 >= r4) goto L2c
            r0 = r9[r2]
            if (r0 == 0) goto L15
            return
        L15:
            r7.LJLILLLLZI = r6
            if (r5 == 0) goto L1d
            int r1 = r5.length
            r0 = 1
            if (r1 != 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.String r1 = ""
            if (r0 == 0) goto L2a
            r0 = r5[r3]
        L24:
            r7.Al(r0, r1)
            int r2 = r2 + 1
            goto Le
        L2a:
            r0 = r1
            goto L24
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59819Ndn.LIZ(int[], java.lang.String[]):void");
    }
}
