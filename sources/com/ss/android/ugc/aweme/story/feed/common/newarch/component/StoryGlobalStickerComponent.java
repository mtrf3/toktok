package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.ActivityC45651qj;
import X.C161316Ut;
import X.C1DF;
import X.C212428Vi;
import X.C221138m5;
import X.C6U6;
import X.InterfaceC161306Us;
import X.KR8;
import Y.ARunnableS13S0300000_2;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGlobalStickerComponent extends BaseCellContentComponent<StoryGlobalStickerComponent> implements C6U6 {
    public final C221138m5 LL;
    public InterfaceC161306Us LLD;
    public Aweme LLF;

    public StoryGlobalStickerComponent() {
        new LinkedHashMap();
        this.LL = KR8.LJIIJJI(new AqS153S0100000_3(this, 909));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        boolean z;
        InterfaceC161306Us interfaceC161306Us;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        List<InteractStickerStruct> interactStickerStructs = item.getAweme().getInteractStickerStructs();
        if (interactStickerStructs != null) {
            ArrayList arrayList = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (true ^ interactStickerStruct.getNoGlobal()) {
                    arrayList.add(interactStickerStruct);
                }
            }
            String aid = item.getAweme().getAid();
            Aweme aweme = this.LLF;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(aid, str)) {
                return;
            }
            Aweme aweme2 = this.LLF;
            if (aweme2 != null && C1DF.LJJIII(aweme2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && C1DF.LJJIII(item.getAweme())) {
                getContainerView().setVisibility(0);
                InterfaceC161306Us interfaceC161306Us2 = this.LLD;
                if (interfaceC161306Us2 != null) {
                    C161316Ut.LIZ(interfaceC161306Us2, arrayList, null, 14);
                }
            } else {
                Aweme aweme3 = this.LLF;
                if (aweme3 != null && C1DF.LJJIII(aweme3) && !C1DF.LJJIII(item.getAweme())) {
                    getContainerView().setVisibility(8);
                } else {
                    Aweme aweme4 = this.LLF;
                    if (aweme4 != null && C1DF.LJJIII(aweme4) && C1DF.LJJIII(item.getAweme()) && !C1DF.LJJ(this.LLF, item.getAweme()) && (interfaceC161306Us = this.LLD) != null) {
                        C161316Ut.LIZ(interfaceC161306Us, arrayList, null, 14);
                    }
                }
            }
            this.LLF = item.getAweme();
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
        view.post(new ARunnableS13S0300000_2(view, this, LIZ, 8));
    }
}
