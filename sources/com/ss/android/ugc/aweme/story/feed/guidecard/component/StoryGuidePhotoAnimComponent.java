package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C221108m2;
import X.C62822Ol8;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryGuidePhotoAnimComponent extends BaseCellContentComponent<StoryGuidePhotoAnimComponent> {
    public final C62822Ol8 LL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    public StoryGuidePhotoAnimComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 719));
    }

    public final ValueAnimator c4() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-valueAnimator>(...)");
        return (ValueAnimator) value;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        c4().cancel();
        SmartImageView b4 = b4();
        if (b4 != null) {
            b4.setScaleX(1.0f);
        }
        SmartImageView b42 = b4();
        if (b42 == null) {
            return;
        }
        b42.setScaleY(1.0f);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        c4().removeAllUpdateListeners();
        c4().cancel();
    }

    public final SmartImageView b4() {
        return (SmartImageView) getContainerView().findViewById(R.id.f8j);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        c4().start();
    }
}
