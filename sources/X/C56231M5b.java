package X;

import Y.ARunnableS6S0210000_6;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLDecoder;
import kotlin.jvm.internal.o;

/* renamed from: X.M5b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56231M5b extends M61 {
    public C56231M5b() {
        super(false);
    }

    @Override // X.M61
    public final void LIZIZ(M5X m5x) {
        String str;
        C56235M5f.LIZJ("EntryNode");
        C40372Fsu c40372Fsu = m5x.LJLJJLL;
        Intent intent = m5x.LJLJI;
        android.net.Uri uri = m5x.LJLILLLLZI;
        C40376Fsy c40376Fsy = new C40376Fsy(m5x.LJLIL, intent);
        Object obj = m5x.LJLJJL.get("is_from_notification");
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        ARunnableS6S0210000_6 aRunnableS6S0210000_6 = new ARunnableS6S0210000_6(m5x.LJLILLLLZI, c40376Fsy, ((Boolean) obj).booleanValue(), 0);
        if (C33710DKw.LIZJ()) {
            FMX.LIZIZ().execute(aRunnableS6S0210000_6);
        } else {
            aRunnableS6S0210000_6.run();
        }
        C77903Uhn c77903Uhn = new C77903Uhn(c40372Fsu);
        Object obj2 = m5x.LJLJJL.get("is_from_notification");
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (!((Boolean) obj2).booleanValue()) {
            c77903Uhn.LIZLLL(m5x.LJLIL, m5x.LJLILLLLZI);
        }
        String str2 = "";
        if (C16880lQ.LLJJIJIIJIL(intent, "user_id") != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "user_id");
            o.LJI(LLJJIJIIJIL);
            c40372Fsu.getClass();
            c40372Fsu.LJ = LLJJIJIIJIL;
        } else {
            String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
            if (queryParameter != null) {
                String queryParameter2 = UriProtector.getQueryParameter(UriProtector.parse(URLDecoder.decode(queryParameter)), "user_id");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                c40372Fsu.getClass();
                c40372Fsu.LJ = queryParameter2;
            }
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "launch_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        c40372Fsu.getClass();
        c40372Fsu.LIZ = LLJJIJIIJIL2;
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "page_source");
        if (LLJJIJIIJIL3 != null) {
            str2 = LLJJIJIIJIL3;
        }
        c40372Fsu.LIZIZ = str2;
        String str3 = "1";
        if (M5K.LJFF(intent)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c40372Fsu.LJIIIZ = str;
        if (!M5K.LIZLLL(intent)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c40372Fsu.LJIIJ = str3;
        C56235M5f.LJFF("EntryNode");
    }
}
