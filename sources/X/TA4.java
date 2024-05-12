package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$tryToQuit$2$1", f = "EffectEditVM.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TA4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectEditVM LJLILLLLZI;
    public final /* synthetic */ C74189T9t LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TA4(EffectEditVM effectEditVM, C74189T9t c74189T9t, InterfaceC67352kd<? super TA4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectEditVM;
        this.LJLJI = c74189T9t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new TA4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EditImage editImage;
        int i;
        android.net.Uri uri;
        String str2;
        android.net.Uri uri2;
        C74189T9t c74189T9t;
        EditImage editImage2;
        String str3;
        String str4;
        EffectHintWrapper effectHintWrapper;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            CKEDraftInfoWrapper cKEDraftInfoWrapper = this.LJLILLLLZI.gv0().draftInfo;
            if (cKEDraftInfoWrapper == null) {
                return C76800UCe.LIZ;
            }
            CKEDraftInfoWrapper cKEDraftInfoWrapper2 = this.LJLILLLLZI.gv0().draftInfo;
            if (cKEDraftInfoWrapper2 != null) {
                str = cKEDraftInfoWrapper2.name;
            } else {
                str = null;
            }
            if (o.LJ(str, this.LJLJI.LJLILLLLZI) && ((editImage2 = (c74189T9t = this.LJLJI).LJLJJLL) == null || editImage2.url == null)) {
                EffectHintWrapper effectHintWrapper2 = c74189T9t.LJLL;
                if (effectHintWrapper2 != null) {
                    str3 = effectHintWrapper2.hintKey;
                } else {
                    str3 = null;
                }
                CKEDraftInfoWrapper cKEDraftInfoWrapper3 = this.LJLILLLLZI.gv0().draftInfo;
                if (cKEDraftInfoWrapper3 != null && (effectHintWrapper = cKEDraftInfoWrapper3.effectHint) != null) {
                    str4 = effectHintWrapper.hintKey;
                } else {
                    str4 = null;
                }
                if (o.LJ(str3, str4)) {
                    this.LJLILLLLZI.setState(TA9.LJLIL);
                    java.util.Map<String, String> map = C74186T9q.LIZLLL(this.LJLILLLLZI.gv0()).LIZ;
                    o.LJIIIIZZ(map, "eventBuilder.builder()");
                    C78897Uxp.LJJJ("publish_effect_page_back", map);
                    return C76800UCe.LIZ;
                }
            }
            this.LJLILLLLZI.setState(TAC.LJLIL);
            CKEDraftInfoWrapper cKEDraftInfoWrapper4 = this.LJLILLLLZI.gv0().draftInfo;
            if ((cKEDraftInfoWrapper4 != null && cKEDraftInfoWrapper4.iconEdit == 1) || ((editImage = this.LJLJI.LJLJJLL) != null && (uri = editImage.url) != null && uri.getPath() != null)) {
                i = 1;
            } else {
                i = 0;
            }
            C74189T9t c74189T9t2 = this.LJLJI;
            String str5 = c74189T9t2.LJLILLLLZI;
            EditImage editImage3 = c74189T9t2.LJLJJLL;
            if (editImage3 != null && (uri2 = editImage3.url) != null) {
                str2 = uri2.getPath();
            } else {
                str2 = null;
            }
            EffectHintWrapper effectHintWrapper3 = this.LJLJI.LJLL;
            this.LJLIL = 1;
            if (C74186T9q.LJFF(cKEDraftInfoWrapper, null, str5, str2, effectHintWrapper3, true, i, this, 2) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.setState(TA8.LJLIL);
        java.util.Map<String, String> map2 = C74186T9q.LIZLLL(this.LJLILLLLZI.gv0()).LIZ;
        o.LJIIIIZZ(map2, "eventBuilder.builder()");
        C78897Uxp.LJJJ("publish_effect_page_back", map2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
