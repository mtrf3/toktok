package X;

import android.content.Context;
import com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import p83.a;

/* renamed from: X.Ghj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42227Ghj<V> implements Callable {
    public static final CallableC42227Ghj<V> LJLIL = new CallableC42227Ghj<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C39252Faq c39252Faq = C39253Far.LIZJ;
        Context LIZIZ = EF7.LIZIZ();
        c39252Faq.getClass();
        a.C0043a LIZIZ2 = C39252Faq.LIZIZ(LIZIZ);
        if (LIZIZ2 != null) {
            GoogleCampaignInfoApi.GoogleCampaignApi googleCampaignApi = GoogleCampaignInfoApi.LIZ;
            String str = LIZIZ2.LIZ;
            o.LJIIIIZZ(str, "info.id");
            googleCampaignApi.querySettings(str).LJ(LV1.LIZ, C10K.LJI, null);
        }
        return C76800UCe.LIZ;
    }
}
