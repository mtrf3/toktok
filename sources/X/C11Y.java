package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;

/* renamed from: X.11Y, reason: invalid class name */
/* loaded from: classes.dex */
public class C11Y {
    public static final C11Y LIZIZ = new C11Y();
    public static final String[] LIZJ = {"standard", "accelerate", "decelerate", "linear"};
    public String LIZ = "identity";

    public double LIZ(double d) {
        return d;
    }

    public double LIZIZ(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.LIZ;
    }

    public static C11Y LIZJ(final String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C11Y(str) { // from class: X.1dd
                public final double LIZLLL;
                public final double LJ;
                public final double LJFF;
                public final double LJI;

                {
                    this.LIZ = str;
                    int indexOf = str.indexOf(40);
                    int indexOf2 = str.indexOf(44, indexOf);
                    this.LIZLLL = CastDoubleProtector.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                    int i = indexOf2 + 1;
                    int indexOf3 = str.indexOf(44, i);
                    this.LJ = CastDoubleProtector.parseDouble(str.substring(i, indexOf3).trim());
                    int i2 = indexOf3 + 1;
                    int indexOf4 = str.indexOf(44, i2);
                    this.LJFF = CastDoubleProtector.parseDouble(str.substring(i2, indexOf4).trim());
                    int i3 = indexOf4 + 1;
                    this.LJI = CastDoubleProtector.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                }

                @Override // X.C11Y
                public final double LIZ(double d) {
                    if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    if (d >= 1.0d) {
                        return 1.0d;
                    }
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    do {
                        d2 *= 0.5d;
                        if (LIZLLL(d3) < d) {
                            d3 += d2;
                        } else {
                            d3 -= d2;
                        }
                    } while (d2 > 0.01d);
                    double d4 = d3 - d2;
                    double LIZLLL = LIZLLL(d4);
                    double d5 = d3 + d2;
                    double LIZLLL2 = LIZLLL(d5);
                    double LJ = LJ(d4);
                    return (((d - LIZLLL) * (LJ(d5) - LJ)) / (LIZLLL2 - LIZLLL)) + LJ;
                }

                @Override // X.C11Y
                public final double LIZIZ(double d) {
                    double d2 = 0.5d;
                    double d3 = 0.5d;
                    do {
                        d2 *= 0.5d;
                        if (LIZLLL(d3) < d) {
                            d3 += d2;
                        } else {
                            d3 -= d2;
                        }
                    } while (d2 > 1.0E-4d);
                    double d4 = d3 - d2;
                    double LIZLLL = LIZLLL(d4);
                    double d5 = d3 + d2;
                    double LIZLLL2 = LIZLLL(d5);
                    return (LJ(d5) - LJ(d4)) / (LIZLLL2 - LIZLLL);
                }

                public final double LIZLLL(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.LJFF * d3 * d * d) + (this.LIZLLL * d2 * d3 * d) + (d * d * d);
                }

                public final double LJ(double d) {
                    double d2 = 1.0d - d;
                    double d3 = 3.0d * d2;
                    return (this.LJI * d3 * d * d) + (this.LJ * d2 * d3 * d) + (d * d * d);
                }
            };
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    final String str2 = "cubic(0.4, 0.05, 0.8, 0.7)";
                    return new C11Y(str2) { // from class: X.1dd
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str2;
                            int indexOf = str2.indexOf(40);
                            int indexOf2 = str2.indexOf(44, indexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str2.substring(indexOf + 1, indexOf2).trim());
                            int i = indexOf2 + 1;
                            int indexOf3 = str2.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str2.substring(i, indexOf3).trim());
                            int i2 = indexOf3 + 1;
                            int indexOf4 = str2.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str2.substring(i2, indexOf4).trim());
                            int i3 = indexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str2.substring(i3, str2.indexOf(41, i3)).trim());
                        }

                        @Override // X.C11Y
                        public final double LIZ(double d) {
                            if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            double LJ = LJ(d4);
                            return (((d - LIZLLL) * (LJ(d5) - LJ)) / (LIZLLL2 - LIZLLL)) + LJ;
                        }

                        @Override // X.C11Y
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (LIZLLL2 - LIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJFF * d3 * d * d) + (this.LIZLLL * d2 * d3 * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJI * d3 * d * d) + (this.LJ * d2 * d3 * d) + (d * d * d);
                        }
                    };
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    final String str3 = "cubic(0.0, 0.0, 0.2, 0.95)";
                    return new C11Y(str3) { // from class: X.1dd
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str3;
                            int indexOf = str3.indexOf(40);
                            int indexOf2 = str3.indexOf(44, indexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str3.substring(indexOf + 1, indexOf2).trim());
                            int i = indexOf2 + 1;
                            int indexOf3 = str3.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str3.substring(i, indexOf3).trim());
                            int i2 = indexOf3 + 1;
                            int indexOf4 = str3.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str3.substring(i2, indexOf4).trim());
                            int i3 = indexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str3.substring(i3, str3.indexOf(41, i3)).trim());
                        }

                        @Override // X.C11Y
                        public final double LIZ(double d) {
                            if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            double LJ = LJ(d4);
                            return (((d - LIZLLL) * (LJ(d5) - LJ)) / (LIZLLL2 - LIZLLL)) + LJ;
                        }

                        @Override // X.C11Y
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (LIZLLL2 - LIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJFF * d3 * d * d) + (this.LIZLLL * d2 * d3 * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJI * d3 * d * d) + (this.LJ * d2 * d3 * d) + (d * d * d);
                        }
                    };
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    final String str4 = "cubic(1, 1, 0, 0)";
                    return new C11Y(str4) { // from class: X.1dd
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str4;
                            int indexOf = str4.indexOf(40);
                            int indexOf2 = str4.indexOf(44, indexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str4.substring(indexOf + 1, indexOf2).trim());
                            int i = indexOf2 + 1;
                            int indexOf3 = str4.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str4.substring(i, indexOf3).trim());
                            int i2 = indexOf3 + 1;
                            int indexOf4 = str4.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str4.substring(i2, indexOf4).trim());
                            int i3 = indexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str4.substring(i3, str4.indexOf(41, i3)).trim());
                        }

                        @Override // X.C11Y
                        public final double LIZ(double d) {
                            if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            double LJ = LJ(d4);
                            return (((d - LIZLLL) * (LJ(d5) - LJ)) / (LIZLLL2 - LIZLLL)) + LJ;
                        }

                        @Override // X.C11Y
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (LIZLLL2 - LIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJFF * d3 * d * d) + (this.LIZLLL * d2 * d3 * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJI * d3 * d * d) + (this.LJ * d2 * d3 * d) + (d * d * d);
                        }
                    };
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    final String str5 = "cubic(0.4, 0.0, 0.2, 1)";
                    return new C11Y(str5) { // from class: X.1dd
                        public final double LIZLLL;
                        public final double LJ;
                        public final double LJFF;
                        public final double LJI;

                        {
                            this.LIZ = str5;
                            int indexOf = str5.indexOf(40);
                            int indexOf2 = str5.indexOf(44, indexOf);
                            this.LIZLLL = CastDoubleProtector.parseDouble(str5.substring(indexOf + 1, indexOf2).trim());
                            int i = indexOf2 + 1;
                            int indexOf3 = str5.indexOf(44, i);
                            this.LJ = CastDoubleProtector.parseDouble(str5.substring(i, indexOf3).trim());
                            int i2 = indexOf3 + 1;
                            int indexOf4 = str5.indexOf(44, i2);
                            this.LJFF = CastDoubleProtector.parseDouble(str5.substring(i2, indexOf4).trim());
                            int i3 = indexOf4 + 1;
                            this.LJI = CastDoubleProtector.parseDouble(str5.substring(i3, str5.indexOf(41, i3)).trim());
                        }

                        @Override // X.C11Y
                        public final double LIZ(double d) {
                            if (d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                            }
                            if (d >= 1.0d) {
                                return 1.0d;
                            }
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 0.01d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            double LJ = LJ(d4);
                            return (((d - LIZLLL) * (LJ(d5) - LJ)) / (LIZLLL2 - LIZLLL)) + LJ;
                        }

                        @Override // X.C11Y
                        public final double LIZIZ(double d) {
                            double d2 = 0.5d;
                            double d3 = 0.5d;
                            do {
                                d2 *= 0.5d;
                                if (LIZLLL(d3) < d) {
                                    d3 += d2;
                                } else {
                                    d3 -= d2;
                                }
                            } while (d2 > 1.0E-4d);
                            double d4 = d3 - d2;
                            double LIZLLL = LIZLLL(d4);
                            double d5 = d3 + d2;
                            double LIZLLL2 = LIZLLL(d5);
                            return (LJ(d5) - LJ(d4)) / (LIZLLL2 - LIZLLL);
                        }

                        public final double LIZLLL(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJFF * d3 * d * d) + (this.LIZLLL * d2 * d3 * d) + (d * d * d);
                        }

                        public final double LJ(double d) {
                            double d2 = 1.0d - d;
                            double d3 = 3.0d * d2;
                            return (this.LJI * d3 * d * d) + (this.LJ * d2 * d3 * d) + (d * d * d);
                        }
                    };
                }
                break;
        }
        return LIZIZ;
    }
}
