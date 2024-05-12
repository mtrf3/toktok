package X;

import Y.AfS58S0200000_9;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.LiveTagStruct;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LHv */
/* loaded from: classes10.dex */
public final class C54015LHv extends BaseRedDotImpl implements LLE {
    public final boolean LJLJI;
    public C73411SrX LJLJL;
    public NewContentResponse.FollowFriendMergeFeedRedDotResponse LJLJLJ;
    public EnumC54016LHw LJLJLLL;
    public WeakReference<ActivityC45651qj> LJLLI;
    public final String LJLJJI = "Following";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 862));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 863));
    public AtomicBoolean LJLL = new AtomicBoolean(false);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 860));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(LI0.LJLIL);

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final boolean PT() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void D10() {
        LJIIJJI().LJ("FRIENDS_FEED");
        LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void Go0() {
        this.LJLL = new AtomicBoolean(false);
        LJIILJJIL(this, null, true, 2);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LIZLLL() {
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public final ActivityC45651qj LJIIIIZZ() {
        WeakReference<ActivityC45651qj> weakReference = this.LJLLI;
        if (weakReference == null || weakReference.get() == null) {
            this.LJLLI = new WeakReference<>(StateOwner.LJLIL.LIZLLL());
        }
        WeakReference<ActivityC45651qj> weakReference2 = this.LJLLI;
        if (weakReference2 == null) {
            return null;
        }
        return weakReference2.get();
    }

    public final InterfaceC54017LHx LJIIIZ() {
        return (InterfaceC54017LHx) this.LJLJJL.getValue();
    }

    public final EnumC54016LHw LJIIJ() {
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility = (IBottomFriendsTabAvatarAbility) this.LJLLILLLL.getValue();
        if (iBottomFriendsTabAvatarAbility != null && iBottomFriendsTabAvatarAbility.isShowing()) {
            return EnumC54016LHw.HEAD_NUMBER;
        }
        return EnumC54016LHw.NUMBER_DOT;
    }

    public final C54005LHl LJIIJJI() {
        return (C54005LHl) this.LJLJJLL.getValue();
    }

    public final void LJIIL() {
        MS5.LJ(new AqS159S0100000_9(this, 861));
        C73411SrX c73411SrX = this.LJLJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void St0() {
        this.LJLL = new AtomicBoolean(true);
        LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final C35585Dxt Yi() {
        return new C35585Dxt();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final OSZ<Boolean, String> D20() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbility;
        boolean z;
        ActivityC45651qj LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            iSocial2TabProtocolAbility = C53976LGi.LJFF(LJIIIIZZ);
        } else {
            iSocial2TabProtocolAbility = null;
        }
        boolean z2 = false;
        if (iSocial2TabProtocolAbility != null) {
            z = iSocial2TabProtocolAbility.v60();
        } else {
            z = false;
        }
        IBottomTabLayoutAbility LJII = LJII();
        if (LJII != null) {
            z2 = LJII.wY();
        }
        if (z && z2) {
            return new OSZ<>(Boolean.TRUE, "in_tab");
        }
        return super.D20();
    }

    public final IBottomTabLayoutAbility LJII() {
        ActivityC45651qj LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            return C53976LGi.LJIIIIZZ(LJIIIIZZ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final LIV getSocialTabNoticeData() {
        EnumC54016LHw enumC54016LHw;
        String str;
        if (LJIIIZ().U6()) {
            enumC54016LHw = EnumC54016LHw.LIVE;
        } else if (LJIIIZ().getDotCount() > 0) {
            enumC54016LHw = LJIIJ();
        } else {
            enumC54016LHw = null;
        }
        if (enumC54016LHw == null || (str = enumC54016LHw.getString()) == null) {
            str = "";
        }
        return new LIV(str, LJIIJJI().LIZ(), LJIIJJI().LJIILIIL(EnumC53524KzY.SINGLE_FOLLOW), LJIIJJI().LJIILIIL(EnumC53524KzY.MUTUAL_FOLLOW));
    }

    @Override // X.InterfaceC53995LHb
    public final InterfaceC54017LHx zA() {
        return LJIIIZ();
    }

    public C54015LHv(boolean z) {
        ActivityC45651qj LJIIIIZZ;
        this.LJLJI = z;
        if (!z && (LJIIIIZZ = LJIIIIZZ()) != null) {
            C116694i1.LIZ(LJIIIIZZ).hv0(this);
        }
    }

    @Override // X.InterfaceC53995LHb
    public final void Bt0(Throwable th, EnumC36206EIw source) {
        o.LJIIIZ(source, "source");
        LJIIJJI().LJIIIZ();
        LJIILJJIL(this, null, false, 6);
    }

    public final void LJIILIIL(EnumC36206EIw enumC36206EIw, boolean z) {
        Boolean bool;
        IBottomTabLayoutAbility LJII;
        ArrayList<UserNewContent> avatarList;
        UserNewContent userNewContent;
        User user;
        UrlModel avatarThumb;
        NewContentResponse.FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse;
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility;
        LiveTagStruct liveTagStruct;
        if (this.LJLL.get() || ((LJII = LJII()) != null && LJII.wY())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("return because force: ");
            LIZ.append(this.LJLL.get());
            LIZ.append(", or is in social 2 tab: ");
            IBottomTabLayoutAbility LJII2 = LJII();
            if (LJII2 != null) {
                bool = Boolean.valueOf(LJII2.wY());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            X1D.LIZIZ(LIZ);
            LJIIL();
            return;
        }
        if (z) {
            C73411SrX c73411SrX = this.LJLJL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            NewContentResponse.FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse2 = this.LJLJLJ;
            if (followFriendMergeFeedRedDotResponse2 != null && (liveTagStruct = followFriendMergeFeedRedDotResponse2.getLiveTagStruct()) != null && liveTagStruct.getCount() > 0) {
                InterfaceC54196LOu interfaceC54196LOu = (InterfaceC54196LOu) this.LJLLJ.getValue();
                if (interfaceC54196LOu != null) {
                    interfaceC54196LOu.LIZIZ(new ArrayList(), 1);
                }
                LJIIIZ().W6();
                this.LJLJL = (C73411SrX) AbstractC73672Svk.LJJIIZI(120L, 120L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS58S0200000_9(this, enumC36206EIw, 13));
            } else {
                InterfaceC54196LOu interfaceC54196LOu2 = (InterfaceC54196LOu) this.LJLLJ.getValue();
                if (interfaceC54196LOu2 != null) {
                    interfaceC54196LOu2.LIZIZ(new ArrayList(), -1);
                }
                LJIIIZ().V6();
            }
            EnumC54016LHw enumC54016LHw = this.LJLJLLL;
            EnumC54016LHw enumC54016LHw2 = EnumC54016LHw.LIVE;
            if (enumC54016LHw != enumC54016LHw2 && LJIIIZ().U6()) {
                LJIILL(enumC54016LHw2, EnumC48706J9q.SHOW);
            }
        }
        if (this.LJLJI || LJIIIZ().U6()) {
            IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility2 = (IBottomFriendsTabAvatarAbility) this.LJLLILLLL.getValue();
            if (iBottomFriendsTabAvatarAbility2 != null) {
                iBottomFriendsTabAvatarAbility2.dh();
            }
        } else {
            NewContentResponse.FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse3 = this.LJLJLJ;
            if (followFriendMergeFeedRedDotResponse3 != null && (avatarList = followFriendMergeFeedRedDotResponse3.getAvatarList()) != null && (userNewContent = (UserNewContent) ORZ.LJLLLL(avatarList)) != null && (user = userNewContent.getUser()) != null && (avatarThumb = user.getAvatarThumb()) != null && (followFriendMergeFeedRedDotResponse = this.LJLJLJ) != null && (iBottomFriendsTabAvatarAbility = (IBottomFriendsTabAvatarAbility) this.LJLLILLLL.getValue()) != null) {
                iBottomFriendsTabAvatarAbility.hf0(followFriendMergeFeedRedDotResponse, avatarThumb);
            }
        }
        int LIZ2 = LJIIJJI().LIZ();
        if (LIZ2 > 0 && !LJIIIZ().U6()) {
            EnumC54016LHw LJIIJ = LJIIJ();
            if (LJIIIZ().getDotCount() != LIZ2 || LJIIJ != this.LJLJLLL) {
                LJIIIZ().LLLIIL(LIZ2);
                LJIILL(LJIIJ, EnumC48706J9q.SHOW);
                return;
            }
            return;
        }
        LJIIIZ().LLLIIL(0);
    }

    public final void LJIILL(EnumC54016LHw enumC54016LHw, EnumC48706J9q actionType) {
        String str;
        String str2;
        this.LJLJLLL = enumC54016LHw;
        int LIZ = LJIIJJI().LIZ();
        int LJIILIIL = LJIIJJI().LJIILIIL(EnumC53524KzY.SINGLE_FOLLOW);
        int LJIILIIL2 = LJIIJJI().LJIILIIL(EnumC53524KzY.MUTUAL_FOLLOW);
        boolean z = this.LJLJI;
        o.LJIIIZ(actionType, "actionType");
        C188727au c188727au = new C188727au();
        if (enumC54016LHw == null || (str = enumC54016LHw.getString()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("notice_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_top_tab", str2);
        c188727au.LIZLLL(LIZ, "number_cnt");
        c188727au.LIZLLL(LJIILIIL, "number_cnt_single");
        c188727au.LIZLLL(LJIILIIL2, "number_cnt_mutual");
        c188727au.LJI("action_type", actionType.getString());
        FMX.LJIIL("homepage_follow_notice", c188727au.LIZ);
    }

    @Override // X.InterfaceC53995LHb
    public final void Ng0(NewContentResponse response, EnumC36206EIw enumC36206EIw) {
        NewContentResponse.FollowFriendMergeFeedRedDotResponse followFriendMergeFeedRedDotResponse;
        o.LJIIIZ(response, "response");
        LJIIJJI().LJIIIIZZ(response);
        SocialFeedRedDotResponse LJJIJ = C78685UuP.LJJIJ(response);
        if (LJJIJ instanceof NewContentResponse.FollowFriendMergeFeedRedDotResponse) {
            followFriendMergeFeedRedDotResponse = (NewContentResponse.FollowFriendMergeFeedRedDotResponse) LJJIJ;
        } else {
            followFriendMergeFeedRedDotResponse = null;
        }
        this.LJLJLJ = followFriendMergeFeedRedDotResponse;
        LJIILIIL(enumC36206EIw, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r12.length() == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        if (r12.equals("HOME") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        r12 = "homepage_hot";
     */
    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zk(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54015LHv.Zk(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC53995LHb
    public final void ym(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LJIIJJI().LIZJ(i, aweme);
        IBottomTabLayoutAbility LJII = LJII();
        if (LJII != null && LJII.wY()) {
            return;
        }
        LJIILJJIL(this, null, false, 6);
    }

    public static /* synthetic */ void LJIILJJIL(C54015LHv c54015LHv, EnumC36206EIw enumC36206EIw, boolean z, int i) {
        if ((i & 2) != 0) {
            enumC36206EIw = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c54015LHv.LJIILIIL(enumC36206EIw, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
    
        if (r6 != null) goto L28;
     */
    @Override // X.LLE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJLL(java.lang.String r2, java.lang.String r3, boolean r4, boolean r5, android.os.Bundle r6, java.lang.String r7) {
        /*
            r1 = this;
            java.lang.String r0 = r1.LJLJJI
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 != 0) goto L9
            return
        L9:
            if (r6 == 0) goto L13
            java.lang.String r0 = "enter_from"
            java.lang.String r0 = r6.getString(r0)
            if (r0 != 0) goto L27
        L13:
            if (r3 != 0) goto L17
            java.lang.String r3 = ""
        L17:
            if (r6 == 0) goto L21
        L19:
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r6.getString(r0)
            if (r0 != 0) goto L25
        L21:
            r1.Zk(r3, r7)
            return
        L25:
            r7 = r0
            goto L21
        L27:
            r3 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54015LHv.LJLJJLL(java.lang.String, java.lang.String, boolean, boolean, android.os.Bundle, java.lang.String):void");
    }
}
