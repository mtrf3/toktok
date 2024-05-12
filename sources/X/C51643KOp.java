package X;

import java.util.HashSet;

/* renamed from: X.KOp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51643KOp {
    public static final java.util.Set<String> LIZ;
    public static final java.util.Set<String> LIZIZ;
    public static volatile boolean LIZJ;

    static {
        HashSet hashSet = new HashSet();
        LIZ = hashSet;
        HashSet hashSet2 = new HashSet();
        LIZIZ = hashSet2;
        C012403c.LJFF(hashSet, "video_play", "play_time", "like", "follow");
        C012403c.LJFF(hashSet, "comment", "share_video", "head", "name");
        C012403c.LJFF(hashSet, "slide_left", "challenge_click", "song_cover", "shoot");
        C012403c.LJFF(hashSet2, "video_play", "video_play_finish", "play_time", "like");
        C012403c.LJFF(hashSet2, "follow", "post_comment", "share_video", "enter_personal_detail");
        C012403c.LJFF(hashSet2, "enter_tag_detail", "enter_challenge_detail", "shoot", "enter_music_detail");
        LIZJ = false;
    }
}
