package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsService;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GWo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41658GWo extends DraftListenerAdapter {
    public static C41658GWo LJIIIIZZ;
    public final List<AVChallenge> LIZ = new ArrayList();
    public String LIZIZ;
    public int LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public boolean LJFF;
    public String LJI;
    public RecordScene LJII;

    public static C41658GWo LIZLLL() {
        if (LJIIIIZZ == null) {
            synchronized (C41658GWo.class) {
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = new C41658GWo();
                }
            }
        }
        return LJIIIIZZ;
    }

    public final void LJFF() {
        ((ArrayList) this.LIZ).clear();
        if (CommerceToolsService.LIZ() != null) {
            CommerceToolsService.LIZ().setCommerceChallenge(false);
        }
    }

    public C41658GWo() {
        Boolean bool = Boolean.FALSE;
        this.LIZLLL = bool;
        this.LJ = bool;
        this.LJFF = false;
        C60903NvH.LJIIJJI().LJJJI().LIZ().registerListener(this);
    }

    public static boolean LJ() {
        return AVServiceImpl.LIZ().isPublishing(null);
    }

    public static boolean LIZJ(Context context) {
        boolean LJ = LJ();
        if (!LJ) {
            if (C60903NvH.LJIIJJI().getPublishService().LJIIL() > 0) {
                LJ = true;
            } else {
                LJ = false;
            }
        }
        if (LJ) {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("open_camera", "check is already published: no ");
            C5S1 c5s1 = new C5S1(C16880lQ.LLLLL(context));
            c5s1.LIZJ(R.string.py_);
            c5s1.LJ();
            return false;
        }
        I9A.LIZJ("open_camera", "check is already published: yes ");
        return true;
    }

    public static void LJI(RecordScene recordScene) {
        ExtractFramesModel extractFramesModel;
        if (recordScene != null && (extractFramesModel = recordScene.extractFramesModel) != null) {
            C39579Fg7.LJIJJLI(extractFramesModel.getExtractFramesDir());
            C39579Fg7.LJIL(recordScene.extractFramesModel.getExtractFramesDir());
        }
    }

    public final void LIZIZ(AVChallenge aVChallenge) {
        if (aVChallenge == null || aVChallenge.getCid() == null) {
            return;
        }
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZ).add(aVChallenge);
    }

    public final void LJII(int i) {
        C41659GWp.LIZ();
        if (i != 9 && i != 10 && i != 12) {
            return;
        }
        this.LJI = "";
    }

    public final void LJIIIIZZ(String str) {
        String str2;
        if (str != null && (str2 = this.LJI) != null && str2.equals(str)) {
            return;
        }
        this.LJI = str;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        if (!updateParams.isPublish()) {
            this.LJI = "";
        }
    }
}
