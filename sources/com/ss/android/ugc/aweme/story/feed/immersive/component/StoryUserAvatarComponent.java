package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AUU;
import X.C16880lQ;
import X.C1DD;
import X.C221108m2;
import X.C4XR;
import X.C51029K0z;
import X.C62822Ol8;
import X.C8TC;
import X.L69;
import X.QD3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class StoryUserAvatarComponent extends BaseCellSlotComponent<StoryUserAvatarComponent> {
    public final C62822Ol8 LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cp4;
    }

    public StoryUserAvatarComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 972));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void onDestroyView() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        L69 l69 = (L69) this.LLFII.getValue();
        if (l69 != null) {
            String authorUid = item.getAweme().getAuthorUid();
            o.LJIIIIZZ(authorUid, "item.aweme.authorUid");
            l69.LJ(authorUid, item.getAweme().getAuthor(), this);
        }
    }

    @QD3
    public final void onQuickEmojiAniComplete(C4XR event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthorUid(), event.LJLIL)) {
            return;
        }
        AnimatorSet LIZ = C1DD.LIZ(100L);
        LIZ.setInterpolator(new LinearInterpolator());
        LIZ.playTogether(ObjectAnimator.ofFloat(Y3(), "scaleX", 1.0f, 0.6f), ObjectAnimator.ofFloat(Y3(), "scaleY", 1.0f, 0.6f));
        AnimatorSet LIZ2 = C1DD.LIZ(100L);
        LIZ2.setInterpolator(new LinearInterpolator());
        LIZ2.playTogether(ObjectAnimator.ofFloat(Y3(), "scaleX", 0.6f, 1.0f), ObjectAnimator.ofFloat(Y3(), "scaleY", 0.6f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(LIZ, LIZ2);
        animatorSet.start();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        L69 l69 = (L69) this.LLFII.getValue();
        if (l69 != null) {
            l69.LIZJ(new AUU());
        }
        View view2 = (View) this.LLFII.getValue();
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 20, 42, 42), view2);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        C8TC.LIZIZ.LJ(new PointF(getContainerView().getX() + getContainerView().getWidth(), getContainerView().getY() + getContainerView().getHeight()));
    }
}
