package X;

import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;

/* renamed from: X.MzW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58618MzW implements InterfaceC58338Mv0 {
    public boolean LIZ;

    public C58618MzW() {
        SettingsManagerProxy.inst().registerSettingsWatcher(new C58615MzT(this), false);
    }

    public static boolean LIZIZ(UgAwemeActivitySetting ugAwemeActivitySetting) {
        boolean booleanValue;
        boolean z;
        if (ugAwemeActivitySetting == null) {
            ugAwemeActivitySetting = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting();
        }
        if (ugAwemeActivitySetting == null) {
            return false;
        }
        try {
            Boolean overallSwitch = ugAwemeActivitySetting.getOverallSwitch();
            if (overallSwitch != null) {
                booleanValue = overallSwitch.booleanValue();
            } else {
                booleanValue = false;
            }
            if (ugAwemeActivitySetting != null) {
                if (ugAwemeActivitySetting.getShortcutInfo() != null) {
                    z = true;
                    if (!booleanValue && z) {
                        return true;
                    }
                }
            }
            z = false;
            return !booleanValue ? false : false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x009c, code lost:
    
        if (r2 == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159 A[Catch: Exception -> 0x01cc, TryCatch #0 {Exception -> 0x01cc, blocks: (B:66:0x013f, B:68:0x0149, B:70:0x014f, B:71:0x0153, B:73:0x0159, B:76:0x0164, B:79:0x0177, B:85:0x0196, B:86:0x01b5), top: B:65:0x013f }] */
    @Override // X.InterfaceC58338Mv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<X.N2A> LIZ(android.content.Context r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58618MzW.LIZ(android.content.Context, boolean):java.util.Set");
    }
}
