package X;

import com.bytedance.pumbaa.base.settings.TypeInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FfH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39527FfH {
    public static final /* synthetic */ int LIZ = 0;

    public static C39528FfI LIZ(TypeInfo typeInfo) {
        Class<?> cls;
        Type[] typeArr;
        o.LJIIIZ(typeInfo, "typeInfo");
        Class<?> cls2 = Class.forName(typeInfo.rawTypeName);
        String str = typeInfo.ownerTypeName;
        if (str != null) {
            cls = Class.forName(str);
        } else {
            cls = null;
        }
        List<TypeInfo> list = typeInfo.argumentTypeNames;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<TypeInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(LIZ(it.next()));
            }
            Object[] array = arrayList.toArray(new Type[0]);
            if (array != null) {
                typeArr = (Type[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            typeArr = new Type[0];
        }
        return new C39528FfI(cls2, cls, typeArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00cc, code lost:
    
        if (r5.equals("float") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return java.lang.Float.valueOf(com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00d5, code lost:
    
        if (r5.equals("boolean") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e7, code lost:
    
        if (r5.equals("long") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00f9, code lost:
    
        if (r5.equals("char") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0114, code lost:
    
        if (r5.equals("byte") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0126, code lost:
    
        if (r5.equals("int") != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return java.lang.Integer.valueOf(com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0130, code lost:
    
        if (r5.equals("java.lang.Short") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0142, code lost:
    
        if (r5.equals("java.lang.Float") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0186, code lost:
    
        if (r5.equals("double") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01ca, code lost:
    
        if (r5.equals("java.lang.Integer") != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007a, code lost:
    
        if (r5.equals("java.lang.Double") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return java.lang.Double.valueOf(com.bytedance.mt.protector.impl.string2number.CastDoubleProtector.parseDouble(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0084, code lost:
    
        if (r5.equals("java.lang.Long") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return java.lang.Long.valueOf(com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008d, code lost:
    
        if (r5.equals("java.lang.Byte") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return java.lang.Byte.valueOf(com.bytedance.mt.protector.impl.string2number.CastByteProtector.parseByte(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
    
        if (r5.equals("java.lang.Boolean") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a0, code lost:
    
        if (r5.equals("java.lang.Character") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
    
        r1 = r4.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ff, code lost:
    
        if (r1 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0102, code lost:
    
        if (r1 != 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return java.lang.Character.valueOf(r4.charAt(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dd, code lost:
    
        throw new java.lang.IllegalArgumentException("Char sequence has more than one element.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e5, code lost:
    
        throw new java.util.NoSuchElementException("Char sequence is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a9, code lost:
    
        if (r5.equals("short") != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return java.lang.Short.valueOf(com.bytedance.mt.protector.impl.string2number.CastShortProtector.parseShort(r4));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0022. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZIZ(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39527FfH.LIZIZ(java.lang.String, java.lang.String):java.lang.Object");
    }
}
