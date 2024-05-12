package q8;

import X.C16880lQ;
import X.C78598Ut0;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.a1;
import kotlin.jvm.internal.o;
import n.b;
import p8.a;
import ujb.s;

/* loaded from: classes.dex */
public final class a {
    public static final boolean LIZ(p8.a aVar) {
        if (aVar instanceof a.c) {
            String str = aVar.LIZ;
            o.LJFF(str, "type.value");
            return Boolean.parseBoolean(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getBoolean:Drawable unsupported ParamsType type: ");
        LIZ.append(aVar.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final String LJ(String key) {
        o.LJIIJ(key, "key");
        int LJJLIIJ = s.LJJLIIJ(key, ":", 6);
        if (LJJLIIJ == -1) {
            return key;
        }
        String substring = key.substring(LJJLIIJ + 1);
        o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final int LIZIZ(Context context, p8.a type) {
        o.LJIIJ(type, "type");
        boolean z = type instanceof a.b;
        if (z && o.LJ(((a.b) type).LIZIZ, "attr")) {
            String str = type.LIZ;
            o.LJFF(str, "type.value");
            return b.LIZIZ(CastIntegerProtector.parseInt(str), context);
        }
        if (type instanceof a.c) {
            String str2 = type.LIZ;
            o.LJFF(str2, "type.value");
            if (ujb.o.LJJJLIIL(str2, "#", false)) {
                if (type.LIZ.length() >= 7) {
                    return ColorProtector.parseColor(type.LIZ);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("color format must be like #FF0000 current is ");
                LIZ.append(type.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (z) {
            a.b bVar = (a.b) type;
            if (bVar.LIZIZ.equals("color")) {
                Resources resources = context.getResources();
                String str3 = type.LIZ;
                o.LJFF(str3, "type.value");
                return resources.getColor(CastIntegerProtector.parseInt(str3));
            }
            String str4 = bVar.LIZIZ;
            o.LJFF(str4, "type.idType");
            if (ujb.o.LJJJLIIL(str4, "attr", false)) {
                String str5 = type.LIZ;
                o.LJFF(str5, "type.value");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{CastIntegerProtector.parseInt(str5)});
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                return color;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getColor:Drawable unsupported ParamsType type: ");
        LIZ2.append(type.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r6.equals("dip") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r0 = r9.LIZ;
        kotlin.jvm.internal.o.LJFF(r0, "type.value");
        r2 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0);
        r0 = r8.getResources();
        kotlin.jvm.internal.o.LJFF(r0, "context.resources");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return android.util.TypedValue.applyDimension(1, r2, r0.getDisplayMetrics());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        if (r6.equals("dp") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZJ(android.content.Context r8, p8.a r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.a.LIZJ(android.content.Context, p8.a):float");
    }

    public static final Drawable LIZLLL(Context context, p8.a aVar) {
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (o.LJ(bVar.LIZIZ, "drawable") || o.LJ(bVar.LIZIZ, "color")) {
                Resources resources = context.getResources();
                String str = aVar.LIZ;
                o.LJFF(str, "type.value");
                Drawable drawable = resources.getDrawable(CastIntegerProtector.parseInt(str));
                o.LJFF(drawable, "context.resources.getDrawable(type.value.toInt())");
                return drawable;
            }
            if (o.LJ(((a.b) aVar).LIZIZ, "attr")) {
                String str2 = aVar.LIZ;
                o.LJFF(str2, "type.value");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{CastIntegerProtector.parseInt(str2)});
                Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                o.LJFF(drawable2, "ViewHelper.getAttrDrawab…text, type.value.toInt())");
                return drawable2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDrawable:Drawable unsupported ParamsType type: ");
        LIZ.append(aVar.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final void LJFF(Context context, String str, String str2) {
        String LJ = a1.LJ(str, " unsupported attr: ", str2);
        if (C78598Ut0.LJLJI) {
            C16880lQ.LLZILL(Toast.makeText(context, LJ, 1));
        }
        throw new IllegalArgumentException(LJ);
    }
}
