package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* loaded from: classes8.dex */
public final class HSP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final HSP LJLIL = new HSP();

    public HSP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getMvThemeRecordMode());
    }
}
