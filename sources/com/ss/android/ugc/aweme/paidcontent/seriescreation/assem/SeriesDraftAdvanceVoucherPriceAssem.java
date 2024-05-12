package com.ss.android.ugc.aweme.paidcontent.seriescreation.assem;

import X.C04D;
import X.C1DJ;
import X.C214298b3;
import X.C221108m2;
import X.C248889pk;
import X.C283619k;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7VU;
import X.C9BD;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftAdvanceVoucherPriceAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public final C62822Ol8 LJLLI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ai5;
    }

    public SeriesDraftAdvanceVoucherPriceAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 607), C248889pk.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C7VU.class, "paid_content_creation_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 606));
    }

    public final SeriesDraftViewModel H3() {
        return (SeriesDraftViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((C04D) this.LJLLI.getValue()).setViewCompositionStrategy(C283619k.LIZIZ);
        Context context = getContext();
        if (context != null) {
            ((ComposeView) this.LJLLI.getValue()).setContent(C1DJ.LJFF(new AqS175S0200000_13(this, context, 6), -1553890113, true));
        }
    }
}
