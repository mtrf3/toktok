package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C184637Ml;
import X.C4LX;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.api.PostActiveState;

/* loaded from: classes4.dex */
public class AqS0S1010000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S1010000_3 aqS0S1010000_3, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C184637Ml(aqS0S1010000_3.z1, aqS0S1010000_3.s0);
        hierarchyData.LIZIZ = "now_publish_hierarchy_data_key";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1010000_3 aqS0S1010000_3, Object obj) {
        InteractionSyncViewModelState setState = (InteractionSyncViewModelState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return InteractionSyncViewModelState.copy$default(setState, null, null, null, null, null, null, null, new PostActiveState(aqS0S1010000_3.z1, aqS0S1010000_3.s0), 127, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1010000_3(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
