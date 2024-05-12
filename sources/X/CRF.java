package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* loaded from: classes6.dex */
public final class CRF {
    public boolean LIZ;
    public boolean LIZJ;
    public Room LJFF;
    public InterfaceC31392CTs LJI;
    public LifecycleOwner LJII;
    public IMessageManager LJIIIIZZ;
    public String LIZIZ = "";
    public String LIZLLL = "";
    public boolean LJ = true;

    public final String LIZ() {
        if (this.LIZLLL.length() > 0) {
            return this.LIZLLL;
        }
        return this.LIZIZ;
    }

    public final boolean LIZIZ() {
        if (this.LIZJ && this.LJ) {
            return true;
        }
        return false;
    }
}
