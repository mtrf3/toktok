package X;

import android.graphics.RectF;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TOP_LEFT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public final class KLI {
    public static final KLI BOTTOM;
    public static final KLI BOTTOM_LEFT;
    public static final KLI BOTTOM_RIGHT;
    public static final KLI CENTER;
    public static final KLI LEFT;
    public static final /* synthetic */ KLI[] LJLILLLLZI;
    public static final KLI RIGHT;
    public static final KLI TOP;
    public static final KLI TOP_LEFT;
    public static final KLI TOP_RIGHT;
    public final AbstractC261710z LJLIL;

    static {
        final KLL kll = KLL.TOP;
        final KLL kll2 = KLL.LEFT;
        KLI kli = new KLI("TOP_LEFT", 0, new AbstractC261710z(kll, kll2) { // from class: X.KLN
            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                Object obj = this.LIZIZ;
                KLL kll3 = KLL.LEFT;
                if (obj == kll3) {
                    coordinate = f;
                } else {
                    coordinate = kll3.getCoordinate();
                }
                Object obj2 = this.LIZ;
                KLL kll4 = KLL.TOP;
                if (obj2 == kll4) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = kll4.getCoordinate();
                }
                Object obj3 = this.LIZIZ;
                KLL kll5 = KLL.RIGHT;
                if (obj3 == kll5) {
                    coordinate3 = f;
                } else {
                    coordinate3 = kll5.getCoordinate();
                }
                Object obj4 = this.LIZ;
                KLL kll6 = KLL.BOTTOM;
                if (obj4 == kll6) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = kll6.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C56237M5h c56237M5h = (C56237M5h) this.LIZJ;
                    c56237M5h.LIZ = (KLL) this.LIZIZ;
                    c56237M5h.LIZIZ = this.LIZ;
                } else {
                    C56237M5h c56237M5h2 = (C56237M5h) this.LIZJ;
                    c56237M5h2.LIZ = (KLL) this.LIZ;
                    c56237M5h2.LIZIZ = this.LIZIZ;
                }
                C56237M5h c56237M5h3 = (C56237M5h) this.LIZJ;
                KLL kll7 = (KLL) c56237M5h3.LIZ;
                KLL kll8 = (KLL) c56237M5h3.LIZIZ;
                kll7.adjustCoordinate(f, f2, rectF, f4, f3);
                kll8.adjustCoordinate(f3);
                if (kll8.isOutsideMargin(rectF, f4)) {
                    kll8.snapToRect(rectF);
                    kll7.adjustCoordinate(f3);
                }
            }
        });
        TOP_LEFT = kli;
        final KLL kll3 = KLL.RIGHT;
        KLI kli2 = new KLI("TOP_RIGHT", 1, new AbstractC261710z(kll, kll3) { // from class: X.KLN
            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                Object obj = this.LIZIZ;
                KLL kll32 = KLL.LEFT;
                if (obj == kll32) {
                    coordinate = f;
                } else {
                    coordinate = kll32.getCoordinate();
                }
                Object obj2 = this.LIZ;
                KLL kll4 = KLL.TOP;
                if (obj2 == kll4) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = kll4.getCoordinate();
                }
                Object obj3 = this.LIZIZ;
                KLL kll5 = KLL.RIGHT;
                if (obj3 == kll5) {
                    coordinate3 = f;
                } else {
                    coordinate3 = kll5.getCoordinate();
                }
                Object obj4 = this.LIZ;
                KLL kll6 = KLL.BOTTOM;
                if (obj4 == kll6) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = kll6.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C56237M5h c56237M5h = (C56237M5h) this.LIZJ;
                    c56237M5h.LIZ = (KLL) this.LIZIZ;
                    c56237M5h.LIZIZ = this.LIZ;
                } else {
                    C56237M5h c56237M5h2 = (C56237M5h) this.LIZJ;
                    c56237M5h2.LIZ = (KLL) this.LIZ;
                    c56237M5h2.LIZIZ = this.LIZIZ;
                }
                C56237M5h c56237M5h3 = (C56237M5h) this.LIZJ;
                KLL kll7 = (KLL) c56237M5h3.LIZ;
                KLL kll8 = (KLL) c56237M5h3.LIZIZ;
                kll7.adjustCoordinate(f, f2, rectF, f4, f3);
                kll8.adjustCoordinate(f3);
                if (kll8.isOutsideMargin(rectF, f4)) {
                    kll8.snapToRect(rectF);
                    kll7.adjustCoordinate(f3);
                }
            }
        });
        TOP_RIGHT = kli2;
        final KLL kll4 = KLL.BOTTOM;
        KLI kli3 = new KLI("BOTTOM_LEFT", 2, new AbstractC261710z(kll4, kll2) { // from class: X.KLN
            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                Object obj = this.LIZIZ;
                KLL kll32 = KLL.LEFT;
                if (obj == kll32) {
                    coordinate = f;
                } else {
                    coordinate = kll32.getCoordinate();
                }
                Object obj2 = this.LIZ;
                KLL kll42 = KLL.TOP;
                if (obj2 == kll42) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = kll42.getCoordinate();
                }
                Object obj3 = this.LIZIZ;
                KLL kll5 = KLL.RIGHT;
                if (obj3 == kll5) {
                    coordinate3 = f;
                } else {
                    coordinate3 = kll5.getCoordinate();
                }
                Object obj4 = this.LIZ;
                KLL kll6 = KLL.BOTTOM;
                if (obj4 == kll6) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = kll6.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C56237M5h c56237M5h = (C56237M5h) this.LIZJ;
                    c56237M5h.LIZ = (KLL) this.LIZIZ;
                    c56237M5h.LIZIZ = this.LIZ;
                } else {
                    C56237M5h c56237M5h2 = (C56237M5h) this.LIZJ;
                    c56237M5h2.LIZ = (KLL) this.LIZ;
                    c56237M5h2.LIZIZ = this.LIZIZ;
                }
                C56237M5h c56237M5h3 = (C56237M5h) this.LIZJ;
                KLL kll7 = (KLL) c56237M5h3.LIZ;
                KLL kll8 = (KLL) c56237M5h3.LIZIZ;
                kll7.adjustCoordinate(f, f2, rectF, f4, f3);
                kll8.adjustCoordinate(f3);
                if (kll8.isOutsideMargin(rectF, f4)) {
                    kll8.snapToRect(rectF);
                    kll7.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM_LEFT = kli3;
        KLI kli4 = new KLI("BOTTOM_RIGHT", 3, new AbstractC261710z(kll4, kll3) { // from class: X.KLN
            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                float coordinate;
                float coordinate2;
                float coordinate3;
                float coordinate4;
                Object obj = this.LIZIZ;
                KLL kll32 = KLL.LEFT;
                if (obj == kll32) {
                    coordinate = f;
                } else {
                    coordinate = kll32.getCoordinate();
                }
                Object obj2 = this.LIZ;
                KLL kll42 = KLL.TOP;
                if (obj2 == kll42) {
                    coordinate2 = f2;
                } else {
                    coordinate2 = kll42.getCoordinate();
                }
                Object obj3 = this.LIZIZ;
                KLL kll5 = KLL.RIGHT;
                if (obj3 == kll5) {
                    coordinate3 = f;
                } else {
                    coordinate3 = kll5.getCoordinate();
                }
                Object obj4 = this.LIZ;
                KLL kll6 = KLL.BOTTOM;
                if (obj4 == kll6) {
                    coordinate4 = f2;
                } else {
                    coordinate4 = kll6.getCoordinate();
                }
                if ((coordinate3 - coordinate) / (coordinate4 - coordinate2) > f3) {
                    C56237M5h c56237M5h = (C56237M5h) this.LIZJ;
                    c56237M5h.LIZ = (KLL) this.LIZIZ;
                    c56237M5h.LIZIZ = this.LIZ;
                } else {
                    C56237M5h c56237M5h2 = (C56237M5h) this.LIZJ;
                    c56237M5h2.LIZ = (KLL) this.LIZ;
                    c56237M5h2.LIZIZ = this.LIZIZ;
                }
                C56237M5h c56237M5h3 = (C56237M5h) this.LIZJ;
                KLL kll7 = (KLL) c56237M5h3.LIZ;
                KLL kll8 = (KLL) c56237M5h3.LIZIZ;
                kll7.adjustCoordinate(f, f2, rectF, f4, f3);
                kll8.adjustCoordinate(f3);
                if (kll8.isOutsideMargin(rectF, f4)) {
                    kll8.snapToRect(rectF);
                    kll7.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM_RIGHT = kli4;
        KLI kli5 = new KLI("LEFT", 4, new AbstractC261710z(kll2) { // from class: X.KLM
            public final KLL LIZLLL;

            {
                super(null, kll2);
                this.LIZLLL = kll2;
            }

            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                KLL kll5 = KLL.TOP;
                float coordinate = kll5.getCoordinate();
                KLL kll6 = KLL.BOTTOM;
                float coordinate2 = kll6.getCoordinate();
                float width = ((KLL.getWidth() / f3) - KLL.getHeight()) / 2.0f;
                kll5.setCoordinate(coordinate - width);
                kll6.setCoordinate(coordinate2 + width);
                if (kll5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll5, rectF, f3)) {
                    kll6.offset(-kll5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (kll6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll6, rectF, f3)) {
                    kll5.offset(-kll6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        LEFT = kli5;
        KLI kli6 = new KLI("TOP", 5, new AbstractC261710z(kll) { // from class: X.KLK
            public final KLL LIZLLL;

            {
                super(kll, null);
                this.LIZLLL = kll;
            }

            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                KLL kll5 = KLL.LEFT;
                float coordinate = kll5.getCoordinate();
                KLL kll6 = KLL.RIGHT;
                float coordinate2 = kll6.getCoordinate();
                float height = ((KLL.getHeight() * f3) - KLL.getWidth()) / 2.0f;
                kll5.setCoordinate(coordinate - height);
                kll6.setCoordinate(coordinate2 + height);
                if (kll5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll5, rectF, f3)) {
                    kll6.offset(-kll5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (kll6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll6, rectF, f3)) {
                    kll5.offset(-kll6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        TOP = kli6;
        KLI kli7 = new KLI("RIGHT", 6, new AbstractC261710z(kll3) { // from class: X.KLM
            public final KLL LIZLLL;

            {
                super(null, kll3);
                this.LIZLLL = kll3;
            }

            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                KLL kll5 = KLL.TOP;
                float coordinate = kll5.getCoordinate();
                KLL kll6 = KLL.BOTTOM;
                float coordinate2 = kll6.getCoordinate();
                float width = ((KLL.getWidth() / f3) - KLL.getHeight()) / 2.0f;
                kll5.setCoordinate(coordinate - width);
                kll6.setCoordinate(coordinate2 + width);
                if (kll5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll5, rectF, f3)) {
                    kll6.offset(-kll5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (kll6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll6, rectF, f3)) {
                    kll5.offset(-kll6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        RIGHT = kli7;
        KLI kli8 = new KLI("BOTTOM", 7, new AbstractC261710z(kll4) { // from class: X.KLK
            public final KLL LIZLLL;

            {
                super(kll4, null);
                this.LIZLLL = kll4;
            }

            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                this.LIZLLL.adjustCoordinate(f, f2, rectF, f4, f3);
                KLL kll5 = KLL.LEFT;
                float coordinate = kll5.getCoordinate();
                KLL kll6 = KLL.RIGHT;
                float coordinate2 = kll6.getCoordinate();
                float height = ((KLL.getHeight() * f3) - KLL.getWidth()) / 2.0f;
                kll5.setCoordinate(coordinate - height);
                kll6.setCoordinate(coordinate2 + height);
                if (kll5.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll5, rectF, f3)) {
                    kll6.offset(-kll5.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
                if (kll6.isOutsideMargin(rectF, f4) && !this.LIZLLL.isNewRectangleOutOfBounds(kll6, rectF, f3)) {
                    kll5.offset(-kll6.snapToRect(rectF));
                    this.LIZLLL.adjustCoordinate(f3);
                }
            }
        });
        BOTTOM = kli8;
        KLI kli9 = new KLI("CENTER", 8, new AbstractC261710z() { // from class: X.KLJ
            @Override // X.AbstractC261710z
            public final void LJIIJJI(float f, float f2, RectF rectF, float f3) {
                KLL kll5 = KLL.LEFT;
                float coordinate = kll5.getCoordinate();
                KLL kll6 = KLL.TOP;
                float coordinate2 = kll6.getCoordinate();
                KLL kll7 = KLL.RIGHT;
                float coordinate3 = kll7.getCoordinate();
                KLL kll8 = KLL.BOTTOM;
                float f4 = f - ((coordinate + coordinate3) / 2.0f);
                float coordinate4 = f2 - ((coordinate2 + kll8.getCoordinate()) / 2.0f);
                kll5.offset(f4);
                kll6.offset(coordinate4);
                kll7.offset(f4);
                kll8.offset(coordinate4);
                if (kll5.isOutsideMargin(rectF, f3)) {
                    kll7.offset(kll5.snapToRect(rectF));
                } else if (kll7.isOutsideMargin(rectF, f3)) {
                    kll5.offset(kll7.snapToRect(rectF));
                }
                if (kll6.isOutsideMargin(rectF, f3)) {
                    kll8.offset(kll6.snapToRect(rectF));
                } else {
                    if (!kll8.isOutsideMargin(rectF, f3)) {
                        return;
                    }
                    kll6.offset(kll8.snapToRect(rectF));
                }
            }

            @Override // X.AbstractC261710z
            public final void LJIIJ(float f, float f2, float f3, RectF rectF, float f4) {
                LJIIJJI(f, f2, rectF, f4);
            }
        });
        CENTER = kli9;
        LJLILLLLZI = new KLI[]{kli, kli2, kli3, kli4, kli5, kli6, kli7, kli8, kli9};
    }

    public static KLI[] values() {
        return (KLI[]) LJLILLLLZI.clone();
    }

    public static KLI valueOf(String str) {
        return (KLI) V0N.LJJJ(KLI.class, str);
    }

    public KLI(String str, int i, AbstractC261710z abstractC261710z) {
        this.LJLIL = abstractC261710z;
    }

    public void updateCropWindow(float f, float f2, RectF rectF, float f3) {
        this.LJLIL.LJIIJJI(f, f2, rectF, f3);
    }

    public void updateCropWindow(float f, float f2, float f3, RectF rectF, float f4) {
        this.LJLIL.LJIIJ(f, f2, f3, rectF, f4);
    }
}
