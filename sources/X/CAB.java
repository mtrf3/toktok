package X;

import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CAB extends AbstractC60811Ntn {
    public List<? extends BannerInRoom> LJLILLLLZI;
    public CAN LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        CAN can = this.LJLJI;
        if (can != null) {
            can.LJIIL();
        }
        List<? extends BannerInRoom> list = this.LJLILLLLZI;
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C38393F4z.LJFF(this.LJLILLLLZI));
        jSONObject.put("type", "init");
        view.LJIIIZ("H5_roomStatusChange", jSONObject);
        CAN can2 = this.LJLJI;
        if (can2 != null) {
            can2.LJJL();
        }
    }

    public CAB(List<? extends BannerInRoom> list, CAN can) {
        this.LJLILLLLZI = list;
        this.LJLJI = can;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        CAN can = this.LJLJI;
        if (can != null) {
            can.LJJZZIII(url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        CAN can = this.LJLJI;
        if (can != null) {
            can.LJIILLIIL(c60704Ns4.LIZIZ);
        }
    }
}
