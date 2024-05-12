package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.FakeMessageModel$loadConversationContentLocked$2", f = "FakeMessageModel.kt", l = {116}, m = "invokeSuspend")
/* renamed from: X.2yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76152yp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C76172yr LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76152yp(C76172yr c76172yr, InterfaceC67352kd<? super C76152yp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c76172yr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76152yp(this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        java.util.Map<? extends Integer, ? extends FakeMessageContent> LIZ;
        Object LJI;
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                currentTimeMillis = this.LJLIL;
                LIZ = (java.util.Map) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            currentTimeMillis = System.currentTimeMillis();
            LIZ = C75762yC.LIZ(C75762yC.LIZ, this.LJLJJI.LIZ);
            if (LIZ == null || LIZ.isEmpty()) {
                C34B.LJI("FakeMessageModel", "conversation content isEmpty");
                this.LJLJJI.LIZLLL = false;
                return C76800UCe.LIZ;
            }
            this.LJLJJI.LIZIZ.clear();
            this.LJLJJI.LIZIZ.putAll(LIZ);
            C76172yr c76172yr = this.LJLJJI;
            this.LJLILLLLZI = LIZ;
            this.LJLIL = currentTimeMillis;
            this.LJLJI = 1;
            Collection<FakeMessageContent> values = c76172yr.LIZIZ.values();
            o.LJIIIIZZ(values, "fakeContentMap.values");
            InterfaceC76162yq LIZ2 = C76212yv.LIZ(c76172yr.LIZ);
            if (values.isEmpty()) {
                C34B.LJI("FakeMessageModel", "createFakeMessage: content is empty");
                LJI = C76800UCe.LIZ;
            } else if (LIZ2 == null) {
                C34B.LJI("FakeMessageModel", "createFakeMessage: factory is null");
                LJI = C76800UCe.LIZ;
            } else {
                ArrayList arrayList = new ArrayList();
                for (FakeMessageContent it : values) {
                    o.LJIIIIZZ(it, "it");
                    FakeMessage Wr0 = LIZ2.Wr0(it);
                    if (Wr0 != null) {
                        arrayList.add(Wr0);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    FakeMessage fakeMessage = (FakeMessage) it2.next();
                    fakeMessage.updateFrom$im_base_release(c76172yr.LIZJ.get(new Integer(fakeMessage.getMsgType())));
                }
                C34B.LJI("FakeMessageModel", "createFakeMessage: message size=" + arrayList.size());
                LJI = XKX.LJI(C36636EZk.LIZ, new C76182ys(c76172yr, arrayList, null), this);
                if (LJI != EnumC58928NAu.COROUTINE_SUSPENDED) {
                    LJI = C76800UCe.LIZ;
                }
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        this.LJLJJI.LIZLLL = false;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("load conv content successfully. size=");
        LIZ3.append(LIZ.size());
        LIZ3.append(", costs=");
        LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
        C34B.LJI("FakeMessageModel", X1D.LIZIZ(LIZ3));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
