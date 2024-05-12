package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFQ implements InterfaceC72332sf {
    public final User LJLIL;

    @Override // X.InterfaceC72332sf
    public String getSecUserId() {
        return this.LJLIL.getSecUid();
    }

    @Override // X.InterfaceC72332sf
    public String getShortId() {
        return this.LJLIL.getShortId();
    }

    @Override // X.InterfaceC72332sf
    public String getUniqueId() {
        return this.LJLIL.getUniqueId();
    }

    @Override // X.InterfaceC72332sf
    public UrlModel getUserAvatar() {
        return this.LJLIL.getAvatarMedium();
    }

    @Override // X.InterfaceC72332sf
    public String getUserId() {
        return this.LJLIL.getUid();
    }

    @Override // X.InterfaceC72332sf
    public Integer getUserPeriod() {
        return Integer.valueOf(this.LJLIL.getUserPeriod());
    }

    @Override // X.InterfaceC72332sf
    public UrlModel getUserThumb() {
        return this.LJLIL.getAvatarThumb();
    }

    public final User getUser() {
        return this.LJLIL;
    }

    public AFQ(User user) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
    }
}
