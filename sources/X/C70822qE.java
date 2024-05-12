package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import ujb.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$2", f = "SystemShareActivity.kt", l = {343}, m = "invokeSuspend")
/* renamed from: X.2qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70822qE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ArrayList<String> LJLILLLLZI;
    public final /* synthetic */ SystemShareActivity LJLJI;
    public final /* synthetic */ EnumC70862qI LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70822qE(ArrayList<String> arrayList, SystemShareActivity systemShareActivity, EnumC70862qI enumC70862qI, InterfaceC67352kd<? super C70822qE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = arrayList;
        this.LJLJI = systemShareActivity;
        this.LJLJJI = enumC70862qI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70822qE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            ArrayList<String> arrayList = this.LJLILLLLZI;
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String uri = it.next();
                    android.net.Uri parse = UriProtector.parse(uri);
                    if (o.LJJJJIZL("content", parse.getScheme(), true)) {
                        SystemShareActivity systemShareActivity = this.LJLJI;
                        String LIZJ = C36949Een.LIZJ(systemShareActivity, parse, systemShareActivity.LJLJLJ, true);
                        if (LIZJ == null) {
                            LIZJ = "";
                        }
                        LJFF.add(LIZJ);
                    } else {
                        kotlin.jvm.internal.o.LJIIIIZZ(uri, "uri");
                        LJFF.add(uri);
                    }
                }
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C70852qH c70852qH = new C70852qH(this.LJLJI, LJFF, this.LJLJJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c70852qH, this) == enumC58928NAu) {
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
