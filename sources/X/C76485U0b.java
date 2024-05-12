package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import java.util.HashMap;

/* renamed from: X.U0b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76485U0b<V extends View> {
    public final DataChannel LIZ;
    public final V LIZIZ;
    public final java.util.Map<Class<? extends NextLiveData>, InterfaceC76501U0r> LIZJ;

    public C76485U0b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C76485U0b(DataChannel dataChannel, View view, C76484U0a c76484U0a) {
        this.LIZJ = new HashMap();
        this.LIZ = dataChannel;
        this.LIZIZ = view;
        InterfaceC76502U0s<V> interfaceC76502U0s = c76484U0a.LJFF;
        if (interfaceC76502U0s != null) {
            interfaceC76502U0s.LIZ(view);
        }
        do {
            final C76486U0c c76486U0c = c76484U0a.LJI;
            if (c76486U0c != null) {
                ((HashMap) this.LIZJ).put(c76486U0c.LIZ, c76486U0c.LIZIZ);
                this.LIZ.mv0(c76486U0c.LIZ, this, new InterfaceC88472Yns() { // from class: X.U0d
                    @Override // X.InterfaceC88472Yns
                    public final Object invoke(Object obj) {
                        C76485U0b c76485U0b = C76485U0b.this;
                        C76486U0c c76486U0c2 = c76486U0c;
                        c76485U0b.getClass();
                        Class<? extends NextLiveData> cls = c76486U0c2.LIZ;
                        if (cls == null || obj == null || !((HashMap) c76485U0b.LIZJ).keySet().contains(cls) || ((HashMap) c76485U0b.LIZJ).get(cls) == null) {
                            return null;
                        }
                        ((InterfaceC76501U0r) ((HashMap) c76485U0b.LIZJ).get(cls)).LIZ(c76485U0b.LIZIZ, obj);
                        return null;
                    }
                });
            }
            c76484U0a = c76484U0a.LIZ;
        } while (c76484U0a != null);
    }
}
