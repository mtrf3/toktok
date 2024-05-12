package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.H2m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43424H2m implements H3S {
    public final /* synthetic */ C43423H2l LIZ;
    public final /* synthetic */ VideoPublishEditModel LIZIZ;
    public final /* synthetic */ UploadVideoConfig LIZJ;

    @Override // X.H3S
    public final String LIZ() {
        String LIZ = C43147GwZ.LIZ(this.LIZIZ);
        this.LIZIZ.metadataMap = null;
        return LIZ;
    }

    @Override // X.H3S
    public final int LIZIZ() {
        UploadVideoConfig uploadVideoConfig = this.LIZJ;
        if (uploadVideoConfig == null) {
            return -1;
        }
        return b.LIZIZ(uploadVideoConfig, "ConcurrentUpload");
    }

    @Override // X.H3S
    public final void LIZJ(int i) {
        if (i == 1003) {
            ((C43353Gzt) this.LIZ.LJIJJLI.getValue()).LIZJ();
        }
    }

    public C43424H2m(C43423H2l c43423H2l, VideoPublishEditModel videoPublishEditModel, UploadVideoConfig uploadVideoConfig) {
        this.LIZ = c43423H2l;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = uploadVideoConfig;
    }

    @Override // X.H3S
    public final void LIZLLL(int i, long j, C43340Gzg c43340Gzg) {
        C43336Gzc c43336Gzc;
        int i2;
        int i3;
        H30 h30 = this.LIZ.LJIL;
        if (h30 != null) {
            h30.LIZLLL = System.currentTimeMillis();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        c43340Gzg.LJFF = -39993L;
                        C43423H2l c43423H2l = this.LIZ;
                        H3U h3u = c43423H2l.LJJI;
                        if (h3u == null) {
                            C67996QmO c67996QmO = c43423H2l.LJFF;
                            if (c67996QmO != null) {
                                c67996QmO.LIZIZ(new H3O("WaveUploadVideoTask"), EnumC43531H6p.OUTER);
                            } else {
                                o.LJIJI("nodeCallback");
                                throw null;
                            }
                        } else {
                            h3u.LIZ(new C41767GaJ(c43340Gzg, null, 2, null));
                        }
                        this.LIZ.LJIIJJI();
                        return;
                    }
                    C67996QmO c67996QmO2 = this.LIZ.LJFF;
                    if (c67996QmO2 != null) {
                        c67996QmO2.LIZIZ(new C41855Gbj(((float) j) / 100.0f), EnumC43531H6p.OUTER);
                        try {
                            C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
                            C41777GaT.LIZ();
                            return;
                        } catch (C43466H4c e) {
                            this.LIZ.LJIILLIIL(new C41767GaJ(C43339Gzf.LIZ(-88888888), e));
                            return;
                        }
                    }
                    o.LJIJI("nodeCallback");
                    throw null;
                }
                this.LIZ.LJIILLIIL(new C41767GaJ(c43340Gzg, null, 2, null));
                XFL xfl = this.LIZ.LJIIIIZZ;
                if (xfl == null) {
                    return;
                }
                xfl.LIZIZ();
                return;
            }
            C43423H2l c43423H2l2 = this.LIZ;
            long j2 = -1;
            if (c43423H2l2.LJJ) {
                File file = new File(this.LIZIZ.mOutputFile);
                if (file.exists()) {
                    j2 = file.length();
                }
                c43336Gzc = new C43336Gzc(0L, 0L, -1L, -1L, j2, 32);
            } else {
                C44428Hc8 LIZ = ((C43353Gzt) c43423H2l2.LJIJJLI.getValue()).LIZ();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long LIZIZ = LIZ.LIZIZ(timeUnit);
                long LIZIZ2 = this.LIZ.LJIILL().LIZ().LIZIZ(timeUnit);
                C43423H2l c43423H2l3 = this.LIZ;
                long j3 = c43423H2l3.LJIIZILJ;
                long j4 = c43423H2l3.LJIJ;
                XFL xfl2 = c43423H2l3.LJIIIIZZ;
                if (xfl2 != null) {
                    if (xfl2.LJII) {
                        j2 = xfl2.LJIILL.length();
                    }
                } else {
                    j2 = 0;
                }
                c43336Gzc = new C43336Gzc(LIZIZ, LIZIZ2, j3, j4, j2, 32);
            }
            C43423H2l c43423H2l4 = this.LIZ;
            try {
                String str = c43340Gzg.LJII;
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject(str);
                i3 = JSONObjectProtectorUtils.getInt(jSONObject, "width");
                try {
                    i2 = JSONObjectProtectorUtils.getInt(jSONObject, "height");
                } catch (JSONException unused) {
                    i2 = 0;
                }
            } catch (JSONException unused2) {
                i2 = 0;
                i3 = 0;
            }
            VideoCreation videoCreation = new VideoCreation();
            videoCreation.setMaterialId(c43340Gzg.LIZ);
            videoCreation.setCoverUri(c43340Gzg.LIZIZ);
            videoCreation.setVideoWidth(i3);
            videoCreation.setVideoHeight(i2);
            o.LJIIIIZZ(videoCreation, "VideoCreation().setMater…tVideoHeight(videoHeight)");
            C67996QmO c67996QmO3 = c43423H2l4.LJFF;
            if (c67996QmO3 != null) {
                c67996QmO3.LJ(new C43335Gzb(videoCreation, c43336Gzc), false);
                c43423H2l4.LJIIJJI();
                C43157Gwj.LJII(this.LIZIZ, this.LIZ.LJJ);
                XFL xfl3 = this.LIZ.LJIIIIZZ;
                if (xfl3 == null) {
                    return;
                }
                xfl3.LJIJJLI = false;
                xfl3.LJIIIZ(true);
                return;
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
        o.LJIJI("timeoutMonitor");
        throw null;
    }

    @Override // X.H3S
    public final void onLog(int i, int i2, String str) {
        C67996QmO c67996QmO = this.LIZ.LJFF;
        if (c67996QmO != null) {
            if (str == null) {
                str = "";
            }
            c67996QmO.LIZIZ(new H3T(i, i2, str), EnumC43531H6p.OUTER);
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
