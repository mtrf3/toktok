package X;

import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.widgets.header.avatar.avatarcomp.profile.AvatarProfileDataAdapter;

/* renamed from: X.L6h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53715L6h implements InterfaceC53724L6q {
    public final /* synthetic */ AvatarProfileDataAdapter LIZ;

    public C53715L6h(AvatarProfileDataAdapter avatarProfileDataAdapter) {
        this.LIZ = avatarProfileDataAdapter;
    }

    @Override // X.InterfaceC53724L6q
    public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
        L5U l5u;
        AvatarProfileDataAdapter avatarProfileDataAdapter = this.LIZ;
        String str = avatarProfileDataAdapter.LJLILLLLZI;
        if (str != null && (l5u = avatarProfileDataAdapter.LJLJI) != null) {
            L5V.LIZ(l5u, str, profileBadgeStruct, EnumC53663L4h.PROFILE, null, 24);
        }
    }
}
