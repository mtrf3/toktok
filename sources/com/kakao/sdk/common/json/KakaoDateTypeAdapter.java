package com.kakao.sdk.common.json;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.TypeAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes12.dex */
public final class KakaoDateTypeAdapter extends TypeAdapter<Date> {
    public final SimpleDateFormat format;

    public KakaoDateTypeAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.format = simpleDateFormat;
    }

    public final SimpleDateFormat getFormat() {
        return this.format;
    }

    @Override // com.google.gson.TypeAdapter
    public Date read(C65385PlN c65385PlN) {
        EnumC65386PlO LJJIJIL;
        EnumC65386PlO LJJIJIL2;
        if (c65385PlN == null) {
            LJJIJIL = null;
        } else {
            LJJIJIL = c65385PlN.LJJIJIL();
        }
        if (LJJIJIL == EnumC65386PlO.NULL) {
            c65385PlN.LJJIIJ();
            return null;
        }
        if (c65385PlN == null) {
            LJJIJIL2 = null;
        } else {
            LJJIJIL2 = c65385PlN.LJJIJIL();
        }
        if (LJJIJIL2 != EnumC65386PlO.STRING) {
            return null;
        }
        return this.format.parse(c65385PlN.LJJIIZI());
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C65403Plf c65403Plf, Date date) {
        if (date == null) {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJIIJJI();
        } else {
            if (c65403Plf == null) {
                return;
            }
            c65403Plf.LJJ(this.format.format(date));
        }
    }
}
