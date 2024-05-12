package X;

import Y.IDDListenerS102S0200000_7;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.G7y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41018G7y extends AbstractC42152GgW<C76800UCe> {
    public final ActivityC45651qj LJLJJI;
    public final VideoPublishEditModel LJLJJL;
    public final PermissionConfigure LJLJJLL;
    public final DialogInterface.OnDismissListener LJLJL;
    public final Runnable LJLJLJ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJLLL;
    public final boolean LJLL;

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Permission Check";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.DialogFragment] */
    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        o.LJIIIZ(nextStep, "nextStep");
        if (this.LJLJJLL.getCurrentPermission() == -1 || C00F.LIZ(31744, 0, "refactor_publish_check_mock_permission", true) == 1) {
            Runnable runnable = this.LJLJLJ;
            if (runnable != null) {
                runnable.run();
            }
            if (!this.LJLL) {
                C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
                G9M.LJFF(this.LJLJJL, "video_post_page", this.LJLJJLL.getCurrentPermission(), C41019G7z.LJLIL);
            }
            nextStep.LIZJ(this);
            IDDListenerS102S0200000_7 iDDListenerS102S0200000_7 = new IDDListenerS102S0200000_7(nextStep, this, 2);
            PermissionConfigure config = this.LJLJJLL;
            ActivityC45651qj activity = this.LJLJJI;
            InterfaceC88472Yns<Integer, C76800UCe> permissionCallback = this.LJLJLLL;
            AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(nextStep, this, 42);
            o.LJIIIZ(config, "config");
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(permissionCallback, "permissionCallback");
            C68322mC c68322mC = new C68322mC();
            AqS108S0300000_4 aqS108S0300000_4 = new AqS108S0300000_4(permissionCallback, aqS154S0200000_7, c68322mC, 21);
            if (config.getPostBtnConfigure() == null) {
                config.setPostBtnConfigure(new PostBtnConfigure(false, null, 3, null));
            }
            PublishDefaultPermissionFragment LIZ = G9F.LIZ(config, aqS108S0300000_4, aqS154S0200000_7, false);
            ASL asl = new ASL();
            asl.LIZIZ(LIZ);
            asl.LJ(iDDListenerS102S0200000_7);
            ?? r2 = asl.LIZ;
            c68322mC.element = r2;
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            r2.show(supportFragmentManager, "PublishPermissionSheet");
            C116484hg.LIZ("enter_method", config.getEnterMethod(), "video_privacy_setting_viewer_range_click");
            return;
        }
        nextStep.LIZIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41018G7y(ActivityC45651qj activityC45651qj, VideoPublishEditModel model, PermissionConfigure config, DialogInterface.OnDismissListener onDismissListener, Runnable runnable, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, boolean z, boolean z2) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(config, "config");
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = model;
        this.LJLJJLL = config;
        this.LJLJL = onDismissListener;
        this.LJLJLJ = runnable;
        this.LJLJLLL = interfaceC88472Yns;
        this.LJLL = z2;
    }
}
