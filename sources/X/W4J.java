package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W4J implements W4L {
    public final InterfaceC65784Pro<ShortVideoContext> LJLIL;
    public final InterfaceC65784Pro<C6FB> LJLILLLLZI;

    public W4J(AqS164S0100000_14 aqS164S0100000_14, InterfaceC65784Pro screenAdapterPresenterProvider) {
        o.LJIIIZ(screenAdapterPresenterProvider, "screenAdapterPresenterProvider");
        this.LJLIL = aqS164S0100000_14;
        this.LJLILLLLZI = screenAdapterPresenterProvider;
    }

    @Override // X.W4L
    public final boolean LIZ(View surfaceView, View surfaceContainer, boolean z) {
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(surfaceContainer, "surfaceContainer");
        ShortVideoContext invoke = this.LJLIL.invoke();
        UC0.LJJJLZIJ(surfaceContainer, 0.0f);
        surfaceContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C6FB invoke2 = this.LJLILLLLZI.invoke();
        if (invoke2 != null) {
            CameraComponentModel cameraComponentModel = invoke.cameraComponentModel;
            invoke2.LJII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, surfaceView);
            return true;
        }
        return true;
    }
}
