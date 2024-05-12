package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$loadMafUser$1", f = "RecSwipeViewModel.kt", l = {344}, m = "invokeSuspend")
/* renamed from: X.MjY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57628MjY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C57634Mje LJLJI;
    public final /* synthetic */ RecSwipeViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57628MjY(C57634Mje c57634Mje, RecSwipeViewModel recSwipeViewModel, InterfaceC67352kd<? super C57628MjY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c57634Mje;
        this.LJLJJI = recSwipeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57628MjY(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLJI == null) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJLJJI.setState(C57635Mjf.LJLIL);
            XIA xia = C78613UtF.LIZJ;
            C57630Mja c57630Mja = new C57630Mja(this.LJLJI, this.LJLJJI, null);
            this.LJLIL = i;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, c57630Mja, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC57709Mkr abstractC57709Mkr = (AbstractC57709Mkr) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadMafUser finished ");
        LIZ.append(abstractC57709Mkr);
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ));
        if (abstractC57709Mkr instanceof C57708Mkq) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("load success, cursor is ");
            C57708Mkq c57708Mkq = (C57708Mkq) abstractC57709Mkr;
            LIZ2.append(c57708Mkq.LIZIZ);
            LIZ2.append(", data size is ");
            LIZ2.append(c57708Mkq.LIZJ.size());
            C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ2));
            RecSwipeViewModel recSwipeViewModel = this.LJLJJI;
            recSwipeViewModel.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > recSwipeViewModel.LJLJLLL) {
                recSwipeViewModel.LJLJLLL = K72.LJ(C30581Hy.LJJJI(1, K74.DAYS)) + currentTimeMillis;
            }
            this.LJLJJI.hv0(c57708Mkq.LIZJ);
            this.LJLJJI.setState(new AqS175S0100000_9(abstractC57709Mkr, (AbstractC57709Mkr<RecUser>) 604));
        } else if (abstractC57709Mkr instanceof C57710Mks) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("load complete, cursor is null, data size is ");
            C57710Mks c57710Mks = (C57710Mks) abstractC57709Mkr;
            LIZ3.append(c57710Mks.LIZIZ.size());
            C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ3));
            RecSwipeViewModel recSwipeViewModel2 = this.LJLJJI;
            recSwipeViewModel2.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 > recSwipeViewModel2.LJLJLLL) {
                recSwipeViewModel2.LJLJLLL = K72.LJ(C30581Hy.LJJJI(1, K74.DAYS)) + currentTimeMillis2;
            }
            this.LJLJJI.hv0(c57710Mks.LIZIZ);
            this.LJLJJI.setState(new AqS175S0100000_9(abstractC57709Mkr, (AbstractC57709Mkr<RecUser>) 605));
        } else if (abstractC57709Mkr instanceof C57714Mkw) {
            this.LJLJJI.setState(new AqS175S0100000_9(abstractC57709Mkr, (AbstractC57709Mkr<RecUser>) 606));
        }
        if (i != 0) {
            C221018lt.LIZ("RecSwipeViewModel", "is refresh");
            List LIZ4 = abstractC57709Mkr.LIZ();
            if (LIZ4 != null) {
                RecSwipeViewModel recSwipeViewModel3 = this.LJLJJI;
                int size = LIZ4.size();
                C53031Krb.LIZ.getClass();
                int intValue = ((Number) C53031Krb.LIZIZ.getValue()).intValue();
                if (size > intValue) {
                    size = intValue;
                }
                recSwipeViewModel3.ov0(LIZ4.subList(0, size));
            }
            if (C53576L0y.LIZIZ()) {
                long currentTimeMillis3 = System.currentTimeMillis() - (K72.LJ(C30581Hy.LJJJI(((Number) C53014KrK.LIZ.getValue()).intValue(), K74.HOURS)) * 3);
                java.util.Map<String, ?> all = C2TH.LIZ().getAll();
                if ((all instanceof java.util.Map) && all != null) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (((Number) entry.getValue()).longValue() < currentTimeMillis3) {
                            C2TH.LIZ().erase(key);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
