package X;

import Y.ALAdapterS2S0300000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS7S0400000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225388sw extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarDefaultAssem, FollowStatusEvent, C76800UCe> {
    public static final C225388sw LJLIL = new C225388sw();

    public C225388sw() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        Aweme aweme;
        String str;
        FeedAvatarDefaultAssem selectSubscribe = feedAvatarDefaultAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (followStatusEvent2 != null && (followStatus = followStatusEvent2.status) != null && ((RBX) HG3.LJIILL()).isLogin() && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme()) != null) {
            User author = aweme.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str, followStatus.userId) && aweme.isCanPlay()) {
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    author2.setFollowStatus(followStatus.followStatus);
                }
                C77869UhF c77869UhF = selectSubscribe.LJZL;
                if (c77869UhF != null) {
                    c77869UhF.cancelAnimation();
                    C77869UhF c77869UhF2 = selectSubscribe.LJZL;
                    if (c77869UhF2 != null) {
                        c77869UhF2.setProgress(0.0f);
                        if (followStatus.followStatus == 0) {
                            selectSubscribe.Z3().mv0();
                            selectSubscribe.l4();
                            FeedAvatarDefaultVM Z3 = selectSubscribe.Z3();
                            C43I c43i = new C43I(0);
                            Z3.getClass();
                            Z3.setState(new AqS169S0100000_3(c43i, (C43I<Integer>) 186));
                            if (C225428t0.LIZJ) {
                                selectSubscribe.g4(0);
                            }
                        } else if (C225428t0.LIZJ) {
                            C77869UhF c77869UhF3 = selectSubscribe.LJZL;
                            if (c77869UhF3 != null) {
                                c77869UhF3.pauseAnimation();
                                Interpolator LIZ = C55953Lxd.LIZ();
                                Interpolator LJII = C55953Lxd.LJII();
                                TuxIconView tuxIconView = selectSubscribe.LLIFFJFJJ;
                                if (tuxIconView != null) {
                                    tuxIconView.clearAnimation();
                                    ValueAnimator ofFloat = ObjectAnimator.ofFloat(1.0f, 0.5f);
                                    ofFloat.setInterpolator(LIZ);
                                    ofFloat.setDuration(100L);
                                    ofFloat.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 32));
                                    ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.5f, 1.0f);
                                    ofFloat2.setInterpolator(LJII);
                                    ofFloat2.setDuration(150L);
                                    ofFloat2.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 34));
                                    ValueAnimator ofFloat3 = ObjectAnimator.ofFloat(1.0f, 0.0f);
                                    ofFloat3.setInterpolator(C55953Lxd.LIZLLL());
                                    ofFloat3.setDuration(200L);
                                    ofFloat3.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 33));
                                    TuxIconView tuxIconView2 = selectSubscribe.LLIFFJFJJ;
                                    if (tuxIconView2 != null) {
                                        tuxIconView2.post(new ARunnableS22S0200000_3(ofFloat, selectSubscribe, 59));
                                        TuxIconView tuxIconView3 = selectSubscribe.LLIFFJFJJ;
                                        if (tuxIconView3 != null) {
                                            tuxIconView3.postDelayed(new ARunnableS22S0200000_3(ofFloat2, selectSubscribe, 58), 100L);
                                            TuxIconView tuxIconView4 = selectSubscribe.LLIFFJFJJ;
                                            if (tuxIconView4 != null) {
                                                tuxIconView4.postDelayed(new ARunnableS7S0400000_3(ofFloat3, selectSubscribe, aweme, followStatus, 4), 850L);
                                            } else {
                                                o.LJIJI("followIconView");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("followIconView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("followIconView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("followIconView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("followView");
                                throw null;
                            }
                        } else {
                            C77869UhF c77869UhF4 = selectSubscribe.LJZL;
                            if (c77869UhF4 != null) {
                                c77869UhF4.playAnimation();
                                C77869UhF c77869UhF5 = selectSubscribe.LJZL;
                                if (c77869UhF5 != null) {
                                    c77869UhF5.addAnimatorListener(new ALAdapterS2S0300000_3(selectSubscribe, aweme, followStatus, 2));
                                } else {
                                    o.LJIJI("followView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("followView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("followView");
                        throw null;
                    }
                } else {
                    o.LJIJI("followView");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
