package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.TiktokStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.THd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74381THd extends C74380THc {
    public final ShortVideoContext LJIIJJI;
    public final InterfaceC84497XEf LJIIL;

    @Override // X.C74380THc
    public InterfaceC74401THx LIZIZ(C74385THh configure, InterfaceC84497XEf effectPlatform, TNV musicFetcher, List<EffectCategoryModel> defaultCategories, boolean z) {
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        C74383THf c74383THf = new C74383THf(configure, effectPlatform, musicFetcher, defaultCategories);
        InterfaceC74532TMy interfaceC74532TMy = this.LIZ;
        if (interfaceC74532TMy != null) {
            c74383THf.LIZJ = interfaceC74532TMy;
        }
        c74383THf.LIZLLL = new AqS159S0200000_12(configure, this, 105);
        c74383THf.LIZIZ = C52312Kg0.LIZ();
        return c74383THf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74381THd(ShortVideoContext shortVideoContext, C29S c29s, C74385THh c74385THh, TNV tnv, InterfaceC84497XEf interfaceC84497XEf, List<EffectCategoryModel> list, LifecycleOwner lifecycleOwner) {
        super(c29s, c74385THh, tnv, interfaceC84497XEf, list, lifecycleOwner, 32);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIJJI = shortVideoContext;
        this.LJIIL = interfaceC84497XEf;
    }

    @Override // X.C74380THc
    public final TEZ LIZ(C29S activity, C74385THh configure, InterfaceC74401THx stickerRepositoryFactory, I29 stickerState, InterfaceC74399THv interfaceC74399THv, TNY tny, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(stickerRepositoryFactory, "stickerRepositoryFactory");
        o.LJIIIZ(stickerState, "stickerState");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return new TiktokStickerDataManager(activity, configure, stickerRepositoryFactory, stickerState, interfaceC74399THv);
    }
}
