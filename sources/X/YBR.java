package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig;

/* loaded from: classes16.dex */
public final class YBR extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final YBR LJLIL = new YBR();

    public YBR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((InnerPushConfig.MetaData) InnerPushConfig.LIZIZ.getValue()).popupMaxRecords);
    }
}
