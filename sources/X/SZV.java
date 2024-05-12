package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public /* synthetic */ class SZV extends TBS implements InterfaceC88473Ynt<AbstractC72298SZa, SZP, Object, AbstractC72298SZa> {
    public static final SZV LJLIL = new SZV();

    public SZV() {
        super(3, AbstractC72298SZa.class, "onError", "onError(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC72298SZa invoke(AbstractC72298SZa abstractC72298SZa, SZP szp, Object obj) {
        Exception exc;
        AbstractC72298SZa p0 = abstractC72298SZa;
        SZP p1 = szp;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        if (p0.LIZ(p1)) {
            SZP szp2 = p0.LIZ;
            if (!(obj instanceof Exception) || (exc = (Exception) obj) == null) {
                exc = new Exception();
            }
            return new C72299SZb(szp2, exc, p1);
        }
        return p0;
    }
}
