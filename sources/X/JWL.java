package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWL {
    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("open async create ");
        LIZ.append(JWC.LIZ.enableAsyncCreate);
        C15280iq.LIZIZ("SearchAsyncRender", X1D.LIZIZ(LIZ));
    }

    public static final JWP LIZIZ(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> interfaceC88474Ynu) {
        AsyncLoadConfig asyncLoadConfig = JWC.LIZ;
        if (!asyncLoadConfig.enableAsyncCreate) {
            return null;
        }
        C15280iq.LIZIZ("SearchAsyncRender", "open async create");
        return new JWP(asyncLoadConfig.createWhitelist, interfaceC88474Ynu, new C87776Yce("create"));
    }

    public static final <T> JYI<T> LIZ(RecyclerView recyclerView, InterfaceC49350JYk<T> dataProvider, InterfaceC88471Ynr<? super Integer, ? super Integer, Boolean> interfaceC88471Ynr) {
        o.LJIIIZ(dataProvider, "dataProvider");
        AsyncLoadConfig asyncLoadConfig = JWC.LIZ;
        if (!asyncLoadConfig.enableAsyncBind) {
            return null;
        }
        C15280iq.LIZIZ("SearchAsyncRender", "open async bind");
        return new JYI<>(recyclerView, dataProvider, asyncLoadConfig.bindWhitelist, interfaceC88471Ynr, C49263JVb.LJLIL, new C87776Yce("bind"));
    }

    public static final JYU LIZJ(RecyclerView recyclerView, JWN asyncLoad, JWP jwp, JYI jyi) {
        o.LJIIIZ(asyncLoad, "asyncLoad");
        return new JYU(recyclerView, new JWM(new AqS190S0100000_8(asyncLoad, (JWN<Object>) 3), new AqS190S0100000_8(asyncLoad, (JWN<Object>) 4), jwp, jyi));
    }
}
