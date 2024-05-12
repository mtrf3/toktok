package X;

import com.bytedance.ugc.effectcreator.main.MainImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$updateFlow$3", f = "DraftUpdater.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.apG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94950apG extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super Effect[]>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C94950apG(InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MainImpl LIZ = C93932aYq.LIZ();
        if (LIZ != null) {
            LIZ.onFireEvent(new C94247adv(256));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super Effect[]> create, Throwable it, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        InterfaceC67352kd<? super C76800UCe> continuation = interfaceC67352kd;
        o.LJIIIZ(create, "$this$create");
        o.LJIIIZ(it, "it");
        o.LJIIIZ(continuation, "continuation");
        return new C94950apG(continuation).invokeSuspend(C76800UCe.LIZ);
    }
}
