package X;

import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.ies.effectcreator.swig.Feature;
import kotlin.jvm.internal.IDqS419S0100000_42;

/* renamed from: X.agX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94409agX implements InterfaceC93473aRR {
    public final /* synthetic */ LiquefyFragment LIZ;

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
    }

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        Feature feature;
        IAutoChangeModel LIZ;
        LiquefyViewModel Gl = this.LIZ.Gl();
        C94518aiI c94518aiI = Gl.LJLIL;
        if (c94518aiI != null && (feature = c94518aiI.LIZJ) != null && (LIZ = C93722aVS.LIZ()) != null) {
            LIZ.autoChangeModelWithReason(C93825aX7.LIZ(feature), "change_tracking", new IDqS419S0100000_42(Gl, 126));
        }
    }

    public C94409agX(LiquefyFragment liquefyFragment) {
        this.LIZ = liquefyFragment;
    }
}
