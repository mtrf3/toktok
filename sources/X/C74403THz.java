package X;

import com.ss.android.ugc.aweme.sticker.model.PropInfoData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.THz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74403THz implements InterfaceC74401THx {
    public final int LIZ;
    public boolean LIZIZ;
    public InterfaceC74532TMy LIZJ;
    public InterfaceC65784Pro<? extends InterfaceC74429TIz> LIZLLL;
    public final C74385THh LJ;
    public final InterfaceC84497XEf LJFF;
    public final TNV LJI;
    public final List<EffectCategoryModel> LJII;
    public final boolean LJIIIIZZ;

    @Override // X.InterfaceC74401THx
    public final TJK create() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1184));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1183));
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1180));
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(new AqS156S0100000_6(LIZIZ3, 143));
        C62822Ol8 LIZIZ5 = C221108m2.LIZIZ(C74402THy.LJLIL);
        InterfaceC84497XEf effectPlatform = this.LJFF;
        C74385THh configure = this.LJ;
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(configure, "configure");
        TI0 ti0 = new TI0(new AqS162S0100000_12(effectPlatform, 1185), configure);
        C62822Ol8 LIZIZ6 = C221108m2.LIZIZ(new AqS159S0200000_12(this, new AqS159S0200000_12(this, ti0, 88), 87));
        String panel = this.LJ.LJLIL;
        InterfaceC84497XEf effectPlatform2 = this.LJFF;
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform2, "effectPlatform");
        boolean z = this.LJIIIIZZ;
        C53048Krs c53048Krs = this.LJ.LJLJL;
        TJY tjy = new TJY(panel, effectPlatform2, z, c53048Krs.LJLIL, c53048Krs.LJLILLLLZI);
        InterfaceC68907R2p LIZ = LIZ(this.LJ.LJLIL, this.LJFF, LIZIZ3);
        C74418TIo LIZIZ7 = LIZIZ(this.LJ.LJLJLLL, this.LJII, LIZIZ4, LIZIZ5, LIZIZ3);
        new C73342SqQ();
        return new TJK(this.LJ.LJLIL, this.LJFF, LIZ, tjy, LIZIZ7, LIZIZ2, LIZIZ, LIZIZ6, ti0, LIZIZ4, LIZIZ5, LIZIZ3);
    }

    public InterfaceC68907R2p LIZ(String panel, InterfaceC84497XEf effectPlatform, C62822Ol8 c62822Ol8) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        return new TJF(this.LJ.LJLIL, effectPlatform, c62822Ol8);
    }

    public C74403THz(C74385THh configure, InterfaceC84497XEf effectPlatform, TNV musicFetcher, List<EffectCategoryModel> defaultCategories, boolean z) {
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(musicFetcher, "musicFetcher");
        o.LJIIIZ(defaultCategories, "defaultCategories");
        this.LJ = configure;
        this.LJFF = effectPlatform;
        this.LJI = musicFetcher;
        this.LJII = defaultCategories;
        this.LJIIIIZZ = z;
        this.LIZ = 5;
    }

    public C74418TIo LIZIZ(PropInfoData propInfoData, List defaultCategories, C62822Ol8 c62822Ol8, C62822Ol8 c62822Ol82, C62822Ol8 c62822Ol83) {
        o.LJIIIZ(defaultCategories, "defaultCategories");
        return new C74418TIo(propInfoData, defaultCategories, c62822Ol8, c62822Ol82, c62822Ol83);
    }
}
