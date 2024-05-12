package com.ss.android.ugc.aweme.followingtab.ability;

import X.LWM;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class FollowingBottomTabAvatarAbility extends BaseBottomTabAvatarAbility {
    public final String LJLJJL;

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final String LIZIZ() {
        return this.LJLJJL;
    }

    public FollowingBottomTabAvatarAbility(Context context) {
        super(context);
        this.LJLJJL = "Following";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ability.BaseBottomTabAvatarAbility
    public final void LJ(ArrayList<String> arrayList) {
        LWM.LIZIZ.LIZ.LIZIZ(arrayList);
    }
}
