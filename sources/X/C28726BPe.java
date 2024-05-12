package X;

import android.app.Activity;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.BPe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28726BPe extends AbstractC65781Prl implements InterfaceC88472Yns<m, C76800UCe> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C31954CgQ LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28726BPe(ActivityC45651qj activityC45651qj, String str, C31954CgQ c31954CgQ, String str2) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = c31954CgQ;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(m mVar) {
        int i;
        String str;
        Long l;
        User owner;
        FollowInfo followInfo;
        User owner2;
        String l2;
        String str2;
        m $receiver = mVar;
        o.LJIIIZ($receiver, "$this$$receiver");
        if (this.LJLIL.getRequestedOrientation() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        $receiver.LJJIIJ("orientation", Integer.valueOf(i));
        $receiver.LJJIIZ("initTimestamp", String.valueOf(System.currentTimeMillis()));
        $receiver.LJJIIZ("theme", this.LJLILLLLZI);
        $receiver.LJJIIZ("containerID", this.LJLJI.LJLILLLLZI);
        String str3 = this.LJLJI.LJLIL;
        if (str3 == null || ujb.o.LJJJJJL(str3)) {
            str = this.LJLJJI;
        } else {
            str = this.LJLJI.LJLIL;
        }
        m mVar2 = new m();
        try {
            android.net.Uri parse = UriProtector.parse(str);
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
            o.LJIIIIZZ(queryParameterNames, "this.queryParameterNames");
            for (String str4 : queryParameterNames) {
                mVar2.LJJIIZ(str4, UriProtector.getQueryParameter(parse, str4));
            }
            boolean LJJIJLIJ = mVar2.LJJIJLIJ("room_id");
            String str5 = CardStruct.IStatusCode.DEFAULT;
            if (!LJJIJLIJ) {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room == null || (str2 = Long.valueOf(room.getId()).toString()) == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                mVar2.LJJIIZ("room_id", str2);
            }
            if (!mVar2.LJJIJLIJ("user_id")) {
                mVar2.LJJIIZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            }
            if (!mVar2.LJJIJLIJ("anchor_id")) {
                Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room2 != null && (owner2 = room2.getOwner()) != null && (l2 = Long.valueOf(owner2.getId()).toString()) != null) {
                    str5 = l2;
                }
                mVar2.LJJIIZ("anchor_id", str5);
            }
            if (!mVar2.LJJIJLIJ("follow_status")) {
                Room room3 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room3 != null && (owner = room3.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                    l = Long.valueOf(followInfo.getFollowStatus());
                } else {
                    l = null;
                }
                mVar2.LJJIIJ("follow_status", l);
            }
            EnterRoomConfig.RoomsData roomsData = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData;
            if (!mVar2.LJJIJLIJ("enter_from_merge")) {
                mVar2.LJJIIZ("enter_from_merge", roomsData.enterFromMerge);
            }
            if (!mVar2.LJJIJLIJ("enter_method")) {
                mVar2.LJJIIZ("enter_method", roomsData.enterMethod);
            }
            if (!mVar2.LJJIJLIJ("action_type")) {
                mVar2.LJJIIZ("action_type", roomsData.actionType);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        $receiver.LJJII("queryItems", mVar2);
        return C76800UCe.LIZ;
    }
}
