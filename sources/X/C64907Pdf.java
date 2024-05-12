package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pdf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64907Pdf {
    public final boolean LIZ;
    public final PY0 LIZIZ;
    public final C34821Yg LIZJ;
    public final C64912Pdk LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;
    public Object LJII;
    public final String LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C64738Paw LJIIJ;
    public final Request LJIIJJI;

    public final Request LIZ() {
        C64908Pdg newBuilder = this.LJIIJJI.newBuilder();
        C64912Pdk c64912Pdk = this.LIZLLL;
        newBuilder.LIZIZ(c64912Pdk.LIZ, (TypedOutput) c64912Pdk.LIZIZ);
        newBuilder.LIZJ(this.LIZIZ.LIZIZ());
        newBuilder.LIZJ = this.LIZJ.LJFF();
        newBuilder.LJI = this.LJ;
        newBuilder.LJII = this.LJFF;
        newBuilder.LJIIIIZZ = this.LJI;
        newBuilder.LJIIJ = this.LJII;
        newBuilder.LJIIJJI = this.LJIIIIZZ;
        for (Map.Entry entry : ((java.util.Map) this.LJIIIZ.getValue()).entrySet()) {
            Object key = entry.getKey();
            if (!(key instanceof Class)) {
                key = null;
            }
            Class<?> cls = (Class) key;
            Object value = entry.getValue();
            if (cls != null) {
                if (newBuilder.LJIILIIL == null) {
                    newBuilder.LJIILIIL = new HashMap();
                }
                if (value == null) {
                    newBuilder.LJIILIIL.remove(cls);
                } else {
                    newBuilder.LJIILIIL.put(cls, cls.cast(value));
                }
            } else {
                throw new NullPointerException("type == null");
            }
        }
        Request LIZ = newBuilder.LIZ();
        LIZ.setMetrics(this.LJIIJ);
        return LIZ;
    }

    public C64907Pdf(Request request) {
        C34821Yg c34821Yg;
        this.LJIIJJI = request;
        this.LIZ = request.isAddCommonParam();
        this.LIZIZ = PY0.LIZJ(request.getUrl());
        if (request.getHeaders() == null) {
            c34821Yg = new C34821Yg(C61878OQg.INSTANCE);
        } else {
            List<EJ6> headers = request.getHeaders();
            o.LJIIIIZZ(headers, "originRequest.headers");
            c34821Yg = new C34821Yg(headers);
        }
        this.LIZJ = c34821Yg;
        this.LIZLLL = new C64912Pdk(request);
        request.getPriorityLevel();
        this.LJ = request.getRequestPriorityLevel();
        this.LJFF = request.isResponseStreaming();
        this.LJI = request.getMaxLength();
        this.LJII = request.getExtraInfo();
        String serviceType = request.getServiceType();
        o.LJIIIIZZ(serviceType, "originRequest.serviceType");
        this.LJIIIIZZ = serviceType;
        this.LJIIIZ = C221108m2.LIZIZ(C64913Pdl.LJLIL);
        C64738Paw metrics = request.getMetrics();
        o.LJIIIIZZ(metrics, "originRequest.metrics");
        this.LJIIJ = metrics;
    }
}
