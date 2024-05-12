package com.google.gson;

import X.C16880lQ;
import X.C65403Plf;
import X.C77117UOj;
import X.X1D;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    public final Class<? extends Date> LIZ;
    public final List<DateFormat> LIZIZ;

    public final String toString() {
        DateFormat dateFormat = this.LIZIZ.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DefaultDateTypeAdapter(");
            LIZ.append(((SimpleDateFormat) dateFormat).toPattern());
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DefaultDateTypeAdapter(");
        LIZ2.append(C16880lQ.LJLLJ(dateFormat.getClass()));
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZ(Class cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Date type must be one of ");
        LIZ.append(Date.class);
        LIZ.append(", ");
        LIZ.append(Timestamp.class);
        LIZ.append(", or ");
        LIZ.append(java.sql.Date.class);
        LIZ.append(" but was ");
        LIZ.append(cls);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r3 = X.C61706OJq.LIZIZ(r3, new java.text.ParsePosition(0));
     */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date read(X.C65385PlN r5) {
        /*
            r4 = this;
            X.PlO r1 = r5.LJJIJIL()
            X.PlO r0 = X.EnumC65386PlO.NULL
            if (r1 != r0) goto Ld
            r5.LJJIIJ()
            r3 = 0
        Lc:
            return r3
        Ld:
            java.lang.String r3 = r5.LJJIIZI()
            java.util.List<java.text.DateFormat> r2 = r4.LIZIZ
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L6a
        L1c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L6a
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch: java.lang.Throwable -> L6a
            java.util.Date r3 = r0.parse(r3)     // Catch: java.text.ParseException -> L1c java.lang.Throwable -> L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            goto L39
        L2e:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L63 java.lang.Throwable -> L6a
            r0 = 0
            r1.<init>(r0)     // Catch: java.text.ParseException -> L63 java.lang.Throwable -> L6a
            java.util.Date r3 = X.C61706OJq.LIZIZ(r3, r1)     // Catch: java.text.ParseException -> L63 java.lang.Throwable -> L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
        L39:
            java.lang.Class<? extends java.util.Date> r1 = r4.LIZ
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r1 != r0) goto L40
            goto Lc
        L40:
            java.lang.Class<java.sql.Timestamp> r0 = java.sql.Timestamp.class
            if (r1 != r0) goto L4f
            java.sql.Timestamp r2 = new java.sql.Timestamp
            long r0 = r3.getTime()
            r2.<init>(r0)
        L4d:
            r3 = r2
            goto Lc
        L4f:
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            if (r1 != r0) goto L5d
            java.sql.Date r2 = new java.sql.Date
            long r0 = r3.getTime()
            r2.<init>(r0)
            goto L4d
        L5d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L63:
            r1 = move-exception
            com.google.gson.s r0 = new com.google.gson.s     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.DefaultDateTypeAdapter.read(X.PlN):java.lang.Object");
    }

    public DefaultDateTypeAdapter(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        LIZ(cls);
        this.LIZ = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Date date) {
        Date date2 = date;
        if (date2 == null) {
            c65403Plf.LJIIJJI();
            return;
        }
        synchronized (this.LIZIZ) {
            c65403Plf.LJJ(((DateFormat) ((ArrayList) this.LIZIZ).get(0)).format(date2));
        }
    }

    public DefaultDateTypeAdapter(int i, int i2, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        LIZ(cls);
        this.LIZ = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.google.gson.internal.k.LIZ >= 9) {
            arrayList.add(C77117UOj.LJIILL(i, i2));
        }
    }
}
