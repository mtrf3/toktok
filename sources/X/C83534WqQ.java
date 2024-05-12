package X;

import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WqQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83534WqQ implements InterfaceC83513Wq5 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C83536WqS.LJLIL);

    @Override // X.InterfaceC83513Wq5
    public final void LIZIZ() {
        VEImageDetectUtils vEImageDetectUtils = ((C83537WqT) this.LIZ.getValue()).LIZ;
        if (vEImageDetectUtils != null) {
            vEImageDetectUtils.stopDetectImagesContentIfNeed();
        }
    }

    @Override // X.InterfaceC83513Wq5
    public final void LIZ(String str, List list, EffectSdkExtra effectSdkExtra, IDqS456S0100000_14 resultAction) {
        o.LJIIIZ(resultAction, "resultAction");
        if (effectSdkExtra.getPl().getAlg().size() == 0) {
            return;
        }
        C83537WqT c83537WqT = (C83537WqT) this.LIZ.getValue();
        ArrayList<String> scanAlgorithmList = effectSdkExtra.getPl().getAlg();
        C83535WqR c83535WqR = new C83535WqR(resultAction, this);
        synchronized (c83537WqT) {
            o.LJIIIZ(scanAlgorithmList, "scanAlgorithmList");
            VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
            vEImageDetectUtils.init();
            vEImageDetectUtils.setDetectImageContentWithNumListener(c83535WqR);
            vEImageDetectUtils.detectImagesContentWithSize(str, list, scanAlgorithmList, 1280, 1280);
            vEImageDetectUtils.destroy();
            c83537WqT.LIZ = vEImageDetectUtils;
        }
    }
}
