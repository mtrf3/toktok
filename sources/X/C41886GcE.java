package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.GcE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41886GcE implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ InterfaceC65052gv<C41881Gc9> LIZ;

    public C41886GcE(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        ((C73578SuE) this.LIZ).onSuccess(new C41881Gc9(null, null));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        ((C73578SuE) this.LIZ).onSuccess(C41884GcC.LIZ(bitmap));
    }
}
