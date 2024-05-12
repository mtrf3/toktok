package X;

import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.THf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74383THf extends C74403THz {
    public final C74385THh LJIIIZ;

    @Override // X.C74403THz
    public final InterfaceC68907R2p LIZ(String panel, InterfaceC84497XEf effectPlatform, C62822Ol8 c62822Ol8) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        if (this.LJIIIZ.LJLJL.LJLIL) {
            return new TJG(panel, effectPlatform, c62822Ol8);
        }
        return super.LIZ(panel, effectPlatform, c62822Ol8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74383THf(C74385THh configure, InterfaceC84497XEf effectPlatform, TNV musicFetcher, List<EffectCategoryModel> defaultCategories) {
        super(configure, effectPlatform, musicFetcher, defaultCategories, C45448Hsa.LIZ());
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        this.LJIIIZ = configure;
    }

    @Override // X.C74403THz
    public final C74418TIo LIZIZ(PropInfoData propInfoData, List defaultCategories, C62822Ol8 c62822Ol8, C62822Ol8 c62822Ol82, C62822Ol8 c62822Ol83) {
        o.LJIIIZ(defaultCategories, "defaultCategories");
        C53048Krs c53048Krs = this.LJIIIZ.LJLJL;
        if (c53048Krs.LJLIL) {
            return new TI1(c62822Ol8, c62822Ol82, c62822Ol83, defaultCategories, c53048Krs);
        }
        return super.LIZIZ(propInfoData, defaultCategories, c62822Ol8, c62822Ol82, c62822Ol83);
    }
}
