package com.ss.android.ugc.aweme.profile.effect;

import X.AbstractC73672Svk;
import X.C70839Rr9;
import X.C73171Snf;
import X.C73172Sng;
import X.InterfaceC56421MCj;
import X.InterfaceC61312at;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class EffectProfileListViewModel extends CommonListViewModel<NewFaceStickerBean, EffectProfileState> implements InterfaceC56421MCj {
    public boolean LJLJLLL;
    public String LJLL;
    public final AqS178S0100000_12 LJLLI = new AqS178S0100000_12(this, 262);
    public final AqS178S0100000_12 LJLLILLLL = new AqS178S0100000_12(this, 261);
    public final C73172Sng LJLLJ = C73172Sng.LJLIL;
    public final C73171Snf LJLLL = C73171Snf.LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new EffectProfileState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88471Ynr<List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>, List<NewFaceStickerBean>> Kv0() {
        return this.LJLLL;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88471Ynr<List<? extends NewFaceStickerBean>, List<? extends NewFaceStickerBean>, List<NewFaceStickerBean>> Lv0() {
        return this.LJLLJ;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final InterfaceC88472Yns<EffectProfileState, AbstractC73672Svk<OSZ<List<NewFaceStickerBean>, C70839Rr9>>> Nv0() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    public final InterfaceC88472Yns<EffectProfileState, AbstractC73672Svk<OSZ<List<NewFaceStickerBean>, C70839Rr9>>> Ov0() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC56421MCj
    public final void Uq0(Aweme aweme, AqS175S0100000_9 aqS175S0100000_9) {
        withState(new AqS143S0200000_12(aweme, aqS175S0100000_9, 152));
    }
}
