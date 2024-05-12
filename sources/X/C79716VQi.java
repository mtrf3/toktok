package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.VQi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79716VQi {
    public float LIZ;
    public float LIZIZ;
    public final LinkedHashMap<String, Float> LIZJ;

    public final float LIZ() {
        Float f = this.LIZJ.get("rotate");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZIZ() {
        Float f = this.LIZJ.get("rotateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZJ() {
        Float f = this.LIZJ.get("rotateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZLLL() {
        Float f = this.LIZJ.get("scaleX");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJ() {
        Float f = this.LIZJ.get("scaleY");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJFF() {
        Float f = this.LIZJ.get("translateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJI() {
        Float f = this.LIZJ.get("translateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJII() {
        Float f = this.LIZJ.get("translateZ");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public C79716VQi() {
        LinkedHashMap<String, Float> linkedHashMap = new LinkedHashMap<>();
        this.LIZJ = linkedHashMap;
        linkedHashMap.clear();
    }

    public static C79716VQi LJIIIIZZ(List list, int i, int i2) {
        float f;
        C79716VQi c79716VQi = new C79716VQi();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VQ4 vq4 = (VQ4) it.next();
                int i3 = vq4.LIZ;
                boolean z = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 8) {
                                if (i3 != 16) {
                                    if (i3 != 32) {
                                        if (i3 != 64) {
                                            if (i3 != 128) {
                                                if (i3 != 256) {
                                                    if (i3 != 512) {
                                                        if (i3 != 1024) {
                                                            if (i3 != 2048) {
                                                                return null;
                                                            }
                                                            c79716VQi.LIZJ.put("scaleY", Float.valueOf(vq4.LIZIZ));
                                                        } else {
                                                            c79716VQi.LIZJ.put("scaleX", Float.valueOf(vq4.LIZIZ));
                                                        }
                                                    } else {
                                                        c79716VQi.LIZJ.put("scaleX", Float.valueOf(vq4.LIZIZ));
                                                        c79716VQi.LIZJ.put("scaleY", Float.valueOf(vq4.LIZLLL));
                                                    }
                                                }
                                            } else {
                                                c79716VQi.LIZJ.put("rotateY", Float.valueOf(vq4.LIZIZ));
                                            }
                                        } else {
                                            c79716VQi.LIZJ.put("rotateX", Float.valueOf(vq4.LIZIZ));
                                        }
                                    }
                                    c79716VQi.LIZJ.put("rotate", Float.valueOf(vq4.LIZIZ));
                                }
                            } else {
                                c79716VQi.LIZJ.put("translateZ", Float.valueOf(vq4.LIZIZ));
                            }
                        } else {
                            boolean LIZIZ = vq4.LIZIZ();
                            float f2 = vq4.LIZIZ;
                            if (LIZIZ) {
                                f2 = Math.round(f2 * i2);
                            }
                            c79716VQi.LIZJ.put("translateY", Float.valueOf(f2));
                        }
                    } else {
                        boolean LIZIZ2 = vq4.LIZIZ();
                        float f3 = vq4.LIZIZ;
                        if (LIZIZ2) {
                            f3 = Math.round(f3 * i);
                        }
                        c79716VQi.LIZJ.put("translateX", Float.valueOf(f3));
                    }
                }
                if (vq4.LIZIZ()) {
                    f = Math.round(vq4.LIZIZ * i);
                } else {
                    f = vq4.LIZIZ;
                }
                c79716VQi.LIZJ.put("translateX", Float.valueOf(f));
                if (vq4.LJ != 1) {
                    z = false;
                }
                float f4 = vq4.LIZLLL;
                if (z) {
                    f4 = Math.round(f4 * i2);
                }
                c79716VQi.LIZJ.put("translateY", Float.valueOf(f4));
                c79716VQi.LIZJ.put("translateZ", Float.valueOf(vq4.LJFF));
            }
        }
        return c79716VQi;
    }
}
