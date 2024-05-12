package X;

import android.webkit.WebResourceRequest;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.j;
import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Erq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37758Erq implements WebResourceRequest {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ SSPResponse.Prefetch LIZIZ;

    @Override // android.webkit.WebResourceRequest
    public final String getMethod() {
        return "GET";
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean hasGesture() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isRedirect() {
        return false;
    }

    @Override // android.webkit.WebResourceRequest
    public final java.util.Map<String, String> getRequestHeaders() {
        String str;
        Object LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Referer", this.LIZ);
        InterfaceC65784Pro<String> interfaceC65784Pro = C39868Fkm.LIZ;
        if (interfaceC65784Pro != null) {
            str = interfaceC65784Pro.invoke();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put("User-Agent", str);
        }
        m mVar = this.LIZIZ.reqHeader;
        if (mVar != null) {
            java.util.Set<Map.Entry<String, j>> entrySet = mVar.entrySet();
            o.LJFF(entrySet, "headers.entrySet()");
            for (Map.Entry<String, j> entry : entrySet) {
                try {
                    String key = entry.getKey();
                    o.LJFF(key, "entry.key");
                    j value = entry.getValue();
                    o.LJFF(value, "entry.value");
                    String LJJIFFI = value.LJJIFFI();
                    o.LJFF(LJJIFFI, "entry.value.asString");
                    linkedHashMap.put(key, LJJIFFI);
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("exception happens when convert ssp response header, e: ");
                    LIZ2.append(m10exceptionOrNullimpl);
                    LIZ2.append(", url: ");
                    LIZ2.append(this.LIZIZ.url);
                    c39048FUe.LIZ(X1D.LIZIZ(LIZ2), EnumC39866Fkk.E, "SspLifeCycle");
                }
            }
        }
        return linkedHashMap;
    }

    @Override // android.webkit.WebResourceRequest
    public final android.net.Uri getUrl() {
        return UriProtector.parse(this.LIZ);
    }

    @Override // android.webkit.WebResourceRequest
    public final boolean isForMainFrame() {
        return o.LJ(this.LIZIZ.isMainFrame, Boolean.TRUE);
    }

    public C37758Erq(String str, SSPResponse.Prefetch prefetch) {
        this.LIZ = str;
        this.LIZIZ = prefetch;
    }
}
