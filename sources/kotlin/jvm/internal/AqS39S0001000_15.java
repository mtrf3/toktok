package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1539362j;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.Y4J;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS39S0001000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0001000_15(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS39S0001000_15 aqS39S0001000_15, Object obj) {
        List modifyListState = (List) obj;
        o.LJIIIZ(modifyListState, "$this$modifyListState");
        ListProtector.remove(modifyListState, aqS39S0001000_15.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS39S0001000_15 aqS39S0001000_15, Object obj) {
        EditTextStickerViewState setState = (EditTextStickerViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditTextStickerViewState.copy$default(setState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C1539362j(aqS39S0001000_15.i0), null, null, null, null, null, -1, 62, null);
    }

    public static final Object invoke$2(AqS39S0001000_15 aqS39S0001000_15, Object obj) {
        Y4J setState = (Y4J) obj;
        o.LJIIIZ(setState, "$this$setState");
        return Y4J.L(setState, 0, aqS39S0001000_15.i0, 1);
    }

    public static final Object invoke$3(AqS39S0001000_15 aqS39S0001000_15, Object obj) {
        Y4J setState = (Y4J) obj;
        o.LJIIIZ(setState, "$this$setState");
        return Y4J.L(setState, aqS39S0001000_15.i0, 0, 2);
    }
}
