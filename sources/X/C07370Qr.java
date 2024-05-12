package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07370Qr {
    public static final C07390Qt LIZ;
    public static final C0M6<String, Typeface> LIZIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            LIZ = new C07390Qt() { // from class: X.1Jb
                public static Font LJI(FontFamily fontFamily, int i2) {
                    int i3;
                    int i4;
                    if ((i2 & 1) != 0) {
                        i3 = 700;
                    } else {
                        i3 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                    }
                    if ((i2 & 2) != 0) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    FontStyle fontStyle = new FontStyle(i3, i4);
                    Font font = fontFamily.getFont(0);
                    int LJII = LJII(fontStyle, font.getStyle());
                    for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
                        Font font2 = fontFamily.getFont(i5);
                        int LJII2 = LJII(fontStyle, font2.getStyle());
                        if (LJII2 < LJII) {
                            font = font2;
                            LJII = LJII2;
                        }
                    }
                    return font;
                }

                public static int LJII(FontStyle fontStyle, FontStyle fontStyle2) {
                    int i2;
                    int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
                    if (fontStyle.getSlant() == fontStyle2.getSlant()) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    return abs + i2;
                }

                @Override // X.C07390Qt
                public final Typeface LIZJ(Context context, InputStream inputStream) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C07390Qt
                public final C12180dq LJFF(int i2, C12180dq[] c12180dqArr) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C07390Qt
                public final Typeface LIZIZ(Context context, C12180dq[] c12180dqArr, int i2) {
                    int i3;
                    ContentResolver contentResolver = context.getContentResolver();
                    try {
                        FontFamily.Builder builder = null;
                        for (C12180dq c12180dq : c12180dqArr) {
                            try {
                                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(c12180dq.LIZ, "r", null);
                                if (openFileDescriptor != null) {
                                    try {
                                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(c12180dq.LIZJ);
                                        if (c12180dq.LIZLLL) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                        Font build = weight.setSlant(i3).setTtcIndex(c12180dq.LIZIZ).build();
                                        if (builder == null) {
                                            builder = new FontFamily.Builder(build);
                                        } else {
                                            builder.addFont(build);
                                        }
                                        openFileDescriptor.close();
                                    } catch (Throwable th) {
                                        try {
                                            openFileDescriptor.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                        break;
                                    }
                                }
                            } catch (IOException unused) {
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily build2 = builder.build();
                        return new Typeface.CustomFallbackBuilder(build2).setStyle(LJI(build2, i2).getStyle()).build();
                    } catch (Exception unused2) {
                        return null;
                    }
                }

                @Override // X.C07390Qt
                public final Typeface LIZ(Context context, C1IU c1iu, Resources resources, int i2) {
                    int i3;
                    try {
                        FontFamily.Builder builder = null;
                        for (C0OT c0ot : c1iu.LIZ) {
                            try {
                                Font.Builder weight = new Font.Builder(resources, c0ot.LJFF).setWeight(c0ot.LIZIZ);
                                if (c0ot.LIZJ) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                Font build = weight.setSlant(i3).setTtcIndex(c0ot.LJ).setFontVariationSettings(c0ot.LIZLLL).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(build);
                                } else {
                                    builder.addFont(build);
                                }
                            } catch (IOException unused) {
                            }
                        }
                        if (builder == null) {
                            return null;
                        }
                        FontFamily build2 = builder.build();
                        return new Typeface.CustomFallbackBuilder(build2).setStyle(LJI(build2, i2).getStyle()).build();
                    } catch (Exception unused2) {
                        return null;
                    }
                }

                @Override // X.C07390Qt
                public final Typeface LIZLLL(Context context, Resources resources, int i2, String str, int i3) {
                    try {
                        Font build = new Font.Builder(resources, i2).build();
                        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        } else if (i >= 28) {
            LIZ = new C41491k1() { // from class: X.1vk
                @Override // X.C41491k1
                public final Typeface LJIIIZ(Object obj) {
                    try {
                        Object newInstance = Array.newInstance(this.LJFF, 1);
                        Array.set(newInstance, 0, obj);
                        return (Typeface) this.LJIIJJI.invoke(null, newInstance, "sans-serif", -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }

                @Override // X.C41491k1
                public final Method LJIILIIL(Class<?> cls) {
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                }
            };
        } else if (i >= 26) {
            LIZ = new C41491k1();
        } else if (i >= 24 && C30861Ja.LIZJ != null) {
            LIZ = new C30861Ja();
        } else {
            LIZ = new C1JZ();
        }
        LIZIZ = new C0M6<>(16);
    }

    public static String LIZIZ(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r5.equals(r0) == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.1Qe] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.0dm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LIZ(final android.content.Context r9, X.C0OS r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14, final int r15, X.AbstractC06680Oa r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07370Qr.LIZ(android.content.Context, X.0OS, android.content.res.Resources, int, java.lang.String, int, int, X.0Oa, boolean):android.graphics.Typeface");
    }
}
