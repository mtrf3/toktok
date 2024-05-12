package X;

import X.YJB;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.YIv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87165YIv<FieldDescriptorType extends YJB<FieldDescriptorType>> {
    public static final C87165YIv LIZLLL = new C87165YIv(0);
    public final C79556VKe LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ() {
        for (int i = 0; i < this.LIZ.LIZLLL(); i++) {
            if (!LJI(this.LIZ.LJIIIIZZ(i))) {
                return false;
            }
        }
        Iterator it = this.LIZ.LJ().iterator();
        while (it.hasNext()) {
            if (!LJI((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> LIZIZ() {
        if (this.LIZJ) {
            return new XG5(((VKX) this.LIZ.entrySet()).iterator());
        }
        return ((VKX) this.LIZ.entrySet()).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        C87165YIv c87165YIv = new C87165YIv();
        for (int i = 0; i < this.LIZ.LIZLLL(); i++) {
            Map.Entry LJIIIIZZ = this.LIZ.LJIIIIZZ(i);
            c87165YIv.LIZJ((YJB) LJIIIIZZ.getKey(), LJIIIIZZ.getValue());
        }
        for (Map.Entry entry : this.LIZ.LJ()) {
            c87165YIv.LIZJ((YJB) entry.getKey(), entry.getValue());
        }
        c87165YIv.LIZJ = this.LIZJ;
        return c87165YIv;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C87165YIv() {
        this.LIZ = new C79556VKe(16);
    }

    public C87165YIv(int i) {
        C79556VKe c79556VKe = new C79556VKe(0);
        this.LIZ = c79556VKe;
        if (this.LIZIZ) {
            return;
        }
        c79556VKe.LIZJ();
        this.LIZIZ = true;
    }

    public static boolean LJI(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.LLLLLLLZIL() == YPP.MESSAGE) {
            if (key.LLLLLLIL()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((YID) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof YIZ) {
                    if (!((YID) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof XRQ) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static int LJIIIIZZ(Map.Entry<FieldDescriptorType, Object> entry) {
        int i;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.LLLLLLLZIL() == YPP.MESSAGE && !key.LLLLLLIL() && !key.LLLLLZ()) {
            if (value instanceof XRQ) {
                int zzac = entry.getKey().zzac();
                YIB yib = (YIB) value;
                int LJ = AbstractC87156YIm.LJ(2, zzac) + (AbstractC87156YIm.LJIJJ(1) << 1);
                int LJIJJ = AbstractC87156YIm.LJIJJ(3);
                if (yib.LIZIZ != null) {
                    i = yib.LIZIZ.size();
                } else if (yib.LIZ != null) {
                    i = yib.LIZ.LIZLLL();
                } else {
                    i = 0;
                }
                return AbstractC87156YIm.LJIL(i) + i + LJIJJ + LJ;
            }
            int zzac2 = entry.getKey().zzac();
            int LJ2 = AbstractC87156YIm.LJ(2, zzac2) + (AbstractC87156YIm.LJIJJ(1) << 1);
            int LJIJJ2 = AbstractC87156YIm.LJIJJ(3);
            int LIZLLL2 = ((YIZ) value).LIZLLL();
            return AbstractC87156YIm.LJIL(LIZLLL2) + LIZLLL2 + LJIJJ2 + LJ2;
        }
        return LJ(key, value);
    }

    public static Object LJIIIZ(Object obj) {
        if (obj instanceof InterfaceC87185YJp) {
            return ((InterfaceC87185YJp) obj).LJJJJJ();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.Object r3 = r6.getKey()
            X.YJB r3 = (X.YJB) r3
            java.lang.Object r2 = r6.getValue()
            boolean r0 = r2 instanceof X.XRQ
            if (r0 != 0) goto Lc7
            boolean r0 = r3.LLLLLLIL()
            if (r0 == 0) goto L4d
            X.VKe r0 = r5.LIZ
            java.lang.Object r4 = r0.get(r3)
            boolean r0 = r4 instanceof X.XRQ
            if (r0 != 0) goto L46
            if (r4 != 0) goto L25
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L25:
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r2.next()
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = LJIIIZ(r0)
            r1.add(r0)
            goto L2b
        L40:
            X.VKe r0 = r5.LIZ
            r0.put(r3, r4)
            return
        L46:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L4d:
            X.YPP r1 = r3.LLLLLLLZIL()
            X.YPP r0 = X.YPP.MESSAGE
            if (r1 != r0) goto Lbd
            X.VKe r0 = r5.LIZ
            java.lang.Object r1 = r0.get(r3)
            boolean r0 = r1 instanceof X.XRQ
            if (r0 != 0) goto Lb6
            if (r1 != 0) goto L6b
            X.VKe r1 = r5.LIZ
            java.lang.Object r0 = LJIIIZ(r2)
            r1.put(r3, r0)
            return
        L6b:
            boolean r0 = r1 instanceof X.InterfaceC87185YJp
            if (r0 == 0) goto L79
            X.YJp r2 = r3.m48zza()
        L73:
            X.VKe r0 = r5.LIZ
            r0.put(r3, r2)
            return
        L79:
            X.YIZ r1 = (X.YIZ) r1
            r1.LIZJ()
            X.YIS r0 = r3.zza()
            X.YIT r0 = (X.YIT) r0
            X.YIO r2 = r0.LJII()
            r1 = 1
            java.lang.Object r0 = r2.LJIIIIZZ(r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            if (r0 != r1) goto L96
            goto L73
        L96:
            if (r0 != 0) goto L9e
        L98:
            X.YIA r0 = new X.YIA
            r0.<init>(r2)
            throw r0
        L9e:
            X.YIz r1 = X.C87169YIz.LIZJ
            r1.getClass()
            java.lang.Class r0 = r2.getClass()
            X.YIU r0 = r1.LIZ(r0)
            boolean r1 = r0.LJI(r2)
            r0 = 2
            r2.LJIIIIZZ(r0)
            if (r1 == 0) goto L98
            goto L73
        Lb6:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        Lbd:
            X.VKe r1 = r5.LIZ
            java.lang.Object r0 = LJIIIZ(r2)
            r1.put(r3, r0)
            return
        Lc7:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87165YIv.LJII(java.util.Map$Entry):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87165YIv)) {
            return false;
        }
        return this.LIZ.equals(((C87165YIv) obj).LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void LIZLLL(YPQ ypq, Object obj) {
        boolean z;
        obj.getClass();
        switch (YPR.LIZ[ypq.zzawa().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof AbstractC87141YHx) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC87191YJv)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 9:
                if ((obj instanceof YIZ) || (obj instanceof XRQ)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static int LJ(YJB<?> yjb, Object obj) {
        YPQ LLLLLL = yjb.LLLLLL();
        int zzac = yjb.zzac();
        if (yjb.LLLLLLIL()) {
            int i = 0;
            if (yjb.LLLLLZ()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i += LJFF(LLLLLL, it.next());
                }
                return AbstractC87156YIm.LJIL(i) + AbstractC87156YIm.LJIJJ(zzac) + i;
            }
            for (Object obj2 : (List) obj) {
                int LJIJJ = AbstractC87156YIm.LJIJJ(zzac);
                if (LLLLLL == YPQ.zzgen) {
                    LJIJJ <<= 1;
                }
                i += LJFF(LLLLLL, obj2) + LJIJJ;
            }
            return i;
        }
        int LJIJJ2 = AbstractC87156YIm.LJIJJ(zzac);
        if (LLLLLL == YPQ.zzgen) {
            LJIJJ2 <<= 1;
        }
        return LJFF(LLLLLL, obj) + LJIJJ2;
    }

    public static int LJFF(YPQ ypq, Object obj) {
        int i;
        switch (YPR.LIZIZ[ypq.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return AbstractC87156YIm.LJIILLIIL(((Long) obj).longValue());
            case 4:
                return AbstractC87156YIm.LJIILLIIL(((Long) obj).longValue());
            case 5:
                return AbstractC87156YIm.LJIJJLI(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                return ((YIZ) obj).LIZLLL();
            case 10:
                if (obj instanceof XRQ) {
                    YIB yib = (YIB) obj;
                    if (yib.LIZIZ != null) {
                        i = yib.LIZIZ.size();
                    } else if (yib.LIZ != null) {
                        i = yib.LIZ.LIZLLL();
                    } else {
                        i = 0;
                    }
                    return AbstractC87156YIm.LJIL(i) + i;
                }
                int LIZLLL2 = ((YIZ) obj).LIZLLL();
                return AbstractC87156YIm.LJIL(LIZLLL2) + LIZLLL2;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                if (obj instanceof AbstractC87141YHx) {
                    int size = ((AbstractC87141YHx) obj).size();
                    return AbstractC87156YIm.LJIL(size) + size;
                }
                return AbstractC87156YIm.LJJ((String) obj);
            case 12:
                if (obj instanceof AbstractC87141YHx) {
                    int size2 = ((AbstractC87141YHx) obj).size();
                    return AbstractC87156YIm.LJIL(size2) + size2;
                }
                int length = ((byte[]) obj).length;
                return AbstractC87156YIm.LJIL(length) + length;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return AbstractC87156YIm.LJIL(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                int intValue = ((Integer) obj).intValue();
                return AbstractC87156YIm.LJIL((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC87156YIm.LJIILLIIL((longValue >> 63) ^ (longValue << 1));
            case 18:
                if (obj instanceof InterfaceC87191YJv) {
                    return AbstractC87156YIm.LJIJJLI(((InterfaceC87191YJv) obj).zzac());
                }
                return AbstractC87156YIm.LJIJJLI(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public final void LIZJ(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.LLLLLLIL()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = ListProtector.get(arrayList, i);
                    i++;
                    LIZLLL(fielddescriptortype.LLLLLL(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LIZLLL(fielddescriptortype.LLLLLL(), obj);
        }
        if (obj instanceof XRQ) {
            this.LIZJ = true;
        }
        this.LIZ.put(fielddescriptortype, obj);
    }
}
