package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHT implements OnActivityResultCallback {
    public final /* synthetic */ DesignerStickerDetailAwemeListFragment LJLIL;

    public MHT(DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment) {
        this.LJLIL = designerStickerDetailAwemeListFragment;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle LLJJIJI;
        Aweme aweme = null;
        if (i2 != -1) {
            if (i2 != 400) {
                return;
            }
            DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment = this.LJLIL;
            MHZ mhz = designerStickerDetailAwemeListFragment.LLJ;
            if (mhz != null) {
                mhz.F0(designerStickerDetailAwemeListFragment.getView());
                return;
            } else {
                o.LJIJI("startRecordingListener");
                throw null;
            }
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIIZZ(R.string.fs7);
        c26045AKb.LJIIJ();
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment2 = this.LJLIL;
        if (intent != null && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "extra_related_item");
            o.LJII(LLJJIII, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            aweme = (Aweme) LLJJIII;
        }
        designerStickerDetailAwemeListFragment2.LLILLL = aweme;
        AV1.LIZIZ().setIsFeatureVideoChanged(Boolean.TRUE);
        DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment3 = this.LJLIL;
        designerStickerDetailAwemeListFragment3.LLIZ = 1;
        designerStickerDetailAwemeListFragment3.J4(true, false);
    }
}
