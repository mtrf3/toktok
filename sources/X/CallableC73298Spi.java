package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Spi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC73298Spi<V> implements Callable<C76800UCe> {
    public final /* synthetic */ C73299Spj LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CallableC73298Spi(C73299Spj c73299Spj, List list, int i) {
        this.LJLIL = c73299Spj;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final C76800UCe call() {
        int i = 0;
        for (Object obj : this.LJLILLLLZI) {
            int i2 = i + 1;
            if (i >= 0) {
                EffectTemplate effectTemplate = (EffectTemplate) obj;
                int i3 = i + this.LJLJI;
                if (effectTemplate != null) {
                    String effectId = effectTemplate.getEffectId();
                    if (!TextUtils.isEmpty(effectId)) {
                        this.LJLIL.LIZ.put(effectId, Integer.valueOf(i3));
                    }
                    String resourceId = effectTemplate.getResourceId();
                    if (!TextUtils.isEmpty(resourceId)) {
                        this.LJLIL.LIZIZ.put(resourceId, Integer.valueOf(i3));
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
