package X;

import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;

/* renamed from: X.Bmj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29797Bmj<T> implements InterfaceC64592gB {
    public final /* synthetic */ C29800Bmm LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ UserLevelViewModel LJLJJL;

    public C29797Bmj(C29800Bmm c29800Bmm, boolean z, String str, long j, UserLevelViewModel userLevelViewModel) {
        this.LJLIL = c29800Bmm;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = userLevelViewModel;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Integer num;
        Throwable th = (Throwable) obj;
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
        C28992BZk.LJ(this.LJLILLLLZI, this.LJLJI, currentTimeMillis - this.LJLJJI, true, -3);
        UserLevelViewModel userLevelViewModel = this.LJLJJL;
        if (!userLevelViewModel.LJLJI) {
            userLevelViewModel.hv0();
        }
        C0NB.LJI("UserLevelViewModel", th);
    }
}
