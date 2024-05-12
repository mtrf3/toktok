package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URV extends URR {
    public final String LJ;

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return "show_authorize_pop_up";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r1.equals("guide") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r1.equals("system") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
    
        if (r1.equals("authorize") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007c, code lost:
    
        r1 = "unknown";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0047. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    @Override // X.AbstractC238349Xa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LIZIZ() {
        /*
            r7 = this;
            X.URz r5 = r7.LIZIZ
            X.7au r2 = new X.7au
            r2.<init>()
            X.URy r0 = r5.LJLIL
            X.M4B r0 = r0.LJ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            X.URy r0 = r5.LJLIL
            X.M4B r0 = r0.LJ
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "enter_method"
            r2.LJIIIZ(r0, r1)
            X.URy r0 = r5.LJLIL
            X.M4B r0 = r0.LJ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "previous_page"
            r2.LJIIIZ(r0, r1)
            X.URy r0 = r5.LJLIL
            X.USH r0 = r0.LIZLLL
            X.UPn r0 = r0.LIZ
            java.lang.String r1 = r0.getStr()
            java.lang.String r0 = "platform"
            r2.LJIIIZ(r0, r1)
            X.USe r0 = r5.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            boolean r6 = r0.LJLIL
            java.lang.String r1 = r7.LJ
            int r0 = r1.hashCode()
            java.lang.String r3 = "on"
            java.lang.String r4 = "off"
            switch(r0) {
                case -887328209: goto L74;
                case 3599307: goto L5e;
                case 98712316: goto L6a;
                case 1475610601: goto L55;
                default: goto L4a;
            }
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "wrong actual status and popupType"
            r0.toString()
            r1.<init>(r0)
            throw r1
        L55:
            java.lang.String r0 = "authorize"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
            goto L7c
        L5e:
            java.lang.String r0 = "user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
            if (r6 == 0) goto L72
            r1 = r3
            goto L7e
        L6a:
            java.lang.String r0 = "guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L72:
            r1 = r4
            goto L7e
        L74:
            java.lang.String r0 = "system"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L7c:
            java.lang.String r1 = "unknown"
        L7e:
            java.lang.String r0 = "did_status"
            r2.LJIIIZ(r0, r1)
            X.USe r0 = r5.LJLILLLLZI
            X.USf r0 = r0.LJLIL
            boolean r0 = r0.LJLILLLLZI
            if (r0 == 0) goto Lb4
        L8b:
            java.lang.String r0 = "uid_status"
            r2.LJIIIZ(r0, r3)
            java.lang.String r1 = r7.LJ
            java.lang.String r0 = "pop_up_type"
            r2.LJIIIZ(r0, r1)
            java.util.Map r0 = r7.LJ()
            r2.LJIIIIZZ(r0)
            java.util.Map r0 = r7.LJI()
            r2.LJIIIIZZ(r0)
            java.util.Map r0 = r7.LJII()
            r2.LJIIIIZZ(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "authContext.run {\n      …     .builder()\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        Lb4:
            r3 = r4
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.URV.LIZIZ():java.util.Map");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URV(C77211URz c77211URz, String popupType, Integer num) {
        super(c77211URz, num);
        o.LJIIIZ(popupType, "popupType");
        this.LJ = popupType;
    }
}
