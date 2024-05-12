package X;

import Y.ACListenerS29S0100000_9;
import Y.IDDListenerS103S0200000_9;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("camera_widget_popup")
/* loaded from: classes10.dex */
public final class MCX extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 2510;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        View contentView = C16880lQ.LLLZIIL(R.layout.bj0, C16880lQ.LLZIL(this.LJLIL), null);
        ASL asl = new ASL();
        asl.LJI(0);
        o.LJIIIIZZ(contentView, "contentView");
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = contentView;
        tuxSheet.LJLILLLLZI = new IDDListenerS103S0200000_9(wrapper, this, 1);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(tuxSheet, 79), contentView.findViewById(R.id.bfj));
        ((AppCompatImageView) contentView.findViewById(R.id.evp)).setImageURI(android.net.Uri.fromFile(new File(FUR.LIZ())));
        C16880lQ.LJIIJ(new MCW(tuxSheet, this), contentView.findViewById(R.id.au4));
        C1DG.LJII(this.LJLIL, "activity.supportFragmentManager", tuxSheet, "CameraWidgetDialogTask");
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        String str4 = this.LJLJJL;
        C43588H8u.LIZLLL(str, "enterFrom", str2, "shootWay", str3, "creationId", str4, WM7.SCENE_SERVICE);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("creation_id", str3);
        c145995oB.LJI(WM7.SCENE_SERVICE, str4);
        GXR.LIZ("show_add_camera_popup", c145995oB.LIZ);
    }

    public MCX(ActivityC45651qj activity, String enterFrom, String shootWay, String creationId, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(creationId, "creationId");
        this.LJLIL = activity;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = shootWay;
        this.LJLJJI = creationId;
        this.LJLJJL = str;
    }
}
