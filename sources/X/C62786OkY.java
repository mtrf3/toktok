package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecEmptyFragment;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OkY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62786OkY implements InterfaceC113814dN {
    public final /* synthetic */ RecEmptyFragment LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public C62786OkY(RecEmptyFragment recEmptyFragment, Context context) {
        this.LJLIL = recEmptyFragment;
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = this.LJLIL.LJLJI;
        if (inviteFriendsPageSharePackage != null) {
            Context context = this.LJLILLLLZI;
            o.LJIIIIZZ(context, "context");
            inviteFriendsPageSharePackage.LIZIZ(context, channel);
            return;
        }
        o.LJIJI("sharePackage");
        throw null;
    }
}
