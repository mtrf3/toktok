package X;

import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class XXS implements G87 {
    public final /* synthetic */ XX7 LJLIL;

    public XXS(XX7 xx7) {
        this.LJLIL = xx7;
    }

    @Override // X.G87
    public final void LIZ(C84987XXb c84987XXb, View view, MusicModel musicModel, int i) {
        if (view.getId() == R.id.moc) {
            Intent intent = new Intent(view.getContext(), (Class<?>) MusicDetailListActivity.class);
            intent.putExtra("music_type", 4);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LJLIL.LJLLJ);
            intent.putExtra("sound_page_scene", this.LJLIL.LJLLL);
            intent.putExtra("max_video_duration", (Serializable) this.LJLIL.LJLJJI.first);
            intent.putExtra("shoot_video_length", (Serializable) this.LJLIL.LJLJJI.second);
            ActivityC45651qj mo49getActivity = this.LJLIL.LJLIL.mo49getActivity();
            if (mo49getActivity != null) {
                C16880lQ.LJI(mo49getActivity, intent, 10086);
            }
        }
    }
}
