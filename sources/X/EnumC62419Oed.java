package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.Oed, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC62419Oed {
    WHATSAPP(R.raw.icon_color_whatsapp_circle, 5, "WHATSAPP", "whatsapp", "WhatsApp"),
    FACEBOOK(R.raw.icon_color_facebook_circle, 6, "FACEBOOK", "facebook", "Facebook"),
    SMS(R.raw.icon_color_sms_circle, 13, "SMS", "sms", "SMS"),
    MESSENGER(R.raw.icon_color_messenger_circle, 7, "MESSENGER", "messenger", "Messenger"),
    VK(R.raw.icon_color_vk_circle, 9, "VK", "vk", "VK"),
    SNAPCHAT(R.raw.icon_color_snapchat_circle, 8, "SNAPCHAT", "snapchat", "Snapchat"),
    LINE(R.raw.icon_color_line_circle, 11, "LINE", "line", "Line"),
    ZALO(R.raw.icon_color_zalo_circle, 10, "ZALO", "zalo", "Zalo"),
    KAKAOTALK(R.raw.icon_color_kakaotalk_circle, 12, "KAKAOTALK", "kakaotalk", "KakaoTalk"),
    LEMON8(R.raw.icon_color_lemon8_circle, 15, "LEMON8", "lemon8", "Lemon8"),
    TELEGRAM(R.raw.icon_color_telegram_circle, 18, "TELEGRAM", "telegram", "Telegram"),
    VIBER(R.raw.icon_color_viber_circle, 19, "VIBER", "viber", "Viber");

    public static final C62418Oec Companion = new C62418Oec();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public static final List<EnumC62419Oed> supportChannels(Activity activity) {
        Companion.getClass();
        return C62418Oec.LIZ(activity);
    }

    public static EnumC62419Oed valueOf(String str) {
        return (EnumC62419Oed) V0N.LJJJ(EnumC62419Oed.class, str);
    }

    public final int getCheckedIconRes() {
        return this.LJLJJI;
    }

    public final String getKey() {
        return this.LJLIL;
    }

    public final String getLabel() {
        return this.LJLILLLLZI;
    }

    public final int getSaveType() {
        return this.LJLJJL;
    }

    public final int getUncheckedIconRes() {
        return this.LJLJI;
    }

    EnumC62419Oed(int i, int i2, String str, String str2, String str3) {
        this.LJLIL = str2;
        this.LJLILLLLZI = str3;
        this.LJLJI = r2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
