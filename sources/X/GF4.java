package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GF4 implements GF2 {
    public final MutableLiveData<Boolean> LIZ = new MutableLiveData<>();

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return getScene().getSceneContext();
    }

    @Override // X.InterfaceC41451GOp
    public final LifecycleOwner getLifecycleOwner() {
        return getScene();
    }

    @Override // X.InterfaceC42491Glz, X.GGH
    public final MutableLiveData<Boolean> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC41449GOn
    public void LJIIJJI(InterfaceC40967G5z listener) {
        o.LJIIIZ(listener, "listener");
        InterfaceC78933UyP LJIILLIIL = LJIILLIIL();
        o.LJII(LJIILLIIL, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        ((WMH) LJIILLIIL).registerChildSceneLifecycleCallbacks(new GF5(this, listener), true);
    }
}
