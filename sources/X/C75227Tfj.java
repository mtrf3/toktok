package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.Tfj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75227Tfj {
    public static final void LIZ(Context context, InterfaceC75230Tfm interfaceC75230Tfm, boolean z, EnumC75614Tly enumC75614Tly, String str) {
        int i;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("private")) {
            hashMap.put("show_type", "private");
        }
        if (enumC75614Tly != null) {
            hashMap.put("invitee_list", C75545Tkr.LIZIZ(enumC75614Tly));
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("invitee_id", str);
        }
        hashMap.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("is_system_rematching", CardStruct.IStatusCode.DEFAULT);
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        C75017TcL.LIZ(enumC75614Tly, hashMap);
        C75017TcL.LJJIFFI("livesdk_connection_live_watched_show", hashMap);
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJIIIIZZ = R.drawable.ccj;
        c77437UaH.LIZJ = C15380j0.LJIILJJIL(R.string.kkr);
        if (!z && !InterfaceC30442Bx8.N.LIZJ().booleanValue()) {
            i = R.string.mfw;
        } else {
            i = R.string.kks;
        }
        c77437UaH.LIZIZ(i);
        c77437UaH.LIZJ(R.string.me7, new DialogInterfaceOnClickListenerC75228Tfk(enumC75614Tly, str, interfaceC75230Tfm), false);
        c77437UaH.LJ(R.string.me9, new DialogInterfaceOnClickListenerC75229Tfl(enumC75614Tly, str, interfaceC75230Tfm), false);
        c77437UaH.LJJII = false;
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-1584168178765874769")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
