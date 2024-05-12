package com.ss.android.ugc.aweme.shortvideo.network;

import X.C16880lQ;
import X.C40675Fxn;
import X.C60903NvH;
import X.C64797Pbt;
import X.EnumC45753HxV;
import X.F7S;
import X.FBZ;
import X.H7B;
import X.InterfaceC37216Ej6;
import X.ORZ;
import X.Q3P;
import X.X1D;
import Y.IDComparatorS342S0100000_11;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.setting.performance.ToolsNetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS193S0100000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class ToolsInterceptor implements InterfaceC37216Ej6 {
    public volatile boolean LJLIL;
    public volatile String LJLILLLLZI;
    public final List<Request> LJLJI = new ArrayList();
    public final List<Request> LJLJJI = new ArrayList();
    public final Map<Request, Thread> LJLJJL = new LinkedHashMap();
    public final ReentrantLock LJLJJLL = new ReentrantLock();

    public final void LIZIZ() {
        EnumC45753HxV enumC45753HxV;
        ArrayList arrayList = (ArrayList) this.LJLJI;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS342S0100000_11(this, 2));
        }
        ArrayList arrayList2 = (ArrayList) this.LJLJJI;
        if (arrayList2.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList2, new IDComparatorS342S0100000_11(this, 3));
        }
        if (!((ArrayList) this.LJLJI).isEmpty()) {
            enumC45753HxV = LIZ((Request) ORZ.LJLLJ(this.LJLJI));
        } else if (!((ArrayList) this.LJLJJI).isEmpty()) {
            enumC45753HxV = LIZ((Request) ORZ.LJLLJ(this.LJLJJI));
        } else {
            enumC45753HxV = EnumC45753HxV.P0;
        }
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (LIZ(request).compareTo(enumC45753HxV) >= 0) {
                try {
                    Thread thread = (Thread) ((LinkedHashMap) this.LJLJJL).get(request);
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (InterruptedException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Tools-Interceptor interrupt ");
                    LIZ.append(e.getLocalizedMessage());
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                }
            } else {
                return;
            }
        }
    }

    public ToolsInterceptor() {
        C60903NvH.LJIIJJI().LJIILIIL().listenToCurrentPage(new AqS193S0100000_11(this, 6));
    }

    public static EnumC45753HxV LIZ(Request request) {
        if (request == null) {
            return EnumC45753HxV.P0;
        }
        Iterator<ToolsNetworkRequest> it = Q3P.LIZ().getP0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ToolsNetworkRequest next = it.next();
            ToolsNetworkRequest toolsNetworkRequest = next;
            String path = request.getPath();
            o.LJIIIIZZ(path, "path");
            if (o.LJ(s.LJJZZIII("/", path), toolsNetworkRequest.getPath())) {
                String url = request.getUrl();
                o.LJIIIIZZ(url, "url");
                if (s.LJJJLZIJ(url, toolsNetworkRequest.getExtra(), false)) {
                    if (next != null) {
                        return EnumC45753HxV.P0;
                    }
                }
            }
        }
        Iterator<ToolsNetworkRequest> it2 = Q3P.LIZ().getP1().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ToolsNetworkRequest next2 = it2.next();
            ToolsNetworkRequest toolsNetworkRequest2 = next2;
            String path2 = request.getPath();
            o.LJIIIIZZ(path2, "path");
            if (o.LJ(s.LJJZZIII("/", path2), toolsNetworkRequest2.getPath())) {
                String url2 = request.getUrl();
                o.LJIIIIZZ(url2, "url");
                if (s.LJJJLZIJ(url2, toolsNetworkRequest2.getExtra(), false)) {
                    if (next2 != null) {
                        return EnumC45753HxV.P1;
                    }
                }
            }
        }
        Iterator<ToolsNetworkRequest> it3 = Q3P.LIZ().getP2().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ToolsNetworkRequest next3 = it3.next();
            ToolsNetworkRequest toolsNetworkRequest3 = next3;
            String path3 = request.getPath();
            o.LJIIIIZZ(path3, "path");
            if (o.LJ(s.LJJZZIII("/", path3), toolsNetworkRequest3.getPath())) {
                String url3 = request.getUrl();
                o.LJIIIIZZ(url3, "url");
                if (s.LJJJLZIJ(url3, toolsNetworkRequest3.getExtra(), false)) {
                    if (next3 != null) {
                        return EnumC45753HxV.P2;
                    }
                }
            }
        }
        Iterator<ToolsNetworkRequest> it4 = Q3P.LIZ().getP3().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            ToolsNetworkRequest next4 = it4.next();
            ToolsNetworkRequest toolsNetworkRequest4 = next4;
            String path4 = request.getPath();
            o.LJIIIIZZ(path4, "path");
            if (o.LJ(s.LJJZZIII("/", path4), toolsNetworkRequest4.getPath())) {
                String url4 = request.getUrl();
                o.LJIIIIZZ(url4, "url");
                if (s.LJJJLZIJ(url4, toolsNetworkRequest4.getExtra(), false)) {
                    if (next4 != null) {
                        return EnumC45753HxV.P3;
                    }
                }
            }
        }
        return EnumC45753HxV.P0;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Boolean bool;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        if (this.LJLIL && o.LJ(this.LJLILLLLZI, "tool_record_page")) {
            System.currentTimeMillis();
            o.LJIIIIZZ(request, "request");
            this.LJLJJLL.lock();
            Iterator it = ((ArrayList) this.LJLJI).iterator();
            while (true) {
                bool = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (LIZ((Request) next).compareTo(LIZ(request)) > 0) {
                    if (next != null) {
                        bool = Boolean.valueOf(((ArrayList) this.LJLJJI).add(request));
                    }
                }
            }
            this.LJLJJLL.unlock();
            if (bool != null) {
                Map<Request, Thread> map = this.LJLJJL;
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJIIIIZZ(LLLLIIIILLL, "currentThread()");
                map.put(request, LLLLIIIILLL);
                try {
                    Thread.sleep(Q3P.LIZ().getLazyInterval());
                } catch (InterruptedException e) {
                    H7B.LIZJ("Tools-Interceptor " + e.getLocalizedMessage());
                }
            }
            this.LJLJJLL.lock();
            ((ArrayList) this.LJLJI).add(request);
            this.LJLJJLL.unlock();
            try {
                return ((F7S) fbz).LIZ(request);
            } finally {
                System.currentTimeMillis();
                this.LJLJJLL.lock();
                ((ArrayList) this.LJLJI).remove(request);
                ((ArrayList) this.LJLJJI).remove(request);
                LIZIZ();
                this.LJLJJLL.unlock();
            }
        }
        return f7s.LIZ(request);
    }
}
