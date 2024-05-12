package X;

import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.education.GameLiveNewBroadcastEduNotificationHelperKt$tryShowStartGameLive2MinTipsTask$1", f = "GameLiveNewBroadcastEduNotificationHelper.kt", l = {114}, m = "invokeSuspend")
/* renamed from: X.2EG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GameBroadcastFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2EG(GameBroadcastFragment gameBroadcastFragment, InterfaceC67352kd<? super C2EG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gameBroadcastFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2EG(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(120000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean isAppForeground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
        if (C30922CBq.LIZIZ) {
            StringBuilder LJI = JBR.LJI("tryShowStartGameLive2MinTipsTask. isForeground=", isAppForeground, ". Thread=");
            LJI.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("GameBroadcastFragment", X1D.LIZIZ(LJI));
        }
        if (isAppForeground) {
            C78926UyI.LJJJJ(EnumC14070gt.First2Min, EnumC14060gs.InApp);
            IMessageManager iMessageManager = (IMessageManager) this.LJLILLLLZI.LJIIL().kv0(C29927Bop.class);
            Room room = (Room) this.LJLILLLLZI.LJIIL().kv0(RoomChannel.class);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.len);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            RoomMessage LJIJ = C31309CQn.LJIJ(j, LJIILJJIL);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(LJIJ, true);
            }
        } else {
            C78926UyI.LJJJJ(EnumC14070gt.First2Min, EnumC14060gs.Hover);
            C37661dq c37661dq = this.LJLILLLLZI.LJZ;
            if (c37661dq != null) {
                int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_FIRST_START_LIVE_2MIN.ordinal();
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.len);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_gamelive_guide_scene_time)");
                C12B.LIZ(c37661dq, true, ordinal, LJIILJJIL2, 8);
            }
        }
        return C76800UCe.LIZ;
    }
}
