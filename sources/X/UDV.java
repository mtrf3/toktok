package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDV {
    public final FragmentManager LIZ;
    public final List<LiveSubMediaModel> LIZIZ;
    public final C76878UFe LIZJ;
    public final int LIZLLL;
    public final java.util.Map<String, Object> LJ;
    public final UDT LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UDV)) {
            return false;
        }
        UDV udv = (UDV) obj;
        return o.LJ(this.LIZ, udv.LIZ) && o.LJ(this.LIZIZ, udv.LIZIZ) && o.LJ(this.LIZJ, udv.LIZJ) && this.LIZLLL == udv.LIZLLL && o.LJ(this.LJ, udv.LJ) && o.LJ(this.LJFF, udv.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewParams(fragmentManager=");
        LIZ.append(this.LIZ);
        LIZ.append(", mediaModelList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", emotesShowStyle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", logInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", listener=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        FragmentManager fragmentManager = this.LIZ;
        int i = 0;
        if (fragmentManager == null) {
            hashCode = 0;
        } else {
            hashCode = fragmentManager.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.LJ, (((this.LIZJ.hashCode() + AnonymousClass391.LIZIZ(this.LIZIZ, hashCode * 31, 31)) * 31) + this.LIZLLL) * 31, 31);
        UDT udt = this.LJFF;
        if (udt != null) {
            i = udt.hashCode();
        }
        return LIZ + i;
    }

    public UDV(FragmentManager fragmentManager, List list, C76878UFe imageParams, int i, java.util.Map logInfo, C45497HtN c45497HtN) {
        o.LJIIIZ(imageParams, "imageParams");
        o.LJIIIZ(logInfo, "logInfo");
        this.LIZ = fragmentManager;
        this.LIZIZ = list;
        this.LIZJ = imageParams;
        this.LIZLLL = i;
        this.LJ = logInfo;
        this.LJFF = c45497HtN;
    }
}
