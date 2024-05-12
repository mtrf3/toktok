package Y;

import X.C06460Ne;
import X.C110614Vt;
import X.C19N;
import X.C26338AVi;
import X.C32151Nz;
import X.C54112LLo;
import X.C54119LLv;
import X.C54444LYi;
import X.C54451LYp;
import X.C54689LdF;
import X.C61328O5c;
import X.C7MY;
import X.L7K;
import X.MEP;
import X.O6R;
import X.ViewOnClickListenerC56819MRr;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.feed.ui.ViewWrapper;
import com.ss.android.ugc.aweme.feed.vm.FollowLiveSkyLightRelatedVM;
import com.ss.android.ugc.aweme.popularfeed.ui.PopularFeedToFYPAssem;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedToFYPAssem;
import com.ss.android.ugc.aweme.topicfeed.ui.TopicFeedToFYPAssem;
import com.ss.android.ugc.aweme.ui.NearbyFeedToFYPAssem;
import com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS33S0001000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDTListenerS118S0100000_9 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            case 10:
                return onTouch$10(this, view, motionEvent);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case 12:
                return onTouch$12(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS118S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r3 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.IDTListenerS118S0100000_9 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDTListenerS118S0100000_9.onTouch$0(Y.IDTListenerS118S0100000_9, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        Drawable LIZ;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            Object value = ((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).LJLL.getValue();
            o.LJIIIIZZ(value, "<get-moreClickArea>(...)");
            ((View) value).setBackground(null);
            ((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).Y().setBackground(null);
            return false;
        }
        if (((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).V().getVisibility() == 0) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = C19N.LIZIZ(view, "v.context", R.attr.dr);
            c110614Vt.LJIIJ = C61328O5c.LIZJ(4);
            c110614Vt.LJIIJJI = C61328O5c.LIZJ(4);
            LIZ = C06460Ne.LIZ(view, "v.context", c110614Vt);
        } else {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZ = C19N.LIZIZ(view, "v.context", R.attr.dr);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(4);
            LIZ = C06460Ne.LIZ(view, "v.context", c110614Vt2);
        }
        Object value2 = ((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).LJLL.getValue();
        o.LJIIIIZZ(value2, "<get-moreClickArea>(...)");
        ((View) value2).setBackground(LIZ);
        ((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).Y().setBackground(LIZ);
        return false;
    }

    public static final boolean onTouch$10(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                StemFeedToFYPAssem stemFeedToFYPAssem = (StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                float f = stemFeedToFYPAssem.LJLLL;
                if (f - y < (-stemFeedToFYPAssem.LJLLLL)) {
                    stemFeedToFYPAssem.H3("slide_down");
                    ((StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                } else {
                    float abs = Math.abs(f - y);
                    StemFeedToFYPAssem stemFeedToFYPAssem2 = (StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                    if (abs < stemFeedToFYPAssem2.LJLLLL) {
                        float abs2 = Math.abs(stemFeedToFYPAssem2.LJLLJ - x);
                        StemFeedToFYPAssem stemFeedToFYPAssem3 = (StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                        if (abs2 < stemFeedToFYPAssem3.LJLLLL) {
                            stemFeedToFYPAssem3.H3("click_shadow");
                            ((StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                        }
                    }
                }
            }
        } else {
            StemFeedToFYPAssem stemFeedToFYPAssem4 = (StemFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
            stemFeedToFYPAssem4.LJLLJ = x;
            stemFeedToFYPAssem4.LJLLL = y;
        }
        return true;
    }

    public static final boolean onTouch$11(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        Integer num;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                C54112LLo c54112LLo = (C54112LLo) iDTListenerS118S0100000_9.l0;
                if (c54112LLo.LJIILIIL == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
                    ofFloat.setDuration(100L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new AUListenerS97S0100000_9(c54112LLo, 63));
                    ofFloat.addListener(new C54119LLv());
                    c54112LLo.LJIILIIL = ofFloat;
                }
                ValueAnimator valueAnimator5 = c54112LLo.LJIILIIL;
                if (valueAnimator5 != null && valueAnimator5.isRunning() && (valueAnimator4 = c54112LLo.LJIILIIL) != null) {
                    valueAnimator4.cancel();
                }
                if ((((Boolean) c54112LLo.LJIILL.getValue()).booleanValue() || (((Boolean) c54112LLo.LJIILJJIL.getValue()).booleanValue() && c54112LLo.LIZ.LJLL != null)) && (valueAnimator3 = c54112LLo.LJIILIIL) != null) {
                    valueAnimator3.start();
                }
            } else if (num.intValue() == 1 || num.intValue() == 3) {
                C54112LLo c54112LLo2 = (C54112LLo) iDTListenerS118S0100000_9.l0;
                if (c54112LLo2.LJIIL == null) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.9f, 1.0f);
                    ofFloat2.setDuration(100L);
                    ofFloat2.setInterpolator(new LinearInterpolator());
                    ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(c54112LLo2, 62));
                    ofFloat2.addListener(new ALAdapterS7S0100000_9(c54112LLo2, 17));
                    c54112LLo2.LJIIL = ofFloat2;
                }
                ValueAnimator valueAnimator6 = c54112LLo2.LJIIL;
                if (valueAnimator6 != null && valueAnimator6.isRunning() && (valueAnimator2 = c54112LLo2.LJIIL) != null) {
                    valueAnimator2.cancel();
                }
                if ((((Boolean) c54112LLo2.LJIILL.getValue()).booleanValue() || (((Boolean) c54112LLo2.LJIILJJIL.getValue()).booleanValue() && c54112LLo2.LIZ.getTabIconViewScaleX() < 1.0f)) && (valueAnimator = c54112LLo2.LJIIL) != null) {
                    valueAnimator.start();
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$12(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        FollowSkyLightHelper followSkyLightHelper = (FollowSkyLightHelper) iDTListenerS118S0100000_9.l0;
        if (followSkyLightHelper.LJIIJJI) {
            C54444LYi c54444LYi = followSkyLightHelper.LIZJ;
            if (c54444LYi != null) {
                boolean LIZLLL = C26338AVi.LIZLLL(c54444LYi);
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        FollowSkyLightHelper followSkyLightHelper2 = (FollowSkyLightHelper) iDTListenerS118S0100000_9.l0;
                        if (followSkyLightHelper2.LJIIIZ) {
                            C54444LYi c54444LYi2 = followSkyLightHelper2.LIZJ;
                            if (c54444LYi2 != null) {
                                if (c54444LYi2.LIZIZ()) {
                                    ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIIIZZ = motionEvent.getRawX();
                                    ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIIZ = false;
                                }
                            } else {
                                o.LJIJI("mListView");
                                throw null;
                            }
                        } else {
                            int rawX = (int) (followSkyLightHelper2.LJIIIIZZ - motionEvent.getRawX());
                            if (LIZLLL) {
                                rawX = -rawX;
                            }
                            ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIIIZZ = motionEvent.getRawX();
                            if (L7K.LIZIZ) {
                                C54444LYi c54444LYi3 = ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LIZJ;
                                if (c54444LYi3 != null) {
                                    FollowLiveSkyLightRelatedVM followLiveSkyLightRelatedVM = c54444LYi3.getFollowLiveSkyLightRelatedVM();
                                    followLiveSkyLightRelatedVM.getClass();
                                    followLiveSkyLightRelatedVM.setState(new AqS33S0001000_9(rawX, 6));
                                } else {
                                    o.LJIJI("mListView");
                                    throw null;
                                }
                            } else {
                                C54444LYi c54444LYi4 = ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LIZJ;
                                if (c54444LYi4 != null) {
                                    C54689LdF adapter = c54444LYi4.getAdapter();
                                    ViewWrapper viewWrapper = adapter.LJLJI;
                                    if (viewWrapper != null) {
                                        int width = viewWrapper.getWidth() + rawX;
                                        int i = adapter.LJLJJI;
                                        if (width >= i) {
                                            viewWrapper.setWidth(i);
                                            viewWrapper.getHeight();
                                            O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
                                        } else if (viewWrapper.getWidth() + rawX < adapter.LJLJJI) {
                                            viewWrapper.setWidth(viewWrapper.getWidth() + rawX);
                                            viewWrapper.setHeight(viewWrapper.getHeight() + (rawX / 2));
                                        } else {
                                            viewWrapper.getWidth();
                                            viewWrapper.getHeight();
                                        }
                                    }
                                } else {
                                    o.LJIJI("mListView");
                                    throw null;
                                }
                            }
                            FollowSkyLightHelper followSkyLightHelper3 = (FollowSkyLightHelper) iDTListenerS118S0100000_9.l0;
                            int i2 = followSkyLightHelper3.LJIIJ + rawX;
                            followSkyLightHelper3.LJIIJ = i2;
                            if (i2 >= C7MY.LIZIZ(34)) {
                                ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJ();
                                FollowSkyLightHelper followSkyLightHelper4 = (FollowSkyLightHelper) iDTListenerS118S0100000_9.l0;
                                followSkyLightHelper4.LJIIJ = 0;
                                followSkyLightHelper4.LJIIIZ = true;
                            }
                        }
                    }
                } else {
                    if (!((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIIZ) {
                        double rawX2 = (r1.LJIIIIZZ - motionEvent.getRawX()) * 0.8d;
                        if (LIZLLL) {
                            rawX2 *= -1;
                        }
                        int i3 = (int) (r5.LJIIJ + rawX2);
                        ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIJ = i3;
                        if (i3 >= C7MY.LIZIZ(34)) {
                            ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJ();
                        } else if (((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LJIIJ < C7MY.LIZIZ(34)) {
                            if (L7K.LIZIZ) {
                                C54444LYi c54444LYi5 = ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LIZJ;
                                if (c54444LYi5 != null) {
                                    c54444LYi5.getFollowLiveSkyLightRelatedVM().setState(C54451LYp.LJLIL);
                                } else {
                                    o.LJIJI("mListView");
                                    throw null;
                                }
                            } else {
                                C54444LYi c54444LYi6 = ((FollowSkyLightHelper) iDTListenerS118S0100000_9.l0).LIZJ;
                                if (c54444LYi6 != null) {
                                    ViewWrapper viewWrapper2 = c54444LYi6.getAdapter().LJLJI;
                                    if (viewWrapper2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper2, "width", viewWrapper2.getWidth(), C7MY.LIZIZ(6));
                                        o.LJIIIIZZ(ofInt, "ofInt(this, \"width\", width, 6.dp)");
                                        arrayList.add(ofInt);
                                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper2, "height", viewWrapper2.getHeight(), C7MY.LIZIZ(64));
                                        o.LJIIIIZZ(ofInt2, "ofInt(this, \"height\", height, 64.dp)");
                                        arrayList.add(ofInt2);
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(arrayList);
                                        animatorSet.setDuration(300L);
                                        animatorSet.start();
                                    }
                                } else {
                                    o.LJIJI("mListView");
                                    throw null;
                                }
                            }
                        }
                        FollowSkyLightHelper followSkyLightHelper5 = (FollowSkyLightHelper) iDTListenerS118S0100000_9.l0;
                        followSkyLightHelper5.LJIIIZ = true;
                        followSkyLightHelper5.LJIIJ = 0;
                    }
                }
            } else {
                o.LJIJI("mListView");
                throw null;
            }
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view.setBackground(((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).LLII);
            return false;
        }
        ((ViewOnClickListenerC56819MRr) iDTListenerS118S0100000_9.l0).LLII = view.getBackground();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C19N.LIZIZ(view, "v.context", R.attr.dr);
        c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(4);
        c110614Vt.LJIIIZ = C61328O5c.LIZJ(4);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "v.context");
        view.setBackground(c110614Vt.LIZ(context));
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        return ((MTAwemeListFragment) iDTListenerS118S0100000_9.l0).LLJL;
    }

    public static final boolean onTouch$4(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                NearbyFeedToFYPAssem nearbyFeedToFYPAssem = (NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                float f = nearbyFeedToFYPAssem.LJLLL;
                if (f - y < (-nearbyFeedToFYPAssem.LJLLLL)) {
                    nearbyFeedToFYPAssem.H3("slide_down");
                    ((NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                } else {
                    float abs = Math.abs(f - y);
                    NearbyFeedToFYPAssem nearbyFeedToFYPAssem2 = (NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                    if (abs < nearbyFeedToFYPAssem2.LJLLLL) {
                        float abs2 = Math.abs(nearbyFeedToFYPAssem2.LJLLJ - x);
                        NearbyFeedToFYPAssem nearbyFeedToFYPAssem3 = (NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                        if (abs2 < nearbyFeedToFYPAssem3.LJLLLL) {
                            nearbyFeedToFYPAssem3.H3("click_shadow");
                            ((NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                        }
                    }
                }
            }
        } else {
            NearbyFeedToFYPAssem nearbyFeedToFYPAssem4 = (NearbyFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
            nearbyFeedToFYPAssem4.LJLLJ = x;
            nearbyFeedToFYPAssem4.LJLLL = y;
        }
        return true;
    }

    public static final boolean onTouch$5(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent event) {
        MEP mep = ((PinchComponent) iDTListenerS118S0100000_9.l0).LL;
        if (mep != null) {
            o.LJIIIIZZ(event, "event");
            return mep.LIZIZ(event);
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent event) {
        MEP mep = ((PinchComponent) iDTListenerS118S0100000_9.l0).LL;
        if (mep != null) {
            o.LJIIIIZZ(event, "event");
            return mep.LIZIZ(event);
        }
        return false;
    }

    public static final boolean onTouch$7(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1) {
            ((EdgeSlideGuideAssem) iDTListenerS118S0100000_9.l0).H3();
        }
        return true;
    }

    public static final boolean onTouch$8(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                TopicFeedToFYPAssem topicFeedToFYPAssem = (TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                float f = topicFeedToFYPAssem.LJLLL;
                if (f - y < (-topicFeedToFYPAssem.LJLLLL)) {
                    topicFeedToFYPAssem.H3("slide_down");
                    ((TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                } else {
                    float abs = Math.abs(f - y);
                    TopicFeedToFYPAssem topicFeedToFYPAssem2 = (TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                    if (abs < topicFeedToFYPAssem2.LJLLLL) {
                        float abs2 = Math.abs(topicFeedToFYPAssem2.LJLLJ - x);
                        TopicFeedToFYPAssem topicFeedToFYPAssem3 = (TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                        if (abs2 < topicFeedToFYPAssem3.LJLLLL) {
                            topicFeedToFYPAssem3.H3("click_shadow");
                            ((TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                        }
                    }
                }
            }
        } else {
            TopicFeedToFYPAssem topicFeedToFYPAssem4 = (TopicFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
            topicFeedToFYPAssem4.LJLLJ = x;
            topicFeedToFYPAssem4.LJLLL = y;
        }
        return true;
    }

    public static final boolean onTouch$9(IDTListenerS118S0100000_9 iDTListenerS118S0100000_9, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                PopularFeedToFYPAssem popularFeedToFYPAssem = (PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                float f = popularFeedToFYPAssem.LJLLL;
                if (f - y < (-popularFeedToFYPAssem.LJLLLL)) {
                    popularFeedToFYPAssem.H3("slide_down");
                    ((PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                } else {
                    float abs = Math.abs(f - y);
                    PopularFeedToFYPAssem popularFeedToFYPAssem2 = (PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                    if (abs < popularFeedToFYPAssem2.LJLLLL) {
                        float abs2 = Math.abs(popularFeedToFYPAssem2.LJLLJ - x);
                        PopularFeedToFYPAssem popularFeedToFYPAssem3 = (PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
                        if (abs2 < popularFeedToFYPAssem3.LJLLLL) {
                            popularFeedToFYPAssem3.H3("click_shadow");
                            ((PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0).LJLLL();
                        }
                    }
                }
            }
        } else {
            PopularFeedToFYPAssem popularFeedToFYPAssem4 = (PopularFeedToFYPAssem) iDTListenerS118S0100000_9.l0;
            popularFeedToFYPAssem4.LJLLJ = x;
            popularFeedToFYPAssem4.LJLLL = y;
        }
        return true;
    }
}
