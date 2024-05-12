package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H9y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43618H9y implements InterfaceC43623HAd {
    public final /* synthetic */ C43615H9v LIZ;
    public final /* synthetic */ MvCreateVideoData LIZIZ;

    @Override // X.InterfaceC43623HAd
    public final void LIZ(ArrayList<MvNetFileBean> result) {
        List<String> list;
        String LJIILIIL;
        o.LJIIIZ(result, "result");
        C43615H9v c43615H9v = this.LIZ;
        MvCreateVideoData mvCreateVideoData = this.LIZIZ;
        Iterator<MvNetFileBean> it = result.iterator();
        while (it.hasNext()) {
            MvNetFileBean next = it.next();
            MvThemeData mvThemeData = c43615H9v.LIZJ;
            if (mvThemeData != null && (list = mvThemeData.algorithmKeyForSave) != null && list.contains(next.getAlgorithm()) && ((LJIILIIL = C44694HgQ.LJIILIIL(next.getFilePath())) == null || (!ujb.o.LJJJJ(LJIILIIL, ".mp4", false) && !ujb.o.LJJJJ(LJIILIIL, "/mp4", false)))) {
                mvCreateVideoData.photoToSave.add(next.getFilePath());
            }
            mvCreateVideoData.newMaskFileData.add(next);
        }
        List<MvNetFileBean> list2 = this.LIZ.LJIIIZ;
        MvCreateVideoData mvCreateVideoData2 = this.LIZIZ;
        ArrayList arrayList = (ArrayList) list2;
        arrayList.clear();
        ArrayList<MvNetFileBean> arrayList2 = mvCreateVideoData2.newMaskFileData;
        o.LJIIIIZZ(arrayList2, "videoData.newMaskFileData");
        arrayList.addAll(arrayList2);
        this.LIZ.LJ().LIZLLL(new AqS154S0200000_7(this.LIZ, this.LIZIZ, 126));
    }

    public C43618H9y(C43615H9v c43615H9v, MvCreateVideoData mvCreateVideoData) {
        this.LIZ = c43615H9v;
        this.LIZIZ = mvCreateVideoData;
    }

    @Override // X.InterfaceC43623HAd
    public final void LIZIZ(String message, ArrayList result) {
        String str;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(message, "message");
        ((ArrayList) this.LIZ.LJIIIZ).addAll(result);
        this.LIZ.LJ().LIZLLL(new AqS74S1100000_7(message, this.LIZ, 19));
        C43615H9v c43615H9v = this.LIZ;
        C173166qu c173166qu = c43615H9v.LJFF;
        if (c173166qu != null) {
            c173166qu.LIZLLL = System.currentTimeMillis() - c43615H9v.LJIIJJI;
            c173166qu.LIZ = 1;
            c173166qu.LIZIZ = 103;
            c173166qu.LIZJ = message;
            C43615H9v c43615H9v2 = this.LIZ;
            C173166qu c173166qu2 = c43615H9v2.LJFF;
            if (c173166qu2 != null) {
                MvThemeData mvThemeData = c43615H9v2.LIZJ;
                if (mvThemeData == null || (str = mvThemeData.LJIIJ()) == null) {
                    str = "";
                }
                C173156qt.LJ(c173166qu2, str, "", C78855Ux9.LJLJL, "mv");
                HAQ.LIZIZ(false, this.LIZ.LIZJ, new OSZ(103, message));
                return;
            }
            o.LJIJI("initMvMobParams");
            throw null;
        }
        o.LJIJI("initMvMobParams");
        throw null;
    }
}
