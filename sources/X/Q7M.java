package X;

import android.app.Activity;
import com.facebook.share.model.ShareContent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class Q7M<CONTENT, RESULT> {
    public static final Object LJ = new Object();
    public final Activity LIZ;
    public List<? extends Q7M<CONTENT, RESULT>.b> LIZIZ;
    public final int LIZJ;
    public Q8K LIZLLL;

    public abstract Q6H LIZIZ();

    public abstract List<Q7M<CONTENT, RESULT>.b> LIZJ();

    /* loaded from: classes12.dex */
    public abstract class b {
        public final Object LIZ;

        public abstract boolean LIZ(ShareContent shareContent, boolean z);

        public abstract Q6H LIZIZ(ShareContent shareContent);

        public b(Q7M this$0) {
            o.LJIIIZ(this$0, "this$0");
            this.LIZ = Q7M.LJ;
        }
    }

    public final boolean LIZ(ShareContent shareContent) {
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZJ();
        }
        List<? extends Q7M<CONTENT, RESULT>.b> list = this.LIZIZ;
        if (list != null) {
            Iterator<? extends Q7M<CONTENT, RESULT>.b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().LIZ(shareContent, false)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r3 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.facebook.share.model.ShareContent r6) {
        /*
            r5 = this;
            java.util.List<? extends X.Q7M<CONTENT, RESULT>$b> r0 = r5.LIZIZ
            if (r0 != 0) goto La
            java.util.List r0 = r5.LIZJ()
            r5.LIZIZ = r0
        La:
            java.util.List<? extends X.Q7M<CONTENT, RESULT>$b> r0 = r5.LIZIZ
            if (r0 == 0) goto L6b
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            X.Q7M$b r1 = (X.Q7M.b) r1
            r0 = 1
            boolean r0 = r1.LIZ(r6, r0)
            if (r0 != 0) goto L27
            goto L12
        L27:
            X.Q6H r3 = r1.LIZIZ(r6)     // Catch: X.Q4W -> L2c
            goto L34
        L2c:
            r0 = move-exception
            X.Q6H r3 = r5.LIZIZ()
            X.Q5D.LIZLLL(r3, r0)
        L34:
            if (r3 != 0) goto L44
        L36:
            X.Q6H r3 = r5.LIZIZ()
            X.Q4W r1 = new X.Q4W
            java.lang.String r0 = "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."
            r1.<init>(r0)
            X.Q5D.LIZLLL(r3, r1)
        L44:
            android.app.Activity r2 = r5.LIZ
            if (r2 == 0) goto L5e
            boolean r0 = X.C40700FyC.LIZ(r3)
            if (r0 == 0) goto L68
        L4e:
            boolean r1 = X.C40700FyC.LIZ(r3)
            r0 = 0
            if (r1 == 0) goto L65
        L55:
            X.C16880lQ.LJFF(r2, r0, r4)
            boolean r0 = X.C40700FyC.LIZ(r3)
            if (r0 == 0) goto L5f
        L5e:
            return
        L5f:
            X.Q6I r0 = X.Q6H.LIZLLL     // Catch: java.lang.Throwable -> L5e
            r0.LIZ(r3)     // Catch: java.lang.Throwable -> L5e
            goto L5e
        L65:
            int r0 = r3.LIZ     // Catch: java.lang.Throwable -> L55
            goto L55
        L68:
            android.content.Intent r4 = r3.LIZJ     // Catch: java.lang.Throwable -> L4e
            goto L4e
        L6b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7M.LIZLLL(com.facebook.share.model.ShareContent):void");
    }

    public Q7M(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZJ = i;
        this.LIZLLL = null;
    }
}
