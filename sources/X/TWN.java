package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiParserSetting;

/* loaded from: classes14.dex */
public final class TWN {
    public static final /* synthetic */ int LIZ = 0;

    public static TW7 LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        LiveSeiParserSetting liveSeiParserSetting = LiveSeiParserSetting.INSTANCE;
        int seiParserType = liveSeiParserSetting.seiParserType();
        if (seiParserType != 1) {
            if (seiParserType != 2) {
                return new TWO(interfaceC88472Yns);
            }
            return new TWM(interfaceC88472Yns, liveSeiParserSetting.seiParserInterval());
        }
        return new C76610U4w(interfaceC88472Yns);
    }
}
