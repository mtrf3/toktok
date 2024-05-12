package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.cover.ImageCoverHelperKt$getCoverForImageDraft$2", f = "ImageCoverHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150775vt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150775vt(VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C150775vt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C150775vt(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Bitmap LIZ = C152915zL.LIZ(this.LJLIL);
        if (LIZ != null) {
            return Boolean.valueOf(C42307Gj1.LJ(LIZ, new File(this.LJLIL.getVideoCoverPath()), 100, Bitmap.CompressFormat.PNG));
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
