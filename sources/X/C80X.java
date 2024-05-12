package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.80X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80X {
    public static final java.util.Map<String, Long> LIZ;
    public static final Type LIZIZ;
    public static final SharedPreferences LIZJ;
    public static List<String> LIZLLL;
    public static Long LJ;
    public static Long LJFF;
    public static final Handler LJI;
    public static C2LF LJII;
    public static final C2LE LJIIIIZZ;

    static {
        java.util.Map<String, Long> linkedHashMap;
        LIZ = new LinkedHashMap();
        Type type = new TypeToken<java.util.Map<String, Long>>() { // from class: X.2P3
        }.getType();
        LIZIZ = type;
        LJI = new Handler(C16880lQ.LLJJJJ());
        SharedPreferences LIZIZ2 = F9J.LIZIZ(EF7.LIZIZ(), 0, "sp_stay_home_guide_cache");
        o.LJIIIIZZ(LIZIZ2, "AppContextManager.getApp…HE, Context.MODE_PRIVATE)");
        LIZJ = LIZIZ2;
        try {
            Object LJII2 = new Gson().LJII(LIZIZ2.getString("sp_stay_home_cache_video_id", ""), type);
            o.LJIIIIZZ(LJII2, "{\n            Gson().fro…VideoIdMapType)\n        }");
            linkedHashMap = (java.util.Map) LJII2;
        } catch (Exception unused) {
            linkedHashMap = new LinkedHashMap<>();
        }
        LIZ = linkedHashMap;
        LJIIIIZZ = C2LE.LJLIL;
    }

    public static void LIZ(String str) {
        java.util.Map<String, Long> map = LIZ;
        if (map.containsKey(str)) {
            return;
        }
        if (map.size() >= 20) {
            map.entrySet().remove(ORZ.LJLLILLLL(map.entrySet()));
        }
        map.put(str, Long.valueOf(System.currentTimeMillis()));
        LIZJ.edit().putString("sp_stay_home_cache_video_id", GsonProtectorUtils.toJson(new Gson(), map, LIZIZ)).apply();
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme != null && AnonymousClass803.LIZ()) {
            C115674gN.LIZ.getClass();
            if (!AnonymousClass922.LIZ(aweme)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            boolean r0 = X.C80S.LJFF(r6)
            r5 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            boolean r0 = X.C80S.LIZJ(r6)
            if (r0 != 0) goto L1c
            if (r6 == 0) goto L66
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r6.getStatus()
            if (r0 == 0) goto L1d
            boolean r0 = r0.isProhibited()
            if (r0 != r5) goto L1d
        L1c:
            return r2
        L1d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            if (r0 == 0) goto L66
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            X.RBY r1 = r0.LJFF()
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r0 = r0.getUid()
            boolean r0 = r1.isMe(r0)
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            boolean r0 = r0.isSecret()
        L57:
            if (r0 == 0) goto L66
            goto L1c
        L5a:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.isSecret()
            goto L57
        L66:
            boolean r0 = LJIIJJI(r6)
            if (r0 == 0) goto L76
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "stay_home_share_guide"
            int r0 = X.C00F.LIZ(r1, r2, r0, r5)
            if (r0 != 0) goto L77
        L76:
            return r5
        L77:
            if (r6 == 0) goto La8
            java.lang.String r0 = r6.getAid()
            if (r0 == 0) goto La8
            java.lang.String r1 = r6.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.Long> r0 = X.C80X.LIZ
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto La8
            r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r0.longValue()
            long r3 = r3 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La6
        La5:
            return r5
        La6:
            r5 = 0
            goto La5
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80X.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static boolean LJI(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || LIZ.containsKey(aweme.getAid())) {
            return false;
        }
        int LIZ2 = SU4.LIZ(System.currentTimeMillis());
        SharedPreferences sharedPreferences = LIZJ;
        if (sharedPreferences.getInt("sp_modified_button_date", -1) != LIZ2) {
            sharedPreferences.edit().putInt("sp_modified_button_date", LIZ2).apply();
            sharedPreferences.edit().putInt("sp_modified_button_count", 0).apply();
        } else {
            sharedPreferences.edit().putInt("sp_modified_button_count", sharedPreferences.getInt("sp_modified_button_count", 0) + 1).apply();
        }
        if (sharedPreferences.getInt("sp_modified_button_count", 0) < 7) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            LIZ(aid);
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || LIZ.containsKey(aweme.getAid())) {
            return false;
        }
        int LIZ2 = SU4.LIZ(System.currentTimeMillis());
        SharedPreferences sharedPreferences = LIZJ;
        if (sharedPreferences.getInt("sp_toast_guide_date", -1) != LIZ2) {
            sharedPreferences.edit().putInt("sp_toast_guide_date", LIZ2).apply();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            LIZ(aid);
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        String cid;
        List<String> LIZIZ2;
        if (aweme != null && (textExtra = aweme.getTextExtra()) != null && textExtra.size() > 0) {
            if (LIZLLL == null) {
                String LIZIZ3 = C1A7.LJIILLIIL("user_growth").LIZIZ("stay_home_ids", "");
                if (!TextUtils.isEmpty(LIZIZ3)) {
                    try {
                        LIZIZ2 = JsonParseUtils.LIZIZ(String.class, LIZIZ3);
                        if (LIZIZ2 == null) {
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    LIZLLL = LIZIZ2;
                }
                LIZIZ2 = new ArrayList<>();
                LIZLLL = LIZIZ2;
            }
            List<String> list = LIZLLL;
            if (list != null && list.size() > 0) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    for (String str : list) {
                        if (textExtraStruct != null && (cid = textExtraStruct.getCid()) != null && cid.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme, String str) {
        if (aweme == null || !o.LJ("video_play_three_seconds", "video_play_three_seconds") || C7DI.LIZ == 0 || !C4LD.LIZIZ.LJIILL(aweme, str)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str, Aweme aweme, VideoShareViewModel videoShareViewModel) {
        OSZ<Boolean, String> osz;
        boolean z;
        boolean z2;
        if (aweme == null) {
            return false;
        }
        String LJJLIIIJL = C4LD.LIZIZ.LJJLIIIJL();
        ArrayList LJII2 = C47261Igj.LJII("play_3s", "like");
        if (videoShareViewModel != null) {
            osz = videoShareViewModel.LJLLJ;
            if (osz == null) {
                osz = C4LD.LIZIZ.LJFF(aweme);
            }
        } else {
            osz = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("shareCampaignId.isNotEmpty()");
        if (LJJLIIIJL.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.append(z);
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("videoShareVM?.shareCampaignPair?.first == true");
        if (osz != null && osz.getFirst().booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ3.append(z2);
        X1D.LIZIZ(LIZ3);
        if (!ORZ.LJLJJI(str, LJII2) || LJJLIIIJL.length() <= 0 || osz == null || !osz.getFirst().booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Aweme aweme, String str, boolean z) {
        if (aweme == null || str == null || C54838Lfe.LJJI(aweme) || C80L.LIZ.LIZ.contains(str) || z) {
            return false;
        }
        return true;
    }

    public static InterfaceC82683Wch LJIIJ(Activity activity, View anchor, InterfaceC64592gB interfaceC64592gB) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(anchor, "anchor");
        if (C80Y.LIZ(activity)) {
            return null;
        }
        C139825eE c139825eE = new C139825eE(activity);
        c139825eE.LJIIJJI(R.string.tnr);
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LIZIZ = anchor;
        c82682Wcg.LJIJJLI = false;
        c82682Wcg.LJII = -1001L;
        c139825eE.LJI(WHL.START);
        c139825eE.LJIIJ(new ACListenerS21S0100000_1(interfaceC64592gB, 145), true);
        c139825eE.LJ(new AqS151S0100000_1(interfaceC64592gB, (InterfaceC64592gB<Boolean>) 795));
        InterfaceC82683Wch LIZJ2 = c139825eE.LIZJ();
        LIZJ2.show();
        return LIZJ2;
    }

    public static boolean LJII(Aweme aweme, boolean z, int i, String str) {
        if (aweme == null || str == null) {
            return false;
        }
        if (i == 1) {
            ShareInfo shareInfo = aweme.getShareInfo();
            if (shareInfo == null || shareInfo.getShareButtonDisplayMode() != 1) {
                return false;
            }
        } else {
            int i2 = 2;
            try {
                SettingsManager.LIZLLL().getClass();
                i2 = SettingsManager.LJ("share_guide_video_loop_times", 2);
            } catch (Throwable unused) {
            }
            if (i < i2) {
                return false;
            }
        }
        if (!LJIIIIZZ(aweme, str, z)) {
            return false;
        }
        return true;
    }

    public static void LJ(String str, String str2, String str3, Aweme aweme, VideoShareViewModel videoShareViewModel) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
        c188727au.LJIIIZ("highlight_cause", str2);
        if (LIZIZ(str2, aweme, videoShareViewModel)) {
            c188727au.LJI("holiday_id", C4LD.LIZIZ.LJJLIIIJL());
        } else {
            c188727au.LJI("show_content", str3);
        }
        if (aweme != null && aweme.getAwemeType() == 150) {
            c188727au.LIZLLL(150, "aweme_type");
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c188727au.LIZLLL(imageList.size(), "pic_cnt");
            }
        }
        FMX.LJIIL("share_highlight", c188727au.LIZ);
    }
}
