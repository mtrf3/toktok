package X;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.livesdk.event.PartnershipAudiencePromotingCardClose;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* renamed from: X.1sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46951sp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ GamePartnershipAudiencePromoteGameCardWidget LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ BriefGameTask LJLJJI;
    public final /* synthetic */ UserInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46951sp(GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget, BriefGameTask briefGameTask, UserInfo userInfo, String str, boolean z) {
        super(0);
        this.LJLIL = gamePartnershipAudiencePromoteGameCardWidget;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = briefGameTask;
        this.LJLJJL = userInfo;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Integer num;
        float f;
        float f2;
        AlphaAnimation alphaAnimation;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = this.LJLIL;
        if (gamePartnershipAudiencePromoteGameCardWidget.LJLIL != null && gamePartnershipAudiencePromoteGameCardWidget.LJLJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post running ,isFromShowCard ");
            C19U.LIZJ(LIZ, this.LJLILLLLZI, LIZ, "PartnershipAudience");
            if (this.LJLILLLLZI) {
                GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget2 = this.LJLIL;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = gamePartnershipAudiencePromoteGameCardWidget2.LJLJI;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (viewGroup2 = gamePartnershipAudiencePromoteGameCardWidget2.LJLIL) != null && viewGroup2.indexOfChild(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) == -1 && (viewGroup3 = gamePartnershipAudiencePromoteGameCardWidget2.LJLIL) != null) {
                    viewGroup3.addView(gamePartnershipAudiencePromoteGameCardWidget2.LJLJI);
                }
                ViewGroup viewGroup4 = this.LJLIL.LJLIL;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(0.0f);
                }
                ViewGroup viewGroup5 = this.LJLIL.LJLIL;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                this.LJLIL.show();
            }
            if (this.LJLILLLLZI || ((viewGroup = this.LJLIL.LJLIL) != null && viewGroup.getChildCount() > 0)) {
                this.LJLIL.LLFFF();
                final boolean z = this.LJLILLLLZI;
                final GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget3 = this.LJLIL;
                final String str = this.LJLJI;
                final BriefGameTask briefGameTask = this.LJLJJI;
                final UserInfo userInfo = this.LJLJJL;
                Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: X.0JG
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onAnimationEnd isFromShowCard ");
                        LIZ2.append(z);
                        LIZ2.append(' ');
                        C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ2));
                        if (!z) {
                            ViewGroup viewGroup6 = gamePartnershipAudiencePromoteGameCardWidget3.LJLIL;
                            if (viewGroup6 != null) {
                                viewGroup6.setVisibility(4);
                            }
                            DataChannel dataChannel = gamePartnershipAudiencePromoteGameCardWidget3.dataChannel;
                            if (dataChannel != null) {
                                ((C32537Cpp) dataChannel.gv0(C55592Gd.class)).LIZ = null;
                            }
                            gamePartnershipAudiencePromoteGameCardWidget3.hide();
                        }
                    }

                    /* JADX WARN: Type inference failed for: r11v0, types: [X.0yx, O] */
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        Long l;
                        long longValue;
                        PartnershipTask partnershipTask;
                        Long l2;
                        PartnershipTask partnershipTask2;
                        C25270yx LJZ;
                        Object obj;
                        Object obj2;
                        Object obj3;
                        int i;
                        Object obj4;
                        Object obj5;
                        int i2;
                        Object obj6;
                        int i3;
                        int i4;
                        BriefGameTask briefGameTask2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onAnimationStart isFromShowCard ");
                        LIZ2.append(z);
                        LIZ2.append(' ');
                        C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ2));
                        ViewGroup viewGroup6 = gamePartnershipAudiencePromoteGameCardWidget3.LJLIL;
                        if (viewGroup6 != null) {
                            viewGroup6.setAlpha(1.0f);
                        }
                        final long currentTimeMillis = System.currentTimeMillis();
                        if (z && !o.LJ(str, "rotate") && (briefGameTask2 = briefGameTask) != null) {
                            GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget4 = gamePartnershipAudiencePromoteGameCardWidget3;
                            boolean LJ = o.LJ(str, "enter_room");
                            UserInfo userInfo2 = userInfo;
                            if (userInfo2 == null) {
                                userInfo2 = new UserInfo();
                            }
                            ?? c25270yx = new C25270yx(briefGameTask2, currentTimeMillis, LJ, userInfo2);
                            DataChannel dataChannel = gamePartnershipAudiencePromoteGameCardWidget4.dataChannel;
                            if (dataChannel != null) {
                                ((C32537Cpp) dataChannel.gv0(C55592Gd.class)).LIZ = c25270yx;
                            }
                        }
                        if (z && (LJZ = gamePartnershipAudiencePromoteGameCardWidget3.LJZ()) != null) {
                            GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget5 = gamePartnershipAudiencePromoteGameCardWidget3;
                            boolean LJ2 = o.LJ(str, "enter_room");
                            boolean z2 = gamePartnershipAudiencePromoteGameCardWidget5.LJLILLLLZI;
                            if (!z2 ? !LJZ.LIZLLL : !LJZ.LIZJ) {
                                if (z2) {
                                    LJZ.LIZJ = true;
                                } else {
                                    LJZ.LIZLLL = true;
                                }
                                BZI LIZ3 = C28787BRn.LIZ("livesdk_gamepad_module_show");
                                LIZ3.LJIILLIIL(gamePartnershipAudiencePromoteGameCardWidget5.dataChannel);
                                if (C28835BTj.LIZLLL(gamePartnershipAudiencePromoteGameCardWidget5.dataChannel)) {
                                    obj = "ad";
                                } else {
                                    obj = "normal";
                                }
                                LIZ3.LJIJJ(obj, "live_traffic_source");
                                BriefGame briefGame = LJZ.LIZ.briefGame;
                                if (briefGame != null) {
                                    obj2 = briefGame.name;
                                } else {
                                    obj2 = null;
                                }
                                LIZ3.LJIJJ(obj2, "game_name");
                                LIZ3.LJIJJ("user", "user_type");
                                BriefGame briefGame2 = LJZ.LIZ.briefGame;
                                if (briefGame2 != null) {
                                    obj3 = briefGame2.id;
                                } else {
                                    obj3 = null;
                                }
                                LIZ3.LJIJJ(obj3, "game_id");
                                LIZ3.LJIJJ("intro_card", "module_name");
                                LIZ3.LJIJJ("live_detail", "page_name");
                                LIZ3.LJIJJ(LJZ.LIZ.task.idStr, "game_task_id");
                                long currentTimeMillis2 = System.currentTimeMillis();
                                List<BriefBenefitInfo> list = LJZ.LIZ.unacceptedBenefitList;
                                if (list != null && !list.isEmpty()) {
                                    Iterator<BriefBenefitInfo> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        if (it.next().endTime * 1000 > currentTimeMillis2) {
                                            List<BriefBenefitInfo> list2 = LJZ.LIZ.unacceptedBenefitList;
                                            if (list2 != null && !list2.isEmpty()) {
                                                List<BriefBenefitInfo> list3 = LJZ.LIZ.acceptedBenefitList;
                                                if (list3 != null) {
                                                    i3 = list3.size();
                                                } else {
                                                    i3 = 0;
                                                }
                                                List<BriefBenefitInfo> list4 = LJZ.LIZ.unacceptedBenefitList;
                                                if (list4 != null) {
                                                    i4 = list4.size();
                                                } else {
                                                    i4 = 0;
                                                }
                                                i = i4 + i3;
                                            }
                                        }
                                    }
                                }
                                i = 0;
                                LIZ3.LJIJJ(Integer.valueOf(i), "benefits_cnt");
                                LIZ3.LJIJJ(String.valueOf(BJM.LJ()), "host_id");
                                LIZ3.LJIJJ(String.valueOf(BJM.LJIILJJIL()), "content_id");
                                LIZ3.LJIJJ(Integer.valueOf(gamePartnershipAudiencePromoteGameCardWidget5.LJLILLLLZI ? 1 : 0), "is_fullscreen");
                                if (LJ2) {
                                    obj4 = "enter";
                                } else {
                                    obj4 = "live";
                                }
                                LIZ3.LJIJJ(obj4, "show_time");
                                LIZ3.LJIJJ(Long.valueOf(GamePartnershipAudiencePromoteGameCardWidget.LJLZ.LJLIL), "download_cnt");
                                if (gamePartnershipAudiencePromoteGameCardWidget5.LJLLILLLL == null) {
                                    obj5 = CardStruct.IStatusCode.DEFAULT;
                                } else {
                                    obj5 = "1";
                                }
                                LIZ3.LJIJJ(obj5, "is_esports_scene");
                                AudienceRoomInfoResponse.EsportsBriefTournamentInfo esportsBriefTournamentInfo = gamePartnershipAudiencePromoteGameCardWidget5.LJLLILLLL;
                                if (esportsBriefTournamentInfo != null && (i2 = esportsBriefTournamentInfo.esportsTournamentType) != 0) {
                                    Integer valueOf = Integer.valueOf(i2);
                                    if (valueOf == null || valueOf.intValue() != 1) {
                                        obj6 = "score";
                                    } else {
                                        obj6 = "knockout";
                                    }
                                    LIZ3.LJIJJ(obj6, "esports_type");
                                }
                                LIZ3.LJJIIJZLJL();
                            }
                        }
                        DataChannel dataChannel2 = gamePartnershipAudiencePromoteGameCardWidget3.dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.rv0(PartnershipPromoteGameCardShowChannel.class, new BRV(z));
                        }
                        if (C47261Igj.LJJIJIIJI("from_message", "enter_room", "timeout_replay").contains(str)) {
                            BriefGameTask briefGameTask3 = briefGameTask;
                            if (briefGameTask3 != null && (partnershipTask2 = briefGameTask3.task) != null) {
                                l = partnershipTask2.showDuration;
                            } else {
                                l = null;
                            }
                            if (l == null) {
                                longValue = 0;
                            } else {
                                longValue = l.longValue();
                            }
                            BriefGameTask briefGameTask4 = briefGameTask;
                            if (briefGameTask4 == null || (partnershipTask = briefGameTask4.task) == null || (l2 = partnershipTask.id) == null) {
                                return;
                            }
                            final long longValue2 = l2.longValue();
                            if (longValue2 <= 0 || longValue <= 0) {
                                return;
                            }
                            C15610jN.LIZJ(new Runnable() { // from class: X.0JF
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean LIZ4;
                                    try {
                                        DataChannelGlobal.LJLJJI.tv0(PartnershipAudiencePromotingCardClose.class, new OSZ(Long.valueOf(longValue2), Long.valueOf(currentTimeMillis)));
                                    } finally {
                                        if (LIZ4) {
                                        }
                                    }
                                }
                            }, longValue * 1000);
                        }
                    }
                };
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("startAnimation visibility ");
                ViewGroup viewGroup6 = this.LJLIL.LJLIL;
                if (viewGroup6 != null) {
                    num = Integer.valueOf(viewGroup6.getVisibility());
                } else {
                    num = null;
                }
                QZY.LIZJ(LIZ2, num, LIZ2, "PartnershipAudience");
                ViewGroup viewGroup7 = this.LJLIL.LJLIL;
                if (viewGroup7 != null) {
                    boolean z2 = this.LJLILLLLZI;
                    if (z2) {
                        f = 0.0f;
                        f2 = 1.0f;
                    } else {
                        f = 1.0f;
                        f2 = 0.0f;
                    }
                    ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.0f, 1, 1.0f);
                    if (z2) {
                        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    } else {
                        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    }
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.setDuration(300L);
                    animationSet.addAnimation(scaleAnimation);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.setAnimationListener(animationListener);
                    viewGroup7.startAnimation(animationSet);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
