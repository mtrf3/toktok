package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes12.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final u LIZIZ = new u() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat LIZ = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.TypeAdapter
    public final Date read(C65385PlN c65385PlN) {
        synchronized (this) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            try {
                return new Date(this.LIZ.parse(c65385PlN.LJJIIZI()).getTime());
            } catch (ParseException e) {
                throw new s(e);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Date date) {
        String format;
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                format = null;
            } else {
                format = this.LIZ.format((java.util.Date) date2);
            }
            c65403Plf.LJJ(format);
        }
    }
}
