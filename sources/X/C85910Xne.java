package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import kotlin.jvm.internal.o;

/* renamed from: X.Xne, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85910Xne extends C8BR<C8BS<PushSettingDynamicUI>, InterfaceC85911Xnf> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        PushSettingDynamicUI pushSettingDynamicUI;
        InterfaceC85911Xnf interfaceC85911Xnf;
        T t = this.LJLIL;
        if (t != 0 && (pushSettingDynamicUI = (PushSettingDynamicUI) t.getData()) != null && (interfaceC85911Xnf = (InterfaceC85911Xnf) this.LJLILLLLZI) != null) {
            interfaceC85911Xnf.R20(pushSettingDynamicUI);
        }
    }

    public C85910Xne() {
        LJJ(new C85909Xnd());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        InterfaceC85911Xnf interfaceC85911Xnf = (InterfaceC85911Xnf) this.LJLILLLLZI;
        if (interfaceC85911Xnf != null) {
            interfaceC85911Xnf.SL(e);
        }
    }
}
