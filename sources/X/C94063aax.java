package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aax, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94063aax extends AbstractC03120Ai {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C94063aax(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if ((ListProtector.get(this.LIZ, i) instanceof C94218adS) && (ListProtector.get(this.LIZIZ, i2) instanceof C94218adS)) {
            Object obj = ListProtector.get(this.LIZ, i);
            if (obj != null) {
                C94218adS c94218adS = (C94218adS) obj;
                Object obj2 = ListProtector.get(this.LIZIZ, i2);
                if (obj2 != null) {
                    if (c94218adS.LJLJL == ((C94218adS) obj2).LJLJL) {
                        return true;
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.behaviour.view.card.data.OperatorData");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.behaviour.view.card.data.OperatorData");
        }
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }
}
