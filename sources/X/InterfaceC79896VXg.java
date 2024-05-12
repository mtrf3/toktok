package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* renamed from: X.VXg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC79896VXg extends GLSurfaceView.Renderer, InterfaceC81370Vwc, SurfaceTexture.OnFrameAvailableListener {
    void LIZIZ(List<MaskSrc> list);

    void LIZLLL(float f, float f2, float f3, float f4);

    void LJ(VGX vgx);

    void LJIIIZ();

    void onCompletion();

    void setConfigParams(DataSource.DataInfo dataInfo);

    void setFirstGLFrameListener(VGY vgy);
}
