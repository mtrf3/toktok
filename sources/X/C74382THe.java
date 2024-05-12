package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.THe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74382THe extends C74381THd {
    public final ShortVideoContext LJIILIIL;

    @Override // X.C74381THd, X.C74380THc
    public final InterfaceC74401THx LIZIZ(C74385THh configure, InterfaceC84497XEf effectPlatform, TNV musicFetcher, List<EffectCategoryModel> defaultCategories, boolean z) {
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        C74403THz c74403THz = (C74403THz) super.LIZIZ(configure, effectPlatform, musicFetcher, defaultCategories, C45448Hsa.LIZ());
        c74403THz.LIZLLL = new AqS159S0200000_12(configure, this, 104);
        c74403THz.LIZIZ = C52312Kg0.LIZ();
        return c74403THz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74382THe(ShortVideoContext shortVideoContext, C29S c29s, C74385THh c74385THh, TNV tnv, InterfaceC84497XEf interfaceC84497XEf, List<EffectCategoryModel> list, LifecycleOwner lifecycleOwner) {
        super(shortVideoContext, c29s, c74385THh, tnv, interfaceC84497XEf, list, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIILIIL = shortVideoContext;
    }
}
