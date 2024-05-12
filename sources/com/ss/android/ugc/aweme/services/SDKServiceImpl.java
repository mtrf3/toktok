package com.ss.android.ugc.aweme.services;

import X.C133765Mu;
import X.C39579Fg7;
import X.C42423Gkt;
import X.C42431Gl1;
import X.C5K0;
import X.C5KA;
import X.C5KD;
import X.C60903NvH;
import X.C6QQ;
import X.C87278YNe;
import X.H7B;
import X.HOT;
import X.InterfaceC134045Nw;
import X.X1D;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.AqS10S0202000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SDKServiceImpl implements ISDKService {
    private final void splitWithNLE(int i, String str, String str2, String str3, String str4, final ISDKService.SplitCallback splitCallback) {
        final int i2;
        final int i3;
        try {
            C60903NvH.LJIIJJI().LJIJ();
            C5K0.LIZ(2);
            final C133765Mu c133765Mu = new C133765Mu(str, null, null, null, 62);
            int i4 = 0;
            C5KA.LIZ(new C5KD(new String[]{str2}), c133765Mu.LJI().LJIIJ);
            if (c133765Mu.prepare() != 0) {
                splitCallback.onFail();
            }
            if (c133765Mu.getDuration() < i) {
                splitCallback.onFail();
            }
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
            if (videoFileInfo != null) {
                i2 = videoFileInfo.width;
                i3 = videoFileInfo.height;
            } else {
                i2 = 0;
                i3 = 0;
            }
            C87278YNe c87278YNe = new C87278YNe(2);
            c87278YNe.LJIIJ(i2, i3);
            if (videoFileInfo != null) {
                i4 = videoFileInfo.fps;
            }
            c87278YNe.LJII(i4);
            VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
            o.LJIIIIZZ(LIZ, "Builder(VEVideoEncodeSet…                 .build()");
            c133765Mu.LLF(str4, str3, LIZ, new InterfaceC134045Nw() { // from class: com.ss.android.ugc.aweme.services.SDKServiceImpl$splitWithNLE$1
                @Override // X.InterfaceC134045Nw
                public void onCompileDone() {
                    C6QQ.LIZ(new AqS10S0202000_7(ISDKService.SplitCallback.this, i2, i3, c133765Mu, 1));
                }

                @Override // X.InterfaceC134045Nw
                public void onCompileProgress(float f) {
                    if (ISDKService.SplitCallback.this.checkIsCanceled()) {
                        c133765Mu.destroy();
                    }
                }

                @Override // X.InterfaceC134045Nw
                public void onCompileError(int i5, int i6, float f, String str5) {
                    C6QQ.LIZ(new AqS154S0200000_7(ISDKService.SplitCallback.this, c133765Mu, 25));
                }
            });
        } catch (VEException e) {
            splitCallback.onFail();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VEEditor compile failed, ret = ");
            LIZ2.append(e.getRetCd());
            LIZ2.append(", e: ");
            LIZ2.append(e.getMsgDes());
            H7B.LIZJ(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService
    public void split(Context context, int i, String workspace, String videoPath, String targetAudioFile, String targetVideoFile, ISDKService.SplitCallback callback) {
        boolean z;
        MediaMetadataRetriever mediaMetadataRetriever;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(workspace, "workspace");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(targetAudioFile, "targetAudioFile");
        o.LJIIIZ(targetVideoFile, "targetVideoFile");
        o.LJIIIZ(callback, "callback");
        if (C39579Fg7.LIZIZ(targetAudioFile) && C39579Fg7.LIZIZ(targetVideoFile)) {
            if (C42431Gl1.LIZ() && C42423Gkt.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(targetVideoFile);
                        callback.onSuccess(Integer.parseInt(HOT.LIZIZ(mediaMetadataRetriever)), Integer.parseInt(HOT.LIZ(mediaMetadataRetriever)));
                        mediaMetadataRetriever.release();
                        return;
                    } catch (Exception e) {
                        e = e;
                        C39579Fg7.LJIL(targetAudioFile);
                        C39579Fg7.LJIL(targetVideoFile);
                        H7B.LIZLLL(e);
                        if (!z) {
                            callback.onFail();
                        }
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        if (!z) {
                            return;
                        }
                        splitWithNLE(i, workspace, videoPath, targetAudioFile, targetVideoFile, callback);
                    }
                } catch (Throwable th) {
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                mediaMetadataRetriever = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        splitWithNLE(i, workspace, videoPath, targetAudioFile, targetVideoFile, callback);
    }
}
