package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SK7 extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public SK7(Object obj) {
        super(1, obj, SK5.class, "onConverterClick", "onConverterClick(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        String str;
        num.intValue();
        SK5 sk5 = (SK5) this.receiver;
        ActivityC45651qj mo49getActivity = sk5.LJLLI.mo49getActivity();
        if (mo49getActivity != null) {
            Aweme aweme = sk5.LJLL;
            String enterFrom = sk5.LJLLILLLL;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(enterFrom, "enterFrom");
            String LIZ = SK8.LIZ(aweme.getStatus().getPrivateStatus());
            boolean LJIJ = C54838Lfe.LJIJ(aweme);
            if (LJIJ) {
                if (C71945SLl.LIZLLL()) {
                    str = "followers";
                } else {
                    str = "public";
                }
            } else {
                str = LIZ;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("enter_from", enterFrom);
            c188727au.LJIIIZ("from_status", LIZ);
            c188727au.LJIIIZ("to_status", str);
            c188727au.LIZLLL(LJIJ ? 1 : 0, "is_expired");
            c188727au.LIZLLL(C71945SLl.LIZLLL() ? 1 : 0, "is_private");
            FMX.LJIIL("click_convert_to_normal_video", c188727au.LIZ);
            AqS143S0200000_12 aqS143S0200000_12 = new AqS143S0200000_12(sk5, mo49getActivity, 94);
            AqS143S0200000_12 aqS143S0200000_122 = new AqS143S0200000_12(sk5, mo49getActivity, 95);
            String aid = sk5.LJLL.getAid();
            if (aid != null) {
                C55723Ltv.LIZIZ.LIZ.switchStoryToNormal(aid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new SK4(sk5, aqS143S0200000_12, aqS143S0200000_122));
            }
            DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(mo49getActivity);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "6826518390700592282")).LIZ) {
                dialogC25756A8y.show();
            }
            sk5.LJLLJ = dialogC25756A8y;
        }
        return C76800UCe.LIZ;
    }
}
