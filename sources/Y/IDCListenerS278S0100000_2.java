package Y;

import X.ASQ;
import X.ASX;
import X.H8F;
import android.content.DialogInterface;
import android.view.View;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCListenerS278S0100000_2 implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                return;
            case 1:
                onCancel$1(this, dialogInterface);
                return;
            case 2:
                onCancel$2(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDCListenerS278S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(IDCListenerS278S0100000_2 iDCListenerS278S0100000_2, DialogInterface dialogInterface) {
        ASQ.LIZLLL((View) iDCListenerS278S0100000_2.l0, ASX.LIZ);
    }

    public static final void onCancel$1(IDCListenerS278S0100000_2 iDCListenerS278S0100000_2, DialogInterface dialogInterface) {
        ASQ.LIZLLL((View) iDCListenerS278S0100000_2.l0, ASX.LIZ);
    }

    public static final void onCancel$2(IDCListenerS278S0100000_2 iDCListenerS278S0100000_2, DialogInterface dialogInterface) {
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) iDCListenerS278S0100000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            H8F.LJIJI(videoPublishEditModel, "cancel");
        } else {
            o.LJIJI("mModel");
            throw null;
        }
    }
}
