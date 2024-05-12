package X;

import android.content.Context;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS69S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCM {
    public final Context LIZ;
    public final UrlModel LIZIZ;
    public final int LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final int[] LJ;
    public final float LJFF;
    public final RemoteViews LJI;
    public final String LJII;
    public final Aweme LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MCM)) {
            return false;
        }
        MCM mcm = (MCM) obj;
        return o.LJ(this.LIZ, mcm.LIZ) && o.LJ(this.LIZIZ, mcm.LIZIZ) && this.LIZJ == mcm.LIZJ && o.LJ(this.LIZLLL, mcm.LIZLLL) && o.LJ(this.LJ, mcm.LJ) && Float.compare(this.LJFF, mcm.LJFF) == 0 && o.LJ(this.LJI, mcm.LJI) && o.LJ(this.LJII, mcm.LJII) && o.LJ(this.LJIIIIZZ, mcm.LJIIIIZZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        UrlModel urlModel = this.LIZIZ;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJII, (this.LJI.hashCode() + C47959Irz.LIZIZ(this.LJFF, (Arrays.hashCode(this.LJ) + C1JX.LIZLLL(this.LIZLLL, (((hashCode2 + hashCode) * 31) + this.LIZJ) * 31, 31)) * 31, 31)) * 31, 31);
        Aweme aweme = this.LJIIIIZZ;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowRemoteBitmapContext(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", urlModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageViewId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", reducer=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", targetPxSize=");
        C0JT.LIZLLL(this.LJ, LIZ, ", cornerRadius=");
        LIZ.append(this.LJFF);
        LIZ.append(", remoteViews=");
        LIZ.append(this.LJI);
        LIZ.append(", widgetType=");
        LIZ.append(this.LJII);
        LIZ.append(", nowAweme=");
        return C770830u.LIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public MCM(Context context, UrlModel urlModel, AqS69S0400000_9 aqS69S0400000_9, int[] targetPxSize, float f, RemoteViews remoteViews, String widgetType, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(targetPxSize, "targetPxSize");
        o.LJIIIZ(widgetType, "widgetType");
        this.LIZ = context;
        this.LIZIZ = urlModel;
        this.LIZJ = R.id.bxv;
        this.LIZLLL = aqS69S0400000_9;
        this.LJ = targetPxSize;
        this.LJFF = f;
        this.LJI = remoteViews;
        this.LJII = widgetType;
        this.LJIIIIZZ = aweme;
    }
}
