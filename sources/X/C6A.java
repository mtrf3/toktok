package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.livesetting.banner.LiveGoalsWidgetLynxLoadDelayTimeSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveLiveGoalNetworkMaxDelaySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalIndicatorWebLinkSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget$showIndicator$2", f = "LiveGoalsWidget.kt", l = {352, 356}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C6A extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveGoalsWidget LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6A(LiveGoalsWidget liveGoalsWidget, boolean z, InterfaceC67352kd<? super C6A> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveGoalsWidget;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6A(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long LJIJ;
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS Lm0;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (!this.LJLILLLLZI.LJLJLLL) {
                if (this.LJLJI) {
                    LJIJ = LiveGoalsWidgetLynxLoadDelayTimeSetting.INSTANCE.getValue();
                } else {
                    LJIJ = C78842Uww.LJIJ(V0Q.Default, new C40517FvF(0, LiveLiveGoalNetworkMaxDelaySetting.INSTANCE.getValue())) * 1000;
                }
                if (LJIJ > 0) {
                    this.LJLIL = 1;
                    if (C1JD.LIZJ(LJIJ, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
        }
        LiveGoalsWidget liveGoalsWidget = this.LJLILLLLZI;
        Room room = liveGoalsWidget.LJLJJLL;
        if (room != null) {
            i = room.cppVersion;
        } else {
            i = 0;
        }
        String value = LiveStreamGoalIndicatorWebLinkSetting.INSTANCE.getValue();
        Context context = liveGoalsWidget.context;
        if (context != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C6K LIZIZ = C6F.LIZIZ();
            LIZIZ.LJII = currentTimeMillis;
            o.LJIIIZ(value, "<set-?>");
            LIZIZ.LIZLLL = value;
            C6I c6i = new C6I();
            c6i.LJIIIZ(value);
            c6i.LIZIZ.authority("lynxview_card");
            c6i.LJI(true);
            String uri = c6i.LIZ().toString();
            o.LJIIIIZZ(uri, "SparkCardSchemaBuilder.u…)\n            .toString()");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            Lm0 = ((IHybridContainerService) LIZ).Lm0(context, uri, "live_goal_indicator", true, new C6C(currentTimeMillis, liveGoalsWidget, i, value));
            if (C78598Ut0.LJII(Lm0) && Lm0 != null) {
                SparkContext sparkContext = Lm0.getSparkContext();
                if (sparkContext != null) {
                    C1JI.LJJIJIL(sparkContext);
                }
                SparkContext sparkContext2 = Lm0.getSparkContext();
                if (sparkContext2 != null) {
                    sparkContext2.LJJIJ(((IHybridPropsService) CN1.LIZ(IHybridPropsService.class)).dg());
                }
                C78598Ut0.LJIJ(Lm0);
                liveGoalsWidget.LJZ(true, Lm0);
            }
            C6F.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
            C6K LIZIZ2 = C6F.LIZIZ();
            long LIZ2 = C6F.LIZ(LIZIZ2.LJII, LIZIZ2.LJIIIIZZ);
            HashMap hashMap = new HashMap(LIZIZ2.LIZIZ());
            hashMap.put("duration", Long.valueOf(LIZ2));
            hashMap.put("action_completed_status", 1);
            C6F.LIZJ("container_create", hashMap);
            if (Lm0 != null) {
                liveGoalsWidget.LJLJI = Lm0;
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C29960BpM c29960BpM = new C29960BpM(this.LJLILLLLZI, null);
                this.LJLIL = 2;
                if (XKX.LJI(abstractC78621UtN, c29960BpM, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
                return C76800UCe.LIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
