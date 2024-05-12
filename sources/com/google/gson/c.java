package com.google.gson;

import X.X1D;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes17.dex */
public abstract class c implements com.google.gson.d {
    public static final c IDENTITY;
    public static final /* synthetic */ c[] LJLIL;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;

    public c() {
        throw null;
    }

    @Override // com.google.gson.d
    public abstract /* synthetic */ String translateName(Field field);

    static {
        c cVar = new c() { // from class: com.google.gson.c.a
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return field.getName();
            }
        };
        IDENTITY = cVar;
        c cVar2 = new c() { // from class: com.google.gson.c.b
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return c.LIZLLL(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar2;
        c cVar3 = new c() { // from class: com.google.gson.c.c
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return c.LIZLLL(c.LIZJ(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar3;
        c cVar4 = new c() { // from class: com.google.gson.c.d
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return c.LIZJ(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar4;
        c cVar5 = new c() { // from class: com.google.gson.c.e
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return c.LIZJ(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar5;
        c cVar6 = new c() { // from class: com.google.gson.c.f
            @Override // com.google.gson.c, com.google.gson.d
            public final String translateName(Field field) {
                return c.LIZJ(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar6;
        LJLIL = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public static c[] values() {
        return (c[]) LJLIL.clone();
    }

    public static String LIZLLL(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (!Character.isUpperCase(charAt)) {
            char upperCase = Character.toUpperCase(charAt);
            int i2 = i + 1;
            if (i2 < str.length()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(upperCase);
                LIZ.append(str.substring(i2));
                valueOf = X1D.LIZIZ(LIZ);
            } else {
                valueOf = String.valueOf(upperCase);
            }
            sb.append(valueOf);
            return sb.toString();
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public c(String str, int i) {
    }

    public static String LIZJ(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
