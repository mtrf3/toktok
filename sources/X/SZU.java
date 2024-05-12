package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public /* synthetic */ class SZU extends TBS implements InterfaceC88473Ynt<AbstractC72298SZa, SZP, Object, AbstractC72298SZa> {
    public static final SZU LJLIL = new SZU();

    public SZU() {
        super(3, AbstractC72298SZa.class, "onLoaded", "onLoaded(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC72298SZa invoke(AbstractC72298SZa abstractC72298SZa, SZP szp, Object obj) {
        AbstractC72298SZa c72303SZf;
        AbstractC72298SZa p0 = abstractC72298SZa;
        SZP p1 = szp;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        if (p0.LIZ(p1)) {
            if (p1 == SZP.Refresh && (obj instanceof C35923E7z) && p0.LIZ == SZP.Prev && ((C35923E7z) obj).LIZ == null) {
                if (p0.LIZ(p1)) {
                    c72303SZf = new C72302SZe(p0.LIZ, p1);
                } else {
                    return p0;
                }
            } else {
                c72303SZf = new C72303SZf(p0.LIZ, p1);
            }
            return c72303SZf;
        }
        return p0;
    }
}
