package X;

import Y.IDcS172S0100000_13;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75849Tpl extends AbstractC75856Tps {
    public static final /* synthetic */ int LIZJ = 0;
    public final C75851Tpn LIZIZ;

    @Override // X.AbstractC75856Tps, X.InterfaceC75855Tpr
    public final String tag() {
        return "MultiCoHostExclusiveDialog";
    }

    @Override // X.InterfaceC75855Tpr
    public final void show() {
        Long l;
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = C15380j0.LJIILJJIL(this.LIZIZ.LIZIZ.getButtonResId());
        c39471gl.LIZJ = new IDcS172S0100000_13(this, 17);
        C39481gm c39481gm = new C39481gm(c39471gl);
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.kko);
        c39491gn.LIZJ = new IDcS172S0100000_13(this, 16);
        C39501go c39501go = new C39501go(c39491gn);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZIZ = 2;
        anonymousClass175.LIZ(c39481gm);
        anonymousClass175.LIZ(c39501go);
        AnonymousClass176 anonymousClass176 = new AnonymousClass176(anonymousClass175);
        C47071t1 c47071t1 = new C47071t1(this.LIZIZ.LIZ);
        c47071t1.LIZJ = C15380j0.LJIILJJIL(this.LIZIZ.LIZIZ.getTitleResId());
        c47071t1.LJII(C15380j0.LJIILJJIL(this.LIZIZ.LIZIZ.getContentResId()));
        c47071t1.LIZJ(anonymousClass176);
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        String withdrawType = this.LIZIZ.LIZIZ.getLabel();
        o.LJIIIZ(withdrawType, "withdrawType");
        HashMap hashMap = new HashMap();
        hashMap.put("withdraw_type", withdrawType);
        hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        if (o.LJ(withdrawType, EnumC75769ToT.APPLY_INVITE.getLabel()) || o.LJ(withdrawType, EnumC75769ToT.APPLY_PAIR.getLabel())) {
            Room room = B5G.LIZIZ().LJJIIJ;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            List LJJIJIL = C47261Igj.LJJIJIL(l);
            RivalExtraInfo rivalExtraInfo = B5G.LIZIZ().LJJIIJZLJL;
            if (rivalExtraInfo != null && (linkerInfo = rivalExtraInfo.linkerInfo) != null && (list = linkerInfo.linkedUsers) != null) {
                ArrayList arrayList = new ArrayList();
                for (UserInfo userInfo : list) {
                    long j = userInfo.user_id;
                    if (l == null || j != l.longValue()) {
                        arrayList.add(userInfo);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LJJIJIL.add(Long.valueOf(((UserInfo) it.next()).user_id));
                }
            }
            hashMap.put("uid_list", LJJIJIL.toString());
        } else {
            C75642TmQ.LJIIIIZZ(hashMap);
        }
        C75642TmQ.LJJLIIJ("livesdk_connection_switch_popup_show", hashMap);
        LiveDialog LIZ = c47071t1.LIZ();
        this.LIZ = LIZ;
        C16880lQ.LIZ(LIZ);
    }

    public C75849Tpl(C75851Tpn c75851Tpn) {
        this.LIZIZ = c75851Tpn;
    }
}
