package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class LT7 {
    public static final LT7 LIZ = new LT7();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LT8.LJLIL);
    public static Integer LIZJ;
    public static NoticeList LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (X.LT7.LIZLLL != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r2 = "ColdStartUnreadOptHelp"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "tryTriggerUnreadShow: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = X.LT7.LIZJ     // Catch: java.lang.Throwable -> L67
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "  "
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r0 = X.LT7.LIZLLL     // Catch: java.lang.Throwable -> L67
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L67
            r0 = 4
            X.C36922EeM.LIZLLL(r0, r2, r1)     // Catch: java.lang.Throwable -> L67
            X.Ol8 r2 = X.L0W.LIZ     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L67
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L67
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L67
            r0 = 1
            if (r1 != r0) goto L48
            java.lang.Integer r0 = X.LT7.LIZJ     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r0 = X.LT7.LIZLLL     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
        L3f:
            X.LT9<V> r2 = X.LT9.LJLIL     // Catch: java.lang.Throwable -> L67
            X.10C r1 = X.C10K.LJIIIIZZ     // Catch: java.lang.Throwable -> L67
            r0 = 0
            X.C10K.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L67
            goto L65
        L48:
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L67
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L67
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L67
            r0 = 2
            if (r1 != r0) goto L5e
            java.lang.Integer r0 = X.LT7.LIZJ     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L3f
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r0 = X.LT7.LIZLLL     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
            goto L3f
        L5e:
            boolean r0 = X.L0W.LIZ()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
            goto L3f
        L65:
            monitor-exit(r3)
            return
        L67:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LT7.LIZIZ():void");
    }

    public final void LIZ(NoticeList noticeList) {
        o.LJIIIZ(noticeList, "noticeList");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("multiUserCountPull: ");
        LIZ2.append(noticeList);
        C36922EeM.LIZLLL(4, "ColdStartUnreadOptHelp", X1D.LIZIZ(LIZ2));
        LIZLLL = noticeList;
        LIZIZ();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRecordImMsgCountEvent(C82793Mt event) {
        o.LJIIIZ(event, "event");
        LIZJ = Integer.valueOf(event.LJLIL);
        LIZIZ();
    }
}
