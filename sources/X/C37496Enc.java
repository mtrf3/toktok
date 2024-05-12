package X;

import android.text.TextUtils;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Enc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37496Enc implements BQ8, InterfaceC37489EnV {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC37489EnV
    public void release() {
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        Enumeration<Object> elements = this.LIZIZ.elements();
        while (elements.hasMoreElements()) {
            try {
                Object nextElement = elements.nextElement();
                if (nextElement instanceof InterfaceC37489EnV) {
                    ((InterfaceC37489EnV) nextElement).release();
                }
            } catch (Throwable unused) {
            }
        }
        this.LIZIZ.clear();
    }

    public final String LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.hashCode());
        LIZ.append(String.valueOf(hashCode()));
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZJ(InterfaceC37489EnV interfaceC37489EnV) {
        if (this.LIZ.get()) {
            return null;
        }
        String LIZIZ = LIZIZ(interfaceC37489EnV);
        if (!TextUtils.isEmpty(LIZIZ)) {
            this.LIZIZ.putIfAbsent(LIZIZ, interfaceC37489EnV);
        }
        return LIZIZ;
    }

    @Override // X.BQ8
    public final Object get(String str) {
        if (this.LIZ.get() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.get(str);
    }

    @Override // X.BQ8
    public final Object remove(String str) {
        if (this.LIZ.get() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.remove(str);
    }

    @Override // X.BQ8
    public final String LIZ(Object obj, String str) {
        if (this.LIZ.get() || obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        this.LIZIZ.putIfAbsent(str, obj);
        return str;
    }
}
