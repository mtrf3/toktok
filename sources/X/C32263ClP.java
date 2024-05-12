package X;

import com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.gift.render.model.Effect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.ClP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32263ClP extends AbstractC78171Um7 implements InterfaceC78188UmO {
    public final C78160Ulw LIZ;
    public final Effect LIZIZ;
    public final C32265ClR LIZJ;
    public final /* synthetic */ LiveNewVideoGiftWidget LIZLLL;

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu enumC78220Umu) {
        C73943T0h.LIZ().LIZIZ(new u());
        this.LIZLLL.LLFII(true, false);
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZIZ(EnumC78220Umu enumC78220Umu) {
        InterfaceC21020s6 interfaceC21020s6;
        LiveCore liveCore;
        C32265ClR c32265ClR = this.LIZJ;
        if (c32265ClR != null && enumC78220Umu == EnumC78220Umu.ALPHA_PLAYER && (interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class)) != null && (liveCore = interfaceC21020s6.getLiveCore()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(c32265ClR.LJLIL));
            jSONObject.put("effect_id", String.valueOf(c32265ClR.LJLILLLLZI));
            jSONObject.put("price_level", String.valueOf(c32265ClR.LJLJI));
            jSONObject.put("current_anchor_effect_play_time", String.valueOf(c32265ClR.LJLJJI));
            C22950vD.LIZ(jSONObject);
            int addSeiField = liveCore.addSeiField("preview_gift_effect_sei_info", jSONObject, 1, false, false);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Writing SEI data: ");
            LIZ.append(jSONObject);
            LIZ.append(" res:");
            LIZ.append(addSeiField);
            C32444CoK.LIZ("writeEffectIdToSei", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu enumC78220Umu) {
        this.LIZLLL.LLFII(false, true);
        C88207Yjb.LJIIZILJ();
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.LIZLLL;
        C78160Ulw c78160Ulw = this.LIZ;
        Effect effect = this.LIZIZ;
        liveNewVideoGiftWidget.getClass();
        LiveNewVideoGiftWidget.LJZL(effect, c78160Ulw, "on stop", false);
        this.LIZLLL.LLFFF();
    }

    @Override // X.InterfaceC78188UmO
    public final void LJI(C78166Um2 c78166Um2) {
        this.LIZLLL.LLFII(false, true);
        C88207Yjb.LJIIZILJ();
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu enumC78220Umu) {
        CHK chk;
        CHK chk2;
        long j;
        long j2;
        long j3;
        long j4;
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.LIZLLL;
        C31996Ch6 c31996Ch6 = liveNewVideoGiftWidget.LJLILLLLZI;
        if (c31996Ch6 == null) {
            return;
        }
        Room room = liveNewVideoGiftWidget.LJLJJI;
        boolean z = liveNewVideoGiftWidget.LJLJJL;
        Long valueOf = Long.valueOf(c31996Ch6.LIZLLL);
        if (z) {
            C29702BlC LIZ = C18230nb.LIZ("ttlive_broadcast_action_all");
            LIZ.LJII("action", "play_gift");
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                j = 0;
            }
            LIZ.LJI(Long.valueOf(j), "action_id");
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
            }
            LIZ.LJI(Long.valueOf(j2), "user_id");
            if (room != null) {
                j3 = room.getId();
            } else {
                j3 = 0;
            }
            LIZ.LJI(Long.valueOf(j3), "room_id");
            LIZ.LJIIIZ();
            if (valueOf != null) {
                j4 = valueOf.longValue();
            } else {
                j4 = 0;
            }
            C04510Fr.LIZ.put("video_gift_id", String.valueOf(j4));
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                if (longValue != 0) {
                    C31014CFe.LIZLLL.put("video_gift_id", String.valueOf(longValue));
                }
            }
            C31014CFe.LIZLLL.remove("video_gift_id");
        }
        long j5 = this.LIZLLL.LJLILLLLZI.LIZLLL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) C88207Yjb.LJ;
        C5H3 c5h3 = (C5H3) linkedHashMap.get("gift_play");
        if (c5h3 != null && (chk2 = (CHK) c5h3.getValue()) != null) {
            chk2.LJIIIZ = j5;
        }
        C5H3 c5h32 = (C5H3) linkedHashMap.get("gift_play");
        if (c5h32 != null && (chk = (CHK) c5h32.getValue()) != null) {
            chk.start();
        }
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu enumC78220Umu, C78163Ulz c78163Ulz) {
        this.LIZLLL.LLFII(false, true);
        C88207Yjb.LJIIZILJ();
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.LIZLLL;
        C78160Ulw c78160Ulw = this.LIZ;
        Effect effect = this.LIZIZ;
        String str = c78163Ulz.LIZIZ;
        liveNewVideoGiftWidget.getClass();
        LiveNewVideoGiftWidget.LJZL(effect, c78160Ulw, str, false);
        int i = c78163Ulz.LIZ;
        if (i != -27 && i != -31) {
            LiveNewVideoGiftWidget liveNewVideoGiftWidget2 = this.LIZLLL;
            liveNewVideoGiftWidget2.LLFF(liveNewVideoGiftWidget2.LJLILLLLZI);
        }
        this.LIZLLL.LLFFF();
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu enumC78220Umu, C78165Um1 c78165Um1) {
        this.LIZLLL.LLFII(false, true);
        C04510Fr.LIZ.remove("video_gift_id");
        C31014CFe.LIZLLL.remove("video_gift_id");
        C88207Yjb.LJIIZILJ();
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.LIZLLL;
        C78160Ulw c78160Ulw = this.LIZ;
        Effect effect = this.LIZIZ;
        liveNewVideoGiftWidget.getClass();
        LiveNewVideoGiftWidget.LJZL(effect, c78160Ulw, "", true);
        this.LIZLLL.LLFFF();
        C32146CjW.LIZJ(this.LIZLLL.dataChannel, "after_gift_animation", null);
        C32268ClU.LIZ.incrementAndGet();
    }

    public C32263ClP(LiveNewVideoGiftWidget liveNewVideoGiftWidget, C78160Ulw c78160Ulw, Effect effect, C32265ClR c32265ClR) {
        this.LIZLLL = liveNewVideoGiftWidget;
        this.LIZ = c78160Ulw;
        this.LIZIZ = effect;
        this.LIZJ = c32265ClR;
    }
}
