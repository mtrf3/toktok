package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29591Ed extends AbstractC03120Ai {
    public final List<LiveEffect> LIZ;
    public final List<LiveEffect> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return null;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29591Ed(List<? extends LiveEffect> oldData, List<? extends LiveEffect> list) {
        o.LJIIIZ(oldData, "oldData");
        this.LIZ = oldData;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LIZIZ, i2);
        if (i != i2) {
            return false;
        }
        C40641ie.LJLIL.getClass();
        if (C29306Beo.LJJIFFI(Boolean.valueOf(C40641ie.LIZJ().contains(liveEffect2))) || !o.LJ(liveEffect.getName(), liveEffect2.getName())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((LiveEffect) ListProtector.get(this.LIZ, i)).getResourceId(), ((LiveEffect) ListProtector.get(this.LIZIZ, i2)).getResourceId());
    }
}
