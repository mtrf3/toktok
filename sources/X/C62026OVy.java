package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;

/* renamed from: X.OVy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62026OVy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MusicPlayViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62026OVy(MusicPlayViewModel musicPlayViewModel) {
        super(0);
        this.LJLIL = musicPlayViewModel;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle bundle = this.LJLIL.LJLIL;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("IS_PANEL", false);
        }
        return Boolean.valueOf(z);
    }
}
