package X;

import fjb.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$createFramePackageNew$zipOutPutStream$1", f = "LocalVideoUploadFrameTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.FRo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38980FRo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ZipOutputStream>, Object> {
    public final /* synthetic */ File LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38980FRo(File file, InterfaceC67352kd<? super C38980FRo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = file;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C38980FRo(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            return new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(this.LJLIL)));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ZipOutputStream> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
