package com.bytedance.android.live.wallet.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.QZZ;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class LocationObject extends F9E {
    public final LocationObject LJLIL;

    @InterfaceC65349Pkn("asciName")
    public String asciName;

    @InterfaceC65349Pkn("code")
    public String code;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("geonameid")
    public int geonameId;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("subRegion")
    public List<LocationObject> subRegion;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.code, this.asciName};
    }

    public final String L() {
        String str = this.name;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = this.description.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int LJJLIIIJL = s.LJJLIIIJL(lowerCase, lowerCase2, 0, false, 6);
        if (LJJLIIIJL != -1 && this.description.length() + LJJLIIIJL == this.name.length()) {
            String substring = this.name.substring(0, LJJLIIIJL);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return this.name;
    }

    public final String M() {
        if (this.name.length() == 0) {
            return "";
        }
        return String.valueOf(this.name.charAt(0));
    }

    public LocationObject() {
        this.name = "";
        this.code = "";
        this.asciName = "";
        this.description = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationObject(LocationObject locationObject, String str, String str2, String str3, int i, String str4) {
        this();
        C43588H8u.LIZLLL(str, "name", str2, "code", str3, "asciName", str4, "description");
        this.LJLIL = locationObject;
        this.name = str;
        this.code = str2;
        this.asciName = str3;
        this.geonameId = i;
        this.description = QZZ.LIZIZ(' ', str4);
    }
}
