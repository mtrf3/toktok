package X;

import X.AbstractC90950Zmk;
import X.C90891Zln;

/* renamed from: X.Zln, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90891Zln<MessageType extends AbstractC90950Zmk<MessageType, BuilderType>, BuilderType extends C90891Zln<MessageType, BuilderType>> extends AbstractC90695Zid<MessageType, BuilderType> {
    public final MessageType LJLIL;
    public MessageType LJLILLLLZI;
    public boolean LJLJI = false;

    @Override // X.InterfaceC90327Zch
    public final /* synthetic */ AbstractC90950Zmk LJIILIIL() {
        return this.LJLIL;
    }

    public final MessageType LIZLLL() {
        if (this.LJLJI) {
            return this.LJLILLLLZI;
        }
        MessageType messagetype = this.LJLILLLLZI;
        C90375ZdT.LIZJ.LIZ(messagetype.getClass()).LJ(messagetype);
        this.LJLJI = true;
        return this.LJLILLLLZI;
    }

    public final void LJ() {
        MessageType messagetype = (MessageType) this.LJLILLLLZI.LJ(4, null);
        LIZ(messagetype, this.LJLILLLLZI);
        this.LJLILLLLZI = messagetype;
    }

    public final Object clone() {
        C90891Zln c90891Zln = (C90891Zln) this.LJLIL.LJ(5, null);
        c90891Zln.LIZIZ(LIZLLL());
        return c90891Zln;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r1 != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType LIZJ() {
        /*
            r5 = this;
            X.Zmk r4 = r5.LIZLLL()
            r3 = 1
            r2 = 0
            java.lang.Object r0 = r4.LJ(r3, r2)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            if (r0 != r3) goto L13
        L12:
            return r4
        L13:
            if (r0 != 0) goto L1b
        L15:
            X.ZcG r0 = new X.ZcG
            r0.<init>(r4)
            throw r0
        L1b:
            X.ZdT r1 = X.C90375ZdT.LIZJ
            java.lang.Class r0 = r4.getClass()
            X.Zdr r0 = r1.LIZ(r0)
            boolean r1 = r0.LIZIZ(r4)
            if (r3 == r1) goto L32
        L2b:
            r0 = 2
            r4.LJ(r0, r2)
            if (r1 == 0) goto L15
            goto L12
        L32:
            r2 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90891Zln.LIZJ():X.Zmk");
    }

    public C90891Zln(MessageType messagetype) {
        this.LJLIL = messagetype;
        this.LJLILLLLZI = (MessageType) messagetype.LJ(4, null);
    }

    public final void LIZIZ(AbstractC90950Zmk abstractC90950Zmk) {
        if (this.LJLJI) {
            LJ();
            this.LJLJI = false;
        }
        LIZ(this.LJLILLLLZI, abstractC90950Zmk);
    }

    public static final void LIZ(MessageType messagetype, MessageType messagetype2) {
        C90375ZdT.LIZJ.LIZ(messagetype.getClass()).LIZLLL(messagetype, messagetype2);
    }
}
