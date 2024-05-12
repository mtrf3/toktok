package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.network.LiveGoalApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import webcast.api.room.RoomGoalsResponse;
import webcast.api.sub.GetSubGoalResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget$showIndicatorIfNeeded$1", f = "LiveGoalsWidget.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C6B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C6K LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ LiveGoalsWidget LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6B(LiveGoalsWidget liveGoalsWidget, boolean z, InterfaceC67352kd<? super C6B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = liveGoalsWidget;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6B(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C6K LIZIZ;
        User owner;
        String secUid;
        RoomGoalsResponse roomGoalsResponse;
        GetSubGoalResponse.Data data;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                LIZIZ = this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            LIZIZ = C6F.LIZIZ();
            LIZIZ.LJFF = System.currentTimeMillis();
            LiveGoalsWidget liveGoalsWidget = this.LJLJI;
            this.LJLIL = LIZIZ;
            this.LJLILLLLZI = 1;
            DataChannel dataChannel = liveGoalsWidget.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
            if (LJJIJLIJ == null || (owner = LJJIJLIJ.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                obj2 = null;
            } else {
                obj2 = ((LiveGoalApi) TTL.LIZ(LiveGoalApi.class, "get().getService(LiveGoalApi::class.java)")).getCurrentRoomGoals(C29306Beo.LJJIZ(liveGoalsWidget.dataChannel), secUid, 1, 1, 0L, 0, "", this);
            }
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (baseResponse != null && (roomGoalsResponse = (RoomGoalsResponse) baseResponse.data) != null) {
            this.LJLJI.getClass();
            GetResponse.Data data2 = roomGoalsResponse.liveGoal;
            if ((data2 == null || data2.ongoingGoal == null) && ((data = roomGoalsResponse.subGoal) == null || data.ongoingGoal == null)) {
                i2 = 0;
            }
            LIZIZ.LJI = System.currentTimeMillis();
            LIZIZ.LIZ(Integer.valueOf(i2), "multi_api_result");
            C6K LIZIZ2 = C6F.LIZIZ();
            long LIZ = C6F.LIZ(LIZIZ2.LJFF, LIZIZ2.LJI);
            HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
            hashMap.put("duration", Long.valueOf(LIZ));
            C6F.LIZJ("live_goal_data_filtered", hashMap);
            if (i2 != 0) {
                this.LJLJI.LJZI(this.LJLJJI);
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
