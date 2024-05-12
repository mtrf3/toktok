package X;

import android.content.Context;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CP0 implements CP2 {
    public final /* synthetic */ LiveWallPaperPreviewActivity LIZ;

    public CP0(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.LIZ = liveWallPaperPreviewActivity;
    }

    @Override // X.CP2
    public final void LIZ(String str, boolean z) {
        String str2 = "";
        if (z) {
            Context applicationContext = this.LIZ.getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            C5S1 c5s1 = new C5S1(applicationContext);
            c5s1.LIZJ(R.string.tu8);
            c5s1.LJ();
            C62011OVj.LJIIIIZZ(0, "");
            this.LIZ.finish();
        } else {
            C62011OVj.LJIIIIZZ(1, str);
        }
        LiveWallPaperBean liveWallPaperBean = this.LIZ.LJLJI;
        if (liveWallPaperBean != null) {
            str2 = liveWallPaperBean.getId();
        }
        C62011OVj.LJIIJ(str2, this.LIZ.LJLJL, str, z);
    }
}
