package X;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0FM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FM {
    public static boolean LIZLLL(int i) {
        return i >= 28 && i <= 31;
    }

    public static Keyframe LIZIZ(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0138, code lost:
    
        if (r3 == 0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.PropertyValuesHolder LIZJ(android.content.res.TypedArray r15, int r16, int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FM.LIZJ(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator LJ(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        int resourceId;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray LJI = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LJI);
        TypedArray LJI2 = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LJIIJ);
        if (valueAnimator2 == null) {
            valueAnimator2 = new ValueAnimator();
        }
        long LIZLLL = C06720Oe.LIZLLL(LJI, xmlPullParser, "duration", 1, 300);
        int i3 = 0;
        long LIZLLL2 = C06720Oe.LIZLLL(LJI, xmlPullParser, "startOffset", 2, 0);
        int LIZLLL3 = C06720Oe.LIZLLL(LJI, xmlPullParser, "valueType", 7, 4);
        if (C06720Oe.LJFF(xmlPullParser, "valueFrom") && C06720Oe.LJFF(xmlPullParser, "valueTo")) {
            if (LIZLLL3 == 4) {
                TypedValue peekValue = LJI.peekValue(5);
                if (peekValue != null) {
                    z = true;
                    i = peekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue peekValue2 = LJI.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                    i2 = peekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                if ((z && LIZLLL(i)) || (z2 && LIZLLL(i2))) {
                    LIZLLL3 = 3;
                } else {
                    LIZLLL3 = 0;
                }
            }
            PropertyValuesHolder LIZJ = LIZJ(LJI, LIZLLL3, 5, 6, "");
            if (LIZJ != null) {
                valueAnimator2.setValues(LIZJ);
            }
        }
        valueAnimator2.setDuration(LIZLLL);
        valueAnimator2.setStartDelay(LIZLLL2);
        valueAnimator2.setRepeatCount(C06720Oe.LIZLLL(LJI, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C06720Oe.LIZLLL(LJI, xmlPullParser, "repeatMode", 4, 1));
        if (LJI2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String LJ = C06720Oe.LJ(LJI2, xmlPullParser, "pathData", 1);
            if (LJ != null) {
                String LJ2 = C06720Oe.LJ(LJI2, xmlPullParser, "propertyXName", 2);
                String LJ3 = C06720Oe.LJ(LJI2, xmlPullParser, "propertyYName", 3);
                if (LJ2 != null || LJ3 != null) {
                    Path LIZLLL4 = C07360Qq.LIZLLL(LJ);
                    PathMeasure pathMeasure = new PathMeasure(LIZLLL4, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f = 0.0f;
                    do {
                        f += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(LIZLLL4, false);
                    int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f2 = f / (min - 1);
                    int i4 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        propertyValuesHolder = null;
                        if (i3 >= min) {
                            break;
                        }
                        pathMeasure2.getPosTan(f3 - ((Float) ListProtector.get(arrayList, i4)).floatValue(), fArr3, null);
                        fArr[i3] = fArr3[0];
                        fArr2[i3] = fArr3[1];
                        f3 += f2;
                        int i5 = i4 + 1;
                        if (i5 < arrayList.size() && f3 > ((Float) ListProtector.get(arrayList, i5)).floatValue()) {
                            pathMeasure2.nextContour();
                            i4 = i5;
                        }
                        i3++;
                    }
                    if (LJ2 != null) {
                        propertyValuesHolder2 = PropertyValuesHolder.ofFloat(LJ2, fArr);
                    } else {
                        propertyValuesHolder2 = null;
                    }
                    if (LJ3 != null) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(LJ3, fArr2);
                    }
                    if (propertyValuesHolder2 == null) {
                        i3 = 0;
                        objectAnimator.setValues(propertyValuesHolder);
                    } else {
                        i3 = 0;
                        if (propertyValuesHolder == null) {
                            objectAnimator.setValues(propertyValuesHolder2);
                        } else {
                            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
                        }
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LJI2.getPositionDescription());
                    LIZ.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(X1D.LIZIZ(LIZ));
                }
            } else {
                objectAnimator.setPropertyName(C06720Oe.LJ(LJI2, xmlPullParser, "propertyName", 0));
            }
        }
        if (C06720Oe.LJFF(xmlPullParser, "interpolator") && (resourceId = LJI.getResourceId(i3, i3)) > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        LJI.recycle();
        if (LJI2 != null) {
            LJI2.recycle();
        }
        return valueAnimator2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x027c, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02cf, code lost:
    
        if (r27 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d1, code lost:
    
        if (r8 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d3, code lost:
    
        r3 = new android.animation.Animator[r8.size()];
        r2 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e1, code lost:
    
        if (r2.hasNext() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e3, code lost:
    
        r3[r4] = r2.next();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ed, code lost:
    
        if (r28 != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ef, code lost:
    
        r27.playTogether(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02f3, code lost:
    
        r27.playSequentially(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02f2, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
    
        if (LIZLLL(r6.type) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator LIZ(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FM.LIZ(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }
}
