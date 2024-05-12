package X;

import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class LJS extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final LJR LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public LJS(StoryInboxCell storyInboxCell) {
        this.LJ = new AqS159S0100000_9(storyInboxCell, 646);
        this.LJFF = new LJR(storyInboxCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
