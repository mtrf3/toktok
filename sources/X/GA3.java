package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GA3 extends AbstractC65781Prl implements InterfaceC65784Pro<BizExpiration[]> {
    public static final GA3 LJLIL = new GA3();

    public GA3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final BizExpiration[] invoke() {
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("edit_post_biz_expiration_list", BizExpiration[].class);
            o.LJIIIIZZ(LJII, "{\n            SettingsMa…ng::class.java)\n        }");
            return (BizExpiration[]) LJII;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setting error: ");
            LIZ.append(th);
            C36922EeM.LIZLLL(6, "EditPostAction", X1D.LIZIZ(LIZ));
            return GA2.LIZ;
        }
    }
}
