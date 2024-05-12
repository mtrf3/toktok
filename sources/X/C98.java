package X;

import Y.AUListenerS94S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class C98 extends TBS implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public C98(Object obj) {
        super(2, obj, LiveCenterEntranceWidget.class, "showPunishCardAnim", "showPunishCardAnim(II)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        LiveCenterEntranceWidget liveCenterEntranceWidget = (LiveCenterEntranceWidget) this.receiver;
        if (intValue < 0) {
            View view = liveCenterEntranceWidget.LLD;
            if (view != null) {
                view.setAlpha(0.0f);
                C47121t6 c47121t6 = liveCenterEntranceWidget.LJLLLLLL;
                if (c47121t6 != null) {
                    c47121t6.setText(LiveCenterEntranceWidget.LJZL(intValue2));
                    C47121t6 c47121t62 = liveCenterEntranceWidget.LJLLLLLL;
                    if (c47121t62 != null) {
                        C29306Beo.LJJLJLI(c47121t62);
                        LiveIconView liveIconView = liveCenterEntranceWidget.LJLLLL;
                        if (liveIconView != null) {
                            C29306Beo.LJJLJLI(liveIconView);
                        } else {
                            o.LJIJI("violationIcon");
                            throw null;
                        }
                    } else {
                        o.LJIJI("violationText");
                        throw null;
                    }
                } else {
                    o.LJIJI("violationText");
                    throw null;
                }
            } else {
                o.LJIJI("houseArea");
                throw null;
            }
        }
        if (intValue > intValue2) {
            if (intValue2 == 0) {
                C47121t6 c47121t63 = liveCenterEntranceWidget.LJLLLLLL;
                if (c47121t63 != null) {
                    c47121t63.setText(R.string.o6n);
                    AnimatorSet animatorSet = new AnimatorSet();
                    C47121t6 c47121t64 = liveCenterEntranceWidget.LJLLLLLL;
                    if (c47121t64 != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c47121t64, (Property<C47121t6, Float>) View.ALPHA, 0.9f, 0.5f);
                        ofFloat.setDuration(500L);
                        ValueAnimator ofArgb = ValueAnimator.ofArgb(C15380j0.LIZIZ(R.color.za), C15380j0.LIZIZ(R.color.a1m));
                        ofArgb.addUpdateListener(new AUListenerS94S0100000_5(liveCenterEntranceWidget, 58));
                        ofArgb.setDuration(500L);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        LiveIconView liveIconView2 = liveCenterEntranceWidget.LJLLLL;
                        if (liveIconView2 != null) {
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(liveIconView2, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
                            ofFloat2.setDuration(250L);
                            ofFloat2.addListener(new IDAListenerS74S0100000_5(liveCenterEntranceWidget, 27));
                            View view2 = liveCenterEntranceWidget.LLD;
                            if (view2 != null) {
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                ofFloat3.setDuration(250L);
                                animatorSet2.playSequentially(ofFloat2, ofFloat3);
                                animatorSet2.setStartDelay(2250L);
                                animatorSet.setStartDelay(750L);
                                animatorSet.playTogether(ofFloat, ofArgb, animatorSet2);
                                animatorSet.addListener(new IDAListenerS74S0100000_5(liveCenterEntranceWidget, 28));
                                animatorSet.start();
                            } else {
                                o.LJIJI("houseArea");
                                throw null;
                            }
                        } else {
                            o.LJIJI("violationIcon");
                            throw null;
                        }
                    } else {
                        o.LJIJI("violationText");
                        throw null;
                    }
                } else {
                    o.LJIJI("violationText");
                    throw null;
                }
            } else {
                C47121t6 c47121t65 = liveCenterEntranceWidget.LJLLLLLL;
                if (c47121t65 != null) {
                    c47121t65.setText(R.string.o6o);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    C47121t6 c47121t66 = liveCenterEntranceWidget.LJLLLLLL;
                    if (c47121t66 != null) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c47121t66, (Property<C47121t6, Float>) View.ALPHA, 0.9f, 0.5f);
                        ofFloat4.setDuration(500L);
                        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(C15380j0.LIZIZ(R.color.za), C15380j0.LIZIZ(R.color.a1m));
                        ofArgb2.addUpdateListener(new AUListenerS94S0100000_5(liveCenterEntranceWidget, 56));
                        ofArgb2.setDuration(500L);
                        animatorSet4.playTogether(ofFloat4, ofArgb2);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        C47121t6 c47121t67 = liveCenterEntranceWidget.LJLLLLLL;
                        if (c47121t67 != null) {
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c47121t67, (Property<C47121t6, Float>) View.ALPHA, 0.5f, 0.9f);
                            ofFloat4.setDuration(250L);
                            ValueAnimator ofArgb3 = ValueAnimator.ofArgb(C15380j0.LIZIZ(R.color.a1m), C15380j0.LIZIZ(R.color.za));
                            ofArgb2.addUpdateListener(new AUListenerS94S0100000_5(liveCenterEntranceWidget, 57));
                            ofArgb2.setDuration(250L);
                            animatorSet5.playTogether(ofFloat5, ofArgb3);
                            animatorSet5.setStartDelay(2250L);
                            animatorSet3.playSequentially(animatorSet4, animatorSet5);
                            animatorSet3.setStartDelay(750L);
                            animatorSet3.addListener(new C99(liveCenterEntranceWidget, intValue2));
                            animatorSet3.start();
                        } else {
                            o.LJIJI("violationText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("violationText");
                        throw null;
                    }
                } else {
                    o.LJIJI("violationText");
                    throw null;
                }
            }
        } else {
            liveCenterEntranceWidget.getClass();
            if (intValue == 0) {
                AnimatorSet animatorSet6 = new AnimatorSet();
                View view3 = liveCenterEntranceWidget.LJZI;
                if (view3 != null) {
                    float measuredWidth = view3.getMeasuredWidth();
                    C47121t6 c47121t68 = liveCenterEntranceWidget.LJLLLLLL;
                    if (c47121t68 != null) {
                        c47121t68.setText(LiveCenterEntranceWidget.LJZL(intValue2));
                        C47121t6 c47121t69 = liveCenterEntranceWidget.LJLLLLLL;
                        if (c47121t69 != null) {
                            C29306Beo.LJJLJLI(c47121t69);
                            LiveIconView liveIconView3 = liveCenterEntranceWidget.LJLLLL;
                            if (liveIconView3 != null) {
                                C29306Beo.LJJLJLI(liveIconView3);
                                View view4 = liveCenterEntranceWidget.LLD;
                                if (view4 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                                    ofFloat6.setDuration(500L);
                                    C47121t6 c47121t610 = liveCenterEntranceWidget.LJLLLLLL;
                                    if (c47121t610 != null) {
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c47121t610, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
                                        ofFloat7.setDuration(500L);
                                        LiveIconView liveIconView4 = liveCenterEntranceWidget.LJLLLL;
                                        if (liveIconView4 != null) {
                                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(liveIconView4, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f);
                                            ofFloat8.setDuration(500L);
                                            C47121t6 c47121t611 = liveCenterEntranceWidget.LJLLLLLL;
                                            if (c47121t611 != null) {
                                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c47121t611, (Property<C47121t6, Float>) View.TRANSLATION_X, liveCenterEntranceWidget.LJLL * 32.0f, 0.0f);
                                                o.LJIIIIZZ(ofFloat9, "ofFloat(violationText, V…RtlCoefficient * 32F, 0F)");
                                                ofFloat9.setDuration(500L);
                                                View view5 = liveCenterEntranceWidget.LJZI;
                                                if (view5 != null) {
                                                    float measuredWidth2 = view5.getMeasuredWidth();
                                                    View view6 = liveCenterEntranceWidget.LJZI;
                                                    if (view6 != null) {
                                                        float f = measuredWidth2 - measuredWidth;
                                                        ObjectAnimator LIZ = DIK.LIZ(view6, View.TRANSLATION_X, new float[]{liveCenterEntranceWidget.LJLL * f, 0.0f}, "ofFloat(mBackground, Vie…width - originWidth), 0F)", 500L);
                                                        View view7 = liveCenterEntranceWidget.LJZL;
                                                        if (view7 != null) {
                                                            ObjectAnimator LIZ2 = DIK.LIZ(view7, View.TRANSLATION_X, new float[]{liveCenterEntranceWidget.LJLL * f, 0.0f}, "ofFloat(mBackground2, Vi…width - originWidth), 0F)", 500L);
                                                            AnimatorSet animatorSet7 = new AnimatorSet();
                                                            View view8 = liveCenterEntranceWidget.LJZL;
                                                            if (view8 != null) {
                                                                ObjectAnimator LIZ3 = DIK.LIZ(view8, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(mBackground2, View.ALPHA, 0F, 1F)", 500L);
                                                                View view9 = liveCenterEntranceWidget.LJZL;
                                                                if (view9 != null) {
                                                                    ObjectAnimator LIZ4 = DIK.LIZ(view9, View.ALPHA, new float[]{1.0f, 0.0f}, "ofFloat(mBackground2, View.ALPHA, 1F, 0F)", 750L);
                                                                    View view10 = liveCenterEntranceWidget.LJZL;
                                                                    if (view10 != null) {
                                                                        ObjectAnimator LIZ5 = DIK.LIZ(view10, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(mBackground2, View.ALPHA, 0F, 1F)", 750L);
                                                                        View view11 = liveCenterEntranceWidget.LJZL;
                                                                        if (view11 != null) {
                                                                            animatorSet7.playSequentially(LIZ3, LIZ4, LIZ5, DIK.LIZ(view11, View.ALPHA, new float[]{1.0f, 0.0f}, "ofFloat(mBackground2, View.ALPHA, 1F, 0F)", 750L));
                                                                            animatorSet6.playTogether(ofFloat6, ofFloat7, ofFloat8, ofFloat9, LIZ, LIZ2, animatorSet7);
                                                                            animatorSet6.addListener(new IDAListenerS74S0100000_5(liveCenterEntranceWidget, 26));
                                                                            animatorSet6.start();
                                                                        } else {
                                                                            o.LJIJI("mBackground2");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mBackground2");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("mBackground2");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("mBackground2");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("mBackground2");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mBackground");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mBackground");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("violationText");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("violationIcon");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("violationText");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("houseArea");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("violationIcon");
                                throw null;
                            }
                        } else {
                            o.LJIJI("violationText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("violationText");
                        throw null;
                    }
                } else {
                    o.LJIJI("mBackground");
                    throw null;
                }
            } else {
                AnimatorSet animatorSet8 = new AnimatorSet();
                View view12 = liveCenterEntranceWidget.LJZL;
                if (view12 != null) {
                    ObjectAnimator LIZ6 = DIK.LIZ(view12, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(mBackground2, View.ALPHA, 0F, 1F)", 500L);
                    View view13 = liveCenterEntranceWidget.LJZL;
                    if (view13 != null) {
                        ObjectAnimator LIZ7 = DIK.LIZ(view13, View.ALPHA, new float[]{1.0f, 0.0f}, "ofFloat(mBackground2, View.ALPHA, 1F, 0F)", 750L);
                        View view14 = liveCenterEntranceWidget.LJZL;
                        if (view14 != null) {
                            ObjectAnimator LIZ8 = DIK.LIZ(view14, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(mBackground2, View.ALPHA, 0F, 1F)", 750L);
                            View view15 = liveCenterEntranceWidget.LJZL;
                            if (view15 != null) {
                                animatorSet8.playSequentially(LIZ6, LIZ7, LIZ8, DIK.LIZ(view15, View.ALPHA, new float[]{1.0f, 0.0f}, "ofFloat(mBackground2, View.ALPHA, 1F, 0F)", 750L));
                                animatorSet8.addListener(new C9A(liveCenterEntranceWidget, intValue2));
                                animatorSet8.start();
                            } else {
                                o.LJIJI("mBackground2");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mBackground2");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mBackground2");
                        throw null;
                    }
                } else {
                    o.LJIJI("mBackground2");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
