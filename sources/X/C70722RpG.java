package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RpG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70722RpG extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, C70717RpB, C70717RpB> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70722RpG(String str, int i, boolean z) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88471Ynr
    public final C70717RpB invoke(Integer num, C70717RpB c70717RpB) {
        String str;
        num.intValue();
        C70717RpB reviewImageItem = c70717RpB;
        o.LJIIIZ(reviewImageItem, "reviewImageItem");
        C69698RXa c69698RXa = reviewImageItem.LIZIZ;
        if (c69698RXa != null) {
            str = c69698RXa.LIZ;
        } else {
            str = null;
        }
        if (o.LJ(str, this.LJLIL)) {
            return new C70717RpB(reviewImageItem.LIZ, C69698RXa.LIZ(reviewImageItem.LIZIZ, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)));
        }
        return reviewImageItem;
    }
}
