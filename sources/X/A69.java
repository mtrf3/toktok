package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A69 implements IFrameSlot {
    public final InterfaceC88471Ynr<CollectionDetailModel, Boolean, C76800UCe> LJLIL;
    public final Long LJLILLLLZI;
    public View LJLJI;
    public SY4 LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(A6B.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C25676A5w.LJLIL);

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC31687Cc7 LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJII(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void getLocation() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZJ() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZLLL() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJFF(Context context) {
        View popCard = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aid, null, false);
        this.LJLJI = popCard;
        o.LJIIIIZZ(popCard, "popCard");
        return popCard;
    }

    public A69(A6A a6a, Long l) {
        this.LJLIL = a6a;
        this.LJLILLLLZI = l;
    }
}
