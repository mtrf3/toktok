package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18720oO {
    public EnumC23500w6 LIZ;
    public InterfaceC23370vt LIZIZ;
    public InterfaceC13480fw LIZJ;
    public C08370Un LIZLLL;
    public Object LJ;
    public long LJFF;

    public C18720oO(EnumC23500w6 layoutDirection, InterfaceC23370vt density, InterfaceC13480fw fontFamilyResolver, C08370Un resolvedStyle, Object typeface) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
        o.LJIIIZ(resolvedStyle, "resolvedStyle");
        o.LJIIIZ(typeface, "typeface");
        this.LIZ = layoutDirection;
        this.LIZIZ = density;
        this.LIZJ = fontFamilyResolver;
        this.LIZLLL = resolvedStyle;
        this.LJ = typeface;
        this.LJFF = C18800oW.LIZ(resolvedStyle, density, fontFamilyResolver, C18800oW.LIZ, 1);
    }
}
