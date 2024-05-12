package com.ss.android.ugc.aweme.dsp.playpage.s2s;

import X.AbstractC73672Svk;
import X.C65649Ppd;
import X.C73318Sq2;
import X.C91218Zr4;
import X.C91445Zuj;
import X.C91448Zum;
import X.C91449Zun;
import X.SV7;
import X.SV9;
import X.X1D;
import X.YBK;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class S2SReportViewModel extends AssemViewModel<C91445Zuj> {
    public C73318Sq2 LJLIL = new C73318Sq2();
    public final C65649Ppd<String> LJLILLLLZI = C65649Ppd.create();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C91445Zuj defaultState() {
        return new C91445Zuj();
    }

    public final void gv0(Context context, Fragment fragment, String id, DspUpsellRessoStruct upsellResso, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(upsellResso, "upsellResso");
        SV7.LIZ.getClass();
        if (SV7.LJII(false)) {
            TTMStoreLink storeLink = C91218Zr4.LIZIZ(upsellResso, z, 0).getStoreLink();
            if (storeLink == null) {
                YBK.LIZ.getClass();
                storeLink = (TTMStoreLink) YBK.LIZLLL.getValue();
            }
            SV9.LIZ.getClass();
            long LIZ = SV9.LIZ();
            this.LJLIL = new C73318Sq2();
            this.LJLIL.LIZ(AbstractC73672Svk.LJJIJIL(1).LJIIL(LIZ, TimeUnit.SECONDS).LJJJLIIL(new C91448Zum(this, fragment, context, id, storeLink), C91449Zun.LJLIL));
        }
    }

    public final void hv0(Context context, Fragment fragment, String str, DspUpsellRessoStruct dspUpsellRessoStruct, boolean z) {
        String str2;
        int i;
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fragment:");
        String str3 = null;
        if (fragment != null) {
            str2 = fragment.getClass().getName();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append('#');
        int i2 = 0;
        if (fragment != null) {
            i = fragment.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(":reportShowToAfIfFailingPrevious id: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (this.LJLILLLLZI.contains(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fragment:");
            if (fragment != null) {
                str3 = fragment.getClass().getName();
            }
            LIZ2.append(str3);
            LIZ2.append('#');
            if (fragment != null) {
                i2 = fragment.hashCode();
            }
            LIZ2.append(i2);
            LIZ2.append(":reportShowToAfIfFailingPrevious id: ");
            LIZ2.append(str);
            LIZ2.append(" return");
            X1D.LIZIZ(LIZ2);
            return;
        }
        gv0(context, fragment, str, dspUpsellRessoStruct, z);
    }
}
