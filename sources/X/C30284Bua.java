package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30284Bua extends FrameLayout {
    public Animation LJLIL;
    public C47121t6 LJLILLLLZI;
    public InterfaceC30283BuZ LJLJI;
    public int LJLJJI;

    public void setCountDownListener(InterfaceC30283BuZ interfaceC30283BuZ) {
        this.LJLJI = interfaceC30283BuZ;
    }

    public C30284Bua(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a7y, R.attr.b7l}, 0, 0);
        this.LJLJJI = obtainStyledAttributes.getInteger(0, LivePlayerResourceReleaseSetting.ENABLE);
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        C47121t6 c47121t6 = new C47121t6(getContext(), null);
        this.LJLILLLLZI = c47121t6;
        c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        this.LJLILLLLZI.setTextColor(getResources().getColor(R.color.a1l));
        this.LJLILLLLZI.setTextSize(60.0f);
        this.LJLILLLLZI.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.LJLILLLLZI, layoutParams);
        this.LJLIL = AnimationUtils.loadAnimation(context2, R.anim.gv);
    }
}
