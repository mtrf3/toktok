package com.ss.android.ugc.aweme.dsp.playpage.queue;

import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C91440Zue;
import X.C91564Zwe;
import X.SYL;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.cell.MDQueueCurrentMusicCell;
import com.ss.android.ugc.aweme.dsp.playpage.queue.cell.MDQueueCurrentTitleCell;
import com.ss.android.ugc.aweme.dsp.playpage.queue.cell.MDQueueMoreTitleCell;
import com.ss.android.ugc.aweme.dsp.playpage.queue.cell.MDQueueNextMusicCell;
import com.ss.android.ugc.aweme.dsp.playpage.queue.cell.MDQueueNextTitleCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MDQueueAssem extends UIListContentAssem<MDQueueViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public MDQueueAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 44));
        C65776Prg LIZ = C65352Pkq.LIZ(MDQueueViewModel.class);
        this.LJLILLLLZI = new C214298b3(new IDqS421S0100000_29(LIZ, 45), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C91564Zwe.INSTANCE, LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final MDQueueViewModel A3() {
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
        v3.LLLF.LJZL(MDQueueCurrentTitleCell.class, MDQueueCurrentMusicCell.class, MDQueueNextTitleCell.class, MDQueueNextMusicCell.class, MDQueueMoreTitleCell.class);
        v3.LJII(new C91440Zue(), -1);
        v3.setItemAnimator(null);
        super.onViewCreated(view);
    }
}
