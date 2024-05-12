package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.agilelogger.ALog;

/* renamed from: X.Njo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60192Njo implements InterfaceC55505LqP {
    public ViewGroup LIZ;
    public View LIZIZ;
    public final Activity LIZJ;
    public int LIZLLL = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        if (r9.equals("honor") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0116, code lost:
    
        r7.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil").getMethod("hasNotchInScreen", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0127, code lost:
    
        r0 = X.C16880lQ.LLLLLLLLL(r7.getPackageManager(), r7.getPackageName(), 128);
        kotlin.jvm.internal.o.LJIIIIZZ(r0, "activity.packageManager.…ageManager.GET_META_DATA)");
        r1 = r0.metaData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0138, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        if (X.C16880lQ.LLJJIII(r1, "android.notch_support") == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014b, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
        r0 = X.OK1.LIZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        if (r9.equals("huawei") == false) goto L17;
     */
    @Override // X.InterfaceC55505LqP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60192Njo.LIZ():void");
    }

    @Override // X.InterfaceC55505LqP
    public final void LIZIZ() {
        View view;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null && (view = this.LIZIZ) != null) {
            C16880lQ.LJLLL(view, viewGroup);
            int i = this.LIZLLL;
            if (i != -1) {
                this.LIZJ.getWindow().setStatusBarColor(i);
                this.LIZLLL = -1;
            }
        }
        this.LIZ = null;
        this.LIZIZ = null;
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("awesome_splash", "removeSplashLoadMask");
    }

    public C60192Njo(ActivityC45651qj activityC45651qj) {
        this.LIZJ = activityC45651qj;
    }
}
