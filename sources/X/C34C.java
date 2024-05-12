package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.34C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34C<T> {
    public final Keva LIZ;
    public final String LIZIZ;
    public final T LIZJ;
    public Object LIZLLL;

    public final Object LIZ(InterfaceC74236TBo property) {
        Object stringSet;
        o.LJIIIZ(property, "property");
        if (o.LJ(this.LIZLLL, this.LIZJ)) {
            T t = this.LIZJ;
            if (t instanceof Boolean) {
                stringSet = Boolean.valueOf(this.LIZ.getBoolean(this.LIZIZ, ((Boolean) t).booleanValue()));
            } else if (t instanceof Double) {
                stringSet = Double.valueOf(this.LIZ.getDouble(this.LIZIZ, ((Number) t).doubleValue()));
            } else if (t instanceof Float) {
                stringSet = Float.valueOf(this.LIZ.getFloat(this.LIZIZ, ((Number) t).floatValue()));
            } else if (t instanceof Integer) {
                stringSet = Integer.valueOf(this.LIZ.getInt(this.LIZIZ, ((Number) t).intValue()));
            } else if (t instanceof Long) {
                stringSet = Long.valueOf(this.LIZ.getLong(this.LIZIZ, ((Number) t).longValue()));
            } else if (t instanceof String) {
                stringSet = this.LIZ.getString(this.LIZIZ, (String) t);
            } else if (t instanceof byte[]) {
                stringSet = this.LIZ.getBytes(this.LIZIZ, (byte[]) t);
            } else if (t instanceof Object[]) {
                Keva keva = this.LIZ;
                String str = this.LIZIZ;
                Object[] objArr = (Object[]) t;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add(String.valueOf(obj));
                }
                stringSet = keva.getStringArray(str, (String[]) arrayList.toArray(new String[0]));
            } else if (t instanceof java.util.Set) {
                Keva keva2 = this.LIZ;
                String str2 = this.LIZIZ;
                Iterable iterable = (Iterable) t;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(iterable, 10));
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(it.next()));
                }
                stringSet = keva2.getStringSet(str2, ORZ.LLJJ(arrayList2));
            } else {
                final T t2 = this.LIZJ;
                throw new IllegalArgumentException(t2) { // from class: X.2ng
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r2 = this;
                            java.lang.StringBuilder r1 = X.X1D.LIZ()
                            java.lang.String r0 = "Keva unsupported the type: "
                            r1.append(r0)
                            if (r3 == 0) goto L1e
                            java.lang.Class r0 = r3.getClass()
                            java.lang.String r0 = X.C16880lQ.LJLLILLLL(r0)
                        L13:
                            r1.append(r0)
                            java.lang.String r0 = X.X1D.LIZIZ(r1)
                            r2.<init>(r0)
                            return
                        L1e:
                            r0 = 0
                            goto L13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C69242ng.<init>(java.lang.Object):void");
                    }
                };
            }
            o.LJIIIIZZ(stringSet, "when (default) {\n       …on(default)\n            }");
            this.LIZLLL = stringSet;
        }
        Object obj2 = this.LIZLLL;
        o.LJII(obj2, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.relation.storage.common.KevaValue");
        return obj2;
    }

    public final void LIZIZ(InterfaceC74236TBo property, Object value) {
        o.LJIIIZ(property, "property");
        o.LJIIIZ(value, "value");
        this.LIZLLL = value;
        if (value instanceof Boolean) {
            this.LIZ.storeBoolean(this.LIZIZ, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Double) {
            this.LIZ.storeDouble(this.LIZIZ, ((Number) value).doubleValue());
            return;
        }
        if (value instanceof Float) {
            this.LIZ.storeFloat(this.LIZIZ, ((Number) value).floatValue());
            return;
        }
        if (value instanceof Integer) {
            this.LIZ.storeInt(this.LIZIZ, ((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            this.LIZ.storeLong(this.LIZIZ, ((Number) value).longValue());
            return;
        }
        if (value instanceof String) {
            this.LIZ.storeString(this.LIZIZ, (String) value);
            return;
        }
        if (value instanceof byte[]) {
            this.LIZ.storeBytes(this.LIZIZ, (byte[]) value);
            return;
        }
        if (value instanceof Object[]) {
            Keva keva = this.LIZ;
            String str = this.LIZIZ;
            Object[] objArr = (Object[]) value;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(String.valueOf(obj));
            }
            keva.storeStringArray(str, (String[]) arrayList.toArray(new String[0]));
            return;
        }
        if (!(value instanceof java.util.Set)) {
            return;
        }
        Keva keva2 = this.LIZ;
        String str2 = this.LIZIZ;
        Iterable iterable = (Iterable) value;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(iterable, 10));
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(it.next()));
        }
        keva2.storeStringSet(str2, ORZ.LLJJ(arrayList2));
    }

    public C34C(Keva keva, String str, T t) {
        o.LJIIIZ(t, "default");
        this.LIZ = keva;
        this.LIZIZ = str;
        this.LIZJ = t;
        this.LIZLLL = t;
    }
}
