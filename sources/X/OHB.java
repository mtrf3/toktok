package X;

import Y.ACListenerS30S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHB implements OHA {
    public TuxIconView LIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZIZ;

    @Override // X.OHA
    public final void LIZ(C252709vu c252709vu) {
        if (C55096Ljo.LJIIIZ(this.LIZIZ) == null) {
            return;
        }
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZIZ = "collect_music";
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_bookmark;
        c234529Ii.LIZLLL = true;
        c252709vu.LIZIZ(c234529Ii);
    }

    @Override // X.OHA
    public final void LIZIZ(C252709vu c252709vu) {
        TuxIconView tuxIconView;
        FavoriteAbility favoriteAbility;
        Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LIZIZ);
        if (LJIIIZ == null) {
            return;
        }
        View LJI = c252709vu.LJI("collect_music");
        if (LJI instanceof TuxIconView) {
            tuxIconView = (TuxIconView) LJI;
        } else {
            tuxIconView = null;
        }
        this.LIZ = tuxIconView;
        if (tuxIconView != null && (favoriteAbility = (FavoriteAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), FavoriteAbility.class, null)) != null) {
            favoriteAbility.ld(new AqS176S0100000_10(this, 53));
            C16880lQ.LJJJ(tuxIconView, new ACListenerS30S0100000_10(favoriteAbility, 51));
        }
    }

    @Override // X.OHA
    public final void LIZJ(int i) {
        int i2;
        TuxIconView tuxIconView = this.LIZ;
        if (tuxIconView != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZIZ;
            int LIZIZ = C7MY.LIZIZ(100);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(160));
            musicDetailNavBarAssem.getClass();
            tuxIconView.setAlpha(MusicDetailNavBarAssem.M3(LIZIZ, LJJIIZ, i));
        }
        TuxIconView tuxIconView2 = this.LIZ;
        if (tuxIconView2 == null) {
            return;
        }
        if (o.LIZJ(Float.valueOf(tuxIconView2.getAlpha()), 0.0f)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        tuxIconView2.setVisibility(i2);
    }

    public OHB(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(musicDetail, "musicDetail");
        this.LIZIZ = musicDetailNavBarAssem;
    }
}
