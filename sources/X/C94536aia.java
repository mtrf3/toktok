package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel", f = "FaceDistortionViewModel.kt", l = {151, 152, 154}, m = "setupForCreating")
/* renamed from: X.aia, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94536aia extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ FaceDistortionViewModel LJLJI;
    public Object LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94536aia(FaceDistortionViewModel faceDistortionViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = faceDistortionViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.kv0(null, null, null, null, null, null, null, null, this);
    }
}
