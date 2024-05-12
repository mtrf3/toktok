package com.bytedance.android.livesdk.programmedlive.ui;

import X.B76;
import X.C018905p;
import X.C29306Beo;
import X.C29727Blb;
import X.C31597Caf;
import X.C47061t0;
import X.C47121t6;
import X.C5S0;
import X.CL0;
import X.CN1;
import X.EnumC29732Blg;
import Y.ALAdapterS4S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class ProgrammedLiveUserInfoWidget extends ClearScreenUserInfoWidget {
    public boolean LLLII;

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, X.InterfaceC29986Bpm
    public final String A4() {
        return "ProgrammedLiveUserInfoWidget";
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget
    public final void LLIZLLLIL() {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.LLLFFI == 0) {
            Animator LLILZIL = LLILZIL();
            this.LLJLLL = LLILZIL;
            animatorSet.playTogether(LLILZIL);
        }
        animatorSet.addListener(new ALAdapterS4S0100000_5(this, 33));
        animatorSet.start();
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget
    public final void LLJ() {
        AnimatorSet animatorSet = new AnimatorSet();
        C29727Blb c29727Blb = this.LLJILJILJ;
        if ((c29727Blb.LJIIL == EnumC29732Blg.FOLLOW_ANIM && !c29727Blb.LJIIIIZZ()) || this.LLJILJILJ.LJIIL == EnumC29732Blg.FOLLOWED) {
            this.LLJILJILJ.LJIIL = EnumC29732Blg.FOLLOWED;
        } else {
            Animator LLILZ = LLILZ();
            this.LLJZ = LLILZ;
            animatorSet.playTogether(LLILZ);
        }
        animatorSet.addListener(new ALAdapterS4S0100000_5(this, 34));
        animatorSet.start();
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewGroup.LayoutParams layoutParams8;
        ViewGroup.LayoutParams layoutParams9;
        ViewGroup.LayoutParams layoutParams10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C018905p c018905p;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        super.onInit(objArr);
        C31597Caf c31597Caf = this.LLIILZL;
        ViewGroup.LayoutParams layoutParams11 = null;
        if (c31597Caf != null) {
            layoutParams = c31597Caf.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = C5S0.LIZ(18.0f);
            layoutParams.height = C5S0.LIZ(18.0f);
        }
        C31597Caf c31597Caf2 = this.LLIILZL;
        if (c31597Caf2 != null) {
            c31597Caf2.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            layoutParams2 = viewGroup.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            layoutParams2.height = C5S0.LIZ(22.0f);
        }
        ViewGroup viewGroup2 = this.LJLJI;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams2);
        }
        C31597Caf c31597Caf3 = this.LJLJJL;
        if (c31597Caf3 != null) {
            layoutParams3 = c31597Caf3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C5S0.LIZ(18.0f);
                layoutParams3.height = C5S0.LIZ(18.0f);
            }
        } else {
            layoutParams3 = null;
        }
        C31597Caf c31597Caf4 = this.LJLJJL;
        if (c31597Caf4 != null) {
            c31597Caf4.setLayoutParams(layoutParams3);
        }
        View view = this.LJLJLJ;
        if (view != null) {
            layoutParams4 = view.getLayoutParams();
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 != null) {
            layoutParams4.height = -2;
            boolean z = layoutParams4 instanceof ViewGroup.MarginLayoutParams;
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.topMargin = 0;
                }
                if (z && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams4.bottomMargin = 0;
                }
            }
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams4);
        }
        ViewGroup viewGroup3 = this.LLIIII;
        if (viewGroup3 != null) {
            layoutParams5 = viewGroup3.getLayoutParams();
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 != null) {
            boolean z2 = layoutParams5 instanceof ViewGroup.MarginLayoutParams;
            if (z2) {
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams5;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.topMargin = C5S0.LIZ(3.0f);
                }
                if (z2 && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    marginLayoutParams3.bottomMargin = C5S0.LIZ(3.0f);
                }
            }
            if ((layoutParams5 instanceof C018905p) && (c018905p = (C018905p) layoutParams5) != null) {
                c018905p.constrainedHeight = true;
            }
        }
        ViewGroup viewGroup4 = this.LLIIII;
        if (viewGroup4 != null) {
            viewGroup4.setLayoutParams(layoutParams5);
        }
        this.LLIIIILZ.setMinimumWidth(0);
        C47121t6 c47121t6 = this.LLIIIJ;
        if (c47121t6 != null) {
            c47121t6.LJJIJIL(R.style.a4g);
            c47121t6.setTextSize(11.0f);
            c47121t6.setIncludeFontPadding(false);
            c47121t6.setReduceFont(true);
        }
        View view3 = this.LLII;
        if (view3 != null) {
            layoutParams6 = view3.getLayoutParams();
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 != null) {
            layoutParams6.height = C5S0.LIZ(16.0f);
        }
        View view4 = this.LLII;
        if (view4 != null) {
            view4.setLayoutParams(layoutParams6);
        }
        ImageView imageView = this.LLIIJLIL;
        if (imageView != null) {
            layoutParams7 = imageView.getLayoutParams();
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 != null) {
            layoutParams7.width = C5S0.LIZ(16.0f);
            layoutParams7.height = C5S0.LIZ(16.0f);
            if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                marginLayoutParams2.topMargin = 0;
                marginLayoutParams2.bottomMargin = 0;
                marginLayoutParams2.setMarginStart(C5S0.LIZ(6.0f));
                marginLayoutParams2.leftMargin = C5S0.LIZ(6.0f);
            }
        }
        ImageView imageView2 = this.LLIIJLIL;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams7);
        }
        TextView textView = this.LLIILII;
        if (textView != null) {
            layoutParams8 = textView.getLayoutParams();
            if (layoutParams8 != null && (layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                marginLayoutParams.setMarginEnd(C5S0.LIZ(6.0f));
                marginLayoutParams.rightMargin = C5S0.LIZ(6.0f);
            }
        } else {
            layoutParams8 = null;
        }
        TextView textView2 = this.LLIILII;
        if (textView2 != null) {
            textView2.setLayoutParams(layoutParams8);
        }
        ImageView imageView3 = this.LLIIL;
        if (imageView3 != null) {
            layoutParams9 = imageView3.getLayoutParams();
            if (layoutParams9 != null) {
                layoutParams9.width = C5S0.LIZ(16.0f);
                layoutParams9.height = C5S0.LIZ(16.0f);
            }
        } else {
            layoutParams9 = null;
        }
        ImageView imageView4 = this.LLIIL;
        if (imageView4 != null) {
            imageView4.setLayoutParams(layoutParams9);
        }
        View view5 = this.LLIIIZ;
        if (view5 != null) {
            layoutParams10 = view5.getLayoutParams();
            if (layoutParams10 != null) {
                layoutParams10.width = C5S0.LIZ(48.0f);
                layoutParams10.height = C5S0.LIZ(22.0f);
            }
        } else {
            layoutParams10 = null;
        }
        View view6 = this.LLIIIZ;
        if (view6 != null) {
            view6.setLayoutParams(layoutParams10);
        }
        C47061t0 c47061t0 = this.LJLJJLL;
        if (c47061t0 != null && (layoutParams11 = c47061t0.getLayoutParams()) != null) {
            layoutParams11.width = C5S0.LIZ(22.0f);
            layoutParams11.height = C5S0.LIZ(22.0f);
        }
        C47061t0 c47061t02 = this.LJLJJLL;
        if (c47061t02 != null) {
            c47061t02.setLayoutParams(layoutParams11);
        }
        Room room = this.LLILIL;
        if (room != null) {
            B76.LIZJ(room, "programmedlive_anchor_info");
        }
    }

    @Override // com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget, com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        float f;
        super.onLoad(objArr);
        C47121t6 c47121t6 = this.LJLJL;
        if (c47121t6 != null) {
            C29306Beo.LJI(c47121t6);
        }
        View view = this.LJLLI;
        if (view != null) {
            C29306Beo.LJI(view);
        }
        CL0 cl0 = this.LJLLLLLL;
        if (cl0 != null) {
            C29306Beo.LJI(cl0);
        }
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        int i = 0;
        if (iMicRoomService != null) {
            z = iMicRoomService.jT((Room) this.dataChannel.kv0(RoomChannel.class));
        } else {
            z = false;
        }
        this.LLLII = z;
        C47121t6 c47121t62 = this.LJLJLLL;
        float f2 = 12.0f;
        if (c47121t62 != null) {
            c47121t62.LJJIJIL(R.style.a4d);
            if (!this.LLLII) {
                c47121t62.setTextSize(12.0f);
            }
            c47121t62.setIncludeFontPadding(false);
            c47121t62.setReduceFont(true);
        }
        if (!this.LLILL) {
            LiveIconView liveIconView = this.LLIIIL;
            if (liveIconView != null) {
                layoutParams = liveIconView.getLayoutParams();
                if (layoutParams != null) {
                    if (this.LLLII) {
                        f = 16.0f;
                    } else {
                        f = 12.0f;
                    }
                    layoutParams.height = C5S0.LIZ(f);
                    if (this.LLLII) {
                        f2 = 16.0f;
                    }
                    layoutParams.width = C5S0.LIZ(f2);
                }
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!this.LLLII) {
                    i = C5S0.LIZ(3.0f);
                }
                marginLayoutParams.setMarginStart(i);
            }
            LiveIconView liveIconView2 = this.LLIIIL;
            if (liveIconView2 != null) {
                liveIconView2.setLayoutParams(layoutParams);
            }
        }
        View view2 = this.LJZI;
        if (view2 != null) {
            C29306Beo.LJI(view2);
        }
    }
}
