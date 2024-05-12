package Y;

import X.C141335gf;
import X.C3C5;
import X.C76800UCe;
import X.EnumC53663L4h;
import X.InterfaceC53591L1n;
import X.InterfaceC53758L7y;
import X.L5U;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes10.dex */
public class ARunnableS2S1400000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Map<EnumC53663L4h, InterfaceC53591L1n<?, ?>> hv0 = ((AvatarControllerVM) this.l1).hv0();
        String str = this.s0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.l2;
        L5U l5u = (L5U) this.l3;
        Object obj = this.l4;
        for (Map.Entry<EnumC53663L4h, InterfaceC53591L1n<?, ?>> entry : hv0.entrySet()) {
            entry.getKey();
            InterfaceC53591L1n<?, ?> value = entry.getValue();
            if (value != null) {
                value.LIZJ(str, new WeakReference(lifecycleOwner), l5u, obj);
            }
        }
    }

    public final void LIZ$1() {
        try {
            InterfaceC53758L7y interfaceC53758L7y = (InterfaceC53758L7y) this.l1;
            Integer num = (Integer) this.l2;
            Integer num2 = (Integer) this.l3;
            Throwable th = (Throwable) this.l4;
            if (th == null) {
                th = new Throwable(this.s0);
            }
            interfaceC53758L7y.LIZ(num, num2, th);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r1.length() > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r13 = this;
            java.lang.String r5 = ""
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = r13.s0     // Catch: java.lang.Throwable -> La
            r7.<init>(r0)     // Catch: java.lang.Throwable -> La
            goto L87
        La:
            r10 = move-exception
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "_Header_RequestID"
            X.Xyj r0 = X.C86597Xyj.LIZ     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r13.l1     // Catch: java.lang.Throwable -> La0
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> La0
            r0.getClass()     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "x-tt-logid"
            boolean r0 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L56
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L56
        L2b:
            org.json.JSONObject r7 = r4.put(r3, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "JSONObject().put(REQUEST…RequestLogId(respHeader))"
            kotlin.jvm.internal.o.LJFF(r7, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La0
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La0
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> La0
            r1.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r9 = r13.s0     // Catch: java.lang.Throwable -> La0
            goto L58
        L56:
            r0 = r5
            goto L2b
        L58:
            if (r1 == 0) goto L5b
            goto L60
        L5b:
            if (r10 != 0) goto L66
            if (r9 == 0) goto L87
            goto L66
        L60:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> La0
            if (r0 <= 0) goto L5b
        L66:
            java.lang.Object r6 = r13.l2     // Catch: java.lang.Throwable -> La0
            X.L7y r6 = (X.InterfaceC53758L7y) r6     // Catch: java.lang.Throwable -> La0
            java.lang.Object r8 = r13.l1     // Catch: java.lang.Throwable -> La0
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L71
            goto L72
        L71:
            r9 = r5
        L72:
            if (r10 == 0) goto L75
            goto L7a
        L75:
            java.lang.Throwable r10 = new java.lang.Throwable     // Catch: java.lang.Throwable -> La0
            r10.<init>(r1)     // Catch: java.lang.Throwable -> La0
        L7a:
            java.lang.Object r11 = r13.l3     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> La0
            java.lang.Object r12 = r13.l4     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> La0
            X.UCe r0 = r6.LIZJ(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La0
            goto L9c
        L87:
            java.lang.Object r3 = r13.l2     // Catch: java.lang.Throwable -> La0
            X.L7y r3 = (X.InterfaceC53758L7y) r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r13.l1     // Catch: java.lang.Throwable -> La0
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = r13.l3     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r13.l4     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La0
            r3.LIZIZ(r7, r2, r1, r0)     // Catch: java.lang.Throwable -> La0
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> La0
        L9c:
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> La0
            goto La8
        La0:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1400000_9.LIZ$2():void");
    }

    public static final void run$0(ARunnableS2S1400000_9 aRunnableS2S1400000_9) {
        boolean LIZ;
        try {
            aRunnableS2S1400000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1400000_9 aRunnableS2S1400000_9) {
        boolean LIZ;
        try {
            aRunnableS2S1400000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1400000_9 aRunnableS2S1400000_9) {
        boolean LIZ;
        try {
            aRunnableS2S1400000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1400000_9(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.s0 = str;
    }

    public ARunnableS2S1400000_9(AvatarControllerVM avatarControllerVM, String str, String str2, LifecycleOwner lifecycleOwner, L5U l5u, Object obj, int i) {
        this.$t = i;
        this.l1 = avatarControllerVM;
        this.s0 = str2;
        this.l2 = lifecycleOwner;
        this.l3 = l5u;
        this.l4 = obj;
    }
}
