package com.ss.android.ugc.aweme.friendstab.ability;

import X.C54029LIj;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class FriendBottomTabAvatarAbility extends BaseBottomTabAvatarAbility {
    public final String LJLJJL;

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final String LIZIZ() {
        return this.LJLJJL;
    }

    public FriendBottomTabAvatarAbility(Context context) {
        super(context);
        this.LJLJJL = "FRIENDS_TAB";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final void LJ(ArrayList<String> arrayList) {
        C54029LIj.LIZIZ.LIZ.LIZIZ(arrayList);
    }
}
