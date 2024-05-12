package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* renamed from: X.VGe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC79452VGe {
    void LIZIZ(List<MaskSrc> list);

    boolean LIZJ();

    boolean LIZLLL(ViewGroup viewGroup);

    void LJ(float f, float f2);

    boolean LJFF(ViewGroup viewGroup);

    void LJIIIZ();

    void bringToFront();

    Context getContext();

    boolean getLastFrameHold();

    int getMeasuredHeight();

    int getMeasuredWidth();

    Resources getResources();

    DataSource.ScaleType getScaleType();

    View getView();

    void onCompletion();

    void onPause();

    void release();

    void requestRender();

    void setConfigParams(DataSource.DataInfo dataInfo);

    void setFirstGLFrameListener(VGY vgy);

    void setLastFrameHold(boolean z);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPlayerController(IPlayerController iPlayerController);

    void setVideoRenderer(InterfaceC79896VXg interfaceC79896VXg);

    void setVisibility(int i);
}
