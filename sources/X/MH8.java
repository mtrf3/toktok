package X;

import Y.ACListenerS44S0200000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MH8 extends C220538l7 {
    public final InterfaceC56540MGy LLFII;
    public NewFaceStickerBean LLFZ;

    @Override // X.AbstractC208618Gr
    public final boolean L() {
        if (((Boolean) C53050Kru.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return super.L();
    }

    @Override // X.AbstractC208468Gc
    public final boolean N() {
        return ((Boolean) C52989Kqv.LIZ.getValue()).booleanValue();
    }

    public MH8(View view, String str, MH9 mh9, InterfaceC56540MGy interfaceC56540MGy) {
        super(view, str, mh9);
        this.LLFII = interfaceC56540MGy;
        C16880lQ.LJJIJLIJ(this.LJLILLLLZI, new ACListenerS44S0200000_9(this, mh9, 44));
    }

    @Override // X.C220538l7
    public final void a0(Aweme aweme, int i, boolean z, Bundle bundle) {
        boolean z2;
        NewFaceStickerBean newFaceStickerBean;
        NewFaceStickerBean newFaceStickerBean2;
        super.a0(aweme, i, z, bundle);
        C38449F7d.LJFF().getClass();
        if (C00F.LIZ(31744, 0, "prop_show_like_num", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && aweme.getStatistics() != null) {
            this.LJZI.setVisibility(0);
            this.LJZL.setVisibility(8);
            this.LL.setVisibility(8);
            this.LJZI.setText(C77123UOp.LJJIIJ(aweme.getStatistics().getDiggCount()));
            this.LJZI.setContentDescription("");
        }
        InterfaceC56540MGy interfaceC56540MGy = this.LLFII;
        if (interfaceC56540MGy != null) {
            this.LLFZ = interfaceC56540MGy.get();
        }
        if (C53378KxC.LIZIZ() && aweme.getDetailPageVideoTag() == Aweme.VideoTag.FEATURED_VIDEO) {
            this.LJLLL.setText(R.string.pdj);
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amo);
            this.LJLLL.setTextColorRes(R.attr.dj);
            return;
        }
        if (aweme.getDetailPageVideoTag() == Aweme.VideoTag.FRIENDS_VIDEO) {
            this.LJLLL.setText(R.string.e0d);
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amp);
            this.LJLLL.setTextColorRes(R.attr.d4);
            this.LLFZ.isFriendVideoPresent = true;
            String aid = aweme.getAid();
            int followStatus = aweme.getFollowStatus();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "prop_page");
            c188727au.LIZLLL(followStatus, "follow_status");
            c188727au.LIZLLL(i + 1, "order");
            c188727au.LJIIIZ("group_id", aid);
            FMX.LJIIL("friend_tag_show", c188727au.LIZ);
            return;
        }
        if (aweme.getDetailPageVideoTag() == Aweme.VideoTag.FOLLOWERS_VIDEO) {
            this.LJLLL.setText(R.string.e0c);
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amp);
            this.LJLLL.setTextColorRes(R.attr.d4);
            this.LLFZ.isFollowerVideoPresent = true;
            String aid2 = aweme.getAid();
            int followStatus2 = aweme.getFollowStatus();
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "prop_page");
            c188727au2.LIZLLL(followStatus2, "follow_status");
            c188727au2.LIZLLL(i + 1, "order");
            c188727au2.LJIIIZ("group_id", aid2);
            FMX.LJIIL("following_tag_show", c188727au2.LIZ);
            return;
        }
        if (!C53378KxC.LIZIZ() && aweme.isEffectDesigner()) {
            InterfaceC56540MGy interfaceC56540MGy2 = this.LLFII;
            if (interfaceC56540MGy2 == null || (newFaceStickerBean2 = interfaceC56540MGy2.get()) == null) {
                return;
            }
            this.LJLLL.setText(C16880lQ.LLLZ(this.itemView.getContext().getString(R.string.pi9), new Object[]{newFaceStickerBean2.ownerName}));
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amo);
            this.LJLLL.setTextColorRes(R.attr.dj);
            return;
        }
        if (!C53378KxC.LIZIZ() && aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                return;
            }
            this.LJLLILLLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
            C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
            return;
        }
        if ((!C53378KxC.LIZIZ() || ((newFaceStickerBean = this.LLFZ) != null && newFaceStickerBean.commerceSticker != null)) && aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null) {
            if (aweme.getIsTop() != 1) {
                return;
            }
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.LJLLILLLL.setVisibility(0);
                this.LJLLI.setVisibility(8);
                C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                return;
            } else {
                this.LJLLILLLL.setVisibility(8);
                this.LJLLI.setVisibility(0);
                C78765Uvh.LJI(this.LJLLI, aweme.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                return;
            }
        }
        if (!C53378KxC.LIZIZ() && aweme.getIsTop() == 1) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.LJLLILLLL.setVisibility(0);
                this.LJLLI.setVisibility(8);
                C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                return;
            }
            this.LJLLILLLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
            AwemeTextLabelModel awemeTextLabelModel = new AwemeTextLabelModel();
            awemeTextLabelModel.setTextColor("#FFFFFF");
            awemeTextLabelModel.setLabelType(8);
            awemeTextLabelModel.setBgColor("#FE2C55");
            awemeTextLabelModel.setShowSeconds(0.0f);
            awemeTextLabelModel.setLabelName(this.LJLJLJ.getResources().getString(R.string.j8g));
            C220538l7.h0(this.LJLLILLLL, awemeTextLabelModel);
            return;
        }
        if (C53378KxC.LIZIZ() || aweme.getOriginAuthor() == null) {
            return;
        }
        this.LJLLJ.setVisibility(0);
        if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
            this.LJLLJ.setText(aweme.getLabelOriginAuthorText());
        }
        this.LJLLI.setVisibility(4);
    }
}
