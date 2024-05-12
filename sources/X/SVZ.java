package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;

/* loaded from: classes13.dex */
public final class SVZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MusicFavoriteButtonAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SVZ(MusicFavoriteButtonAssem musicFavoriteButtonAssem) {
        super(0);
        this.LJLIL = musicFavoriteButtonAssem;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments;
        Fragment LJIIIZ = C55096Ljo.LJIIIZ(this.LJLIL);
        boolean z = false;
        if (LJIIIZ != null && (arguments = LJIIIZ.getArguments()) != null) {
            z = arguments.getBoolean("IS_PANEL", false);
        }
        return Boolean.valueOf(z);
    }
}
