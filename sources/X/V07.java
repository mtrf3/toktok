package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class V07 implements V04 {
    @Override // X.V04
    public final C79007Uzb LJ(String str, V0B v0b, int i, int i2, java.util.Map<EnumC79013Uzh, ?> map) {
        V04 c79004UzY;
        switch (V0D.LIZ[v0b.ordinal()]) {
            case 1:
                c79004UzY = new V0J();
                break;
            case 2:
                c79004UzY = new V0H();
                break;
            case 3:
                c79004UzY = new V0I();
                break;
            case 4:
                c79004UzY = new V0A();
                break;
            case 5:
                c79004UzY = new C79016Uzk();
                break;
            case 6:
                c79004UzY = new V05();
                break;
            case 7:
                c79004UzY = new V08();
                break;
            case 8:
                c79004UzY = new V0C();
                break;
            case 9:
                c79004UzY = new V09();
                break;
            case 10:
                c79004UzY = new C79018Uzm();
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                c79004UzY = new C64491PSt();
                break;
            case 12:
                c79004UzY = new C78605Ut7();
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                c79004UzY = new C79004UzY();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(v0b)));
        }
        return c79004UzY.LJ(str, v0b, i, i2, map);
    }
}
