package X;

import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.recuser.RecUserServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MlL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57739MlL {
    public static final InterfaceC57579Mil LIZ = RecUserServiceImpl.LJIILLIIL().LJIILL();

    public static C57749MlV LIZ(MatchedFriendStruct matchedFriendStruct) {
        String str;
        String LJFF;
        if (matchedFriendStruct != null) {
            str = matchedFriendStruct.getRecommendReason();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            if (matchedFriendStruct != null) {
                LJFF = matchedFriendStruct.getRecommendReason();
            } else {
                LJFF = null;
            }
        } else {
            LJFF = C86V.LJFF(R.string.pm6);
        }
        if (LJFF == null) {
            LJFF = "";
        }
        return new C57749MlV(new C57742MlO(LJFF, C61878OQg.INSTANCE), null);
    }

    public static List LIZIZ(MatchedFriendStruct matchedFriendStruct) {
        List<MutualUser> userList;
        String nickname;
        o.LJIIIZ(matchedFriendStruct, "<this>");
        ArrayList arrayList = new ArrayList();
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        if (mMutualStruct != null && (userList = mMutualStruct.getUserList()) != null) {
            for (MutualUser mutualUser : userList) {
                if (mutualUser != null && (nickname = mutualUser.getNickname()) != null) {
                    arrayList.add(nickname);
                }
            }
        }
        return arrayList;
    }

    public static C57749MlV LIZJ(MatchedFriendStruct data, C58055MqR config) {
        String recommendReason;
        EnumC57577Mij enumC57577Mij;
        C57578Mik c57578Mik;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(config, "config");
        ArrayList arrayList = new ArrayList();
        if (C78685UuP.LJJJZ(data.getRecommendReason())) {
            recommendReason = C86V.LJFF(R.string.gou);
            o.LJIIIIZZ(recommendReason, "getString(R.string.from_your_contacts)");
        } else {
            recommendReason = data.getRecommendReason();
            if (recommendReason == null) {
                recommendReason = "";
            }
        }
        EnumC57577Mij enumC57577Mij2 = null;
        if (config.LIZ == EnumC57741MlN.NOW_POST) {
            recommendReason = C86V.LJFF(R.string.gou);
            o.LJIIIIZZ(recommendReason, "getString(R.string.from_your_contacts)");
        } else {
            try {
                String LJFF = C86V.LJFF(R.string.pzt);
                o.LJIIIIZZ(LJFF, "getString(R.string.relat…hiplabel_contacts_and_fb)");
                ExternalRecommendReasonStruct externalRecommendReasonStruct = data.getExternalRecommendReasonStruct();
                if (externalRecommendReasonStruct != null) {
                    String hashedPhoneNumber = externalRecommendReasonStruct.getHashedPhoneNumber();
                    if (C78685UuP.LJJJZ(hashedPhoneNumber) && hashedPhoneNumber != null) {
                        arrayList.add(LIZ.LIZ(hashedPhoneNumber));
                    }
                }
                if (!arrayList.isEmpty()) {
                    new C26310AUg(data.getRecType(), C78926UyI.LJIL(config), EnumC58046MqI.CONTACT, true, enumC57577Mij2, 32).LIZLLL(null);
                    recommendReason = LJFF;
                } else {
                    throw new Exception("no contact fetched");
                }
            } catch (Exception e) {
                arrayList.clear();
                String recType = data.getRecType();
                String LJIL = C78926UyI.LJIL(config);
                EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
                boolean z = false;
                if (!(e instanceof C57578Mik) || (c57578Mik = (C57578Mik) e) == null || (enumC57577Mij = c57578Mik.getReason()) == null) {
                    enumC57577Mij = EnumC57577Mij.UNKNOWN;
                }
                new C26310AUg(recType, LJIL, enumC58046MqI, z, enumC57577Mij, 32).LIZLLL(null);
            }
        }
        return new C57749MlV(new C57742MlO(recommendReason, arrayList), null);
    }

    public static C57749MlV LIZLLL(MatchedFriendStruct data, C58055MqR config) {
        String recommendReason;
        EnumC57577Mij enumC57577Mij;
        C57578Mik c57578Mik;
        String externalUsername;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(config, "config");
        ArrayList arrayList = new ArrayList();
        if (C78685UuP.LJJJZ(data.getRecommendReason())) {
            recommendReason = C86V.LJFF(R.string.pm6);
            o.LJIIIIZZ(recommendReason, "getString(R.string.pymk)");
        } else {
            recommendReason = data.getRecommendReason();
            if (recommendReason == null) {
                recommendReason = "";
            }
        }
        EnumC57577Mij enumC57577Mij2 = null;
        if (config.LIZ == EnumC57741MlN.NOW_POST) {
            recommendReason = C86V.LJFF(R.string.pm6);
            o.LJIIIIZZ(recommendReason, "getString(R.string.pymk)");
        } else {
            try {
                String LJFF = C86V.LJFF(R.string.pzt);
                o.LJIIIIZZ(LJFF, "getString(R.string.relat…hiplabel_contacts_and_fb)");
                ExternalRecommendReasonStruct externalRecommendReasonStruct = data.getExternalRecommendReasonStruct();
                if (externalRecommendReasonStruct != null && (externalUsername = externalRecommendReasonStruct.getExternalUsername()) != null) {
                    arrayList.add(externalUsername);
                }
                if (!arrayList.isEmpty()) {
                    new C26310AUg(data.getRecType(), C78926UyI.LJIL(config), EnumC58046MqI.FACEBOOK, true, enumC57577Mij2, 32).LIZLLL(null);
                    recommendReason = LJFF;
                } else {
                    throw new Exception("no fb friend fetched");
                }
            } catch (Exception e) {
                arrayList.clear();
                String recType = data.getRecType();
                String LJIL = C78926UyI.LJIL(config);
                EnumC58046MqI enumC58046MqI = EnumC58046MqI.FACEBOOK;
                boolean z = false;
                if (!(e instanceof C57578Mik) || (c57578Mik = (C57578Mik) e) == null || (enumC57577Mij = c57578Mik.getReason()) == null) {
                    enumC57577Mij = EnumC57577Mij.UNKNOWN;
                }
                new C26310AUg(recType, LJIL, enumC58046MqI, z, enumC57577Mij, 32).LIZLLL(null);
            }
        }
        return new C57749MlV(new C57742MlO(recommendReason, arrayList), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r5 > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r5 > 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C57749MlV LJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C58055MqR r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57739MlL.LJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.MqR):X.MlV");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r5 <= 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C57749MlV LJFF(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C58055MqR r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57739MlL.LJFF(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.MqR):X.MlV");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r5 <= 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C57749MlV LJI(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C58055MqR r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57739MlL.LJI(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.MqR):X.MlV");
    }

    public static C57749MlV LJII(MatchedFriendStruct data, C58055MqR config) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(config, "config");
        String recommendReason = data.getRecommendReason();
        if (recommendReason == null || (recommendReason.length() == 0 && (recommendReason = C86V.LJFF(R.string.pm6)) == null)) {
            recommendReason = C86V.LJFF(R.string.pm6);
            o.LJIIIIZZ(recommendReason, "getString(R.string.pymk)");
        }
        return new C57749MlV(new C57742MlO(recommendReason, C61878OQg.INSTANCE), null);
    }
}
