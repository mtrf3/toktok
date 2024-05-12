package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component;

import X.C221108m2;
import X.C62822Ol8;
import X.C94F;
import X.KTY;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryLongPressAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryPinchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryTouchEventInterceptComponent extends BaseCellContentComponent<StoryTouchEventInterceptComponent> {
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;

    public StoryTouchEventInterceptComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 947));
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 946));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        KTY kty;
        o.LJIIIZ(view, "view");
        if (!(view instanceof C94F)) {
            return;
        }
        C94F c94f = (C94F) view;
        StoryPinchAbility storyPinchAbility = (StoryPinchAbility) this.LL.getValue();
        LongPressLayout longPressLayout = null;
        if (storyPinchAbility != null) {
            kty = storyPinchAbility.JQ();
        } else {
            kty = null;
        }
        StoryLongPressAbility storyLongPressAbility = (StoryLongPressAbility) this.LLD.getValue();
        if (storyLongPressAbility != null) {
            longPressLayout = storyLongPressAbility.ju();
        }
        c94f.LJLIL = kty;
        c94f.LJLILLLLZI = longPressLayout;
    }
}
