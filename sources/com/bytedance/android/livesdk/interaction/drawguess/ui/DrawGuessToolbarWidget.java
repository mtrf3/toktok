package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BAD;
import X.BAF;
import X.BAI;
import X.BZI;
import X.C0GA;
import X.C16880lQ;
import X.C28397BCn;
import X.C28787BRn;
import X.C29306Beo;
import X.C31481CXd;
import X.C32537Cpp;
import X.C47261Igj;
import X.C5S0;
import X.ViewOnClickListenerC28353BAv;
import Y.ACListenerS25S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCancelWhenNotStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCapturedImageDataEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectGuessCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessToolbarWidget extends LiveRecyclableWidget {
    public final Fragment LJLIL;
    public View LJLILLLLZI;
    public C31481CXd LJLJI;
    public View LJLJJI;
    public ViewGroup LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public ViewGroup LJLJLJ;
    public ViewGroup LJLJLLL;
    public ViewGroup LJLL;
    public ViewGroup LJLLI;
    public View LJLLILLLL;
    public ViewOnClickListenerC28353BAv LJLLJ;
    public C31481CXd LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d23;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void LJZI() {
        if (this.LJZ) {
            View view = this.LJLJJI;
            if (view != null) {
                List LJJIJ = C47261Igj.LJJIJ(view);
                View[] viewArr = new View[2];
                ViewOnClickListenerC28353BAv viewOnClickListenerC28353BAv = this.LJLLJ;
                if (viewOnClickListenerC28353BAv != null) {
                    viewArr[0] = viewOnClickListenerC28353BAv;
                    View view2 = this.LJLLILLLL;
                    if (view2 != null) {
                        viewArr[1] = view2;
                        LJZ(LJJIJ, C47261Igj.LJJIJIIJI(viewArr));
                        LJLZ(false);
                        this.LJZ = false;
                    } else {
                        o.LJIJI("colorPickerContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("colorPickerView");
                    throw null;
                }
            } else {
                o.LJIJI("actionButtonsContainer");
                throw null;
            }
        }
        C31481CXd c31481CXd = this.LJLLL;
        if (c31481CXd != null) {
            C31481CXd c31481CXd2 = this.LJLJI;
            if (c31481CXd2 != null) {
                c31481CXd.setColor(c31481CXd2.getColor());
                return;
            } else {
                o.LJIJI("colorButtonInnerView");
                throw null;
            }
        }
        o.LJIJI("colorPickerCurrentColorView");
        throw null;
    }

    public DrawGuessToolbarWidget(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
    }

    public final void LJLZ(boolean z) {
        float f;
        float LIZ = C5S0.LIZ(36.0f);
        float LIZ2 = C5S0.LIZ(254.0f);
        if (z) {
            f = LIZ;
            LIZ = LIZ2;
        } else {
            f = LIZ2;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, LIZ);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(BAF.LIZ);
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 16));
        ofFloat.start();
    }

    public final void LJZL(boolean z) {
        if (z) {
            if (!this.LJZ) {
                View[] viewArr = new View[2];
                ViewOnClickListenerC28353BAv viewOnClickListenerC28353BAv = this.LJLLJ;
                if (viewOnClickListenerC28353BAv != null) {
                    viewArr[0] = viewOnClickListenerC28353BAv;
                    View view = this.LJLLILLLL;
                    if (view != null) {
                        viewArr[1] = view;
                        List LJJIJIIJI = C47261Igj.LJJIJIIJI(viewArr);
                        View view2 = this.LJLJJI;
                        if (view2 != null) {
                            LJZ(LJJIJIIJI, C47261Igj.LJJIJ(view2));
                            LJLZ(true);
                            this.LJZ = true;
                        } else {
                            o.LJIJI("actionButtonsContainer");
                            throw null;
                        }
                    } else {
                        o.LJIJI("colorPickerContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("colorPickerView");
                    throw null;
                }
            }
            C31481CXd c31481CXd = this.LJLLL;
            if (c31481CXd != null) {
                C31481CXd c31481CXd2 = this.LJLJI;
                if (c31481CXd2 != null) {
                    c31481CXd.setColor(c31481CXd2.getColor());
                } else {
                    o.LJIJI("colorButtonInnerView");
                    throw null;
                }
            } else {
                o.LJIJI("colorPickerCurrentColorView");
                throw null;
            }
        } else {
            LJZI();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_click_change_color");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(this.dataChannel.kv0(DrawGuessSessionIdChannel.class), "pictionary_session_id");
        LIZ.LJIJJ(this.dataChannel.kv0(DrawGuessRoundIdChannel.class), "pictionary_id");
        ViewOnClickListenerC28353BAv viewOnClickListenerC28353BAv2 = this.LJLLJ;
        if (viewOnClickListenerC28353BAv2 != null) {
            LIZ.LJIJJ(viewOnClickListenerC28353BAv2.getCurrentSelectedColorString(), "color");
            BAI.LIZ(LIZ);
            BAI.LJIIJJI(LIZ, this.dataChannel);
            LIZ.LJJIIJZLJL();
            return;
        }
        o.LJIJI("colorPickerView");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Integer, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        TextView textView;
        LiveIconView liveIconView;
        TextView textView2;
        LiveIconView liveIconView2;
        this.LJLZ = C0GA.LIZ(this.dataChannel);
        View findViewById = findViewById(R.id.d15);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.exit_button)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.LJLJJL = viewGroup;
        C29306Beo.LJJJLL(viewGroup, 500L, new AqS171S0100000_5(this, 431));
        ViewGroup viewGroup2 = this.LJLJJL;
        if (viewGroup2 != null) {
            LiveIconView liveIconView3 = (LiveIconView) viewGroup2.findViewById(R.id.ch_);
            if (liveIconView3 != null) {
                liveIconView3.setIconAttr(R.attr.ars);
            }
            ViewGroup viewGroup3 = this.LJLJJL;
            if (viewGroup3 != null) {
                TextView textView3 = (TextView) viewGroup3.findViewById(R.id.cha);
                if (textView3 != null) {
                    textView3.setText(R.string.ks_);
                }
                View findViewById2 = findViewById(R.id.j08);
                o.LJIIIIZZ(findViewById2, "findViewById(R.id.reveal_button)");
                ViewGroup viewGroup4 = (ViewGroup) findViewById2;
                this.LJLJJLL = viewGroup4;
                C29306Beo.LJJJLL(viewGroup4, 500L, new AqS171S0100000_5(this, 432));
                ViewGroup viewGroup5 = this.LJLJJLL;
                if (viewGroup5 != null) {
                    LiveIconView liveIconView4 = (LiveIconView) viewGroup5.findViewById(R.id.ch_);
                    if (liveIconView4 != null) {
                        liveIconView4.setIconAttr(R.attr.ava);
                    }
                    ViewGroup viewGroup6 = this.LJLJJLL;
                    if (viewGroup6 != null) {
                        TextView textView4 = (TextView) viewGroup6.findViewById(R.id.cha);
                        if (textView4 != null) {
                            textView4.setText(R.string.kt7);
                        }
                        View findViewById3 = findViewById(R.id.h0y);
                        o.LJIIIIZZ(findViewById3, "findViewById(R.id.next_button)");
                        ViewGroup viewGroup7 = (ViewGroup) findViewById3;
                        this.LJLJLJ = viewGroup7;
                        LiveIconView liveIconView5 = (LiveIconView) viewGroup7.findViewById(R.id.ch_);
                        if (liveIconView5 != null) {
                            liveIconView5.setIcon(R.drawable.d2k);
                        }
                        ViewGroup viewGroup8 = this.LJLJLJ;
                        if (viewGroup8 != null) {
                            View findViewById4 = viewGroup8.findViewById(R.id.ch_);
                            if (findViewById4 != null) {
                                findViewById4.setAlpha(1.0f);
                            }
                            ViewGroup viewGroup9 = this.LJLJLJ;
                            if (viewGroup9 != null) {
                                TextView textView5 = (TextView) viewGroup9.findViewById(R.id.cha);
                                if (textView5 != null) {
                                    textView5.setText(R.string.ksu);
                                }
                                ViewGroup viewGroup10 = this.LJLJLJ;
                                if (viewGroup10 != null) {
                                    C29306Beo.LJJJLL(viewGroup10, 500L, new AqS171S0100000_5(this, 433));
                                    if (this.LJLZ) {
                                        ViewGroup viewGroup11 = (ViewGroup) findViewById(R.id.c1n);
                                        this.LJLJLLL = viewGroup11;
                                        if (viewGroup11 != null && (liveIconView2 = (LiveIconView) viewGroup11.findViewById(R.id.ch_)) != null) {
                                            liveIconView2.setIconAttr(R.attr.auu);
                                        }
                                        ViewGroup viewGroup12 = this.LJLJLLL;
                                        if (viewGroup12 != null && (textView2 = (TextView) viewGroup12.findViewById(R.id.cha)) != null) {
                                            textView2.setText(R.string.ks8);
                                        }
                                        ViewGroup viewGroup13 = this.LJLJLLL;
                                        if (viewGroup13 != null) {
                                            C29306Beo.LJJJLL(viewGroup13, 500L, new AqS171S0100000_5(this, 434));
                                        }
                                        ViewGroup viewGroup14 = (ViewGroup) findViewById(R.id.b92);
                                        this.LJLJL = viewGroup14;
                                        if (viewGroup14 != null) {
                                            C29306Beo.LJJJLL(viewGroup14, 500L, new AqS171S0100000_5(this, 435));
                                        }
                                        C29306Beo.LJJLJLI(this.LJLJL);
                                        ViewGroup viewGroup15 = this.LJLJL;
                                        if (viewGroup15 != null && (liveIconView = (LiveIconView) viewGroup15.findViewById(R.id.ch_)) != null) {
                                            liveIconView.setIconAttr(R.attr.av_);
                                        }
                                        ViewGroup viewGroup16 = this.LJLJL;
                                        if (viewGroup16 != null && (textView = (TextView) viewGroup16.findViewById(R.id.cha)) != null) {
                                            textView.setText(R.string.krj);
                                        }
                                        ViewGroup viewGroup17 = this.LJLJJLL;
                                        if (viewGroup17 != null) {
                                            C29306Beo.LJI(viewGroup17);
                                        } else {
                                            o.LJIJI("revealButton");
                                            throw null;
                                        }
                                    }
                                    View findViewById5 = findViewById(R.id.ch4);
                                    o.LJIIIIZZ(findViewById5, "findViewById(R.id.draw_guess_action_buttons)");
                                    this.LJLJJI = findViewById5;
                                    View findViewById6 = findViewById(R.id.bi6);
                                    o.LJIIIIZZ(findViewById6, "findViewById(R.id.color_button_inner_view)");
                                    this.LJLJI = (C31481CXd) findViewById6;
                                    View findViewById7 = findViewById(R.id.bi5);
                                    o.LJIIIIZZ(findViewById7, "findViewById(R.id.color_button)");
                                    this.LJLILLLLZI = findViewById7;
                                    C29306Beo.LJJJLL(findViewById7, 500L, new AqS171S0100000_5(this, 436));
                                    View findViewById8 = findViewById(R.id.bic);
                                    o.LJIIIIZZ(findViewById8, "findViewById(R.id.color_picker)");
                                    ViewOnClickListenerC28353BAv viewOnClickListenerC28353BAv = (ViewOnClickListenerC28353BAv) findViewById8;
                                    this.LJLLJ = viewOnClickListenerC28353BAv;
                                    viewOnClickListenerC28353BAv.LJLJJI = this.dataChannel;
                                    viewOnClickListenerC28353BAv.setOnClickListener(new AqS171S0100000_5(this, 437));
                                    View findViewById9 = findViewById(R.id.c0s);
                                    o.LJIIIIZZ(findViewById9, "findViewById(R.id.current_color_container)");
                                    this.LJLLILLLL = findViewById9;
                                    View findViewById10 = findViewById(R.id.c0r);
                                    o.LJIIIIZZ(findViewById10, "findViewById(R.id.current_color)");
                                    C31481CXd c31481CXd = (C31481CXd) findViewById10;
                                    this.LJLLL = c31481CXd;
                                    C29306Beo.LJJJLL(c31481CXd, 500L, new AqS171S0100000_5(this, 438));
                                    View findViewById11 = findViewById(R.id.mt2);
                                    o.LJIIIIZZ(findViewById11, "findViewById(R.id.undo_button)");
                                    ViewGroup viewGroup18 = (ViewGroup) findViewById11;
                                    this.LJLL = viewGroup18;
                                    C16880lQ.LJIIL(viewGroup18, new ACListenerS25S0100000_5(this, 193));
                                    ViewGroup viewGroup19 = this.LJLL;
                                    if (viewGroup19 != null) {
                                        LiveIconView liveIconView6 = (LiveIconView) viewGroup19.findViewById(R.id.ch_);
                                        if (liveIconView6 != null) {
                                            liveIconView6.setIconAttr(R.attr.arv);
                                        }
                                        ViewGroup viewGroup20 = this.LJLL;
                                        if (viewGroup20 != null) {
                                            TextView textView6 = (TextView) viewGroup20.findViewById(R.id.cha);
                                            if (textView6 != null) {
                                                textView6.setText(R.string.ksa);
                                            }
                                            View findViewById12 = findViewById(R.id.iye);
                                            o.LJIIIIZZ(findViewById12, "findViewById(R.id.reset_button)");
                                            ViewGroup viewGroup21 = (ViewGroup) findViewById12;
                                            this.LJLLI = viewGroup21;
                                            LiveIconView liveIconView7 = (LiveIconView) viewGroup21.findViewById(R.id.ch_);
                                            if (liveIconView7 != null) {
                                                liveIconView7.setIconAttr(R.attr.avr);
                                            }
                                            ViewGroup viewGroup22 = this.LJLLI;
                                            if (viewGroup22 != null) {
                                                TextView textView7 = (TextView) viewGroup22.findViewById(R.id.cha);
                                                if (textView7 != null) {
                                                    textView7.setText(R.string.ks9);
                                                }
                                                ViewGroup viewGroup23 = this.LJLLI;
                                                if (viewGroup23 != null) {
                                                    C16880lQ.LJIIL(viewGroup23, new ACListenerS25S0100000_5(this, 192));
                                                    hide();
                                                    DataChannel dataChannel = this.dataChannel;
                                                    C31481CXd c31481CXd2 = this.LJLJI;
                                                    if (c31481CXd2 != null) {
                                                        ((C32537Cpp) dataChannel.gv0(C28397BCn.class)).LIZ = Integer.valueOf(c31481CXd2.getColor());
                                                        return;
                                                    } else {
                                                        o.LJIJI("colorButtonInnerView");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("resetButton");
                                                throw null;
                                            }
                                            o.LJIJI("resetButton");
                                            throw null;
                                        }
                                        o.LJIJI("undobutton");
                                        throw null;
                                    }
                                    o.LJIJI("undobutton");
                                    throw null;
                                }
                                o.LJIJI("nextButton");
                                throw null;
                            }
                            o.LJIJI("nextButton");
                            throw null;
                        }
                        o.LJIJI("nextButton");
                        throw null;
                    }
                    o.LJIJI("revealButton");
                    throw null;
                }
                o.LJIJI("revealButton");
                throw null;
            }
            o.LJIJI("exitButton");
            throw null;
        }
        o.LJIJI("exitButton");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, DrawGuessRoundStartEvent.class, new AqS171S0100000_5(this, 439));
        dataChannel.lv0(this, DrawGuessCapturedImageDataEvent.class, new AqS171S0100000_5(this, 440));
        dataChannel.lv0(this, DrawGuessRoundEndEvent.class, new AqS171S0100000_5(this, 441));
        dataChannel.lv0(this, DrawGuessRoundStartEvent.class, new AqS171S0100000_5(this, 442));
        dataChannel.lv0(this, DrawGuessFreelyStartChannel.class, new AqS171S0100000_5(this, 443));
        dataChannel.lv0(this, DrawGuessIsCountingDownRoundStart.class, new AqS171S0100000_5(this, 444));
        dataChannel.lv0(this, DrawGuessCancelWhenNotStartEvent.class, new AqS171S0100000_5(this, 445));
        if (this.LJLZ) {
            this.dataChannel.lv0(this, DrawGuessCorrectGuessCountChannel.class, new AqS171S0100000_5(this, 446));
        }
    }

    public static void LJZ(List list, List list2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(120L);
        ofFloat.addUpdateListener(new BAD(ofFloat, list, list2));
        ofFloat.addListener(new ALAdapterS4S0200000_5(list2, list, 5));
        ofFloat.start();
    }
}
