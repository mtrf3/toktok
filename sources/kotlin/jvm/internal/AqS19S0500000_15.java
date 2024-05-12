package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.EnumC85244Xcu;
import X.InterfaceC88472Yns;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;

/* loaded from: classes16.dex */
public class AqS19S0500000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AqS19S0500000_15 aqS19S0500000_15, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS19S0500000_15.l1, new AqS119S0300000_15((AVPublishContentType) aqS19S0500000_15.l2, (ExtensionMisc) aqS19S0500000_15.l3, ((PublishOutput) aqS19S0500000_15.l0).getPoiData(), 2));
        assemble.wv0((Fragment) aqS19S0500000_15.l1, new AqS170S0100000_4((View) aqS19S0500000_15.l4, 934));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS19S0500000_15 aqS19S0500000_15, Object obj) {
        EnumC85244Xcu enumC85244Xcu;
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        PoiData poiData = ((PublishOutput) aqS19S0500000_15.l0).getPoiData();
        if (poiData != null) {
            enumC85244Xcu = EnumC85244Xcu.LOCATION_STICKER;
        } else {
            enumC85244Xcu = EnumC85244Xcu.ADD_LOCATION;
        }
        assemble.mv0((Fragment) aqS19S0500000_15.l1, new AqS60S0400000_15((AVPublishContentType) aqS19S0500000_15.l2, (ExtensionMisc) aqS19S0500000_15.l3, poiData, enumC85244Xcu, 2));
        assemble.wv0((Fragment) aqS19S0500000_15.l1, new AqS170S0100000_4((View) aqS19S0500000_15.l4, 953));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS19S0500000_15(PublishOutput publishOutput, Fragment fragment, AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = publishOutput;
        this.l1 = fragment;
        this.l2 = aVPublishContentType;
        this.l3 = extensionMisc;
        this.l4 = view;
    }
}
