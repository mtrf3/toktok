package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResource$1", f = "DownloadEditPostPhotoManager.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ C76732zl LJLJL;
    public final /* synthetic */ GAH LJLJLJ;
    public final /* synthetic */ GMN LJLJLLL;
    public final /* synthetic */ C76732zl LJLL;
    public final /* synthetic */ C68322mC<String> LJLLI;
    public final /* synthetic */ long LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLX(List<PhotoModeImageUrlModel> list, C76732zl c76732zl, C76732zl c76732zl2, GAH gah, GMN gmn, C76732zl c76732zl3, C68322mC<String> c68322mC, long j, InterfaceC67352kd<? super GLX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = list;
        this.LJLJJLL = c76732zl;
        this.LJLJL = c76732zl2;
        this.LJLJLJ = gah;
        this.LJLJLLL = gmn;
        this.LJLL = c76732zl3;
        this.LJLLI = c68322mC;
        this.LJLLILLLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GLX glx = new GLX(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
        glx.LJLJJI = obj;
        return glx;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:5:0x001c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
