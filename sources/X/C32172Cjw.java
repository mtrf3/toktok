package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Cjw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32172Cjw {
    public static final /* synthetic */ int LJFF = 0;
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public final Room LIZLLL;
    public final C73318Sq2 LJ;

    public C32172Cjw(Context context, LifecycleOwner lifeCycleOwner, DataChannel dataChannel, Room room) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        o.LJIIIZ(room, "room");
        this.LIZ = context;
        this.LIZIZ = lifeCycleOwner;
        this.LIZJ = dataChannel;
        this.LIZLLL = room;
        this.LJ = new C73318Sq2();
    }
}
