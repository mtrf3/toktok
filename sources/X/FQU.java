package X;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FQU extends Resources {
    public FQV LIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NotFoundException -> 0x0025, TryCatch #0 {NotFoundException -> 0x0025, blocks: (B:2:0x0000, B:7:0x000f, B:12:0x001b, B:13:0x001f, B:18:0x0005), top: B:1:0x0000 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r3) {
        /*
            r2 = this;
            X.FQV r1 = r2.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L25
            if (r1 != 0) goto L5
            goto Lc
        L5:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r3, r0)     // Catch: android.content.res.Resources.NotFoundException -> L25
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L18
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L25
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L1f
            java.lang.String r1 = super.getString(r3)     // Catch: android.content.res.Resources.NotFoundException -> L25
        L1f:
            java.lang.String r0 = "{\n            val pStr =…r\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L25
            goto L32
        L25:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = r0.getString(r3)
            java.lang.String r0 = "{\n            Resources.…).getString(id)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getString(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: NotFoundException -> 0x0041, TryCatch #0 {NotFoundException -> 0x0041, blocks: (B:2:0x0000, B:8:0x0010, B:13:0x001c, B:16:0x0026, B:18:0x0033, B:22:0x0005), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[Catch: NotFoundException -> 0x0041, TryCatch #0 {NotFoundException -> 0x0041, blocks: (B:2:0x0000, B:8:0x0010, B:13:0x001c, B:16:0x0026, B:18:0x0033, B:22:0x0005), top: B:1:0x0000 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] getStringArray(int r7) {
        /*
            r6 = this;
            X.FQV r1 = r6.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L41
            if (r1 != 0) goto L5
            goto Lc
        L5:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r7, r0)     // Catch: android.content.res.Resources.NotFoundException -> L41
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r5 = 0
            if (r1 == 0) goto L19
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L41
            if (r0 != 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L26
            java.lang.String[] r2 = super.getStringArray(r7)     // Catch: android.content.res.Resources.NotFoundException -> L41
            java.lang.String r0 = "{\n                super.…ngArray(id)\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L41
            goto L4e
        L26:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: android.content.res.Resources.NotFoundException -> L41
            r4.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L41
            int r3 = r4.length()     // Catch: android.content.res.Resources.NotFoundException -> L41
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch: android.content.res.Resources.NotFoundException -> L41
        L31:
            if (r5 >= r3) goto L4e
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r4, r5)     // Catch: android.content.res.Resources.NotFoundException -> L41
            java.lang.String r0 = "arrayStr.getString(it)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L41
            r2[r5] = r1     // Catch: android.content.res.Resources.NotFoundException -> L41
            int r5 = r5 + 1
            goto L31
        L41:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String[] r2 = r0.getStringArray(r7)
            java.lang.String r0 = "{\n            Resources.…StringArray(id)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getStringArray(int):java.lang.String[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NotFoundException -> 0x0025, TryCatch #0 {NotFoundException -> 0x0025, blocks: (B:2:0x0000, B:7:0x000f, B:12:0x001b, B:18:0x0005), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence getText(int r3) {
        /*
            r2 = this;
            X.FQV r1 = r2.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L25
            if (r1 != 0) goto L5
            goto Lc
        L5:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r3, r0)     // Catch: android.content.res.Resources.NotFoundException -> L25
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L18
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L25
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L24
            java.lang.CharSequence r1 = super.getText(r3)     // Catch: android.content.res.Resources.NotFoundException -> L25
            java.lang.String r0 = "super.getText(id)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L25
        L24:
            return r1
        L25:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.CharSequence r1 = r0.getText(r3)
            java.lang.String r0 = "{\n            Resources.…m().getText(id)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getText(int):java.lang.CharSequence");
    }

    @Override // android.content.res.Resources
    public final CharSequence[] getTextArray(int i) {
        String LIZ;
        boolean z;
        try {
            FQV fqv = this.LIZ;
            if (fqv != null) {
                LIZ = fqv.LIZ(i, "");
            } else {
                LIZ = null;
            }
            if (LIZ == null || LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CharSequence[] textArray = super.getTextArray(i);
                o.LJIIIIZZ(textArray, "{\n                super.…xtArray(id)\n            }");
                return textArray;
            }
            JSONArray jSONArray = new JSONArray(LIZ);
            int length = jSONArray.length();
            CharSequence[] charSequenceArr = new CharSequence[length];
            for (int i2 = 0; i2 < length; i2++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i2);
                o.LJIIIIZZ(string, "arrayStr.getString(it)");
                charSequenceArr[i2] = string;
            }
            return charSequenceArr;
        } catch (Resources.NotFoundException unused) {
            CharSequence[] textArray2 = Resources.getSystem().getTextArray(i);
            o.LJIIIIZZ(textArray2, "{\n            Resources.…etTextArray(id)\n        }");
            return textArray2;
        }
    }

    public FQU(Resources resources, FQV fqv) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.LIZ = fqv;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method declaredMethod = Resources.class.getDeclaredMethod("getImpl", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(resources, new Object[0]);
                Method declaredMethod2 = Resources.class.getDeclaredMethod("setImpl", Class.forName("android.content.res.ResourcesImpl"));
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(this, invoke);
                Class<?> cls = Class.forName("android.app.ResourcesManager");
                Method declaredMethod3 = cls.getDeclaredMethod("getInstance", new Class[0]);
                declaredMethod3.setAccessible(true);
                Object invoke2 = declaredMethod3.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mResourceReferences");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke2);
                if (obj != null) {
                    ((ArrayList) obj).add(new WeakReference(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>>{ kotlin.collections.TypeAliasesKt.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> }");
            } catch (Exception e) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version:", Build.VERSION.SDK_INT);
                jSONObject.put("error message:", String.valueOf(e.getMessage()));
                C78983UzD.LJIILL(jSONObject.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: NotFoundException -> 0x005c, TryCatch #0 {NotFoundException -> 0x005c, blocks: (B:2:0x0000, B:8:0x0010, B:13:0x001c, B:14:0x0056, B:18:0x0021, B:20:0x0031, B:25:0x0052, B:27:0x004d, B:29:0x0005), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0021 A[Catch: NotFoundException -> 0x005c, TryCatch #0 {NotFoundException -> 0x005c, blocks: (B:2:0x0000, B:8:0x0010, B:13:0x001c, B:14:0x0056, B:18:0x0021, B:20:0x0031, B:25:0x0052, B:27:0x004d, B:29:0x0005), top: B:1:0x0000 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getQuantityString(int r6, int r7) {
        /*
            r5 = this;
            X.FQV r1 = r5.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L5c
            if (r1 != 0) goto L5
            goto Lc
        L5:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r6, r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r4 = 1
            if (r1 == 0) goto L19
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L5c
            if (r0 != 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L21
            java.lang.String r1 = super.getQuantityString(r6, r7)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            goto L56
        L21:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: android.content.res.Resources.NotFoundException -> L5c
            r3.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.res.Resources.NotFoundException -> L5c
            r0 = 24
            if (r1 < r0) goto L4d
            java.util.Locale r0 = X.C40905G3p.LIZIZ()     // Catch: android.content.res.Resources.NotFoundException -> L5c
            android.icu.text.PluralRules r2 = android.icu.text.PluralRules.forLocale(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            double r0 = (double) r7     // Catch: android.content.res.Resources.NotFoundException -> L5c
            java.lang.String r0 = r2.select(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            java.lang.String r1 = r3.optString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L5c
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 == 0) goto L56
            goto L52
        L4d:
            java.lang.String r1 = super.getQuantityString(r6, r7)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            goto L56
        L52:
            java.lang.String r1 = super.getQuantityString(r6, r7)     // Catch: android.content.res.Resources.NotFoundException -> L5c
        L56:
            java.lang.String r0 = "{\n            val pStr =…}\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L5c
            goto L69
        L5c:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = r0.getQuantityString(r6, r7)
            java.lang.String r0 = "{\n            Resources.…g(id, quantity)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getQuantityString(int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NotFoundException -> 0x0051, TryCatch #0 {NotFoundException -> 0x0051, blocks: (B:2:0x0000, B:7:0x000f, B:12:0x001b, B:15:0x0025, B:17:0x0035, B:18:0x0046, B:20:0x004c, B:22:0x0005), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: NotFoundException -> 0x0051, TryCatch #0 {NotFoundException -> 0x0051, blocks: (B:2:0x0000, B:7:0x000f, B:12:0x001b, B:15:0x0025, B:17:0x0035, B:18:0x0046, B:20:0x004c, B:22:0x0005), top: B:1:0x0000 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence getQuantityText(int r5, int r6) {
        /*
            r4 = this;
            X.FQV r1 = r4.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L51
            if (r1 != 0) goto L5
            goto Lc
        L5:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r5, r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L18
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L51
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L25
            java.lang.CharSequence r1 = super.getQuantityText(r5, r6)     // Catch: android.content.res.Resources.NotFoundException -> L51
            java.lang.String r0 = "super.getQuantityText(id, quantity)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            return r1
        L25:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: android.content.res.Resources.NotFoundException -> L51
            r3.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L51
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.res.Resources.NotFoundException -> L51
            r0 = 24
            if (r1 < r0) goto L4c
            java.util.Locale r0 = X.C40905G3p.LIZIZ()     // Catch: android.content.res.Resources.NotFoundException -> L51
            android.icu.text.PluralRules r2 = android.icu.text.PluralRules.forLocale(r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            double r0 = (double) r6     // Catch: android.content.res.Resources.NotFoundException -> L51
            java.lang.String r0 = r2.select(r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            java.lang.String r1 = r3.optString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
        L46:
            java.lang.String r0 = "{\n            val pStr =…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L51
            goto L5e
        L4c:
            java.lang.CharSequence r1 = super.getQuantityText(r5, r6)     // Catch: android.content.res.Resources.NotFoundException -> L51
            goto L46
        L51:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.CharSequence r1 = r0.getQuantityText(r5, r6)
            java.lang.String r0 = "{\n            Resources.…t(id, quantity)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getQuantityText(int, int):java.lang.CharSequence");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: NotFoundException -> 0x0043, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:3:0x0005, B:8:0x0014, B:13:0x0020, B:14:0x003d, B:18:0x002a, B:20:0x000a), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[Catch: NotFoundException -> 0x0043, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:3:0x0005, B:8:0x0014, B:13:0x0020, B:14:0x003d, B:18:0x002a, B:20:0x000a), top: B:2:0x0005 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r4, java.lang.Object... r5) {
        /*
            r3 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.FQV r1 = r3.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r1 != 0) goto La
            goto L11
        La:
            java.lang.String r0 = ""
            java.lang.String r2 = r1.LIZ(r4, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L1d
            int r0 = r2.length()     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r0 != 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L2a
            int r0 = r5.length     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String r1 = super.getString(r4, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            goto L3d
        L2a:
            int r0 = r5.length     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r0 = r1.length     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String r1 = X.C16880lQ.LLLZ(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
        L3d:
            java.lang.String r0 = "{\n            val pStr =…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L43
            goto L55
        L43:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r1 = r1.getString(r4, r0)
            java.lang.String r0 = "{\n            Resources.…d, *formatArgs)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getString(int, java.lang.Object[]):java.lang.String");
    }

    @Override // android.content.res.Resources
    public final CharSequence getText(int i, CharSequence charSequence) {
        boolean z;
        try {
            FQV fqv = this.LIZ;
            String str = null;
            if (fqv != null) {
                if (charSequence instanceof String) {
                    str = (String) charSequence;
                }
                if (str == null) {
                    str = "";
                }
                str = fqv.LIZ(i, str);
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CharSequence text = super.getText(i, charSequence);
                o.LJIIIIZZ(text, "super.getText(id, def)");
                return text;
            }
            return str;
        } catch (Resources.NotFoundException unused) {
            CharSequence text2 = Resources.getSystem().getText(i, charSequence);
            o.LJIIIIZZ(text2, "{\n            Resources.…etText(id, def)\n        }");
            return text2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: NotFoundException -> 0x0078, TryCatch #0 {NotFoundException -> 0x0078, blocks: (B:3:0x0005, B:8:0x0014, B:13:0x0020, B:14:0x0063, B:18:0x002a, B:20:0x003a, B:21:0x0069, B:23:0x000a), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a A[Catch: NotFoundException -> 0x0078, TryCatch #0 {NotFoundException -> 0x0078, blocks: (B:3:0x0005, B:8:0x0014, B:13:0x0020, B:14:0x0063, B:18:0x002a, B:20:0x003a, B:21:0x0069, B:23:0x000a), top: B:2:0x0005 }] */
    @Override // android.content.res.Resources
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getQuantityString(int r5, int r6, java.lang.Object... r7) {
        /*
            r4 = this;
            java.lang.String r0 = "formatArgs"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            X.FQV r1 = r4.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L78
            if (r1 != 0) goto La
            goto L11
        La:
            java.lang.String r0 = ""
            java.lang.String r1 = r1.LIZ(r5, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L1d
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L78
            if (r0 != 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L2a
            int r0 = r7.length     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r1 = super.getQuantityString(r5, r6, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            goto L63
        L2a:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: android.content.res.Resources.NotFoundException -> L78
            r3.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L78
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.res.Resources.NotFoundException -> L78
            r0 = 24
            if (r1 < r0) goto L69
            java.util.Locale r0 = X.C40905G3p.LIZIZ()     // Catch: android.content.res.Resources.NotFoundException -> L78
            android.icu.text.PluralRules r2 = android.icu.text.PluralRules.forLocale(r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            double r0 = (double) r6     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r0 = r2.select(r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r2 = r3.optString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            int r0 = r7.length     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            int r0 = r1.length     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r1 = X.C16880lQ.LLLZ(r2, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
        L63:
            java.lang.String r0 = "{\n            val pStr =…}\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            goto L8a
        L69:
            int r0 = r7.length     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r1 = super.getQuantityString(r5, r6, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            java.lang.String r0 = "{\n                    su…atArgs)\n                }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L78
            goto L63
        L78:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String r1 = r1.getQuantityString(r5, r6, r0)
            java.lang.String r0 = "{\n            Resources.…y, *formatArgs)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQU.getQuantityString(int, int, java.lang.Object[]):java.lang.String");
    }
}
