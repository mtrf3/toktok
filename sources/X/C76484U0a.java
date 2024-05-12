package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.HashSet;

/* renamed from: X.U0a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76484U0a<V extends View> {
    public C76484U0a<V> LIZ;
    public final U0Z LIZIZ;
    public final DataChannel LIZJ;
    public final V LIZLLL;
    public LifecycleOwner LJ;
    public InterfaceC76502U0s<V> LJFF;
    public C76486U0c LJI;

    public final C76485U0b<V> LIZ() {
        C76485U0b<V> c76485U0b = new C76485U0b<>(this.LIZJ, this.LIZLLL, this.LIZ);
        java.util.Set<C76485U0b> set = this.LIZIZ.LIZJ;
        if (set != null) {
            ((HashSet) set).add(c76485U0b);
        }
        return c76485U0b;
    }

    public final <T> C76484U0a<V> LIZIZ(Class<? extends NextLiveData> cls, InterfaceC76501U0r<V, T> interfaceC76501U0r) {
        this.LJI = new C76486U0c(cls, interfaceC76501U0r);
        C76484U0a<V> c76484U0a = new C76484U0a<>(this.LIZJ, this.LIZLLL, this.LIZIZ);
        c76484U0a.LJ = this.LJ;
        c76484U0a.LIZ = this;
        c76484U0a.LJFF = this.LJFF;
        return c76484U0a;
    }

    public C76484U0a(DataChannel dataChannel, V v, U0Z u0z) {
        this.LIZJ = dataChannel;
        this.LIZLLL = v;
        this.LIZIZ = u0z;
    }
}
