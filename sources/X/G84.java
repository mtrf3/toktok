package X;

import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final /* synthetic */ class G84 implements G69 {
    public final /* synthetic */ VideoPublishContainerScene LIZ;

    public /* synthetic */ G84(VideoPublishContainerScene videoPublishContainerScene) {
        this.LIZ = videoPublishContainerScene;
    }

    @Override // X.G69
    public final boolean LIZ(View view) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZ;
        videoPublishContainerScene.getClass();
        final C013603o c013603o = (C013603o) view;
        if (((C40990G6w) videoPublishContainerScene.LLILLJJLI.LIZ).LIZ.getSaveUploadType() != 1 && !C78605Ut7.LJFF("android.permission.WRITE_EXTERNAL_STORAGE")) {
            ActivityC45651qj LLJLL = videoPublishContainerScene.LLJLL();
            HPI hpi = new HPI() { // from class: X.G85
                @Override // X.HPI
                public final void LIZ(int[] iArr, String[] strArr) {
                    C013603o c013603o2 = C013603o.this;
                    if (iArr == null) {
                        return;
                    }
                    for (int i : iArr) {
                        if (i != 0) {
                            return;
                        }
                    }
                    c013603o2.toggle();
                }
            };
            TokenCert cert = TokenCert.with("bpea-tools_request_storage_permission_publish_save");
            o.LJIIIZ(cert, "cert");
            HVR.LJII(LLJLL, hpi, null, cert, 28);
            return false;
        }
        return true;
    }
}
