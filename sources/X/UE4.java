package X;

import Y.ALAdapterS1S0400000_13;
import Y.ARunnableS32S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE4 extends RelativeLayout {
    public final java.util.Map<ImageView, AnimatorSet> LJLIL;
    public int LJLILLLLZI;
    public final Queue<C14500ha> LJLJI;
    public boolean LJLJJI;

    public final void LIZIZ() {
        Iterator it = ((ConcurrentHashMap) this.LJLIL).entrySet().iterator();
        while (it.hasNext()) {
            AnimatorSet animatorSet = (AnimatorSet) ((Map.Entry) it.next()).getValue();
            if (animatorSet != null) {
                animatorSet.end();
            }
        }
        ((ConcurrentHashMap) this.LJLIL).clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ArrayBlockingQueue) this.LJLJI).clear();
        LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public static ObjectAnimator LIZ(ImageView imageView) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.8f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.8f));
        o.LJIIIIZZ(ofPropertyValuesHolder, "ofPropertyValuesHolder(g… alpha , toMinX , toMinY)");
        ofPropertyValuesHolder.setDuration(200L);
        return ofPropertyValuesHolder;
    }

    public static String LIZLLL(UE3 ue3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(ue3.LIZJ.LJLJI.getUri());
        LIZ.append(ue3.LIZLLL);
        LIZ.append(ue3.LJ);
        String mD5String = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(mD5String, "getMD5String(\n          ….receiverUid}\",\n        )");
        return mD5String;
    }

    public final ImageView LIZJ(String str) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o.LJIIIIZZ(childAt, "getChildAt(i)");
            if (o.LJ(childAt.getTag(R.id.lqn), str) && (childAt instanceof ImageView)) {
                return (ImageView) childAt;
            }
        }
        return null;
    }

    public final void LJI(String str) {
        C14500ha c14500ha;
        C279017q.LJ("tryFireAnimation , ", str, "AnimationView");
        C14500ha c14500ha2 = (C14500ha) ((ArrayBlockingQueue) this.LJLJI).peek();
        if (c14500ha2 == null) {
            return;
        }
        String LIZLLL = LIZLLL(c14500ha2.LIZ);
        if (this.LJLJJI) {
            return;
        }
        if ((getChildCount() >= 2 && (getChildCount() != 2 || !c14500ha2.LIZ.LJFF || LIZJ(LIZLLL) == null)) || (c14500ha = (C14500ha) ((ArrayBlockingQueue) this.LJLJI).poll()) == null) {
            return;
        }
        postDelayed(new ARunnableS32S0200000_13(this, c14500ha, 25), 16L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UE4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ConcurrentHashMap();
        this.LJLILLLLZI = C87277YNd.LJIIJJI(20);
        this.LJLJI = new ArrayBlockingQueue(50);
        setGravity(8388629);
    }

    public final void LJ(String str, C14500ha c14500ha) {
        ImageView imageView = new ImageView(getContext());
        int i = this.LJLILLLLZI;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setTag(R.id.lqn, str);
        addView(imageView);
        C17190lv LJII = C17190lv.LJII(getContext());
        LJII.LJFF = c14500ha.LIZ.LIZJ.LJLJI;
        LJII.LIZLLL = new UE5(this, str, imageView, c14500ha);
        LJII.LIZJ(imageView);
    }

    public final void LJFF(AnimatorSet animatorSet, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, List list, ImageView imageView, C14500ha event) {
        AnimatorSet.Builder after;
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (TV3.LJFF(LJ)) {
            hashMap.put("user_type", "anchor");
            hashMap.remove("enter_method");
            hashMap.remove("enter_from_merge");
        } else {
            hashMap.put("user_type", "user");
        }
        if (TV3.LJIIIIZZ(LJ)) {
            hashMap.put("is_guest", "1");
        } else {
            hashMap.put("is_guest", CardStruct.IStatusCode.DEFAULT);
        }
        C74824TYe.LJLL("livesdk_video_box_gift_icon_effect_show", hashMap);
        C34K c34k = new C34K();
        AnimatorSet.Builder play = animatorSet.play(objectAnimator2);
        if (play != null && (after = play.after(objectAnimator)) != null) {
            after.after(event.LIZ.LJII - 500);
        }
        animatorSet.addListener(new ALAdapterS1S0400000_13(c34k, animatorSet, imageView, this, 1));
        if (list != null && (!((ArrayList) list).isEmpty())) {
            animatorSet.playTogether(ORZ.LLJI(list));
        }
        animatorSet.start();
    }
}
