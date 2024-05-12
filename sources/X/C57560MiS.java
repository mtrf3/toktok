package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import kotlin.jvm.internal.o;

/* renamed from: X.MiS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57560MiS implements InterfaceC113814dN {
    public final /* synthetic */ FriendsEmptyPageSharePackage LJLIL;
    public final /* synthetic */ FriendsFeedEmptyPageCell LJLILLLLZI;

    public C57560MiS(FriendsEmptyPageSharePackage friendsEmptyPageSharePackage, FriendsFeedEmptyPageCell friendsFeedEmptyPageCell) {
        this.LJLIL = friendsEmptyPageSharePackage;
        this.LJLILLLLZI = friendsFeedEmptyPageCell;
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        FriendsEmptyPageSharePackage friendsEmptyPageSharePackage = this.LJLIL;
        Context context = this.LJLILLLLZI.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        friendsEmptyPageSharePackage.LIZIZ(context, channel);
    }
}
