package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS12S0500000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9hX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243799hX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "twitter" : "youtube" : "instagram";
    }

    public static java.util.Map LIZIZ(SocialEntranceData socialEntranceData) {
        SocialConnect socialConnect;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (socialEntranceData != null && (socialConnect = socialEntranceData.getSocialConnect()) != null) {
            String youtubeChannelId = socialConnect.getYoutubeChannelId();
            if (youtubeChannelId != null && youtubeChannelId.length() != 0) {
                linkedHashMap.put(2, new C243819hZ(socialConnect.getYoutubeChannelId(), socialConnect.getYoutubeChannelTitle()));
            }
            String insId = socialConnect.getInsId();
            if (insId != null && insId.length() != 0) {
                linkedHashMap.put(1, new C243819hZ(socialConnect.getInsId(), socialConnect.getInsId()));
            }
        }
        return linkedHashMap;
    }

    public static java.util.Map LIZJ(User user) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String youtubeChannelId = user.getYoutubeChannelId();
        if (youtubeChannelId != null && youtubeChannelId.length() != 0) {
            linkedHashMap.put(2, new C243819hZ(user.getYoutubeChannelId(), user.getYoutubeChannelTitle()));
        }
        String insId = user.getInsId();
        if (insId != null && insId.length() != 0) {
            linkedHashMap.put(1, new C243819hZ(user.getInsId(), user.getInsId()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.profile.model.User r8, int r9, X.C243839hb r10) {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r1 = X.HG3.LJIILL()
            r0 = 0
            if (r8 == 0) goto Lb
            java.lang.String r0 = r8.getUid()
        Lb:
            X.RBX r1 = (X.RBX) r1
            boolean r0 = r1.isMe(r0)
            if (r0 == 0) goto L6a
            java.lang.String r7 = "personal_homepage"
        L15:
            java.lang.String r6 = LJ(r9)
            java.lang.String r5 = r10.LJLJJI
            if (r8 != 0) goto L50
            r4 = -1
        L1e:
            java.lang.String r3 = ""
        L20:
            java.lang.String r2 = r10.LJLJI
            java.lang.String r1 = "previousPage"
            java.lang.String r0 = "groupId"
            X.7au r1 = X.C78928UyK.LIZ(r5, r1, r2, r0)
            java.lang.String r0 = "enter_from"
            r1.LJIIIZ(r0, r7)
            java.lang.String r0 = "platform"
            r1.LJIIIZ(r0, r6)
            java.lang.String r0 = "previous_page"
            r1.LJIIIZ(r0, r5)
            java.lang.String r0 = "follow_status"
            r1.LIZLLL(r4, r0)
            java.lang.String r0 = "to_user_id"
            r1.LJIIIZ(r0, r3)
            java.lang.String r0 = "group_id"
            r1.LJIIIZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "click_social_account"
            X.FMX.LJIIL(r0, r1)
            return
        L50:
            int r0 = r8.getFollowStatus()
            if (r0 != 0) goto L65
            int r1 = r8.getFollowerStatus()
            r0 = 1
            if (r1 != r0) goto L65
            r4 = 3
        L5e:
            java.lang.String r3 = r8.getUid()
            if (r3 != 0) goto L20
            goto L1e
        L65:
            int r4 = r8.getFollowStatus()
            goto L5e
        L6a:
            java.lang.String r7 = "others_homepage"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243799hX.LJFF(com.ss.android.ugc.aweme.profile.model.User, int, X.9hb):void");
    }

    public static void LJII(java.util.Set thirdPartySocialSet, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(thirdPartySocialSet, "thirdPartySocialSet");
        if (thirdPartySocialSet.contains(3)) {
            interfaceC88472Yns.invoke(Integer.valueOf(R.raw.icon_twitter));
            String string = C86V.LJ().getString(R.string.amw);
            o.LJIIIIZZ(string, "getResources().getString…bels_profile_btn_twitter)");
            interfaceC88472Yns2.invoke(string);
        }
        if (thirdPartySocialSet.contains(2)) {
            interfaceC88472Yns.invoke(Integer.valueOf(R.raw.icon_youtube));
            String string2 = C86V.LJ().getString(R.string.amx);
            o.LJIIIIZZ(string2, "getResources().getString…bels_profile_btn_youtube)");
            interfaceC88472Yns2.invoke(string2);
        }
        if (thirdPartySocialSet.contains(1)) {
            interfaceC88472Yns.invoke(Integer.valueOf(R.raw.icon_instagram));
            String string3 = C86V.LJ().getString(R.string.amq);
            o.LJIIIIZZ(string3, "getResources().getString…ls_profile_btn_instagram)");
            interfaceC88472Yns2.invoke(string3);
        }
    }

    public static List LIZ(Context context, User user, C243839hb mobParam, java.util.Map socialMap) {
        String str;
        String str2;
        o.LJIIIZ(mobParam, "mobParam");
        o.LJIIIZ(socialMap, "socialMap");
        ArrayList arrayList = new ArrayList();
        if (user != null && context != null && !socialMap.isEmpty()) {
            C243809hY c243809hY = new C243809hY(socialMap);
            String str3 = "";
            if (socialMap.containsKey(1)) {
                String LJJZ = C44384HbQ.LJJZ(R.string.idx);
                Object[] objArr = new Object[1];
                C243819hZ c243819hZ = (C243819hZ) socialMap.get(1);
                if (c243819hZ == null || (str2 = c243819hZ.LIZIZ) == null) {
                    str2 = "";
                }
                objArr[0] = str2;
                arrayList.add(LIZLLL(context, c243809hY, user, new C243829ha(1, Q8U.LIZIZ(objArr, 1, LJJZ, "format(format, *args)"), R.raw.icon_instagram), mobParam));
            }
            if (socialMap.containsKey(2)) {
                String LJJZ2 = C44384HbQ.LJJZ(R.string.idy);
                Object[] objArr2 = new Object[1];
                C243819hZ c243819hZ2 = (C243819hZ) socialMap.get(2);
                if (c243819hZ2 != null && (str = c243819hZ2.LIZIZ) != null) {
                    str3 = str;
                }
                objArr2[0] = str3;
                arrayList.add(LIZLLL(context, c243809hY, user, new C243829ha(2, Q8U.LIZIZ(objArr2, 1, LJJZ2, "format(format, *args)"), R.raw.icon_youtube), mobParam));
            }
        }
        return arrayList;
    }

    public static void LJI(Context context, User user, C243839hb mobParam, java.util.Map thirdPartySocialMap) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        o.LJIIIZ(thirdPartySocialMap, "thirdPartySocialMap");
        o.LJIIIZ(mobParam, "mobParam");
        int size = thirdPartySocialMap.size();
        if (size == 1) {
            int intValue = ((Number) ORZ.LJLLILLLL(thirdPartySocialMap.keySet())).intValue();
            LJFF(user, intValue, mobParam);
            C26335AVf.LJIIL(mobParam.LJLIL, mobParam.LJLILLLLZI, mobParam.LJLJI, LJ(intValue));
            C243809hY c243809hY = new C243809hY(thirdPartySocialMap);
            if (context != null) {
                YFM.LIZIZ.startThirdSocialActivity(context, c243809hY, intValue);
                return;
            }
            return;
        }
        if (size > 1) {
            C26335AVf.LJIIL(mobParam.LJLIL, mobParam.LJLILLLLZI, mobParam.LJLJI, "social_button");
            List LIZ2 = LIZ(context, user, mobParam, thirdPartySocialMap);
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
                return;
            }
            C245319jz c245319jz = new C245319jz();
            c245319jz.LJ(LIZ2);
            c245319jz.LIZJ().show(supportFragmentManager, "third social");
        }
    }

    public static C252659vp LIZLLL(Context context, C243809hY c243809hY, User user, C243829ha c243829ha, C243839hb c243839hb) {
        C252659vp c252659vp = new C252659vp();
        c252659vp.LIZJ(c243829ha.LJLJI);
        c252659vp.LIZIZ(c243829ha.LJLILLLLZI);
        c252659vp.LJ = new ACListenerS21S0100000_1(new AqS12S0500000_4(context, c243809hY, user, c243829ha, c243839hb, 3), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        return c252659vp;
    }
}
