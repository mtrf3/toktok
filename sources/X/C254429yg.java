package X;

import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;

/* renamed from: X.9yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254429yg extends AbstractC65781Prl implements InterfaceC65784Pro<PaidContentAwareBannerSetting> {
    public static final C254429yg LJLIL = new C254429yg();

    public C254429yg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PaidContentAwareBannerSetting invoke() {
        return HG3.LJIILL().getCurUser().getPaidContentAwareBannerSetting();
    }
}
