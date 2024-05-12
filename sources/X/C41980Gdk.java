package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.external.ui.IPublishPageService;
import com.ss.android.ugc.aweme.services.external.ui.PublishConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Gdk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41980Gdk implements IPublishPageService {
    public final /* synthetic */ HCH LIZ;

    public C41980Gdk(HCH hch) {
        this.LIZ = hch;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IPublishPageService
    public final void startPublish(Activity activity, PublishConfig publishConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(publishConfig, "publishConfig");
        ((C41981Gdl) this.LIZ.LIZ.getValue()).refreshData();
        Intent intent = new Intent();
        intent.setClass(activity, VideoPublishActivity.class);
        intent.putExtra("shoot_way", publishConfig.getShootway());
        C77412UZs.LJJIJIL(intent, new CreativeInfo(publishConfig.getCreationId(), 0, null, 6, null));
        String musicId = publishConfig.getMusicId();
        if (musicId != null) {
            intent.putExtra("id", musicId);
        }
        if (TextUtils.isEmpty(publishConfig.getChallenge())) {
            if (C41030G8k.LIZ()) {
                C42662Gok.LIZJ(activity, C16880lQ.LLJJIJI(intent), null);
            } else {
                C16880lQ.LIZIZ(activity, intent);
            }
            activity.finish();
            return;
        }
        String challenge = publishConfig.getChallenge();
        ((HBO) C44172HVg.LIZLLL).LIZ(challenge, new C41979Gdj(activity, intent));
    }
}
