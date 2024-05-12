package com.ss.android.ugc.aweme.commerce.tools.music.promote;

import X.C145995oB;
import X.C42622Go6;
import X.C58096Mr6;
import X.FMX;
import com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService;

/* loaded from: classes8.dex */
public final class PromoteRepalceMusicServiceImpl implements IPromoteReplaceMusicService {
    public static IPromoteReplaceMusicService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPromoteReplaceMusicService.class, false);
        if (LIZ != null) {
            return (IPromoteReplaceMusicService) LIZ;
        }
        if (C58096Mr6.LLLIIII == null) {
            synchronized (IPromoteReplaceMusicService.class) {
                if (C58096Mr6.LLLIIII == null) {
                    C58096Mr6.LLLIIII = new PromoteRepalceMusicServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLIIII;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.promote.IPromoteReplaceMusicService
    public final void LIZIZ(String str) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("rec_clip_id", str);
        c145995oB.LJI("enter_from", "promote");
        c145995oB.LJI("meta_song_id", C42622Go6.LJIIJJI);
        FMX.LJIIL("music_pannel_rec_show", c145995oB.LIZ);
    }
}
