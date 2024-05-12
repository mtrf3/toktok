package X;

import android.view.View;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.WIm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82060WIm implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public C82060WIm(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        boolean z;
        o.LJIIIZ(view, "view");
        C78928UyK.LIZIZ(false, false, false, this.LIZ.LIZJ());
        ((I2H) this.LIZ.LIZ.LJ(I2H.class, null)).a5(true);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_edit");
        obtain.setLabelName("shoot_page");
        obtain.setJsonObject(QCU.LIZIZ(this.LIZ.LIZ));
        FMX.onEvent(obtain);
        MusicService.LJJLIIIJJI().LJJIFFI();
        String str = this.LIZ.LJIILIIL().shootWay;
        String LJI = this.LIZ.LJIILIIL().LJI();
        String contentSource = this.LIZ.LJIILIIL().LIZLLL().getContentSource();
        String contentType = this.LIZ.LJIILIIL().LIZLLL().getContentType();
        String musicId = this.LIZ.LJIILIIL().getMusicId();
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.LJIILIIL().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            z = extractAVMusic.isLocalMusic();
        } else {
            z = false;
        }
        XVC.LJFF(new XVD("video_shoot_page", str, LJI, contentSource, contentType, musicId, "shoot_normal", z, null, null, null, null, null, null, null, null, null, 130816));
    }
}
