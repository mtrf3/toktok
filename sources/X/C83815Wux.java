package X;

import Y.AObjectS15S0001000_14;
import com.ss.android.ugc.trill.setting.PushSettingActivity;

/* renamed from: X.Wux, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83815Wux implements InterfaceC38336F2u<String> {
    public final /* synthetic */ C38337F2v LJLIL;

    public C83815Wux(C38337F2v c38337F2v) {
        this.LJLIL = c38337F2v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC38336F2u
    public final void LIZJ(Object obj) {
        C38337F2v c38337F2v = this.LJLIL;
        View view = c38337F2v.LIZ;
        if (view != 0) {
            int i = c38337F2v.LIZJ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    PushSettingActivity pushSettingActivity = (PushSettingActivity) view;
                    pushSettingActivity.LJLJJLL.LJIIJ(new AObjectS15S0001000_14(3, 1));
                    ((RBX) HG3.LJIILL()).updateShieldCommentNotice(!((C25848ACm) pushSettingActivity.LJLJJLL.LJLIL).LJZI ? 1 : 0);
                    pushSettingActivity.LLFZ("comment_page", ((C25848ACm) pushSettingActivity.LJLJJLL.LJLIL).LJZI);
                    return;
                }
                PushSettingActivity pushSettingActivity2 = (PushSettingActivity) view;
                pushSettingActivity2.LJLJJL.LJIIJ(new AObjectS15S0001000_14(1, 3));
                ((RBX) HG3.LJIILL()).updateShieldDiggNotice(!((C25848ACm) pushSettingActivity2.LJLJJL.LJLIL).LJZI ? 1 : 0);
                pushSettingActivity2.LLFZ("like", ((C25848ACm) pushSettingActivity2.LJLJJL.LJLIL).LJZI);
                return;
            }
            PushSettingActivity pushSettingActivity3 = (PushSettingActivity) view;
            pushSettingActivity3.LJLJJI.LJIIJ(new AObjectS15S0001000_14(2, 5));
            ((RBX) HG3.LJIILL()).updateShieldFollowNotice(!((C25848ACm) pushSettingActivity3.LJLJJI.LJLIL).LJZI ? 1 : 0);
            pushSettingActivity3.LLFZ("follow", ((C25848ACm) pushSettingActivity3.LJLJJI.LJLIL).LJZI);
        }
    }

    @Override // X.InterfaceC38336F2u
    public final void onError(Exception exc) {
        C1A7.LJIJJ(EF7.LIZIZ(), exc);
    }
}
