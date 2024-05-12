package X;

import com.bytedance.keva.Keva;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aZs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93996aZs {
    public final InterfaceC93796aWe LIZ;

    public C93996aZs(InterfaceC93796aWe resultManager) {
        o.LJIIIZ(resultManager, "resultManager");
        this.LIZ = resultManager;
    }

    public final void LIZ(C94256ae4 c94256ae4) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C94957apN(this, c94256ae4, null), 3);
        if (this.LIZ.needBitmap()) {
            ImageLoaderService.INSTANCE.loadBitmap(c94256ae4.LJLJLJ, new C94020aaG(new C94019aaF()), new IDqS419S0100000_42(this, 118));
        }
    }

    public final void LIZIZ(C94256ae4 modelPicture, boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(modelPicture, "modelPicture");
        C94034aaU.LIZ("Selector", "enter");
        String id = modelPicture.LJLJJLL;
        o.LJIIIZ(id, "id");
        Keva.getRepo("ck_model_select_repo").storeString("ck_model_select_id", id);
        C93407aQN.LIZ("download_model_start");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C94958apO(this, modelPicture, interfaceC88472Yns, z, null), 3);
    }
}
