package X;

import androidx.lifecycle.LiveData;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$loadFriendsData$1", f = "SessionShareViewModel.kt", l = {267}, m = "invokeSuspend")
/* renamed from: X.2iI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65902iI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C85193Vz LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65902iI(C85193Vz c85193Vz, boolean z, InterfaceC67352kd<? super C65902iI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c85193Vz;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65902iI(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C85193Vz c85193Vz = this.LJLILLLLZI;
            long j = c85193Vz.LJ;
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C3W2(c85193Vz, j, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Collection collection = (Collection) obj;
        LiveData liveData = this.LJLILLLLZI.LIZ;
        if (this.LJLJI) {
            ArrayList arrayList = new ArrayList();
            Collection value = this.LJLILLLLZI.LIZ.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll(collection);
            collection = arrayList;
        }
        liveData.setValue(collection);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
