package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;

/* renamed from: X.OUx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61999OUx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ MusicShootAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61999OUx(MusicShootAssem musicShootAssem) {
        super(0);
        this.LJLIL = musicShootAssem;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getFragment().getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("enter_record_from_feed");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
