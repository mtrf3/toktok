package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.C00F;
import X.C64962gm;
import X.C70660RoG;
import X.EnumC70012Rdo;
import X.FKM;
import X.ORZ;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuEntranceViewModel extends JediViewModel<SkuEntranceState> {
    public final PdpViewModel LJLJJLL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final SkuEntranceState kv0() {
        return new SkuEntranceState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public SkuEntranceViewModel(PdpViewModel vm) {
        o.LJIIIZ(vm, "vm");
        this.LJLJJLL = vm;
    }

    public final void Hv0(ImageSelectData selectData) {
        String str;
        String uri;
        List<String> thumbUrls;
        o.LJIIIZ(selectData, "selectData");
        if (selectData.from == EnumC70012Rdo.SKU_ENTRANCE && C00F.LIZ(31744, 0, "ec_pdp_head_pic_android_opt", true) >= 2) {
            C64962gm c64962gm = this.LJLJJLL.LLJIJIL;
            AwemeHostApplication LIZ = FKM.LIZ();
            String jw0 = this.LJLJJLL.jw0();
            Image image = selectData.image;
            String str2 = "";
            if (image == null || (thumbUrls = image.getThumbUrls()) == null || (str = (String) ORZ.LJLLLL(thumbUrls)) == null) {
                str = "";
            }
            Image image2 = selectData.image;
            if (image2 != null && (uri = image2.getUri()) != null) {
                str2 = uri;
            }
            C70660RoG.LIZJ(LIZ, jw0, str, str2, c64962gm);
        }
        setState(new AqS178S0100000_12(selectData, 130));
    }
}
