package X;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UuR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78687UuR implements InterfaceC37126Ehe, InterfaceC71452S2m, InterfaceC46111I7v {
    public static final C78687UuR LJLIL = new C78687UuR();

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        TTLSPreInitBusinessHelper.preInitLiveCore(RunnableC30505By9.LJLIL);
    }

    public static final List LIZLLL(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : videoList) {
            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
            String videoPath = editVideoSegment.getVideoPath();
            c43117Gw5.getClass();
            if (!C43117Gw5.LJIIIZ(videoPath)) {
                arrayList.add(editVideoSegment);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC71452S2m
    public TuxIconView LIZIZ(Object obj) {
        View containerView = (View) obj;
        o.LJIIIZ(containerView, "containerView");
        View findViewById = containerView.findViewById(R.id.cm4);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…mmercelive_btn_buy_arrow)");
        return (TuxIconView) findViewById;
    }

    public static int LIZJ(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            int[] iArr = new int[1];
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Fail to compile shader");
                LIZ.append(GLES20.glGetShaderInfoLog(glCreateShader));
                C48284IxE.LIZ(6, -1, "ShaderHelper", X1D.LIZIZ(LIZ));
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
            return glCreateShader;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EGL Error: ");
        LIZ2.append(GLUtils.getEGLErrorString(GLES20.glGetError()));
        C48284IxE.LIZ(6, -1, "ShaderHelper", X1D.LIZIZ(LIZ2));
        return glCreateShader;
    }

    @Override // X.InterfaceC37126Ehe
    public void onSuccess(String str, boolean z) {
        C38429F6j.LIZ(0);
    }

    @Override // X.InterfaceC37126Ehe
    public void onFailed(String str, boolean z, int i) {
        C38429F6j.LIZ(i);
    }
}
