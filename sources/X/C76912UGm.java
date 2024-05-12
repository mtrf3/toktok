package X;

import Y.IDcS172S0100000_13;
import Y.IDcS17S0300000_13;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeContactUsUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UGm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76912UGm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, UI8 ui8) {
        boolean z;
        String LJII = C77541Ubx.LJII(ui8);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_ban_popup_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(Boolean.valueOf(z), "is_anchor");
        LIZ2.LJIJJ(LJII, "popup_entrance");
        C06490Nh.LIZLLL(LIZ2, "gpppa", "ban_reason", str, "click_type");
    }

    public static void LIZIZ(Context context, boolean z, String prompt, UI8 ui8) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(prompt, "prompt");
        OSZ<String, String> LIZ2 = C15670jT.LIZ(prompt, "<", ">");
        String first = LIZ2.getFirst();
        SpannableStringBuilder LIZJ = C15670jT.LIZJ(context, LIZ2.getSecond(), first, C04330Ez.LIZIZ(context, R.color.a8n), first, new AqS160S0200000_13(context, ui8, 32), 16);
        android.net.Uri parse = UriProtector.parse(new C32364Cn2(LiveRechargeContactUsUrlSetting.INSTANCE.getValue()).LIZLLL());
        C47071t1 c47071t1 = new C47071t1(context);
        if (z) {
            i = R.string.otc;
        } else {
            i = R.string.l4v;
        }
        c47071t1.LIZJ = context.getString(i);
        c47071t1.LJII(LIZJ);
        c47071t1.LJIIL(R.string.spm, new IDcS17S0300000_13(context, parse, ui8, 7));
        c47071t1.LJIIIZ(R.string.kg7, new IDcS172S0100000_13(ui8, 24));
        boolean z2 = false;
        c47071t1.LJIILL = false;
        LiveDialog LIZ3 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ3, new Object[0], "void", new C65300Pk0(false, "()V", "-1271141289527441737")).LIZ) {
            LIZ3.show();
        }
        String LJII = C77541Ubx.LJII(ui8);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            z2 = true;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_recharge_ban_popup_show");
        LIZ4.LJIIZILJ();
        LIZ4.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ4.LJIJJ(Boolean.valueOf(z2), "is_anchor");
        C06490Nh.LIZLLL(LIZ4, LJII, "popup_entrance", "gpppa", "ban_reason");
    }
}
