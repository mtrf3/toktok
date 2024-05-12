package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import org.json.JSONObject;

/* renamed from: X.Hd7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44489Hd7 implements InterfaceC134045Nw {
    public final /* synthetic */ H4P LIZ;
    public final /* synthetic */ C133765Mu LIZIZ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        H4P h4p = this.LIZ;
        HOW how = h4p.LIZLLL;
        if (how != null) {
            how.reset();
        }
        WaterMarkBuilder waterMarkBuilder = h4p.LIZ;
        WaterMarkListener waterMarkListener = waterMarkBuilder.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onSuccess(waterMarkBuilder.outPath);
        }
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C43882HKc.LIZLLL(0, "aweme_download_synthesis_error_rate", null, true);
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "download_video");
                FMX.LJIIL("add_watermark", c145995oB.LIZ);
            }
        } catch (Exception unused) {
        }
        C10K.LIZJ(new ACallableS110S0100000_7(this.LIZIZ, 43));
        this.LIZ.getClass();
        H4P.LJI("add effect watermark success");
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        C1I0.LIZIZ().LJFF("effect-watermark", new C44491Hd9(f));
        WaterMarkListener waterMarkListener = this.LIZ.LJ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onProgress((int) (f * 100));
        }
    }

    public C44489Hd7(H4P h4p, C133765Mu c133765Mu) {
        this.LIZ = h4p;
        this.LIZIZ = c133765Mu;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        String str2;
        H4P h4p = this.LIZ;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        h4p.getClass();
        HOW how = h4p.LIZLLL;
        if (how != null) {
            how.reset();
        }
        WaterMarkListener waterMarkListener = h4p.LIZ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(i2);
        }
        if (!h4p.LIZJ) {
            h4p.LIZJ = true;
            C135335Sv.LIZ("mTmpPath", h4p.LIZ.inputPath);
            C135335Sv.LIZ("mOutPath", h4p.LIZ.outPath);
            C170666ms.LIZJ(new Exception(KMP.LJ("WaterMarkComposer ret: ", i)));
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    C43882HKc.LIZLLL(1, "aweme_download_synthesis_error_rate", null, true);
                }
            } catch (Exception unused) {
            }
            try {
                JSONObject jSONObject = new JSONObject();
                C48387Iyt c48387Iyt = C48136Iuq.LIZ;
                jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
                jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
                jSONObject.put("ret", i);
                jSONObject.put("ext", i2);
                jSONObject.put("msg", str2);
                C43882HKc.LIZ.LJIILLIIL("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        H4P h4p2 = this.LIZ;
        StringBuilder LIZJ = C06460Ne.LIZJ("compile effect watermark video failed, reason: (error=", i, ", ext=", i2, ", f=");
        LIZJ.append(f);
        LIZJ.append(", msg=");
        LIZJ.append(str);
        LIZJ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZJ);
        h4p2.getClass();
        H4P.LJI(LIZIZ);
    }
}
