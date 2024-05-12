package com.ss.android.ugc.aweme.shortvideo.model;

import X.C8BS;
import X.FGR;
import com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class MusicListModel extends C8BS<MusicList> {
    @Override // X.C8BS
    public boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.C8BS
    public boolean sendRequest(Object... objArr) {
        FGR.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: com.ss.android.ugc.aweme.shortvideo.model.MusicListModel.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                return MusicChoicesApi.LIZ();
            }
        }, 0);
        return true;
    }
}
