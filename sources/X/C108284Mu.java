package X;

import android.text.TextUtils;
import fjb.a;
import java.util.Map;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.FilteredListModelImpl$deleteAll$1", f = "FilteredListModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108284Mu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C108274Mt LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108284Mu(C108274Mt c108274Mt, InterfaceC67352kd<? super C108284Mu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c108274Mt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C108284Mu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            for (Map.Entry<String, C63120Opw> entry : this.LJLIL.LJIIIZ().entrySet()) {
                if (!entry.getValue().isStranger()) {
                    String key = entry.getKey();
                    if (TextUtils.isEmpty(key)) {
                        C63322OtC.LIZLLL("DeleteConversationHandler delete, cid invalid");
                    } else {
                        C115284fk.LJIILIIL().LJIIJ(key, new C4N6(null, key));
                    }
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("FilteredListModelImpl", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
