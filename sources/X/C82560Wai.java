package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wai, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82560Wai implements InterfaceC45863HzH {
    public final InterfaceC84498XEg LJLIL;
    public final C173166qu LJLILLLLZI;
    public final C82622Wbi LJLJI;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        C173166qu LIZ = this.LJLILLLLZI.LIZ();
        if (C60903NvH.LJIIJJI().LIZIZ().LJI()) {
            HEU.LIZJ(LIZ, new AqS145S0200000_14(this, LIZ, 11), new AqS145S0200000_14(this, LIZ, 12));
        } else {
            LIZLLL(LIZ);
        }
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P1;
    }

    public final void LIZJ(InterfaceC82548WaW interfaceC82548WaW) {
        InterfaceC46800IYi aVVideoViewComponentFactory;
        InterfaceC82564Wam create;
        if (interfaceC82548WaW == null) {
            return;
        }
        Video LJIJJ = C78840Uwu.LJIJJ(interfaceC82548WaW);
        C82622Wbi c82622Wbi = this.LJLJI;
        if (c82622Wbi != null && (aVVideoViewComponentFactory = ((InterfaceC47196Ifg) c82622Wbi.LJ(InterfaceC47196Ifg.class, null)).getAVVideoViewComponentFactory()) != null && (create = aVVideoViewComponentFactory.create()) != null) {
            create.preloadVideo(LJIJJ, 819200);
        }
    }

    public final void LIZLLL(C173166qu c173166qu) {
        this.LJLIL.LJIILJJIL("mv", true, "all", new C82559Wah(c173166qu, SystemClock.elapsedRealtime(), this));
    }

    public C82560Wai(InterfaceC84498XEg mvEffectPlatform, C173166qu initParams, C82622Wbi c82622Wbi) {
        o.LJIIIZ(mvEffectPlatform, "mvEffectPlatform");
        o.LJIIIZ(initParams, "initParams");
        this.LJLIL = mvEffectPlatform;
        this.LJLILLLLZI = initParams;
        this.LJLJI = c82622Wbi;
    }
}
