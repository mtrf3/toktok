package com.ss.android.ugc.gamora.editor.audio.copyrightdetect;

import X.C146535p3;
import X.C188727au;
import X.C6ES;
import X.C78983UzD;
import X.FMX;
import X.H7R;
import com.ss.android.ugc.aweme.music.IEditMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditMusicServiceImpl implements IEditMusicService {
    @Override // com.ss.android.ugc.aweme.music.IEditMusicService
    public final void LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        String creationId = model.getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = model.mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String contentType = H7R.LJIIIZ(model);
        String contentSource = H7R.LJIIIIZZ(model);
        int LIZ = C146535p3.LIZ(model);
        int videoLength = model.getVideoLength();
        boolean LJJJJJL = C78983UzD.LJJJJJL(model);
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(videoLength, "creation_duration");
        C6ES.LIZ(LIZ, LJJJJJL ? 1 : 0, c188727au);
        FMX.LJIIL("sound_copyright_restore_music_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.IEditMusicService
    public final void LIZIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        String creationId = model.getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = model.mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String contentType = H7R.LJIIIZ(model);
        String contentSource = H7R.LJIIIIZZ(model);
        int LIZ = C146535p3.LIZ(model);
        int videoLength = model.getVideoLength();
        boolean LJJJJJL = C78983UzD.LJJJJJL(model);
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(videoLength, "creation_duration");
        C6ES.LIZ(LIZ, LJJJJJL ? 1 : 0, c188727au);
        FMX.LJIIL("sound_copyright_restore_music_confirm_click", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.IEditMusicService
    public final void LIZJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        String creationId = model.getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = model.mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String contentType = H7R.LJIIIZ(model);
        String contentSource = H7R.LJIIIIZZ(model);
        int LIZ = C146535p3.LIZ(model);
        int videoLength = model.getVideoLength();
        boolean LJJJJJL = C78983UzD.LJJJJJL(model);
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(videoLength, "creation_duration");
        C6ES.LIZ(LIZ, LJJJJJL ? 1 : 0, c188727au);
        FMX.LJIIL("sound_copyright_restore_music_show", c188727au.LIZ);
    }
}
