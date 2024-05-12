package X;

import com.ss.android.vesdk.VEImageDetectUtils;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WqR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83535WqR implements VEImageDetectUtils.IDetectImageResultWithNumListener {
    public final /* synthetic */ InterfaceC88474Ynu<String, String, String, Integer, C76800UCe> LIZ;
    public final /* synthetic */ C83534WqQ LIZIZ;

    public C83535WqR(IDqS456S0100000_14 iDqS456S0100000_14, C83534WqQ c83534WqQ) {
        this.LIZ = iDqS456S0100000_14;
        this.LIZIZ = c83534WqQ;
    }

    @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultWithNumListener
    public final void onDetectResult(String id, String path, String scanAlgorithm, int i) {
        InterfaceC88474Ynu<String, String, String, Integer, C76800UCe> interfaceC88474Ynu = this.LIZ;
        o.LJIIIIZZ(id, "id");
        o.LJIIIIZZ(path, "path");
        o.LJIIIIZZ(scanAlgorithm, "scanAlgorithm");
        interfaceC88474Ynu.invoke(id, path, scanAlgorithm, Integer.valueOf(i));
        VEImageDetectUtils vEImageDetectUtils = ((C83537WqT) this.LIZIZ.LIZ.getValue()).LIZ;
        if (vEImageDetectUtils != null) {
            vEImageDetectUtils.stopDetectImagesContentIfNeed();
        }
    }
}
