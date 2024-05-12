package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;

/* renamed from: X.MFr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56507MFr implements InterfaceC55407Lop {
    public final /* synthetic */ I18nUserProfileFragmentV2 LIZ;

    public C56507MFr(I18nUserProfileFragmentV2 i18nUserProfileFragmentV2) {
        this.LIZ = i18nUserProfileFragmentV2;
    }

    @Override // X.InterfaceC55407Lop
    public final C55406Loo LIZ(C55406Loo c55406Loo) {
        String str;
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = this.LIZ;
        c55406Loo.LJJLIIIJILLIZJL = i18nUserProfileFragmentV2.LLI;
        c55406Loo.LJJLIIIJJI = i18nUserProfileFragmentV2.LJLIL;
        Aweme aweme = i18nUserProfileFragmentV2.LLIIIZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c55406Loo.LJJLIIIJ = str;
        return c55406Loo;
    }
}
