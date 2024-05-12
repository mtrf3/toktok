package X;

import com.ss.android.ugc.cut_reportor_interface.ICutReporter;

/* renamed from: X.6ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171956ox {
    public static /* synthetic */ void LIZ(ICutReporter iCutReporter, int i, String str, String str2, String str3, String str4, int i2) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str;
        String str8 = str2;
        if ((i2 & 2) != 0) {
            str7 = null;
        }
        if ((i2 & 4) != 0) {
            str8 = null;
        }
        if ((i2 & 8) != 0) {
            str6 = null;
        }
        if ((i2 & 16) != 0) {
            str5 = null;
        }
        iCutReporter.report(i, str7, str8, str6, str5, null, null);
    }
}
