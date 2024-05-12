package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.api.Video2StickerTextReviewResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.compile.Video2StickerNextTaskRunnerKt$textAudit$2", f = "Video2StickerNextTaskRunner.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5T2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Video2StickerTextReviewResponse LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5T2(Video2StickerTextReviewResponse video2StickerTextReviewResponse, Activity activity, InterfaceC67352kd<? super C5T2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = video2StickerTextReviewResponse;
        this.LJLILLLLZI = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5T2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = this.LJLIL.status_msg;
        if (str != null) {
            Activity activity = this.LJLILLLLZI;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(str);
            C78915Uy7.LJJIIZI(activity, 1009, creativeToastBuilder);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
