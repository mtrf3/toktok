package X;

import android.R;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.YiK, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public enum EnumC88128YiK {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);

    public static final C88131YiN Companion = new C88131YiN();
    public final int code;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC88128YiK[] valuesCustom() {
        return (EnumC88128YiK[]) Arrays.copyOf(values(), 28);
    }

    public final EnumC88128YiK getParent() {
        int i = this.code;
        if ((i & 255) > 0) {
            Companion.getClass();
            return C88131YiN.LIZ(i & (-256));
        }
        if ((65280 & i) > 0) {
            Companion.getClass();
            return C88131YiN.LIZ(i & (-65536));
        }
        if ((16711680 & i) > 0) {
            Companion.getClass();
            return C88131YiN.LIZ(i & (-16777216));
        }
        Companion.getClass();
        return C88131YiN.LIZ(0);
    }

    public final String toKey() {
        return o.LJIILLIIL(this, "FBSDKFeature");
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C88129YiL.LIZ[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "AAM";
            case 12:
                return "PrivacyProtection";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "SuggestedEvents";
            case 14:
                return "IntelligentIntegrity";
            case 15:
                return "ModelRequest";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "EventDeactivation";
            case 17:
                return "OnDeviceEventProcessing";
            case 18:
                return "OnDevicePostInstallEventProcessing";
            case 19:
                return "IAPLogging";
            case 20:
                return "IAPLoggingLib2";
            case 21:
                return "Monitoring";
            case 22:
                return "ServiceUpdateCompliance";
            case 23:
                return "LoginKit";
            case 24:
                return "ChromeCustomTabsPrefetching";
            case 25:
                return "IgnoreAppSwitchToLoggedOut";
            case 26:
                return "BypassAppSwitch";
            case 27:
                return "ShareKit";
            default:
                return "unknown";
        }
    }

    EnumC88128YiK(int i) {
        this.code = i;
    }
}
