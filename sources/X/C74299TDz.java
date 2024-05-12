package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.Comparator;

/* renamed from: X.TDz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74299TDz<T> implements Comparator<T> {
    public final /* synthetic */ EffectCategoryModel LJLIL;

    public C74299TDz(EffectCategoryModel effectCategoryModel) {
        this.LJLIL = effectCategoryModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C66851QLn.LJFF(Integer.valueOf(this.LJLIL.getEffects().indexOf(((EffectTemplate) t).getEffectId())), Integer.valueOf(this.LJLIL.getEffects().indexOf(((EffectTemplate) t2).getEffectId())));
    }
}
