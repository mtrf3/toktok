package X;

import android.graphics.RectF;

/* loaded from: classes9.dex */
public enum KLL {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;

    public static final int MIN_CROP_LENGTH_PX = C17N.LJIILL(72.0d);
    public float LJLIL;

    public static float getHeight() {
        return BOTTOM.getCoordinate() - TOP.getCoordinate();
    }

    public static float getWidth() {
        return RIGHT.getCoordinate() - LEFT.getCoordinate();
    }

    public float getCoordinate() {
        return this.LJLIL;
    }

    public static KLL valueOf(String str) {
        return (KLL) V0N.LJJJ(KLL.class, str);
    }

    public void adjustCoordinate(float f) {
        float coordinate = LEFT.getCoordinate();
        float coordinate2 = TOP.getCoordinate();
        float coordinate3 = RIGHT.getCoordinate();
        float coordinate4 = BOTTOM.getCoordinate();
        int i = KLO.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJLIL = C1I0.LIZ(coordinate3, coordinate, f, coordinate2);
                    return;
                }
                this.LJLIL = C06420Na.LIZIZ(coordinate4, coordinate2, f, coordinate);
                return;
            }
            this.LJLIL = coordinate4 - ((coordinate3 - coordinate) / f);
            return;
        }
        this.LJLIL = coordinate3 - ((coordinate4 - coordinate2) * f);
    }

    public void offset(float f) {
        this.LJLIL += f;
    }

    public void setCoordinate(float f) {
        this.LJLIL = f;
    }

    public float snapOffset(RectF rectF) {
        float f;
        float f2 = this.LJLIL;
        int i = KLO.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    f = rectF.bottom;
                } else {
                    f = rectF.right;
                }
            } else {
                f = rectF.top;
            }
        } else {
            f = rectF.left;
        }
        return f - f2;
    }

    public float snapToRect(RectF rectF) {
        float f = this.LJLIL;
        int i = KLO.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LJLIL = rectF.bottom;
                    }
                } else {
                    this.LJLIL = rectF.right;
                }
            } else {
                this.LJLIL = rectF.top;
            }
        } else {
            this.LJLIL = rectF.left;
        }
        return this.LJLIL - f;
    }

    public boolean isOutsideMargin(RectF rectF, float f) {
        int i = KLO.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (rectF.bottom - this.LJLIL >= f) {
                        return false;
                    }
                } else if (rectF.right - this.LJLIL >= f) {
                    return false;
                }
            } else if (this.LJLIL - rectF.top >= f) {
                return false;
            }
        } else if (this.LJLIL - rectF.left >= f) {
            return false;
        }
        return true;
    }

    public boolean isNewRectangleOutOfBounds(KLL kll, RectF rectF, float f) {
        float snapOffset = kll.snapOffset(rectF);
        int i = KLO.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        KLL kll2 = LEFT;
                        if (kll.equals(kll2)) {
                            float f2 = rectF.left;
                            float coordinate = RIGHT.getCoordinate() - snapOffset;
                            float coordinate2 = TOP.getCoordinate();
                            return LIZJ(coordinate2, f2, ((coordinate - f2) / f) + coordinate2, rectF, coordinate);
                        }
                        if (kll.equals(RIGHT)) {
                            float f3 = rectF.right;
                            float coordinate3 = kll2.getCoordinate() - snapOffset;
                            float coordinate4 = TOP.getCoordinate();
                            return LIZJ(coordinate4, coordinate3, ((f3 - coordinate3) / f) + coordinate4, rectF, f3);
                        }
                    }
                } else {
                    KLL kll3 = TOP;
                    if (kll.equals(kll3)) {
                        float f4 = rectF.top;
                        float coordinate5 = BOTTOM.getCoordinate() - snapOffset;
                        float coordinate6 = LEFT.getCoordinate();
                        return LIZJ(f4, coordinate6, coordinate5, rectF, ((coordinate5 - f4) * f) + coordinate6);
                    }
                    if (kll.equals(BOTTOM)) {
                        float f5 = rectF.bottom;
                        float coordinate7 = kll3.getCoordinate() - snapOffset;
                        float coordinate8 = LEFT.getCoordinate();
                        return LIZJ(coordinate7, coordinate8, f5, rectF, ((f5 - coordinate7) * f) + coordinate8);
                    }
                }
            } else {
                KLL kll4 = LEFT;
                if (kll.equals(kll4)) {
                    float f6 = rectF.left;
                    float coordinate9 = RIGHT.getCoordinate() - snapOffset;
                    float coordinate10 = BOTTOM.getCoordinate();
                    return LIZJ(coordinate10 - ((coordinate9 - f6) / f), f6, coordinate10, rectF, coordinate9);
                }
                if (kll.equals(RIGHT)) {
                    float f7 = rectF.right;
                    float coordinate11 = kll4.getCoordinate() - snapOffset;
                    float coordinate12 = BOTTOM.getCoordinate();
                    return LIZJ(coordinate12 - ((f7 - coordinate11) / f), coordinate11, coordinate12, rectF, f7);
                }
            }
        } else {
            KLL kll5 = TOP;
            if (kll.equals(kll5)) {
                float f8 = rectF.top;
                float coordinate13 = BOTTOM.getCoordinate() - snapOffset;
                float coordinate14 = RIGHT.getCoordinate();
                return LIZJ(f8, coordinate14 - ((coordinate13 - f8) * f), coordinate13, rectF, coordinate14);
            }
            if (kll.equals(BOTTOM)) {
                float f9 = rectF.bottom;
                float coordinate15 = kll5.getCoordinate() - snapOffset;
                float coordinate16 = RIGHT.getCoordinate();
                return LIZJ(coordinate15, coordinate16 - ((f9 - coordinate15) * f), f9, rectF, coordinate16);
            }
        }
        return true;
    }

    public static boolean LIZJ(float f, float f2, float f3, RectF rectF, float f4) {
        if (f < rectF.top || f2 < rectF.left || f3 > rectF.bottom || f4 > rectF.right) {
            return true;
        }
        return false;
    }

    public void adjustCoordinate(float f, float f2, RectF rectF, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        int i = KLO.LIZ[ordinal()];
        float f9 = Float.POSITIVE_INFINITY;
        if (i != 1) {
            if (i != 2) {
                float f10 = Float.NEGATIVE_INFINITY;
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    float f11 = rectF.bottom;
                    if (f11 - f2 >= f3) {
                        KLL kll = TOP;
                        float coordinate = kll.getCoordinate();
                        float f12 = MIN_CROP_LENGTH_PX;
                        if (f2 <= coordinate + f12) {
                            f8 = kll.getCoordinate() + f12;
                        } else {
                            f8 = Float.NEGATIVE_INFINITY;
                        }
                        if ((f2 - kll.getCoordinate()) * f4 <= f12) {
                            f10 = (f12 / f4) + kll.getCoordinate();
                        }
                        f11 = Math.max(f2, Math.max(f10, f8));
                    }
                    this.LJLIL = f11;
                    return;
                }
                float f13 = rectF.right;
                if (f13 - f >= f3) {
                    KLL kll2 = LEFT;
                    float coordinate2 = kll2.getCoordinate();
                    float f14 = MIN_CROP_LENGTH_PX;
                    if (f <= coordinate2 + f14) {
                        f7 = kll2.getCoordinate() + f14;
                    } else {
                        f7 = Float.NEGATIVE_INFINITY;
                    }
                    if ((f - kll2.getCoordinate()) / f4 <= f14) {
                        f10 = (f14 * f4) + kll2.getCoordinate();
                    }
                    f13 = Math.max(f, Math.max(f7, f10));
                }
                this.LJLIL = f13;
                return;
            }
            float f15 = rectF.top;
            if (f2 - f15 >= f3) {
                KLL kll3 = BOTTOM;
                float coordinate3 = kll3.getCoordinate();
                float f16 = MIN_CROP_LENGTH_PX;
                if (f2 >= coordinate3 - f16) {
                    f6 = kll3.getCoordinate() - f16;
                } else {
                    f6 = Float.POSITIVE_INFINITY;
                }
                if ((kll3.getCoordinate() - f2) * f4 <= f16) {
                    f9 = kll3.getCoordinate() - (f16 / f4);
                }
                f15 = Math.min(f2, Math.min(f6, f9));
            }
            this.LJLIL = f15;
            return;
        }
        float f17 = rectF.left;
        if (f - f17 >= f3) {
            KLL kll4 = RIGHT;
            float coordinate4 = kll4.getCoordinate();
            float f18 = MIN_CROP_LENGTH_PX;
            if (f >= coordinate4 - f18) {
                f5 = kll4.getCoordinate() - f18;
            } else {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((kll4.getCoordinate() - f) / f4 <= f18) {
                f9 = kll4.getCoordinate() - (f18 * f4);
            }
            f17 = Math.min(f, Math.min(f5, f9));
        }
        this.LJLIL = f17;
    }
}
