package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C253009wO;
import X.C27021Aj3;
import X.C76800UCe;
import X.C78897Uxp;
import X.InterfaceC88472Yns;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes5.dex */
public class AqS0S0320000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

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

    public static final Object invoke$0(AqS0S0320000_4 aqS0S0320000_4, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        String str = ((C27021Aj3) aqS0S0320000_4.l0).LIZ.key;
        if (str == null) {
            str = "";
        }
        logNode.plusAssign("input_box_name", str);
        logNode.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - ((TextInputHelper) aqS0S0320000_4.l1).startFocus));
        if (!o.LJ(((C27021Aj3) aqS0S0320000_4.l0).LIZ.key, "address_searchbar")) {
            logNode.plusAssign("input_method", AddressEditDetailActivity.LJZ);
            String str2 = "1";
            if (((TextInputHelper) aqS0S0320000_4.l1).userInput) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_normal_input", obj2);
            if (aqS0S0320000_4.z3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_auto_input", obj3);
            if (aqS0S0320000_4.z4) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_sug_input", obj4);
            if (!C78897Uxp.LJJIJL((C253009wO) aqS0S0320000_4.l2)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("is_valid", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0320000_4 aqS0S0320000_4, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        String str = ((C27021Aj3) aqS0S0320000_4.l0).LIZ.key;
        if (str == null) {
            str = "";
        }
        logNode.plusAssign("input_box_name", str);
        logNode.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - ((com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper) aqS0S0320000_4.l1).startFocus));
        if (!o.LJ(((C27021Aj3) aqS0S0320000_4.l0).LIZ.key, "address_searchbar")) {
            logNode.plusAssign("input_method", ((com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper) aqS0S0320000_4.l1).candHelper.LJIIIIZZ);
            String str2 = "1";
            if (((com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper) aqS0S0320000_4.l1).userInput) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_normal_input", obj2);
            if (aqS0S0320000_4.z3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_auto_input", obj3);
            if (aqS0S0320000_4.z4) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_sug_input", obj4);
            if (!C78897Uxp.LJJIJL((C253009wO) aqS0S0320000_4.l2)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("is_valid", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S0320000_4 aqS0S0320000_4, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        String str = ((C27021Aj3) aqS0S0320000_4.l0).LIZ.key;
        if (str == null) {
            str = "";
        }
        logNode.plusAssign("input_box_name", str);
        logNode.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - ((PhoneInputItemViewHolder) aqS0S0320000_4.l1).mStartFocus));
        if (!o.LJ(((C27021Aj3) aqS0S0320000_4.l0).LIZ.key, "address_searchbar")) {
            logNode.plusAssign("input_method", ((PhoneInputItemViewHolder) aqS0S0320000_4.l1).mCandHelper.LJIIIIZZ);
            String str2 = "1";
            if (((PhoneInputItemViewHolder) aqS0S0320000_4.l1).userInput) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_normal_input", obj2);
            if (aqS0S0320000_4.z3) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_auto_input", obj3);
            if (aqS0S0320000_4.z4) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("has_sug_input", obj4);
            if (!C78897Uxp.LJJIJL((C253009wO) aqS0S0320000_4.l2)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            logNode.plusAssign("is_valid", str2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0320000_4(C27021Aj3 c27021Aj3, TextInputHelper textInputHelper, boolean z, boolean z2, C253009wO c253009wO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c27021Aj3;
        this.l1 = textInputHelper;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = c253009wO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0320000_4(C27021Aj3 c27021Aj3, com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper textInputHelper, boolean z, boolean z2, C253009wO c253009wO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c27021Aj3;
        this.l1 = textInputHelper;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = c253009wO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0320000_4(C27021Aj3 c27021Aj3, PhoneInputItemViewHolder phoneInputItemViewHolder, boolean z, boolean z2, C253009wO c253009wO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c27021Aj3;
        this.l1 = phoneInputItemViewHolder;
        this.z3 = z;
        this.z4 = z2;
        this.l2 = c253009wO;
    }
}
