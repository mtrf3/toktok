package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C4LX;
import X.C76800UCe;
import X.C88033ct;
import X.InterfaceC88472Yns;

/* loaded from: classes2.dex */
public class AqS0S2002000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS0S2002000_1 aqS0S2002000_1, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C88033ct(aqS0S2002000_1.i2, aqS0S2002000_1.i3, aqS0S2002000_1.s0, aqS0S2002000_1.s1);
        hierarchyData.LIZIZ = "sticker_store_sticker_set_content_config";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2002000_1 aqS0S2002000_1, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C88033ct(aqS0S2002000_1.i2, aqS0S2002000_1.i3, aqS0S2002000_1.s0, aqS0S2002000_1.s1);
        hierarchyData.LIZIZ = "sticker_store_video_sticker_content_config";
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2002000_1(int i, int i2, String str, String str2, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
        this.s1 = str2;
    }
}
