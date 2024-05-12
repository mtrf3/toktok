package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BLo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28632BLo implements C44 {
    public final /* synthetic */ HashtagAudienceDialog LIZ;

    public C28632BLo(HashtagAudienceDialog hashtagAudienceDialog) {
        this.LIZ = hashtagAudienceDialog;
    }

    @Override // X.C44
    public final void onFailed(Throwable e) {
        o.LJIIIZ(e, "e");
        C0NB.LJ("HashtagAudienceDialog", "query Live permission failed");
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        this.LIZ.LJLJJLL = C29306Beo.LJJIFFI(bool);
        HashtagAudienceDialog hashtagAudienceDialog = this.LIZ;
        if (hashtagAudienceDialog.LJLJJLL) {
            View _$_findCachedViewById = hashtagAudienceDialog._$_findCachedViewById(R.id.kd3);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(_$_findCachedViewById, hashtagAudienceDialog, 73), _$_findCachedViewById);
            }
            HashtagAudienceDialog hashtagAudienceDialog2 = this.LIZ;
            ImageView imageView = (ImageView) hashtagAudienceDialog2._$_findCachedViewById(R.id.kd4);
            if (imageView != null) {
                imageView.setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS40S0200000_5(imageView, hashtagAudienceDialog2, 73), imageView);
            }
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_live_entrance_show")) {
                C70657RoD.LJJI(0.01d, C28633BLp.LJLIL);
            }
        }
    }
}
