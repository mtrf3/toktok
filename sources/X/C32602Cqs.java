package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cqs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32602Cqs extends AbstractC03120Ai {
    public final List<AbstractC32698CsQ<? extends C30896CAq>> LIZ;
    public final List<AbstractC32698CsQ<? extends C30896CAq>> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32602Cqs(List<? extends AbstractC32698CsQ<? extends C30896CAq>> oldGiftList, List<? extends AbstractC32698CsQ<? extends C30896CAq>> newGiftList) {
        o.LJIIIZ(oldGiftList, "oldGiftList");
        o.LJIIIZ(newGiftList, "newGiftList");
        this.LIZ = oldGiftList;
        this.LIZIZ = newGiftList;
    }

    public static boolean LJFF(AbstractC32698CsQ abstractC32698CsQ, AbstractC32698CsQ abstractC32698CsQ2) {
        if (!TextUtils.equals(abstractC32698CsQ.LJFF(), abstractC32698CsQ2.LJFF()) || !TextUtils.equals(abstractC32698CsQ.LIZ(), abstractC32698CsQ2.LIZ())) {
            return false;
        }
        ImageModel LIZLLL = abstractC32698CsQ.LIZLLL();
        ImageModel LIZLLL2 = abstractC32698CsQ2.LIZLLL();
        if (LIZLLL != LIZLLL2 && (LIZLLL == null || LIZLLL2 == null || !o.LJ(LIZLLL.getUri(), LIZLLL2.getUri()))) {
            return false;
        }
        ImageModel LJ = abstractC32698CsQ.LJ();
        ImageModel LJ2 = abstractC32698CsQ2.LJ();
        if (LJ != LJ2 && (LJ == null || LJ2 == null || !o.LJ(LJ.getUri(), LJ2.getUri()))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) ListProtector.get(this.LIZ, i);
        AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) ListProtector.get(this.LIZIZ, i2);
        if ((abstractC32698CsQ instanceof AbstractC32756CtM) && (abstractC32698CsQ2 instanceof AbstractC32756CtM) && ((AbstractC32756CtM) abstractC32698CsQ).LJIILIIL() != ((AbstractC32756CtM) abstractC32698CsQ2).LJIILIIL()) {
            return false;
        }
        return LJFF(abstractC32698CsQ, abstractC32698CsQ2);
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (((AbstractC32698CsQ) ListProtector.get(this.LIZ, i)).LIZJ() == ((AbstractC32698CsQ) ListProtector.get(this.LIZIZ, i2)).LIZJ()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        LJFF((AbstractC32698CsQ) ListProtector.get(this.LIZ, i), (AbstractC32698CsQ) ListProtector.get(this.LIZIZ, i2));
        return null;
    }
}
