package X;

import android.graphics.Bitmap;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import fjb.a;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.Selector$select$1", f = "Selector.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94958apO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C93996aZs LJLIL;
    public final /* synthetic */ C94256ae4 LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94958apO(C93996aZs c93996aZs, C94256ae4 c94256ae4, InterfaceC88472Yns interfaceC88472Yns, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c93996aZs;
        this.LJLILLLLZI = c94256ae4;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94958apO(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        String str = this.LJLILLLLZI.LJLJJI;
        C94019aaF c94019aaF = new C94019aaF();
        Bitmap.Config format = Bitmap.Config.ARGB_4444;
        o.LJIIIZ(format, "format");
        c94019aaF.LIZJ = format;
        imageLoaderService.downloadImageFile(null, str, new C94020aaG(c94019aaF), new IDqS419S0100000_42(this, 119));
        return C76800UCe.LIZ;
    }
}
