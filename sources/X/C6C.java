package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C6C extends AbstractC65781Prl implements InterfaceC88471Ynr<SparkContext, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ LiveGoalsWidget LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6C(long j, LiveGoalsWidget liveGoalsWidget, int i, String str) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = liveGoalsWidget;
        this.LJLJI = i;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SparkContext sparkContext, Integer num) {
        Boolean bool;
        String jsonString;
        Room room;
        String str;
        Room room2;
        LiveMode streamType;
        SparkContext sparkContext2 = sparkContext;
        int intValue = num.intValue();
        o.LJIIIZ(sparkContext2, "sparkContext");
        C6F.LIZIZ().LJIIL = intValue;
        sparkContext2.LJJIIJ("container_create_start_timestamp", String.valueOf(this.LJLIL));
        DataChannel dataChannel = this.LJLILLLLZI.dataChannel;
        List<String> list = null;
        if (dataChannel != null) {
            bool = Boolean.valueOf(C29306Beo.LJIIJ(dataChannel));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            jsonString = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, LiveGoalAnchorAccessControlSetting.INSTANCE.getValue());
        } else {
            Gson gson = C09650Zl.LIZIZ;
            DataChannel dataChannel2 = this.LJLILLLLZI.dataChannel;
            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                list = room.mIndicators;
            }
            jsonString = GsonProtectorUtils.toJson(gson, list);
        }
        o.LJIIIIZZ(jsonString, "jsonString");
        sparkContext2.LJJIIJ("indicator_business_keys", jsonString);
        sparkContext2.LJJIIJ("live_cpp_version", String.valueOf(this.LJLJI));
        sparkContext2.LJJIIJ("entrance", "live_entrance");
        if (FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue()) {
            sparkContext2.LJJIFFI(1, "live_debounce_click");
            sparkContext2.LJJIFFI(FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue(), "live_debounce_click_delay_interval");
        }
        DataChannel dataChannel3 = this.LJLILLLLZI.dataChannel;
        if (dataChannel3 == null || (room2 = (Room) dataChannel3.kv0(RoomChannel.class)) == null || (streamType = room2.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
            str = "";
        }
        sparkContext2.LJJIIJ("live_type", str);
        C6D c6d = new C6D(this.LJLILLLLZI, sparkContext2, this.LJLJJI);
        this.LJLILLLLZI.LJLJJL = c6d;
        sparkContext2.LJJI(c6d);
        return C76800UCe.LIZ;
    }
}
