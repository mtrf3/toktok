package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JVe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49266JVe {
    public static final /* synthetic */ C49266JVe LIZ = new C49266JVe();

    public static List LIZ(EnumC46469ILp searchCardContainerType, Fragment lifecycleOwner, InterfaceC65784Pro fullSpanCountFetcher, C8YF assemReusedVHProxyer) {
        o.LJIIIZ(searchCardContainerType, "searchCardContainerType");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(fullSpanCountFetcher, "fullSpanCountFetcher");
        o.LJIIIZ(assemReusedVHProxyer, "assemReusedVHProxyer");
        List LJJIFFI = C44729Hgz.LJJIFFI(searchCardContainerType);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIFFI, 10));
        int i = 0;
        for (Object obj : LJJIFFI) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C49267JVf(i + 101, fullSpanCountFetcher, lifecycleOwner, assemReusedVHProxyer, (ISearchCardProtocol) obj));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }
}
