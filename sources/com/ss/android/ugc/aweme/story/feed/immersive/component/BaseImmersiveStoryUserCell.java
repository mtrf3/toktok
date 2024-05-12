package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C55096Ljo;
import X.KOZ;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.ISkylightDetailAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public abstract class BaseImmersiveStoryUserCell<T extends StoryImmersiveFeedItem> extends AssemPowerCell<ImmersiveStoryUserCellAssem, T> implements KOZ {
    public ImmersiveStoryUserCellAssem LJLJL;

    public abstract int P();

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.co9;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ImmersiveStoryUserCellAssem L() {
        ImmersiveStoryUserCellAssem immersiveStoryUserCellAssem = new ImmersiveStoryUserCellAssem(P());
        this.LJLJL = immersiveStoryUserCellAssem;
        return immersiveStoryUserCellAssem;
    }

    @Override // X.KOZ
    public final void k2() {
        ImmersiveStoryUserCellAssem immersiveStoryUserCellAssem = this.LJLJL;
        if (immersiveStoryUserCellAssem != null) {
            immersiveStoryUserCellAssem.k2();
        }
    }

    @Override // X.KOZ
    public final void onPageSelected(int i) {
        ImmersiveStoryUserCellAssem immersiveStoryUserCellAssem = this.LJLJL;
        if (immersiveStoryUserCellAssem != null) {
            immersiveStoryUserCellAssem.onPageSelected(i);
        }
        Aweme aweme = null;
        ISkylightDetailAbility iSkylightDetailAbility = (ISkylightDetailAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), ISkylightDetailAbility.class, null);
        if (iSkylightDetailAbility != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            StoryImmersiveFeedItem storyImmersiveFeedItem = (StoryImmersiveFeedItem) getItem();
            if (storyImmersiveFeedItem != null) {
                aweme = storyImmersiveFeedItem.getStoryCollection();
            }
            iSkylightDetailAbility.Pk0(bindingAdapterPosition, aweme);
        }
    }
}
