package X;

import com.ss.android.ugc.aweme.opt.BackendParamsResp;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EOD<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;

    public EOD(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str = ((BackendParamsResp) obj).data;
        if (str != null) {
            String dataIdentify = this.LJLIL;
            EOJ.LIZ().storeLong("key_last_store_ts", System.currentTimeMillis());
            EOJ.LIZ().storeString("key_backend_params_data", str);
            o.LJIIIZ(dataIdentify, "dataIdentify");
            EOJ.LIZ().storeString("key_data_identify", dataIdentify);
        }
    }
}
