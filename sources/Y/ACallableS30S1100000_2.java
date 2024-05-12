package Y;

import X.C123764tQ;
import X.C151605xE;
import X.C168636jb;
import X.C169636lD;
import X.C39579Fg7;
import X.C44729Hgz;
import X.C5MG;
import X.C76800UCe;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS30S1100000_2 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        C123764tQ c123764tQ = ((C5MG) aCallableS30S1100000_2.l1).LJIIL;
        o.LJI(c123764tQ);
        return VEEditor.LJIILJJIL(new String[]{aCallableS30S1100000_2.s0}, new int[]{c123764tQ.LJLILLLLZI}, new int[]{c123764tQ.LJLJI});
    }

    public static final Object call$1(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        long currentTimeMillis = System.currentTimeMillis();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS30S1100000_2.l1;
        String jsonResult = aCallableS30S1100000_2.s0;
        o.LJIIIIZZ(jsonResult, "jsonResult");
        C168636jb.LIZJ(2, currentTimeMillis, videoPublishEditModel, jsonResult);
        C169636lD.LIZ("index = 2, INDEX_ORIGIN_VOICEOVER");
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        long currentTimeMillis = System.currentTimeMillis();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS30S1100000_2.l1;
        String jsonResult = aCallableS30S1100000_2.s0;
        o.LJIIIIZZ(jsonResult, "jsonResult");
        C168636jb.LIZJ(1, currentTimeMillis, videoPublishEditModel, jsonResult);
        C169636lD.LIZ("index = 1, INDEX_ORIGIN_VIDEO");
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        String str;
        if (((VideoPublishEditModel) aCallableS30S1100000_2.l1).isMvThemeVideoType()) {
            str = ((VideoPublishEditModel) aCallableS30S1100000_2.l1).mvCreateVideoData.videoCoverImgPath;
        } else {
            str = ((VideoPublishEditModel) aCallableS30S1100000_2.l1).multiEditVideoRecordData.coverImagePath;
        }
        C39579Fg7.LIZLLL(str, aCallableS30S1100000_2.s0);
        return null;
    }

    public static final Object call$4(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        return Boolean.valueOf(C151605xE.LIZ((Bitmap) aCallableS30S1100000_2.l1, aCallableS30S1100000_2.s0, 0));
    }

    public static final Object call$5(ACallableS30S1100000_2 aCallableS30S1100000_2) {
        C44729Hgz.LJJJJLI((Bitmap) aCallableS30S1100000_2.l1, aCallableS30S1100000_2.s0, null, 6);
        return C76800UCe.LIZ;
    }

    public ACallableS30S1100000_2(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
