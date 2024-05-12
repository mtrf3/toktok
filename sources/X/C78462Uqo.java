package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78462Uqo implements InterfaceC251799uR {
    public final /* synthetic */ C78461Uqn LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ EnterRoomConfig LIZJ;
    public final /* synthetic */ long[] LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ User LJFF;

    @Override // X.InterfaceC251799uR
    public final void LIZ(User user) {
        C78461Uqn.LIZLLL = false;
        if (user == null) {
            return;
        }
        this.LIZ.getClass();
        if (!C78461Uqn.LIZ(user)) {
            C5S1 c5s1 = new C5S1(this.LIZIZ);
            c5s1.LIZJ(R.string.paq);
            c5s1.LJ();
            return;
        }
        EnterRoomConfig enterRoomConfig = this.LIZJ;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomIds = this.LIZLLL;
        roomsData.enterFromMerge = "message";
        roomsData.enterMethod = "live_cell";
        enterRoomConfig.mLogData.positionOutsideLiveRoom = this.LJ;
        this.LIZ.LJIIZILJ(this.LIZIZ, this.LJFF, enterRoomConfig);
    }

    @Override // X.InterfaceC251799uR
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        C78461Uqn.LIZLLL = false;
    }

    public C78462Uqo(C78461Uqn c78461Uqn, Context context, EnterRoomConfig enterRoomConfig, long[] jArr, int i, User user) {
        this.LIZ = c78461Uqn;
        this.LIZIZ = context;
        this.LIZJ = enterRoomConfig;
        this.LIZLLL = jArr;
        this.LJ = i;
        this.LJFF = user;
    }
}
