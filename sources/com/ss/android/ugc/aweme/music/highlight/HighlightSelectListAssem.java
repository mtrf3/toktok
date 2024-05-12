package com.ss.android.ugc.aweme.music.highlight;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C240669cU;
import X.C252569vg;
import X.C25678A5y;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectListAssem extends Hilt_HighlightSelectListAssem {
    public C73305Spp LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;

    public HighlightSelectListAssem() {
        new LinkedHashMap();
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 453));
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 534);
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightSelectListViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 533), C240669cU.INSTANCE, aqS153S0100000_3);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel A3() {
        return (AssemListViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 2;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJI = (C73305Spp) view.findViewById(R.id.kf_);
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        v3().setLayoutManager(wrapLinearLayoutManager);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.9cV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C240499cD c240499cD = (C240499cD) obj;
                c240499cD.getClass();
                return C208708Ha.LIZLLL(c240499cD);
            }
        }, null, new AqS170S0100000_4(this, 437), new AqS154S0100000_4(this, 454), new AqS170S0100000_4(this, 438), 2, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.9cW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C240499cD) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 122), 6);
    }

    public final void C3(Exception exc, boolean z) {
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        if (z) {
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIIZ(c73306Spq);
                c73305Spp2.setStatus(c73306Spq);
                return;
            }
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C25678A5y.LIZ(LIZ, "", exc, this.LJLJI);
        }
        C73305Spp c73305Spp3 = this.LJLJI;
        if (c73305Spp3 == null) {
            return;
        }
        C252569vg.LIZ(c73305Spp3, "", exc, new AqS154S0100000_4(this, 1225));
    }
}
