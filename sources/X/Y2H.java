package X;

import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationsEndEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationsStartEvent;
import defpackage.b0;
import defpackage.s0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2H implements InterfaceC86733Y2f {
    public final InterfaceC65784Pro<Long> LIZ;
    public Long LIZIZ;
    public final Y2J LIZJ;

    public final int LIZLLL() {
        Long l = this.LIZIZ;
        if (l != null) {
            return (int) (this.LIZ.invoke().longValue() - l.longValue());
        }
        return 0;
    }

    @Override // X.InterfaceC86733Y2f
    public final void onStart() {
        this.LIZIZ = this.LIZ.invoke();
        Y2G.LIZLLL(ClaPerfTranslationsStartEvent.class, this.LIZJ);
    }

    @Override // X.InterfaceC86733Y2f
    public final void LIZ(ILV result) {
        o.LJIIIZ(result, "result");
        if (this.LIZIZ != null) {
            this.LIZJ.LIZIZ(new C60082Xk(result.getValue(), LIZLLL()));
            Y2G.LIZLLL(ClaPerfTranslationsEndEvent.class, this.LIZJ);
        }
    }

    public Y2H(C75012wz c75012wz, ELH elh, IF2 getTimeInMs) {
        o.LJIIIZ(getTimeInMs, "getTimeInMs");
        this.LIZ = getTimeInMs;
        Y2J y2j = new Y2J();
        y2j.LIZIZ(c75012wz);
        y2j.LIZIZ(elh);
        this.LIZJ = y2j;
    }

    @Override // X.InterfaceC86733Y2f
    public final void LIZIZ(Y2V element, Y2L elementStatus, final String str, final Integer num) {
        o.LJIIIZ(element, "element");
        o.LJIIIZ(elementStatus, "elementStatus");
        int i = Y2W.LIZ[element.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    Y2J y2j = this.LIZJ;
                    final int value = elementStatus.getValue();
                    y2j.LIZIZ(new InterfaceC60152Xr(str, value, num) { // from class: X.2Xp
                        public final String LJLIL;
                        public final int LJLILLLLZI;
                        public final Integer LJLJI;

                        @Override // X.InterfaceC54035LIp
                        public final boolean LLD() {
                            return true;
                        }

                        @Override // X.InterfaceC54035LIp
                        public final java.util.Map<String, Object> LLLILZ() {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("sticker_original_language", this.LJLIL);
                            linkedHashMap.put("sticker_stat", Integer.valueOf(this.LJLILLLLZI));
                            linkedHashMap.put("sticker_original_size", this.LJLJI);
                            return linkedHashMap;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C60132Xp)) {
                                return false;
                            }
                            C60132Xp c60132Xp = (C60132Xp) obj;
                            return o.LJ(this.LJLIL, c60132Xp.LJLIL) && this.LJLILLLLZI == c60132Xp.LJLILLLLZI && o.LJ(this.LJLJI, c60132Xp.LJLJI);
                        }

                        public final int hashCode() {
                            String str2 = this.LJLIL;
                            int hashCode = (((str2 == null ? 0 : str2.hashCode()) * 31) + this.LJLILLLLZI) * 31;
                            Integer num2 = this.LJLJI;
                            return hashCode + (num2 != null ? num2.hashCode() : 0);
                        }

                        @Override // X.InterfaceC54035LIp
                        public final java.util.Map<String, Object> LLJZ() {
                            return LLLILZ();
                        }

                        @Override // X.InterfaceC54035LIp
                        public final java.util.Map<String, Object> LLLLIL() {
                            return C113554cx.LJJJLIIL();
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("PerfStickerTranslationStartParams(originalLang=");
                            LIZ.append(this.LJLIL);
                            LIZ.append(", status=");
                            LIZ.append(this.LJLILLLLZI);
                            LIZ.append(", originalSize=");
                            return s0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
                        }

                        {
                            this.LJLIL = str;
                            this.LJLILLLLZI = value;
                            this.LJLJI = num;
                        }
                    });
                    return;
                }
                Y2J y2j2 = this.LIZJ;
                final int value2 = elementStatus.getValue();
                y2j2.LIZIZ(new InterfaceC60152Xr(str, value2, num) { // from class: X.2Xo
                    public final String LJLIL;
                    public final int LJLILLLLZI;
                    public final Integer LJLJI;

                    @Override // X.InterfaceC54035LIp
                    public final boolean LLD() {
                        return true;
                    }

                    @Override // X.InterfaceC54035LIp
                    public final java.util.Map<String, Object> LLLILZ() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("desc_original_language", this.LJLIL);
                        linkedHashMap.put("desc_stat", Integer.valueOf(this.LJLILLLLZI));
                        linkedHashMap.put("desc_original_size", this.LJLJI);
                        return linkedHashMap;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C60122Xo)) {
                            return false;
                        }
                        C60122Xo c60122Xo = (C60122Xo) obj;
                        return o.LJ(this.LJLIL, c60122Xo.LJLIL) && this.LJLILLLLZI == c60122Xo.LJLILLLLZI && o.LJ(this.LJLJI, c60122Xo.LJLJI);
                    }

                    public final int hashCode() {
                        String str2 = this.LJLIL;
                        int hashCode = (((str2 == null ? 0 : str2.hashCode()) * 31) + this.LJLILLLLZI) * 31;
                        Integer num2 = this.LJLJI;
                        return hashCode + (num2 != null ? num2.hashCode() : 0);
                    }

                    @Override // X.InterfaceC54035LIp
                    public final java.util.Map<String, Object> LLJZ() {
                        return LLLILZ();
                    }

                    @Override // X.InterfaceC54035LIp
                    public final java.util.Map<String, Object> LLLLIL() {
                        return C113554cx.LJJJLIIL();
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("PerfDescTranslationStartParams(originalLang=");
                        LIZ.append(this.LJLIL);
                        LIZ.append(", status=");
                        LIZ.append(this.LJLILLLLZI);
                        LIZ.append(", originalSize=");
                        return s0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
                    }

                    {
                        this.LJLIL = str;
                        this.LJLILLLLZI = value2;
                        this.LJLJI = num;
                    }
                });
                return;
            }
            Y2J y2j3 = this.LIZJ;
            final int value3 = elementStatus.getValue();
            y2j3.LIZIZ(new InterfaceC60152Xr(str, value3) { // from class: X.2Xi
                public final String LJLIL;
                public final int LJLILLLLZI;

                @Override // X.InterfaceC54035LIp
                public final boolean LLD() {
                    return true;
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLILZ() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("caption_original_language", this.LJLIL);
                    linkedHashMap.put("offline_caption_stat", Integer.valueOf(this.LJLILLLLZI));
                    return linkedHashMap;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C60062Xi)) {
                        return false;
                    }
                    C60062Xi c60062Xi = (C60062Xi) obj;
                    return o.LJ(this.LJLIL, c60062Xi.LJLIL) && this.LJLILLLLZI == c60062Xi.LJLILLLLZI;
                }

                public final int hashCode() {
                    String str2 = this.LJLIL;
                    return ((str2 == null ? 0 : str2.hashCode()) * 31) + this.LJLILLLLZI;
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLJZ() {
                    return LLLILZ();
                }

                @Override // X.InterfaceC54035LIp
                public final java.util.Map<String, Object> LLLLIL() {
                    return C113554cx.LJJJLIIL();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PerfOfflineCaptionTranslationStartParams(originalLang=");
                    LIZ.append(this.LJLIL);
                    LIZ.append(", status=");
                    return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
                }

                {
                    this.LJLIL = str;
                    this.LJLILLLLZI = value3;
                }
            });
            return;
        }
        Y2J y2j4 = this.LIZJ;
        final int value4 = elementStatus.getValue();
        y2j4.LIZIZ(new InterfaceC60152Xr(str, value4) { // from class: X.2Xj
            public final String LJLIL;
            public final int LJLILLLLZI;

            @Override // X.InterfaceC54035LIp
            public final boolean LLD() {
                return true;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLILZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("caption_original_language", this.LJLIL);
                linkedHashMap.put("realtime_caption_stat", Integer.valueOf(this.LJLILLLLZI));
                return linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C60072Xj)) {
                    return false;
                }
                C60072Xj c60072Xj = (C60072Xj) obj;
                return o.LJ(this.LJLIL, c60072Xj.LJLIL) && this.LJLILLLLZI == c60072Xj.LJLILLLLZI;
            }

            public final int hashCode() {
                String str2 = this.LJLIL;
                return ((str2 == null ? 0 : str2.hashCode()) * 31) + this.LJLILLLLZI;
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLJZ() {
                return LLLILZ();
            }

            @Override // X.InterfaceC54035LIp
            public final java.util.Map<String, Object> LLLLIL() {
                return C113554cx.LJJJLIIL();
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PerfRTCaptionTranslationStartParams(originalLang=");
                LIZ.append(this.LJLIL);
                LIZ.append(", status=");
                return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
            }

            {
                this.LJLIL = str;
                this.LJLILLLLZI = value4;
            }
        });
    }

    @Override // X.InterfaceC86733Y2f
    public final void LIZJ(Y2V element, boolean z, boolean z2, Integer num, String str) {
        o.LJIIIZ(element, "element");
        int i = Y2W.LIZ[element.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                Y2J y2j = this.LIZJ;
                if (z) {
                    i2 = 1;
                }
                y2j.LIZIZ(new E3E(str, num, Integer.valueOf(i2), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(LIZLLL())));
                return;
            }
            Y2J y2j2 = this.LIZJ;
            if (z) {
                i2 = 1;
            }
            y2j2.LIZIZ(new E3C(str, num, Integer.valueOf(i2), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(LIZLLL())));
            return;
        }
        Y2J y2j3 = this.LIZJ;
        if (z) {
            i2 = 1;
        }
        y2j3.LIZIZ(new E3D(str, num, Integer.valueOf(i2), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(LIZLLL())));
    }
}
