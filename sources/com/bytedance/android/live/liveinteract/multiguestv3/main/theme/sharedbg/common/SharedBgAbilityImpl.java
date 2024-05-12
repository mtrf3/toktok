package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;

/* loaded from: classes14.dex */
public final class SharedBgAbilityImpl implements ISharedBgAbility {
    public final MultiGuestSharedBgAnchorViewModel LJLIL;
    public final MultiGuestSharedBgGuestViewModel LJLILLLLZI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility
    public final MultiGuestSharedBgAnchorViewModel Mb0() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility
    public final MultiGuestSharedBgGuestViewModel n90() {
        return this.LJLILLLLZI;
    }

    public SharedBgAbilityImpl(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel) {
        this.LJLIL = multiGuestSharedBgAnchorViewModel;
        this.LJLILLLLZI = multiGuestSharedBgGuestViewModel;
    }
}
