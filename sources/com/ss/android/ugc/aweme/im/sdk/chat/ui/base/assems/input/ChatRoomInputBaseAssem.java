package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input;

import X.C04270Et;
import X.C1045248i;
import X.C212428Vi;
import X.C221108m2;
import X.C47261Igj;
import X.C49R;
import X.C4MK;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C79045V0n;
import X.InterfaceC55235Lm3;
import Y.ARunnableS37S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class ChatRoomInputBaseAssem extends UISlotAssem implements IMInputViewUIAbility, ChatBackgroundColorProtocol {
    public ViewGroup LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.b7j;
    }

    public ChatRoomInputBaseAssem() {
        new LinkedHashMap();
        this.LJLL = C221108m2.LIZIZ(C4MK.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 371));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 370));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 373));
        this.LJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 372));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
    public final void LLIL() {
        ValueAnimator valueAnimator = (ValueAnimator) this.LJLLL.getValue();
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility
    public final void Fo0() {
        getContainerView().post(new ARunnableS37S0100000_1(this, 36));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatBackgroundColorProtocol
    public final void LLLLLLZZ() {
        Drawable background;
        if (!isContainerViewAssigned()) {
            return;
        }
        Integer num = (Integer) this.LJLLI.getValue();
        if (num != null) {
            int intValue = num.intValue();
            getContainerView().setBackgroundColor(intValue);
            View findViewById = getContainerView().findViewById(R.id.cow);
            if (findViewById != null) {
                findViewById.setBackgroundColor(intValue);
            }
        }
        Integer num2 = (Integer) this.LJLLILLLL.getValue();
        if (num2 != null) {
            int intValue2 = num2.intValue();
            ImageView imageView = (ImageView) getContainerView().findViewById(R.id.cox);
            if (imageView != null) {
                imageView.setColorFilter(intValue2);
            }
            View findViewById2 = getContainerView().findViewById(R.id.b9v);
            if (findViewById2 != null && (background = findViewById2.getBackground()) != null) {
                background.setColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility
    public final void MH() {
        getContainerView().post(new ARunnableS37S0100000_1(this, 33));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility
    public final void Ws() {
        getContainerView().post(new ARunnableS37S0100000_1(this, 34));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.IMInputViewUIAbility
    public final void d70() {
        getContainerView().post(new ARunnableS37S0100000_1(this, 35));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IMInputViewUIAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IMInputViewUIAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Integer LJI;
        int i;
        Drawable background;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (ViewGroup) view.findViewById(R.id.b9v);
        C1045248i c1045248i = C49R.LIZ;
        Context context = getContext();
        if (context != null) {
            Integer LJI2 = C79045V0n.LJI(c1045248i.LJIIIZ, context);
            if (LJI2 != null) {
                i = LJI2.intValue();
            } else {
                i = 0;
            }
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup != null) {
                viewGroup.setBackground(C04270Et.LIZIZ(context, C1045248i.LIZ(c1045248i)));
            }
            ViewGroup viewGroup2 = this.LJLJLLL;
            if (viewGroup2 != null && (background = viewGroup2.getBackground()) != null) {
                background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
            }
            ((ImageView) getContainerView().findViewById(R.id.cox)).setColorFilter(i);
        }
        Context context2 = getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(c1045248i.LIZLLL, context2)) != null) {
            int intValue = LJI.intValue();
            getContainerView().setBackgroundColor(intValue);
            View findViewById = getContainerView().findViewById(R.id.cow);
            if (findViewById != null) {
                findViewById.setBackgroundColor(intValue);
            }
        }
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C62814Ol0.LJJIIJZLJL(LJIIZILJ, ChatBackgroundColorProtocol.class, C47261Igj.LJJIJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputBaseAssem$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C62814Ol0.LJJIJL(InterfaceC55235Lm3.this, ChatBackgroundColorProtocol.class, this);
                    }
                }
            });
        }
    }
}
