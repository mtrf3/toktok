package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.ugctemplate.UgcTemplateHelper$resizePUGCMedias$1", f = "UgcTemplateHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131215Cz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131215Cz(Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C131215Cz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131215Cz(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL;
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        NLEModel LIZ = C132435Hr.LIZ(videoPublishEditModel);
        EnumC43650HBe cacheResourceType = EnumC43650HBe.UGC_TEMPLATE_ZIP;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cacheResourceType, "cacheResourceType");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resizeMedias: ");
        LIZ2.append(cacheResourceType);
        C5KN.LIZJ(X1D.LIZIZ(LIZ2));
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C131205Cy(videoPublishEditModel, cacheResourceType, LIZ, context, null), 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
