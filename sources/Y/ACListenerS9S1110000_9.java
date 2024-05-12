package Y;

import X.ARI;
import X.C26227ARb;
import X.C62395OeF;
import X.EF7;
import X.MHN;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS16S2100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS9S1110000_9 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS9S1110000_9 aCListenerS9S1110000_9, View view) {
        String str;
        Long l;
        if (aCListenerS9S1110000_9.z2) {
            str = "music_tab";
        } else {
            str = "single_song";
        }
        C62395OeF.LIZIZ(((MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1).LJLJJI, aCListenerS9S1110000_9.s0, str, "edit");
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//music/artist/awemelist");
        Music music = ((MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1).LLILZ;
        String str2 = null;
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        buildRoute.withParam("artist_music_id", String.valueOf(l));
        Music music2 = ((MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1).LLILZ;
        if (music2 != null) {
            str2 = music2.getMusicName();
        }
        buildRoute.withParam("artist_music_name", str2);
        buildRoute.withParam("artist_music_featured_aweme_id", aCListenerS9S1110000_9.s0);
        buildRoute.withParam("artist_music_data", ((MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1).LLILZ);
        buildRoute.withParam("enter_method", str);
        buildRoute.open();
    }

    public static final void onClick$1(ACListenerS9S1110000_9 aCListenerS9S1110000_9, View v) {
        String str;
        if (aCListenerS9S1110000_9.z2) {
            str = "music_tab";
        } else {
            str = "single_song";
        }
        C62395OeF.LIZIZ(((MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1).LJLJJI, aCListenerS9S1110000_9.s0, str, "remove");
        MusicDetailAwemeListFragment musicDetailAwemeListFragment = (MusicDetailAwemeListFragment) aCListenerS9S1110000_9.l1;
        o.LJIIIIZZ(v, "v");
        String str2 = aCListenerS9S1110000_9.s0;
        musicDetailAwemeListFragment.getClass();
        ARI ari = new ARI(EF7.LIZIZ());
        ari.LJI(R.string.gcr, new AqS16S2100000_9(musicDetailAwemeListFragment, str2, str, 1));
        ari.LJIIIIZZ(R.string.gcq, MHN.LJLIL);
        Context context = v.getContext();
        o.LJIIIIZZ(context, "view.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(musicDetailAwemeListFragment.getString(R.string.gct));
        c26227ARb.LIZIZ(musicDetailAwemeListFragment.getString(R.string.gcs));
        c26227ARb.LJIIL = ari;
        c26227ARb.LJI().LIZLLL();
    }

    public ACListenerS9S1110000_9(boolean z, MusicDetailAwemeListFragment musicDetailAwemeListFragment, String str, int i) {
        this.$t = i;
        this.z2 = z;
        this.l1 = musicDetailAwemeListFragment;
        this.s0 = str;
    }
}
