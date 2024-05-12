package X;

import Y.ARunnableS37S0100000_1;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.m0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS2S1310000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89253er implements InterfaceC57106Mb8 {
    public static final C89253er LIZ = new C89253er();

    @Override // X.InterfaceC57106Mb8
    public final String LIZIZ(String userId) {
        o.LJIIIZ(userId, "userId");
        int LIZJ = i0.LIZJ("follow_action_tag", userId, C89263es.LIZ(), 0);
        if (LIZJ != 1) {
            if (LIZJ != 2) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "2";
        }
        return "1";
    }

    @Override // X.InterfaceC57106Mb8
    public final void LJI(FollowStatus followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        Keva LIZ2 = C89263es.LIZ();
        long currentTimeMillis = System.currentTimeMillis();
        int i = followStatus.followStatus;
        if (i == 1 || i == 4) {
            String str = followStatus.userId;
            o.LJIIIIZZ(str, "status.userId");
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_single_follow_status");
            LIZ3.append(str);
            if (!LIZ2.contains(X1D.LIZIZ(LIZ3))) {
                C65429Pm5.LJ("key_single_follow_status", str, LIZ2, true);
            }
            String str2 = followStatus.userId;
            o.LJIIIIZZ(str2, "status.userId");
            C89263es.LJI(str2, false, followStatus.followerStatus, LIZ2);
        } else if (i == 2) {
            String str3 = followStatus.userId;
            o.LJIIIIZZ(str3, "status.userId");
            C89263es.LJII(currentTimeMillis, LIZ2, str3);
            String str4 = followStatus.userId;
            o.LJIIIIZZ(str4, "status.userId");
            C89263es.LJI(str4, true, followStatus.followerStatus, LIZ2);
        }
        C3FW LIZ4 = C785836o.LIZ();
        String str5 = followStatus.userId;
        o.LJIIIIZZ(str5, "status.userId");
        int i2 = followStatus.followStatus;
        LIZ4.getClass();
        if (!C3UE.LIZ()) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C3FT(str5, i2, null), 2);
    }

    @Override // X.InterfaceC57106Mb8
    public final boolean LJII(String uid) {
        o.LJIIIZ(uid, "uid");
        Keva LIZ2 = C89263es.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("key_double_follow_time_stamp");
        LIZ3.append(uid);
        if (LIZ2.contains(X1D.LIZIZ(LIZ3))) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("key_follow_requested_status");
            LIZ4.append(uid);
            LIZ2.erase(X1D.LIZIZ(LIZ4));
            return false;
        }
        return m0.LIZLLL("key_follow_requested_status", uid, LIZ2, false);
    }

    @Override // X.InterfaceC57106Mb8
    public final void LJIIJ(String str) {
        C89263es.LJFF(C89263es.LIZ(), str);
    }

    @Override // X.InterfaceC57106Mb8
    public final void LIZLLL(String toUserId, java.util.Map<String, String> map) {
        o.LJIIIZ(toUserId, "toUserId");
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LJIIIIZZ(toUserId);
        c4mw.LIZLLL(TextContent.Companion.obtain$default(TextContent.Companion, "👋👋👋", null, null, 6, null));
        c4mw.LIZ.LJII = map;
        c4mw.LJI();
    }

    @Override // X.InterfaceC57106Mb8
    public final void LJFF(String str, boolean z) {
        if (str != null) {
            Keva LIZ2 = C89263es.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_fake_double_follow_time_stamp");
            LIZ3.append(str);
            if (LIZ2.contains(X1D.LIZIZ(LIZ3))) {
                if (z) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("key_fake_double_follow_time_stamp");
                    LIZ4.append(str);
                    LIZ2.erase(X1D.LIZIZ(LIZ4));
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            LIZ2.storeLong(i0.LJFF("key_fake_double_follow_time_stamp", str), System.currentTimeMillis());
            C89263es.LJI(str, true, 1, LIZ2);
        }
    }

    @Override // X.InterfaceC57106Mb8
    public final boolean LIZJ(Keva keva, String str, boolean z) {
        if (str != null) {
            if (keva == null) {
                keva = C89263es.LIZ();
            }
            if (!C89263es.LIZLLL(keva, str, z) && !C89263es.LIZJ(keva, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC57106Mb8
    public final void LJ(int i, String uid, boolean z) {
        o.LJIIIZ(uid, "uid");
        Keva LIZ2 = C89263es.LIZ();
        if (z) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_double_follow_time_stamp");
            LIZ3.append(uid);
            if (LIZ2.contains(X1D.LIZIZ(LIZ3))) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("key_follow_requested_status");
                LIZ4.append(uid);
                LIZ2.erase(X1D.LIZIZ(LIZ4));
                return;
            }
            C89263es.LJII(System.currentTimeMillis(), LIZ2, uid);
            return;
        }
        C65429Pm5.LJ("key_follow_requested_status", uid, LIZ2, true);
        C89263es.LJI(uid, false, i, LIZ2);
    }

    @Override // X.InterfaceC57106Mb8
    public final String LJIIIIZZ(Context context, int i, boolean z, String str) {
        o.LJIIIZ(context, "context");
        Keva LIZ2 = C89263es.LIZ();
        String LIZ3 = C29822Bn8.LIZ(context, R.string.i3_, "resources.getString(R.string.message_button)");
        if (str == null || !LIZ.LIZJ(LIZ2, str, z)) {
            return C29822Bn8.LIZ(context, R.string.i3_, "resources.getString(R.string.message_button)");
        }
        if (!C3U6.LIZ) {
            return LIZ3;
        }
        boolean z2 = true;
        String string = context.getResources().getString(((Number) ((OSZ) IMSayhiAnalyticsImpl.LIZLLL.getValue()).getFirst()).intValue(), "👋");
        o.LJIIIIZZ(string, "this.resources.getString…IMConstants.SAY_HI_EMOJI)");
        java.util.Map<OSZ<String, Integer>, Boolean> map = C93793mB.LIZ;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(new OSZ(string, Integer.valueOf(i)));
        if (bool == null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.LJJJ(10.0f);
            tuxTextView.setText(string);
            tuxTextView.measure(0, 0);
            if (tuxTextView.getMeasuredWidth() > i) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            map.put(new OSZ<>(string, Integer.valueOf(i)), bool);
        }
        if (!bool.booleanValue()) {
            return "👋";
        }
        return string;
    }

    @Override // X.InterfaceC57106Mb8
    public final void LIZ(Context context, String toUserId, String str, boolean z, java.util.Map<String, String> map, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(toUserId, "toUserId");
        LJIIJJI(context, toUserId, str, map, null, interfaceC65784Pro, z, z2, true);
    }

    @Override // X.InterfaceC57106Mb8
    public final void LJIIIZ(Context context, String toUserId, String str, boolean z, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        o.LJIIIZ(toUserId, "toUserId");
        LJIIJJI(context, toUserId, str, map, interfaceC65784Pro, interfaceC65784Pro2, z, false, false);
    }

    public static void LJIIJJI(Context context, String str, String str2, java.util.Map map, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z, boolean z2, boolean z3) {
        C101543yg c101543yg = C101543yg.LIZ;
        String str3 = (String) ((LinkedHashMap) map).get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        C89273et c89273et = new C89273et(context, str, str2, map, interfaceC65784Pro, interfaceC65784Pro2, z3, z2, z);
        c101543yg.getClass();
        if (context != null && C89363f2.LIZ()) {
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(c89273et, 476);
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                AqS2S1310000_1 aqS2S1310000_1 = new AqS2S1310000_1(aqS167S0100000_1, LJJIFFI, z, str3, context, 0);
                if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                    aqS2S1310000_1.invoke();
                } else {
                    C1DH.LJJIJIIJI(new ARunnableS37S0100000_1(aqS2S1310000_1, (InterfaceC65784Pro<C76800UCe>) 152));
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        c89273et.invoke(Boolean.TRUE, null);
    }
}
