package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.56R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56R implements C56Q {
    public final VideoPublishEditModel LIZ;
    public final List<String> LIZIZ = new ArrayList();

    public final String LIZIZ() {
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append(".wav");
        String LJ = LIZIZ.LJ(videoPublishEditModel, X1D.LIZIZ(LIZ));
        ((ArrayList) this.LIZIZ).add(LJ);
        return LJ;
    }

    public C56R(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.C56Q
    public final String LIZ(String str) {
        String LJ = C5YW.LIZIZ().LJ(this.LIZ, "");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append("editorPro_record_");
        LIZ.append(str);
        LIZ.append('_');
        LIZ.append(System.currentTimeMillis());
        LIZ.append(".wav");
        String LIZIZ = X1D.LIZIZ(LIZ);
        ((ArrayList) this.LIZIZ).add(LIZIZ);
        return LIZIZ;
    }
}
