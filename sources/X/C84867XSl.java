package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XSl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84867XSl implements IAVInfoService.IGetInfoCallback<Integer> {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C84859XSd LIZJ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Integer num) {
        if (num.intValue() == 0) {
            C84859XSd c84859XSd = this.LIZJ;
            String localPath = this.LIZ.getLocalPath();
            c84859XSd.LJ(this.LIZ, localPath, C84859XSd.LIZIZ(this.LIZIZ, this.LIZJ.LIZIZ));
            return;
        }
        Activity LJJIZ = this.LIZJ.LIZ.LJJIZ();
        if (LJJIZ == null) {
            return;
        }
        C5S1 c5s1 = new C5S1(LJJIZ);
        c5s1.LIZJ(R.string.hvu);
        c5s1.LJ();
    }

    public C84867XSl(C84880XSy c84880XSy, MusicModel musicModel, int i) {
        this.LIZJ = c84880XSy;
        this.LIZ = musicModel;
        this.LIZIZ = i;
    }
}
