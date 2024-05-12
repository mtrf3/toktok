package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.compile.Video2StickerNextTaskRunnerKt$textAudit$3", f = "Video2StickerNextTaskRunner.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5T1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Activity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5T1(Activity activity, InterfaceC67352kd<? super C5T1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5T1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Activity activity = this.LJLIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        String string = this.LJLIL.getString(R.string.tlr);
        o.LJIIIIZZ(string, "activity.getString(R.str…mPage_readingError_toast)");
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 1009, creativeToastBuilder);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
