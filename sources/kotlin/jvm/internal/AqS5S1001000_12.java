package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C72694Sfy;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;

/* loaded from: classes13.dex */
public class AqS5S1001000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS5S1001000_12 aqS5S1001000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_name", "contact_seller");
        logView.plusAssign("red_dot_type", aqS5S1001000_12.s0);
        logView.plusAssign("red_dot_number", Integer.valueOf(aqS5S1001000_12.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S1001000_12 aqS5S1001000_12, Object obj) {
        ProfileNaviEditorState setStateImmediate = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        String key = aqS5S1001000_12.s0;
        int i = aqS5S1001000_12.i1;
        o.LJIIIZ(key, "key");
        return ProfileNaviEditorState.copy$default(setStateImmediate, null, 0, null, C72694Sfy.LIZ(i, 66667, key), null, null, null, false, false, false, false, false, false, false, 0, 32759, null);
    }

    public static final Object invoke$2(AqS5S1001000_12 aqS5S1001000_12, Object obj) {
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign("request_api", aqS5S1001000_12.s0);
        update.plusAssign("request_success", Integer.valueOf(aqS5S1001000_12.i1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S1001000_12(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
