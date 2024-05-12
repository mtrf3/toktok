package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.9Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235769Nc implements C9PK {
    public static volatile C235769Nc LJLJI;
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI = "my_profile_bottom_part_screen_scene";

    @Override // X.C9PK
    public final boolean needConflictWithParent() {
        return false;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return this.LJLIL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LJLILLLLZI;
    }

    public C235769Nc(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }
}
