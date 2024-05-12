package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BhX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29475BhX {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final Room LIZLLL;
    public final User LJ;
    public final String LJFF;
    public final UserProfileEvent LJI;
    public final DataChannel LJII;

    public C29475BhX(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent event, DataChannel parentDataChannel) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(parentDataChannel, "parentDataChannel");
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = room;
        this.LJ = user;
        this.LJFF = str;
        this.LJI = event;
        this.LJII = parentDataChannel;
    }
}
