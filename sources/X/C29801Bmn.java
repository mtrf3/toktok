package X;

import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import java.util.List;
import tikcast.api.privilege.GradeConfig;

/* renamed from: X.Bmn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29801Bmn<T> implements InterfaceC64592gB {
    public final /* synthetic */ UserLevelViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "enter_room";
    public final /* synthetic */ C29800Bmm LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<List<GradeConfig>, C76800UCe> LJLJJL;

    public C29801Bmn(UserLevelViewModel userLevelViewModel, C29800Bmm c29800Bmm, long j, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = userLevelViewModel;
        this.LJLJI = c29800Bmm;
        this.LJLJJI = j;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        List<GradeConfig> gv0 = this.LJLIL.gv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, (C28467BFf) obj);
        InterfaceC88472Yns<List<GradeConfig>, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(gv0);
        }
    }
}
