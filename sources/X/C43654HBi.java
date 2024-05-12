package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.AsyncPhotoSaver$saveBitmap$1$task$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HBi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43654HBi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Bitmap LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ NowsShootModel LJLJJL;
    public final /* synthetic */ CreativeInfo LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43654HBi(Bitmap bitmap, String str, boolean z, boolean z2, NowsShootModel nowsShootModel, CreativeInfo creativeInfo, InterfaceC67352kd<? super C43654HBi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bitmap;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = nowsShootModel;
        this.LJLJJLL = creativeInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43654HBi(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Bitmap.CompressFormat compressFormat;
        String str;
        C141335gf.LIZJ(obj);
        Bitmap bitmap = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        if (this.LJLJI) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        C44729Hgz.LJJJJL(bitmap, str2, compressFormat, 90);
        if (C43656HBk.LIZ.get()) {
            return null;
        }
        if (this.LJLJJI) {
            this.LJLJJL.backImagePath = this.LJLILLLLZI;
            str = "outer.jpg";
        } else {
            this.LJLJJL.frontImagePath = this.LJLILLLLZI;
            str = "inner.jpg";
        }
        String path = new File(C43653HBh.LIZLLL(this.LJLJJLL).getPath(), str).getPath();
        C44687HgJ.LIZLLL(this.LJLILLLLZI, path);
        if (this.LJLJJI) {
            this.LJLJJL.backImageSharePath = path;
        } else {
            this.LJLJJL.frontImageSharePath = path;
        }
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
