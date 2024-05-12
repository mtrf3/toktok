package X;

import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XXf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84991XXf implements InterfaceC85021XYj {
    public final /* synthetic */ MusicClassWidget LIZ;

    public C84991XXf(MusicClassWidget musicClassWidget) {
        this.LIZ = musicClassWidget;
    }

    @Override // X.InterfaceC85021XYj
    public final void LIZ(C84995XXj c84995XXj, View view, MusicModel musicModel) {
        if (view.getId() == R.id.moa) {
            Intent intent = new Intent(this.LIZ.LJLIL, (Class<?>) MusicDetailListActivity.class);
            intent.putExtra("music_type", 4);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LIZ.LJLLI);
            MusicClassWidget musicClassWidget = this.LIZ;
            musicClassWidget.LJIILIIL(intent, musicClassWidget.LJLL);
        }
    }
}
