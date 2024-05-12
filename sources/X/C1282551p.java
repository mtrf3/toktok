package X;

import com.ss.android.ugc.aweme.component.music.MusicService;

/* renamed from: X.51p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282551p extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C1282551p LJLIL = new C1282551p();

    public C1282551p() {
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
