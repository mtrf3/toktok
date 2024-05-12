package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B50 implements B51 {
    public final List<B51> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public B50(List<? extends B51> listeners) {
        o.LJIIIZ(listeners, "listeners");
        this.LIZ = listeners;
    }

    @Override // X.B51
    public final void LIZ(Fragment fragment, Room room) {
        o.LJIIIZ(fragment, "fragment");
        Iterator<B51> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(fragment, room);
        }
    }

    @Override // X.B51
    public final void LIZIZ(LivePlayFragment fragment, Room room, long j) {
        o.LJIIIZ(fragment, "fragment");
        Iterator<B51> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(fragment, room, j);
        }
    }
}
