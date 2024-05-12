package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.PlayMusicBridge;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import org.json.JSONObject;

/* renamed from: X.Jen, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49689Jen implements Observer<OSZ<? extends Integer, ? extends Long>> {
    public final Music LJLIL;
    public final JSONObject LJLILLLLZI;
    public final /* synthetic */ PlayMusicBridge LJLJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OSZ<? extends Integer, ? extends Long> osz) {
        InterfaceC40516FvE interfaceC40516FvE;
        F2Y f2y;
        InterfaceC40516FvE interfaceC40516FvE2;
        OSZ<? extends Integer, ? extends Long> osz2 = osz;
        if (osz2 != null) {
            if (osz2.getSecond().longValue() == this.LJLIL.getId()) {
                if (osz2.getFirst().intValue() == 2 && (f2y = (F2Y) this.LJLJI.LJLILLLLZI.getValue()) != null && (interfaceC40516FvE2 = (InterfaceC40516FvE) f2y.LIZIZ()) != null) {
                    interfaceC40516FvE2.onEvent(new C49690Jeo(this));
                    return;
                }
                return;
            }
            F2Y f2y2 = (F2Y) this.LJLJI.LJLILLLLZI.getValue();
            if (f2y2 != null && (interfaceC40516FvE = (InterfaceC40516FvE) f2y2.LIZIZ()) != null) {
                interfaceC40516FvE.onEvent(new C49691Jep(this));
            }
            MusicPlayHelper musicPlayHelper = (MusicPlayHelper) this.LJLJI.LJLJI.getValue();
            if (musicPlayHelper == null) {
                return;
            }
            musicPlayHelper.LJLIL.removeObserver(this);
        }
    }

    public C49689Jen(PlayMusicBridge playMusicBridge, Music music, JSONObject jSONObject) {
        this.LJLJI = playMusicBridge;
        this.LJLIL = music;
        this.LJLILLLLZI = jSONObject;
    }
}
