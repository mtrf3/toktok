package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;

/* renamed from: X.TSd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74667TSd implements C9W {
    public final /* synthetic */ GameLinkGuestPresenter LIZ;

    public C74667TSd(GameLinkGuestPresenter gameLinkGuestPresenter) {
        this.LIZ = gameLinkGuestPresenter;
    }

    @Override // X.C9W
    public final void LIZ(EnumC48190Ivi enumC48190Ivi) {
        this.LIZ.isNetworkAvailable.onNext(Boolean.valueOf(enumC48190Ivi.isAvailable()));
    }
}
