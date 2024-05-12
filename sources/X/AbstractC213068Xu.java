package X;

import X.InterfaceC213058Xt;
import X.InterfaceC213078Xv;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS67S0201000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Xu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC213068Xu<R extends InterfaceC213058Xt<R, ITEM>, ITEM extends InterfaceC213078Xv> implements C8YB<R, ITEM> {
    public final InterfaceC55062LjG LIZ;
    public ConcurrentHashMap<String, C212988Xm<R, ITEM>> LIZIZ;

    public abstract String LJ(ITEM item, R r, int i);

    public AbstractC213068Xu(InterfaceC55062LjG adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZ = adapter;
        this.LIZIZ = new ConcurrentHashMap<>();
    }

    @Override // X.C8YB
    public void LIZ(List list) {
        this.LIZIZ.clear();
    }

    @Override // X.C8YB
    public final void LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        Iterator<Map.Entry<String, C212988Xm<R, ITEM>>> it = this.LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C212988Xm<R, ITEM>> next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            if (o.LJ(next.getKey(), C78886Uxe.LJIILIIL(aweme))) {
                it.remove();
            }
        }
    }

    @Override // X.C8YB
    public final void LIZLLL(List<? extends Aweme> list) {
        String LJIILIIL;
        ConcurrentHashMap<String, C212988Xm<R, ITEM>> concurrentHashMap = new ConcurrentHashMap<>();
        if (list != null && !list.isEmpty()) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null && (LJIILIIL = C78886Uxe.LJIILIIL(aweme)) != null && !TextUtils.isEmpty(LJIILIIL) && this.LIZIZ.get(LJIILIIL) != null) {
                    concurrentHashMap.put(LJIILIIL, this.LIZIZ.get(LJIILIIL));
                }
            }
        }
        this.LIZIZ = concurrentHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    @Override // X.InterfaceC212878Xb
    public final void LIZIZ(C8RL item, InterfaceC212998Xn<?, ?> interfaceC212998Xn, int i, List<? extends Object> list) {
        o.LJIIIZ(item, "item");
        InterfaceC213078Xv interfaceC213078Xv = (InterfaceC213078Xv) item;
        C68322mC c68322mC = new C68322mC();
        ?? LJIILIIL = C78886Uxe.LJIILIIL(interfaceC213078Xv.getAweme());
        c68322mC.element = LJIILIIL;
        if (LJIILIIL == 0 || LJIILIIL.length() == 0) {
            if (C214368bA.LIZLLL) {
                c68322mC.element = AnonymousClass629.LIZ("randomUUID().toString()");
                interfaceC213078Xv.getAweme().setFakeAid((String) c68322mC.element);
                C78983UzD.LJIILL(LJ(interfaceC213078Xv, (InterfaceC213058Xt) interfaceC212998Xn, i));
            } else {
                return;
            }
        }
        C212988Xm<R, ITEM> c212988Xm = this.LIZIZ.get(c68322mC.element);
        if (c212988Xm == null) {
            InterfaceC212978Xl<?, ?> child = interfaceC212998Xn.getChild();
            if (!(child instanceof InterfaceC212978Xl)) {
                child = null;
            }
            c212988Xm = new C212988Xm<>(C65352Pkq.LIZ(interfaceC212998Xn.getClass()), child);
            this.LIZIZ.put(c68322mC.element, c212988Xm);
        }
        C212988Xm<?, ?> proxy = interfaceC212998Xn.getProxy();
        if (proxy != null) {
            proxy.LIZIZ();
        }
        c212988Xm.LIZ(i, interfaceC212998Xn, item, list, new AqS93S0101000_3(c212988Xm, i, 15), new AqS67S0201000_3(this, c68322mC, (C68322mC<String>) i, 1));
    }
}
