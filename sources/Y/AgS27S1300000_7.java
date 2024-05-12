package Y;

import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C38306F1q;
import X.C38333F2r;
import X.C5L7;
import X.C60903NvH;
import X.C76800UCe;
import X.C84261X5d;
import X.H78;
import X.InterfaceC42390GkM;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AgS27S1300000_7 implements C10I {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object then$0(AgS27S1300000_7 agS27S1300000_7, C10K task) {
        C38306F1q c38306F1q;
        boolean z;
        String str;
        C38333F2r c38333F2r;
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            Exception LJIIJ = task.LJIIJ();
            String str2 = null;
            if (LJIIJ instanceof C38333F2r) {
                c38306F1q = (C38306F1q) LJIIJ;
            } else {
                c38306F1q = null;
            }
            if (c38306F1q != null && c38306F1q.getErrorCode() == 3013002) {
                z = true;
            } else {
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
                    new SafeHandler(((InterfaceC42390GkM) ((ReplaceMusicServiceImpl) agS27S1300000_7.l1).LIZ.getValue()).LIZ((ActivityC45651qj) agS27S1300000_7.l2)).post(new ARunnableS21S0200000_2((ActivityC45651qj) agS27S1300000_7.l2, task, 28));
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
            ((ReplaceMusicServiceImpl) agS27S1300000_7.l1).showWindow(false, agS27S1300000_7.s0, (ReplaceMusicRequest) agS27S1300000_7.l3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS27S1300000_7 agS27S1300000_7, C10K c10k) {
        if (!((ActivityC45651qj) agS27S1300000_7.l1).isFinishing()) {
            String str = agS27S1300000_7.s0;
            CreativeInfo creativeInfo = (CreativeInfo) agS27S1300000_7.l2;
            o.LJIIIZ(creativeInfo, "creativeInfo");
            String LJJIIZI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZI(creativeInfo);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(System.currentTimeMillis());
            LIZ.append("shoutout.mp4");
            ShoutOutVideoDownloader shoutOutVideoDownloader = new ShoutOutVideoDownloader(str, LJJIIZI, X1D.LIZIZ(LIZ), (ShoutoutVideoDownloadListener) agS27S1300000_7.l3, (ActivityC45651qj) agS27S1300000_7.l1);
            shoutOutVideoDownloader.LJLJJL.getLifecycle().addObserver(shoutOutVideoDownloader);
            IDDListenerS58S0100000_7 iDDListenerS58S0100000_7 = new IDDListenerS58S0100000_7(shoutOutVideoDownloader, 7);
            DownloadTask with = C84261X5d.with(C5L7.LIZ());
            with.url(shoutOutVideoDownloader.LJLIL);
            with.name(shoutOutVideoDownloader.LJLJI);
            with.savePath(shoutOutVideoDownloader.LJLILLLLZI);
            with.retryCount(3);
            with.subThreadListener(iDDListenerS58S0100000_7);
            shoutOutVideoDownloader.LJLJJLL = with.download();
        }
        return C76800UCe.LIZ;
    }

    public AgS27S1300000_7(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
