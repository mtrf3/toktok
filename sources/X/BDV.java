package X;

import com.bytedance.android.live.broadcast.bgbroadcast.game.api.GameAutoCoverApi;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BDV<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;

    public BDV(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        int i;
        o.LJIIIZ(it, "it");
        C65814PsI.LIZ().getClass();
        GameAutoCoverApi gameAutoCoverApi = (GameAutoCoverApi) C65814PsI.LIZJ(GameAutoCoverApi.class);
        if (this.LJLIL) {
            i = 1;
        } else {
            i = 2;
        }
        return gameAutoCoverApi.updateScreenShotStatus(i);
    }
}
