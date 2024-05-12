package X;

import java.util.HashMap;

/* renamed from: X.W2s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81650W2s {
    /* JADX INFO: Fake field, exist only in values array */
    svg,
    /* JADX INFO: Fake field, exist only in values array */
    circle,
    /* JADX INFO: Fake field, exist only in values array */
    clipPath,
    /* JADX INFO: Fake field, exist only in values array */
    defs,
    /* JADX INFO: Fake field, exist only in values array */
    ellipse,
    /* JADX INFO: Fake field, exist only in values array */
    g,
    /* JADX INFO: Fake field, exist only in values array */
    image,
    /* JADX INFO: Fake field, exist only in values array */
    line,
    /* JADX INFO: Fake field, exist only in values array */
    linearGradient,
    /* JADX INFO: Fake field, exist only in values array */
    path,
    /* JADX INFO: Fake field, exist only in values array */
    pattern,
    /* JADX INFO: Fake field, exist only in values array */
    polygon,
    /* JADX INFO: Fake field, exist only in values array */
    polyline,
    /* JADX INFO: Fake field, exist only in values array */
    radialGradient,
    /* JADX INFO: Fake field, exist only in values array */
    rect,
    /* JADX INFO: Fake field, exist only in values array */
    solidColor,
    /* JADX INFO: Fake field, exist only in values array */
    stop,
    /* JADX INFO: Fake field, exist only in values array */
    use,
    UNSUPPORTED;

    public static final java.util.Map<String, EnumC81650W2s> LJLILLLLZI = new HashMap();

    static {
        for (EnumC81650W2s enumC81650W2s : values()) {
            if (enumC81650W2s != UNSUPPORTED) {
                ((HashMap) LJLILLLLZI).put(enumC81650W2s.name(), enumC81650W2s);
            }
        }
    }

    public static EnumC81650W2s valueOf(String str) {
        return (EnumC81650W2s) V0N.LJJJ(EnumC81650W2s.class, str);
    }
}
