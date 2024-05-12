package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3;

/* renamed from: X.MFs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56508MFs implements InterfaceC55407Lop {
    public final /* synthetic */ I18nUserProfileFragmentV3 LIZ;

    public C56508MFs(I18nUserProfileFragmentV3 i18nUserProfileFragmentV3) {
        this.LIZ = i18nUserProfileFragmentV3;
    }

    @Override // X.InterfaceC55407Lop
    public final C55406Loo LIZ(C55406Loo c55406Loo) {
        String str;
        I18nUserProfileFragmentV3 i18nUserProfileFragmentV3 = this.LIZ;
        c55406Loo.LJJLIIIJILLIZJL = i18nUserProfileFragmentV3.LLI;
        c55406Loo.LJJLIIIJJI = i18nUserProfileFragmentV3.LJLIL;
        Aweme aweme = i18nUserProfileFragmentV3.LLIIIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c55406Loo.LJJLIIIJ = str;
        return c55406Loo;
    }
}
