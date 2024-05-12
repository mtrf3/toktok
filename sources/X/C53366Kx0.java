package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Kx0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53366Kx0 implements InterfaceC252619vl {
    public static final C53366Kx0 LJLIL;
    public static List<java.util.Map<String, String>> LJLILLLLZI;
    public static String LJLJI;
    public static final List<String> LJLJJI;
    public static final String[] LJLJJL;
    public static final C62822Ol8 LJLJJLL;
    public static String LJLJL;
    public static InterfaceC88472Yns<? super String, Integer> LJLJLJ;

    static {
        C53366Kx0 c53366Kx0 = new C53366Kx0();
        LJLIL = c53366Kx0;
        ((RBX) HG3.LJIILL()).addUserChangeListener(c53366Kx0);
        LJLJJI = C47261Igj.LJJIJIL("inbox_redesign_type", "inbox_redesign_v1_adjustment_type", "inbox_redesign_optimize_phase_3", "inbox_system_notification_message_box", "inbox_new_follow_ordering_enable", "inbox_tts_entrance_v3", "nickname_instead_of_username", "inbox_system_notification_unread_flag", "activity_flush_strategy", "activity_sort_strategy", "inbox_activity_load_optimize_strategy", "tt_merge_follow_request_into_new_follower", "new_followers_preload", "use_rec_notice_follow_page", "creator_inbox_experiment");
        LJLJJL = new String[0];
        LJLJJLL = C221108m2.LIZIZ(C53367Kx1.LJLIL);
        LJLJL = "";
    }

    public static int LIZJ(String str) {
        InterfaceC88472Yns<? super String, Integer> interfaceC88472Yns = LJLJLJ;
        if (interfaceC88472Yns != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getRegisteredValue by fixed method ");
            LIZ.append(str);
            C221018lt.LJFF("InboxEntranceABKeyListSettings", X1D.LIZIZ(LIZ));
            return interfaceC88472Yns.invoke(str).intValue();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getRegisteredValue ");
        LIZ2.append(str);
        C221018lt.LJFF("InboxEntranceABKeyListSettings", X1D.LIZIZ(LIZ2));
        int i = 0;
        try {
            FFL.LJIIIZ().getClass();
            Integer num = (Integer) FFL.LJIJ(true, str, 0, C53369Kx3.class, 0);
            if (num == null) {
                return 0;
            }
            i = num.intValue();
            return i;
        } catch (Exception e) {
            StringBuilder LJFF = C72972SkS.LJFF(str, ' ');
            LJFF.append(e.getMessage());
            C221018lt.LIZIZ("InboxEntranceABKeyListSettings", X1D.LIZIZ(LJFF));
            try {
                FFL LJIIIZ = FFL.LJIIIZ();
                Boolean bool = Boolean.FALSE;
                LJIIIZ.getClass();
                Boolean bool2 = (Boolean) FFL.LJIJ(true, str, i, C53368Kx2.class, bool);
                if (bool2 != null) {
                    bool = bool2;
                }
                return bool.booleanValue() ? 1 : 0;
            } catch (Exception e2) {
                StringBuilder LJFF2 = C72972SkS.LJFF(str, ' ');
                LJFF2.append(e2.getMessage());
                C221018lt.LIZIZ("InboxEntranceABKeyListSettings", X1D.LIZIZ(LJFF2));
                return i;
            }
        }
    }

    public final synchronized String LIZIZ(InterfaceC88472Yns<? super String, Integer> interfaceC88472Yns) {
        String str;
        LJLJLJ = interfaceC88472Yns;
        List<java.util.Map<String, String>> list = LJLILLLLZI;
        if (list != null) {
            String LIZLLL = JsonParseUtils.LIZLLL(list);
            o.LJIIIIZZ(LIZLLL, "toJSONString(abKeyList)");
            return LIZLLL;
        }
        ArrayList arrayList = new ArrayList();
        if (C34169Db3.LIZ()) {
            LJLJJI.add("tt_now_enabled");
        }
        for (String str2 : LJLJJI) {
            arrayList.add(LIZ(str2, String.valueOf(LIZJ(str2))));
        }
        for (String str3 : (String[]) LJLJJLL.getValue()) {
            if (!LJLJJI.contains(str3)) {
                FHD.LIZLLL().getClass();
                Object LJIIJ = FHD.LJIIJ(str3, true);
                if (LJIIJ instanceof String) {
                    str = (String) LJIIJ;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList.add(LIZ(str3, str));
            }
        }
        if (C53371Kx5.LIZIZ() && C53363Kwx.LIZJ()) {
            arrayList.add(LIZ("system_notice_unsubscribe_experiment", "1"));
        }
        LJLJI = ((RBX) HG3.LJIILL()).getCurUserId();
        LJLILLLLZI = arrayList;
        String LIZLLL2 = JsonParseUtils.LIZLLL(arrayList);
        o.LJIIIIZZ(LIZLLL2, "toJSONString(map)");
        return LIZLLL2;
    }

    public static java.util.Map LIZ(String str, String str2) {
        if (o.LJ("inbox_system_notification_message_box", str)) {
            LJLJL = str2;
        }
        return C113554cx.LJJL(new OSZ("key", str), new OSZ("value", str2));
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (user2 != null && !o.LJ(LJLJI, user2.getUid())) {
            C221018lt.LJFF("SystemNotificationExperimentListHelper", "User onChanged: resetAbCache");
            LJLJI = user2.getUid();
            synchronized (LJLIL) {
                LJLILLLLZI = null;
            }
        }
    }
}
