package X;

import android.content.Context;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$updateDraft$2", f = "MobileEffectUtil.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CKEDraftInfoWrapper LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ EffectHintWrapper LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQR(int i, CKEDraftInfoWrapper cKEDraftInfoWrapper, EffectHintWrapper effectHintWrapper, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = cKEDraftInfoWrapper;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = effectHintWrapper;
        this.LJLJJLL = i;
        this.LJLJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        CKEDraftInfoWrapper cKEDraftInfoWrapper = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        return new EQR(this.LJLJJLL, cKEDraftInfoWrapper, this.LJLJJL, str, str2, str3, interfaceC67352kd, this.LJLJL);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        CKEDraftInfoWrapper LIZ;
        String str;
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "updateDraft=");
        LIZIZ.append(this.LJLIL);
        LIZIZ.append(", effectName=");
        LIZIZ.append(this.LJLILLLLZI);
        LIZIZ.append(", iconNewPath=");
        LIZIZ.append(this.LJLJI);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZIZ));
        Context LIZ2 = C5L7.LIZ();
        String str2 = this.LJLJJI;
        if (str2 != null && (str = this.LJLJI) != null) {
            LIZ = CKEDraftInfoWrapper.LIZ(this.LJLIL, str2, str, this.LJLILLLLZI, this.LJLJJL, this.LJLJJLL, 3895);
        } else {
            String str3 = this.LJLJI;
            if (str3 != null) {
                LIZ = CKEDraftInfoWrapper.LIZ(this.LJLIL, null, str3, this.LJLILLLLZI, this.LJLJJL, this.LJLJJLL, 3903);
            } else {
                LIZ = CKEDraftInfoWrapper.LIZ(this.LJLIL, null, null, this.LJLILLLLZI, this.LJLJJL, 0, 12159);
            }
        }
        IEffectCreatorService LJIIJ = EffectCreatorServiceImpl.LJIIJ();
        if (this.LJLJL) {
            LJIIJ.LIZJ(LIZ2, LIZ);
        } else {
            LJIIJ.LJ(LIZ2, LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
