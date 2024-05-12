package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback;

import X.C05170If;
import X.C221108m2;
import X.C29306Beo;
import X.C31657Cbd;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C72818Shy;
import X.C73318Sq2;
import X.C74636TQy;
import X.C74688TSy;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC40159FpT;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC75560Tl6;
import X.TBT;
import X.TQ4;
import X.TQS;
import X.TTE;
import X.TYQ;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDisconnectFeedbackUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC75560Tl6(name = "MULTI_GUEST_FEEDBACK_OF_DISCONNECT")
/* loaded from: classes14.dex */
public final class MultiGuestFeedbackController implements TQ4 {
    public static final TQS LJIIJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIIJJI;
    public final Room LIZ;
    public final User LIZIZ;
    public final Context LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public SparkContext LJIIIIZZ;
    public final C31657Cbd LJ = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public String LJFF = "";
    public String LJI = "";
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C74688TSy.LJLIL);
    public final TTE LJIIIZ = new TTE(this);

    static {
        TBT tbt = new TBT(MultiGuestFeedbackController.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJIIJJI = new InterfaceC74236TBo[]{tbt};
        LJIIJ = new TQS();
    }

    @Override // X.TQ4
    public final void LJFF() {
        C72818Shy.LJII("Multi_guest_feedback_submit", this.LJIIIZ);
        ((C73318Sq2) this.LJII.getValue()).LIZLLL();
        LJI();
    }

    public final void LJI() {
        InterfaceC40159FpT LJIILL;
        SparkContext sparkContext = this.LJIIIIZZ;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.TQ4
    public final InterfaceC65784Pro<C76800UCe> LIZ() {
        return this.LIZLLL;
    }

    @Override // X.TQ4
    public final void LIZJ() {
        LJI();
    }

    @Override // X.TQ4
    public final boolean LIZIZ(C74636TQy c74636TQy) {
        String str;
        boolean LJIJJLI = C29306Beo.LJIJJLI(MultiGuestDisconnectFeedbackUrlSetting.INSTANCE.getUrl());
        TQS tqs = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canShowFeedbackDialogBeforeDisconnected ");
        LIZ.append(LJIJJLI);
        LIZ.append(' ');
        LIZ.append(true);
        LIZ.append(' ');
        String msg = X1D.LIZIZ(LIZ);
        tqs.getClass();
        o.LJIIIZ(msg, "msg");
        TYQ.LIZ("MultiGuestFeedbackController", msg);
        if (!LJIJJLI) {
            return false;
        }
        Room room = this.LIZ;
        User guestUser = this.LIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LJ.LIZ(this, LJIIJJI[0]);
        if (multiGuestDataHolder != null) {
            str = multiGuestDataHolder.LJIIIIZZ();
        } else {
            str = "no_permission";
        }
        o.LJIIIZ(room, "room");
        o.LJIIIZ(guestUser, "guestUser");
        c74636TQy.LJLILLLLZI = String.valueOf(guestUser.getId());
        String LIZ2 = C05170If.LIZ(room.getOwner());
        o.LJIIIIZZ(LIZ2, "getDisplayName(room.owner)");
        c74636TQy.LJLJI = LIZ2;
        c74636TQy.LJLJJI = String.valueOf(room.getOwnerUserId());
        String idStr = room.getIdStr();
        if (idStr == null) {
            idStr = "";
        }
        c74636TQy.LJLJJL = idStr;
        c74636TQy.LJLJJLL = str;
        c74636TQy.LJLJL = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().feedback);
        sb.append("&guest_id=");
        sb.append(c74636TQy.LJLILLLLZI);
        sb.append("&room_id=");
        sb.append(c74636TQy.LJLJJL);
        sb.append("&anchor_id=");
        sb.append(c74636TQy.LJLJJI);
        sb.append("&disconnection_type=");
        sb.append(c74636TQy.LJLIL);
        sb.append("&guest_permission=");
        sb.append(c74636TQy.LJLJJLL);
        sb.append("&username=");
        sb.append(c74636TQy.LJLJI);
        sb.append("&multi_guest_disconnect_feedback=");
        sb.append(c74636TQy.LJLJL);
        sb.append("&track_info=");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkmic_id", this.LJI);
        jSONObject.put("channel_id", this.LJFF);
        jSONObject.put("room_id", c74636TQy.LJLJJL);
        sb.append(jSONObject);
        String sb2 = sb.toString();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("showFeedbackLynxDialog ");
        LIZ3.append(sb2);
        String msg2 = X1D.LIZIZ(LIZ3);
        o.LJIIIZ(msg2, "msg");
        TYQ.LIZ("MultiGuestFeedbackController", msg2);
        LJI();
        InterfaceC06390Mx LIZ4 = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ4, "getService(T::class.java)");
        this.LJIIIIZZ = ((IHybridContainerService) LIZ4).Vs0(this.LIZJ, sb2, null);
        return true;
    }

    @Override // X.TQ4
    public final void LIZLLL(String str) {
        this.LJFF = str;
    }

    @Override // X.TQ4
    public final void LJ(String str) {
        this.LJI = str;
    }

    public MultiGuestFeedbackController(Room room, User user, Context context, AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZ = room;
        this.LIZIZ = user;
        this.LIZJ = context;
        this.LIZLLL = aqS163S0100000_13;
    }
}
