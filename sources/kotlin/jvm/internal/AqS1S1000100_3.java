package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1803575z;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.now.interaction.api.CommentCountState;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS1S1000100_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AqS1S1000100_3 aqS1S1000100_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, null, new CommentCountState(aqS1S1000100_3.j1, aqS1S1000100_3.s0), null, null, null, null, null, 251, null);
    }

    public static final Object invoke$1(AqS1S1000100_3 aqS1S1000100_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, new C1803575z(aqS1S1000100_3.j1, aqS1S1000100_3.s0), null, null, null, null, null, null, 253, null);
    }

    public static final Object invoke$2(AqS1S1000100_3 aqS1S1000100_3, Object obj) {
        JSONObject genMobParams = (JSONObject) obj;
        o.LJIIIZ(genMobParams, "$this$genMobParams");
        genMobParams.put("account_type", aqS1S1000100_3.s0);
        if (aqS1S1000100_3.j1 >= 3000) {
            genMobParams.put("action_type", "auto_dismiss");
        } else {
            genMobParams.put("action_type", "manual_dismiss");
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1000100_3(long j, String str, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1000100_3(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
