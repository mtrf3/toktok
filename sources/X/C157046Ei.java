package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157046Ei extends AbstractC156986Ec {
    public final VideoPublishEditModel LIZIZ;
    public final ArrayList<AbstractC157016Ef> LIZJ;

    @Override // X.AbstractC156986Ec
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.AbstractC156986Ec
    public final AbstractC157016Ef LIZ() {
        AbstractC157016Ef abstractC157016Ef;
        Iterator<AbstractC157016Ef> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC157016Ef = it.next();
                if (abstractC157016Ef.LIZ() == EnumC139485dg.ECOMMERCE.getScene()) {
                    break;
                }
            } else {
                abstractC157016Ef = null;
                break;
            }
        }
        return abstractC157016Ef;
    }

    @Override // X.AbstractC156986Ec
    public final void LJ() {
        AbstractC157016Ef LIZ = LIZ();
        if (LIZ != null) {
            LIZ.LJI();
        }
    }

    @Override // X.AbstractC156986Ec
    public final VideoPublishEditModel LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC156986Ec
    public final ArrayList<AbstractC157016Ef> LIZJ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157046Ei(VideoPublishEditModel model, ArrayList<AbstractC157016Ef> arrayList) {
        super(model, arrayList);
        o.LJIIIZ(model, "model");
        this.LIZIZ = model;
        this.LIZJ = arrayList;
    }
}
