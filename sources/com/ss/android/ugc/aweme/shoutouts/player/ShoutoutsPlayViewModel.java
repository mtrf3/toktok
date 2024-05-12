package com.ss.android.ugc.aweme.shoutouts.player;

import X.C268613q;
import X.C51723KRr;
import X.EnumC84256X4y;
import X.ORZ;
import X.X1D;
import X.X5R;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrder;
import java.util.List;

/* loaded from: classes9.dex */
public final class ShoutoutsPlayViewModel extends JediViewModel<ShoutoutsPlayState> {
    public final MutableLiveData<ShoutoutsOrder> LJLJJLL = new MutableLiveData<>();
    public int LJLJL = -1;
    public final C51723KRr LJLJLJ = new C51723KRr(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final ShoutoutsPlayState kv0() {
        return new ShoutoutsPlayState(0, null, 3, 0 == true ? 1 : 0);
    }

    public final void Hv0(Context context, Video video) {
        String str;
        UrlModel downloadAddr;
        List<String> urlList;
        if (video != null && (downloadAddr = video.getDownloadAddr()) != null && (urlList = downloadAddr.getUrlList()) != null) {
            str = (String) ORZ.LJLLLL(urlList);
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(h.LJIIIIZZ(str));
        LIZ.append('_');
        LIZ.append(System.currentTimeMillis());
        LIZ.append(".mp4");
        String LIZIZ = X1D.LIZIZ(LIZ);
        Uri LJFF = C268613q.LJFF(context, LIZIZ);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LJIILIIL = true;
        with.LJJ = true;
        with.LJ = LJFF.toString();
        with.LIZJ = LIZIZ;
        with.LIZIZ(this.LJLJLJ.hashCode(), this.LJLJLJ, EnumC84256X4y.SUB);
        this.LJLJL = with.LIZJ();
    }
}
