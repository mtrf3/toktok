package com.ss.android.ugc.aweme.services.external.ability;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public interface IVideo2StickerService {

    /* loaded from: classes8.dex */
    public interface Callback {
        void onFailed(Exception exc, String str, int i);

        void onSuccess();
    }

    void video2StickerEdit(Activity activity, Aweme aweme, Callback callback);

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void video2StickerEdit$default(IVideo2StickerService iVideo2StickerService, Activity activity, Aweme aweme, Callback callback, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    callback = null;
                }
                iVideo2StickerService.video2StickerEdit(activity, aweme, callback);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: video2StickerEdit");
        }
    }
}
