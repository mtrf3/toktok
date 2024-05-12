package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.L5h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53689L5h extends TBS implements InterfaceC65784Pro<Integer> {
    public C53689L5h(User user) {
        super(0, user, User.class, "getFollowerCount", "getFollowerCount()I", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((User) this.receiver).getFollowerCount());
    }
}
