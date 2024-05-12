package com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue;

import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C91378Zte;
import X.C91543ZwJ;
import X.C91577Zwr;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.cell.MDAudioMusicCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.IDqS444S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDAudioQueueAssem extends UIListContentAssem<MDAudioQueueViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public MDAudioQueueAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 19));
        C65776Prg LIZ = C65352Pkq.LIZ(MDAudioQueueViewModel.class);
        this.LJLILLLLZI = new C214298b3(new IDqS421S0100000_29(LIZ, 21), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C91543ZwJ.INSTANCE, LIZ);
        this.LJLJI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final MDAudioQueueViewModel A3() {
        return (AssemListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        return (SYL) this.LJLIL.getValue();
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
        SYL v3 = v3();
        v3.LLLF.LJZL(MDAudioMusicCell.class);
        v3.LJII(new C91378Zte(), -1);
        v3.setItemAnimator(null);
        super.onViewCreated(view);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.Zxj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91609ZxN) obj).LJLILLLLZI;
            }
        }, null, new IDqS444S0100000_29(this, 2), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.Zxk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C91609ZxN) obj).LJLJI);
            }
        }, null, C91577Zwr.LJLIL, 6);
    }
}
