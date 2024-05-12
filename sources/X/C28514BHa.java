package X;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.BHa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28514BHa {
    public static Hashtag LIZ;
    public static GameTag LIZIZ;
    public static Hashtag LIZJ;
    public static GameTag LIZLLL;
    public static Hashtag LJ;
    public static GameTag LJFF;

    public static Hashtag LIZ() {
        Hashtag hashtag;
        Hashtag hashtag2 = LIZJ;
        if (hashtag2 != null) {
            return hashtag2;
        }
        String pbContent = InterfaceC30442Bx8.LLLLZI.LIZJ();
        if (pbContent == null || pbContent.length() == 0) {
            hashtag = null;
        } else {
            o.LJIIIIZZ(pbContent, "pbContent");
            hashtag = (Hashtag) C46104I7o.LJIJJ(Hashtag.class, pbContent);
        }
        LIZJ = hashtag;
        return hashtag;
    }

    public static GameTag LIZIZ() {
        boolean z;
        GameTag gameTag;
        long j;
        GameTag gameTag2 = LIZLLL;
        if (gameTag2 != null) {
            return gameTag2;
        }
        String pbContent = InterfaceC30442Bx8.LLLLLZL.LIZJ();
        if (pbContent == null || pbContent.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        GameTag gameTag3 = null;
        if (!z) {
            o.LJIIIIZZ(pbContent, "pbContent");
            gameTag = (GameTag) C46104I7o.LJIJJ(GameTag.class, pbContent);
        } else {
            gameTag = null;
        }
        LIZLLL = gameTag;
        if (gameTag == null) {
            java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.LLLLLZIL.LIZJ();
            if (LIZJ2 != null && !LIZJ2.isEmpty()) {
                gameTag3 = new GameTag(null, null, null, null, 0, null, null, null, null, 511, null);
                String str = LIZJ2.get("key_id");
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                gameTag3.id = Long.valueOf(j);
                String str2 = LIZJ2.get("key_show_name");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                gameTag3.showName = str2;
                String str4 = LIZJ2.get("key_short_name");
                if (str4 == null) {
                    str4 = "";
                }
                gameTag3.shortName = str4;
                String str5 = LIZJ2.get("key_full_name");
                if (str5 != null) {
                    str3 = str5;
                }
                gameTag3.fullName = str3;
            }
            LIZLLL = gameTag3;
        }
        return LIZLLL;
    }

    public static void LIZJ(Hashtag hashtag) {
        String str;
        LIZ = hashtag;
        C48459J0d<String> c48459J0d = InterfaceC30442Bx8.LLLLZ;
        if (hashtag == null || (str = C46104I7o.LJJJJZI(hashtag)) == null) {
            str = "";
        }
        c48459J0d.LIZ(str);
    }
}
