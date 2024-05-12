package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Kxo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53416Kxo extends TBS implements InterfaceC65784Pro<Integer> {
    public C53416Kxo(User user) {
        super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((User) this.receiver).getFansCount());
    }
}
