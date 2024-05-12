package X;

import com.ss.android.ugc.aweme.business.story.cell.StorySkylightCell;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.L6s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53726L6s extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final C53725L6r LJFF;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    public C53726L6s(StorySkylightCell storySkylightCell) {
        this.LJ = new AqS159S0100000_9(storySkylightCell, 74);
        this.LJFF = new C53725L6r(storySkylightCell);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
