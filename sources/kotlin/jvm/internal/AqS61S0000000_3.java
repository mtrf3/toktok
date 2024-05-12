package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C10K;
import X.C17N;
import X.C195357lb;
import X.C199897sv;
import X.C206898Ab;
import X.C212428Vi;
import X.C226068u2;
import X.C29701Eo;
import X.C32I;
import X.C43I;
import X.C51029K0z;
import X.C54029LIj;
import X.C54423LXn;
import X.C76800UCe;
import X.C8YN;
import X.EnumC61832bj;
import X.InterfaceC88471Ynr;
import X.LHM;
import X.LXS;
import X.LXU;
import Y.ACallableS2S1000000_3;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.friendstab.BackToFYPGuideAssem;
import com.ss.android.ugc.aweme.feed.assem.friendstab.GoToFriendsGuideAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AqS61S0000000_3 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0000000_3(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0000000_3(BackToFYPGuideAssem backToFYPGuideAssem, int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0000000_3(GoToFriendsGuideAssem goToFriendsGuideAssem, int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S0000000_3(GeneralVideoMaskAssem generalVideoMaskAssem, int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        LXS LIZ;
        BackToFYPGuideAssem selectSubscribe = (BackToFYPGuideAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            C54029LIj.LIZIZ.LJ();
            if (selectSubscribe.p4()) {
                C17N.LJJLIIIJJI(selectSubscribe.getContainerView());
                LXS LIZ2 = LXU.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZLLL(true);
                }
                C29701Eo c29701Eo = selectSubscribe.LLFII;
                if (c29701Eo != null) {
                    c29701Eo.playAnimation();
                }
                selectSubscribe.q4("show");
            } else {
                ActivityC45651qj LIZ3 = C212428Vi.LIZ(selectSubscribe);
                if (LIZ3 != null && !C54423LXn.LIZIZ.LIZ().LJ(LIZ3) && (LIZ = LXU.LIZ()) != null) {
                    LIZ.LIZLLL(false);
                }
                C17N.LJJIIJZLJL(selectSubscribe.getContainerView());
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        BackToFYPGuideAssem selectSubscribe = (BackToFYPGuideAssem) obj;
        C43I c43i = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            C54029LIj.LIZIZ.LJ();
            if (selectSubscribe.p4() && selectSubscribe.getContainerView().getVisibility() == 0) {
                if (((C195357lb) c43i.LIZ).LIZIZ) {
                    selectSubscribe.q4("draw_up");
                } else {
                    selectSubscribe.q4("draw_down");
                }
                selectSubscribe.LJLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        GoToFriendsGuideAssem selectSubscribe = (GoToFriendsGuideAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.LLIFFJFJJ = true;
        selectSubscribe.LLII = false;
        LXS LIZ = LXU.LIZ();
        if (LIZ != null) {
            LIZ.LJFF(false);
        }
        C17N.LJJIIJZLJL(selectSubscribe.getContainerView());
        if (C226068u2.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), EnumC61832bj.MASK_VIEW)) {
            List<User> educateAvatarUserList = LHM.LIZIZ.LIZ().getEducateAvatarUserList();
            selectSubscribe.LLIIII = C226068u2.LIZIZ();
            C199897sv c199897sv = selectSubscribe.LLI;
            if (c199897sv != null) {
                c199897sv.setAvatarSizeModel(40);
                ArrayList arrayList = new ArrayList(C32I.LJJL(educateAvatarUserList, 10));
                for (User user : educateAvatarUserList) {
                    String nickname = user.getNickname();
                    o.LJIIIIZZ(nickname, "it.nickname");
                    arrayList.add(new MutualUser("", nickname, user.getAvatarThumb(), user.getAvatarThumb(), ""));
                }
                c199897sv.LIZIZ(new MutualStruct(0, 0, arrayList, 0, 11, null));
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        GoToFriendsGuideAssem selectSubscribe = (GoToFriendsGuideAssem) obj;
        C43I c43i = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIFFJFJJ = false;
            selectSubscribe.LLII = false;
            selectSubscribe.LLIIII = "";
            if (selectSubscribe.getContainerView().getVisibility() == 0) {
                if (((C195357lb) c43i.LIZ).LIZIZ) {
                    C10K.LIZJ(new ACallableS2S1000000_3("draw_up", 1));
                } else {
                    C10K.LIZJ(new ACallableS2S1000000_3("draw_down", 1));
                }
                selectSubscribe.LJLLL();
                C226068u2.LIZLLL();
            } else {
                LXS LIZ = LXU.LIZ();
                if (LIZ != null) {
                    LIZ.LJFF(false);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        GeneralVideoMaskAssem selectSubscribe = (GeneralVideoMaskAssem) obj;
        C206898Ab it = (C206898Ab) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LIZ) {
            C8YN.LJIJI(selectSubscribe.p4(), new AqS169S0100000_3(selectSubscribe, 203));
        } else {
            selectSubscribe.Y3().setVisibility(8);
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LIZLLL(it.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS61S0000000_3 aqS61S0000000_3, Object obj, Object obj2) {
        GeneralVideoMaskAssem selectSubscribe = (GeneralVideoMaskAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            GeneralVideoMaskVM p4 = selectSubscribe.p4();
            p4.getClass();
            p4.setState(new AqS169S0100000_3(p4, 706));
        }
        return C76800UCe.LIZ;
    }
}
