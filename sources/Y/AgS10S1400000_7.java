package Y;

import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C1I0;
import X.C38306F1q;
import X.C38333F2r;
import X.C41859Gbn;
import X.C42622Go6;
import X.C43758HFi;
import X.C60903NvH;
import X.C76800UCe;
import X.EnumC42461GlV;
import X.H78;
import X.HG2;
import X.HGA;
import X.HGN;
import X.InterfaceC42390GkM;
import X.X1D;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AgS10S1400000_7 implements C10I {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS10S1400000_7 agS10S1400000_7, C10K task) {
        C38306F1q c38306F1q;
        String str;
        C38333F2r c38333F2r;
        o.LJIIIZ(task, "task");
        boolean z = true;
        if (task.LJIILJJIL() || task.LJIIL()) {
            Exception LJIIJ = task.LJIIJ();
            String str2 = null;
            if (LJIIJ instanceof C38333F2r) {
                c38306F1q = (C38306F1q) LJIIJ;
            } else {
                c38306F1q = null;
            }
            if (c38306F1q == null || c38306F1q.getErrorCode() != 3013002) {
                z = false;
            }
            if (z) {
                Exception LJIIJ2 = task.LJIIJ();
                if ((LJIIJ2 instanceof C38333F2r) && (c38333F2r = (C38333F2r) LJIIJ2) != null) {
                    str = c38333F2r.getErrorMsg();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    new SafeHandler(((InterfaceC42390GkM) ((ReplaceMusicServiceImpl) agS10S1400000_7.l1).LIZ.getValue()).LIZ((ActivityC45651qj) agS10S1400000_7.l2)).post(new ARunnableS21S0200000_2((ActivityC45651qj) agS10S1400000_7.l2, task, 29));
                    H78.LIZIZ("ReplaceMusicToolbarScene", "error code 3013002");
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("first network error ");
            Exception LJIIJ3 = task.LJIIJ();
            if (LJIIJ3 != null) {
                str2 = LJIIJ3.toString();
            }
            LIZ.append(str2);
            H78.LIZIZ("ReplaceMusicToolbarScene", X1D.LIZIZ(LIZ));
            ((ReplaceMusicServiceImpl) agS10S1400000_7.l1).showWindow(false, agS10S1400000_7.s0, (ReplaceMusicRequest) agS10S1400000_7.l3);
        } else {
            PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
            C42622Go6.LJIIIZ = true;
            ((PromoteReplaceMusicRequest) agS10S1400000_7.l4).setRetryScene(EnumC42461GlV.NOT_RETRY.getId());
            C42622Go6.LJIIIIZZ((PromoteReplaceMusicRequest) agS10S1400000_7.l4, (ActivityC45651qj) agS10S1400000_7.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS10S1400000_7 agS10S1400000_7, C10K c10k) {
        VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) agS10S1400000_7.l1;
        C43758HFi c43758HFi = (C43758HFi) agS10S1400000_7.l2;
        HGN hgn = (HGN) agS10S1400000_7.l3;
        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) agS10S1400000_7.l4;
        String str = agS10S1400000_7.s0;
        videoFramesUploadService.getClass();
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        c43758HFi.LIZ((HGN) c10k.LJIIJJI());
        Iterator it = ((ArrayList) ((HGN) c10k.LJIIJJI()).LIZ).iterator();
        while (it.hasNext()) {
            it.next();
        }
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("extract_frame", "package zip success.");
        HG2.LIZ(str, "create_upload_task");
        Iterator it2 = ((ArrayList) hgn.LIZ).iterator();
        while (it2.hasNext()) {
            HGA hga = (HGA) it2.next();
            try {
                C10K<HGA> LIZJ = videoFramesUploadService.LIZJ(hga, uploadAuthKeyConfig);
                LIZJ.LJIJI();
                if (LIZJ.LJIILJJIL() || LIZJ.LJIIL()) {
                    C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("upload failed for awemeId: ");
                    LIZ.append(hga.LIZ);
                    LIZ.append(", reason: ");
                    LIZ.append(Log.getStackTraceString(LIZJ.LJIIJ()));
                    LJJ.LIZJ("extract_frame", X1D.LIZIZ(LIZ));
                } else {
                    C41859Gbn LJJ2 = C60903NvH.LJIIJJI().getPublishService().LJJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("upload uri: ");
                    LIZ2.append(hga.LJ);
                    LIZ2.append(", awemeId: ");
                    LIZ2.append(hga.LIZ);
                    LIZ2.append(" success");
                    LJJ2.LIZJ("extract_frame", X1D.LIZIZ(LIZ2));
                }
            } catch (InterruptedException e) {
                C41859Gbn LIZIZ = C1I0.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("upload interrupted for awemeId: ");
                LIZ3.append(hga.LIZ);
                LIZ3.append(", reason: ");
                LIZ3.append(Log.getStackTraceString(e));
                LIZIZ.LIZJ("extract_frame", X1D.LIZIZ(LIZ3));
            }
        }
        return C10K.LJIIIZ(hgn);
    }

    public AgS10S1400000_7(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.s0 = str;
    }
}
