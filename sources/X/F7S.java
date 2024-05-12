package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class F7S implements FBZ {
    public final List<InterfaceC37216Ej6> LIZ;
    public final int LIZIZ;
    public final Request LIZJ;
    public final InterfaceC37276Ek4 LIZLLL;
    public int LJ;
    public final C64738Paw LJFF;

    @Override // X.FBZ
    public final C64738Paw LIZIZ() {
        return this.LJFF;
    }

    @Override // X.FBZ
    public final Request request() {
        return this.LIZJ;
    }

    @Override // X.FBZ
    public final C64797Pbt LIZ(Request request) {
        String str;
        C36910EeA c36910EeA;
        long j;
        long j2;
        C64738Paw metrics = request.getMetrics();
        if (this.LIZIZ < this.LIZ.size()) {
            int i = this.LJ + 1;
            this.LJ = i;
            if (i > 1) {
                for (InterfaceC37216Ej6 interfaceC37216Ej6 : this.LIZ) {
                    if (interfaceC37216Ej6 instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) interfaceC37216Ej6).resetExecuted();
                    }
                }
            }
            List<InterfaceC37216Ej6> list = this.LIZ;
            int i2 = this.LIZIZ;
            F7S f7s = new F7S(list, i2 + 1, request, this.LIZLLL, this.LJFF);
            InterfaceC37216Ej6 interfaceC37216Ej62 = (InterfaceC37216Ej6) ListProtector.get(list, i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("interceptor = ");
            if (interfaceC37216Ej62 != null) {
                str = interfaceC37216Ej62.toString();
            } else {
                str = "";
            }
            LIZ.append(str);
            LIZ.append(" url = ");
            LIZ.append(request.getUrl());
            X1D.LIZIZ(LIZ);
            if (interfaceC37216Ej62 != null) {
                this.LJFF.LJ();
                C64738Paw c64738Paw = this.LJFF;
                c64738Paw.getClass();
                String name = interfaceC37216Ej62.getClass().getName();
                if (!TextUtils.isEmpty(name)) {
                    ((ArrayList) c64738Paw.LJJJLZIJ).add(new C37825Esv(name.substring(name.lastIndexOf(46) + 1), SystemClock.uptimeMillis()));
                }
                C64797Pbt intercept = interfaceC37216Ej62.intercept(f7s);
                C64738Paw c64738Paw2 = this.LJFF;
                if (((ArrayList) c64738Paw2.LJJJZ).size() > 0) {
                    ((C37825Esv) ListProtector.get((ArrayList) c64738Paw2.LJJJZ, r1.size() - 1)).LIZJ = SystemClock.uptimeMillis();
                }
                int i3 = this.LIZIZ;
                if (i3 > 0) {
                    this.LJFF.LJFF((InterfaceC37216Ej6) ListProtector.get(this.LIZ, i3 - 1));
                }
                if (intercept != null) {
                    if (intercept.LIZ != null) {
                        if (Integer.valueOf(this.LIZIZ).intValue() == 0 && (c36910EeA = intercept.LIZ) != null) {
                            Object obj = c36910EeA.LJFF;
                            if (obj instanceof C64668PZo) {
                                C64668PZo c64668PZo = (C64668PZo) obj;
                                if (c64668PZo.LJII > 0) {
                                    F7T.LIZ.getClass();
                                    if (metrics != null && C56662Kg.LIZ().LIZLLL && C65314PkE.LJIIIZ(request)) {
                                        long j3 = c64668PZo.LIZLLL;
                                        long j4 = j3 - c64668PZo.LIZJ;
                                        long j5 = c64668PZo.LJ;
                                        long j6 = j5 - j3;
                                        long j7 = c64668PZo.LJFF;
                                        long j8 = j7 - j5;
                                        long j9 = c64668PZo.LJII - j7;
                                        int size = ((ArrayList) metrics.LJJJZ).size();
                                        if (size > 0) {
                                            long j10 = ((C37825Esv) ListProtector.get(metrics.LJJJZ, size - 1)).LIZJ;
                                            j2 = j10 - metrics.LJJ;
                                            long j11 = metrics.LJIILL;
                                            if (j11 <= 0) {
                                                j11 = metrics.LJIILJJIL;
                                            }
                                            j = j10 - j11;
                                        } else {
                                            j = 0;
                                            j2 = 0;
                                        }
                                        C56662Kg.LIZ().LJ(c64668PZo.LIZJ, "feed_api_to_net_api", false);
                                        C56662Kg.LIZ().LIZLLL(j4, "feed_net_api_to_interceptors");
                                        C56662Kg.LIZ().LIZLLL(j6, "feed_interceptors_pre_duration");
                                        C56662Kg.LIZ().LIZLLL(j8, "feed_network_to_response");
                                        C56662Kg.LIZ().LIZLLL(j9, "feed_read_response_duration");
                                        C56662Kg.LIZ().LIZLLL(j2, "feed_interceptors_post_duration");
                                        C56662Kg.LIZ().LIZLLL(j, "feed_net_api_total");
                                        Iterator it = ((ArrayList) metrics.LJJJLZIJ).iterator();
                                        while (it.hasNext()) {
                                            C37825Esv c37825Esv = (C37825Esv) it.next();
                                            FAM LIZ2 = C56662Kg.LIZ();
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ2.LIZLLL(c37825Esv.LIZJ - c37825Esv.LIZIZ, JBR.LJFF(LIZ3, c37825Esv.LIZ, "_duration_pre", LIZ3));
                                        }
                                        Iterator it2 = ((ArrayList) metrics.LJJJZ).iterator();
                                        while (it2.hasNext()) {
                                            C37825Esv c37825Esv2 = (C37825Esv) it2.next();
                                            FAM LIZ4 = C56662Kg.LIZ();
                                            StringBuilder LIZ5 = X1D.LIZ();
                                            LIZ4.LIZLLL(c37825Esv2.LIZJ - c37825Esv2.LIZIZ, JBR.LJFF(LIZ5, c37825Esv2.LIZ, "_duration_post", LIZ5));
                                        }
                                        if (c64668PZo.LJIIIZ > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIIIZ, "feed_cronet_dns_duration");
                                        }
                                        if (c64668PZo.LJIIJ > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIIJ, "feed_cronet_connect_duration");
                                        }
                                        if (c64668PZo.LJIIJJI > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIIJJI, "feed_cronet_ssl_duration");
                                        }
                                        if (c64668PZo.LJIIL > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIIL, "feed_cronet_send_duration");
                                        }
                                        if (c64668PZo.LJIILL > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIILL, "feed_cronet_timing_waiting");
                                        }
                                        if (c64668PZo.LJIILIIL > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIILIIL, "feed_cronet_receive_duration");
                                        }
                                        if (c64668PZo.LJIILLIIL > 0) {
                                            C56662Kg.LIZ().LIZLLL(c64668PZo.LJIILLIIL, "feed_cronet_total");
                                        }
                                    }
                                }
                            }
                        }
                        return intercept;
                    }
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("interceptor ");
                    LIZ6.append(interfaceC37216Ej62);
                    LIZ6.append(" returned a ssResponse with no body");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ6));
                }
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("interceptor ");
                LIZ7.append(interfaceC37216Ej62);
                LIZ7.append(" returned null");
                throw new NullPointerException(X1D.LIZIZ(LIZ7));
            }
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("interceptor ");
            throw new NullPointerException(C08380Uo.LIZ(LIZ8, this.LIZIZ, " is null", LIZ8));
        }
        throw new AssertionError();
    }

    public F7S(List<InterfaceC37216Ej6> list, int i, Request request, InterfaceC37276Ek4 interfaceC37276Ek4, C64738Paw c64738Paw) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = request;
        this.LIZLLL = interfaceC37276Ek4;
        this.LJFF = c64738Paw;
    }
}
