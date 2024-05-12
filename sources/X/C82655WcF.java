package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WcF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82655WcF {
    public final MyMediaModel LIZ;
    public final Boolean LIZIZ;
    public final List<MyMediaModel> LIZJ;
    public final LiveEvent<C76800UCe> LIZLLL;
    public final LiveEvent<C76800UCe> LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    public C82655WcF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82655WcF)) {
            return false;
        }
        C82655WcF c82655WcF = (C82655WcF) obj;
        return o.LJ(this.LIZ, c82655WcF.LIZ) && o.LJ(this.LIZIZ, c82655WcF.LIZIZ) && o.LJ(this.LIZJ, c82655WcF.LIZJ) && o.LJ(this.LIZLLL, c82655WcF.LIZLLL) && o.LJ(this.LJ, c82655WcF.LJ) && this.LJFF == c82655WcF.LJFF && this.LJI == c82655WcF.LJI && this.LJII == c82655WcF.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Boolean bool = this.LIZIZ;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MyMediaModel> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LiveEvent<C76800UCe> liveEvent = this.LIZLLL;
        int hashCode4 = (hashCode3 + (liveEvent == null ? 0 : liveEvent.hashCode())) * 31;
        LiveEvent<C76800UCe> liveEvent2 = this.LJ;
        int hashCode5 = (((((hashCode4 + (liveEvent2 != null ? liveEvent2.hashCode() : 0)) * 31) + this.LJFF) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewVideoClipStates(currentMediaModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", isFirstEnter=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", preExtractMediaModels=");
        LIZ.append(this.LIZJ);
        LIZ.append(", resetClipStartAndEndToDefaultEvent=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hidePreviewVideoSceneWithAnim=");
        LIZ.append(this.LJ);
        LIZ.append(", currentVideoPlayPos=");
        LIZ.append(this.LJFF);
        LIZ.append(", bottomMargin=");
        LIZ.append(this.LJI);
        LIZ.append(", showOrHideMask=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ C82655WcF(int i) {
        this(new MyMediaModel(""), null, null, null, null, 0, 0, false);
    }

    public C82655WcF(MyMediaModel currentMediaModel, Boolean bool, List<MyMediaModel> list, LiveEvent<C76800UCe> liveEvent, LiveEvent<C76800UCe> liveEvent2, int i, int i2, boolean z) {
        o.LJIIIZ(currentMediaModel, "currentMediaModel");
        this.LIZ = currentMediaModel;
        this.LIZIZ = bool;
        this.LIZJ = list;
        this.LIZLLL = liveEvent;
        this.LJ = liveEvent2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z;
    }

    public static C82655WcF LIZ(C82655WcF c82655WcF, MyMediaModel myMediaModel, List list, LiveEvent liveEvent, LiveEvent liveEvent2, int i, int i2, boolean z, int i3) {
        Boolean bool;
        boolean z2 = z;
        List list2 = list;
        MyMediaModel currentMediaModel = myMediaModel;
        LiveEvent liveEvent3 = liveEvent;
        LiveEvent liveEvent4 = liveEvent2;
        int i4 = i;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            currentMediaModel = c82655WcF.LIZ;
        }
        if ((i3 & 2) != 0) {
            bool = c82655WcF.LIZIZ;
        } else {
            bool = null;
        }
        if ((i3 & 4) != 0) {
            list2 = c82655WcF.LIZJ;
        }
        if ((i3 & 8) != 0) {
            liveEvent3 = c82655WcF.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            liveEvent4 = c82655WcF.LJ;
        }
        if ((i3 & 32) != 0) {
            i4 = c82655WcF.LJFF;
        }
        if ((i3 & 64) != 0) {
            i5 = c82655WcF.LJI;
        }
        if ((i3 & 128) != 0) {
            z2 = c82655WcF.LJII;
        }
        c82655WcF.getClass();
        o.LJIIIZ(currentMediaModel, "currentMediaModel");
        return new C82655WcF(currentMediaModel, bool, list2, liveEvent3, liveEvent4, i4, i5, z2);
    }
}
