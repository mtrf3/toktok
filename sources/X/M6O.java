package X;

import java.util.HashMap;

/* loaded from: classes10.dex */
public class M6O extends HashMap {
    public M6O() {
        put("(?:share/)?@.*/video/(\\w+)/?", 0);
        put("(?:share/)?@.*/live/(\\w+)/?", 1);
        put("(?:share/)?@([\\w\\.]+)/?($|\\?.*)", 2);
        put("(?:share/)?tag/([^/?]+)", 3);
        put("(?:share/)?music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 4);
        put("@.*/playlist/[^/?]*-(\\d+)(?=(?:[?/]|$))", 27);
        put("(?:share/)?playlist-music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 25);
        put("(?:share/)?stickers?/(?:detail/)?(?:.*-)?(\\w+)/?", 5);
        put("(?:share/)?discover/([^/?]+)", 24);
        put("revenue/subscription/invitation", 28);
        put("live/subscription", 36);
        put("(?:@([\\w\\.]+)/)?now/", 29);
        put("live/monetization/square/", 32);
        put("messages/chat", 31);
        put("@.+/collection/(.+-\\d+)?", 33);
        put("place/[^/?]*-(\\d+)(?=(?:[?/]|$))", 34);
    }
}
