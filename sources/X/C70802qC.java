package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMultipleMediasSystemShare$1", f = "SystemShareActivity.kt", l = {223}, m = "invokeSuspend")
/* renamed from: X.2qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70802qC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ArrayList<android.net.Uri> LJLILLLLZI;
    public final /* synthetic */ SystemShareActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70802qC(ArrayList<android.net.Uri> arrayList, SystemShareActivity systemShareActivity, InterfaceC67352kd<? super C70802qC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = arrayList;
        this.LJLJI = systemShareActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70802qC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            ArrayList LJFF = C1JX.LJFF(obj);
            ArrayList<android.net.Uri> arrayList = this.LJLILLLLZI;
            if (arrayList != null) {
                Iterator<android.net.Uri> it = arrayList.iterator();
                while (it.hasNext()) {
                    android.net.Uri uri = it.next();
                    SystemShareActivity systemShareActivity = this.LJLJI;
                    o.LJIIIIZZ(uri, "uri");
                    String LIZJ = C36949Een.LIZJ(systemShareActivity, uri, this.LJLJI.LJLJLJ, false);
                    if (LIZJ == null) {
                        LIZJ = "";
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SystemShareActivity realPath = ");
                    LIZ.append(LIZJ);
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                    LJFF.add(LIZJ);
                }
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C45833Hyn c45833Hyn = new C45833Hyn(this.LJLJI, LJFF, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c45833Hyn, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
