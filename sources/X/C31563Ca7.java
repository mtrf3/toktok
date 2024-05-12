package X;

import Y.ACListenerS25S0100000_5;
import Y.ALAdapterS3S0100000_4;
import Y.ALAdapterS4S0100000_5;
import Y.ARunnableS0S0204000_3;
import Y.ARunnableS6S1100000_5;
import Y.ARunnableS9S0101000_5;
import Y.AUListenerS93S0100000_4;
import Y.AUListenerS94S0100000_5;
import Y.AUListenerS96S0200000_4;
import Y.AfS57S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ca7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31563Ca7 extends ConstraintLayout implements InterfaceC76931UHf {
    public final ImageView LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final View LJLJI;
    public final C31576CaK LJLJJI;
    public final C47121t6 LJLJJL;
    public long LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public final ImageView LJLJLLL;
    public final C47121t6 LJLL;
    public final C47121t6 LJLLI;
    public final C47121t6 LJLLILLLL;
    public EnumC232569Au LJLLJ;
    public final long LJLLL;
    public final long LJLLLL;
    public final FrameLayout LJLLLLLL;
    public final C31470CWs LJLZ;
    public final C2A4 LJZ;
    public final C72431Sbj LJZI;
    public final ImageView LJZL;
    public final ImageView LL;
    public final ImageView LLD;
    public final C41081jM LLF;
    public final ConcurrentLinkedQueue<C29800Bmm> LLFF;
    public C73411SrX LLFFF;
    public C73411SrX LLFII;
    public final Handler LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public DataChannel LLIIIJ;
    public boolean LLIIIL;

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return true;
    }

    public final void LJJLL() {
        this.LLIIIILZ = false;
        if (!this.LLIIII) {
            this.LJLILLLLZI.setVisibility(0);
        }
        this.LJLLI.setVisibility(8);
        this.LJLJLLL.setVisibility(8);
        this.LJLL.setVisibility(8);
        if (this.LJLLJ == EnumC232569Au.SLEEPING) {
            this.LLD.setVisibility(0);
            float measureText = this.LJLILLLLZI.getPaint().measureText(C15380j0.LJIILJJIL(R.string.k_9)) + C15380j0.LIZ(3.0f);
            ImageView imageView = this.LLD;
            C78609UtB.LJJL((int) measureText, imageView);
            imageView.requestLayout();
        }
        this.LJLJJI.LIZIZ(0L);
    }

    public final void LJJLJLI() {
        if (this.LLFF.size() != 0 && !this.LLI) {
            LJL(this.LLFF.poll());
        }
    }

    public final DataChannel getDatachannel() {
        return this.LLIIIJ;
    }

    public final Handler getHandler1() {
        return this.LLFZ;
    }

    public final boolean getUserLevelBack() {
        return this.LLIIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJZZIII(boolean r14) {
        /*
            if (r14 == 0) goto L15
            X.Bmz r0 = X.C29813Bmz.LIZ
            r0.getClass()
            com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting r2 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.INSTANCE
            double r0 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.getSAMPLE_100()
            java.lang.String r10 = "livesdk_user_level_progress_show"
            boolean r0 = r2.isReport(r10, r0)
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r1 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            r2 = 0
            if (r1 == 0) goto Lbd
            long r13 = r1.getId()
            com.bytedance.android.live.base.model.user.User r0 = r1.getOwner()
            if (r0 == 0) goto Lbf
            com.bytedance.android.live.base.model.user.User r0 = r1.getOwner()
            long r11 = r0.getId()
        L36:
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r8 = r0.getCurrentUserId()
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.level.IUserLevelService> r0 = com.bytedance.android.livesdk.api.revenue.level.IUserLevelService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.api.revenue.level.IUserLevelService r0 = (com.bytedance.android.livesdk.api.revenue.level.IUserLevelService) r0
            X.Bmm r6 = r0.gr()
            r7 = 0
            if (r6 == 0) goto Lbb
            int r5 = r6.LIZ
        L55:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.level.IUserLevelService> r0 = com.bytedance.android.livesdk.api.revenue.level.IUserLevelService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.api.revenue.level.IUserLevelService r0 = (com.bytedance.android.livesdk.api.revenue.level.IUserLevelService) r0
            if (r0 == 0) goto Lb8
            int r4 = r0.Xy()
        L63:
            if (r6 == 0) goto L6a
            long r2 = r6.LJII
            long r0 = r6.LIZIZ
            long r2 = r2 - r0
        L6a:
            if (r5 != r4) goto L6e
            r2 = -1
        L6e:
            X.BZI r4 = X.C28787BRn.LIZ(r10)
            r4.LJIIZILJ()
            java.lang.String r1 = "room_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r4.LJIJJ(r0, r1)
            java.lang.String r1 = "anchor_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.LJIJJ(r0, r1)
            java.lang.String r1 = "user_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.LJIJJ(r0, r1)
            if (r6 == 0) goto L98
            int r1 = r6.LJFF
            r0 = 3
            if (r1 != r0) goto L98
            r7 = 1
        L98:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "is_sleep_mode"
            r4.LJIJJ(r1, r0)
            java.lang.String r1 = "coins_to_level_up"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.LJIJJ(r0, r1)
            java.lang.String r1 = "user_level"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.LJIJJ(r0, r1)
            r4.LJJIIJZLJL()
            goto L15
        Lb8:
            r4 = 50
            goto L63
        Lbb:
            r5 = 0
            goto L55
        Lbd:
            r13 = 0
        Lbf:
            r11 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31563Ca7.LJJZZIII(boolean):void");
    }

    public static void LJLI(C31563Ca7 c31563Ca7) {
        c31563Ca7.LJZL.setVisibility(0);
        C29795Bmh.LIZ = true;
        c31563Ca7.LJZL.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(c31563Ca7.LJZL, (Property<ImageView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f).setDuration(200L);
        o.LJIIIIZZ(duration, "ofFloat(levelUpAnimIv, A…1f).setDuration(duration)");
        duration.addListener(new ALAdapterS4S0100000_5(c31563Ca7, 78));
        duration.setStartDelay(4600L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration);
        animatorSet.start();
    }

    public final void LJJZ(long j) {
        this.LJLILLLLZI.setVisibility(8);
        this.LJLLI.setVisibility(0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(j);
        this.LJLLI.setText(X1D.LIZIZ(LIZ));
        this.LLD.setVisibility(8);
        this.LJLLILLLL.setVisibility(4);
        if (((float) this.LJLJJLL) + this.LJLJLJ >= this.LJLJL) {
            int LB = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).LB(j);
            this.LJLJLLL.setVisibility(0);
            this.LJLL.setVisibility(0);
            C47121t6 c47121t6 = this.LJLL;
            Locale locale = Locale.US;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k_5);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_alp_bar_approach)");
            String LLLZI = C16880lQ.LLLZI(locale, LJIILJJIL, Arrays.copyOf(new Object[]{Integer.valueOf(LB)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            c47121t6.setText(LLLZI);
        } else {
            this.LJLJLLL.setVisibility(8);
            this.LJLL.setVisibility(8);
        }
        C73411SrX c73411SrX = this.LLFFF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LLIIIILZ = true;
        this.LLFFF = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(5000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 108));
    }

    public final void LJJZZI(InterfaceC65784Pro clickListener) {
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLJI.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        layoutParams.width = -1;
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LJLLILLLL.getLayoutParams();
        layoutParams2.width = C15380j0.LIZ(230.0f);
        this.LJLLILLLL.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [T] */
    /* JADX WARN: Type inference failed for: r2v63 */
    public final void LJL(C29800Bmm c29800Bmm) {
        int i;
        int i2;
        C31576CaK c31576CaK;
        C31576CaK c31576CaK2;
        ?? r1;
        File LIZJ;
        List<String> urls;
        ?? r2;
        List<String> urls2;
        int i3;
        C76732zl c76732zl = new C76732zl();
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr != null) {
            i = gr.LJIIJJI;
        } else {
            i = 0;
        }
        c76732zl.element = i;
        C29800Bmm gr2 = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr2 != null) {
            i2 = gr2.LIZ;
        } else {
            i2 = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("from: ");
        LIZ.append(c76732zl.element);
        LIZ.append(", to: ");
        LIZ.append(i2);
        C0NB.LIZIZ("UserLevelPanel", X1D.LIZIZ(LIZ));
        LJLIIL(c29800Bmm);
        this.LJLILLLLZI.setHorizontalFadingEdgeEnabled(true);
        this.LJLILLLLZI.setWillNotDraw(false);
        C32173Cjx.LIZ(this.LJLILLLLZI);
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (c76732zl.element == i2 || ((ArrayList) this.LJLZ.getBadgeManager().LJ).size() == 0 || this.LLIIIL) {
            LJLIIIL(iUserLevelService.gr());
        }
        boolean rh = iUserLevelService.rh(c76732zl.element);
        if (this.LLI || c29800Bmm == null || this.LJLLJ == EnumC232569Au.NEVER_SEND_GIFT) {
            return;
        }
        boolean VR = ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).VR();
        int Ck0 = ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).Ck0();
        if (c76732zl.element == 0) {
            if (!C32129CjF.LIZ.LJIL && !VR) {
                C29800Bmm gr3 = iUserLevelService.gr();
                if (gr3 != null) {
                    i3 = gr3.LIZ;
                } else {
                    i3 = 0;
                }
                c76732zl.element = i3;
            } else {
                C32128CjE c32128CjE = C32129CjF.LIZ;
                if (c32128CjE.LJIL || VR) {
                    int i4 = c32128CjE.LJJ;
                    if (i4 > Ck0) {
                        Ck0 = i4;
                    }
                    c76732zl.element = Ck0;
                }
            }
        }
        this.LLI = true;
        if (c76732zl.element < i2 && this.LJLLJ == EnumC232569Au.NORMAL) {
            this.LLIFFJFJJ = true;
            ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Qm0();
            C29795Bmh.LIZIZ = true;
            C29800Bmm gr4 = iUserLevelService.gr();
            if (gr4 != null) {
                IUserLevelService iUserLevelService2 = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
                if (iUserLevelService2 != null) {
                    r1 = iUserLevelService2.fn0();
                } else {
                    r1 = 0;
                }
                int i5 = c76732zl.element;
                BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_config_exist");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(Integer.valueOf((int) r1), "is_exist");
                LIZ2.LJIJJ("gift_panel_upgrade", WM7.SCENE_SERVICE);
                LIZ2.LJIJJ(Integer.valueOf(i5), "from_grade");
                LIZ2.LJIJJ(Integer.valueOf(i2), "to_grade");
                LIZ2.LJJIIJZLJL();
                IUserLevelBackService iUserLevelBackService = (IUserLevelBackService) CN1.LIZ(IUserLevelBackService.class);
                if (iUserLevelBackService != null && iUserLevelBackService.Kc(i2, "gift_pannel_avator_privilege")) {
                    if (!rh) {
                        String str = gr4.LJIIJ;
                        if (str != null) {
                            if (!s.LJJJLZIJ(str, "#", false)) {
                                str = QZZ.LIZIZ('#', str);
                            }
                            if (!o.LJ(str, "#")) {
                                int parseColor = ColorProtector.parseColor(str);
                                this.LLFZ.postDelayed(new RunnableC31566CaA(new C56K(), this, getResources().getColor(R.color.bd), parseColor), 200L);
                                this.LLFZ.postDelayed(new RunnableC31566CaA(new C56K(), this, parseColor, getResources().getColor(R.color.bd)), 4400L);
                            }
                        }
                        UserLevelBadgeShowEnableSetting userLevelBadgeShowEnableSetting = UserLevelBadgeShowEnableSetting.INSTANCE;
                        if (userLevelBadgeShowEnableSetting.getValue()) {
                            C0NB.LIZIZ("UserLevelPanel", "Weep animation");
                            this.LL.setVisibility(0);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(C15380j0.LIZ(-20.0f), C15380j0.LIZ(20.0f));
                            ofFloat.setDuration(1000L);
                            ofFloat.setInterpolator(new InterpolatorC61445O9p(new PointF((float) 0.93d, (float) LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), new PointF((float) 0.85d, (float) 1.0d)));
                            ofFloat.addUpdateListener(new AUListenerS96S0200000_4(this.LL.getLayoutParams(), this, 6));
                            ofFloat.addListener(new ALAdapterS3S0100000_4(this, 40));
                            ofFloat.setStartDelay(400L);
                            ofFloat.start();
                        }
                        String valueOf = String.valueOf(gr4.LIZ);
                        if (!userLevelBadgeShowEnableSetting.getValue()) {
                            this.LJLZ.setVisibility(8);
                        } else {
                            this.LJLZ.setVisibility(0);
                            this.LLFZ.postDelayed(new ARunnableS6S1100000_5(this, valueOf, 5), 1240L);
                        }
                        this.LLFZ.postDelayed(new ARunnableS9S0101000_5(gr4.LIZ, this, 22), 400L);
                        LJLI(this);
                    } else {
                        this.LJZI.setVisibility(0);
                        this.LJZI.setAlpha(1.0f);
                        UserLevelBadgeShowEnableSetting userLevelBadgeShowEnableSetting2 = UserLevelBadgeShowEnableSetting.INSTANCE;
                        if (userLevelBadgeShowEnableSetting2.getValue()) {
                            this.LJLZ.setVisibility(0);
                            this.LJLZ.setAlpha(1.0f);
                        } else {
                            this.LJLZ.setVisibility(8);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(255.0f, 0.0f);
                        ofFloat2.setDuration(200L);
                        ofFloat2.setInterpolator(new LinearInterpolator());
                        ofFloat2.addUpdateListener(new AUListenerS94S0100000_5(this, 73));
                        ofFloat2.addListener(new ALAdapterS4S0100000_5(this, 75));
                        ofFloat2.start();
                        LJLIIIL(gr4);
                        this.LLFZ.postDelayed(new ARunnableS9S0101000_5(gr4.LIZ, this, 22), 400L);
                        this.LLF.setVisibility(0);
                        this.LLF.setAlpha(1.0f);
                        this.LLF.setScaleX(0.0f);
                        this.LLF.setScaleY(0.0f);
                        if (getContext() != null && (LIZJ = C15420j4.LIZJ(getContext())) != null) {
                            C68322mC c68322mC = new C68322mC();
                            ImageModel imageModel = gr4.LJ;
                            if (imageModel != null && (urls = imageModel.getUrls()) != null && urls.size() >= 1) {
                                ImageModel imageModel2 = gr4.LJ;
                                if (imageModel2 != null && (urls2 = imageModel2.getUrls()) != null) {
                                    r2 = ListProtector.get(urls2, 0);
                                } else {
                                    r2 = 0;
                                }
                                c68322mC.element = r2;
                            }
                            ImageModel imageModel3 = gr4.LJ;
                            C28993BZl c28993BZl = new C28993BZl(this, c68322mC);
                            Boolean bool = Boolean.FALSE;
                            C31663Cbj.LIZ(imageModel3, c28993BZl, LIZJ, 11, null, bool, bool, null);
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                        ofFloat3.setStartDelay(200L);
                        ofFloat3.setDuration(200L);
                        ofFloat3.addUpdateListener(new AUListenerS93S0100000_4(this, 69));
                        ofFloat3.addListener(new ALAdapterS3S0100000_4(this, 42));
                        ofFloat3.start();
                        this.LLF.setVisibility(0);
                        this.LLF.setAlpha(1.0f);
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(255.0f, 0.0f);
                        ofFloat4.setDuration(300L);
                        ofFloat4.setStartDelay(4100L);
                        ofFloat4.setInterpolator(new LinearInterpolator());
                        ofFloat4.addUpdateListener(new AUListenerS93S0100000_4(this, 68));
                        ofFloat4.addListener(new ALAdapterS3S0100000_4(this, 41));
                        ofFloat4.start();
                        if (!userLevelBadgeShowEnableSetting2.getValue()) {
                            this.LJLZ.setVisibility(8);
                        } else {
                            this.LJLZ.setVisibility(0);
                            this.LJLZ.setAlpha(0.0f);
                            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 255.0f);
                            ofFloat5.setDuration(200L);
                            ofFloat5.setStartDelay(4600L);
                            ofFloat5.setInterpolator(new LinearInterpolator());
                            ofFloat5.addUpdateListener(new AUListenerS94S0100000_5(this, 75));
                            ofFloat5.addListener(new ALAdapterS4S0100000_5(this, 77));
                            ofFloat5.start();
                        }
                        this.LJZI.setVisibility(0);
                        this.LJZI.setAlpha(0.0f);
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 255.0f);
                        ofFloat6.setDuration(300L);
                        ofFloat6.setStartDelay(4100L);
                        ofFloat6.setInterpolator(new LinearInterpolator());
                        ofFloat6.addUpdateListener(new AUListenerS94S0100000_5(this, 74));
                        ofFloat6.addListener(new ALAdapterS4S0100000_5(this, 76));
                        ofFloat6.start();
                        LJLI(this);
                    }
                    IUserLevelBackService iUserLevelBackService2 = (IUserLevelBackService) CN1.LIZ(IUserLevelBackService.class);
                    if (iUserLevelBackService2 != null) {
                        iUserLevelBackService2.aS(i2, "gift_pannel_avator_privilege");
                    }
                }
            }
            float f = this.LJLJL;
            C31565Ca9 c31565Ca9 = new C31565Ca9(i2, c29800Bmm, this, c76732zl);
            this.LJLJLJ = f;
            if (this.LLIIIL && (c31576CaK2 = this.LJLJJI) != null) {
                c31576CaK2.setLevelProgress(f);
            }
            C31576CaK c31576CaK3 = this.LJLJJI;
            c31576CaK3.LIZ(c31576CaK3.LJLJJL, f, c31565Ca9);
        } else {
            setMaxProgress(c29800Bmm);
            long j = c29800Bmm.LJIIIIZZ / 86400;
            Long valueOf2 = Long.valueOf(j);
            Long lastShowTime = InterfaceC30442Bx8.j0.LIZJ();
            long LIZ3 = C30725C4b.LIZ();
            if (valueOf2 != null && valueOf2.longValue() <= 2 && valueOf2.longValue() != 0) {
                o.LJIIIIZZ(lastShowTime, "lastShowTime");
                if (LIZ3 - lastShowTime.longValue() >= 86400000 && !C29306Beo.LJJIIJ(this.LJLLILLLL) && !this.LLIIII && !this.LLIIIILZ) {
                    this.LJLLILLLL.setVisibility(0);
                    C47121t6 c47121t6 = this.LJLLILLLL;
                    Locale locale = Locale.US;
                    int i6 = (int) j;
                    String LJII = C15380j0.LJII(R.plurals.kd, i6);
                    o.LJIIIIZZ(LJII, "getQuantityString(\n     …(),\n                    )");
                    String LLLZI = C16880lQ.LLLZI(locale, LJII, Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1));
                    o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                    c47121t6.setText(LLLZI);
                    if (!C29306Beo.LJJIIJ(this.LJLLI)) {
                        this.LLD.setVisibility(0);
                        TextPaint paint = this.LJLLILLLL.getPaint();
                        String LJII2 = C15380j0.LJII(R.plurals.kd, i6);
                        o.LJIIIIZZ(LJII2, "getQuantityString(\n     …                        )");
                        String LLLZI2 = C16880lQ.LLLZI(locale, LJII2, Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1));
                        o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                        float measureText = paint.measureText(LLLZI2) + C15380j0.LIZ(3.0f);
                        ImageView imageView = this.LLD;
                        C78609UtB.LJJL((int) measureText, imageView);
                        imageView.requestLayout();
                    }
                    this.LLIIII = true;
                    this.LJLILLLLZI.setVisibility(8);
                    this.LLFII = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(5000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 109));
                }
            }
            if (i2 == ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Xy()) {
                if (this.LJLLJ == EnumC232569Au.NORMAL) {
                    this.LJLILLLLZI.setText(C15380j0.LJIILJJIL(R.string.k_6));
                }
                float f2 = this.LJLJL;
                C31569CaD c31569CaD = new C31569CaD(this);
                this.LJLJLJ = f2;
                this.LJLJJI.LIZ(f2, f2, c31569CaD);
            } else {
                float f3 = (float) (c29800Bmm.LIZIZ - c29800Bmm.LJI);
                C31570CaE c31570CaE = new C31570CaE(this);
                this.LJLJLJ = f3;
                if (this.LLIIIL && (c31576CaK = this.LJLJJI) != null) {
                    c31576CaK.setLevelProgress(f3);
                }
                C31576CaK c31576CaK4 = this.LJLJJI;
                c31576CaK4.LIZ(c31576CaK4.LJLJJL, f3, c31570CaE);
            }
        }
        this.LLIIIL = false;
    }

    public final void LJLIIIL(C29800Bmm c29800Bmm) {
        BadgeStruct badgeStruct;
        File LIZJ;
        if (c29800Bmm != null && (badgeStruct = c29800Bmm.LIZJ) != null) {
            badgeStruct.badgeDisplayType = 5;
            List<BadgeStruct> LJJIJIL = C47261Igj.LJJIJIL(badgeStruct);
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            if (interfaceC05190Ih != null) {
                if (getContext() != null && (LIZJ = C15420j4.LIZJ(getContext())) != null) {
                    ImageModel avatarThumb = interfaceC05190Ih.getAvatarThumb();
                    C31568CaC c31568CaC = new C31568CaC(this);
                    Boolean bool = Boolean.FALSE;
                    C31663Cbj.LIZ(avatarThumb, c31568CaC, LIZJ, 12, null, bool, bool, null);
                }
                if (UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
                    this.LJLZ.setVisibility(0);
                } else {
                    this.LJLZ.setVisibility(8);
                }
                this.LJLZ.LIZ(false, LJJIJIL, (User) interfaceC05190Ih, 6, new AqS155S0100000_5(this, 211), null, true);
            }
        }
    }

    public final void LJLIIL(C29800Bmm c29800Bmm) {
        boolean z;
        boolean z2;
        if (c29800Bmm != null && c29800Bmm.LJFF == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJLLJ = EnumC232569Au.SLEEPING;
            if (!C29306Beo.LJJIIJ(this.LJLLI)) {
                this.LLD.setVisibility(0);
                float measureText = this.LJLILLLLZI.getPaint().measureText(C15380j0.LJIILJJIL(R.string.k_9)) + C15380j0.LIZ(3.0f);
                ImageView imageView = this.LLD;
                C78609UtB.LJJL((int) measureText, imageView);
                imageView.requestLayout();
            }
            this.LJLJJI.setVisibility(0);
            this.LJLJJI.setLevelProgressColor(true);
            this.LJLILLLLZI.setText(C15380j0.LJIILJJIL(R.string.k_9));
            FrameLayout frameLayout = this.LJLLLLLL;
            C78609UtB.LJJLIIIIJ(C15380j0.LIZ(12.0f), frameLayout);
            frameLayout.requestLayout();
            return;
        }
        if (c29800Bmm != null && c29800Bmm.LIZIZ == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || c29800Bmm == null) {
            this.LJLLJ = EnumC232569Au.NEVER_SEND_GIFT;
            this.LLD.setVisibility(8);
            this.LJLJJI.setVisibility(8);
            this.LJLILLLLZI.setText(C15380j0.LJIILJJIL(R.string.k_8));
            FrameLayout frameLayout2 = this.LJLLLLLL;
            C78609UtB.LJJLIIIIJ(C15380j0.LIZ(15.0f), frameLayout2);
            frameLayout2.requestLayout();
            return;
        }
        this.LJLLJ = EnumC232569Au.NORMAL;
        if (!C29306Beo.LJJIIJ(this.LJLLILLLL)) {
            this.LLD.setVisibility(8);
        }
        if (!this.LLI) {
            this.LJLJJI.setVisibility(0);
        }
        this.LJLJJI.setLevelProgressColor(false);
        long j = c29800Bmm.LJII - c29800Bmm.LIZIZ;
        if (c29800Bmm.LIZ == ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Xy()) {
            this.LJLILLLLZI.setText(C15380j0.LJIILJJIL(R.string.k_6));
        } else {
            Locale locale = Locale.US;
            int i = (int) j;
            String LJII = C15380j0.LJII(R.plurals.kc, i);
            o.LJIIIIZZ(LJII, "getQuantityString(\n     …                        )");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, locale, LJII, "format(locale, format, *args)"));
            C23010vJ.LIZJ(getContext(), spannableStringBuilder, 0, String.valueOf(j).length(), 33, 6, 600);
            this.LJLILLLLZI.setText(spannableStringBuilder);
        }
        FrameLayout frameLayout3 = this.LJLLLLLL;
        C78609UtB.LJJLIIIIJ(C15380j0.LIZ(12.0f), frameLayout3);
        frameLayout3.requestLayout();
    }

    public final void setDatachannel(DataChannel dataChannel) {
        this.LLIIIJ = dataChannel;
    }

    public final void setMaxProgress(C29800Bmm c29800Bmm) {
        Float valueOf;
        if (c29800Bmm != null && (valueOf = Float.valueOf(((float) c29800Bmm.LJII) - ((float) c29800Bmm.LJI))) != null && !o.LIZJ(valueOf, 0.0f)) {
            this.LJLJL = valueOf.floatValue();
            this.LJLJJI.setMaxProgress(valueOf.floatValue());
        }
    }

    public final void setPlayingBarAnimation(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setUpdateProgressBar(boolean z) {
        this.LLI = z;
    }

    public final void setUserLevelBack(boolean z) {
        this.LLIIIL = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31563Ca7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31563Ca7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View view;
        a1.LJFF(context, "context");
        this.LJLLJ = EnumC232569Au.NEVER_SEND_GIFT;
        this.LJLLL = 200L;
        this.LJLLLL = 4400L;
        this.LLFF = new ConcurrentLinkedQueue<>();
        this.LLFZ = new Handler(C16880lQ.LLJJJJ());
        ViewGroup.inflate(context, R.layout.dot, this);
        View findViewById = findViewById(R.id.mzd);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.user_level_detail)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.gyi);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.need_to_upgrade)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = findViewById(R.id.i5b);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.privilege_center_container)");
        this.LJLJI = findViewById3;
        o.LJIIIIZZ(findViewById(R.id.i59), "findViewById(R.id.privilege_center)");
        View findViewById4 = findViewById(R.id.mz_);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.user_level_bar)");
        this.LJLJJI = (C31576CaK) findViewById4;
        View findViewById5 = findViewById(R.id.mum);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.upgrade_arrow)");
        this.LJLJLLL = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.mun);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.upgrade_text)");
        this.LJLL = (C47121t6) findViewById6;
        View findViewById7 = findViewById(R.id.duk);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.gift_preview_score)");
        this.LJLLI = (C47121t6) findViewById7;
        View findViewById8 = findViewById(R.id.mul);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.upgrade_animation_text)");
        this.LJLJJL = (C47121t6) findViewById8;
        View findViewById9 = findViewById(R.id.mzc);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.user_level_description)");
        this.LJLLLLLL = (FrameLayout) findViewById9;
        View findViewById10 = findViewById(R.id.dtw);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.gift_panel_badge_view)");
        C31470CWs c31470CWs = (C31470CWs) findViewById10;
        this.LJLZ = c31470CWs;
        ViewGroup.LayoutParams layoutParams = c31470CWs.getLayoutParams();
        layoutParams.width = C15380j0.LIZ(33.0f);
        c31470CWs.setLayoutParams(layoutParams);
        View findViewById11 = findViewById(R.id.jwe);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.shine_light_anim_iv)");
        this.LJZ = (C2A4) findViewById11;
        View findViewById12 = findViewById(R.id.my_);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.user_avatar_iv)");
        this.LJZI = (C72431Sbj) findViewById12;
        View findViewById13 = findViewById(R.id.fq4);
        o.LJIIIIZZ(findViewById13, "findViewById(R.id.level_up_anim_iv)");
        ImageView imageView = (ImageView) findViewById13;
        this.LJZL = imageView;
        View findViewById14 = findViewById(R.id.kwj);
        o.LJIIIIZZ(findViewById14, "findViewById(R.id.sweep_light_img)");
        this.LL = (ImageView) findViewById14;
        View findViewById15 = findViewById(R.id.k46);
        o.LJIIIIZZ(findViewById15, "findViewById(R.id.sleep_question)");
        ImageView imageView2 = (ImageView) findViewById15;
        this.LLD = imageView2;
        View findViewById16 = findViewById(R.id.afn);
        o.LJIIIIZZ(findViewById16, "findViewById(R.id.badge_avatar_iv)");
        this.LLF = (C41081jM) findViewById16;
        View findViewById17 = findViewById(R.id.nj5);
        o.LJIIIIZZ(findViewById17, "findViewById(R.id.will_sleep_text)");
        this.LJLLILLLL = (C47121t6) findViewById17;
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (C29795Bmh.LIZ) {
            imageView.setVisibility(0);
        }
        setMaxProgress(gr);
        LJLIIIL(gr);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 462)));
        int LJIIJJI = C87277YNd.LJIIJJI(15);
        int LJIIJJI2 = C87277YNd.LJIIJJI(15);
        int LJIIJJI3 = C87277YNd.LJIIJJI(15);
        int LJIIJJI4 = C87277YNd.LJIIJJI(15);
        Object parent = imageView2.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.post(new ARunnableS0S0204000_3(imageView2, LJIIJJI, LJIIJJI2, LJIIJJI3, LJIIJJI4, view, 3));
        }
        C16880lQ.LJIILLIIL(imageView2, new ACListenerS25S0100000_5(this, 463));
        LJLIIL(gr);
    }
}
