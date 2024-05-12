package com.ss.android.ugc.aweme.tag.viewmodel;

import X.C186977Vl;
import X.C186997Vn;
import X.C221108m2;
import X.C242289f6;
import X.C242419fJ;
import X.C246759mJ;
import X.C246849mS;
import X.C246859mT;
import X.C247069mo;
import X.C2U8;
import X.C32I;
import X.C47704Ins;
import X.C55749LuL;
import X.C56331M8x;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78404Ups;
import X.C79004UzY;
import X.C7FK;
import X.EV6;
import X.EnumC246809mO;
import X.EnumC246869mU;
import X.InterfaceC246829mQ;
import X.InterfaceC88473Ynt;
import X.ORZ;
import X.T16;
import Y.AfS56S0100000_4;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTagFriendsListViewModel extends AssemViewModel<C242289f6> {
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C247069mo.class));
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C7FK.class, null), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 870));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 871));
    public final IMUser LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public List<String> LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;
    public final List<String> LJLLILLLL;
    public final HashMap<Integer, Set<String>> LJLLJ;
    public C242419fJ LJLLL;
    public String LJLLLL;
    public final Set<String> LJLLLLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C242289f6 defaultState() {
        return new C242289f6(0);
    }

    public final C7FK gv0() {
        C7FK c7fk = (C7FK) this.LJLILLLLZI.getValue();
        if (c7fk == null) {
            return new C7FK(null, null, 0, null, null, 31, null);
        }
        return c7fk;
    }

    public final LinkedHashSet<IMUser> iv0() {
        return (LinkedHashSet) this.LJLJJI.getValue();
    }

    public final boolean kv0() {
        return ((Boolean) this.LJLL.getValue()).booleanValue();
    }

    public final void nv0() {
        long j;
        String aid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C79004UzY.LJJIFFI(gv0().getTagged())) {
            Iterator<IMUser> it = iv0().iterator();
            while (it.hasNext()) {
                IMUser next = it.next();
                if (!TextUtils.isEmpty(next.getUid())) {
                    String uid = next.getUid();
                    o.LJIIIIZZ(uid, "it.uid");
                    arrayList.add(uid);
                }
            }
        } else if (C79004UzY.LJJIFFI(iv0())) {
            for (IMUser iMUser : gv0().getTagged()) {
                if (!TextUtils.isEmpty(iMUser.getUid())) {
                    String uid2 = iMUser.getUid();
                    o.LJIIIIZZ(uid2, "it.uid");
                    arrayList2.add(uid2);
                }
            }
        } else {
            for (IMUser iMUser2 : gv0().getTagged()) {
                if (!iv0().contains(iMUser2)) {
                    String uid3 = iMUser2.getUid();
                    o.LJIIIIZZ(uid3, "it.uid");
                    arrayList2.add(uid3);
                }
            }
            Iterator<IMUser> it2 = iv0().iterator();
            while (it2.hasNext()) {
                IMUser next2 = it2.next();
                if (!gv0().getTagged().contains(next2)) {
                    String uid4 = next2.getUid();
                    o.LJIIIIZZ(uid4, "it.uid");
                    arrayList.add(uid4);
                }
            }
        }
        if (C79004UzY.LJJIFFI(arrayList) && C79004UzY.LJJIFFI(arrayList2)) {
            setState(C246759mJ.LJLIL);
            return;
        }
        InterfaceC246829mQ interfaceC246829mQ = (InterfaceC246829mQ) this.LJLIL.getValue().getOperator();
        String abstractCollection = arrayList.toString();
        String abstractCollection2 = arrayList2.toString();
        Aweme aweme = gv0().getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            j = CastLongProtector.parseLong(aid);
        } else {
            j = 0;
        }
        interfaceC246829mQ.tagUpdate(abstractCollection, abstractCollection2, j).LJJL(T16.LIZ()).LJJJLIIL(new AfS56S0100000_4(this, 63), new AfS56S0100000_4(this, 64));
    }

    public VideoTagFriendsListViewModel() {
        IMUser fromUser = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        o.LJIIIIZZ(fromUser, "fromUser(ServiceManager.…:class.java).currentUser)");
        this.LJLJJL = fromUser;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 869));
        C221108m2.LIZIZ(C246859mT.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(C246849mS.LJLIL);
        this.LJLJLLL = new ArrayList();
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 868));
        this.LJLLILLLL = new ArrayList();
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(EnumC246809mO.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC246809mO.BLOCK_RELATION.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC246809mO.PRIVACY_SETTING.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC246809mO.PASS.getType()), new LinkedHashSet());
        this.LJLLJ = hashMap;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLLL = new C242419fJ(c61878OQg, c61878OQg, c61878OQg, c61878OQg);
        this.LJLLLL = "other";
        this.LJLLLLLL = new LinkedHashSet();
    }

    public static String hv0(IMUser user) {
        o.LJIIIZ(user, "user");
        return C56331M8x.LIZJ(user.getNickName(), user.getUniqueId(), false, false);
    }

    public final String jv0(IMUser iMUser) {
        if (this.LJLLL.LJLIL.contains(iMUser)) {
            return "recent";
        }
        if (this.LJLLL.LJLILLLLZI.contains(iMUser)) {
            return "friends";
        }
        if (this.LJLLL.LJLJI.contains(iMUser)) {
            return "following";
        }
        return "";
    }

    public final void mv0(boolean z) {
        boolean z2;
        Aweme aweme;
        if (iv0().size() != gv0().getTagged().size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<IMUser> LLJI = ORZ.LLJI(iv0());
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        for (IMUser iMUser : LLJI) {
            if (!z2 && !gv0().getTagged().contains(iMUser)) {
                z2 = true;
            }
            arrayList.add(IMUser.toInteractionTagUserInfo(iMUser));
        }
        List<InteractionTagUserInfo> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        if (z2 && (aweme = gv0().getAweme()) != null) {
            InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
            if (interactionTagInfo != null) {
                interactionTagInfo.setTaggedUsers(LLJILJILJ);
            } else {
                aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", LLJILJILJ));
            }
            C2U8.LIZ(new InteractionTagInfoEvent(aweme));
        }
        InterfaceC88473Ynt<List<InteractionTagUserInfo>, Boolean, Boolean, C76800UCe> tagPanelOnDismiss = gv0().getTagPanelOnDismiss();
        if (tagPanelOnDismiss != null) {
            tagPanelOnDismiss.invoke(LLJILJILJ, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public final void lv0(IMUser imUser, boolean z, EnumC246869mU scene) {
        o.LJIIIZ(imUser, "imUser");
        o.LJIIIZ(scene, "scene");
        if (this.LJLLI || z == iv0().contains(imUser)) {
            return;
        }
        if (z) {
            iv0().add(imUser);
            if (scene == EnumC246869mU.SEARCH && C186997Vn.LIZJ()) {
                List<? extends IMUser> LLJILJILJ = ORZ.LLJILJILJ(C186977Vl.LIZ);
                ListProtector.add(LLJILJILJ, 0, imUser);
                List LLJILJILJ2 = ORZ.LLJILJILJ(this.LJLLL.LJLIL);
                List LLJILJILJ3 = ORZ.LLJILJILJ(this.LJLLL.LJLILLLLZI);
                List LLJILJILJ4 = ORZ.LLJILJILJ(this.LJLLL.LJLJI);
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    ArrayList arrayList = (ArrayList) LLJILJILJ2;
                    if (arrayList.contains(next)) {
                        arrayList.remove(next);
                    } else {
                        ArrayList arrayList2 = (ArrayList) LLJILJILJ3;
                        if (arrayList2.contains(next)) {
                            arrayList2.remove(next);
                        } else {
                            ArrayList arrayList3 = (ArrayList) LLJILJILJ4;
                            if (arrayList3.contains(next)) {
                                arrayList3.remove(next);
                            }
                        }
                    }
                }
                ((ArrayList) LLJILJILJ2).addAll(0, LLJILJILJ);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(LLJILJILJ2);
                arrayList4.addAll(LLJILJILJ3);
                arrayList4.addAll(LLJILJILJ4);
                C242419fJ c242419fJ = new C242419fJ(LLJILJILJ2, LLJILJILJ3, LLJILJILJ4, arrayList4);
                this.LJLLL = c242419fJ;
                C186977Vl.LIZ = LLJILJILJ;
                setState(new AqS170S0100000_4(c242419fJ, 794));
            }
        } else {
            iv0().remove(imUser);
        }
        setState(new AqS170S0100000_4(imUser, 795));
    }
}
