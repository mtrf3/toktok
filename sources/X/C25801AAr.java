package X;

import Y.IDComparatorS337S0100000_4;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage$onViewCreated$1$1", f = "DoNotTranslateSettingPage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AAr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25801AAr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DoNotTranslateSettingPage LJLIL;
    public final /* synthetic */ InterfaceC35811ar<List<ContentLanguage>> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25801AAr(DoNotTranslateSettingPage doNotTranslateSettingPage, InterfaceC35811ar<List<ContentLanguage>> interfaceC35811ar, InterfaceC35811ar<List<String>> interfaceC35811ar2, InterfaceC35811ar<List<String>> interfaceC35811ar3, InterfaceC35811ar<List<String>> interfaceC35811ar4, InterfaceC67352kd<? super C25801AAr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = doNotTranslateSettingPage;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC35811ar2;
        this.LJLJJI = interfaceC35811ar3;
        this.LJLJJL = interfaceC35811ar4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25801AAr(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        DoNotTranslateSettingPage doNotTranslateSettingPage = this.LJLIL;
        C25802AAs c25802AAs = new C25802AAs(doNotTranslateSettingPage, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        if (doNotTranslateSettingPage.LJLJJL.getValue() != null && this.LJLIL.LJLJJLL.getValue() != null) {
            Object[] objArr = (Object[]) this.LJLIL.LJLJJL.getValue();
            if (objArr != null) {
                DoNotTranslateSettingPage doNotTranslateSettingPage2 = this.LJLIL;
                InterfaceC35811ar<List<ContentLanguage>> interfaceC35811ar = this.LJLILLLLZI;
                InterfaceC35811ar<List<String>> interfaceC35811ar2 = this.LJLJI;
                InterfaceC35811ar<List<String>> interfaceC35811ar3 = this.LJLJJI;
                InterfaceC35811ar<List<String>> interfaceC35811ar4 = this.LJLJJL;
                Object[] objArr2 = (Object[]) doNotTranslateSettingPage2.LJLJJLL.getValue();
                if (objArr2 != null) {
                    LJ(doNotTranslateSettingPage2, interfaceC35811ar, interfaceC35811ar2, interfaceC35811ar3, interfaceC35811ar4, ORY.LJJZZIII(objArr), ORY.LJJZZIII(objArr2));
                }
            }
        } else {
            ((C8BR) this.LJLIL.LJLJI.getValue()).LJLILLLLZI = c25802AAs;
            ((C8BR) this.LJLIL.LJLJI.getValue()).LJIILL(new Object[0]);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    public static final void LJ(DoNotTranslateSettingPage doNotTranslateSettingPage, InterfaceC35811ar<List<ContentLanguage>> interfaceC35811ar, InterfaceC35811ar<List<String>> interfaceC35811ar2, InterfaceC35811ar<List<String>> interfaceC35811ar3, InterfaceC35811ar<List<String>> interfaceC35811ar4, List<? extends ContentLanguage> list, List<String> list2) {
        interfaceC35811ar.setValue(ORZ.LLILII(new IDComparatorS337S0100000_4(list2, 3), list));
        interfaceC35811ar2.setValue(list2);
        interfaceC35811ar3.setValue(list2);
        interfaceC35811ar4.setValue(list2);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid());
        c188727au.LJIIIZ("enter_from", (String) doNotTranslateSettingPage.LJLJJI.getValue());
        c188727au.LJIIIZ("not_translate_langs", ORZ.LLD(interfaceC35811ar2.getValue(), ",", null, null, null, 62));
        FMX.LJIIL("enter_not_translate_langs", c188727au.LIZ);
    }
}
