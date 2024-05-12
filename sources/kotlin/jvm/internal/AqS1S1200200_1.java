package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32146CjW;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AqS1S1200200_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public long j3;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S1200200_1 aqS1S1200200_1, Object obj, Object obj2) {
        JSONObject features = (JSONObject) obj;
        String finalScene = (String) obj2;
        o.LJIIIZ(features, "features");
        o.LJIIIZ(finalScene, "finalScene");
        DataChannel dataChannel = (DataChannel) aqS1S1200200_1.l1;
        Room room = (Room) aqS1S1200200_1.l2;
        String str = aqS1S1200200_1.s0;
        if (finalScene.length() != 0) {
            str = finalScene;
        }
        C32146CjW.LJFF(dataChannel, room, str, aqS1S1200200_1.j3, features, aqS1S1200200_1.j4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S1200200_1 aqS1S1200200_1, Object obj, Object obj2) {
        JSONObject features = (JSONObject) obj;
        String finalScene = (String) obj2;
        o.LJIIIZ(features, "features");
        o.LJIIIZ(finalScene, "finalScene");
        DataChannel dataChannel = (DataChannel) aqS1S1200200_1.l1;
        Room room = (Room) aqS1S1200200_1.l2;
        String str = aqS1S1200200_1.s0;
        if (finalScene.length() != 0) {
            str = finalScene;
        }
        C32146CjW.LJFF(dataChannel, room, str, aqS1S1200200_1.j3, features, aqS1S1200200_1.j4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1200200_1(DataChannel dataChannel, Room room, long j, long j2, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = dataChannel;
        this.l2 = room;
        this.j3 = j;
        this.j4 = j2;
        this.s0 = str;
    }
}
