package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class CAA {
    public Context LJLIL;
    public final List<BannerInRoom> LJLILLLLZI;
    public final boolean LJLJI;
    public final Room LJLJJI;
    public NewTopRightBannerWidget LJLJJL;
    public final boolean LJLJJLL = true;

    public void LIZ(IMessage message) {
        o.LJIIIZ(message, "message");
    }

    public void LIZIZ() {
    }

    public abstract View LIZJ();

    public long LIZLLL() {
        return 0L;
    }

    public void LJFF() {
    }

    public void LJI() {
    }

    public void LJII(boolean z) {
    }

    public void LJIIIIZZ(C30898CAs linkState) {
        o.LJIIIZ(linkState, "linkState");
    }

    public void LJIIIZ(C29383Bg3 c29383Bg3) {
    }

    public void LJIIJ(boolean z) {
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public boolean LJIILIIL(IMessage message) {
        o.LJIIIZ(message, "message");
        return false;
    }

    public boolean LJ() {
        return this.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CAA(Context context, List<? extends BannerInRoom> list, boolean z, Room room) {
        this.LJLIL = context;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
        this.LJLJJI = room;
    }
}
