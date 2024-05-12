package X;

import com.bytedance.effectcreatormobile.camera.CameraPreview;

/* renamed from: X.aiY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94534aiY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CameraPreview LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94534aiY(CameraPreview cameraPreview, boolean z) {
        super(0);
        this.LJLIL = cameraPreview;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.Gl(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
