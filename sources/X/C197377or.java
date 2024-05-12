package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.m0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* renamed from: X.7or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197377or {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static Aweme LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static WeakReference<ActivityC45651qj> LJI;
    public static final CopyOnWriteArrayList<WeakReference<InterfaceC197607pE>> LJII = new CopyOnWriteArrayList<>();
    public static EnumC197497p3 LJIIIIZZ = EnumC197497p3.END;

    public static boolean LIZIZ() {
        if (!o.LJ(LIZ, "homepage_hot") || !LJ) {
            return false;
        }
        String str = LIZJ;
        if (str != null && s.LJJJLZIJ(str, "head", false)) {
            return false;
        }
        return true;
    }

    public static void LJ() {
        HashSet hashSet = new HashSet();
        Iterator<WeakReference<InterfaceC197607pE>> it = LJII.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC197607pE> next = it.next();
            if (next.get() == null) {
                hashSet.add(next);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            LJII.remove(it2.next());
        }
    }

    public static void LIZ(InterfaceC197607pE listener) {
        o.LJIIIZ(listener, "listener");
        Iterator<WeakReference<InterfaceC197607pE>> it = LJII.iterator();
        while (it.hasNext()) {
            InterfaceC197607pE interfaceC197607pE = it.next().get();
            if (interfaceC197607pE != null && interfaceC197607pE.hashCode() == listener.hashCode()) {
                return;
            }
        }
        LJII.add(new WeakReference<>(listener));
        LJ();
    }

    public static void LIZLLL(InterfaceC88472Yns closure) {
        o.LJIIIZ(closure, "closure");
        Iterator<WeakReference<InterfaceC197607pE>> it = LJII.iterator();
        while (it.hasNext()) {
            InterfaceC197607pE interfaceC197607pE = it.next().get();
            if (interfaceC197607pE != null) {
                closure.invoke(interfaceC197607pE);
            }
        }
    }

    public static void LJFF(EnumC197497p3 enumC197497p3) {
        o.LJIIIZ(enumC197497p3, "<set-?>");
        LJIIIIZZ = enumC197497p3;
    }

    public static void LIZJ(Context context, String str, String str2, Aweme aweme, boolean z, boolean z2, String str3, Boolean bool, Boolean bool2, String str4, String str5, String str6, int i, String str7, String str8, String str9, int i2) {
        Context context2;
        boolean z3;
        String str10;
        String str11;
        String str12;
        String requestId;
        NowPostInfo nowPostInfo;
        boolean z4 = z;
        Aweme aweme2 = aweme;
        String str13 = str8;
        String str14 = str7;
        int i3 = i;
        String str15 = str9;
        String shootPosition = str6;
        String str16 = str3;
        boolean z5 = z2;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str17 = str4;
        String aid = str5;
        if ((i2 & 8) != 0) {
            aweme2 = null;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            z5 = false;
        }
        if ((i2 & 64) != 0) {
            str16 = null;
        }
        if ((i2 & 128) != 0) {
            bool3 = Boolean.FALSE;
        }
        if ((i2 & 256) != 0) {
            bool4 = Boolean.FALSE;
        }
        if ((i2 & 512) != 0) {
            str17 = null;
        }
        String str18 = "";
        if ((i2 & 1024) != 0) {
            aid = "";
        }
        if ((i2 & 2048) != 0) {
            shootPosition = "post_to_view";
        }
        if ((i2 & 4096) != 0) {
            i3 = 0;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str14 = null;
        }
        if ((i2 & 16384) != 0) {
            str13 = null;
        }
        if ((i2 & 32768) != 0) {
            str15 = null;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(shootPosition, "shootPosition");
        if (a.LJ().LJ(1)) {
            C197517p5.LIZ();
            return;
        }
        Boolean bool5 = Boolean.TRUE;
        if (!o.LJ(bool4, bool5) && !MWW.LIZ()) {
            C197457oz.LIZ(Z89.LIZIZ, context, C0H1.LIZ("REDIRECT_TAG", "never"), false, 12);
            return;
        }
        LIZ = str2;
        LIZIZ = str;
        LIZJ = str17;
        LJFF = str16;
        if (context instanceof ActivityC45651qj) {
            context2 = context;
        } else {
            context2 = null;
        }
        LJI = new WeakReference<>(context2);
        if (o.LJ(bool3, bool5) && o.LJ(shootPosition, "post_to_view")) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJ = z3;
        LIZLLL = aweme2;
        SmartRoute LIZ2 = m0.LIZ(context, "//studio/tiktoknow", "enter_method", str, "enter_from", str2);
        LIZ2.withParam("is_blue_v_user", z4);
        LIZ2.withParam("now_card_type", C7MK.LIZIZ(aweme2));
        if (o.LJ(bool3, bool5)) {
            if (aweme2 == null || (nowPostInfo = aweme2.nowPostInfo) == null || (str10 = nowPostInfo.getNowMediaType()) == null) {
                str10 = "post";
            }
        } else {
            str10 = null;
        }
        LIZ2.withParam("now_type", str10);
        if (aweme2 != null) {
            str11 = aweme2.getAid();
        } else {
            str11 = null;
        }
        LIZ2.withParam("from_aweme_id", str11);
        LIZ2.withParam("should_back_to_cur_page_after_publish", z5);
        LIZ2.withParam("toast_when_start_publish", str16);
        LIZ2.withParam("enter_position", str17);
        LIZ2.withParam("now_post_by", aid);
        LIZ2.withParam("now_blur_shoot_position", shootPosition);
        if (aweme2 == null || (str12 = aweme2.getAuthorUid()) == null) {
            str12 = "";
        }
        LIZ2.withParam("author_id", str12);
        if (aweme2 != null && (requestId = aweme2.getRequestId()) != null) {
            str18 = requestId;
        }
        LIZ2.withParam("request_id", str18);
        LIZ2.withParam("extra_start_nows_record_time", System.currentTimeMillis());
        LIZ2.withParam("is_new_page", i3);
        LIZ2.withParam("previous_page", str14);
        C05040Hs.LJ(LIZ2, "now_tab_enter_method", str13, "shoot_enter_scene", str15);
    }
}
