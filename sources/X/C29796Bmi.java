package X;

import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bmi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29796Bmi extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public final /* synthetic */ C29800Bmm LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "enter_room";
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ UserLevelViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29796Bmi(long j, C29800Bmm c29800Bmm, UserLevelViewModel userLevelViewModel) {
        super(1);
        this.LJLIL = c29800Bmm;
        this.LJLJI = j;
        this.LJLJJI = userLevelViewModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        Integer num;
        Throwable it = th;
        o.LJIIIZ(it, "it");
        long currentTimeMillis = System.currentTimeMillis();
        C29800Bmm c29800Bmm = this.LJLIL;
        Long l = null;
        if (c29800Bmm != null) {
            num = Integer.valueOf(c29800Bmm.LIZ);
        } else {
            num = null;
        }
        C29800Bmm c29800Bmm2 = this.LJLIL;
        if (c29800Bmm2 != null) {
            l = Long.valueOf(c29800Bmm2.LIZIZ);
        }
        C28992BZk.LIZJ(num, l, -1, -1L, -3);
        C28992BZk.LJ(true, this.LJLILLLLZI, currentTimeMillis - this.LJLJI, true, -3);
        UserLevelViewModel userLevelViewModel = this.LJLJJI;
        if (!userLevelViewModel.LJLJI) {
            userLevelViewModel.hv0();
        }
        C0NB.LJI("UserLevelViewModel", it);
        return C76800UCe.LIZ;
    }
}
