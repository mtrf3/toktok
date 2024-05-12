package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.B8c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28282B8c {
    public static final /* synthetic */ int LIZLLL = 0;
    public final DataChannel LIZ;
    public final ArrayList<YA9> LIZIZ = new ArrayList<>();
    public final List<String> LIZJ;

    public final boolean LIZIZ() {
        Boolean bool;
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class);
        Object obj = null;
        if (iProgrammedLiveService != null) {
            bool = Boolean.valueOf(iProgrammedLiveService.lj());
        } else {
            bool = null;
        }
        boolean rk = ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk();
        boolean Rb = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Rb(Long.valueOf(C29306Beo.LJJIZ(this.LIZ)));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BCW.class);
        }
        if (o.LJ(bool, Boolean.FALSE) && !rk && !Rb && o.LJ(obj, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public C28282B8c(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        arrayList.clear();
    }

    public final boolean LIZ(YA9 widget) {
        o.LJIIIZ(widget, "widget");
        for (String str : this.LIZJ) {
            Class<?> cls = widget.getClass();
            if (!s.LJJJLZIJ(cls.getName(), str, false)) {
                for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                    if (!s.LJJJLZIJ(superclass.getName(), str, false)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
