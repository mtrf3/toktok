package Y;

import X.B83;
import X.C0K2;
import X.C15070iV;
import X.C1FC;
import X.C29374Bfu;
import X.C31086CHy;
import X.C31087CHz;
import X.C31099CIl;
import X.C31309CQn;
import X.C73943T0h;
import X.CI0;
import X.CI5;
import X.InterfaceC05190Ih;
import X.InterfaceC64592gB;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.ChatMessageReplaceEvent;
import com.bytedance.android.live.room.CommentComboTrayEvent;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AfS0S0310100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0310100_5 afS0S0310100_5, Object obj) {
        List arrayList;
        Long l;
        Long l2;
        String str;
        LiveMode streamType;
        C31086CHy c31086CHy = (C31086CHy) afS0S0310100_5.l0;
        CI0 ci0 = (CI0) afS0S0310100_5.l1;
        boolean z = afS0S0310100_5.z3;
        ChatMessage chatMessage = (ChatMessage) afS0S0310100_5.l2;
        long j = afS0S0310100_5.j4;
        BaseResponse baseResponse = (BaseResponse) obj;
        c31086CHy.getClass();
        boolean z2 = true;
        C73943T0h.LIZ().LIZIZ(new C31099CIl(ci0, true));
        if (c31086CHy.mView == 0) {
            return;
        }
        ChatResult chatResult = (ChatResult) baseResponse.data;
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        long id = c31086CHy.LJLILLLLZI.getId();
        User user = chatResult.getUser();
        C1FC c1fc = ci0.LJII;
        if (c1fc != null) {
            arrayList = (List) c1fc.LJLJI;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        ChatMessage LJIILLIIL = C31309CQn.LJIILLIIL(id, chatResult, user, interfaceC05190Ih, arrayList, z);
        LJIILLIIL.LJLIL = String.valueOf(chatResult.getMsgId());
        LJIILLIIL.contentLanguage = chatResult.getContentLanguage();
        LJIILLIIL.userIdentity = chatResult.userIdentity;
        c31086CHy.dataChannel.qv0(ChatMessageReplaceEvent.class, new C15070iV(chatMessage, LJIILLIIL));
        if (chatResult.getCommentTray() != null) {
            c31086CHy.dataChannel.qv0(CommentComboTrayEvent.class, chatResult.getCommentTray());
        }
        ((CI5) c31086CHy.mView).tb0(LJIILLIIL, ci0);
        String str2 = ci0.LJI;
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat", 0.2d)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", SystemClock.uptimeMillis() - j);
                jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                Room room = C31087CHz.LIZIZ;
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                jSONObject.put("room_id", l);
                Room room2 = C31087CHz.LIZIZ;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l2 = null;
                }
                jSONObject.put("anchor_id", l2);
                if (str2 == null) {
                    z2 = false;
                }
                jSONObject.put("is_reply", z2);
                Room room3 = C31087CHz.LIZIZ;
                if (room3 != null && (streamType = room3.getStreamType()) != null) {
                    str = streamType.logStreamingType;
                } else {
                    str = null;
                }
                jSONObject.put("stream_type", str);
                jSONObject.put("length", chatResult.getContent().length());
            } catch (JSONException unused) {
            }
            C0K2.LIZLLL("ttlive_chat", new JSONObject(), null, jSONObject);
        }
        C31087CHz.LIZ.LIZIZ(chatResult.getMsgId(), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS0S0310100_5 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0310100_5.accept$1(Y.AfS0S0310100_5, java.lang.Object):void");
    }

    public AfS0S0310100_5(Object obj, Object obj2, boolean z, Object obj3, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
        this.j4 = j;
    }
}
