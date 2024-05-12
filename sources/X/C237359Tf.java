package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileUser;

/* renamed from: X.9Tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237359Tf extends AbstractC65781Prl implements InterfaceC65784Pro<ProfileUser> {
    public static final C237359Tf LJLIL = new C237359Tf();

    public C237359Tf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ProfileUser invoke() {
        ProfileUser profileUser = C237409Tk.LIZIZ;
        if (profileUser != null) {
            return profileUser;
        }
        C237409Tk.LIZ("load_page_model_preload", false);
        return C237409Tk.LIZIZ;
    }
}
