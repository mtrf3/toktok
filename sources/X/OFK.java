package X;

/* loaded from: classes11.dex */
public final class OFK implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public OFK(String str, Object obj, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r1.equals("schema") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        r3 = X.OFH.LIZ;
        r2 = r5.LJLILLLLZI;
        r1 = r5.LJLIL;
        r0 = r5.LJLJI;
        r3.getClass();
        X.OFI.LJIIJ(r2, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r1.equals("template_res_type") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (r1.equals("container_name") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1.equals("container_version") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            X.OFH r0 = X.OFH.LIZLLL
            java.lang.String r1 = r5.LJLIL
            r0.getClass()
            java.lang.String r4 = "field"
            kotlin.jvm.internal.o.LJIIJ(r1, r4)
            int r0 = r1.hashCode()
            switch(r0) {
                case -907987551: goto L5b;
                case -245775970: goto L64;
                case 855478153: goto L6d;
                case 2138439450: goto L76;
                default: goto L13;
            }
        L13:
            X.OFI r0 = X.OFH.LIZ
            java.lang.String r3 = r5.LJLILLLLZI
            java.lang.String r2 = r5.LJLIL
            java.lang.Object r1 = r5.LJLJI
            r0.getClass()
            java.lang.String r0 = "containerId"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            kotlin.jvm.internal.o.LJIIJ(r2, r4)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.util.Map r0 = X.OFI.LIZJ(r3)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r2, r1)
        L34:
            X.OFI r1 = X.OFH.LIZ
            java.lang.String r0 = r5.LJLILLLLZI
            r1.getClass()
            X.COL r2 = X.OFI.LJ(r0)
            if (r2 == 0) goto L5a
            java.util.Map<java.lang.String, X.OFM> r1 = X.OFH.LIZIZ
            java.lang.Object r0 = r2.LIZ
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r3 = r1.get(r0)
            X.OFM r3 = (X.OFM) r3
            if (r3 == 0) goto L5a
            android.view.View r2 = r2.LIZ()
            java.lang.String r1 = r5.LJLIL
            java.lang.Object r0 = r5.LJLJI
            r3.handleCollectEvent(r2, r1, r0)
        L5a:
            return
        L5b:
            java.lang.String r0 = "schema"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L7e
        L64:
            java.lang.String r0 = "template_res_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L7e
        L6d:
            java.lang.String r0 = "container_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            goto L7e
        L76:
            java.lang.String r0 = "container_version"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
        L7e:
            X.OFI r3 = X.OFH.LIZ
            java.lang.String r2 = r5.LJLILLLLZI
            java.lang.String r1 = r5.LJLIL
            java.lang.Object r0 = r5.LJLJI
            r3.getClass()
            X.OFI.LJIIJ(r2, r0, r1)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OFK.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
