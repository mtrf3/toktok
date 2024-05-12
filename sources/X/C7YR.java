package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;

/* renamed from: X.7YR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MusicDescAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YR(MusicDescAssem musicDescAssem) {
        super(0);
        this.LJLIL = musicDescAssem;
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
