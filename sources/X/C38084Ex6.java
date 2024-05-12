package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ex6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38084Ex6 implements F0A {
    public static final C38084Ex6 LIZ = new C38084Ex6();
    public static final ArrayList<String> LIZIZ = C47261Igj.LJII("sendLog", "adInfo", "sendLogWithAdInfo", "updatePCMData", "getATTStatus", "sendAnalyticsEvent", "updateFLLocalConv", "showAutofillPopup", "x.reportAppLog", "x.hideLoading");

    @Override // X.F0A
    public final boolean LIZ(String bridgeName) {
        o.LJIIIZ(bridgeName, "bridgeName");
        return LIZIZ.contains(bridgeName);
    }

    @Override // X.F0A
    public final boolean LIZIZ(C38236EzY bridgeInfo) {
        o.LJIIIZ(bridgeInfo, "bridgeInfo");
        return LIZIZ.contains(bridgeInfo.LIZ);
    }
}
