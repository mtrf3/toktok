package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141315gd {
    public static AVMusic LIZ(SoundEffect soundEffect) {
        boolean z;
        o.LJIIIZ(soundEffect, "soundEffect");
        AVMusic aVMusic = new AVMusic();
        aVMusic.id = soundEffect.id;
        aVMusic.musicName = soundEffect.musicName;
        aVMusic.playUrl = soundEffect.playUrl;
        if (soundEffect.collectStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        aVMusic.setCollected(z);
        aVMusic.setCommerceMusic(soundEffect.isCommerceMusic);
        aVMusic.setDuration(soundEffect.duration * 1000);
        aVMusic.setShootDuration(soundEffect.shootDuration * 1000);
        aVMusic.setAuditionDuration(soundEffect.auditionDuration * 1000);
        aVMusic.setNeedSetCookie(soundEffect.needSetCookie);
        aVMusic.musicType = MusicModel.MusicType.ONLINE.ordinal();
        aVMusic.musicStatus = 1;
        return aVMusic;
    }
}
