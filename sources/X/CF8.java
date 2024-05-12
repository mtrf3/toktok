package X;

import Y.AUListenerS94S0100000_5;
import Y.IDAListenerS74S0100000_5;
import Y.IDHandlerS18S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.livesetting.level.LiveBarrageReleasePlayerTimeSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CF8 {
    public final View LIZ;
    public final CFN LIZIZ;
    public C15540jG LIZJ;
    public CFG LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 387));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS155S0100000_5(this, 384));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 383));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS155S0100000_5(this, 398));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 399));
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 386));
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 385));
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
    public final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 391));
    public final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 380));
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 395));
    public final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 389));
    public final C62822Ol8 LJIIZILJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 388));
    public final C62822Ol8 LJIJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 382));
    public final C62822Ol8 LJIJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 381));
    public final C62822Ol8 LJIJJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 379));
    public final C62822Ol8 LJIJJLI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 394));
    public final C62822Ol8 LJIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 396));
    public final C62822Ol8 LJJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 393));
    public final C62822Ol8 LJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 392));
    public final C62822Ol8 LJJIFFI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 397));
    public final C62822Ol8 LJJII = C221108m2.LIZIZ(new AqS155S0100000_5(this, 401));
    public int LJJIII;
    public int LJJIIJ;
    public final int LJJIIJZLJL;
    public boolean LJJIIZ;
    public final boolean LJJIIZI;
    public CF5 LJJIJ;
    public IDHandlerS18S0100000_5 LJJIJIIJI;
    public final long LJJIJIIJIL;

    public final void LIZJ() {
        this.LJJIIZ = false;
        VA9 va9 = (VA9) this.LJIJJLI.getValue();
        if (va9 != null) {
            va9.setImageDrawable(null);
        }
        C47061t0 LJIILL = LJIILL();
        if (LJIILL != null) {
            LJIILL.setImageDrawable(null);
        }
    }

    public final void LJ() {
        IDHandlerS18S0100000_5 iDHandlerS18S0100000_5;
        long j = this.LJJIJIIJIL;
        if (j > 0 && this.LIZLLL != null && (iDHandlerS18S0100000_5 = this.LJJIJIIJI) != null) {
            iDHandlerS18S0100000_5.sendEmptyMessageDelayed(1, j);
        }
        FrameLayout LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL != null) {
            LJIILLIIL.setVisibility(8);
        }
        CFG cfg = this.LIZLLL;
        if (cfg != null) {
            cfg.LIZLLL = "";
            cfg.LJ = "";
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = cfg.LIZIZ;
            if (iLiveGiftDelegatePlayerService != null) {
                iLiveGiftDelegatePlayerService.tryCancel(cfg.LIZJ);
            }
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = cfg.LIZIZ;
            if (iLiveGiftDelegatePlayerService2 != null) {
                iLiveGiftDelegatePlayerService2.clearMasks(cfg.LIZJ);
            }
        }
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        LJIL(1.0f);
        C15540jG c15540jG = this.LIZJ;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
        this.LIZJ = null;
        LJIIZILJ();
    }

    public final CFM LJFF() {
        return (CFM) this.LJIILJJIL.getValue();
    }

    public final C47061t0 LJI() {
        return (C47061t0) this.LJIJI.getValue();
    }

    public final Space LJII() {
        return (Space) this.LJIJ.getValue();
    }

    public final LinearLayout LJIIIIZZ() {
        return (LinearLayout) this.LJ.getValue();
    }

    public final C47061t0 LJIIIZ() {
        return (C47061t0) this.LJIIZILJ.getValue();
    }

    public final Space LJIIJ() {
        return (Space) this.LJIILLIIL.getValue();
    }

    public final ConstraintLayout LJIIJJI() {
        return (ConstraintLayout) this.LJIIL.getValue();
    }

    public final LinearLayout LJIIL() {
        return (LinearLayout) this.LJIILIIL.getValue();
    }

    public final C47121t6 LJIILIIL() {
        return (C47121t6) this.LJJ.getValue();
    }

    public final Space LJIILJJIL() {
        return (Space) this.LJIILL.getValue();
    }

    public final C47061t0 LJIILL() {
        return (C47061t0) this.LJIL.getValue();
    }

    public final FrameLayout LJIILLIIL() {
        return (FrameLayout) this.LJJII.getValue();
    }

    public final void LJIJI() {
        CFG cfg = this.LIZLLL;
        if (cfg != null) {
            cfg.LJ = "";
            cfg.LIZLLL = "";
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = cfg.LIZIZ;
            if (iLiveGiftDelegatePlayerService != null) {
                iLiveGiftDelegatePlayerService.releasePlayer(cfg.LIZJ, cfg.LJFF, cfg.LIZ);
            }
            cfg.LJI = null;
            cfg.LIZJ = null;
            cfg.LJFF = null;
            cfg.LIZIZ = null;
        }
        this.LIZLLL = null;
    }

    public final void LJIIZILJ() {
        ConstraintLayout LJIIJJI = LJIIJJI();
        if (LJIIJJI != null) {
            LJIIJJI.setVisibility(8);
        }
        LinearLayout LJIIL = LJIIL();
        if (LJIIL == null) {
            return;
        }
        LJIIL.setBackground(null);
    }

    public static TranslateAnimation LIZLLL(Animation.AnimationListener animationListener) {
        int i;
        if (C15380j0.LJIIZILJ()) {
            i = -1;
        } else {
            i = 1;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, (-1.0f) * i, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new C83741Wtl(0.12f, 0.5f, 0.21f, 1.0f));
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        return translateAnimation;
    }

    public final void LJIL(float f) {
        CFM LJFF = LJFF();
        if (LJFF != null) {
            LJFF.setAlpha(f);
        }
        LinearLayout LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.setAlpha(f);
        }
        FrameLayout LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL == null) {
            return;
        }
        LJIILLIIL.setAlpha(f);
    }

    public final void LJJIFFI(boolean z) {
        int i;
        View view = (View) this.LJIJJ.getValue();
        int i2 = 8;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        ImageView imageView = (ImageView) this.LJIJJLI.getValue();
        if (imageView == null) {
            return;
        }
        if (!z) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public CF8(View view, CFN cfn) {
        UserLevelDynamicConfig userLevelDynamicConfig;
        Context LIZLLL;
        Resources resources;
        this.LIZ = view;
        this.LIZIZ = cfn;
        UserLevelConfig userLevelConfig = UserLevelSettings.INSTANCE.getUserLevelConfig();
        int i = 0;
        if (userLevelConfig != null && (userLevelDynamicConfig = userLevelConfig.userLevelDynamicConfig) != null && userLevelDynamicConfig.enableGradeNinePatchScale && (LIZLLL = C15380j0.LIZLLL()) != null && (resources = LIZLLL.getResources()) != null) {
            i = resources.getDimensionPixelSize(R.dimen.hp);
        }
        this.LJJIIJZLJL = i;
        this.LJJIIZI = UserLevelBarrageSwitchSettings.INSTANCE.getValue();
        this.LJJIJIIJIL = LiveBarrageReleasePlayerTimeSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r5.setText(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        r2 = X.CXJ.LJI(r3, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(com.bytedance.android.livesdk.model.message.common.Text r4, X.C47121t6 r5) {
        /*
            com.bytedance.android.livesdk.model.message.common.TextFormat r2 = r4.defaultFormat
            if (r2 == 0) goto L44
            int r0 = r2.weight
        L6:
            r1 = 600(0x258, float:8.41E-43)
            if (r0 <= 0) goto L40
            int r0 = r2.weight
            if (r0 == r1) goto L14
            r1 = 700(0x2bc, float:9.81E-43)
            if (r0 == r1) goto L14
            r1 = 400(0x190, float:5.6E-43)
        L14:
            X.C23010vJ.LJ(r1, r5)
        L17:
            if (r5 == 0) goto L3b
            java.lang.String r3 = r4.defaultPattern
            java.lang.String r0 = r4.key
            r2 = 0
            if (r0 == 0) goto L3e
            X.Y7x r1 = X.C86881Y7x.LIZIZ()
            java.lang.String r0 = r4.key
            java.lang.String r1 = r1.LIZ(r0)
            if (r1 != 0) goto L2e
        L2c:
            if (r3 == 0) goto L38
        L2e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L3c
        L34:
            android.text.Spannable r2 = X.CXJ.LJI(r3, r4, r2)
        L38:
            r5.setText(r2)
        L3b:
            return
        L3c:
            r3 = r1
            goto L34
        L3e:
            r1 = r2
            goto L2c
        L40:
            X.C23010vJ.LJ(r1, r5)
            goto L17
        L44:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CF8.LJIJJ(com.bytedance.android.livesdk.model.message.common.Text, X.1t6):void");
    }

    public static void LJJII(Space space, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (space != null && (layoutParams = space.getLayoutParams()) != null) {
            layoutParams.height = i;
            space.setLayoutParams(layoutParams);
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        LinearLayout LJIIL = LJIIL();
        if (LJIIL != null) {
            int LJFF = C15380j0.LJFF(R.dimen.hr);
            if (z2) {
                i = R.dimen.hi;
            } else {
                i = R.dimen.hq;
            }
            int LJFF2 = C15380j0.LJFF(i);
            int LJFF3 = C15380j0.LJFF(R.dimen.hz);
            if (C15380j0.LJIIZILJ()) {
                if (z) {
                    LJFF2 += LJFF3;
                }
                LJIIL.setPadding(LJFF2, LJIIL.getPaddingTop(), LJFF, LJIIL.getPaddingBottom());
            } else {
                int paddingTop = LJIIL.getPaddingTop();
                if (z) {
                    LJFF2 += LJFF3;
                }
                LJIIL.setPadding(LJFF, paddingTop, LJFF2, LJIIL.getPaddingBottom());
            }
        }
    }

    public final void LIZIZ(boolean z, boolean z2) {
        if (!z) {
            return;
        }
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(LJIIJJI());
        if (z2) {
            anonymousClass064.LJIIIIZZ(R.id.ez4, 7, R.id.bcz, 7);
        } else {
            anonymousClass064.LJIIIIZZ(R.id.ez4, 7, R.id.ja1, 7);
        }
        anonymousClass064.LIZIZ(LJIIJJI());
    }

    public final void LJIJ(String str, String str2) {
        CFG cfg;
        View alphaView;
        View alphaView2;
        Context context;
        Object obj;
        Object obj2 = null;
        if (this.LIZLLL == null) {
            Object obj3 = this.LIZIZ;
            if (obj3 != null) {
                context = ((LiveWidget) obj3).getContext();
            } else {
                context = null;
            }
            FrameLayout LJIILLIIL = LJIILLIIL();
            CFG cfg2 = new CFG(context, LJIILLIIL);
            this.LIZLLL = cfg2;
            if (cfg2.LIZJ == null && context != null) {
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = cfg2.LIZIZ;
                if (iLiveGiftDelegatePlayerService != null) {
                    obj = iLiveGiftDelegatePlayerService.buildDelegateGiftPlayListener(cfg2.LJI);
                } else {
                    obj = null;
                }
                cfg2.LJFF = obj;
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService2 = cfg2.LIZIZ;
                if (iLiveGiftDelegatePlayerService2 != null) {
                    obj2 = iLiveGiftDelegatePlayerService2.createLiveGiftPlayController(context, C29306Beo.LIZIZ(context), cfg2.LJFF, LJIILLIIL);
                }
                cfg2.LIZJ = obj2;
            }
        }
        if (this.LJJIJIIJI == null && this.LJJIJIIJIL > 0) {
            this.LJJIJIIJI = new IDHandlerS18S0100000_5(this, C16880lQ.LLJJJJ(), 4);
        }
        CFG cfg3 = this.LIZLLL;
        if (cfg3 != null) {
            cfg3.LIZLLL = str;
            cfg3.LJ = str2;
        }
        IDHandlerS18S0100000_5 iDHandlerS18S0100000_5 = this.LJJIJIIJI;
        if (iDHandlerS18S0100000_5 != null) {
            iDHandlerS18S0100000_5.removeMessages(1);
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String LJIIJJI = C15510jD.LJIIJJI(str, str2);
        if (!TextUtils.isEmpty(LJIIJJI) && (cfg = this.LIZLLL) != null) {
            if (C15380j0.LJIIZILJ()) {
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService3 = cfg.LIZIZ;
                if (iLiveGiftDelegatePlayerService3 != null && (alphaView2 = iLiveGiftDelegatePlayerService3.getAlphaView(cfg.LIZJ)) != null) {
                    alphaView2.setRotationY(180.0f);
                }
            } else {
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService4 = cfg.LIZIZ;
                if (iLiveGiftDelegatePlayerService4 != null && (alphaView = iLiveGiftDelegatePlayerService4.getAlphaView(cfg.LIZJ)) != null) {
                    alphaView.setRotationY(0.0f);
                }
            }
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService5 = cfg.LIZIZ;
            if (iLiveGiftDelegatePlayerService5 != null) {
                iLiveGiftDelegatePlayerService5.setAutoReleaseParam(cfg.LIZJ, false);
            }
            ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService6 = cfg.LIZIZ;
            if (iLiveGiftDelegatePlayerService6 != null) {
                iLiveGiftDelegatePlayerService6.start(cfg.LIZJ, LJIIJJI, 0L);
            }
            String str3 = cfg.LJ;
            String str4 = cfg.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LIZ(0, "play_status", jSONObject);
            if (str3 == null) {
                str3 = "unkown";
            }
            C05630Jz.LJI(jSONObject, "channel", str3);
            if (str4 == null) {
                str4 = "unkown";
            }
            C05630Jz.LJI(jSONObject, "videoname", str4);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_barrage_player_status_event", jSONObject, jSONObject2, jSONObject4);
        }
    }

    public final void LJIJJLI(BarrageMessage barrageMessage, boolean z) {
        User user;
        List<BadgeStruct> badgeList;
        User user2;
        List<BadgeStruct> badgeList2;
        if (z) {
            User LJ = CF1.LJ(barrageMessage);
            if (LJ != null) {
                ArrayList arrayList = null;
                switch (barrageMessage.msgType) {
                    case 8:
                    case 9:
                        BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                        if (barrageTypeUserGradeParam != null && (user2 = barrageTypeUserGradeParam.user) != null && (badgeList2 = user2.getBadgeList()) != null && badgeList2.size() > 0) {
                            arrayList = new ArrayList();
                            for (BadgeStruct badgeStruct : badgeList2) {
                                if (badgeStruct.badgeScene == 8) {
                                    arrayList.add(badgeStruct);
                                }
                            }
                            break;
                        }
                        break;
                    case 10:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                        if (barrageTypeFansLevelParam != null && (user = barrageTypeFansLevelParam.user) != null && (badgeList = user.getBadgeList()) != null && badgeList.size() > 0) {
                            arrayList = new ArrayList();
                            for (BadgeStruct badgeStruct2 : badgeList) {
                                if (badgeStruct2.badgeScene == 10) {
                                    arrayList.add(badgeStruct2);
                                }
                            }
                            break;
                        }
                        break;
                }
                if (arrayList == null) {
                    C0NB.LJ("BarrageAnimation", "bindBadgeIconView user level badgeStructList is empty");
                } else {
                    C31470CWs c31470CWs = (C31470CWs) this.LJIJJ.getValue();
                    if (c31470CWs != null) {
                        c31470CWs.LIZ(false, arrayList, LJ, 3, null, null, true);
                    }
                }
            }
        } else {
            C15620jO.LIZIZ(barrageMessage.icon, (C47061t0) this.LJIJJLI.getValue());
        }
        C47121t6 LJIILIIL = LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.setVisibility(0);
        }
        View view = (View) this.LJJI.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
        if (C15380j0.LJIIZILJ()) {
            C47121t6 LJIILIIL2 = LJIILIIL();
            if (LJIILIIL2 != null) {
                LJIILIIL2.setEllipsize(TextUtils.TruncateAt.START);
            }
        } else {
            C47121t6 LJIILIIL3 = LJIILIIL();
            if (LJIILIIL3 != null) {
                LJIILIIL3.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        C47121t6 LJIILIIL4 = LJIILIIL();
        C47121t6 c47121t6 = (C47121t6) this.LJJI.getValue();
        Text text = barrageMessage.content;
        if (text == null) {
            return;
        }
        Text text2 = new Text();
        TextPiece textPiece = new TextPiece();
        textPiece.type = CXI.STRING.getPieceType();
        User LJ2 = CF1.LJ(barrageMessage);
        if (LJ2 != null) {
            textPiece.stringValue = C05170If.LIZ(LJ2);
            textPiece.format = text.defaultFormat;
        }
        text2.pieces = C47261Igj.LJJIJIL(textPiece);
        text2.defaultFormat = text.defaultFormat;
        text2.defaultPattern = "{0:string}";
        LJIJJ(text2, LJIILIIL4);
        LJIJJ(text, c47121t6);
    }

    public final void LJJ(long j, Animation.AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(LIZLLL(null));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(j + 500);
        alphaAnimation.setInterpolator(new C83741Wtl(0.48f, 0.04f, 0.52f, 0.96f));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(animationListener);
        View view = this.LIZ;
        if (view != null) {
            view.startAnimation(animationSet);
        }
    }

    public final void LJJI(long j, Animation.AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(LIZLLL(animationListener));
        View view = this.LIZ;
        if (view != null) {
            view.startAnimation(animationSet);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(1f, 0f)");
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(j + 500);
        ofFloat.setInterpolator(new C83741Wtl(0.48f, 0.04f, 0.52f, 0.96f));
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 63));
        ofFloat.addListener(new IDAListenerS74S0100000_5(this, 33));
        ofFloat.start();
    }

    public static void LJJIII(C47061t0 c47061t0, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (c47061t0 != null && (layoutParams = c47061t0.getLayoutParams()) != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            c47061t0.setLayoutParams(layoutParams);
        }
    }
}
