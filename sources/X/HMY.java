package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS5S0211000_7;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public final class HMY implements IVideoLegalCheckerAndToastService {
    public final Context LIZ;

    public HMY(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    public static MediaModel LIZIZ(String str) {
        int[] LIZIZ = C43495H5f.LIZIZ(str);
        String str2 = null;
        if (LIZIZ == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.fileLocalUriPath = str;
        mediaModel.width = LIZIZ[0];
        mediaModel.height = LIZIZ[1];
        mediaModel.duration = LIZIZ[3];
        try {
            str2 = C44694HgQ.LJIILLIIL(str).extractMetadata(12);
        } catch (Exception unused) {
        }
        mediaModel.mimeType = str2;
        return mediaModel;
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String videoPath, boolean z) {
        o.LJIIIZ(videoPath, "videoPath");
        return isVideoLengthOrTypeSupportedAndShowErrToast(videoPath, z, null);
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String videoPath, boolean z, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(videoPath, "videoPath");
        MediaModel LIZIZ = LIZIZ(videoPath);
        if (LIZIZ != null) {
            return LIZ(this, LIZIZ, z, 0, interfaceC88472Yns, 12);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String videoPath, boolean z, int i, InterfaceC65784Pro<C76800UCe> onSucess) {
        int i2 = i;
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(onSucess, "onSucess");
        MediaModel LIZIZ = LIZIZ(videoPath);
        if (LIZIZ != null) {
            int LIZIZ2 = (int) C44529Hdl.LIZIZ();
            if (i2 <= 0) {
                i2 = 600000;
            }
            HMW.LIZIZ(new HMO(this.LIZ), LIZIZ, C42117Gfx.LJ(), LIZIZ2, i2, false, false, new AqS173S0100000_7(onSucess, (InterfaceC65784Pro<C76800UCe>) 6), new AqS5S0211000_7(z, this, LIZIZ2, 1), 48);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String videoPath, boolean z, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(videoPath, "videoPath");
        MediaModel LIZIZ = LIZIZ(videoPath);
        if (LIZIZ != null) {
            return LIZ(this, LIZIZ, z, i, interfaceC88472Yns, 8);
        }
        return false;
    }

    public static boolean LIZ(HMY hmy, MediaModel mediaModel, boolean z, int i, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        long j;
        int i3 = i;
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            j = 1000;
        } else {
            j = 0;
        }
        hmy.getClass();
        n nVar = new n();
        int LIZIZ = (int) C44529Hdl.LIZIZ();
        if (i3 <= 0) {
            i3 = 600000;
        }
        HMW.LIZIZ(new HMO(hmy.LIZ), mediaModel, C42117Gfx.LJ(), LIZIZ, i3, false, false, new AqS173S0100000_7(nVar, (n<Boolean>) 5), new HMZ(z, hmy, LIZIZ, interfaceC88472Yns, nVar), 48);
        try {
            C10K<TResult> c10k = nVar.LIZ;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            synchronized (c10k.LIZ) {
                if (!c10k.LJIILIIL()) {
                    c10k.LIZ.wait(timeUnit.toMillis(j));
                }
                c10k.LJIILIIL();
            }
            Boolean bool = (Boolean) nVar.LIZ.LJIIJJI();
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService
    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String videoPath, boolean z, int i, int i2, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> onSuccess, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> onError) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onError, "onError");
        MediaModel LIZIZ = LIZIZ(videoPath);
        if (LIZIZ == null) {
            onError.invoke("", 0L, -9, "path is null");
        } else {
            HMW.LIZIZ(new HMO(this.LIZ), LIZIZ, C42117Gfx.LJ(), i2, i, false, true, new AqS173S0100000_7(onSuccess, (InterfaceC88471Ynr<? super List<String>, ? super String, C76800UCe>) 4), new AqS5S0211000_7(z, (boolean) this, (HMY) i2, (int) onError, (InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe>) 0), 16);
        }
    }
}
