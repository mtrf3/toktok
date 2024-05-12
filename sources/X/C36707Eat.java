package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.ss.android.agilelogger.ALog;
import defpackage.b1;
import java.lang.Thread;
import java.util.HashMap;

/* renamed from: X.Eat, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36707Eat implements AttachUserData {
    public final C39767Fj9 LIZ;

    public C36707Eat(C39767Fj9 c39767Fj9) {
        this.LIZ = c39767Fj9;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        HashMap hashMap = new HashMap();
        if (this.LIZ != null) {
            String str = "";
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("horae", "");
            if ((Thread.getDefaultUncaughtExceptionHandler() instanceof EK7) && (uncaughtExceptionHandler = ((EK7) Thread.getDefaultUncaughtExceptionHandler()).LIZ) != null) {
                StringBuilder LIZJ = b1.LIZJ("", "super:");
                LIZJ.append(uncaughtExceptionHandler.getClass().getName());
                str = X1D.LIZIZ(LIZJ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(Thread.getDefaultUncaughtExceptionHandler().getClass().getName());
            LIZ.append(F8E.LIZ);
            LIZ.append(",ArrayMapPlugin:");
            LIZ.append(F8L.LIZ);
            hashMap.put("double_turbo_quicken_engine", X1D.LIZIZ(LIZ));
        }
        return hashMap;
    }
}
