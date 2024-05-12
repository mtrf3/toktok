package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class GYO implements InterfaceC64672gJ<C41702GYg> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ ForwardMedia LJLILLLLZI;
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C41702GYg c41702GYg, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j;
        long j2;
        long j3;
        long j4;
        C41702GYg c41702GYg2 = c41702GYg;
        Context context = this.LJLIL;
        ForwardMedia forwardMedia = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C136895Yv.LIZ(GYP.LIZIZ(forwardMedia.getAuthor())));
        C44428Hc8 c44428Hc8 = GYP.LIZIZ;
        if (c44428Hc8 != null) {
            j = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j = 0;
        }
        HZV.LIZ().LJJII(context, C41706GYk.LIZ(c41702GYg2, arrayList, j));
        V1B.LJLILLLLZI(this.LJLJI);
        boolean z = false;
        GYP.LIZLLL(false);
        C44428Hc8 c44428Hc82 = GYP.LIZIZ;
        if (c44428Hc82 != null && c44428Hc82.LIZIZ) {
            c44428Hc82.LJ();
        }
        GYP.LJ(1, C41698GYc.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("finish setup environment,total cost:");
        C44428Hc8 c44428Hc83 = GYP.LIZIZ;
        long j5 = -1;
        if (c44428Hc83 != null) {
            j2 = c44428Hc83.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j2 = -1;
        }
        LIZ.append(j2);
        LIZ.append(" ms,downloadVideo cost:");
        C44428Hc8 c44428Hc84 = GYP.LIZJ;
        if (c44428Hc84 != null) {
            j3 = c44428Hc84.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j3 = -1;
        }
        LIZ.append(j3);
        LIZ.append(" ms,downloadStyleCost:");
        C44428Hc8 c44428Hc85 = GYP.LJ;
        if (c44428Hc85 != null) {
            j4 = c44428Hc85.LIZIZ(TimeUnit.MILLISECONDS);
        } else {
            j4 = -1;
        }
        LIZ.append(j4);
        LIZ.append(" ms,calculateBgCost:");
        C44428Hc8 c44428Hc86 = GYP.LIZLLL;
        if (c44428Hc86 != null) {
            j5 = c44428Hc86.LIZIZ(TimeUnit.MILLISECONDS);
        }
        LIZ.append(j5);
        LIZ.append(" ms,streamEditMode:");
        if (c41702GYg2.LIZLLL.LIZJ != null) {
            z = true;
        }
        LIZ.append(z);
        GYP.LIZJ(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public GYO(Context context, ForwardMedia forwardMedia, ProgressDialogC43239Gy3 progressDialogC43239Gy3) {
        this.LJLIL = context;
        this.LJLILLLLZI = forwardMedia;
        this.LJLJI = progressDialogC43239Gy3;
    }
}
