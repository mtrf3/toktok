package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public /* synthetic */ class SZW extends TBS implements InterfaceC88473Ynt<AbstractC72298SZa, SZP, Object, AbstractC72298SZa> {
    public static final SZW LJLIL = new SZW();

    public SZW() {
        super(3, AbstractC72298SZa.class, "onLoading", "onLoading(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC72298SZa invoke(AbstractC72298SZa abstractC72298SZa, SZP szp, Object obj) {
        AbstractC72298SZa p0 = abstractC72298SZa;
        SZP p1 = szp;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        if (p0.LIZ(p1)) {
            return new C72304SZg(p0.LIZ, p1);
        }
        return p0;
    }
}
