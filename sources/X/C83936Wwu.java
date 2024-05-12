package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83936Wwu<KEY extends Enum<KEY>> implements InterfaceC83820Wv2<KEY> {
    public final java.util.Map<TBW<C83935Wwt, Object>, Object> LIZ;
    public final java.util.Set<TBW<C83935Wwt, Object>> LIZIZ;
    public final boolean LIZJ;

    public C83936Wwu(boolean z) {
        this.LIZJ = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put(new TBT() { // from class: X.WxC
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJL;
                }
            }, C5T3.RATIO_9_TO_16);
            linkedHashMap.put(new TBT() { // from class: X.Wx5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJI;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new TBT() { // from class: X.Wx9
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJI;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new TBT() { // from class: X.Wwv
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLILLLLZI;
                }
            }, new PreviewSize(720, 1280));
            linkedHashMap.put(new TBT() { // from class: X.Wwz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJLL;
                }
            }, EnumC84107Wzf.SCALE_MODE_CENTER_CROP);
        }
        this.LIZ = linkedHashMap;
        this.LIZIZ = new LinkedHashSet();
    }

    @Override // X.InterfaceC83820Wv2
    public final void LIZJ(Integer num) {
        C83955WxD c83955WxD = new TBT() { // from class: X.WxD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLIL;
            }
        };
        if (num == null) {
            return;
        }
        this.LIZ.put(c83955WxD, num);
    }

    public final void LJI(Object obj) {
        if (obj != null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value could be null only when useDefaultParams is false, yet it is ");
        LIZ.append(this.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final Object LJII(TBT unaryPlus) {
        o.LJIIIZ(unaryPlus, "$this$unaryPlus");
        return LJFF(unaryPlus, null, null);
    }

    @Override // X.InterfaceC83820Wv2
    public final void LIZ(int i, int i2) {
        this.LIZ.put(new TBT() { // from class: X.Wx2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJI;
            }
        }, new PreviewSize(i, i2));
    }

    @Override // X.InterfaceC83820Wv2
    public final void LIZIZ(int i, int i2) {
        this.LIZ.put(new TBT() { // from class: X.Wx6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJJI;
            }
        }, new PreviewSize(i, i2));
    }

    @Override // X.InterfaceC83820Wv2
    public final void LIZLLL(int i, int i2) {
        this.LIZ.put(new TBT() { // from class: X.Www
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLILLLLZI;
            }
        }, new PreviewSize(i, i2));
    }

    public final C83935Wwt LJ(C83935Wwt c83935Wwt, C83935Wwt c83935Wwt2, java.util.Set<? extends TBW<C83935Wwt, ? extends Object>> set) {
        if (c83935Wwt != null) {
            PreviewSize outputSize = (PreviewSize) LJFF(new TBT() { // from class: X.Wwx
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLILLLLZI;
                }
            }, c83935Wwt2, set);
            if (outputSize == null) {
                outputSize = c83935Wwt.LJLILLLLZI;
            }
            PreviewSize previewSize = (PreviewSize) LJFF(new TBT() { // from class: X.Wx4
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJI;
                }
            }, c83935Wwt2, set);
            if (previewSize == null) {
                previewSize = c83935Wwt.LJLJI;
            }
            PreviewSize renderSize = (PreviewSize) LJFF(new TBT() { // from class: X.Wx8
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJI;
                }
            }, c83935Wwt2, set);
            if (renderSize == null) {
                renderSize = c83935Wwt.LJLJJI;
            }
            C5T3 previewRatio = (C5T3) LJFF(new TBT() { // from class: X.WxB
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJL;
                }
            }, c83935Wwt2, set);
            if (previewRatio == null) {
                previewRatio = c83935Wwt.LJLJJL;
            }
            EnumC84107Wzf fitMode = (EnumC84107Wzf) LJFF(new TBT() { // from class: X.Wx1
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJJLL;
                }
            }, c83935Wwt2, set);
            if (fitMode == null) {
                fitMode = c83935Wwt.LJLJJLL;
            }
            Integer num = (Integer) LJFF(new TBT() { // from class: X.WxF
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLIL;
                }
            }, c83935Wwt2, set);
            if (num == null) {
                num = c83935Wwt.LJLIL;
            }
            Integer num2 = (Integer) LJFF(new TBT() { // from class: X.Wwa
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJL;
                }
            }, c83935Wwt2, set);
            if (num2 == null) {
                num2 = c83935Wwt.LJLJL;
            }
            Integer num3 = (Integer) LJFF(new TBT() { // from class: X.Wwd
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C83935Wwt) obj).LJLJLJ;
                }
            }, c83935Wwt2, set);
            if (num3 == null) {
                num3 = c83935Wwt.LJLJLJ;
            }
            Boolean bool = c83935Wwt.LJLJLLL;
            Float f = c83935Wwt.LJLL;
            Integer num4 = c83935Wwt.LJLLI;
            o.LJIIIZ(outputSize, "outputSize");
            o.LJIIIZ(previewSize, "previewSize");
            o.LJIIIZ(renderSize, "renderSize");
            o.LJIIIZ(previewRatio, "previewRatio");
            o.LJIIIZ(fitMode, "fitMode");
            return new C83935Wwt(num, outputSize, previewSize, renderSize, previewRatio, fitMode, num2, num3, bool, f, num4);
        }
        Object LJII = LJII(new TBT() { // from class: X.Wwy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLILLLLZI;
            }
        });
        LJI(LJII);
        Object LJII2 = LJII(new TBT() { // from class: X.Wx3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJI;
            }
        });
        LJI(LJII2);
        Object LJII3 = LJII(new TBT() { // from class: X.Wx7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJJI;
            }
        });
        LJI(LJII3);
        Object LJII4 = LJII(new TBT() { // from class: X.WxA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJJL;
            }
        });
        LJI(LJII4);
        Object LJII5 = LJII(new TBT() { // from class: X.Wx0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJJLL;
            }
        });
        LJI(LJII5);
        return new C83935Wwt((Integer) LJII(new TBT() { // from class: X.WxE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLIL;
            }
        }), (PreviewSize) LJII, (PreviewSize) LJII2, (PreviewSize) LJII3, (C5T3) LJII4, (EnumC84107Wzf) LJII5, (Integer) LJII(new TBT() { // from class: X.WwZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJL;
            }
        }), (Integer) LJII(new TBT() { // from class: X.Wwc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C83935Wwt) obj).LJLJLJ;
            }
        }), null, null, null);
    }

    public final Object LJFF(TBT get, C83935Wwt c83935Wwt, java.util.Set set) {
        Object obj;
        o.LJIIIZ(get, "$this$get");
        if (c83935Wwt != null) {
            if (set != null && set.contains(get)) {
                obj = get.get(c83935Wwt);
            } else {
                obj = null;
            }
        } else {
            obj = ((LinkedHashMap) this.LIZ).get(get);
        }
        if (!(obj instanceof Object)) {
            return null;
        }
        return obj;
    }
}
