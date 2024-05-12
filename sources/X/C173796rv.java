package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173796rv implements InterfaceC82937Wgn {
    public final InterfaceC83727WtX LIZ;
    public final InterfaceC82086WJm LIZIZ;
    public final ShortVideoContext LIZJ;
    public final InterfaceC139745e6<List<String>> LIZLLL;

    @Override // X.InterfaceC82937Wgn
    public final void LIZ(String str) {
        this.LIZIZ.o30(str);
    }

    @Override // X.InterfaceC82937Wgn
    public final void LIZIZ(C29S context, Effect effect) {
        o.LJIIIZ(context, "context");
        if (effect != null) {
            o.LJIIIIZZ(this.LIZJ.creativeInfo, "shortVideoContext.creativeInfo");
            List<String> list = this.LIZLLL.get();
            o.LJIIIIZZ(list, "urlPrefix.get()");
            List<String> list2 = list;
            if (!list2.isEmpty()) {
                String LIZJ = C173786ru.LIZJ(effect.getEffectId());
                if (!C1B6.LIZIZ(LIZJ)) {
                    if (!TextUtils.isEmpty(effect.getExtra())) {
                        try {
                            final String optString = new JSONObject(effect.getExtra()).optString("watermark_for_captured_image");
                            if (optString != null && optString.length() != 0) {
                                StringBuilder LIZ = X1D.LIZ();
                                String LJFF = JBR.LJFF(LIZ, (String) ListProtector.get(list2, 0), optString, LIZ);
                                DownloadTask with = C84261X5d.with(context);
                                with.url(LJFF);
                                with.ignoreDataVerify(true);
                                with.savePath(C173786ru.LIZIZ());
                                with.name(new File(LIZJ).getName());
                                with.subThreadListener(new AbstractC167316hT() { // from class: X.6hN
                                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onSuccessed(DownloadInfo downloadInfo) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("uri", optString);
                                        C43882HKc.LIZLLL(0, "effect_watermark_download_rate", jSONObject, true);
                                    }

                                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                        String str;
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("uri", optString);
                                        if (baseException != null) {
                                            str = baseException.getErrorMessage();
                                        } else {
                                            str = null;
                                        }
                                        jSONObject.put("exception", str);
                                        C43882HKc.LIZLLL(1, "effect_watermark_download_rate", jSONObject, true);
                                    }
                                });
                                with.download();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("extra cannot be null: stickerId");
                    LIZ2.append(effect.getId());
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
                return;
            }
            throw new IllegalArgumentException("url prefix cannot be empty");
        }
    }

    @Override // X.InterfaceC82937Wgn
    public final void LIZJ(final String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CreativeInfo creativeInfo = this.LIZJ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        try {
            if (C44687HgJ.LJII(new File(C173786ru.LIZ(creativeInfo))) >= 10) {
                return;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        CreativeInfo creativeInfo2 = this.LIZJ.creativeInfo;
        o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
        String LIZ = C173786ru.LIZ(creativeInfo2);
        HCA LJII = this.LIZJ.LJII();
        if (LJII != null) {
            str2 = LJII.segmentBeginTime;
        } else {
            str2 = null;
        }
        final String LIZ2 = new C1294456e(LIZ, str2, str).LIZ();
        this.LIZIZ.Hl(new File(LIZ2).getParentFile().getPath(), LIZ2, z);
        C10K.LIZIZ(new Callable() { // from class: X.6rx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmap;
                int i;
                VEFrame ea = C173796rv.this.LIZ.ea(str);
                if (ea != null) {
                    bitmap = ea.toBitmap();
                } else {
                    bitmap = null;
                }
                C42299Git.LJFF(bitmap, new File(LIZ2), 100, Bitmap.CompressFormat.PNG);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("save bitmap into file:");
                LIZ3.append(LIZ2);
                LIZ3.append(",width:");
                int i2 = -1;
                if (bitmap != null) {
                    i = bitmap.getWidth();
                } else {
                    i = -1;
                }
                LIZ3.append(i);
                LIZ3.append(",height:");
                if (bitmap != null) {
                    i2 = bitmap.getHeight();
                }
                LIZ3.append(i2);
                return Integer.valueOf(android.util.Log.d("save_photo", X1D.LIZIZ(LIZ3)));
            }
        }, C10K.LJI, null);
    }

    public C173796rv(InterfaceC83727WtX effectProcessor, InterfaceC82086WJm cameraApi, ShortVideoContext shortVideoContext, C44445HcP c44445HcP) {
        o.LJIIIZ(effectProcessor, "effectProcessor");
        o.LJIIIZ(cameraApi, "cameraApi");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = effectProcessor;
        this.LIZIZ = cameraApi;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = c44445HcP;
    }
}
