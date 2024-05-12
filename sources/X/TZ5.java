package X;

import com.bytedance.android.live.liveinteract.api.LinkAnchorInviteGuestSuccessEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZ5 implements InterfaceC75414Tik<InviteResult> {
    public final /* synthetic */ C74843TYx LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ TZQ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(InviteResult value) {
        o.LJIIIZ(value, "value");
        DataChannel dataChannel = this.LJLIL.LJLJJI;
        if (dataChannel != null) {
            dataChannel.pv0(LinkAnchorInviteGuestSuccessEvent.class);
        }
        java.util.Map<Long, String> map = C75147TeR.LJLJJLL;
        Long valueOf = Long.valueOf(this.LJLILLLLZI);
        String LIZ = C05170If.LIZ(this.LJLJI.LIZ);
        o.LJIIIIZZ(LIZ, "getDisplayName(event.user)");
        map.put(valueOf, LIZ);
        C30868C9o.LIZJ(R.string.mik);
        List LIZIZ = C74896TaO.LIZIZ(this.LJLILLLLZI);
        List LIZJ = C74896TaO.LIZJ(this.LJLILLLLZI);
        this.LJLIL.getMultiGuestDataHolder();
        long id = this.LJLJI.LIZ.getId();
        EnumC74778TWk LIZJ2 = C59994Ngc.LIZJ();
        String str = this.LJLJJI;
        Gson gson = C09650Zl.LIZJ;
        C75017TcL.LJFF(id, LIZJ2, str, GsonProtectorUtils.toJson(gson, LIZJ), GsonProtectorUtils.toJson(gson, LIZIZ), LIZIZ.size(), (int) this.LJLJI.LIZ.getFollowInfo().getFollowStatus(), true, this.LJLJJL, this.LJLIL.getMultiGuestDataHolder().LJII());
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th instanceof C29401Dk) {
            BPP.LIZJ(C15380j0.LIZLLL(), th);
        } else {
            C30868C9o.LJI(C15380j0.LJIILL(R.string.mht, C05170If.LIZ(this.LJLJI.LIZ)));
        }
        C75147TeR.LIZLLL(this.LJLILLLLZI, false);
    }

    public TZ5(C74843TYx c74843TYx, long j, TZQ tzq, String str, int i) {
        this.LJLIL = c74843TYx;
        this.LJLILLLLZI = j;
        this.LJLJI = tzq;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }
}
