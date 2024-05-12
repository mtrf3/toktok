package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushConfig;

/* loaded from: classes16.dex */
public final class YBO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final YBO LJLIL = new YBO();

    public YBO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((InnerPushConfig.MetaData) InnerPushConfig.LIZIZ.getValue()).banMaxRecords);
    }
}
