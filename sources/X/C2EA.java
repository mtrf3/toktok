package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2EA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EA implements InterfaceC516520z, InterfaceC44861pS {
    public final C13060fG LJLIL;
    public final InterfaceC536028m LJLILLLLZI;
    public final HashMap<Integer, List<AbstractC39201gK>> LJLJI;

    @Override // X.InterfaceC23370vt
    public final int LJJIJ(float f) {
        return this.LJLILLLLZI.LJJIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJIJL(long j) {
        return this.LJLILLLLZI.LJJIJL(j);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLILLLLZI.LJJJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return this.LJLILLLLZI.LJJJJIZL(f);
    }

    @Override // X.InterfaceC44861pS
    public final InterfaceC273515n LJJLIL(int i, int i2, java.util.Map<AbstractC272415c, Integer> alignmentLines, InterfaceC88472Yns<? super AbstractC274515x, C76800UCe> placementBlock) {
        o.LJIIIZ(alignmentLines, "alignmentLines");
        o.LJIIIZ(placementBlock, "placementBlock");
        return this.LJLILLLLZI.LJJLIL(i, i2, alignmentLines, placementBlock);
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLILLLLZI.getDensity();
    }

    @Override // X.InterfaceC39181gI
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLILLLLZI.getLayoutDirection();
    }

    @Override // X.InterfaceC23370vt
    public final long LJIJ(long j) {
        return this.LJLILLLLZI.LJIJ(j);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return this.LJLILLLLZI.LJJJLL(i);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return this.LJLILLLLZI.LJJJLZIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final long LJJLI(long j) {
        return this.LJLILLLLZI.LJJLI(j);
    }

    public C2EA(C13060fG itemContentFactory, InterfaceC536028m subcomposeMeasureScope) {
        o.LJIIIZ(itemContentFactory, "itemContentFactory");
        o.LJIIIZ(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.LJLIL = itemContentFactory;
        this.LJLILLLLZI = subcomposeMeasureScope;
        this.LJLJI = new HashMap<>();
    }

    @Override // X.InterfaceC516520z
    public final List<AbstractC39201gK> LJIJI(int i, long j) {
        List<AbstractC39201gK> list = this.LJLJI.get(Integer.valueOf(i));
        List<AbstractC39201gK> list2 = list;
        if (list == null) {
            Object LJII = this.LJLIL.LIZIZ.invoke().LJII(i);
            List<InterfaceC39071g7> LJJJJL = this.LJLILLLLZI.LJJJJL(LJII, this.LJLIL.LIZ(i, LJII));
            int size = LJJJJL.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC39071g7) ListProtector.get(LJJJJL, i2)).LJJJIL(j));
            }
            this.LJLJI.put(Integer.valueOf(i), arrayList);
            list2 = arrayList;
        }
        return list2;
    }
}
