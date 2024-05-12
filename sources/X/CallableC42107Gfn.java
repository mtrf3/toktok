package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42107Gfn<V> implements Callable {
    public final /* synthetic */ CreativeInfo LJLIL;
    public final /* synthetic */ MvCreateVideoData LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ OSZ<Integer, Integer> LJLJJI;

    public CallableC42107Gfn(CreativeInfo creativeInfo, MvCreateVideoData mvCreateVideoData, int i, OSZ<Integer, Integer> osz) {
        this.LJLIL = creativeInfo;
        this.LJLILLLLZI = mvCreateVideoData;
        this.LJLJI = i;
        this.LJLJJI = osz;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayList = new ArrayList();
        String LJII = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJII(this.LJLIL);
        C78966Uyw.LJJJJLL(new File(LJII));
        Iterator<String> it = this.LJLILLLLZI.selectMediaList.iterator();
        while (it.hasNext()) {
            String path = it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJII);
            LIZ.append(C43075GvP.LIZ(".bmp"));
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(path, "path");
            String LJ = C42111Gfr.LJ(C42111Gfr.LIZ(this.LJLJI, path, LIZIZ, this.LJLJJI), path, LIZIZ);
            if (LJ != null && LJ.length() != 0) {
                arrayList.add(LJ);
            }
        }
        if (arrayList.size() > 0) {
            this.LJLILLLLZI.selectMediaList.clear();
            this.LJLILLLLZI.selectMediaList.addAll(arrayList);
        }
        return C76800UCe.LIZ;
    }
}
