package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.6wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176586wQ<T> extends C8BS<T> {
    public final C176566wO LJLIL = new C176566wO();
    public final C176616wT LJLILLLLZI = new C176616wT();

    public abstract void LJIIIZ(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(T t) {
        C176566wO c176566wO = this.LJLIL;
        c176566wO.LIZ.put("Duration", String.valueOf(System.currentTimeMillis() - c176566wO.LIZIZ));
        this.LJLILLLLZI.LIZ();
        super.handleData(t);
        if (t instanceof BaseResponse) {
            BaseResponse baseResponse = (BaseResponse) t;
            this.LJLIL.LIZ(baseResponse);
            this.LJLILLLLZI.LIZLLL(baseResponse);
        }
        LJIIIZ(t);
    }

    @Override // X.C8BS
    public boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        C176566wO c176566wO = this.LJLIL;
        c176566wO.LIZ.clear();
        long currentTimeMillis = System.currentTimeMillis();
        c176566wO.LIZIZ = currentTimeMillis;
        c176566wO.LIZ.put("TimeStamp", String.valueOf(currentTimeMillis));
        this.LJLILLLLZI.LJ();
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        return true;
    }
}
