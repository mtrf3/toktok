package X;

import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAQ extends C0CJ {
    public final List<BannerInRoom> LJLIL;
    public final CAN LJLILLLLZI;
    public int LJLJI;
    public CAH LJLJJI;

    @Override // X.C0CJ
    public final void LIZ(int i) {
        if (i == 1) {
            this.LJLJJI = CAH.DRAG;
            CAN can = this.LJLILLLLZI;
            if (can != null) {
                can.LJIJ((BannerInRoom) ORZ.LJLLLLLL(this.LJLJI, this.LJLIL));
            }
        }
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        BannerInRoom bannerInRoom = (BannerInRoom) ORZ.LJLLLLLL(i, this.LJLIL);
        CAN can = this.LJLILLLLZI;
        if (can != null) {
            can.LJJIJIIJI(i, bannerInRoom, this.LJLJJI);
        }
        this.LJLJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CAQ(List<? extends BannerInRoom> bannerList, CAN can) {
        o.LJIIIZ(bannerList, "bannerList");
        this.LJLIL = bannerList;
        this.LJLILLLLZI = can;
        this.LJLJJI = CAH.AUTO_SCROLL;
    }
}
