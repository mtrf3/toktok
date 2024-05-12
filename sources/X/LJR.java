package X;

import android.view.View;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJR implements InterfaceC19530ph {
    public final /* synthetic */ StoryInboxCell LIZ;

    public LJR(StoryInboxCell storyInboxCell) {
        this.LIZ = storyInboxCell;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        o.LJIIIZ(itemID, "itemID");
        if (this.LIZ.LJLJLJ) {
            if (StoryInboxCell.N()) {
                this.LIZ.L().tryLogStoryCreationShow();
            } else {
                this.LIZ.M().tryLogStoryCreationShow();
            }
        }
    }
}
