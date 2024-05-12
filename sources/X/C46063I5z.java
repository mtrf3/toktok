package X;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import java.util.HashSet;

/* renamed from: X.I5z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46063I5z implements I6A {
    public final /* synthetic */ SceneActivityCompatibilityLayerFragment LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ LifecycleOwner LIZJ;
    public final /* synthetic */ Intent LIZLLL;
    public final /* synthetic */ int LJ = 1001;
    public final /* synthetic */ InterfaceC78912Uy4 LJFF;

    @Override // X.I6A
    public final void LIZ() {
        ((HashSet) this.LIZ.LJLJJI).remove(this);
        Activity activity = this.LIZIZ;
        LifecycleOwner lifecycleOwner = this.LIZJ;
        if (!C78932UyO.LJ(activity) || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        this.LIZ.LIZ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public C46063I5z(SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragment, Activity activity, LifecycleOwner lifecycleOwner, Intent intent, I60 i60) {
        this.LIZ = sceneActivityCompatibilityLayerFragment;
        this.LIZIZ = activity;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = intent;
        this.LJFF = i60;
    }
}
