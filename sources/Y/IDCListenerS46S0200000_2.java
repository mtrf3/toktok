package Y;

import X.ActivityC45651qj;
import X.C132385Hm;
import X.C136695Yb;
import X.C45828Hyi;
import X.C60903NvH;
import X.C6FS;
import X.C78934UyQ;
import X.H8F;
import X.HE2;
import X.I9T;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes3.dex */
public class IDCListenerS46S0200000_2 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS46S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onClick$0(IDCListenerS46S0200000_2 iDCListenerS46S0200000_2, DialogInterface dialogInterface, int i) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) iDCListenerS46S0200000_2.l0;
        C6FS c6fs = (C6FS) iDCListenerS46S0200000_2.l1;
        videoEditContainerScene.getClass();
        c6fs.qB();
        if (!TextUtils.isEmpty(videoEditContainerScene.LJZL.newDraftId)) {
            H8F.LJIIZILJ(videoEditContainerScene.LJZL);
        }
        videoEditContainerScene.LLLJL(C45828Hyi.LJIILL);
        videoEditContainerScene.LLLII();
    }

    public static final void onClick$1(IDCListenerS46S0200000_2 iDCListenerS46S0200000_2, DialogInterface dialogInterface, int i) {
        AVMusic aVMusic;
        C60903NvH.LJIIJJI().LJIIIZ().LIZ();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) iDCListenerS46S0200000_2.l0;
        C136695Yb c136695Yb = C132385Hm.LIZ;
        if (c136695Yb != null) {
            aVMusic = c136695Yb.LIZIZ;
        } else {
            aVMusic = null;
        }
        I9T.LJI(aVMusic, false, videoPublishEditModel.creativeModel.musicBuzModel);
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDCListenerS46S0200000_2.l1;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) iDCListenerS46S0200000_2.l0;
        ((HE2) C78934UyQ.LJLIL.getBridgeService()).LIZJ(activityC45651qj, videoPublishEditModel2, C45828Hyi.LJIILJJIL);
    }
}
