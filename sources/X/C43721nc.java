package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.1nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43721nc extends C1ZB implements InterfaceC07860So {
    public C43711nb LJLLLLLL;
    public AbstractC21290sX LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJZL;

    public C43721nc() {
        this(null, null);
    }

    static {
        C16880lQ.LJLLJ(C43721nc.class);
    }

    @Override // X.C1ZB, X.C21320sa
    public final AbstractC21310sZ LIZIZ() {
        return new C43711nb(this.LJLLLLLL, this, null);
    }

    @Override // X.C1ZB
    /* renamed from: LJFF */
    public final C1ZA LIZIZ() {
        return new C43711nb(this.LJLLLLLL, this, null);
    }

    @Override // X.C1ZB, X.C21320sa, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.LJZL) {
            super.mutate();
            this.LJLLLLLL.LJ();
            this.LJZL = true;
        }
        return this;
    }

    @Override // X.C21320sa, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC21290sX abstractC21290sX = this.LJLZ;
        if (abstractC21290sX != null) {
            abstractC21290sX.LIZLLL();
            this.LJLZ = null;
            LIZLLL(this.LJZ);
            this.LJZ = -1;
            this.LJZI = -1;
        }
    }

    @Override // X.C1ZB, X.C21320sa
    public final void LJ(AbstractC21310sZ abstractC21310sZ) {
        super.LJ(abstractC21310sZ);
        if (abstractC21310sZ instanceof C43711nb) {
            this.LJLLLLLL = (C43711nb) abstractC21310sZ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (LIZLLL(r7) != false) goto L10;
     */
    @Override // X.C1ZB, X.C21320sa, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43721nc.onStateChange(int[]):boolean");
    }

    public C43721nc(C43711nb c43711nb, Resources resources) {
        this.LJZ = -1;
        this.LJZI = -1;
        LJ(new C43711nb(c43711nb, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // X.C21320sa, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC21290sX abstractC21290sX = this.LJLZ;
        if (abstractC21290sX != null && (visible || z2)) {
            if (z) {
                abstractC21290sX.LIZJ();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0174, code lost:
    
        r16 = 8589934592L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0179, code lost:
    
        r3 = r1;
        r15.LJJIJIIJIL.LIZ(r18, java.lang.Long.valueOf(r3 | r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
    
        if (r20 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018c, code lost:
    
        r15.LJJIJIIJIL.LIZ((r5 << 32) | r7, java.lang.Long.valueOf((r3 | 4294967296L) | r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0267, code lost:
    
        r9.onStateChange(r9.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x026e, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        r1 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        if (r1 != 4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ad, code lost:
    
        if (r1 != 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b9, code lost:
    
        if (r26.getName().equals("vector") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bb, code lost:
    
        r0 = new X.C40681ii();
        r0.inflate(r24, r26, r25, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dc, code lost:
    
        r0 = android.graphics.drawable.Drawable.createFromXmlInner(r24, r26, r25, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e0, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024d, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0266, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c3, code lost:
    
        r1 = r9.LJLLLLLL;
        r2 = r1.LIZ(r0);
        r1.LJJIJIIJI[r2] = r4;
        r1.LJJIJIL.LJI(r2, java.lang.Integer.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0141, code lost:
    
        r1 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
    
        if (r1 != 4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014a, code lost:
    
        if (r1 != 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0156, code lost:
    
        if (r26.getName().equals("animated-vector") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0158, code lost:
    
        r0 = new X.C40651if(r22);
        r0.inflate(r24, r26, r25, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        r0 = android.graphics.drawable.Drawable.createFromXmlInner(r24, r26, r25, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0234, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0160, code lost:
    
        if (r2 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0162, code lost:
    
        if (r4 == (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0164, code lost:
    
        r15 = r9.LJLLLLLL;
        r1 = r15.LIZ(r0);
        r7 = r2;
        r5 = r4;
        r18 = r5 | (r7 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0172, code lost:
    
        if (r20 == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C43721nc LJI(android.content.Context r22, android.content.res.Resources.Theme r23, android.content.res.Resources r24, android.util.AttributeSet r25, org.xmlpull.v1.XmlPullParser r26) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43721nc.LJI(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):X.1nc");
    }
}
