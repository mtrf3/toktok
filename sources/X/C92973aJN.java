package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.aJN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92973aJN extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ List<AbstractC39201gK> LJLIL;
    public final /* synthetic */ List<AbstractC39201gK> LJLILLLLZI;
    public final /* synthetic */ List<AbstractC39201gK> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92973aJN(List<? extends AbstractC39201gK> list, List<? extends AbstractC39201gK> list2, List<? extends AbstractC39201gK> list3, int i) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = list3;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x abstractC274515x) {
        AbstractC274515x layout = abstractC274515x;
        o.LJIIIZ(layout, "$this$layout");
        if (!this.LJLIL.isEmpty()) {
            List<AbstractC39201gK> list = this.LJLIL;
            int i = this.LJLJJI;
            for (AbstractC39201gK abstractC39201gK : list) {
                Iterator<AbstractC39201gK> it = list.iterator();
                if (it.hasNext()) {
                    int i2 = it.next().LJLILLLLZI;
                    while (it.hasNext()) {
                        int i3 = it.next().LJLILLLLZI;
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    AbstractC274515x.LJI(layout, abstractC39201gK, 0, (i - i2) / 2);
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        if (!this.LJLILLLLZI.isEmpty()) {
            List<AbstractC39201gK> list2 = this.LJLILLLLZI;
            List<AbstractC39201gK> list3 = this.LJLIL;
            int i4 = this.LJLJJI;
            for (AbstractC39201gK abstractC39201gK2 : list2) {
                Iterator<AbstractC39201gK> it2 = list3.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    i5 += it2.next().LJLIL;
                }
                Iterator<AbstractC39201gK> it3 = list2.iterator();
                if (it3.hasNext()) {
                    int i6 = it3.next().LJLILLLLZI;
                    while (it3.hasNext()) {
                        int i7 = it3.next().LJLILLLLZI;
                        if (i6 < i7) {
                            i6 = i7;
                        }
                    }
                    AbstractC274515x.LJI(layout, abstractC39201gK2, i5, (i4 - i6) / 2);
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        if (!this.LJLJI.isEmpty()) {
            List<AbstractC39201gK> list4 = this.LJLJI;
            List<AbstractC39201gK> list5 = this.LJLIL;
            List<AbstractC39201gK> list6 = this.LJLILLLLZI;
            int i8 = this.LJLJJI;
            for (AbstractC39201gK abstractC39201gK3 : list4) {
                Iterator<AbstractC39201gK> it4 = list5.iterator();
                int i9 = 0;
                while (it4.hasNext()) {
                    i9 += it4.next().LJLIL;
                }
                Iterator<AbstractC39201gK> it5 = list6.iterator();
                int i10 = 0;
                while (it5.hasNext()) {
                    i10 += it5.next().LJLIL;
                }
                int i11 = i9 + i10;
                Iterator<AbstractC39201gK> it6 = list6.iterator();
                if (it6.hasNext()) {
                    int i12 = it6.next().LJLILLLLZI;
                    while (it6.hasNext()) {
                        int i13 = it6.next().LJLILLLLZI;
                        if (i12 < i13) {
                            i12 = i13;
                        }
                    }
                    AbstractC274515x.LJI(layout, abstractC39201gK3, i11, (i8 - i12) / 2);
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
