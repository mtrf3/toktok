package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public final class IX3 implements InterfaceC222728oe {
    public WeakReference<VideoViewComponent> LJLIL = new WeakReference<>(null);
    public final java.util.Set<LifecycleOwner> LJLILLLLZI = Collections.newSetFromMap(new WeakHashMap());

    public final void LIZ(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = this.LJLIL.get();
        if (videoViewComponent2 != null) {
            for (LifecycleOwner lifecycleOwner : this.LJLILLLLZI) {
                if (lifecycleOwner != null) {
                    lifecycleOwner.getLifecycle().removeObserver(videoViewComponent2);
                }
            }
        }
        this.LJLIL = new WeakReference<>(videoViewComponent);
    }
}
