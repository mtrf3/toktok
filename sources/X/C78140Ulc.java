package X;

import Y.AObserverS81S0100000_13;
import Y.AUListenerS0S0200005_13;
import Y.AfS65S0100000_13;
import Y.IDAListenerS43S0200000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FullScreenSurveyStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.SurveyStyleV3Setting;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ulc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78140Ulc extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public C47061t0 LJLJI;
    public boolean LJLJJI;
    public View LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public TextureView LJLLI;
    public View LJLLILLLL;
    public SurveyViewModel LJLLJ;
    public boolean LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public boolean LJZ;
    public EnumC78141Uld LJZI;
    public final C78144Ulg LJZL;
    public final float LL;
    public final float LLD;
    public final float LLF;
    public final float LLFF;
    public float LLFFF;
    public float LLFII;
    public float LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public float LLII;
    public float LLIIII;
    public int LLIIIILZ;
    public ValueAnimator LLIIIJ;

    public final void LIZJ() {
        long j;
        float f;
        ValueAnimator valueAnimator = this.LLIIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LJLJJL;
        if (view != null) {
            float y = view.getY();
            float f2 = this.LL;
            if (y <= 0.0f && f2 <= y) {
                j = (Math.abs(y - 0.0f) / this.LLF) * LiveCoverMinSizeSetting.DEFAULT;
            } else {
                j = 0;
            }
            if (((float) j) <= 0.0f) {
                view.setY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                getSurveyContentContainer().setY(this.LLFF);
                View view2 = this.LJLIL;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                View view3 = this.LJLIL;
                if (view3 != null) {
                    C29306Beo.LJJLJLI(view3);
                }
                setCurrentInnerStatus(EnumC78141Uld.CLOSED);
                return;
            }
            View view4 = this.LJLIL;
            if (view4 != null) {
                f = view4.getAlpha();
            } else {
                f = 0.0f;
            }
            float scaleY = view.getScaleY();
            float f3 = (scaleY - 1) / (y - 0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(y, 0.0f);
            this.LLIIIJ = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(j);
            }
            ValueAnimator valueAnimator2 = this.LLIIIJ;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS0S0200005_13(y, y, scaleY, f3, f, view, this, 0));
            }
            ValueAnimator valueAnimator3 = this.LLIIIJ;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new IDAListenerS43S0200000_13(view, this, 3));
            }
            ValueAnimator valueAnimator4 = this.LLIIIJ;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    private final C47061t0 getLiveSurveyInnerBg() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-liveSurveyInnerBg>(...)");
        return (C47061t0) value;
    }

    private final C73116Smm getLiveSurveyInnerCover() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-liveSurveyInnerCover>(...)");
        return (C73116Smm) value;
    }

    private final FrameLayout getSurveyContainer() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-surveyContainer>(...)");
        return (FrameLayout) value;
    }

    private final FrameLayout getSurveyPlayerContainer() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-surveyPlayerContainer>(...)");
        return (FrameLayout) value;
    }

    public final void LIZ() {
        SurveyViewModel surveyViewModel = this.LJLLJ;
        if (surveyViewModel != null) {
            setSurveyEnable(false);
            LJ();
            surveyViewModel.gv0(surveyViewModel.hv0());
            if (FullScreenSurveyStyleSetting.INSTANCE.useLiveStreaming()) {
                View view = this.LJLJJL;
                if (view != null) {
                    view.setY(0.0f);
                }
                View view2 = this.LJLJJL;
                if (view2 != null) {
                    view2.setScaleX(1.0f);
                }
                View view3 = this.LJLJJL;
                if (view3 != null) {
                    view3.setScaleY(1.0f);
                }
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    C29306Beo.LJI(c47061t0);
                    return;
                }
                return;
            }
            InterfaceC75370Ti2 interfaceC75370Ti2 = surveyViewModel.LJZL;
            if (interfaceC75370Ti2 != null) {
                interfaceC75370Ti2.pause();
            }
            InterfaceC75370Ti2 interfaceC75370Ti22 = surveyViewModel.LJZL;
            if (interfaceC75370Ti22 == null) {
                return;
            }
            interfaceC75370Ti22.release();
        }
    }

    public final void LIZLLL() {
        long j;
        float f;
        ValueAnimator valueAnimator = this.LLIIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LJLJJL;
        if (view != null) {
            float y = view.getY();
            float f2 = this.LL;
            if (y <= 0.0f && f2 <= y) {
                j = (Math.abs(y - f2) / this.LLF) * LiveCoverMinSizeSetting.DEFAULT;
            } else {
                j = 0;
            }
            if (((float) j) <= 0.0f) {
                view.setY(this.LL);
                view.setScaleX(0.14f);
                view.setScaleY(0.14f);
                getSurveyContentContainer().setY((this.LLFF - Math.abs(this.LL)) - ((this.LLI * 0.86f) / 2));
                View view2 = this.LJLIL;
                if (view2 != null) {
                    view2.setAlpha(0.0f);
                }
                View view3 = this.LJLIL;
                if (view3 != null) {
                    C29306Beo.LJI(view3);
                }
                setCurrentInnerStatus(EnumC78141Uld.OPENED);
                return;
            }
            View view4 = this.LJLIL;
            if (view4 != null) {
                f = view4.getAlpha();
            } else {
                f = 0.0f;
            }
            float f3 = this.LL;
            float scaleY = view.getScaleY();
            float f4 = (scaleY - (1 - this.LLD)) / (y - this.LL);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(y, f3);
            this.LLIIIJ = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(j);
            }
            ValueAnimator valueAnimator2 = this.LLIIIJ;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS0S0200005_13(y, scaleY, y, f4, f, view, this, 1));
            }
            ValueAnimator valueAnimator3 = this.LLIIIJ;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new IDAListenerS43S0200000_13(view, this, 4));
            }
            ValueAnimator valueAnimator4 = this.LLIIIJ;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    public final void LJ() {
        InterfaceC75370Ti2 interfaceC75370Ti2;
        InterfaceC75370Ti2 interfaceC75370Ti22;
        View view = this.LJLIL;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        C29306Beo.LJJLJLI(this.LJLIL);
        C29306Beo.LJI(getSurveyContainer());
        ValueAnimator valueAnimator = this.LLIIIJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLIIIJ = null;
        this.LJLIL = null;
        if (FullScreenSurveyStyleSetting.INSTANCE.useLiveStreaming()) {
            View view2 = this.LJLJJL;
            if (view2 != null) {
                view2.setY(0.0f);
            }
            View view3 = this.LJLJJL;
            if (view3 != null) {
                view3.setScaleX(1.0f);
            }
            View view4 = this.LJLJJL;
            if (view4 != null) {
                view4.setScaleY(1.0f);
            }
            C47061t0 c47061t0 = this.LJLJI;
            if (c47061t0 != null) {
                C29306Beo.LJI(c47061t0);
            }
        } else {
            SurveyViewModel surveyViewModel = this.LJLLJ;
            if (surveyViewModel != null && (interfaceC75370Ti22 = surveyViewModel.LJZL) != null) {
                interfaceC75370Ti22.pause();
            }
            SurveyViewModel surveyViewModel2 = this.LJLLJ;
            if (surveyViewModel2 != null && (interfaceC75370Ti2 = surveyViewModel2.LJZL) != null) {
                interfaceC75370Ti2.release();
            }
        }
        this.LJLLL = false;
    }

    public final FrameLayout getSurveyContentContainer() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-surveyContentContainer>(...)");
        return (FrameLayout) value;
    }

    public final float getAlphaCompleteDistance() {
        return this.LLIIII;
    }

    public final float getMaxCompleteDistance() {
        return this.LLII;
    }

    public final float getRealScreenHeight() {
        return this.LLI;
    }

    public final float getRealScreenWidth() {
        return this.LLIFFJFJJ;
    }

    public final int getTouchSlop() {
        return this.LLIIIILZ;
    }

    private final void setLiveVideoContainer(View view) {
        View view2;
        View view3;
        this.LJLLILLLL = view;
        C47061t0 c47061t0 = null;
        if (view != null) {
            view2 = view.findViewById(R.id.dm7);
        } else {
            view2 = null;
        }
        this.LJLIL = view2;
        if (FullScreenSurveyStyleSetting.INSTANCE.useLiveStreaming()) {
            if (view != null) {
                view3 = view.findViewById(R.id.g0_);
            } else {
                view3 = null;
            }
            this.LJLILLLLZI = view3;
            if (view != null) {
                c47061t0 = (C47061t0) view.findViewById(R.id.kvd);
            }
            this.LJLJI = c47061t0;
            this.LJLJJL = this.LJLILLLLZI;
            C29306Beo.LJI(getLiveSurveyInnerCover());
            C29306Beo.LJI(getLiveSurveyInnerBg());
            C47061t0 c47061t02 = this.LJLJI;
            if (c47061t02 != null) {
                C29306Beo.LJI(c47061t02);
                return;
            }
            return;
        }
        C29306Beo.LJJLJLI(getLiveSurveyInnerCover());
        C29306Beo.LJJLJLI(getLiveSurveyInnerBg());
        this.LJLJJL = getLiveSurveyInnerCover();
    }

    public final void LIZIZ(Bitmap bitmap) {
        int i;
        VA9 va9;
        int LJIIL = C15380j0.LJIIL();
        int LJIIJJI = C15380j0.LJIIJJI();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 0;
        if (LJIIL < width) {
            i = (width - LJIIL) / 2;
        } else {
            i = 0;
        }
        if (LJIIJJI < height) {
            i2 = (height - LJIIJJI) / 2;
        }
        int min = Math.min(LJIIL, width);
        int min2 = Math.min(LJIIJJI, height);
        if (!bitmap.isRecycled()) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, min, min2);
            View view = this.LJLJJL;
            if ((view instanceof C73116Smm) && (va9 = (VA9) view) != null) {
                va9.setImageBitmap(createBitmap);
            }
            bitmap.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r2 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r1 < 1.0f) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r5 == false) goto L49;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r5 = super.dispatchTouchEvent(r8)
            r4 = 0
            r3 = 0
            if (r8 == 0) goto L25
            boolean r0 = r7.LJZ
            if (r0 == 0) goto L25
            float r0 = r8.getX()
            float r6 = r8.getY()
            r7.LJLLLL = r0
            int r2 = r8.getAction()
            r1 = 1
            if (r2 == 0) goto L99
            if (r2 == r1) goto Lc2
            r0 = 2
            if (r2 == r0) goto L62
            r0 = 3
            if (r2 == r0) goto Lc2
        L25:
            java.lang.String r1 = "survey dispatchTouchEvent()="
            java.lang.String r0 = ", isCurrentPointerIntercepted="
            java.lang.StringBuilder r2 = X.JBR.LJI(r1, r5, r0)
            boolean r0 = r7.LJLJJI
            r2.append(r0)
            java.lang.String r0 = " -----  event.action="
            r2.append(r0)
            if (r8 == 0) goto L41
            int r0 = r8.getAction()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L41:
            r2.append(r4)
            java.lang.String r0 = ", deltaY="
            r2.append(r0)
            if (r8 == 0) goto L5d
            float r1 = r8.getY()
        L4f:
            int r0 = (int) r1
            r2.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "Survey_LYP"
            com.bytedance.common.utility.Logger.i(r0, r1)
            return r5
        L5d:
            float r1 = (float) r3
            float r0 = r7.LJLZ
            float r1 = r1 - r0
            goto L4f
        L62:
            float r0 = r7.LJLZ
            float r6 = r6 - r0
            int r2 = (int) r6
            X.Uld r1 = r7.LJZI
            X.Uld r0 = X.EnumC78141Uld.CLOSED
            if (r1 != r0) goto L7b
            if (r2 <= 0) goto L7b
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L75:
            r0 = 0
        L76:
            r7.LJLJJI = r0
            if (r0 == 0) goto L25
            goto Lc9
        L7b:
            X.Uld r0 = X.EnumC78141Uld.OPENED
            if (r1 != r0) goto L89
            if (r2 >= 0) goto L89
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L75
        L89:
            X.Uld r0 = X.EnumC78141Uld.SCROLLING
            if (r1 != r0) goto L96
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L94:
            r0 = 1
            goto L76
        L96:
            if (r2 != 0) goto L94
            goto L75
        L99:
            float r0 = r8.getX()
            r7.LJLLLLLL = r0
            float r0 = r8.getY()
            r7.LJLZ = r0
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            android.view.View r0 = r7.LJLIL
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lbf
            float r1 = r0.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lbf
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L25
        Lbf:
            if (r5 != 0) goto L25
            goto Lc9
        Lc2:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        Lc9:
            r5 = 1
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78140Ulc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        float f;
        float f2;
        o.LJIIIZ(ev, "ev");
        if (!this.LJZ) {
            return false;
        }
        int action = ev.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    if (!this.LJLJJI) {
                        int y = (int) (ev.getY() - this.LJLZ);
                        int x = (int) (ev.getX() - this.LJLLLLLL);
                        Math.abs(y);
                        if (Math.abs(y) < Math.abs(x) && this.LJZI != EnumC78141Uld.OPENED) {
                            this.LJLJJI = false;
                        }
                        EnumC78141Uld enumC78141Uld = this.LJZI;
                        if (enumC78141Uld == EnumC78141Uld.CLOSED || enumC78141Uld == EnumC78141Uld.OPENED) {
                            return false;
                        }
                        this.LJLJJI = true;
                    }
                    return true;
                }
            }
            this.LJLJJI = false;
            if (this.LJZI != EnumC78141Uld.MOVING) {
                return false;
            }
            return true;
        }
        this.LJLLLL = ev.getX();
        float y2 = ev.getY();
        this.LJLLLLLL = this.LJLLLL;
        this.LJLZ = y2;
        View view = this.LJLJJL;
        float f3 = 0.0f;
        if (view != null) {
            f = view.getScaleY();
        } else {
            f = 0.0f;
        }
        this.LLFII = f;
        View view2 = this.LJLJJL;
        if (view2 != null) {
            f3 = view2.getY();
        }
        this.LLFZ = f3;
        this.LJLJJI = false;
        View view3 = this.LJLIL;
        if (view3 != null) {
            f2 = view3.getAlpha();
        } else {
            f2 = 1.0f;
        }
        this.LLFFF = f2;
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        Float f;
        Float f2;
        View view;
        boolean z;
        boolean z2;
        Float f3;
        View videoView;
        Bitmap bitmap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTouchEvent() -----  event.action=");
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", event.x=");
        if (motionEvent != null) {
            f = Float.valueOf(motionEvent.getX());
        } else {
            f = null;
        }
        LIZ.append(f);
        LIZ.append(", event.y=");
        if (motionEvent != null) {
            f2 = Float.valueOf(motionEvent.getY());
        } else {
            f2 = null;
        }
        LIZ.append(f2);
        Logger.i("Survey_LYP", X1D.LIZIZ(LIZ));
        if (!this.LJZ) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z3 = false;
        if (motionEvent == null || !this.LJLJJI || (view = this.LJLJJL) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    int x = (int) (motionEvent.getX() - this.LJLLLLLL);
                    int y = (int) (motionEvent.getY() - this.LJLZ);
                    if (y < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(y) >= this.LLI) {
                        return false;
                    }
                    setCurrentInnerStatus(EnumC78141Uld.MOVING);
                    if (Math.abs(y) > this.LLIIIILZ && Math.abs(y) > Math.abs(x)) {
                        if (y < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (Math.abs(y) < this.LLII) {
                            C29306Beo.LJJLJLI(getSurveyContainer());
                            float f4 = y;
                            float f5 = (this.LLF * f4) / this.LLII;
                            if (!FullScreenSurveyStyleSetting.INSTANCE.useLiveStreaming()) {
                                if (!this.LJLLL) {
                                    C29306Beo.LJJLJLI(getLiveSurveyInnerBg());
                                    C15490jB.LJ(getLiveSurveyInnerBg(), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_full_screen_survey_bg.png");
                                    C29306Beo.LJJLIIIJJI(this.LJLJJL, true);
                                    InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
                                    if (LIZIZ != null && (videoView = LIZIZ.getVideoView()) != null) {
                                        if (videoView instanceof SurfaceView) {
                                            Bitmap destBitmap = Bitmap.createBitmap(C15380j0.LJIIL(), C15380j0.LJIIJJI(), Bitmap.Config.ARGB_8888);
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                SurfaceView surfaceView = (SurfaceView) videoView;
                                                if (surfaceView.getHolder().getSurface().isValid()) {
                                                    C61663OHz c61663OHz = C61662OHy.LIZ;
                                                    o.LJIIIIZZ(destBitmap, "destBitmap");
                                                    PixelCopyOnPixelCopyFinishedListenerC78142Ule pixelCopyOnPixelCopyFinishedListenerC78142Ule = new PixelCopyOnPixelCopyFinishedListenerC78142Ule(this, destBitmap);
                                                    Handler LIZ2 = C15610jN.LIZ();
                                                    o.LJIIIIZZ(LIZ2, "getMainHandler()");
                                                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476435969, "bpea-live_feed_survey_screenshot");
                                                    c61663OHz.getClass();
                                                    OHW ohw = new OHW(LJJIIJ, "PixelCopy_request", new String[]{"screenShot"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
                                                    C78929UyL.LIZIZ(ohw, "android/view/PixelCopy", "request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V", C113554cx.LJJL(new OSZ("source", surfaceView), new OSZ("dest", destBitmap), new OSZ("listener", pixelCopyOnPixelCopyFinishedListenerC78142Ule), new OSZ("listenerThread", LIZ2)));
                                                    C39207Fa7.LIZ(ohw, new C78143Ulf(surfaceView, destBitmap, pixelCopyOnPixelCopyFinishedListenerC78142Ule, LIZ2));
                                                }
                                            }
                                        } else if ((videoView instanceof TextureView) && (bitmap = ((TextureView) videoView).getBitmap()) != null) {
                                            LIZIZ(bitmap);
                                        }
                                    }
                                    this.LJLLL = true;
                                }
                            } else {
                                C15490jB.LJ(this.LJLJI, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_full_screen_survey_bg.png");
                            }
                            float f6 = ((f4 * this.LLD) / this.LLII) + this.LLFII;
                            if (f6 < 0.14f) {
                                View view2 = this.LJLJJL;
                                if (view2 != null) {
                                    view2.setScaleX(0.14f);
                                }
                                View view3 = this.LJLJJL;
                                if (view3 != null) {
                                    view3.setScaleY(0.14f);
                                }
                            } else if (f6 > 1.0f) {
                                View view4 = this.LJLJJL;
                                if (view4 != null) {
                                    view4.setScaleX(1.0f);
                                }
                                View view5 = this.LJLJJL;
                                if (view5 != null) {
                                    view5.setScaleY(1.0f);
                                }
                            } else {
                                if (z2) {
                                    View view6 = this.LJLJJL;
                                    if (view6 != null) {
                                        view6.setScaleX(f6);
                                    }
                                    View view7 = this.LJLJJL;
                                    if (view7 != null) {
                                        view7.setScaleY(f6);
                                    }
                                    View view8 = this.LJLJJL;
                                    if (view8 != null) {
                                        view8.setY(this.LLFZ + f5);
                                    }
                                } else {
                                    View view9 = this.LJLJJL;
                                    if (view9 != null) {
                                        view9.setScaleX(f6);
                                    }
                                    View view10 = this.LJLJJL;
                                    if (view10 != null) {
                                        view10.setScaleY(f6);
                                    }
                                    View view11 = this.LJLJJL;
                                    if (view11 != null) {
                                        view11.setY(f5 + this.LLFZ);
                                    }
                                }
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("scaleImage-- down -----  imageY=");
                                View view12 = this.LJLJJL;
                                if (view12 != null) {
                                    f3 = Float.valueOf(view12.getY());
                                } else {
                                    f3 = null;
                                }
                                LIZ3.append(f3);
                                LIZ3.append(" ,scaleY=");
                                LIZ3.append(f6);
                                Logger.i("Survey_LYP", X1D.LIZIZ(LIZ3));
                                if (z) {
                                    View view13 = this.LJLIL;
                                    if (view13 != null && Math.abs(y) > this.LLIIIILZ) {
                                        float f7 = (y / this.LLIIII) + this.LLFFF;
                                        if (f7 < 0.0f) {
                                            f7 = 0.0f;
                                        } else if (f7 > 1.0f) {
                                            f7 = 1.0f;
                                        }
                                        view13.setAlpha(f7);
                                    }
                                    View view14 = this.LJLJJL;
                                    if (view14 != null && Math.abs(y) > this.LLIIIILZ) {
                                        getSurveyContentContainer().setY((this.LLFF - Math.abs(view14.getY())) - (((1 - view14.getScaleY()) * this.LLI) / 2));
                                    }
                                } else {
                                    View view15 = this.LJLIL;
                                    if (view15 != null && Math.abs(y) > this.LLIIIILZ) {
                                        float f8 = this.LLFFF - (y / this.LLIIII);
                                        if (f8 < 0.0f) {
                                            f8 = 0.0f;
                                        } else if (f8 > 1.0f) {
                                            f8 = 1.0f;
                                        }
                                        view15.setAlpha(f8);
                                    }
                                    View view16 = this.LJLJJL;
                                    if (view16 != null && Math.abs(y) > this.LLIIIILZ) {
                                        getSurveyContentContainer().setY((this.LLFF - Math.abs(view16.getY())) - (((1 - view16.getScaleY()) * this.LLI) / 2));
                                    }
                                }
                            }
                        }
                    }
                    motionEvent.getY();
                }
            }
            if (this.LJZI == EnumC78141Uld.MOVING) {
                getParent().requestDisallowInterceptTouchEvent(false);
                int y2 = (int) (motionEvent.getY() - this.LJLZ);
                if (y2 < 0) {
                    z3 = true;
                }
                setCurrentInnerStatus(EnumC78141Uld.SCROLLING);
                if (Math.abs(y2) < this.LLIIIILZ * 2) {
                    if (z3) {
                        LIZJ();
                    } else {
                        LIZLLL();
                    }
                    return true;
                }
                if (z3) {
                    LIZLLL();
                } else {
                    LIZJ();
                }
            }
        } else {
            this.LJLZ = motionEvent.getY();
            this.LLFII = view.getScaleY();
            this.LLFZ = view.getY();
        }
        return true;
    }

    public final void setAlphaCompleteDistance(float f) {
        this.LLIIII = f;
    }

    public final void setCurrentInnerStatus(EnumC78141Uld enumC78141Uld) {
        InterfaceC75370Ti2 interfaceC75370Ti2;
        this.LJZI = enumC78141Uld;
        if (FullScreenSurveyStyleSetting.INSTANCE.useLiveStreaming()) {
            if (enumC78141Uld == EnumC78141Uld.OPENED) {
                C29306Beo.LJJLJLI(getSurveyPlayerContainer());
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    C29306Beo.LJJLJLI(c47061t0);
                }
                SurveyViewModel surveyViewModel = this.LJLLJ;
                if (surveyViewModel != null) {
                    surveyViewModel.iv0();
                    return;
                }
                return;
            }
            if (enumC78141Uld != EnumC78141Uld.CLOSED) {
                return;
            }
            C29306Beo.LJI(getSurveyPlayerContainer());
            C29306Beo.LJI(getSurveyContainer());
            this.LJLLL = false;
            SurveyViewModel surveyViewModel2 = this.LJLLJ;
            if (surveyViewModel2 != null) {
                setSurveyEnable(false);
                LJ();
                surveyViewModel2.gv0(surveyViewModel2.hv0());
            }
            C47061t0 c47061t02 = this.LJLJI;
            if (c47061t02 == null) {
                return;
            }
            C29306Beo.LJI(c47061t02);
            return;
        }
        if (enumC78141Uld == EnumC78141Uld.OPENED) {
            String str = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
            if (LIZIZ != null) {
                LIZIZ.LJJIFFI(this.LJZL);
                LIZIZ.LJJJJ(str, "survey open", true);
            }
            C29306Beo.LJJLJLI(getSurveyPlayerContainer());
            if (this.LJLLI == null) {
                this.LJLLI = new TextureView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                TextureView textureView = this.LJLLI;
                if (textureView != null) {
                    textureView.setLayoutParams(layoutParams);
                }
                getSurveyPlayerContainer().addView(this.LJLLI, 0);
            }
            SurveyViewModel surveyViewModel3 = this.LJLLJ;
            if (surveyViewModel3 != null) {
                TextureView textureView2 = this.LJLLI;
                SurveyData surveyData = surveyViewModel3.LJLLL;
                if (surveyData != null && textureView2 != null) {
                    C32044Chs c32044Chs = new C32044Chs();
                    InterfaceC75370Ti2 interfaceC75370Ti22 = surveyViewModel3.LJZL;
                    if (interfaceC75370Ti22 != null) {
                        interfaceC75370Ti22.pause();
                    }
                    if (surveyViewModel3.LJZL == null) {
                        surveyViewModel3.LJZL = ((IHostWatch) CN1.LIZ(IHostWatch.class)).getVideoCleanPlayerController(textureView2, surveyData.backgroundVideo, (int) surveyData.backgroundVideoLength, c32044Chs, "live_survey_video", null);
                    }
                    InterfaceC75370Ti2 interfaceC75370Ti23 = surveyViewModel3.LJZL;
                    if (interfaceC75370Ti23 != null) {
                        interfaceC75370Ti23.start();
                    }
                }
            }
            SurveyViewModel surveyViewModel4 = this.LJLLJ;
            if (surveyViewModel4 == null) {
                return;
            }
            surveyViewModel4.iv0();
            return;
        }
        if (enumC78141Uld != EnumC78141Uld.CLOSED) {
            return;
        }
        SurveyViewModel surveyViewModel5 = this.LJLLJ;
        if (surveyViewModel5 != null && (interfaceC75370Ti2 = surveyViewModel5.LJZL) != null) {
            interfaceC75370Ti2.pause();
        }
        String str2 = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        InterfaceC28738BPq LIZIZ2 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str2);
        if (LIZIZ2 != null) {
            LIZIZ2.LJJJJ(str2, "survey close", false);
            LIZIZ2.LJJI(this.LJZL);
        }
        C29306Beo.LJI(getSurveyPlayerContainer());
        C29306Beo.LJI(getSurveyContainer());
        this.LJLLL = false;
        SurveyViewModel surveyViewModel6 = this.LJLLJ;
        if (surveyViewModel6 == null) {
            return;
        }
        setSurveyEnable(false);
        LJ();
        surveyViewModel6.gv0(surveyViewModel6.hv0());
    }

    public final void setMaxCompleteDistance(float f) {
        this.LLII = f;
    }

    public final void setRealScreenHeight(float f) {
        this.LLI = f;
    }

    public final void setRealScreenWidth(float f) {
        this.LLIFFJFJJ = f;
    }

    public final void setSurveyEnable(boolean z) {
        SurveyViewModel surveyViewModel = this.LJLLJ;
        if (surveyViewModel == null || surveyViewModel.LJLLL == null || this.LJZI != EnumC78141Uld.CLOSED || z == this.LJZ) {
            return;
        }
        this.LJZ = z;
    }

    public final void setTouchSlop(int i) {
        this.LLIIIILZ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78140Ulc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 342));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 341));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 344));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 343));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 345));
        this.LJZI = EnumC78141Uld.CLOSED;
        this.LJZL = new C78144Ulg(this);
        this.LLD = 0.86f;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dj3, this, true);
        this.LLI = C81185Vtd.LIZIZ();
        this.LLIFFJFJJ = C81185Vtd.LIZLLL();
        getSurveyContentContainer().setY(this.LLI);
        this.LLFF = this.LLI;
        this.LLIIIILZ = 5;
        float LIZ = 0.0f - (((this.LLI * 0.86f) / 2.0f) - C15380j0.LIZ(80.0f));
        this.LL = LIZ;
        this.LLF = Math.abs(0.0f - LIZ);
        this.LLIIII = C15380j0.LIZ(50.0f);
        this.LLII = this.LLI;
        LJ();
    }

    public final void LJFF(LivePlayFragment fragment, View view, long j, DataChannel dataChannel, boolean z) {
        long j2;
        NextLiveData<SurveyData> nextLiveData;
        o.LJIIIZ(fragment, "fragment");
        setSurveyEnable(false);
        if (this.LJLLJ == null) {
            SurveyViewModel surveyViewModel = (SurveyViewModel) ViewModelProviders.of(fragment).get(SurveyViewModel.class);
            this.LJLLJ = surveyViewModel;
            if (surveyViewModel != null) {
                surveyViewModel.LJLJLLL = dataChannel;
                NextLiveData<Boolean> nextLiveData2 = surveyViewModel.LJLLLL;
                if (nextLiveData2 != null) {
                    nextLiveData2.observe(fragment, new AObserverS81S0100000_13(this, 63));
                }
            }
            SurveyViewModel surveyViewModel2 = this.LJLLJ;
            if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.LJLLJ) != null) {
                nextLiveData.observe(fragment, new C78139Ulb(this, fragment, z));
            }
            SurveyViewModel surveyViewModel3 = this.LJLLJ;
            if (surveyViewModel3 != null && surveyViewModel3.LJLLL == null) {
                if (SurveyStyleV3Setting.INSTANCE.hasSecondSurvey()) {
                    j2 = 3;
                } else {
                    j2 = 2;
                }
                surveyViewModel3.LJLIL.LIZ(C1EW.LIZ(((SurveyApi) Q7L.LIZIZ(SurveyApi.class)).list(j, j2)).LJJJLIIL(new AfS65S0100000_13(surveyViewModel3, 122), C65231Pit.LJLIL));
            }
        }
        setLiveVideoContainer(view);
    }
}
