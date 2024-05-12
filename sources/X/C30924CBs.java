package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SubWaveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CBs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30924CBs implements OnIMMessageListener, InterfaceC30925CBt, InterfaceC72822Si2 {
    public IMessageManager LJLIL;
    public Context LJLILLLLZI;
    public boolean LJLJI;
    public DataChannel LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "sub_wave";
    }

    @Override // X.InterfaceC30925CBt
    public final void onUnload() {
        C01E c01e;
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null && (c01e = (C01E) dataChannel.kv0(C29P.class)) != null) {
            ((ConcurrentHashMap) c01e.LIZ).remove(InterfaceC30925CBt.class);
        }
        C72818Shy.LJII("live_indicator_has_ongoing_sub_wave", this);
        this.LJLJJL = false;
        this.LJLILLLLZI = null;
        this.LJLJJI = null;
        this.LJLIL = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static JSONObject LIZJ(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                o.LJIIIIZZ(obj, "this.get(key)");
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    LIZJ(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof Long) {
                    jSONObject.put(next, obj.toString());
                }
            } catch (Exception e) {
                C0NB.LJI("SubWaveHelper", e);
            }
        }
        return jSONObject;
    }

    @Override // X.InterfaceC30925CBt
    public final boolean LIZ(EmoteModel emoteModel) {
        String userWavePopup;
        o.LJIIIZ(emoteModel, "emoteModel");
        if (this.LJLJL && emoteModel.emotePrivateType == 1) {
            Context context = this.LJLILLLLZI;
            if (this.LJLJI) {
                userWavePopup = SubWaveLynxUrlSetting.INSTANCE.getAnchorWavePopup();
            } else {
                userWavePopup = SubWaveLynxUrlSetting.INSTANCE.getUserWavePopup();
            }
            C31847Ceh.LJIIIIZZ(context, userWavePopup, C51029K0z.LJJIIZI(new OSZ("show_entrance", "emote")));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30925CBt
    public final void LIZIZ(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        boolean z;
        long j;
        Resources resources;
        Room room;
        if (iMessage instanceof SubWaveMessage) {
            SubWaveMessage subWaveMessage = (SubWaveMessage) iMessage;
            SubWaveImMsg subWaveImMsg = subWaveMessage.subWaveImMsg;
            if (subWaveImMsg != null) {
                num = Integer.valueOf(subWaveImMsg.msgType);
            } else {
                num = null;
            }
            if (num == null || (num.intValue() != 0 && num.intValue() != 1)) {
                z = false;
            } else {
                z = true;
            }
            this.LJLJL = z;
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, iMessage);
            o.LJIIIIZZ(json, "get().toJson(message)");
            try {
                JSONObject jSONObject = new JSONObject(json);
                LIZJ(jSONObject);
                C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "live_subscription_wave_indicator_message"));
            } catch (Exception e) {
                C0NB.LJII(e);
            }
            if (!this.LJLJJLL) {
                this.LJLJJLL = true;
                InterfaceC06390Mx LIZ = CN1.LIZ(ISubscribeService.class);
                o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                ((ISubscribeService) LIZ).cI();
                C31106CIs.LJ(1);
            }
            SubWaveImMsg subWaveImMsg2 = subWaveMessage.subWaveImMsg;
            if (subWaveImMsg2 != null && subWaveImMsg2.msgType == 3) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.oj4);
                DataChannel dataChannel = this.LJLJJI;
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                RoomMessage LJIJ = C31309CQn.LJIJ(j, LJIILJJIL);
                IMessageManager iMessageManager = this.LJLIL;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(LJIJ, true);
                }
                if (this.LJLJJL) {
                    Context context = this.LJLILLLLZI;
                    if (context != null && (resources = context.getResources()) != null) {
                        InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
                        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
                        ((ISubscribeService) LIZ2).cI();
                        C31106CIs.LIZ.LIZIZ(0, resources);
                        return;
                    }
                    return;
                }
                InterfaceC06390Mx LIZ3 = CN1.LIZ(ISubscribeService.class);
                o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
                ((ISubscribeService) LIZ3).cI();
                C31106CIs.LJ(0);
            }
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        if (o.LJ(c199097rd.LJLIL, "live_indicator_has_ongoing_sub_wave")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "roomId", "");
            } else {
                str = null;
            }
            if (o.LJ(str, String.valueOf(C29306Beo.LJJIZ(this.LJLJJI)))) {
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                boolean z = false;
                if (interfaceC78280Uns2 != null) {
                    z = u.LJJIIZI(interfaceC78280Uns2, "hasOngoing", false);
                }
                this.LJLJL = z;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (X.C29306Beo.LJIIJ(r5) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r4, com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            r3 = this;
            r3.LJLILLLLZI = r4
            r2 = 0
            if (r5 == 0) goto L40
            boolean r1 = X.C29306Beo.LJIIJ(r5)
            r0 = 1
            if (r1 != r0) goto L40
        Lc:
            r3.LJLJI = r0
            r3.LJLJJI = r5
            if (r5 == 0) goto L3e
            java.lang.Class<X.Bop> r0 = X.C29927Bop.class
            java.lang.Object r1 = r5.kv0(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r1
        L1a:
            r3.LJLIL = r1
            if (r1 == 0) goto L27
            X.CYf r0 = X.EnumC31509CYf.SUB_WAVE_MESSAGE
            int r0 = r0.getIntType()
            r1.addMessageListener(r0, r3)
        L27:
            if (r5 == 0) goto L38
            java.lang.Class<X.CBt> r1 = X.InterfaceC30925CBt.class
            java.lang.Class<X.29P> r0 = X.C29P.class
            java.lang.Object r0 = r5.kv0(r0)
            X.01E r0 = (X.C01E) r0
            if (r0 == 0) goto L38
            r0.LIZIZ(r1, r3, r2)
        L38:
            java.lang.String r0 = "live_indicator_has_ongoing_sub_wave"
            X.C72818Shy.LIZLLL(r0, r3)
            return
        L3e:
            r1 = 0
            goto L1a
        L40:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30924CBs.LIZLLL(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
