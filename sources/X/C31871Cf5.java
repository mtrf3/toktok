package X;

import android.app.Activity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* renamed from: X.Cf5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31871Cf5 implements InterfaceC78910Uy2 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ Fragment LIZLLL;
    public final /* synthetic */ int LJ = 40004;
    public final /* synthetic */ Boolean LJFF;

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
        android.net.Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, X1D.LIZIZ(LIZ), file2);
        intent.putExtra("output", androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
        try {
            if (this.LIZLLL != null) {
                if (LiveCoverCameraSetting.INSTANCE.enable()) {
                    ((IHostAction) CN1.LIZ(IHostAction.class)).openCamera(this.LIZLLL.mo49getActivity(), this.LJ, androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, this.LJFF);
                } else {
                    C16880lQ.LJII(this.LIZLLL, intent, this.LJ);
                }
            } else if (LiveCoverCameraSetting.INSTANCE.enable()) {
                ((IHostAction) CN1.LIZ(IHostAction.class)).openCamera(this.LIZJ, this.LJ, androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, this.LJFF);
            } else {
                C16880lQ.LJFF(this.LIZJ, this.LJ, intent);
            }
        } catch (Exception unused) {
            KL2.LJI(R.string.soy, this.LIZJ);
        }
    }

    public C31871Cf5(Activity activity, Fragment fragment, Boolean bool, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = activity;
        this.LIZLLL = fragment;
        this.LJFF = bool;
    }
}
