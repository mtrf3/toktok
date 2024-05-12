package X;

import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel$loadMaFUser$1", f = "TTRecUserBigCardViewModel.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.Mjb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57631Mjb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TTRecUserBigCardViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57631Mjb(TTRecUserBigCardViewModel tTRecUserBigCardViewModel, InterfaceC67352kd<? super C57631Mjb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tTRecUserBigCardViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57631Mjb(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        Integer num3 = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XIA xia = C78613UtF.LIZJ;
            C57632Mjc c57632Mjc = new C57632Mjc(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c57632Mjc, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC57709Mkr abstractC57709Mkr = (AbstractC57709Mkr) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[loadMaFUser] fetchRecUserData finished ");
        LIZ.append(abstractC57709Mkr);
        C221018lt.LJFF("TTRecUserBigCardViewModel", X1D.LIZIZ(LIZ));
        TTRecUserBigCardViewModel tTRecUserBigCardViewModel = this.LJLILLLLZI;
        if (tTRecUserBigCardViewModel.LJLJI != null) {
            z = false;
        }
        if (abstractC57709Mkr instanceof C57708Mkq) {
            C57708Mkq c57708Mkq = (C57708Mkq) abstractC57709Mkr;
            tTRecUserBigCardViewModel.LJLJI = (C57634Mje) c57708Mkq.LIZIZ;
            ((ArrayList) tTRecUserBigCardViewModel.LJLIL).addAll(c57708Mkq.LIZJ);
            if (z) {
                TTRecUserBigCardViewModel tTRecUserBigCardViewModel2 = this.LJLILLLLZI;
                C53031Krb.LIZ.getClass();
                tTRecUserBigCardViewModel2.jv0(((Number) C53031Krb.LIZIZ.getValue()).intValue());
            }
            TTRecUserBigCardViewModel tTRecUserBigCardViewModel3 = this.LJLILLLLZI;
            tTRecUserBigCardViewModel3.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > tTRecUserBigCardViewModel3.LJLILLLLZI) {
                tTRecUserBigCardViewModel3.LJLILLLLZI = currentTimeMillis + 86400000;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[loadMaFUser] fetchRecUserData  \n requestCount =  ");
            C57634Mje c57634Mje = this.LJLILLLLZI.LJLJI;
            if (c57634Mje != null) {
                num = new Integer(c57634Mje.LIZ);
            } else {
                num = null;
            }
            LIZ2.append(num);
            LIZ2.append("\n curSize      =  ");
            C57634Mje c57634Mje2 = this.LJLILLLLZI.LJLJI;
            if (c57634Mje2 != null) {
                num2 = new Integer(c57634Mje2.LIZIZ);
            } else {
                num2 = null;
            }
            LIZ2.append(num2);
            LIZ2.append("\n pageToken    =  ");
            C57634Mje c57634Mje3 = this.LJLILLLLZI.LJLJI;
            if (c57634Mje3 != null) {
                str = c57634Mje3.LIZJ;
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append("\n loadCount    =  ");
            C57634Mje c57634Mje4 = this.LJLILLLLZI.LJLJI;
            if (c57634Mje4 != null) {
                num3 = new Integer(c57634Mje4.LIZLLL);
            }
            LIZ2.append(num3);
            LIZ2.append("\n user list    =  ");
            LIZ2.append(((ArrayList) this.LJLILLLLZI.LJLIL).size());
            C221018lt.LJFF("TTRecUserBigCardViewModel", X1D.LIZIZ(LIZ2));
        } else if (abstractC57709Mkr instanceof C57710Mks) {
            tTRecUserBigCardViewModel.LJLJI = null;
            ((ArrayList) tTRecUserBigCardViewModel.LJLIL).addAll(((C57710Mks) abstractC57709Mkr).LIZIZ);
            if (z) {
                TTRecUserBigCardViewModel tTRecUserBigCardViewModel4 = this.LJLILLLLZI;
                C53031Krb.LIZ.getClass();
                tTRecUserBigCardViewModel4.jv0(((Number) C53031Krb.LIZIZ.getValue()).intValue());
            }
            TTRecUserBigCardViewModel tTRecUserBigCardViewModel5 = this.LJLILLLLZI;
            tTRecUserBigCardViewModel5.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 > tTRecUserBigCardViewModel5.LJLILLLLZI) {
                tTRecUserBigCardViewModel5.LJLILLLLZI = currentTimeMillis2 + 86400000;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
