package X;

import Y.AfS53S0100000_1;
import Y.AfS57S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BHV {
    public static final /* synthetic */ int LIZ = 0;

    public static GameTag LIZIZ(BHZ bhz, List list) {
        Long l;
        Long l2;
        Long l3;
        GameTag gameTag = bhz.getGameTag();
        if (gameTag == null || (l3 = gameTag.id) == null || l3.longValue() != -1) {
            Object obj = null;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                GameTag gameTag2 = (GameTag) next;
                if (gameTag2 != null) {
                    l = gameTag2.id;
                } else {
                    l = null;
                }
                GameTag gameTag3 = bhz.getGameTag();
                if (gameTag3 != null) {
                    l2 = gameTag3.id;
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2)) {
                    obj = next;
                    break;
                }
            }
            return (GameTag) obj;
        }
        return bhz.getGameTag();
    }

    public static C73411SrX LIZ(DataChannel dataChannel, Fragment fragment, InterfaceC88472Yns responseCallback, InterfaceC65784Pro interfaceC65784Pro) {
        Object kv0;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(responseCallback, "responseCallback");
        if (dataChannel != null && (kv0 = dataChannel.kv0(HashTagResp.class)) != null) {
            responseCallback.invoke(kv0);
            return null;
        }
        return (C73411SrX) C1EW.LIZ(((HashtagApi) Q7L.LIZIZ(HashtagApi.class)).fetchHashtagList()).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS57S0100000_5(new AqS136S0200000_5(dataChannel, responseCallback, 38), 257), new AfS53S0100000_1(interfaceC65784Pro, 73));
    }
}
