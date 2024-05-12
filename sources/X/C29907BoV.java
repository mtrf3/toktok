package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BoV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29907BoV {
    public static final /* synthetic */ int LJIIL = 0;
    public final Room LIZ;
    public final DataChannel LIZIZ;
    public final boolean LIZJ;
    public final C5H3 LIZLLL;
    public final C5H3 LJ;
    public final C5H3 LJFF;
    public final C5H3 LJI;
    public final C5H3 LJII;
    public final C5H3 LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public final C5H3 LJIIJ;
    public final C5H3 LJIIJJI;

    public C29907BoV(Room room, DataChannel mDataChannel, AbsAudienceInteractionFragment fragment) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(mDataChannel, "mDataChannel");
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = room;
        this.LIZIZ = mDataChannel;
        this.LIZJ = fragment.isScreenPortrait();
        this.LIZLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 197));
        this.LJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 193));
        this.LJFF = C78996UzQ.LJJIJIIJI(C29908BoW.LJLIL);
        this.LJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 195));
        this.LJII = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 196));
        this.LJIIIIZZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 194));
        this.LJIIIZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 198));
        this.LJIIJ = C78996UzQ.LJJIJIIJI(C29909BoX.LJLIL);
        this.LJIIJJI = C78996UzQ.LJJIJIIJI(C29910BoY.LJLIL);
    }
}
