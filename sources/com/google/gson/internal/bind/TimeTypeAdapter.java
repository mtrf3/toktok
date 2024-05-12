package com.google.gson.internal.bind;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.u;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes12.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {
    public static final u LIZIZ = new u() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.u
        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat LIZ = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.TypeAdapter
    public final Time read(C65385PlN c65385PlN) {
        synchronized (this) {
            if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                c65385PlN.LJJIIJ();
                return null;
            }
            try {
                return new Time(this.LIZ.parse(c65385PlN.LJJIIZI()).getTime());
            } catch (ParseException e) {
                throw new s(e);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf c65403Plf, Time time) {
        String format;
        Time time2 = time;
        synchronized (this) {
            if (time2 == null) {
                format = null;
            } else {
                format = this.LIZ.format((Date) time2);
            }
            c65403Plf.LJJ(format);
        }
    }
}
