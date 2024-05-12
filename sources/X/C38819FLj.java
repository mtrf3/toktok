package X;

import Y.ARunnableS14S0201000_11;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: X.FLj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38819FLj implements InterfaceC38821FLl {
    public final InterfaceC38821FLl LJLIL;

    public C38819FLj(InterfaceC38821FLl interfaceC38821FLl) {
        this.LJLIL = interfaceC38821FLl;
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy iESSettingsProxy) {
        if (this.LJLIL == null) {
            return;
        }
        C38995FSd.LJFF().execute(new ARunnableS14S0201000_11(1, this, iESSettingsProxy, 7));
    }
}
