package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5ZU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZU implements C5ZY {
    public final LifecycleOwner LIZ;
    public final InterfaceC145495nN LIZIZ;
    public final InterfaceC143655kP LIZJ;
    public NLEEditor LIZLLL;

    @Override // X.C5ZY
    public final void LIZ() {
    }

    public C5ZU(C5ZV c5zv, C82622Wbi objectContainer) {
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = c5zv;
        this.LIZIZ = (InterfaceC145495nN) objectContainer.LJ(InterfaceC145495nN.class, null);
        InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) objectContainer.LJ(InterfaceC143655kP.class, null);
        this.LIZJ = interfaceC143655kP;
        interfaceC143655kP.Kh().observe(c5zv, new AObserverS70S0100000_2(this, 9));
    }

    @Override // X.C5ZY
    public final void LIZIZ(NLEModel nLEModel, VideoPublishEditModel aimModel, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(aimModel, "aimModel");
        NLEEditor nLEEditor = this.LIZLLL;
        if (nLEEditor != null) {
            C132385Hm.LIZIZ(nLEEditor, aimModel, videoPublishEditModel, this.LIZIZ);
        }
    }
}
