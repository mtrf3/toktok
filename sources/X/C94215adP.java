package X;

import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.adP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94215adP implements InterfaceC93663aUV<AssetsLibData> {
    public final /* synthetic */ XJL LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ StickerViewModel LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZJ.getClass();
        StickerViewModel.gv0(null, false);
        XJL xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(AssetsLibData assetsLibData) {
        AssetsLibData result = assetsLibData;
        o.LJIIIZ(result, "result");
        StickerViewModel stickerViewModel = this.LIZJ;
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZIZ);
        stickerViewModel.getClass();
        StickerViewModel.gv0(valueOf, true);
        XJL xjl = this.LIZ;
        Collection<List<AssetsLibData.AssetsItemData>> values = result.LJLIL.values();
        o.LJIIIIZZ(values, "result.assetsLibList.values");
        Object LJLLL = ORZ.LJLLL(values);
        if (LJLLL == null) {
            LJLLL = C61878OQg.INSTANCE;
        }
        C3C5.m7constructorimpl(LJLLL);
        xjl.resumeWith(LJLLL);
    }

    public C94215adP(XKS xks, long j, StickerViewModel stickerViewModel) {
        this.LIZ = xks;
        this.LIZIZ = j;
        this.LIZJ = stickerViewModel;
    }
}
