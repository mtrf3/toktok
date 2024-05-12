package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment$refreshVideoCover$1", f = "FTCVideoPublishFragment.kt", l = {344}, m = "invokeSuspend")
/* renamed from: X.2iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65892iH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FTCVideoPublishFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65892iH(FTCVideoPublishFragment fTCVideoPublishFragment, String str, InterfaceC67352kd<? super C65892iH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = fTCVideoPublishFragment;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65892iH c65892iH = new C65892iH(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c65892iH.LJLILLLLZI = obj;
        return c65892iH;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Resources resources;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                resources = (Resources) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLILLLLZI, C78613UtF.LIZJ, null, new C65882iG(this.LJLJJI, null), 2);
            resources = this.LJLJI.getResources();
            this.LJLILLLLZI = resources;
            this.LJLIL = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C1M5 c1m5 = new C1M5(resources, (Bitmap) obj);
        c1m5.LIZJ(KL2.LIZJ(this.LJLJI.getContext(), 4.0f));
        ((ImageView) this.LJLJI._$_findCachedViewById(R.id.ew8)).setImageDrawable(c1m5);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
