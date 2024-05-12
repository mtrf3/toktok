package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.OdC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62330OdC {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C62329OdB.LJLIL);
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(C62327Od9.LJLIL);
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(C62328OdA.LJLIL);
        C62822Ol8 LIZIZ5 = C221108m2.LIZIZ(C62331OdD.LJLIL);
        List<String> LJJIJIL = C47261Igj.LJJIJIL("whatsapp_status", "instagram", "instagram_story", "snapchat");
        Collection<? extends String> collection = (Collection) LIZIZ4.getValue();
        if (collection != null) {
            LJJIJIL.addAll(collection);
        }
        LIZ = LJJIJIL;
        List<String> LJJIJIL2 = C47261Igj.LJJIJIL("copy");
        Collection<? extends String> collection2 = (Collection) LIZIZ3.getValue();
        if (collection2 != null) {
            LJJIJIL2.addAll(collection2);
        }
        LIZIZ = LJJIJIL2;
        List<String> LJJIJIL3 = C47261Igj.LJJIJIL("whatsapp_status", "messenger", "copy", "instagram", "instagram_story", "instagram_dm", "facebook", "snapchat_chats", "line", "kakaotalk", "messenger_lite", "facebook_lite", "facebook_group", "kakao_story", "reddit", "more");
        Collection<? extends String> collection3 = (Collection) LIZIZ5.getValue();
        if (collection3 != null) {
            LJJIJIL3.addAll(collection3);
        }
        LIZJ = LJJIJIL3;
        List<String> LJJIJIL4 = C47261Igj.LJJIJIL("more", "snapchat", "instagram", "instagram_story", "whatsapp_status", "kakao_story", "facebook", "messenger", "messenger_lite", "sms", "twitter", "viber", "vk", "whatsapp", "line", "band", "email", "kakaotalk", "zalo", "telegram", "discord", "tiktok");
        Collection<? extends String> collection4 = (Collection) LIZIZ2.getValue();
        if (collection4 != null) {
            LJJIJIL4.addAll(collection4);
        }
        LIZLLL = LJJIJIL4;
    }
}
