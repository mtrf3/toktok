package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public abstract class I50 extends FrameLayout implements InterfaceC46045I5h {
    public boolean LJLIL;

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ int getCurrentRotate();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ float getCurrentSpeed();

    public abstract /* synthetic */ int getEditState();

    public abstract View getEndSlide();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ long getLeftSeekingValue();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ long getMaxCutDuration();

    public abstract /* synthetic */ long getMultiPlayingPosition();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ long getMultiSeekTime();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ C15070iV<Long, Long> getPlayBoundary();

    public abstract /* synthetic */ long getPlayingPosition();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ long getRightSeekingValue();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ float getSelectedTime();

    public abstract /* synthetic */ long getSinglePlayingPosition();

    @Override // X.InterfaceC46045I5h
    public abstract /* synthetic */ long getSingleSeekTime();

    public abstract /* synthetic */ C15070iV<Float, Float> getSlideX();

    public abstract View getStartSlide();

    public abstract /* synthetic */ void setCanEdit(boolean z);

    public abstract /* synthetic */ void setCurrentRotate(int i);

    public abstract /* synthetic */ void setDefaultMode(boolean z);

    public void setEditViewHeight(boolean z) {
    }

    public abstract /* synthetic */ void setExtractFramesInRoughMode(boolean z);

    public abstract /* synthetic */ void setLoadThumbnailDirectly(boolean z);

    public abstract /* synthetic */ void setMaxVideoLength(long j);

    public abstract /* synthetic */ void setMinVideoLength(long j);

    public abstract /* synthetic */ void setMultiEditEnableForStickPointMode(boolean z);

    public abstract /* synthetic */ void setUseCustomMaxVideoLengthDirectly(boolean z);

    public I50(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public I50(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
