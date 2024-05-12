package X;

import com.ss.android.ugc.aweme.DanmakuCreateEntranceAssem;
import com.ss.android.ugc.aweme.feed.assem.ILazyLoadAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.8O2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O2 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuCreateEntranceAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8O2 LJLIL = new C8O2();

    public C8O2() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuCreateEntranceAssem danmakuCreateEntranceAssem, C43I<? extends Boolean> c43i) {
        ILazyLoadAbility iLazyLoadAbility;
        DanmakuCreateEntranceAssem selectSubscribe = danmakuCreateEntranceAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue() && (iLazyLoadAbility = (ILazyLoadAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), ILazyLoadAbility.class, null)) != null) {
            iLazyLoadAbility.Tv();
        }
        return C76800UCe.LIZ;
    }
}
