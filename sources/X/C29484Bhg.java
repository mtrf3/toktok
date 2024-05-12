package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bhg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29484Bhg {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final C29456BhE LIZJ;
    public final InterfaceC28822BSw LIZLLL;
    public final boolean LJ;
    public final Room LJFF;
    public final String LJI;
    public final C11030bz LJII;
    public final DataChannel LJIIIIZZ;
    public final long LJIIIZ;

    public C29484Bhg(Context context, LiveProfileDialog liveProfileDialog, C29456BhE c29456BhE, LiveProfileDialog liveProfileDialog2, boolean z, Room room, String str, C11030bz c11030bz, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = context;
        this.LIZIZ = liveProfileDialog;
        this.LIZJ = c29456BhE;
        this.LIZLLL = liveProfileDialog2;
        this.LJ = z;
        this.LJFF = room;
        this.LJI = str;
        this.LJII = c11030bz;
        this.LJIIIIZZ = dataChannel;
        this.LJIIIZ = c29456BhE.LIZJ;
    }
}
