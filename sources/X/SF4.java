package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SF4 extends C71836SHg {
    public final MessageCenterViewModel LJLJJL;

    @Override // X.C71836SHg
    public final void LIZIZ() {
        MessageCenterViewModel messageCenterViewModel = this.LJLJJL;
        messageCenterViewModel.getClass();
        messageCenterViewModel.LJLJL = "next";
    }

    @Override // X.C71836SHg
    public final void LIZJ() {
        C27474AqM c27474AqM = this.LJLJJL.LJLJJLL;
        if (c27474AqM != null) {
            java.util.Map<String, String> LIZ = c27474AqM.LIZ();
            HashMap hashMap = new HashMap();
            hashMap.put("button_name", "view_more");
            hashMap.putAll(LIZ);
            C76542zS.LIZ("tiktokec_button_click", hashMap);
        }
        MessageCenterViewModel messageCenterViewModel = this.LJLJJL;
        messageCenterViewModel.getClass();
        messageCenterViewModel.LJLJL = "next";
    }

    @Override // X.C71836SHg
    public final void LIZLLL() {
        C27474AqM c27474AqM = this.LJLJJL.LJLJJLL;
        if (c27474AqM != null) {
            java.util.Map<String, String> LIZ = c27474AqM.LIZ();
            HashMap hashMap = new HashMap();
            hashMap.put("button_name", "view_more");
            hashMap.putAll(LIZ);
            C76542zS.LIZ("tiktokec_button_show", hashMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SF4(MessageCenterViewModel viewModel) {
        super(SF5.PENDING_BY_COLLAPSE);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJJL = viewModel;
    }
}
