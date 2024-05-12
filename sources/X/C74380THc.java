package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.THc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74380THc implements InterfaceC74384THg {
    public InterfaceC74532TMy LIZ;
    public InterfaceC74399THv LIZIZ;
    public boolean LIZJ;
    public final I29 LIZLLL;
    public final C29S LJ;
    public final C74385THh LJFF;
    public final TNV LJI;
    public final InterfaceC84497XEf LJII;
    public final List<EffectCategoryModel> LJIIIIZZ;
    public final TNY LJIIIZ;
    public final LifecycleOwner LJIIJ;

    @Override // X.InterfaceC74384THg
    public final TEZ create() {
        InterfaceC74401THx LIZIZ = LIZIZ(this.LJFF, this.LJII, this.LJI, this.LJIIIIZZ, false);
        return LIZ(this.LJ, this.LJFF, LIZIZ, this.LIZLLL, this.LIZIZ, this.LJIIIZ, this.LJIIJ);
    }

    public InterfaceC74401THx LIZIZ(C74385THh configure, InterfaceC84497XEf effectPlatform, TNV musicFetcher, List<EffectCategoryModel> defaultCategories, boolean z) {
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        C74403THz c74403THz = new C74403THz(configure, effectPlatform, musicFetcher, defaultCategories, z);
        InterfaceC74532TMy interfaceC74532TMy = this.LIZ;
        if (interfaceC74532TMy != null) {
            c74403THz.LIZJ = interfaceC74532TMy;
        }
        c74403THz.LIZIZ = this.LIZJ;
        return c74403THz;
    }

    public C74380THc(C29S activity, C74385THh configure, TNV musicFetcher, InterfaceC84497XEf effectPlatform, List defaultCategories, LifecycleOwner lifecycleOwner, int i) {
        defaultCategories = (i & 16) != 0 ? C74356TGe.LIZ(activity) : defaultCategories;
        lifecycleOwner = (i & 64) != 0 ? activity : lifecycleOwner;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJ = activity;
        this.LJFF = configure;
        this.LJI = musicFetcher;
        this.LJII = effectPlatform;
        this.LJIIIIZZ = defaultCategories;
        this.LJIIIZ = null;
        this.LJIIJ = lifecycleOwner;
        this.LIZLLL = new I29();
    }

    public TEZ LIZ(C29S activity, C74385THh configure, InterfaceC74401THx stickerRepositoryFactory, I29 stickerState, InterfaceC74399THv interfaceC74399THv, TNY tny, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(stickerRepositoryFactory, "stickerRepositoryFactory");
        o.LJIIIZ(stickerState, "stickerState");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return new DefaultStickerDataManager(activity, configure, stickerRepositoryFactory, stickerState, interfaceC74399THv, tny, lifecycleOwner);
    }
}
