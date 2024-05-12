package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xqa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86092Xqa implements Serializable {
    public String LJLIL = "age_scroll_result";
    public java.util.Map<String, String> LJLILLLLZI = new LinkedHashMap();
    public boolean LJLJI;
    public Locale LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public EnumC86095Xqd LJLJL;

    public C86092Xqa() {
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        this.LJLJJI = ROOT;
        this.LJLJJLL = EnumC62974Ona.NONE.getValue();
        this.LJLJL = EnumC86095Xqd.REGISTRATION;
    }

    public final int getConfirmationType() {
        return this.LJLJJLL;
    }

    public final String getEventNameScrollResults() {
        return this.LJLIL;
    }

    public final Locale getLocale() {
        return this.LJLJJI;
    }

    public final java.util.Map<String, String> getLogParams() {
        return this.LJLILLLLZI;
    }

    public final EnumC86095Xqd getScene() {
        return this.LJLJL;
    }

    public final boolean isFtc() {
        return this.LJLJI;
    }

    public final boolean isGuestMode() {
        return this.LJLJJL;
    }

    public final void setConfirmationType(int i) {
        this.LJLJJLL = i;
    }

    public final void setEventNameScrollResults(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setFtc(boolean z) {
        this.LJLJI = z;
    }

    public final void setGuestMode(boolean z) {
        this.LJLJJL = z;
    }

    public final void setLocale(Locale locale) {
        o.LJIIIZ(locale, "<set-?>");
        this.LJLJJI = locale;
    }

    public final void setLogParams(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<set-?>");
        this.LJLILLLLZI = map;
    }

    public final void setScene(EnumC86095Xqd enumC86095Xqd) {
        o.LJIIIZ(enumC86095Xqd, "<set-?>");
        this.LJLJL = enumC86095Xqd;
    }
}
