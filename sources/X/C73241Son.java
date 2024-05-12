package X;

import X.AbstractC029409q;
import X.InterfaceC73258Sp4;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: X.Son, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73241Son<T extends AbstractC029409q<?> & InterfaceC73258Sp4<?, ? extends C73242Soo<?>>> implements C0AK {
    public final AbstractC029409q LJLIL;
    public final InterfaceC88472Yns<Integer, Integer> LJLILLLLZI;

    public final C73243Sop LIZ() {
        return ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LJ.LIZJ;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/Yns<-Ljava/lang/Integer;Ljava/lang/Integer;>;)V */
    public C73241Son(AbstractC029409q adapter, InterfaceC88472Yns positionMapper) {
        o.LJIIJ(adapter, "adapter");
        o.LJIIJ(positionMapper, "positionMapper");
        this.LJLIL = adapter;
        this.LJLILLLLZI = positionMapper;
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        JediViewHolderProxy jediViewHolderProxy;
        if (i2 == 0) {
            return;
        }
        C73247Sot c73247Sot = ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LJ.LIZIZ;
        if (i == 0 && i2 >= ((ArrayList) c73247Sot.LIZ).size()) {
            if (((ArrayList) c73247Sot.LIZ).size() != 0) {
                ((ArrayList) c73247Sot.LIZ).clear();
            }
            LIZ().LIZ();
            this.LJLIL.notifyDataSetChanged();
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < ((ArrayList) c73247Sot.LIZ).size()) {
                ListProtector.remove(c73247Sot.LIZ, i);
            }
            C73243Sop LIZ = LIZ();
            if (i < ((ArrayList) LIZ.LIZ).size() && (jediViewHolderProxy = (JediViewHolderProxy) ListProtector.remove(LIZ.LIZ, i)) != null) {
                LIZ.LIZIZ.LIZ(jediViewHolderProxy);
            }
        }
        this.LJLIL.notifyItemRangeRemoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2);
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LJ.LIZIZ.LIZ(i4, false);
            LIZ().LIZIZ(i4, null);
        }
        ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LIZLLL.LIZ();
        int intValue = this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue();
        this.LJLIL.notifyItemRangeInserted(intValue, i2);
        ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LIZLLL.LIZIZ(intValue);
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        ArrayList arrayList = (ArrayList) ((InterfaceC73258Sp4) this.LJLIL).LJJJZ().LJ.LIZIZ.LIZ;
        if (i < arrayList.size() && i2 < arrayList.size()) {
            boolean booleanValue = ((Boolean) ListProtector.get(arrayList, i)).booleanValue();
            ListProtector.set(arrayList, i, ListProtector.get(arrayList, i2));
            ListProtector.set(arrayList, i2, Boolean.valueOf(booleanValue));
        }
        ArrayList arrayList2 = (ArrayList) LIZ().LIZ;
        if (i < arrayList2.size() && i2 < arrayList2.size()) {
            Object obj = ListProtector.get(arrayList2, i);
            ListProtector.set(arrayList2, i, ListProtector.get(arrayList2, i2));
            ListProtector.set(arrayList2, i2, obj);
        }
        this.LJLIL.notifyItemMoved(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), this.LJLILLLLZI.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        this.LJLIL.notifyItemRangeChanged(this.LJLILLLLZI.invoke(Integer.valueOf(i)).intValue(), i2, new OSZ(obj, C73264SpA.LIZ));
    }
}
