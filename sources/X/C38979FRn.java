package X;

import fjb.a;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$createFramePackageNew$3$1", f = "LocalVideoUploadFrameTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.FRn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38979FRn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ZipOutputStream>, Object> {
    public final /* synthetic */ ZipOutputStream LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38979FRn(ZipOutputStream zipOutputStream, String str, InterfaceC67352kd<? super C38979FRn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = zipOutputStream;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C38979FRn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            ZipOutputStream zipOutputStream = this.LJLIL;
            C38978FRm.LJFF(zipOutputStream, C47261Igj.LJJIJ(this.LJLILLLLZI));
            return zipOutputStream;
        } catch (IOException unused) {
            return this.LJLIL;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ZipOutputStream> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
