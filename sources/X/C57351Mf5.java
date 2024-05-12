package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mf5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57351Mf5 implements IModFavoriteList {
    public final /* synthetic */ InterfaceC67352kd<C57352Mf6> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C57351Mf5(InterfaceC67352kd<? super C57352Mf6> interfaceC67352kd) {
        this.LIZ = interfaceC67352kd;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        InterfaceC67352kd<C57352Mf6> interfaceC67352kd = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new C57353Mf7(e));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<String> list) {
        List<String> response = list;
        o.LJIIIZ(response, "response");
        InterfaceC67352kd<C57352Mf6> interfaceC67352kd = this.LIZ;
        C57352Mf6 c57352Mf6 = new C57352Mf6(response);
        C3C5.m7constructorimpl(c57352Mf6);
        interfaceC67352kd.resumeWith(c57352Mf6);
    }
}
