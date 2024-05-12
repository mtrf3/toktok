package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7DT;
import X.SYL;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ArtistProfileTuxSheetAssem extends UIListContentAssem<ArtistProfileTuxSheetViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public ArtistProfileTuxSheetAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 347));
        C65776Prg LIZ = C65352Pkq.LIZ(ArtistProfileTuxSheetViewModel.class);
        this.LJLILLLLZI = new C214298b3(new AqS153S0100000_3(LIZ, 348), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C7DT.INSTANCE, LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.feed.assem.music.artistprofile.ArtistProfileTuxSheetViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ArtistProfileTuxSheetViewModel A3() {
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
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SYL v3 = v3();
        v3.LLLF.LJZL(ArtistProfileTuxSheetCell.class);
        v3.setItemAnimator(null);
        super.onViewCreated(view);
    }
}
