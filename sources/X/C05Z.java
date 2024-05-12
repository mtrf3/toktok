package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.R$id;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.05Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05Z {
    public final C45601qe LIZ;
    public AnonymousClass069 LIZIZ;
    public C05Y LIZJ;
    public C05Y LJ;
    public MotionEvent LJIIJJI;
    public C05S LJIILJJIL;
    public boolean LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public final ArrayList<C05Y> LIZLLL = new ArrayList<>();
    public final ArrayList<C05Y> LJFF = new ArrayList<>();
    public final SparseArray<AnonymousClass064> LJI = new SparseArray<>();
    public final HashMap<String, Integer> LJII = new HashMap<>();
    public final SparseIntArray LJIIIIZZ = new SparseIntArray();
    public int LJIIIZ = LiveChatShowDelayForHotLiveSetting.DEFAULT;
    public int LJIIJ = 0;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;

    public final Interpolator LIZLLL() {
        C05Y c05y = this.LIZJ;
        int i = c05y.LJ;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return new BounceInterpolator();
                            }
                            return new AnticipateInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            final C11Y LIZJ = C11Y.LIZJ(c05y.LJFF);
            return new Interpolator() { // from class: X.05W
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) C11Y.this.LIZ(f);
                }
            };
        }
        return AnimationUtils.loadInterpolator(this.LIZ.getContext(), this.LIZJ.LJI);
    }

    public final float LJFF() {
        C017405a c017405a;
        C05Y c05y = this.LIZJ;
        if (c05y != null && (c017405a = c05y.LJIIJJI) != null) {
            return c017405a.LJIILLIIL;
        }
        return 0.0f;
    }

    public final int LJI() {
        C05Y c05y = this.LIZJ;
        if (c05y == null) {
            return -1;
        }
        return c05y.LIZLLL;
    }

    public final boolean LJIIL() {
        Iterator<C05Y> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIIJJI != null) {
                return true;
            }
        }
        C05Y c05y = this.LIZJ;
        if (c05y != null && c05y.LJIIJJI != null) {
            return true;
        }
        return false;
    }

    public final AnonymousClass064 LIZIZ(int i) {
        int LIZ;
        AnonymousClass069 anonymousClass069 = this.LIZIZ;
        if (anonymousClass069 != null && (LIZ = anonymousClass069.LIZ(i)) != -1) {
            i = LIZ;
        }
        if (this.LJI.get(i) == null) {
            SparseArray<AnonymousClass064> sparseArray = this.LJI;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.LJI.get(i);
    }

    public final void LJ(C267313d c267313d) {
        C05Y c05y = this.LIZJ;
        if (c05y == null) {
            C05Y c05y2 = this.LJ;
            if (c05y2 != null) {
                Iterator<C13Y> it = c05y2.LJIIJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(c267313d);
                }
                return;
            }
            return;
        }
        Iterator<C13Y> it2 = c05y.LJIIJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c267313d);
        }
    }

    public final void LJIIIZ(int i) {
        int i2 = this.LJIIIIZZ.get(i);
        if (i2 > 0) {
            LJIIIZ(this.LJIIIIZZ.get(i));
            AnonymousClass064 anonymousClass064 = this.LJI.get(i);
            AnonymousClass064 anonymousClass0642 = this.LJI.get(i2);
            if (anonymousClass0642 == null) {
                return;
            }
            anonymousClass064.getClass();
            for (Integer num : anonymousClass0642.LIZJ.keySet()) {
                int intValue = num.intValue();
                C019905z c019905z = anonymousClass0642.LIZJ.get(num);
                if (!anonymousClass064.LIZJ.containsKey(Integer.valueOf(intValue))) {
                    anonymousClass064.LIZJ.put(Integer.valueOf(intValue), new C019905z());
                }
                C019905z c019905z2 = anonymousClass064.LIZJ.get(Integer.valueOf(intValue));
                AnonymousClass060 anonymousClass060 = c019905z2.LIZLLL;
                if (!anonymousClass060.LIZIZ) {
                    anonymousClass060.LIZ(c019905z.LIZLLL);
                }
                AnonymousClass062 anonymousClass062 = c019905z2.LIZIZ;
                if (!anonymousClass062.LIZ) {
                    AnonymousClass062 anonymousClass0622 = c019905z.LIZIZ;
                    anonymousClass062.LIZ = anonymousClass0622.LIZ;
                    anonymousClass062.LIZIZ = anonymousClass0622.LIZIZ;
                    anonymousClass062.LIZLLL = anonymousClass0622.LIZLLL;
                    anonymousClass062.LJ = anonymousClass0622.LJ;
                    anonymousClass062.LIZJ = anonymousClass0622.LIZJ;
                }
                AnonymousClass063 anonymousClass063 = c019905z2.LJ;
                if (!anonymousClass063.LIZ) {
                    anonymousClass063.LIZ(c019905z.LJ);
                }
                AnonymousClass061 anonymousClass061 = c019905z2.LIZJ;
                if (!anonymousClass061.LIZ) {
                    anonymousClass061.LIZ(c019905z.LIZJ);
                }
                for (String str : c019905z.LJFF.keySet()) {
                    if (!c019905z2.LJFF.containsKey(str)) {
                        c019905z2.LJFF.put(str, c019905z.LJFF.get(str));
                    }
                }
            }
            this.LJIIIIZZ.put(i, -1);
        }
    }

    public final void LJIIJ(C45601qe c45601qe) {
        for (int i = 0; i < this.LJI.size(); i++) {
            int keyAt = this.LJI.keyAt(i);
            int i2 = this.LJIIIIZZ.get(keyAt);
            int size = this.LJIIIIZZ.size();
            while (i2 > 0) {
                if (i2 == keyAt) {
                    return;
                }
                int i3 = size - 1;
                if (size < 0) {
                    return;
                }
                i2 = this.LJIIIIZZ.get(i2);
                size = i3;
            }
            LJIIIZ(keyAt);
        }
        for (int i4 = 0; i4 < this.LJI.size(); i4++) {
            AnonymousClass064 valueAt = this.LJI.valueAt(i4);
            valueAt.getClass();
            int childCount = c45601qe.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = c45601qe.getChildAt(i5);
                C018905p c018905p = (C018905p) childAt.getLayoutParams();
                int id = childAt.getId();
                if (!valueAt.LIZIZ || id != -1) {
                    if (!valueAt.LIZJ.containsKey(Integer.valueOf(id))) {
                        valueAt.LIZJ.put(Integer.valueOf(id), new C019905z());
                    }
                    C019905z c019905z = valueAt.LIZJ.get(Integer.valueOf(id));
                    if (!c019905z.LIZLLL.LIZIZ) {
                        c019905z.LIZIZ(id, c018905p);
                        if (childAt instanceof AbstractC019505v) {
                            c019905z.LIZLLL.LJJJZ = ((AbstractC019505v) childAt).getReferencedIds();
                            if (childAt instanceof C1AF) {
                                C1AF c1af = (C1AF) childAt;
                                c019905z.LIZLLL.LJJLIIIJILLIZJL = c1af.allowsGoneWidget();
                                c019905z.LIZLLL.LJJJLIIL = c1af.getType();
                                c019905z.LIZLLL.LJJJLL = c1af.getMargin();
                            }
                        }
                        c019905z.LIZLLL.LIZIZ = true;
                    }
                    AnonymousClass062 anonymousClass062 = c019905z.LIZIZ;
                    if (!anonymousClass062.LIZ) {
                        anonymousClass062.LIZIZ = childAt.getVisibility();
                        c019905z.LIZIZ.LIZLLL = childAt.getAlpha();
                        c019905z.LIZIZ.LIZ = true;
                    }
                    AnonymousClass063 anonymousClass063 = c019905z.LJ;
                    if (!anonymousClass063.LIZ) {
                        anonymousClass063.LIZ = true;
                        anonymousClass063.LIZIZ = childAt.getRotation();
                        c019905z.LJ.LIZJ = childAt.getRotationX();
                        c019905z.LJ.LIZLLL = childAt.getRotationY();
                        c019905z.LJ.LJ = childAt.getScaleX();
                        c019905z.LJ.LJFF = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || pivotY != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            AnonymousClass063 anonymousClass0632 = c019905z.LJ;
                            anonymousClass0632.LJI = pivotX;
                            anonymousClass0632.LJII = pivotY;
                        }
                        c019905z.LJ.LJIIIIZZ = childAt.getTranslationX();
                        c019905z.LJ.LJIIIZ = childAt.getTranslationY();
                        c019905z.LJ.LJIIJ = childAt.getTranslationZ();
                        AnonymousClass063 anonymousClass0633 = c019905z.LJ;
                        if (anonymousClass0633.LJIIJJI) {
                            anonymousClass0633.LJIIL = childAt.getElevation();
                        }
                    }
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
    }

    public static final int LIZJ(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (i != -1) {
                return i;
            }
        } else {
            i = -1;
        }
        if (str.length() > 1) {
            return CastIntegerProtector.parseInt(str.substring(1));
        }
        return i;
    }

    public final boolean LIZ(C45601qe c45601qe, int i) {
        if (this.LJIILJJIL != null) {
            return false;
        }
        Iterator<C05Y> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            C05Y next = it.next();
            int i2 = next.LJIILIIL;
            if (i2 != 0 && this.LIZJ != next) {
                if (i == next.LIZLLL && (i2 == 4 || i2 == 2)) {
                    C05V c05v = C05V.FINISHED;
                    c45601qe.setState(c05v);
                    c45601qe.setTransition(next);
                    if (next.LJIILIIL == 4) {
                        c45601qe.LJJLJLI(1.0f);
                        c45601qe.setState(C05V.SETUP);
                        c45601qe.setState(C05V.MOVING);
                    } else {
                        c45601qe.setProgress(1.0f);
                        c45601qe.LJJLL(true);
                        c45601qe.setState(C05V.SETUP);
                        c45601qe.setState(C05V.MOVING);
                        c45601qe.setState(c05v);
                        c45601qe.LJLIIIL();
                    }
                    return true;
                }
                if (i == next.LIZJ && (i2 == 3 || i2 == 1)) {
                    C05V c05v2 = C05V.FINISHED;
                    c45601qe.setState(c05v2);
                    c45601qe.setTransition(next);
                    if (next.LJIILIIL == 3) {
                        c45601qe.LJJLJLI(0.0f);
                        c45601qe.setState(C05V.SETUP);
                        c45601qe.setState(C05V.MOVING);
                    } else {
                        c45601qe.setProgress(0.0f);
                        c45601qe.LJJLL(true);
                        c45601qe.setState(C05V.SETUP);
                        c45601qe.setState(C05V.MOVING);
                        c45601qe.setState(c05v2);
                        c45601qe.LJLIIIL();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJII(Context context, XmlPullParser xmlPullParser) {
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LIZIZ = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            if (!attributeName.equals("deriveConstraintsFrom")) {
                if (attributeName.equals("id")) {
                    i = LIZJ(context, attributeValue);
                    HashMap<String, Integer> hashMap = this.LJII;
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    hashMap.put(attributeValue, Integer.valueOf(i));
                }
            } else {
                i2 = LIZJ(context, attributeValue);
            }
        }
        if (i != -1) {
            anonymousClass064.LJIIZILJ(context, xmlPullParser);
            if (i2 != -1) {
                this.LJIIIIZZ.put(i, i2);
            }
            this.LJI.put(i, anonymousClass064);
        }
    }

    public final void LJIIIIZZ(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.a9j, R.attr.akx});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.LJIIIZ = obtainStyledAttributes.getInt(index, this.LJIIIZ);
            } else if (index == 1) {
                this.LJIIJ = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r8, int r9) {
        /*
            r7 = this;
            X.069 r0 = r7.LIZIZ
            r6 = -1
            if (r0 == 0) goto L41
            int r5 = r0.LIZ(r8)
            if (r5 == r6) goto L3f
        Lb:
            X.069 r0 = r7.LIZIZ
            int r4 = r0.LIZ(r9)
            if (r4 == r6) goto L42
        L13:
            java.util.ArrayList<X.05Y> r0 = r7.LIZLLL
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r2 = r3.next()
            X.05Y r2 = (X.C05Y) r2
            int r1 = r2.LIZJ
            if (r1 != r4) goto L2d
            int r0 = r2.LIZLLL
            if (r0 == r5) goto L33
        L2d:
            if (r1 != r9) goto L19
            int r0 = r2.LIZLLL
            if (r0 != r8) goto L19
        L33:
            r7.LIZJ = r2
            X.05a r1 = r2.LJIIJJI
            if (r1 == 0) goto L3e
            boolean r0 = r7.LJIILL
            r1.LIZIZ(r0)
        L3e:
            return
        L3f:
            r5 = r8
            goto Lb
        L41:
            r5 = r8
        L42:
            r4 = r9
            goto L13
        L44:
            X.05Y r3 = r7.LJ
            java.util.ArrayList<X.05Y> r0 = r7.LJFF
            java.util.Iterator r2 = r0.iterator()
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r2.next()
            X.05Y r1 = (X.C05Y) r1
            int r0 = r1.LIZJ
            if (r0 != r9) goto L4c
            r3 = r1
            goto L4c
        L5e:
            X.05Y r1 = new X.05Y
            r1.<init>(r7, r3)
            r1.LIZLLL = r5
            r1.LIZJ = r4
            if (r5 == r6) goto L6e
            java.util.ArrayList<X.05Y> r0 = r7.LIZLLL
            r0.add(r1)
        L6e:
            r7.LIZJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05Z.LJIIJJI(int, int):void");
    }

    public C05Z(Context context, C45601qe c45601qe, int i) {
        C05Y c05y = null;
        this.LJ = null;
        this.LIZ = c45601qe;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    LJII(context, xml);
                                    break;
                                } else {
                                    break;
                                }
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c05y.LJIIJ.add(new C13Y(context, xml));
                                    break;
                                } else {
                                    break;
                                }
                            case 269306229:
                                if (name.equals("Transition")) {
                                    ArrayList<C05Y> arrayList = this.LIZLLL;
                                    c05y = new C05Y(this, context, xml);
                                    arrayList.add(c05y);
                                    if (this.LIZJ == null && !c05y.LIZIZ) {
                                        this.LIZJ = c05y;
                                        C017405a c017405a = c05y.LJIIJJI;
                                        if (c017405a != null) {
                                            c017405a.LIZIZ(this.LJIILL);
                                        }
                                    }
                                    if (c05y.LIZIZ) {
                                        if (c05y.LIZJ == -1) {
                                            this.LJ = c05y;
                                        } else {
                                            this.LJFF.add(c05y);
                                        }
                                        this.LIZLLL.remove(c05y);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c05y.LJIIL.add(new C05X(context, c05y, xml));
                                    break;
                                } else {
                                    break;
                                }
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    if (c05y == null) {
                                        context.getResources().getResourceEntryName(i);
                                        xml.getLineNumber();
                                    }
                                    c05y.LJIIJJI = new C017405a(context, this.LIZ, xml);
                                    break;
                                } else {
                                    break;
                                }
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    LJIIIIZZ(context, xml);
                                    break;
                                } else {
                                    break;
                                }
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    this.LIZIZ = new AnonymousClass069(context, xml);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        } catch (XmlPullParserException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        SparseArray<AnonymousClass064> sparseArray = this.LJI;
        int i2 = R$id.motion_base;
        sparseArray.put(i2, new AnonymousClass064());
        this.LJII.put("motion_base", Integer.valueOf(i2));
    }
}
