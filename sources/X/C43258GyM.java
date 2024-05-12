package X;

import Y.IDCListenerS160S0100000_7;
import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GyM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43258GyM implements InterfaceC61107NyZ {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ InterfaceC26329AUz LIZIZ;
    public final /* synthetic */ C43256GyK LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        Activity activity = this.LIZ;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (c164906daArr[0].LIZIZ == EnumC61598OFm.GRANTED) {
            C43256GyK c43256GyK = this.LIZJ;
            Activity activity2 = this.LIZ;
            c43256GyK.LIZ = this.LIZIZ;
            SmartRouter.buildRoute(activity2, "//profile/avatar_choose").open(2, new C43254GyI(c43256GyK));
            return;
        }
        if (c164906daArr.length > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getAvatar permission failure: ");
            LIZ.append(c164906daArr[0].LIZIZ);
            C221018lt.LJFF("AvatarCutHelper", X1D.LIZIZ(LIZ));
        }
        C26335AVf.LJJIIJZLJL("bpea-profile_video_avatar_select");
        Activity activity3 = this.LIZ;
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(activity3, R.style.po);
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LIZLLL = c008901t.LIZ.getText(R.string.it1);
        anonymousClass025.LIZIZ(R.string.isz);
        anonymousClass025.LIZJ(R.string.cg_, new IDCListenerS160S0100000_7(activity3, 1));
        anonymousClass025.LIZLLL(R.string.dsg, new IDCListenerS160S0100000_7(activity3, 0));
        DialogInterfaceC39771hF LIZ2 = anonymousClass025.LIZ();
        try {
            LIZ2.setCancelable(false);
            LIZ2.setCanceledOnTouchOutside(false);
            if (new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AlertDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-1836153597414765938")).LIZ) {
                return;
            }
            LIZ2.show();
        } catch (Exception unused) {
        }
    }

    public C43258GyM(C43256GyK c43256GyK, Activity activity, InterfaceC26329AUz interfaceC26329AUz) {
        this.LIZJ = c43256GyK;
        this.LIZ = activity;
        this.LIZIZ = interfaceC26329AUz;
    }
}
