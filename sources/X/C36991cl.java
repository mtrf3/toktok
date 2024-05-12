package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36991cl extends AbstractC03120Ai {
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
    public C36991cl(List<? extends LiveEffect> oldData, List<? extends LiveEffect> newData) {
        o.LJIIIZ(oldData, "oldData");
        o.LJIIIZ(newData, "newData");
        this.LIZ = oldData;
        this.LIZIZ = newData;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LIZIZ, i2);
        if (liveEffect.composerConfigList.size() != liveEffect2.composerConfigList.size()) {
            return false;
        }
        ArrayList arrayList = (ArrayList) ORZ.LLJJIII(liveEffect.composerConfigList, liveEffect2.composerConfigList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                if (!o.LJ(((LiveEffect.ComposerConfig) osz.getFirst()).tag, ((LiveEffect.ComposerConfig) osz.getSecond()).tag) || ((LiveEffect.ComposerConfig) osz.getFirst()).defaultValue != ((LiveEffect.ComposerConfig) osz.getSecond()).defaultValue || ((LiveEffect.ComposerConfig) osz.getFirst()).doubleDirection != ((LiveEffect.ComposerConfig) osz.getSecond()).doubleDirection || ((LiveEffect.ComposerConfig) osz.getFirst()).maxValue != ((LiveEffect.ComposerConfig) osz.getFirst()).maxValue) {
                    return false;
                }
            }
        }
        if (!o.LJ(liveEffect.getName(), liveEffect2.getName())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((LiveEffect) ListProtector.get(this.LIZ, i)).getResourceId(), ((LiveEffect) ListProtector.get(this.LIZIZ, i2)).getResourceId());
    }
}
