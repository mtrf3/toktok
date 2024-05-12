package X;

import android.view.View;
import com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BLe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28622BLe implements VTX {
    public final /* synthetic */ C56K LIZ;
    public final /* synthetic */ HashtagAudienceDialog LIZIZ;

    public C28622BLe(C56K c56k, HashtagAudienceDialog hashtagAudienceDialog) {
        this.LIZ = c56k;
        this.LIZIZ = hashtagAudienceDialog;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        this.LIZ.element = Math.abs(i / ((C80217Ve1) this.LIZIZ._$_findCachedViewById(R.id.a6s)).getTotalScrollRange());
        float f = this.LIZ.element;
        HashtagAudienceDialog hashtagAudienceDialog = this.LIZIZ;
        if (f > hashtagAudienceDialog.LJLJLLL) {
            View _$_findCachedViewById = hashtagAudienceDialog._$_findCachedViewById(R.id.l_2);
            if (_$_findCachedViewById != null) {
                float f2 = this.LIZ.element;
                float f3 = this.LIZIZ.LJLJLLL;
                _$_findCachedViewById.setAlpha(Math.min(((1.0f - ((1.0f - f2) * ((1.0f - f2) * (1.0f - f2)))) - f3) / (1 - f3), 1.0f));
            }
        } else {
            View _$_findCachedViewById2 = hashtagAudienceDialog._$_findCachedViewById(R.id.l_2);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setAlpha(0.0f);
            }
        }
        float f4 = this.LIZ.element;
        HashtagAudienceDialog hashtagAudienceDialog2 = this.LIZIZ;
        if (f4 > hashtagAudienceDialog2.LJLJLJ) {
            View _$_findCachedViewById3 = hashtagAudienceDialog2._$_findCachedViewById(R.id.kd4);
            float f5 = this.LIZ.element;
            float f6 = this.LIZIZ.LJLJLJ;
            _$_findCachedViewById3.setAlpha(Math.min((f5 - f6) / (1 - f6), 1.0f));
            return;
        }
        hashtagAudienceDialog2._$_findCachedViewById(R.id.kd4).setAlpha(0.0f);
    }
}
