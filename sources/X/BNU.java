package X;

import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class BNU implements Callable {
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLIL = false;
    public final /* synthetic */ int LJLJI = 4;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C28467BFf<Room> c28467BFf = ((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).getRoomStats(this.LJLIL, this.LJLILLLLZI, this.LJLJI).execute().LIZIZ;
        R r = c28467BFf.extra;
        if (r != 0) {
            c28467BFf.data.nowTime = r.now / 1000;
        }
        return c28467BFf.data;
    }

    public BNU(long j) {
        this.LJLILLLLZI = j;
    }
}
