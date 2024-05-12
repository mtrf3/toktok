package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.List;

/* renamed from: X.I5h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC46045I5h {
    void LIZ(C15070iV<Float, Float> c15070iV, List<VideoSegment> list);

    boolean LIZIZ();

    void LIZJ(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List list, int i);

    void LIZLLL(List<VideoSegment> list);

    void LJ();

    boolean LJFF(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    void LJI(LifecycleOwner lifecycleOwner, ViewModelProvider viewModelProvider, CutMultiVideoViewModel cutMultiVideoViewModel, List list);

    void LJII();

    void LJIIIIZZ();

    void LJIIIZ(boolean z);

    int getCurrentRotate();

    float getCurrentSpeed();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiSeekTime();

    C15070iV<Long, Long> getPlayBoundary();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSingleSeekTime();
}
