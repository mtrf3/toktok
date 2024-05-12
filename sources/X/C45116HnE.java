package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import defpackage.b1;
import defpackage.i0;
import java.io.File;
import java.util.List;

/* renamed from: X.HnE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45116HnE extends C8BR<MusicListModel, InterfaceC45118HnG> {
    public C45117HnF LJLJJI;
    public int LJLJJL;

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        String LJFF;
        if (this.LJLIL.getData() == null) {
            onFailed(new Exception());
            return;
        }
        List<Music> list = ((MusicList) this.LJLIL.getData()).musicList;
        if (C79004UzY.LJJIFFI(list)) {
            onFailed(new IllegalArgumentException("empty music list."));
            return;
        }
        Music music = (Music) ListProtector.get(list, 0);
        if (music.getPlayUrl() != null && !C79004UzY.LJJIFFI(music.getPlayUrl().getUrlList())) {
            String str = (String) ListProtector.get(music.getPlayUrl().getUrlList(), 0);
            String LIZ = XPS.LIZLLL().LIZ();
            if (!C39579Fg7.LIZIZ(LIZ)) {
                C1I0.LIZJ(LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            String LIZIZ = b1.LIZIZ(str, LIZ2, ".mp3", LIZ2);
            if (LIZ.endsWith("/")) {
                LJFF = i0.LJFF(LIZ, LIZIZ);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZ);
                LJFF = JBR.LJFF(LIZ3, File.separator, LIZIZ, LIZ3);
            }
            if (C39579Fg7.LIZIZ(LJFF)) {
                K k = this.LJLILLLLZI;
                if (k != 0) {
                    ((InterfaceC45118HnG) k).onGetMusicSuccess((MusicList) this.LJLIL.getData(), LJFF);
                    return;
                }
                return;
            }
            this.LJLJJI = new C45117HnF(this, LJFF);
            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.LJ = LIZ;
            with.LIZJ = LIZIZ;
            with.LJII = 3;
            with.LJJI = true;
            with.LJIIJ = "music_choices_presenter";
            with.LJIIJJI = this.LJLJJI;
            this.LJLJJL = with.LIZJ();
            return;
        }
        onFailed(new IllegalArgumentException("music exists but no valid play url."));
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        Downloader.getInstance(EF7.LIZIZ()).removeMainThreadListener(this.LJLJJL, this.LJLJJI);
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC45118HnG) k).onGetMusicFailed(exc, "");
        }
    }
}
