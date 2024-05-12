package X;

import androidx.lifecycle.Observer;
import com.bytedance.effectcreatormobile.camera.CameraPreview;
import kotlin.jvm.internal.o;

/* renamed from: X.aeu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94308aeu implements Observer<Boolean> {
    public final /* synthetic */ CameraPreview LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            this.LJLILLLLZI.invoke();
            this.LJLIL.xl().LJII.removeObserver(this);
        }
    }

    public C94308aeu(CameraPreview cameraPreview, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = cameraPreview;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
