package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109174Qf extends FrameLayout {
    public Animation LJLIL;
    public C47121t6 LJLILLLLZI;
    public InterfaceC75072x5 LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;

    public final void setCountDownListener(InterfaceC75072x5 interfaceC75072x5) {
        this.LJLJI = interfaceC75072x5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109174Qf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        o.LJI(context);
        this.LJLJJL = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a7y, R.attr.b7l}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ownView, defStyleAttr, 0)");
        this.LJLJJI = obtainStyledAttributes.getInteger(0, LivePlayerResourceReleaseSetting.ENABLE);
        this.LJLJJL = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        C47121t6 c47121t6 = new C47121t6(getContext(), null);
        this.LJLILLLLZI = c47121t6;
        c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        C47121t6 c47121t62 = this.LJLILLLLZI;
        if (c47121t62 != null) {
            c47121t62.setTextColor(getResources().getColor(R.color.acm));
        }
        C47121t6 c47121t63 = this.LJLILLLLZI;
        if (c47121t63 != null) {
            c47121t63.setTextSize(60.0f);
        }
        C47121t6 c47121t64 = this.LJLILLLLZI;
        if (c47121t64 != null) {
            c47121t64.setGravity(17);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.LJLILLLLZI, layoutParams);
        this.LJLIL = AnimationUtils.loadAnimation(context2, R.anim.c5);
    }
}
