package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask$execute$2", f = "MobileEffectUploadTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EPj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36375EPj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<List<UploadableDraftEffect>> LJLIL;
    public final /* synthetic */ ERH LJLILLLLZI;
    public final /* synthetic */ UploadImageConfig LJLJI;
    public final /* synthetic */ UploadImageConfig LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36375EPj(C68322mC<List<UploadableDraftEffect>> c68322mC, ERH erh, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super C36375EPj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = erh;
        this.LJLJI = uploadImageConfig;
        this.LJLJJI = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36375EPj(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL.element.isEmpty()) {
            ERH erh = this.LJLILLLLZI;
            XKX.LIZLLL((InterfaceC70422pa) erh.LJI.getValue(), null, null, new C36390EPy(this.LJLIL.element, erh, this.LJLJI, this.LJLJJI, null), 3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
