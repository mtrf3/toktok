package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OuD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63385OuD {
    public final InterfaceC63395OuN LIZ;
    public final C63309Osz LIZIZ;
    public final InterfaceC65784Pro<C63291Osh> LIZJ;
    public final C63363Otr LIZLLL;
    public final C63205OrJ LJ;
    public final C63630OyA LJFF;
    public final InterfaceC70422pa LJI;
    public final InterfaceC65784Pro<C114444eO> LJII;
    public final XKW LJIIIIZZ;

    public final void LIZ(C109544Rq c109544Rq, boolean z) {
        if (z) {
            this.LIZIZ.LJFF(C47261Igj.LJJIJ(c109544Rq), 0, new C107074Id());
        } else {
            this.LIZIZ.LJIIJJI(C47261Igj.LJJIJ(c109544Rq));
        }
        InterfaceC63395OuN interfaceC63395OuN = this.LIZ;
        String conversationId = c109544Rq.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        this.LIZ.LIZIZ(interfaceC63395OuN.LJ(conversationId));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c0, code lost:
    
        if (r12 != null) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.im.core.proto.Response r30, X.InterfaceC67352kd<? super X.C76800UCe> r31) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63385OuD.LIZIZ(com.bytedance.im.core.proto.Response, X.2kd):java.lang.Object");
    }

    public C63385OuD(C63366Otu c63366Otu, C63309Osz c63309Osz, C96073pr spUtils, C63363Otr c63363Otr, C63205OrJ c63205OrJ, C63630OyA c63630OyA, C64962gm c64962gm) {
        C63405OuX getClientIMOptions = C63405OuX.LJLIL;
        AbstractC78621UtN mainDispatcher = C36636EZk.LIZ;
        o.LJIIIZ(spUtils, "spUtils");
        o.LJIIIZ(getClientIMOptions, "getClientIMOptions");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        this.LIZ = c63366Otu;
        this.LIZIZ = c63309Osz;
        this.LIZJ = spUtils;
        this.LIZLLL = c63363Otr;
        this.LJ = c63205OrJ;
        this.LJFF = c63630OyA;
        this.LJI = c64962gm;
        this.LJII = getClientIMOptions;
        this.LJIIIIZZ = mainDispatcher;
    }
}
