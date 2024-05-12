package com.google.gson.internal.bind;

import X.C61706OJq;
import X.C65385PlN;
import X.C65403Plf;
import X.C77117UOj;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.k;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final u LIZIZ = new u() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final List<DateFormat> LIZ;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (k.LIZ >= 9) {
            arrayList.add(C77117UOj.LJIILL(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Date read(C65385PlN c65385PlN) {
        if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        String LJJIIZI = c65385PlN.LJJIIZI();
        synchronized (this) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                try {
                    return ((DateFormat) it.next()).parse(LJJIIZI);
                } catch (ParseException unused) {
                }
            }
            try {
                return C61706OJq.LIZIZ(LJJIIZI, new ParsePosition(0));
            } catch (ParseException e) {
                throw new s(LJJIIZI, e);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                c65403Plf.LJIIJJI();
            } else {
                c65403Plf.LJJ(((DateFormat) ((ArrayList) this.LIZ).get(0)).format(date2));
            }
        }
    }
}
