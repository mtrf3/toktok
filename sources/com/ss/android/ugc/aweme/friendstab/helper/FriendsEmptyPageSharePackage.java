package com.ss.android.ugc.aweme.friendstab.helper;

import X.C57561MiT;
import X.C62358Ode;
import X.C62374Odu;
import X.InterfaceC62225ObV;
import X.OYH;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsEmptyPageSharePackage extends LinkDefaultSharePackage {
    public static final C57561MiT Companion = new C57561MiT();
    public final FriendsEmptyPageMainSectionVM vm;

    public FriendsEmptyPageSharePackage(C62374Odu c62374Odu, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM) {
        super(c62374Odu);
        this.vm = friendsEmptyPageMainSectionVM;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        String LIZ = C62358Ode.LIZ(channel, this.itemType, this.description);
        FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.vm;
        String title = this.title;
        friendsEmptyPageMainSectionVM.getClass();
        o.LJIIIZ(title, "title");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(friendsEmptyPageMainSectionVM), null, null, new OYH(friendsEmptyPageMainSectionVM, channel, title, LIZ, context, null), 3);
        return true;
    }
}
