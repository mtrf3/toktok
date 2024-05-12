package X;

import com.bytedance.keva.Keva;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.controller.manager.ShareVideoRecordsManager$addDmShareRecords$1", f = "ShareVideoRecordsManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66312ix extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ Keva LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66312ix(List<String> list, Keva keva, String str, InterfaceC67352kd<? super C66312ix> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = keva;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66312ix(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C67532kv c67532kv = C67532kv.LIZ;
        List<String> list = this.LJLIL;
        String str = this.LJLJI;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (!o.LJ(str2, str)) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(EnumC66332iz.INTERNAL.getValue());
            LIZ.append(':');
            LIZ.append(str3);
            arrayList2.add(X1D.LIZIZ(LIZ));
        }
        c67532kv.LIZLLL(arrayList2, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
