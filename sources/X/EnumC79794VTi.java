package X;

import java.util.HashMap;

/* renamed from: X.VTi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79794VTi {
    /* JADX INFO: Fake field, exist only in values array */
    clip,
    /* JADX INFO: Fake field, exist only in values array */
    clip_path,
    /* JADX INFO: Fake field, exist only in values array */
    clipPathUnits,
    /* JADX INFO: Fake field, exist only in values array */
    clip_rule,
    /* JADX INFO: Fake field, exist only in values array */
    color,
    /* JADX INFO: Fake field, exist only in values array */
    cx,
    /* JADX INFO: Fake field, exist only in values array */
    cy,
    /* JADX INFO: Fake field, exist only in values array */
    direction,
    /* JADX INFO: Fake field, exist only in values array */
    dx,
    /* JADX INFO: Fake field, exist only in values array */
    dy,
    /* JADX INFO: Fake field, exist only in values array */
    fx,
    /* JADX INFO: Fake field, exist only in values array */
    fy,
    /* JADX INFO: Fake field, exist only in values array */
    d,
    /* JADX INFO: Fake field, exist only in values array */
    display,
    /* JADX INFO: Fake field, exist only in values array */
    fill,
    /* JADX INFO: Fake field, exist only in values array */
    fill_rule,
    /* JADX INFO: Fake field, exist only in values array */
    fill_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    gradientTransform,
    /* JADX INFO: Fake field, exist only in values array */
    gradientUnits,
    /* JADX INFO: Fake field, exist only in values array */
    height,
    /* JADX INFO: Fake field, exist only in values array */
    href,
    /* JADX INFO: Fake field, exist only in values array */
    image_rendering,
    /* JADX INFO: Fake field, exist only in values array */
    offset,
    /* JADX INFO: Fake field, exist only in values array */
    opacity,
    /* JADX INFO: Fake field, exist only in values array */
    orient,
    /* JADX INFO: Fake field, exist only in values array */
    overflow,
    /* JADX INFO: Fake field, exist only in values array */
    pathLength,
    /* JADX INFO: Fake field, exist only in values array */
    patternContentUnits,
    /* JADX INFO: Fake field, exist only in values array */
    patternTransform,
    /* JADX INFO: Fake field, exist only in values array */
    patternUnits,
    points,
    /* JADX INFO: Fake field, exist only in values array */
    preserveAspectRatio,
    /* JADX INFO: Fake field, exist only in values array */
    r,
    /* JADX INFO: Fake field, exist only in values array */
    refX,
    /* JADX INFO: Fake field, exist only in values array */
    refY,
    /* JADX INFO: Fake field, exist only in values array */
    rx,
    /* JADX INFO: Fake field, exist only in values array */
    ry,
    /* JADX INFO: Fake field, exist only in values array */
    solid_color,
    /* JADX INFO: Fake field, exist only in values array */
    solid_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    spreadMethod,
    /* JADX INFO: Fake field, exist only in values array */
    startOffset,
    /* JADX INFO: Fake field, exist only in values array */
    stop_color,
    /* JADX INFO: Fake field, exist only in values array */
    stop_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    stroke,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_dasharray,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_dashoffset,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_linecap,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_linejoin,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_miterlimit,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_width,
    /* JADX INFO: Fake field, exist only in values array */
    style,
    transform,
    /* JADX INFO: Fake field, exist only in values array */
    type,
    /* JADX INFO: Fake field, exist only in values array */
    vector_effect,
    /* JADX INFO: Fake field, exist only in values array */
    version,
    /* JADX INFO: Fake field, exist only in values array */
    viewBox,
    /* JADX INFO: Fake field, exist only in values array */
    width,
    /* JADX INFO: Fake field, exist only in values array */
    x,
    /* JADX INFO: Fake field, exist only in values array */
    y,
    /* JADX INFO: Fake field, exist only in values array */
    x1,
    /* JADX INFO: Fake field, exist only in values array */
    y1,
    /* JADX INFO: Fake field, exist only in values array */
    x2,
    /* JADX INFO: Fake field, exist only in values array */
    y2,
    /* JADX INFO: Fake field, exist only in values array */
    viewport_fill,
    /* JADX INFO: Fake field, exist only in values array */
    viewport_fill_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    visibility,
    UNSUPPORTED;

    public static final java.util.Map<String, EnumC79794VTi> LJLJJI = new HashMap();

    static {
        for (EnumC79794VTi enumC79794VTi : values()) {
            if (enumC79794VTi != UNSUPPORTED) {
                ((HashMap) LJLJJI).put(enumC79794VTi.name().replace('_', '-'), enumC79794VTi);
            }
        }
    }

    public static EnumC79794VTi LIZJ(String str) {
        EnumC79794VTi enumC79794VTi = (EnumC79794VTi) ((HashMap) LJLJJI).get(str);
        if (enumC79794VTi != null) {
            return enumC79794VTi;
        }
        return UNSUPPORTED;
    }

    public static EnumC79794VTi valueOf(String str) {
        return (EnumC79794VTi) V0N.LJJJ(EnumC79794VTi.class, str);
    }
}
