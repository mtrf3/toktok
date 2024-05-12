package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86216Xsa implements InterfaceC61118Nyk {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ PickPhotoUploadFeature LIZJ;

    public C86216Xsa(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Activity activity, PickPhotoUploadFeature pickPhotoUploadFeature) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = activity;
        this.LIZJ = pickPhotoUploadFeature;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] grantResults, String[] strArr) {
        o.LJIIIIZZ(grantResults, "grantResults");
        if (grantResults.length == 0) {
            return;
        }
        if (grantResults[0] == 0) {
            this.LIZ.invoke();
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZIZ);
        c5s1.LIZLLL(this.LIZIZ.getString(R.string.jga));
        c5s1.LJ();
        this.LIZJ.onFileSelected.LIZ(-1, "uploadFailed");
    }
}
