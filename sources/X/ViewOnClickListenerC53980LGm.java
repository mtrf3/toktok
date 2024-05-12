package X;

import Y.IDgS349S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.api.ISocial2TabVisitApi;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LGm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC53980LGm implements View.OnClickListener {
    public final Context LJLIL;

    public final FeedFragment LIZ() {
        C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI != null) {
            Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("FRIENDS_FEED");
            if (Ja instanceof FeedFragment) {
                return (FeedFragment) Ja;
            }
            return null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<ISocialTabProtocol> LIZIZ() {
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLIL);
        if (LIZLLL != null) {
            return LIZLLL.L2();
        }
        return null;
    }

    public ViewOnClickListenerC53980LGm(Context context) {
        this.LJLIL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        List<ISocialTabProtocol> L2;
        String TO;
        int WZ;
        LIJ lij;
        IBottomTabLayoutAbility LJI;
        int i2;
        LLQ Pp;
        ISocialTabProtocol iSocialTabProtocol;
        ISocialTabProtocol iSocialTabProtocol2;
        ISocialTabProtocol iSocialTabProtocol3;
        IAccountUserService LJIILL = HG3.LJIILL();
        int i3 = 0;
        if (LJIILL != null && !((RBX) LJIILL).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        Object obj = null;
        if (z) {
            String nv0 = C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLIL)).nv0();
            if (nv0 != null) {
                str = nv0;
            }
            String LJ = C54024LIe.LJ(C45804HyK.LJJIFFI(this.LJLIL), str, null);
            J9P.LIZIZ(C45804HyK.LJJIFFI(this.LJLIL), LJ, "click_friends_tab", null, new IDgS349S0100000_9(this, 7));
            C46340IGq.LIZ(LJ, "click_friends_tab");
            C36207EIx.LIZ().LJLIL.Zk(str, null);
            return;
        }
        IFriendsTabLayoutAbility LIZ = C53976LGi.LIZ(this.LJLIL);
        if (LIZ != null) {
            i = LIZ.IS();
        } else {
            i = -1;
        }
        List<ISocialTabProtocol> LIZIZ = LIZIZ();
        if (LIZIZ != null && (iSocialTabProtocol3 = (ISocialTabProtocol) ORZ.LJLLLLLL(i, LIZIZ)) != null) {
            z2 = iSocialTabProtocol3.isLoading();
        } else {
            z2 = false;
        }
        List<ISocialTabProtocol> LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null && (iSocialTabProtocol2 = (ISocialTabProtocol) ORZ.LJLLLLLL(i, LIZIZ2)) != null) {
            iSocialTabProtocol2.LLJL();
        }
        IBottomTabLayoutAbility LJI2 = C53976LGi.LJI(this.LJLIL);
        if (LJI2 != null) {
            z3 = LJI2.wY();
        } else {
            z3 = false;
        }
        IFriendsTabLayoutAbility LIZ2 = C53976LGi.LIZ(this.LJLIL);
        if (LIZ2 != null) {
            z4 = LIZ2.ma("FRIENDS_FEED");
        } else {
            z4 = false;
        }
        if (z3 && z2) {
            return;
        }
        if (z3) {
            if (C35048DpE.LIZ()) {
                List<ISocialTabProtocol> LIZIZ3 = LIZIZ();
                if (LIZIZ3 != null && (iSocialTabProtocol = (ISocialTabProtocol) ORZ.LJLLLLLL(i, LIZIZ3)) != null) {
                    iSocialTabProtocol.K(EnumC53981LGn.CLICK_BOTTOM);
                }
                IBottomTabLayoutAbility LJI3 = C53976LGi.LJI(this.LJLIL);
                if (LJI3 != null && (Pp = LJI3.Pp()) != null) {
                    Pp.LJJ("FRIENDS_TAB");
                }
            }
        } else {
            C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
            if (LJJIFFI != null) {
                Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("FRIENDS_TAB");
                if (z4) {
                    IBottomFriendsTabAvatarAbility LJIIIZ = C53976LGi.LJIIIZ(this.LJLIL);
                    if (LJIIIZ != null) {
                        LJIIIZ.sA();
                    }
                    ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(this.LJLIL);
                    if (LIZLLL == null || !LIZLLL.v60() ? C36207EIx.LIZ().KY("FRIENDS_FEED") > 0 : !((LJI = C53976LGi.LJI(this.LJLIL)) == null || LJI.WZ() <= 0)) {
                        FeedFragment LIZ3 = LIZ();
                        if (LIZ3 != 0) {
                            if ((LIZ3 instanceof LIJ) && (lij = (LIJ) LIZ3) != null) {
                                lij.Bi();
                            }
                            LIZ3.ub(false);
                        }
                    } else {
                        FeedFragment LIZ4 = LIZ();
                        if (LIZ4 != null) {
                            Object LIZ5 = C55096Ljo.LIZ(C55230Lly.LIZJ(LIZ4, null), IFeedFragmentAbility.class, null);
                            if (LIZ5 instanceof IFriendsFeedFragmentAbility) {
                                obj = LIZ5;
                            }
                            IFriendsFeedFragmentAbility iFriendsFeedFragmentAbility = (IFriendsFeedFragmentAbility) obj;
                            if (iFriendsFeedFragmentAbility != null) {
                                iFriendsFeedFragmentAbility.Pg0();
                            }
                        }
                    }
                } else if (C35906E7i.LIZ()) {
                    IBottomFriendsTabAvatarAbility LJIIIZ2 = C53976LGi.LJIIIZ(this.LJLIL);
                    if (LJIIIZ2 != null) {
                        LJIIIZ2.sA();
                    }
                    IBottomFriendsTabAvatarAbility LJIIIZ3 = C53976LGi.LJIIIZ(this.LJLIL);
                    if (LJIIIZ3 != null && LJIIIZ3.isShowing() && Ja != null) {
                        IFriendsTabLayoutAbility LIZ6 = C53976LGi.LIZ(this.LJLIL);
                        if (LIZ6 != null) {
                            LIZ6.Mg();
                        }
                        ISocial2TabProtocolAbility LIZLLL2 = C53976LGi.LIZLLL(this.LJLIL);
                        if (LIZLLL2 != null && (L2 = LIZLLL2.L2()) != null) {
                            Iterator<ISocialTabProtocol> it = L2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (o.LJ(((ISocialTabProtocol) next).getTag(), "FRIENDS_FEED")) {
                                    obj = next;
                                    break;
                                }
                            }
                            ISocialTabProtocol iSocialTabProtocol4 = (ISocialTabProtocol) obj;
                            if (iSocialTabProtocol4 != null) {
                                iSocialTabProtocol4.K(EnumC53981LGn.TAB_AVATAR);
                            }
                        }
                    }
                }
                String nv02 = C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLIL)).nv0();
                if (nv02 == null) {
                    nv02 = "";
                }
                LHN.LIZ = nv02;
                C54029LIj c54029LIj = C54029LIj.LIZIZ;
                c54029LIj.LIZ.LJI(nv02);
                IBottomTabLayoutAbility LJI4 = C53976LGi.LJI(this.LJLIL);
                if (LJI4 != null && (WZ = LJI4.WZ()) > 0) {
                    c54029LIj.LJIIJ(WZ);
                }
                C188787b0 c188787b02 = com.bytedance.hox.Hox.LJLLI;
                ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLIL);
                if (LJJIFFI2 != null) {
                    com.bytedance.hox.Hox LIZ7 = c188787b02.LIZ(LJJIFFI2);
                    Bundle bundle = new Bundle();
                    bundle.putString("fromStart", "MainPage");
                    if (Ja == null) {
                        bundle.putBoolean("init", true);
                    }
                    IFriendsTabLayoutAbility LIZ8 = C53976LGi.LIZ(this.LJLIL);
                    if (LIZ8 != null && (TO = LIZ8.TO()) != null) {
                        str = TO;
                    }
                    if (((Boolean) LAT.LIZIZ.getValue()).booleanValue()) {
                        ArrayList<Integer> sv = LHM.LIZIZ.LIZIZ().redDotLogic().sv();
                        ISocial2TabVisitApi iSocial2TabVisitApi = LAT.LIZ;
                        Integer valueOf = Integer.valueOf(LAT.LIZ(str));
                        String LIZJ = C75792yF.LIZJ(sv);
                        o.LJIIIIZZ(LIZJ, "toJson(feeds)");
                        iSocial2TabVisitApi.visitSocial2Tab(valueOf, LIZJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Dz
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                            }
                        }, new InterfaceC64592gB() { // from class: X.9E0
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                            }
                        });
                    }
                    bundle.putString("enter_method", "click_bottom");
                    LIZ7.Cv0(bundle, "FRIENDS_TAB");
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C46538IOg.LIZ = false;
        C56662Kg.LIZ().LIZLLL = false;
        C56662Kg.LIZ().LJIIIZ = false;
        ActivityC45651qj LJJIFFI3 = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI3 != null) {
            C44938HkM.LJ = C3SZ.LIZ(LJJIFFI3).LJLJLLL;
            C2U8.LIZ(new C46141I8z());
            C95U c95u = (C95U) ORZ.LJLLL(((LinkedHashMap) C95D.LJIIL).values());
            if (c95u != null) {
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("request click touchPointId:");
                LIZ9.append(c95u.LIZ);
                LIZ9.append(",launchPlanId:");
                Integer num = c95u.LIZJ;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                LIZ9.append(i2);
                X1D.LIZIZ(LIZ9);
                int i4 = c95u.LIZ;
                Integer num2 = c95u.LIZJ;
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                C247479nT.LIZ(i4, i3);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
