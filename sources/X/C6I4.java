package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.io.File;
import java.io.IOException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgrKt$unzipDraftStickerRes$2", f = "DraftStickerDownloadMgr.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6I4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Effect LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6I4(Effect effect, InterfaceC67352kd<? super C6I4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6I4(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        File file = new File(this.LJLIL.getZipPath());
        try {
            try {
                FileUtils fileUtils = FileUtils.INSTANCE;
                fileUtils.removeDir(this.LJLIL.getUnzipPath());
                fileUtils.unZip(this.LJLIL.getZipPath(), this.LJLIL.getUnzipPath());
            } catch (IOException e) {
                H7B.LIZJ(android.util.Log.getStackTraceString(e));
            }
            C16880lQ.LLLZZIL(file);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            C16880lQ.LLLZZIL(file);
            throw th;
        }
    }
}
