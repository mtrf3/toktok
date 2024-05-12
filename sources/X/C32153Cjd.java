package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cjd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32153Cjd implements InterfaceC22840v2 {
    public final /* synthetic */ CoHostFriendNoticeService LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC22840v2
    public final void LJIILIIL(C22830v1 outputData) {
        int i;
        int i2;
        o.LJIIIZ(outputData, "outputData");
        if (!outputData.LIZ() && !LiveCoHostFriendNoticeOptMock.INSTANCE.enable()) {
            return;
        }
        LiveCoHostFriendNoticeOptMock liveCoHostFriendNoticeOptMock = LiveCoHostFriendNoticeOptMock.INSTANCE;
        if (liveCoHostFriendNoticeOptMock.enable()) {
            i = liveCoHostFriendNoticeOptMock.nextExecutionDelay();
        } else {
            i = -1;
        }
        if (liveCoHostFriendNoticeOptMock.enable()) {
            i2 = liveCoHostFriendNoticeOptMock.shouldRequestForTheNotice();
        } else {
            i2 = 0;
        }
        JSONObject jSONObject = outputData.LIZIZ;
        if (jSONObject != null) {
            i = jSONObject.optInt("next_execution_delay", i);
        }
        JSONObject jSONObject2 = outputData.LIZIZ;
        if (jSONObject2 != null) {
            i2 = jSONObject2.optInt("should_request_for_the_notice", i2);
        }
        if (i > 0) {
            CoHostFriendNoticeService coHostFriendNoticeService = this.LJLIL;
            C73401SrN LJJLIIIJLJLI = AbstractC73672Svk.LJJLIIIJLJLI(i, TimeUnit.SECONDS);
            AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
            coHostFriendNoticeService.LJLJLJ = (C73411SrX) LJJLIIIJLJLI.LJJL(abstractC73946T0k).LJJJ(abstractC73946T0k).LJJJJZI(new AfS57S0100000_5(this.LJLIL, 188));
        }
        if (i2 > 0) {
            this.LJLIL.LIZJ(3, this.LJLILLLLZI);
        }
        this.LJLIL.LJLLILLLL++;
    }

    public C32153Cjd(CoHostFriendNoticeService coHostFriendNoticeService, long j) {
        this.LJLIL = coHostFriendNoticeService;
        this.LJLILLLLZI = j;
    }
}
