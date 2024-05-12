package Y;

import X.C29982Bpi;
import X.C31811Ce7;
import X.InterfaceC29986Bpm;
import X.InterfaceC64592gB;
import X.X1D;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class AfS0S0101100_5 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0101100_5 afS0S0101100_5, Object obj) {
        int i;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.statusCode != 0 && (i = afS0S0101100_5.i1) > 0) {
            ((CoHostFriendNoticeService) afS0S0101100_5.l0).LIZJ(i - 1, afS0S0101100_5.j2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request logId == ");
        C31811Ce7.LJ(LIZ, baseResponse.LIZIZ, LIZ, "CoHostFriendNoticeService");
        String str = baseResponse.LIZIZ;
        if (str != null) {
            ((CoHostFriendNoticeService) afS0S0101100_5.l0).LJLIL.add(str);
        }
    }

    public static final void accept$1(AfS0S0101100_5 afS0S0101100_5, Object obj) {
        int i = afS0S0101100_5.i1;
        if (i > 0) {
            ((CoHostFriendNoticeService) afS0S0101100_5.l0).LIZJ(i - 1, afS0S0101100_5.j2);
        }
    }

    public static final void accept$2(AfS0S0101100_5 afS0S0101100_5, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS0S0101100_5.l0;
        int i = afS0S0101100_5.i1;
        long j = afS0S0101100_5.j2;
        likeHelper.getClass();
        Room room = likeHelper.LJLJI;
        C29982Bpi.LIZIZ(i, room, String.valueOf(room.getOwnerUserId()), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS0S0101100_5 afS0S0101100_5, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS0S0101100_5.l0;
        int i = afS0S0101100_5.i1;
        long j = afS0S0101100_5.j2;
        BaseResponse baseResponse = (BaseResponse) obj;
        likeHelper.getClass();
        if (baseResponse != null && baseResponse.data != 0) {
            Iterator it = ((ArrayList) likeHelper.LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC29986Bpm) it.next()).dc(likeHelper, ((LikeResponse.Data) baseResponse.data).result);
            }
        }
        Room room = likeHelper.LJLJI;
        C29982Bpi.LIZIZ(i, room, String.valueOf(room.getOwnerUserId()), j);
    }

    public AfS0S0101100_5(int i, Object obj, long j, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
        this.j2 = j;
    }
}
