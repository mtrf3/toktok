package X;

import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;

/* renamed from: X.9yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254419yf extends AbstractC65781Prl implements InterfaceC65784Pro<PaidContentAwareBannerSetting> {
    public static final C254419yf LJLIL = new C254419yf();

    public C254419yf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final PaidContentAwareBannerSetting invoke() {
        return HG3.LJIILL().getCurUser().getPaidContentAwareBannerSetting();
    }
}
