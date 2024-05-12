package X;

import java.util.LinkedHashMap;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3YT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YT implements InterfaceC76442zI {
    public static final C3YT LJLIL;
    public static final C3RW LJLILLLLZI;
    public static final java.util.Map<Integer, C3YY> LJLJI;
    public static volatile boolean LJLJJI;

    static {
        C3YT c3yt = new C3YT();
        LJLIL = c3yt;
        LJLILLLLZI = C3RW.LIZ;
        LJLJI = new LinkedHashMap();
        if (((Number) C3YZ.LIZ.getValue()).intValue() == 2) {
            C4ZL.LIZLLL();
            C76482zM.LIZ(c3yt);
        } else {
            EventBus.LIZJ().LJIILJJIL(c3yt);
        }
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        if (LJLJJI) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C770430q(null), 3);
            LJLJJI = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        r0 = r0.getSpotlightRelationOfFriends(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
    
        r0 = r0.getRelations();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015c, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015f, code lost:
    
        r9 = r0.iterator();
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x015f -> B:23:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YT.LIZJ(X.2kd):java.lang.Object");
    }

    @QD3
    public final void onEvent(C76522zQ c76522zQ) {
        if (LJLJJI) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C770430q(null), 3);
            LJLJJI = false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:10|11|12|13)(2:16|17))(7:18|(1:20)|21|(6:23|(1:25)(1:31)|26|(1:28)|29|30)|32|33|(4:35|(2:37|38)|12|13)(2:39|40))))|42|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r2 = r2 + 1;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0085 -> B:12:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarRelation r11, X.InterfaceC67352kd<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C3YU
            if (r0 == 0) goto L22
            r6 = r12
            X.3YU r6 = (X.C3YU) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r3 = r6.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L28
            int r2 = r6.LJLILLLLZI
            X.3Yp r1 = r6.LJLIL
            goto L88
        L22:
            X.3YU r6 = new X.3YU
            r6.<init>(r10, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r3)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            int r9 = r11.getRelationType()
            java.util.List r8 = r11.getSecUserIds()
            if (r8 != 0) goto L44
            X.OQg r8 = X.C61878OQg.INSTANCE
        L44:
            java.util.List r0 = r11.getCreatedTimes()
            if (r0 != 0) goto L6a
            java.util.List r0 = r11.getSecUserIds()
            if (r0 == 0) goto L64
            int r4 = r0.size()
        L54:
            java.lang.Long[] r3 = new java.lang.Long[r4]
            r2 = 0
        L57:
            if (r2 >= r4) goto L66
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r2] = r0
            int r2 = r2 + 1
            goto L57
        L64:
            r4 = 0
            goto L54
        L66:
            java.util.List r0 = X.ORY.LJJZZIII(r3)
        L6a:
            X.3Yp r1 = new X.3Yp
            r1.<init>(r9, r8, r0)
            r2 = 0
        L70:
            r0 = 2
            if (r2 >= r0) goto L93
            X.Ol8 r0 = X.C3S6.LIZ     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8e
            X.3aM r0 = (X.C86463aM) r0     // Catch: java.lang.Throwable -> L8e
            r6.LJLIL = r1     // Catch: java.lang.Throwable -> L8e
            r6.LJLILLLLZI = r2     // Catch: java.lang.Throwable -> L8e
            r6.LJLJJL = r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.LJ(r1, r6)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r7) goto L8b
            goto L91
        L88:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L8e
        L8b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            int r2 = r2 + 1
            goto L70
        L91:
            return r7
        L92:
            return r0
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YT.LIZIZ(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarRelation, X.2kd):java.lang.Object");
    }
}
