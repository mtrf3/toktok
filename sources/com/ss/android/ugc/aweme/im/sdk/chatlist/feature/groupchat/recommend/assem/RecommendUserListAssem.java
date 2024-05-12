package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem;

import X.C214298b3;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7WS;
import X.C9BE;
import X.SYL;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public final class RecommendUserListAssem extends UIListContentAssem<RecommendUserListViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;

    public RecommendUserListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 434));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecommendUserListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 435), C7WS.INSTANCE, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ext_power_list.AssemListViewModel, com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final RecommendUserListViewModel A3() {
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
}
