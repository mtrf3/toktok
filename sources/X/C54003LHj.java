package X;

import Y.AfS61S0100000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LHj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54003LHj extends BaseRedDotImpl implements LLE {
    public C54008LHo LJLJI;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final C54004LHk LJLJJL = new C54004LHk("FRIENDS_FEED", true);
    public boolean LJLJJLL;

    public static final IBottomTabLayoutAbility LJII() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LJIIIIZZ(LIZLLL);
        }
        return null;
    }

    public static final IFriendsTabLayoutAbility LJIIJ() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LIZJ(LIZLLL);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void D10() {
        this.LJLJJL.LJ("FRIENDS_FEED");
        LJIIIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final OSZ<Boolean, String> D20() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbility;
        boolean z;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            iSocial2TabProtocolAbility = C53976LGi.LJFF(LIZLLL);
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
        if (C54029LIj.LIZIZ.LJFF()) {
            return new OSZ<>(Boolean.TRUE, null);
        }
        if (C53283Kvf.LIZIZ()) {
            return new OSZ<>(Boolean.TRUE, "no_following_or_friend");
        }
        return super.D20();
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final ArrayList<SingleTabCounter> wE() {
        return this.LJLJJL.LIZJ;
    }

    public final String LJIIIIZZ() {
        String str;
        IFriendsTabLayoutAbility LJIIJ = LJIIJ();
        if (LJIIJ == null || (str = LJIIJ.TO()) == null) {
            str = "";
        }
        if (o.LJ(str, "FRIENDS_FEED")) {
            return "homepage_friends";
        }
        if (!o.LJ(str, "SOCIAL_NOWS")) {
            return "";
        }
        return "homepage_now";
    }

    @Override // X.InterfaceC53995LHb
    public final InterfaceC54017LHx zA() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final int KY(String tag) {
        o.LJIIIZ(tag, "tag");
        return this.LJLJJL.LJII(tag);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl
    public final void LIZIZ(boolean z) {
        super.LIZIZ(z);
        java.util.Set<String> set = C54014LHu.LIZ;
        if (set != null) {
            set.clear();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C54014LHu.LIZ = linkedHashSet;
        linkedHashSet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    public final void LJIIIZ(EnumC36206EIw enumC36206EIw) {
        String str;
        List<ISocialTabProtocol> arrayList;
        SingleTabCounter LIZLLL;
        InterfaceC54013LHt gb;
        boolean z;
        String str2;
        ISocial2TabProtocolAbility LJFF;
        boolean z2;
        boolean z3;
        LLQ LIZIZ;
        C54008LHo c54008LHo;
        Object obj;
        int i;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<UserNewContent> avatarList;
        List<UserNewContent> subList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        ArrayList<UserNewContent> avatarList2;
        LLQ LIZIZ2;
        C54008LHo c54008LHo2;
        IBottomTabLayoutAbility LJII = LJII();
        if (LJII != null && LJII.wY()) {
            C54008LHo c54008LHo3 = this.LJLJI;
            if (c54008LHo3 != null) {
                c54008LHo3.LIZ();
                return;
            }
            return;
        }
        if (!C54029LIj.LIZIZ.LJIIZILJ()) {
            int LIZ = this.LJLJJL.LIZ();
            SingleTabCounter singleTabCounter = null;
            if (LIZ > 0) {
                C54008LHo c54008LHo4 = this.LJLJI;
                if (c54008LHo4 != null) {
                    c54008LHo4.LLLIIL(this.LJLJJL.LIZ());
                }
                StateOwner stateOwner = StateOwner.LJLIL;
                stateOwner.LIZJ();
                IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
                if (iFriendsTabDebugService != null) {
                    iFriendsTabDebugService.LJ();
                }
                ActivityC45651qj LIZLLL2 = stateOwner.LIZLLL();
                if (LIZLLL2 != null) {
                    C54008LHo c54008LHo5 = this.LJLJI;
                    if (c54008LHo5 == null || c54008LHo5.getDotCount() != LIZ) {
                        String lv0 = com.bytedance.hox.Hox.LJLLI.LIZ(LIZLLL2).lv0();
                        C54004LHk c54004LHk = this.LJLJJL;
                        Iterator<SingleTabCounter> it = c54004LHk.LIZJ.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            SingleTabCounter next = it.next();
                            if (o.LJ(next.getTag(), c54004LHk.LIZ)) {
                                i2 += next.getNumberCount();
                            }
                        }
                        C54011LHr.LIZJ(LIZ, lv0, i2, this.LJLJJLL, enumC36206EIw);
                        IFriendsTabLayoutAbility LIZJ = C53976LGi.LIZJ(LIZLLL2);
                        if ((LIZJ == null || LIZJ.pe("FRIENDS_FEED") == null) && (c54008LHo = this.LJLJI) != null && c54008LHo.getDotCount() > 0) {
                            if (DQS.LIZ()) {
                                NewContentResponse newContentResponse = C36203EIt.LIZJ;
                                if (newContentResponse != null && (friendsFeedResponse2 = newContentResponse.getFriendsFeedResponse()) != null && (avatarList2 = friendsFeedResponse2.getAvatarList()) != null) {
                                    i = avatarList2.size();
                                } else {
                                    i = 0;
                                }
                                int intValue = ((Number) C59432Ux.LIZ.getValue()).intValue();
                                if (intValue <= i) {
                                    i = intValue;
                                }
                                NewContentResponse newContentResponse2 = C36203EIt.LIZJ;
                                if (newContentResponse2 != null && (friendsFeedResponse = newContentResponse2.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && (subList = avatarList.subList(0, i)) != null) {
                                    obj = new ArrayList(C32I.LJJL(subList, 10));
                                    Iterator<UserNewContent> it2 = subList.iterator();
                                    while (it2.hasNext()) {
                                        obj.add(it2.next().getItemId());
                                    }
                                } else {
                                    obj = C61878OQg.INSTANCE;
                                }
                            } else {
                                obj = C61878OQg.INSTANCE;
                            }
                            C54029LIj c54029LIj = C54029LIj.LIZIZ;
                            String scene = LI7.NUMBER_DOT_CHANGE.getScene();
                            String LIZJ2 = C75792yF.LIZJ(obj);
                            o.LJIIIIZZ(LIZJ2, "toJson(awemeIds)");
                            c54029LIj.LJJIJLIJ(scene, LIZJ2);
                        }
                    }
                    C54008LHo c54008LHo6 = this.LJLJI;
                    if (c54008LHo6 != null && (LIZIZ2 = C54008LHo.LIZIZ()) != null && LIZIZ2.LJIIZILJ(c54008LHo6.LIZ) && (c54008LHo2 = this.LJLJI) != null) {
                        c54008LHo2.LIZ();
                    }
                    C54008LHo c54008LHo7 = this.LJLJI;
                    if (c54008LHo7 != null) {
                        c54008LHo7.LLLIIL(LIZ);
                    }
                }
            } else {
                C54008LHo c54008LHo8 = this.LJLJI;
                if (c54008LHo8 != null) {
                    c54008LHo8.LLLIIL(0);
                }
                Iterator<SingleTabCounter> it3 = this.LJLJJL.LIZJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    SingleTabCounter next2 = it3.next();
                    if (next2.getShowRedDot()) {
                        singleTabCounter = next2;
                        break;
                    }
                }
                SingleTabCounter singleTabCounter2 = singleTabCounter;
                if (singleTabCounter2 != null) {
                    z2 = singleTabCounter2.getShowRedDot();
                } else {
                    z2 = false;
                }
                IBottomTabLayoutAbility LIZIZ3 = C54004LHk.LIZIZ();
                if (LIZIZ3 != null) {
                    z3 = LIZIZ3.wY();
                } else {
                    z3 = false;
                }
                if (z2 && !z3) {
                    C54008LHo c54008LHo9 = this.LJLJI;
                    if (c54008LHo9 != null && c54008LHo9.getDotCount() <= 0 && StateOwner.LJLIL.LIZLLL() != null && (LIZIZ = C54008LHo.LIZIZ()) != null) {
                        LIZIZ.LJJIJIIJIL(c54008LHo9.LIZ);
                    }
                } else {
                    C54008LHo c54008LHo10 = this.LJLJI;
                    if (c54008LHo10 != null) {
                        c54008LHo10.LIZ();
                    }
                }
            }
        } else {
            C54008LHo c54008LHo11 = this.LJLJI;
            if (c54008LHo11 != null) {
                c54008LHo11.LIZ();
            }
        }
        IFriendsTabLayoutAbility LJIIJ = LJIIJ();
        if (LJIIJ == null || (str = LJIIJ.TO()) == null) {
            str = "";
        }
        ActivityC45651qj LIZLLL3 = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL3 == null || (LJFF = C53976LGi.LJFF(LIZLLL3)) == null || (arrayList = LJFF.L2()) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : arrayList) {
            if (!o.LJ(iSocialTabProtocol.getTag(), str)) {
                arrayList2.add(iSocialTabProtocol);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            String tag = ((ISocialTabProtocol) it4.next()).getTag();
            IBottomTabLayoutAbility LJII2 = LJII();
            if (LJII2 != null && LJII2.wY() && (LIZLLL = this.LJLJJL.LIZLLL(tag)) != null) {
                IFriendsTabLayoutAbility LJIIJ2 = LJIIJ();
                if (LJIIJ2 != null && (gb = LJIIJ2.gb(tag)) != null) {
                    if (LIZLLL.getNumberCount() > 0) {
                        if (!gb.LLLILZLLLI() || LIZLLL.getNumberCount() != gb.getDotCount()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gb.LLLIIL(LIZLLL.getNumberCount());
                    } else {
                        if (gb.LLLIL() || LIZLLL.getShowRedDot() != gb.LLLIIIL()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gb.LLLIIL(0);
                        if (LIZLLL.getShowRedDot()) {
                            gb.LLLIILIL();
                        } else {
                            gb.LLLILZJ();
                        }
                    }
                    if (z) {
                        if (o.LJ(tag, "FRIENDS_FEED")) {
                            str2 = "friends";
                        } else if (!o.LJ(tag, "SOCIAL_NOWS")) {
                            str2 = "";
                        } else {
                            str2 = "now";
                        }
                        C54011LHr.LJFF(gb.getDotCount(), LJIIIIZZ(), str2, gb.LLLILZLLLI());
                    }
                }
                if (o.LJ(tag, "FRIENDS_FEED")) {
                    C54029LIj.LIZIZ.LJJIJ(LIZLLL.getNumberCount());
                }
                if (o.LJ(tag, "SOCIAL_NOWS")) {
                    Z89.LIZIZ.LJ(LIZLLL.getNumberCount());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void pX(boolean z) {
        this.LJLJI = new C54008LHo("FRIENDS_TAB");
        super.pX(z);
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            C116694i1.LIZ(LIZLLL).hv0(this);
        }
        this.LJLJJI.LIZ(AbstractC73672Svk.LJIIJ(C54009LHp.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 74)));
    }

    @Override // X.InterfaceC53995LHb
    public final void Bt0(Throwable th, EnumC36206EIw source) {
        o.LJIIIZ(source, "source");
        this.LJLJJL.LJIIIZ();
        BaseRedDotImpl.LJ(null, source);
        LJIIIZ(null);
    }

    @Override // X.InterfaceC53995LHb
    public final void Ng0(NewContentResponse response, EnumC36206EIw enumC36206EIw) {
        ArrayList<ContentMetadata> arrayList;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<UserNewContent> avatarList;
        o.LJIIIZ(response, "response");
        boolean z = false;
        if (C35906E7i.LIZ() && (friendsFeedResponse = response.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null && avatarList.size() > 0) {
            z = true;
        }
        this.LJLJJLL = z;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2 = response.getFriendsFeedResponse();
        if (friendsFeedResponse2 != null) {
            arrayList = friendsFeedResponse2.getContentMetadataList();
        } else {
            arrayList = null;
        }
        LIZ(arrayList);
        this.LJLJJL.LJIIIIZZ(response);
        BaseRedDotImpl.LJ(response, enumC36206EIw);
        LJIIIZ(enumC36206EIw);
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.InterfaceC53995LHb
    public final void Zk(String str, String str2) {
        int i;
        LLQ LIZIZ;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (str2 != null) {
            str2.length();
        }
        C54008LHo c54008LHo = this.LJLJI;
        if (c54008LHo != null) {
            i = c54008LHo.getDotCount();
        } else {
            i = 0;
        }
        C54029LIj.LIZIZ.LJJIFFI(i);
        if (i > 0) {
            C54011LHr.LIZIZ(i, this.LJLJJL.LJII("FRIENDS_FEED"), C54024LIe.LJ(LIZLLL, str, null));
            return;
        }
        C54008LHo c54008LHo2 = this.LJLJI;
        if (c54008LHo2 == null || (LIZIZ = C54008LHo.LIZIZ()) == null || !LIZIZ.LJIIZILJ(c54008LHo2.LIZ)) {
            return;
        }
        C54011LHr.LIZLLL(C54024LIe.LJ(LIZLLL, str, null));
    }

    @Override // com.ss.android.ugc.aweme.dot.BaseRedDotImpl, X.LHX
    public final void ag(String fromTag, String str) {
        IBottomTabLayoutAbility LJII;
        String str2;
        o.LJIIIZ(fromTag, "fromTag");
        IFriendsTabLayoutAbility LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            LJIIJ.hp0(str);
        }
        SingleTabCounter LIZLLL = this.LJLJJL.LIZLLL(str);
        if (LIZLLL != null && (LJII = LJII()) != null && LJII.wY() && (LIZLLL.getNumberCount() > 0 || LIZLLL.getShowRedDot())) {
            String LJIIIIZZ = LJIIIIZZ();
            int numberCount = LIZLLL.getNumberCount();
            if (o.LJ(str, "FRIENDS_FEED")) {
                str2 = "friends";
            } else if (o.LJ(str, "SOCIAL_NOWS")) {
                str2 = "now";
            } else {
                str2 = "";
            }
            C54011LHr.LJFF(numberCount, LJIIIIZZ, str2, false);
        }
        this.LJLJJL.LJ(str);
        LJIIIZ(null);
        if (o.LJ(str, "FRIENDS_FEED")) {
            LHJ.LIZ.storeBoolean("has_shown_guide_dot", true);
        }
    }

    @Override // X.InterfaceC53995LHb
    public final void ym(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LJI(aweme);
        this.LJLJJL.LIZJ(i, null);
        LJIIIZ(null);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        ISocial2TabProtocolAbility LJFF;
        if (o.LJ(str, "FRIENDS_TAB")) {
            LHJ.LIZ.storeBoolean("has_shown_guide_dot", true);
            if (str2 == null) {
                str2 = "";
            }
            Zk(str2, str3);
            IBottomTabLayoutAbility LJII = LJII();
            if (LJII != null && LJII.bn() != null) {
                if (C52287Kfb.LIZ() && o.LJ(str3, "click_bottom")) {
                    Iterator<SingleTabCounter> it = this.LJLJJL.LIZJ.iterator();
                    while (it.hasNext()) {
                        SingleTabCounter next = it.next();
                        next.setNumberCount(0);
                        next.setShowRedDot(false);
                    }
                    LJIIIZ(null);
                } else if (C52287Kfb.LIZ() && o.LJ(str3, "publish_landing")) {
                    this.LJLJJL.LJIIJ();
                    LJIIIZ(null);
                    LAT.LIZIZ("FRIENDS_FEED");
                } else {
                    this.LJLJJL.LJIIJ();
                    LJIIIZ(null);
                }
            }
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL != null && (LJFF = C53976LGi.LJFF(LIZLLL)) != null && LJFF.v60()) {
                this.LJLJJL.LJIIJ();
            }
        }
    }
}
