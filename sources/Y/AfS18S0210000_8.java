package Y;

import X.C50863Jxj;
import X.InterfaceC64592gB;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* loaded from: classes9.dex */
public class AfS18S0210000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS18S0210000_8 afS18S0210000_8, Object obj) {
        TemplateData templateData = (TemplateData) obj;
        C50863Jxj c50863Jxj = (C50863Jxj) afS18S0210000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS18S0210000_8.l1;
        c50863Jxj.LJIIIZ = dynamicPatch;
        c50863Jxj.LJIIL.LIZ(dynamicPatch);
        if (afS18S0210000_8.z2) {
            ((C50863Jxj) afS18S0210000_8.l0).LJIIZILJ((DynamicPatch) afS18S0210000_8.l1, templateData);
        } else {
            ((C50863Jxj) afS18S0210000_8.l0).LJIILLIIL((DynamicPatch) afS18S0210000_8.l1, templateData);
        }
    }

    public static final void accept$1(AfS18S0210000_8 afS18S0210000_8, Object obj) {
        TemplateData templateData = (TemplateData) obj;
        C50863Jxj c50863Jxj = (C50863Jxj) afS18S0210000_8.l0;
        DynamicPatch dynamicPatch = (DynamicPatch) afS18S0210000_8.l1;
        c50863Jxj.LJIIIZ = dynamicPatch;
        c50863Jxj.LJIIL.LIZ(dynamicPatch);
        if (afS18S0210000_8.z2) {
            ((C50863Jxj) afS18S0210000_8.l0).LJIIZILJ((DynamicPatch) afS18S0210000_8.l1, templateData);
        } else {
            ((C50863Jxj) afS18S0210000_8.l0).LJIILLIIL((DynamicPatch) afS18S0210000_8.l1, templateData);
        }
    }

    public AfS18S0210000_8(C50863Jxj c50863Jxj, DynamicPatch dynamicPatch, boolean z, int i) {
        this.$t = i;
        this.l0 = c50863Jxj;
        this.l1 = dynamicPatch;
        this.z2 = z;
    }
}
