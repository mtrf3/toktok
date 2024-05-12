package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C2303592h;
import X.C232709Bi;
import X.C232719Bj;
import X.C27356AoS;
import X.C27943Axv;
import X.C27949Ay1;
import X.C2VN;
import X.C43I;
import X.C70355RjL;
import X.C70414RkI;
import X.C76800UCe;
import X.C9BX;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ProgressDragHintViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS55S0201000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS55S0201000_4 aqS55S0201000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C27943Axv.LIZ(sendLog, (HashMap) aqS55S0201000_4.l0);
        sendLog.LIZJ("load_success", Integer.valueOf(aqS55S0201000_4.i2));
        sendLog.LIZJ("page_name", "order_submit");
        Object obj2 = aqS55S0201000_4.l1;
        if ((obj2 instanceof Long) && !o.LJ(obj2, -1L)) {
            sendLog.LIZLLL("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) aqS55S0201000_4.l1).longValue()));
        }
        sendLog.LIZJ("image_load_duration", Long.valueOf(SystemClock.elapsedRealtime() - C27949Ay1.LJIJJLI));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS55S0201000_4 aqS55S0201000_4, Object obj) {
        boolean iv0;
        C9BX it = (C9BX) obj;
        o.LJIIIZ(it, "it");
        int i = C232709Bi.LIZ[it.LJLJJL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                iv0 = false;
            } else {
                iv0 = ((ProgressDragHintViewModel) aqS55S0201000_4.l0).jv0(it, aqS55S0201000_4.i2);
            }
        } else {
            iv0 = ((ProgressDragHintViewModel) aqS55S0201000_4.l0).iv0(it, aqS55S0201000_4.i2);
        }
        ProgressDragHintViewModel progressDragHintViewModel = (ProgressDragHintViewModel) aqS55S0201000_4.l0;
        C232719Bj c232719Bj = progressDragHintViewModel.LJLJJL;
        progressDragHintViewModel.LJLJJL = new C232719Bj(c232719Bj.LJLIL, iv0, progressDragHintViewModel.LJLJI.size());
        ((InterfaceC88472Yns) aqS55S0201000_4.l1).invoke(((ProgressDragHintViewModel) aqS55S0201000_4.l0).LJLJJL);
        ((ProgressDragHintViewModel) aqS55S0201000_4.l0).LJLJI.clear();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS55S0201000_4 aqS55S0201000_4, Object setStateImmediate) {
        String str;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        Context context = (Context) aqS55S0201000_4.l0;
        int i = aqS55S0201000_4.i2;
        Aweme aweme = (Aweme) aqS55S0201000_4.l1;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return new C2303592h(new C43I(new C2VN(context, i, str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS55S0201000_4 aqS55S0201000_4, Object obj) {
        int i;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(logView.size()));
        logView.plusAssign("rank", Integer.valueOf(aqS55S0201000_4.i2 + 1));
        logView.plusAssign("action_type", "click");
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS55S0201000_4.l0).Al().LJLLLL);
        List<District> list = ((District) ((C27356AoS) aqS55S0201000_4.l1).LIZ).parRegions;
        if (list != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS55S0201000_4 aqS55S0201000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C70414RkI c70414RkI = (C70414RkI) aqS55S0201000_4.l0;
        C70355RjL.LIZ(sendLog, c70414RkI.LIZIZ, c70414RkI.LJIIJJI, (SkuPrice) aqS55S0201000_4.l1, aqS55S0201000_4.i2, "product_detail");
        sendLog.LIZJ("action_refer", "product_detail");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0201000_4(Context context, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.i2 = R.id.gu7;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0201000_4(int i, int i2, DistrictFragment districtFragment, C27356AoS<District> c27356AoS) {
        super(1);
        this.$t = c27356AoS;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0201000_4(C70414RkI c70414RkI, SkuPrice skuPrice, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70414RkI;
        this.l1 = skuPrice;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S0201000_4(ProgressDragHintViewModel progressDragHintViewModel, int i, AqS140S0200000_9 aqS140S0200000_9, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = progressDragHintViewModel;
        this.i2 = i;
        this.l1 = aqS140S0200000_9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S0201000_4(HashMap hashMap, HashMap<String, Object> hashMap2, int i, Object obj) {
        super(1);
        this.$t = obj;
        this.l0 = hashMap;
        this.i2 = hashMap2;
        this.l1 = i;
    }
}
