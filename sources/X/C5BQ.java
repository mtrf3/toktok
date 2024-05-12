package X;

import com.ss.android.ugc.aweme.component.music.MusicService;

/* renamed from: X.5BQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C5BQ LJLIL = new C5BQ();

    public C5BQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (MusicService.LJJLIIIJJI().LJIIZILJ() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
