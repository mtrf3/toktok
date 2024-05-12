package X;

import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I2N implements IFetchResourceListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC45959I1z LJLILLLLZI;

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
        InterfaceC45959I1z interfaceC45959I1z = this.LJLILLLLZI;
        if (interfaceC45959I1z != null) {
            interfaceC45959I1z.LIZ(exception);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(long r5) {
        /*
            r4 = this;
            boolean r0 = com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform.enableKNPlatform
            r3 = 0
            if (r0 == 0) goto L34
            X.XBf r0 = X.XBE.LJIIIIZZ
            r0.getClass()
            boolean r0 = X.C84419XBf.LIZJ()
            if (r0 == 0) goto L34
            X.XBE r0 = X.C84419XBf.LIZ()
            com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder r2 = r0.LIZLLL()
            java.lang.String r1 = r4.LJLIL
            java.lang.String r0 = "modelName"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 0
            java.lang.String r1 = r2.realFindResourceUri(r0, r3, r1)
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L3b
            X.I1z r1 = r4.LJLILLLLZI
            if (r1 == 0) goto L33
            java.lang.String r0 = ""
            r1.onSuccess(r0)
        L33:
            return
        L34:
            java.lang.String r0 = r4.LJLIL
            java.lang.String r1 = com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder.findResourceUri(r3, r0)
            goto L24
        L3b:
            java.net.URI r0 = java.net.URI.create(r1)
            java.lang.String r2 = r0.getPath()
            X.I1z r1 = r4.LJLILLLLZI
            if (r1 == 0) goto L4f
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1.onSuccess(r2)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2N.onSuccess(long):void");
    }

    public I2N(String str, InterfaceC45959I1z interfaceC45959I1z) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC45959I1z;
    }
}
