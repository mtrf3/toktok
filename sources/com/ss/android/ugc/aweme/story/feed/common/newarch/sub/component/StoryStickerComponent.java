package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221138m5;
import X.C61878OQg;
import X.C6U6;
import X.InterfaceC161306Us;
import X.KR8;
import Y.ARunnableS13S0300000_2;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryStickerComponent extends BaseCellContentComponent<StoryStickerComponent> implements C6U6 {
    public final C221138m5 LL;
    public InterfaceC161306Us LLD;

    public StoryStickerComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 945));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.6Us] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        ?? r3;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        List<InteractStickerStruct> interactStickerStructs = item.getAweme().getInteractStickerStructs();
        if (interactStickerStructs != null) {
            r3 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getNoGlobal()) {
                    r3.add(interactStickerStruct);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        ?? r1 = this.LLD;
        if (r1 != 0) {
            item.getAweme();
            r1.LIZ(r3, null);
        }
    }

    @Override // X.C6U6
    public final boolean LLZ(InteractStickerStruct sticker) {
        o.LJIIIZ(sticker, "sticker");
        StoryFakePlayerAbility storyFakePlayerAbility = (StoryFakePlayerAbility) this.LL.getValue();
        if (storyFakePlayerAbility != null) {
            storyFakePlayerAbility.nm0();
            return true;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ActivityC45651qj LIZ;
        o.LJIIIZ(view, "view");
        if (!(view instanceof FrameLayout) || (LIZ = C212428Vi.LIZ(this)) == null) {
            return;
        }
        view.post(new ARunnableS13S0300000_2(view, this, LIZ, 9));
    }
}
