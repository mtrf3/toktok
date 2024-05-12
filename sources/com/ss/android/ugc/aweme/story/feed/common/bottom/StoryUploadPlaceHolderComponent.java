package com.ss.android.ugc.aweme.story.feed.common.bottom;

import X.C221108m2;
import X.C62822Ol8;
import X.C8T7;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryUploadPlaceHolderComponent extends BaseCellPlaceHolderComponent implements ComponentPriorityProtocol {
    public final C62822Ol8 LLD;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent
    public final boolean b4() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "bottom_container_story_uploading_bar";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryUploadPlaceHolderComponent() {
        super("story_uploading_bar");
        new LinkedHashMap();
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 871));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent
    /* renamed from: c4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLD.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
    }
}
