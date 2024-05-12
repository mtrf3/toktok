package X;

import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9M {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(LiveMode liveMode, Room room, DataChannel dataChannel, boolean z) {
        boolean z2;
        String str;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        LiveCoreSDKData.Options options;
        o.LJIIIZ(liveMode, "liveMode");
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        if (dataChannel != null) {
            z2 = o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE);
        } else {
            z2 = false;
        }
        boolean z4 = true;
        boolean z5 = !z2;
        if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable() || z5) {
            z4 = false;
        }
        if (room != null && (streamUrl = room.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (options = pullData.getOptions()) != null) {
            z3 = options.showQualityButton;
        }
        if (z4 && !z && z3) {
            if (room == null || (str = C17280m4.LIZ(room)) == null) {
                str = "";
            }
            C78963Uyt.LJJIJL(str, C28509BGv.LIZ(liveMode), CardStruct.IStatusCode.DEFAULT);
            arrayList.add(new B9L(dataChannel));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("provideLiveSheetActions(). enable=");
        LIZ2.append(z4);
        LIZ2.append(", liveMode=");
        LIZ2.append(liveMode);
        LIZ2.append(", listSize=");
        LIZ2.append(arrayList.size());
        LIZ2.append(", showQualityButton=");
        LIZ2.append(z3);
        C0NB.LJIIIZ("LiveSheetActionProvider", X1D.LIZIZ(LIZ2));
        return arrayList;
    }
}
