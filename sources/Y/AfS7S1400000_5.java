package Y;

import X.ActivityC45651qj;
import X.B83;
import X.BGE;
import X.BH7;
import X.C16880lQ;
import X.C28274B7u;
import X.C28990BZi;
import X.C29029BaL;
import X.C29042BaY;
import X.C29044Baa;
import X.C29050Bag;
import X.C29152BcK;
import X.C29163BcV;
import X.C29165BcX;
import X.C29306Beo;
import X.C29374Bfu;
import X.C32537Cpp;
import X.C3Z;
import X.C7N;
import X.C88207Yjb;
import X.DialogC31813Ce9;
import X.InterfaceC31664Cbk;
import X.InterfaceC64592gB;
import X.OSZ;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.CommentFeatureChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import webcast.api.room.MockResponse;

/* loaded from: classes6.dex */
public class AfS7S1400000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final void accept$0(AfS7S1400000_5 afS7S1400000_5, Object obj) {
        String str = (String) ListProtector.get(((ImageModel) afS7S1400000_5.l1).getUrls(), 0);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) afS7S1400000_5.l2;
        C28274B7u.LIZ(str, afS7S1400000_5.s0, bool, (Integer) afS7S1400000_5.l3, bool2, ((Throwable) obj).getMessage());
        InterfaceC31664Cbk interfaceC31664Cbk = (InterfaceC31664Cbk) afS7S1400000_5.l4;
        if (interfaceC31664Cbk != null) {
            new IllegalStateException();
            interfaceC31664Cbk.onFail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.BcW, O] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    public static final void accept$1(AfS7S1400000_5 afS7S1400000_5, Object obj) {
        long j;
        BaseResponse baseResponse = (BaseResponse) obj;
        DialogC31813Ce9 dialogC31813Ce9 = (DialogC31813Ce9) afS7S1400000_5.l1;
        if (dialogC31813Ce9 != null) {
            C29306Beo.LJJJJ(dialogC31813Ce9);
        }
        MockResponse.Data data = (MockResponse.Data) baseResponse.data;
        if (data == null) {
            return;
        }
        if (data.room == null) {
            data.room = new Room();
        }
        ?? r6 = ((MockResponse.Data) baseResponse.data).room;
        if (r6 == 0) {
            return;
        }
        DataChannel dataChannel = (DataChannel) afS7S1400000_5.l2;
        r6.setId(0L);
        r6.setOwner(((C29374Bfu) B83.LIZ().LIZIZ()).LJ());
        r6.setOwnerUserId(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        if (r6.getRoomAuthStatus() == null) {
            r6.setRoomAuthStatus(new RoomAuthStatus());
        }
        r6.getRoomAuthStatus().enableChat = C29306Beo.LJJ((Boolean) dataChannel.kv0(CommentFeatureChannel.class));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29029BaL.class);
        C88207Yjb.LJFF();
        ((C32537Cpp) ((DataChannel) afS7S1400000_5.l2).gv0(BGE.class)).LIZ = 3;
        ((DataChannel) afS7S1400000_5.l2).rv0(StartLiveSuccessChannel.class, new OSZ(Boolean.TRUE, Long.valueOf(r6.getId())));
        ((C32537Cpp) dataChannelGlobal.gv0(C29044Baa.class)).LIZ = r6;
        if (BH7.LIZIZ((DataChannel) afS7S1400000_5.l2)) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = -1;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29042BaY.class)).LIZ = Long.valueOf(j);
        ArrayList<String> arrayList = null;
        ((C32537Cpp) dataChannelGlobal.gv0(C29050Bag.class)).LIZ = ((C29163BcV) afS7S1400000_5.l3).LIZ((Context) afS7S1400000_5.l4, (DataChannel) afS7S1400000_5.l2, null);
        C3Z c3z = C3Z.LIZ;
        String sdkParam = afS7S1400000_5.s0;
        c3z.getClass();
        o.LJIIIZ(sdkParam, "sdkParam");
        C3Z.LJII = true;
        C3Z.LJIIIIZZ = true;
        C3Z.LJI = sdkParam;
        MockResponse.GuideVideoURL guideVideoURL = ((MockResponse.Data) baseResponse.data).guideVideos;
        if (guideVideoURL != null) {
            arrayList = new ArrayList<>();
            arrayList.add(guideVideoURL.matchUrl);
            arrayList.add(guideVideoURL.interactUrl);
            arrayList.add(guideVideoURL.cohostUrl);
            arrayList.add(guideVideoURL.giftUrl);
            arrayList.add(guideVideoURL.multiguestUrl);
        }
        Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(C29306Beo.LIZIZ((Context) afS7S1400000_5.l4), C29152BcK.LIZ(LiveMode.VIDEO));
        createStartBroadcastIntent.putExtra("request_page", (String) ((DataChannel) afS7S1400000_5.l2).kv0(C28990BZi.class));
        createStartBroadcastIntent.putExtra("is_try_mode", true);
        createStartBroadcastIntent.putExtra("room_mock_id", ((MockResponse.Data) baseResponse.data).mockRoomId);
        createStartBroadcastIntent.putStringArrayListExtra("guide_videos", arrayList);
        C16880lQ.LIZJ((Context) afS7S1400000_5.l4, createStartBroadcastIntent);
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ((Context) afS7S1400000_5.l4);
        if (LIZIZ != null) {
            LIZIZ.finish();
        }
        ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ((Context) afS7S1400000_5.l4);
        if (LIZIZ2 != null) {
            LIZIZ2.overridePendingTransition(0, 0);
        }
        ((C29165BcX) C7N.LJ().startLiveManager()).onStartLive();
    }

    public AfS7S1400000_5(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.l4 = obj4;
    }
}
