package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: X.FLk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38820FLk implements InterfaceC38821FLl {
    public final InterfaceC38821FLl LJLIL;

    public C38820FLk(InterfaceC38821FLl interfaceC38821FLl) {
        this.LJLIL = interfaceC38821FLl;
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy iESSettingsProxy) {
        InterfaceC38821FLl interfaceC38821FLl = this.LJLIL;
        if (interfaceC38821FLl != null) {
            interfaceC38821FLl.change(iESSettingsProxy);
        }
    }
}
