package X;

import android.content.Context;
import android.os.BaseBundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFrameCheckService;
import java.io.IOException;

/* renamed from: X.GaU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C41778GaU implements InterfaceC67660Qgy, GBJ, InterfaceC43755HFf {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C41778GaU(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.GBJ
    public final void LIZIZ(String str) {
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) this.LJLIL;
        for (int i = 0; i < musCountryListActivity.LJLJI.size(); i++) {
            if (TextUtils.equals(((C86804Y4y) ListProtector.get(musCountryListActivity.LJLJI, i)).LJLILLLLZI, str)) {
                ((LinearLayoutManager) musCountryListActivity.LJLIL.getLayoutManager()).LJFF(i, 0);
                return;
            }
        }
    }

    @Override // X.InterfaceC67660Qgy
    public final Object LIZJ(AbstractC67638Qgc abstractC67638Qgc) {
        this.LJLIL.getClass();
        BaseBundle baseBundle = (BaseBundle) abstractC67638Qgc.LJIIJ(IOException.class);
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if (!"RST".equals(string2)) {
                if (string2 != null) {
                    throw new IOException(string2);
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // X.InterfaceC43755HFf
    public final void LIZ(int i, String str, boolean z) {
        Context context = (Context) this.LJLIL;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).LIZ(context, str);
    }
}
