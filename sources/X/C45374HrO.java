package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.HrO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45374HrO implements InterfaceC44899Hjj {
    public final /* synthetic */ AlertDialogC45396Hrk LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ AwemeSharePackage LIZJ;
    public final /* synthetic */ InterfaceC62225ObV LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJ;
    public final /* synthetic */ Aweme LJFF;

    @Override // X.InterfaceC44899Hjj
    public final void LIZ() {
    }

    @Override // X.InterfaceC44899Hjj
    public final void LIZIZ() {
        this.LJ.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC44899Hjj
    public final void onCancel() {
        this.LJ.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC44899Hjj
    public final void onProgress(int i) {
        AlertDialogC45396Hrk alertDialogC45396Hrk = this.LIZ;
        if (alertDialogC45396Hrk != null && alertDialogC45396Hrk.isShowing()) {
            alertDialogC45396Hrk.LIZJ(i);
        }
    }

    @Override // X.InterfaceC44899Hjj
    public final void LIZJ(String str, int i, String downloadPhotoPathForShare, C8BR<?, ?> awemeStatsPresenter, OSZ<Integer, String> osz) {
        o.LJIIIZ(downloadPhotoPathForShare, "downloadPhotoPathForShare");
        o.LJIIIZ(awemeStatsPresenter, "awemeStatsPresenter");
        C62340OdM.LIZ(this.LIZIZ, this.LIZ);
        C62340OdM.LJIJ(this.LIZIZ, this.LIZJ, this.LIZLLL, str, this.LJ);
        Aweme aweme = this.LJFF;
        String string = this.LIZJ.extras.getString("enter_from");
        if (string == null) {
            string = "";
        }
        C45373HrN.LIZIZ(aweme, string, this.LIZLLL.key(), "short", null, i, 1);
        C45441HsT.LIZIZ(this.LJFF, C44938HkM.LJIIIIZZ, downloadPhotoPathForShare, 1);
        C62411OeV.LIZ(this.LJFF.getAid(), Integer.valueOf(this.LJFF.getAwemeType()), awemeStatsPresenter, osz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45374HrO(AlertDialogC45396Hrk alertDialogC45396Hrk, Context context, AwemeSharePackage awemeSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, Aweme aweme) {
        this.LIZ = alertDialogC45396Hrk;
        this.LIZIZ = context;
        this.LIZJ = awemeSharePackage;
        this.LIZLLL = interfaceC62225ObV;
        this.LJ = interfaceC88472Yns;
        this.LJFF = aweme;
    }
}
