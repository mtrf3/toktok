package X;

import android.app.Activity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* renamed from: X.CfD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31879CfD implements InterfaceC78910Uy2 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ Fragment LIZLLL;
    public final /* synthetic */ int LJ = 40004;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(this.LIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, this.LIZIZ);
        Activity activity = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ.getPackageName());
        LIZ.append(TTLiveFileProvider.NAME);
        intent.putExtra("output", FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, X1D.LIZIZ(LIZ), file2));
        intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
        try {
            Fragment fragment = this.LIZLLL;
            if (fragment != null) {
                C16880lQ.LJII(fragment, intent, this.LJ);
            } else {
                C16880lQ.LJFF(this.LIZJ, this.LJ, intent);
            }
        } catch (Exception unused) {
            KL2.LJI(R.string.soy, this.LIZJ);
        }
    }

    public C31879CfD(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = fragment;
    }
}
