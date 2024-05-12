package X;

import android.app.Activity;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.zhiliaoapp.musically.R;
import dmt.av.services.VEEncodingImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gxd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43213Gxd {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public boolean LIZ;
    public final C43199GxP LIZIZ = new C43199GxP();

    public final void LIZIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner, C162656Zx c162656Zx) {
        IVEEncodingSetting iVEEncodingSetting;
        if (videoPublishEditModel == null) {
            return;
        }
        if (LIZJ) {
            C5S1 c5s1 = new C5S1(activityC45651qj);
            c5s1.LIZLLL(activityC45651qj.getString(R.string.hno));
            c5s1.LJ();
            return;
        }
        if (!C39579Fg7.LJIILL()) {
            C5S1 c5s12 = new C5S1(activityC45651qj);
            c5s12.LIZJ(R.string.qb6);
            c5s12.LJ();
            return;
        }
        if (C39579Fg7.LJIILIIL() < 20971520) {
            return;
        }
        C135315St c135315St = new C135315St(videoPublishEditModel.getVideoEditorType());
        c135315St.LJIJ = videoPublishEditModel.nleData;
        C162016Xl.LIZ(activityC45651qj, lifecycleOwner, c162656Zx, c135315St, videoPublishEditModel, "");
        C5UF.LIZ(c135315St.LJIIIZ);
        SynthetiseResult synthetiseResult = new SynthetiseResult();
        synthetiseResult.draftHardEncode = videoPublishEditModel.mHardEncode;
        String outputFile = videoPublishEditModel.getOutputFile();
        outputFile.toString();
        synthetiseResult.outputFile = outputFile;
        synthetiseResult.needRecode = false;
        synthetiseResult.flags |= 1;
        synthetiseResult.isEnableFpsSet = C19N.LJ("enable_synthetic_fps_set", true);
        synthetiseResult.editPreviewInfo = videoPublishEditModel.getPreviewInfo();
        synthetiseResult.videoWidth = videoPublishEditModel.videoWidth();
        synthetiseResult.videoHeight = videoPublishEditModel.videoHeight();
        synthetiseResult.texts = videoPublishEditModel.texts;
        synthetiseResult.isFastImport = videoPublishEditModel.isFastImport;
        synthetiseResult.isFastImportForLog = H7R.LJJJJ(videoPublishEditModel);
        synthetiseResult.segmentCount = videoPublishEditModel.segmentCounts();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.bytedance.info", new JSONObject(C51029K0z.LJJIIZI(new OSZ("is_km_video", 1))));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC153045zY interfaceC153045zY = c135315St.LJIIIZ;
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonInfo.toString()");
        interfaceC153045zY.LLILLL("com.android.information", jSONObject2);
        this.LIZIZ.getClass();
        C43206GxW.LIZIZ = 1;
        C43206GxW.LIZJ = 0;
        C43206GxW.LIZLLL = videoPublishEditModel;
        C2U8.LIZ(new C43203GxT());
        LIZJ = true;
        InterfaceC153045zY interfaceC153045zY2 = c135315St.LJIIIZ;
        String outputFile2 = videoPublishEditModel.getOutputFile();
        Object LIZ = C58096Mr6.LIZ(IVEEncodingSetting.class, false);
        if (LIZ != null) {
            iVEEncodingSetting = (IVEEncodingSetting) LIZ;
        } else {
            if (C58096Mr6.X8 == null) {
                synchronized (IVEEncodingSetting.class) {
                    if (C58096Mr6.X8 == null) {
                        C58096Mr6.X8 = new VEEncodingImpl();
                    }
                }
            }
            iVEEncodingSetting = C58096Mr6.X8;
        }
        InterfaceC153045zY interfaceC153045zY3 = c135315St.LJIIIZ;
        o.LJIIIIZZ(interfaceC153045zY3, "presenter.mVEEditor");
        interfaceC153045zY2.LLF(outputFile2, null, iVEEncodingSetting.LIZ(videoPublishEditModel, synthetiseResult, interfaceC153045zY3), new C43214Gxe(this, activityC45651qj, videoPublishEditModel));
    }

    public final void LIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr;
        try {
            try {
                bArr = new byte[4096];
            } catch (Exception unused) {
                this.LIZIZ.getClass();
                C43199GxP.LIZ(videoPublishEditModel);
            }
            if (outputStream != null) {
                long j2 = 0;
                while (true) {
                    if (this.LIZ) {
                        break;
                    }
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        this.LIZIZ.LIZIZ(activity, videoPublishEditModel);
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j2 += read;
                    C43199GxP c43199GxP = this.LIZIZ;
                    c43199GxP.getClass();
                    new Handler().post(new RunnableC43200GxQ(((((float) j2) / ((float) j)) * 100) + 80, c43199GxP, videoPublishEditModel));
                }
                if (!this.LIZ) {
                    outputStream.flush();
                }
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to copy input:");
            LIZ.append(inputStream);
            LIZ.append("output:");
            LIZ.append(outputStream);
            throw new IOException(X1D.LIZIZ(LIZ));
        } finally {
            C00T.LIZ(inputStream);
            C00T.LIZIZ(outputStream);
        }
    }
}
