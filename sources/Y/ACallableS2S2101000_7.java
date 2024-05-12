package Y;

import X.C76800UCe;
import X.H7B;
import X.HRJ;
import X.JBR;
import X.P5A;
import X.X1D;
import X.X5R;
import Y.ARunnableS9S0201000_6;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ACallableS2S2101000_7 implements Callable {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS2S2101000_7 aCallableS2S2101000_7) {
        String str = aCallableS2S2101000_7.s0;
        int i = aCallableS2S2101000_7.i3;
        final String str2 = aCallableS2S2101000_7.s1;
        final IEffectService.OnVideoCoverCallback onVideoCoverCallback = (IEffectService.OnVideoCoverCallback) aCallableS2S2101000_7.l2;
        if (VEUtils.getVideoFrames2(str, new int[]{i}, 256, -1, false, new P5A() { // from class: X.GhH
            @Override // X.P5A
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                String str3 = str2;
                IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                if (!TextUtils.isEmpty(str3)) {
                    C42299Git.LJFF(createBitmap, new File(str3), 60, Bitmap.CompressFormat.PNG);
                }
                HRJ.LIZ(new ARunnableS9S0201000_6(2, onVideoCoverCallback2, createBitmap, 4));
                return true;
            }
        }) != 0) {
            HRJ.LIZ(new ARunnableS9S0101000_5(4, onVideoCoverCallback, 6));
            return null;
        }
        return null;
    }

    public static final Object call$1(ACallableS2S2101000_7 aCallableS2S2101000_7) {
        String str;
        FeedCaptionView feedCaptionView = (FeedCaptionView) aCallableS2S2101000_7.l2;
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(aCallableS2S2101000_7.s0);
        String str2 = FeedCaptionView.LLILIL;
        if (str2 == null) {
            str2 = (String) FeedCaptionView.LLILL.getValue();
        }
        with.LJ = str2;
        StringBuilder LIZ = X1D.LIZ();
        Aweme aweme = ((FeedCaptionView) aCallableS2S2101000_7.l2).LJLLI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('_');
        with.LIZJ = JBR.LJFF(LIZ, aCallableS2S2101000_7.s1, ".json", LIZ);
        with.LJII = aCallableS2S2101000_7.i3;
        with.LJJI = true;
        with.LJIIJJI = ((FeedCaptionView) aCallableS2S2101000_7.l2).LLI;
        feedCaptionView.LJZ = with.LIZJ();
        ((FeedCaptionView) aCallableS2S2101000_7.l2).LJZI = aCallableS2S2101000_7.s0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FeedCaptionView start download caption,downloadId: ");
        LIZ2.append(((FeedCaptionView) aCallableS2S2101000_7.l2).LJZ);
        LIZ2.append(" downloadUrl: ");
        LIZ2.append(((FeedCaptionView) aCallableS2S2101000_7.l2).LJZI);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        return C76800UCe.LIZ;
    }

    public ACallableS2S2101000_7(int i, Object obj, String str, String str2, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
        this.l2 = obj;
    }
}
