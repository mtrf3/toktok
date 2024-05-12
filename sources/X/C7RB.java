package X;

import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7RB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7RB extends AbstractC65781Prl implements InterfaceC88472Yns<C185787Qw, C76800UCe> {
    public static final C7RB LJLIL = new C7RB();

    public C7RB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C185787Qw c185787Qw) {
        C185787Qw dynamicAssem = c185787Qw;
        o.LJIIIZ(dynamicAssem, "$this$dynamicAssem");
        dynamicAssem.LJIIJ = "status";
        dynamicAssem.LIZ = C65352Pkq.LIZ(DetailPageStatusViewAssem.class);
        dynamicAssem.LJ("movie_detail_page", WM7.SCENE_SERVICE);
        return C76800UCe.LIZ;
    }
}
