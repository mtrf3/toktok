package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.Mm5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57785Mm5 extends AbstractC03120Ai {
    public final /* synthetic */ ArrayList<InterfaceC57784Mm4> LIZ;
    public final /* synthetic */ ArrayList<InterfaceC57784Mm4> LIZIZ;
    public final /* synthetic */ ArrayList<Integer> LIZJ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) ListProtector.get(this.LIZ, i);
        InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) ListProtector.get(this.LIZIZ, i2);
        if (interfaceC57784Mm4 != null) {
            if (interfaceC57784Mm42 == null) {
                return false;
            }
            Integer num = (Integer) ListProtector.get(this.LIZJ, i);
            int hashCode = interfaceC57784Mm42.hashCode();
            if (num == null || num.intValue() != hashCode) {
                return false;
            }
            return interfaceC57784Mm4.areContentsTheSame(interfaceC57784Mm42);
        }
        if (interfaceC57784Mm42 != null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) ListProtector.get(this.LIZ, i);
        InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) ListProtector.get(this.LIZIZ, i2);
        if (interfaceC57784Mm4 != null) {
            if (interfaceC57784Mm42 != null) {
                return interfaceC57784Mm4.areItemTheSame(interfaceC57784Mm42);
            }
        } else if (interfaceC57784Mm42 == null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) ListProtector.get(this.LIZ, i);
        InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) ListProtector.get(this.LIZIZ, i2);
        if (interfaceC57784Mm4 != null && interfaceC57784Mm42 != null) {
            return interfaceC57784Mm4.getChangePayload(interfaceC57784Mm42);
        }
        return null;
    }

    public C57785Mm5(ArrayList<InterfaceC57784Mm4> arrayList, ArrayList<InterfaceC57784Mm4> arrayList2, ArrayList<Integer> arrayList3) {
        this.LIZ = arrayList;
        this.LIZIZ = arrayList2;
        this.LIZJ = arrayList3;
    }
}
