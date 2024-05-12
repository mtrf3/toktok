package X;

import com.lynx.tasm.base.LLog;

/* renamed from: X.Vr7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81029Vr7 {
    public volatile boolean mDestroyed;

    public abstract void onDestroy();

    public abstract void onLoad(VNU vnu, android.net.Uri uri, C81032VrA c81032VrA, AbstractC81030Vr8 abstractC81030Vr8);

    public abstract void onPause();

    public abstract void onRelease();

    public abstract void onResume();

    public final void destroy() {
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        onDestroy();
    }

    public final void pause() {
        if (this.mDestroyed) {
            return;
        }
        onPause();
    }

    public final void release() {
        if (this.mDestroyed) {
            return;
        }
        onRelease();
    }

    public final void resume() {
        if (this.mDestroyed) {
            return;
        }
        onResume();
    }

    private void sequenceLoad(VNU vnu, android.net.Uri uri, C81032VrA c81032VrA, AbstractC81030Vr8 abstractC81030Vr8) {
        onLoad(vnu, uri, c81032VrA, new C81031Vr9(this, abstractC81030Vr8, uri));
    }

    public final void load(VNU vnu, android.net.Uri uri, C81032VrA c81032VrA, AbstractC81030Vr8 abstractC81030Vr8) {
        if (this.mDestroyed) {
            LLog.LIZLLL(4, "LynxImageLoader", "load after destroyed");
        } else {
            if (vnu == null || uri == null) {
                return;
            }
            sequenceLoad(vnu, uri, c81032VrA, abstractC81030Vr8);
        }
    }
}
