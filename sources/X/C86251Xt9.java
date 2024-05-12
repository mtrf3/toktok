package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService;
import com.ss.bduploader.BDVideoUploader;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xt9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86251Xt9 implements InterfaceC86201XsL {
    public final WeakReference<Activity> LJLIL;
    public final InterfaceC86221Xsf LJLILLLLZI;
    public final GetUploadConfigService.UploadConfigService LJLJI;
    public BDVideoUploader LJLJJI;
    public boolean LJLJJL;

    public void LIZLLL(int i, String str) {
        throw null;
    }

    public final BDVideoUploader LIZIZ() {
        BDVideoUploader bDVideoUploader = this.LJLJJI;
        if (bDVideoUploader != null) {
            return bDVideoUploader;
        }
        o.LJIJI("uploader");
        throw null;
    }

    @Override // X.InterfaceC86201XsL
    public final void cancelUpload() {
        try {
            LIZIZ().stop();
            LIZIZ().close();
            LIZJ(0, "uploadCancel");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZJ(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        this.LJLILLLLZI.LIZ(i, errMsg);
    }

    public final void LJ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        if (z) {
            Activity activity = this.LJLIL.get();
            if (activity != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (C61184Nzo.LIZ(activity) == 0 && C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_VIDEO") == 0) {
                        interfaceC65784Pro.invoke();
                        return;
                    } else {
                        C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-video_upload_camera_and_write_storage_permission"), new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.CAMERA"}, new C86258XtG(activity, this, interfaceC65784Pro));
                        return;
                    }
                }
                if (C61184Nzo.LIZ(activity) == 0 && C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    interfaceC65784Pro.invoke();
                    return;
                } else {
                    C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-video_upload_camera_and_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new C86259XtH(activity, this, interfaceC65784Pro));
                    return;
                }
            }
            return;
        }
        Activity activity2 = this.LJLIL.get();
        if (activity2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(activity2, "android.permission.READ_MEDIA_VIDEO") == 0) {
                interfaceC65784Pro.invoke();
                return;
            } else {
                C61115Nyh.LIZIZ(activity2, TokenCert.Companion.with("bpea-video_upload_write_storage_permission"), new String[]{"android.permission.READ_MEDIA_VIDEO"}, new C86256XtE(activity2, this, interfaceC65784Pro));
                return;
            }
        }
        if (C04330Ez.LIZ(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            interfaceC65784Pro.invoke();
        } else {
            C61115Nyh.LIZIZ(activity2, TokenCert.Companion.with("bpea-video_upload_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C86257XtF(activity2, this, interfaceC65784Pro));
        }
    }

    @Override // X.InterfaceC86201XsL
    public final void handleJsInvoke(JSONObject params, boolean z) {
        o.LJIIIZ(params, "params");
        int optInt = params.optInt("type");
        if (optInt != 700) {
            if (optInt != 800) {
                return;
            }
            LJ(new AqS165S0100000_15(this, 790), z);
            return;
        }
        LJ(new AqS165S0100000_15(this, 791), z);
    }

    public C86251Xt9(WeakReference contextRef, C86200XsK dialog, AbstractC86252XtA onFileSelected) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(onFileSelected, "onFileSelected");
        this.LJLIL = contextRef;
        this.LJLILLLLZI = onFileSelected;
        this.LJLJI = new GetUploadConfigService().LIZ;
    }

    public final void LIZ(Activity activity, int[] iArr, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (iArr[0] == 0) {
            if (iArr[1] == 0) {
                interfaceC65784Pro.invoke();
                return;
            }
        } else {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZLLL(activity.getString(R.string.jga));
            c5s1.LJ();
        }
        if (iArr[1] != 0) {
            C5S1 c5s12 = new C5S1(activity);
            c5s12.LIZLLL(activity.getString(R.string.jg9));
            c5s12.LJ();
        }
        this.LJLILLLLZI.LIZ(-1, "uploadFailed");
    }
}
