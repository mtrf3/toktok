package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.cell.FollowStorySkylightCell;
import kotlin.jvm.internal.o;

/* renamed from: X.L6t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53727L6t implements InterfaceC19530ph {
    public final /* synthetic */ FollowStorySkylightCell LIZ;

    public C53727L6t(FollowStorySkylightCell followStorySkylightCell) {
        this.LIZ = followStorySkylightCell;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        InterfaceC100393wp interfaceC100393wp;
        o.LJIIIZ(itemID, "itemID");
        if (this.LIZ.L().getMode() != EnumC53695L5n.NONE && (interfaceC100393wp = (InterfaceC100393wp) this.LIZ.LJLJLLL.getValue()) != null) {
            interfaceC100393wp.LJFF(this.LIZ.L().getMode());
        }
    }
}
