package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubsPrivilegeDetailAboutMeSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CDh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30965CDh extends AbstractC30971CDn {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LIZ;

    public C30965CDh(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LIZ = subscriptionPrivilegeDetailFragment;
    }

    @Override // X.AbstractC30971CDn
    public final void LIZ(View view, float f) {
        if (this.LIZ._$_findCachedViewById(R.id.j83) == null) {
            return;
        }
        float max = (1 - Math.max(f, 0.0f)) * this.LIZ._$_findCachedViewById(R.id.j83).getMeasuredHeight();
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LIZ;
        float f2 = (subscriptionPrivilegeDetailFragment.LJLJI - subscriptionPrivilegeDetailFragment.LJLJJI) * max;
        View _$_findCachedViewById = subscriptionPrivilegeDetailFragment._$_findCachedViewById(R.id.fml);
        if (_$_findCachedViewById != null) {
            C29306Beo.LJJJJJL((int) f2, _$_findCachedViewById);
        }
        this.LIZ.vl();
    }

    @Override // X.AbstractC30971CDn
    public final void LIZIZ(int i, View view) {
        if (i != 1 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    this.LIZ.dismiss();
                }
            } else {
                ImageView imageView = (ImageView) this.LIZ._$_findCachedViewById(R.id.bsg);
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.d9w);
                }
            }
        } else {
            ImageView imageView2 = (ImageView) this.LIZ._$_findCachedViewById(R.id.bsg);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.d9v);
            }
        }
        if (LiveSubsPrivilegeDetailAboutMeSetting.INSTANCE.enableNavigation()) {
            if (i == 3) {
                View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.el4);
                if (_$_findCachedViewById == null) {
                    return;
                }
                _$_findCachedViewById.setVisibility(0);
                return;
            }
            View _$_findCachedViewById2 = this.LIZ._$_findCachedViewById(R.id.el4);
            if (_$_findCachedViewById2 == null) {
                return;
            }
            _$_findCachedViewById2.setVisibility(8);
        }
    }
}
