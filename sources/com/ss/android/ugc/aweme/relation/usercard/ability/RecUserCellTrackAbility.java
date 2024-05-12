package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC238349Xa;
import X.AbstractC57378MfW;
import X.C225338sr;
import X.C227368w8;
import X.C54960Lhc;
import X.C55387LoV;
import X.C57362MfG;
import X.C57377MfV;
import X.C57581Min;
import X.C57819Mmd;
import X.C57826Mmk;
import X.C57867MnP;
import X.C57906Mo2;
import X.C57962Mow;
import X.C5H3;
import X.C62822Ol8;
import X.C76800UCe;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.InterfaceC57910Mo6;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import defpackage.s0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecUserCellTrackAbility implements ICellTrackAbility<C57826Mmk> {
    public final InterfaceC65784Pro<C57819Mmd> LJLIL;
    public final C57867MnP LJLILLLLZI;
    public final C5H3<C57962Mow> LJLJI;
    public final InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>, C76800UCe> LJLJJI;
    public final C55387LoV LJLJJL;

    public RecUserCellTrackAbility() {
        throw null;
    }

    public final Map<String, String> LIZ() {
        return this.LJLIL.invoke().LIZLLL();
    }

    public final EnumC57366MfK LIZIZ() {
        EnumC57366MfK enumC57366MfK;
        if (!this.LJLIL.invoke().LJ || (enumC57366MfK = EnumC57366MfK.POP_UP) == null) {
            return EnumC57366MfK.CARD;
        }
        return enumC57366MfK;
    }

    public final void LIZLLL(int i, C57826Mmk c57826Mmk) {
        final RecUser recUser = c57826Mmk.LJLJI;
        Map<String, String> LIZ = LIZ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        final String str = (String) linkedHashMap.get("enter_from");
        if (str == null) {
            str = "";
        }
        final String str2 = (String) linkedHashMap.get("enter_method");
        final String str3 = (String) linkedHashMap.get("previous_page");
        final String str4 = (String) linkedHashMap.get("homepage_uid");
        final Integer valueOf = Integer.valueOf(recUser.getImprOrder());
        new AbstractC238349Xa(str, recUser, str2, str3, str4, valueOf) { // from class: X.8w6
            public final String LIZIZ;
            public final User LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final Integer LJI;
            public final String LJII;
            public final java.util.Map<String, String> LJIIIIZZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C227348w6)) {
                    return false;
                }
                C227348w6 c227348w6 = (C227348w6) obj;
                return o.LJ(this.LIZIZ, c227348w6.LIZIZ) && o.LJ(this.LIZJ, c227348w6.LIZJ) && o.LJ(this.LIZLLL, c227348w6.LIZLLL) && o.LJ(this.LJ, c227348w6.LJ) && o.LJ(this.LJFF, c227348w6.LJFF) && o.LJ(this.LJI, c227348w6.LJI);
            }

            public final int hashCode() {
                int hashCode = (this.LIZJ.hashCode() + (this.LIZIZ.hashCode() * 31)) * 31;
                String str5 = this.LIZLLL;
                int hashCode2 = (hashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.LJ;
                int hashCode3 = (hashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.LJFF;
                int hashCode4 = (hashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Integer num = this.LJI;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CloseRecCellTrack(enterFrom=");
                LIZ2.append(this.LIZIZ);
                LIZ2.append(", user=");
                LIZ2.append(this.LIZJ);
                LIZ2.append(", enterMethod=");
                LIZ2.append(this.LIZLLL);
                LIZ2.append(", previousPage=");
                LIZ2.append(this.LJ);
                LIZ2.append(", homepageUid=");
                LIZ2.append(this.LJFF);
                LIZ2.append(", imprOrder=");
                return s0.LIZJ(LIZ2, this.LJI, ')', LIZ2);
            }

            @Override // X.AbstractC238349Xa
            public final String LIZ() {
                return this.LJII;
            }

            @Override // X.AbstractC238349Xa
            public final java.util.Map<String, String> LIZIZ() {
                return this.LJIIIIZZ;
            }

            {
                o.LJIIIZ(recUser, "user");
                this.LIZIZ = str;
                this.LIZJ = recUser;
                this.LIZLLL = str2;
                this.LJ = str3;
                this.LJFF = str4;
                this.LJI = valueOf;
                this.LJII = "close_recommend_user_cell";
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("enter_method", str2);
                c188727au.LJIIIZ("previous_page", str3);
                c188727au.LJIIIZ("homepage_uid", str4);
                c188727au.LJFF(valueOf, "impr_order");
                c188727au.LJIIIZ("rec_uid", recUser.getUid());
                c188727au.LJIIIZ("rec_type", recUser.getAccurateRecType());
                c188727au.LJIIIZ("req_id", recUser.getRequestId());
                String friendTypeStr = recUser.getFriendTypeStr();
                if (friendTypeStr == null) {
                    MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
                    if (matchedFriendStruct != null) {
                        friendTypeStr = matchedFriendStruct.getRelationType();
                    } else {
                        friendTypeStr = null;
                    }
                }
                c188727au.LJIIIZ("relation_type", friendTypeStr);
                C78866UxK.LJIILLIIL(c188727au, recUser);
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "newBuilder()\n        .ap…(user)\n        .builder()");
                this.LJIIIIZZ = map;
            }
        }.LIZLLL(null);
        LIZJ(LIZ, c57826Mmk, LIZIZ(), EnumC57365MfJ.CLOSE);
        InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new AqS97S0101000_9(i, c57826Mmk, 2));
        }
    }

    public final void LJ(int i, C57826Mmk c57826Mmk) {
        RecUser element = c57826Mmk.LJLJI;
        C57962Mow value = this.LJLJI.getValue();
        o.LJIIIZ(value, "<this>");
        o.LJIIIZ(element, "element");
        if (!((CopyOnWriteArraySet) value.LJLL).add(element.getElementId())) {
            return;
        }
        this.LJLJJL.LIZ(1, element.getUid());
        Map<String, String> LIZ = LIZ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
        String str = (String) linkedHashMap.get("enter_from");
        if (str == null) {
            str = "";
        }
        new C227368w8(str, element, (String) linkedHashMap.get("enter_method"), (String) linkedHashMap.get("previous_page"), (String) linkedHashMap.get("homepage_uid"), Integer.valueOf(element.getImprOrder()), element.isRelatedRec()).LIZLLL(null);
        LIZJ(LIZ, c57826Mmk, LIZIZ(), EnumC57365MfJ.SHOW);
        InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new AqS97S0101000_9(i, element, 10));
        }
    }

    public RecUserCellTrackAbility(AqS159S0100000_9 aqS159S0100000_9, C57867MnP listConfig, C62822Ol8 c62822Ol8, C57906Mo2 c57906Mo2) {
        C55387LoV c55387LoV = C54960Lhc.LIZ;
        o.LJIIIZ(listConfig, "listConfig");
        this.LJLIL = aqS159S0100000_9;
        this.LJLILLLLZI = listConfig;
        this.LJLJI = c62822Ol8;
        this.LJLJJI = c57906Mo2;
        this.LJLJJL = c55387LoV;
    }

    public final void LIZJ(Map<String, String> map, C57826Mmk c57826Mmk, EnumC57366MfK enumC57366MfK, EnumC57365MfJ enumC57365MfJ) {
        boolean z;
        RecUser recUser = c57826Mmk.LJLJI;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLI = enumC57366MfK;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            z = o.LJ(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        } else {
            z = false;
        }
        c57362MfG.LJJIJL((String) ((LinkedHashMap) map).get("enter_from"), z);
        c57362MfG.LJJJJIZL(recUser);
        c57362MfG.LJLJLLL = C57581Min.LIZLLL(recUser, this.LJLILLLLZI) ? 1 : 0;
        c57362MfG.LJLJLJ = c57826Mmk.LJLJJI;
        AbstractC57378MfW from = recUser.getFrom();
        if (from instanceof C57377MfV) {
            C57377MfV c57377MfV = (C57377MfV) from;
            String fromUid = c57377MfV.getUid();
            int iterateCnt = c57377MfV.getIterateCnt();
            o.LJIIIZ(fromUid, "fromUid");
            c57362MfG.LJLIIIL = true;
            c57362MfG.LJLIIL = fromUid;
            c57362MfG.LJLIL = iterateCnt;
        } else if (from instanceof C225338sr) {
            c57362MfG.LJLILLLLZI = true;
        }
        c57362MfG.LIZ(map);
        c57362MfG.LJIILIIL();
    }
}
