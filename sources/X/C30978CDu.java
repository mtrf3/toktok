package X;

import Y.ARunnableS24S0200000_5;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CDu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30978CDu extends C0YE {
    public final /* synthetic */ SubscriptionSettingFragmentNew LJLJI;

    public C30978CDu(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LJLJI = subscriptionSettingFragmentNew;
    }

    @Override // X.C0YE
    public final void LIZ(View view) {
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = this.LJLJI;
        subscriptionSettingFragmentNew.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_privilege_preview_share");
        subscriptionSettingFragmentNew.Tl(LIZ);
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew2 = this.LJLJI;
        C30988CEe c30988CEe = subscriptionSettingFragmentNew2.LLFII;
        if (c30988CEe == null) {
            Context context = subscriptionSettingFragmentNew2.getContext();
            if (context != null) {
                SubscriptionSettingFragmentNew subscriptionSettingFragmentNew3 = this.LJLJI;
                ConstraintLayout sub_link_share_img_root_inner = (ConstraintLayout) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.ko9);
                o.LJIIIIZZ(sub_link_share_img_root_inner, "sub_link_share_img_root_inner");
                C47061t0 link_share_img_bg_inner = (C47061t0) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.ftd);
                o.LJIIIIZZ(link_share_img_bg_inner, "link_share_img_bg_inner");
                C47061t0 link_share_img_avatar_inner = (C47061t0) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.ftb);
                o.LJIIIIZZ(link_share_img_avatar_inner, "link_share_img_avatar_inner");
                ConstraintLayout sub_link_share_img_root_outer = (ConstraintLayout) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.ko_);
                o.LJIIIIZZ(sub_link_share_img_root_outer, "sub_link_share_img_root_outer");
                C47061t0 link_share_img_bg_outer = (C47061t0) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.fte);
                o.LJIIIIZZ(link_share_img_bg_outer, "link_share_img_bg_outer");
                C47061t0 link_share_img_avatar_outer = (C47061t0) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.ftc);
                o.LJIIIIZZ(link_share_img_avatar_outer, "link_share_img_avatar_outer");
                C47061t0 link_share_img_tiktok_logo_outer = (C47061t0) subscriptionSettingFragmentNew3._$_findCachedViewById(R.id.fth);
                o.LJIIIIZZ(link_share_img_tiktok_logo_outer, "link_share_img_tiktok_logo_outer");
                C31847Ceh.LJIIIZ(sub_link_share_img_root_inner, link_share_img_bg_inner, link_share_img_avatar_inner, sub_link_share_img_root_outer, link_share_img_bg_outer, link_share_img_avatar_outer, link_share_img_tiktok_logo_outer, context, new C30982CDy(subscriptionSettingFragmentNew3));
                return;
            }
            return;
        }
        View _$_findCachedViewById = subscriptionSettingFragmentNew2._$_findCachedViewById(R.id.ev0);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.post(new ARunnableS24S0200000_5(c30988CEe, subscriptionSettingFragmentNew2, 76));
    }
}
