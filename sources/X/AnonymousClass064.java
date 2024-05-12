package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$id;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.064, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass064 {
    public static final int[] LIZLLL = {0, 4, 8};
    public static final SparseIntArray LJ;
    public final HashMap<String, C019405u> LIZ = new HashMap<>();
    public boolean LIZIZ = true;
    public final HashMap<Integer, C019905z> LIZJ = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJ = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(102, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(107, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(104, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(103, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(105, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    public static String LJIL(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void LIZ(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                if (!this.LIZIZ || id != -1) {
                    if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                        C019405u.LJFF(childAt, this.LIZJ.get(Integer.valueOf(id)).LJFF);
                    }
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
    }

    public final void LIZIZ(ConstraintLayout constraintLayout) {
        LIZJ(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void LIZJ(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.LIZJ.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.LIZJ.containsKey(Integer.valueOf(id))) {
                if (!this.LIZIZ || id != -1) {
                    if (id != -1 && this.LIZJ.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C019905z c019905z = this.LIZJ.get(Integer.valueOf(id));
                        if (childAt instanceof C1AF) {
                            c019905z.LIZLLL.LJJJLZIJ = 1;
                        }
                        int i2 = c019905z.LIZLLL.LJJJLZIJ;
                        if (i2 != -1 && i2 == 1) {
                            C1AF c1af = (C1AF) childAt;
                            c1af.setId(id);
                            c1af.setType(c019905z.LIZLLL.LJJJLIIL);
                            c1af.setMargin(c019905z.LIZLLL.LJJJLL);
                            c1af.setAllowsGoneWidget(c019905z.LIZLLL.LJJLIIIJILLIZJL);
                            AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                            int[] iArr = anonymousClass060.LJJJZ;
                            if (iArr != null) {
                                c1af.setReferencedIds(iArr);
                            } else {
                                String str = anonymousClass060.LJJL;
                                if (str != null) {
                                    anonymousClass060.LJJJZ = LJIILIIL(c1af, str);
                                    c1af.setReferencedIds(c019905z.LIZLLL.LJJJZ);
                                }
                            }
                        }
                        C018905p c018905p = (C018905p) childAt.getLayoutParams();
                        c018905p.validate();
                        c019905z.LIZ(c018905p);
                        C019405u.LJFF(childAt, c019905z.LJFF);
                        childAt.setLayoutParams(c018905p);
                        AnonymousClass062 anonymousClass062 = c019905z.LIZIZ;
                        if (anonymousClass062.LIZJ == 0) {
                            childAt.setVisibility(anonymousClass062.LIZIZ);
                        }
                        childAt.setAlpha(c019905z.LIZIZ.LIZLLL);
                        childAt.setRotation(c019905z.LJ.LIZIZ);
                        childAt.setRotationX(c019905z.LJ.LIZJ);
                        childAt.setRotationY(c019905z.LJ.LIZLLL);
                        childAt.setScaleX(c019905z.LJ.LJ);
                        childAt.setScaleY(c019905z.LJ.LJFF);
                        if (!Float.isNaN(c019905z.LJ.LJI)) {
                            childAt.setPivotX(c019905z.LJ.LJI);
                        }
                        if (!Float.isNaN(c019905z.LJ.LJII)) {
                            childAt.setPivotY(c019905z.LJ.LJII);
                        }
                        childAt.setTranslationX(c019905z.LJ.LJIIIIZZ);
                        childAt.setTranslationY(c019905z.LJ.LJIIIZ);
                        childAt.setTranslationZ(c019905z.LJ.LJIIJ);
                        AnonymousClass063 anonymousClass063 = c019905z.LJ;
                        if (anonymousClass063.LJIIJJI) {
                            childAt.setElevation(anonymousClass063.LJIIL);
                        }
                    }
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C019905z c019905z2 = this.LIZJ.get(num);
            int i3 = c019905z2.LIZLLL.LJJJLZIJ;
            if (i3 != -1 && i3 == 1) {
                C1AF c1af2 = new C1AF(constraintLayout.getContext());
                c1af2.setId(num.intValue());
                AnonymousClass060 anonymousClass0602 = c019905z2.LIZLLL;
                int[] iArr2 = anonymousClass0602.LJJJZ;
                if (iArr2 != null) {
                    c1af2.setReferencedIds(iArr2);
                } else {
                    String str2 = anonymousClass0602.LJJL;
                    if (str2 != null) {
                        anonymousClass0602.LJJJZ = LJIILIIL(c1af2, str2);
                        c1af2.setReferencedIds(c019905z2.LIZLLL.LJJJZ);
                    }
                }
                c1af2.setType(c019905z2.LIZLLL.LJJJLIIL);
                c1af2.setMargin(c019905z2.LIZLLL.LJJJLL);
                C018905p generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c1af2.validateParams();
                c019905z2.LIZ(generateDefaultLayoutParams);
                constraintLayout.addView(c1af2, generateDefaultLayoutParams);
            }
            if (c019905z2.LIZLLL.LIZ) {
                View c019005q = new C019005q(constraintLayout.getContext());
                c019005q.setId(num.intValue());
                C018905p generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c019905z2.LIZ(generateDefaultLayoutParams2);
                constraintLayout.addView(c019005q, generateDefaultLayoutParams2);
            }
        }
    }

    public final void LJ(int i) {
        LIZLLL(i, 0, 1, 0, 2);
    }

    public final void LJFF(int i) {
        this.LIZJ.remove(Integer.valueOf(i));
    }

    public final void LJII(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.LIZJ.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C018905p c018905p = (C018905p) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.LIZIZ || id != -1) {
                if (!this.LIZJ.containsKey(Integer.valueOf(id))) {
                    this.LIZJ.put(Integer.valueOf(id), new C019905z());
                }
                C019905z c019905z = this.LIZJ.get(Integer.valueOf(id));
                HashMap<String, C019405u> hashMap = this.LIZ;
                HashMap<String, C019405u> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    C019405u c019405u = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2.put(str, new C019405u(c019405u, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("getMap");
                            LIZ.append(str);
                            try {
                                hashMap2.put(str, new C019405u(c019405u, cls.getMethod(X1D.LIZIZ(LIZ), new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e) {
                                e = e;
                                C16880lQ.LLLLIIL(e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                C16880lQ.LLLLIIL(e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                    }
                }
                c019905z.LJFF = hashMap2;
                c019905z.LIZIZ(id, c018905p);
                c019905z.LIZIZ.LIZIZ = childAt.getVisibility();
                c019905z.LIZIZ.LIZLLL = childAt.getAlpha();
                c019905z.LJ.LIZIZ = childAt.getRotation();
                c019905z.LJ.LIZJ = childAt.getRotationX();
                c019905z.LJ.LIZLLL = childAt.getRotationY();
                c019905z.LJ.LJ = childAt.getScaleX();
                c019905z.LJ.LJFF = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || pivotY != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    AnonymousClass063 anonymousClass063 = c019905z.LJ;
                    anonymousClass063.LJI = pivotX;
                    anonymousClass063.LJII = pivotY;
                }
                c019905z.LJ.LJIIIIZZ = childAt.getTranslationX();
                c019905z.LJ.LJIIIZ = childAt.getTranslationY();
                c019905z.LJ.LJIIJ = childAt.getTranslationZ();
                AnonymousClass063 anonymousClass0632 = c019905z.LJ;
                if (anonymousClass0632.LJIIJJI) {
                    anonymousClass0632.LJIIL = childAt.getElevation();
                }
                if (childAt instanceof C1AF) {
                    C1AF c1af = (C1AF) childAt;
                    c019905z.LIZLLL.LJJLIIIJILLIZJL = c1af.allowsGoneWidget();
                    c019905z.LIZLLL.LJJJZ = c1af.getReferencedIds();
                    c019905z.LIZLLL.LJJJLIIL = c1af.getType();
                    c019905z.LIZLLL.LJJJLL = c1af.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final C019905z LJIILL(int i) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C019905z());
        }
        return this.LIZJ.get(Integer.valueOf(i));
    }

    public static int[] LJIILIIL(C1AF c1af, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = c1af.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c1af.isInEditMode() && (c1af.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) c1af.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public static C019905z LJIILJJIL(Context context, AttributeSet attributeSet) {
        C019905z c019905z = new C019905z();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.zhiliaoapp.musically.R.attr.w1, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.aa1, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.b1e, com.zhiliaoapp.musically.R.attr.b44, com.zhiliaoapp.musically.R.attr.b4o, com.zhiliaoapp.musically.R.attr.bky, com.zhiliaoapp.musically.R.attr.bl0, com.zhiliaoapp.musically.R.attr.bwc});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                c019905z.LIZJ.LIZ = true;
                c019905z.LIZLLL.LIZIZ = true;
                c019905z.LIZIZ.LIZ = true;
                c019905z.LJ.LIZ = true;
            }
            switch (LJ.get(index)) {
                case 1:
                    AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                    anonymousClass060.LJIILL = LJIJ(obtainStyledAttributes, index, anonymousClass060.LJIILL);
                    break;
                case 2:
                    AnonymousClass060 anonymousClass0602 = c019905z.LIZLLL;
                    anonymousClass0602.LJJIJ = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass0602.LJJIJ);
                    break;
                case 3:
                    AnonymousClass060 anonymousClass0603 = c019905z.LIZLLL;
                    anonymousClass0603.LJIILJJIL = LJIJ(obtainStyledAttributes, index, anonymousClass0603.LJIILJJIL);
                    break;
                case 4:
                    AnonymousClass060 anonymousClass0604 = c019905z.LIZLLL;
                    anonymousClass0604.LJIILIIL = LJIJ(obtainStyledAttributes, index, anonymousClass0604.LJIILIIL);
                    break;
                case 5:
                    c019905z.LIZLLL.LJIL = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 6:
                    AnonymousClass060 anonymousClass0605 = c019905z.LIZLLL;
                    anonymousClass0605.LJJII = obtainStyledAttributes.getDimensionPixelOffset(index, anonymousClass0605.LJJII);
                    break;
                case 7:
                    AnonymousClass060 anonymousClass0606 = c019905z.LIZLLL;
                    anonymousClass0606.LJJIII = obtainStyledAttributes.getDimensionPixelOffset(index, anonymousClass0606.LJJIII);
                    break;
                case 8:
                    AnonymousClass060 anonymousClass0607 = c019905z.LIZLLL;
                    anonymousClass0607.LJJIJIIJI = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass0607.LJJIJIIJI);
                    break;
                case 9:
                    AnonymousClass060 anonymousClass0608 = c019905z.LIZLLL;
                    anonymousClass0608.LJIJI = LJIJ(obtainStyledAttributes, index, anonymousClass0608.LJIJI);
                    break;
                case 10:
                    AnonymousClass060 anonymousClass0609 = c019905z.LIZLLL;
                    anonymousClass0609.LJIJ = LJIJ(obtainStyledAttributes, index, anonymousClass0609.LJIJ);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    AnonymousClass060 anonymousClass06010 = c019905z.LIZLLL;
                    anonymousClass06010.LJJIL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06010.LJJIL);
                    break;
                case 12:
                    AnonymousClass060 anonymousClass06011 = c019905z.LIZLLL;
                    anonymousClass06011.LJJIZ = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06011.LJJIZ);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    AnonymousClass060 anonymousClass06012 = c019905z.LIZLLL;
                    anonymousClass06012.LJJIJIL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06012.LJJIJIL);
                    break;
                case 14:
                    AnonymousClass060 anonymousClass06013 = c019905z.LIZLLL;
                    anonymousClass06013.LJJIJLIJ = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06013.LJJIJLIJ);
                    break;
                case 15:
                    AnonymousClass060 anonymousClass06014 = c019905z.LIZLLL;
                    anonymousClass06014.LJJJ = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06014.LJJJ);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    AnonymousClass060 anonymousClass06015 = c019905z.LIZLLL;
                    anonymousClass06015.LJJIJL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06015.LJJIJL);
                    break;
                case 17:
                    AnonymousClass060 anonymousClass06016 = c019905z.LIZLLL;
                    anonymousClass06016.LJ = obtainStyledAttributes.getDimensionPixelOffset(index, anonymousClass06016.LJ);
                    break;
                case 18:
                    AnonymousClass060 anonymousClass06017 = c019905z.LIZLLL;
                    anonymousClass06017.LJFF = obtainStyledAttributes.getDimensionPixelOffset(index, anonymousClass06017.LJFF);
                    break;
                case 19:
                    AnonymousClass060 anonymousClass06018 = c019905z.LIZLLL;
                    anonymousClass06018.LJI = obtainStyledAttributes.getFloat(index, anonymousClass06018.LJI);
                    break;
                case 20:
                    AnonymousClass060 anonymousClass06019 = c019905z.LIZLLL;
                    anonymousClass06019.LJIJJ = obtainStyledAttributes.getFloat(index, anonymousClass06019.LJIJJ);
                    break;
                case 21:
                    AnonymousClass060 anonymousClass06020 = c019905z.LIZLLL;
                    anonymousClass06020.LIZLLL = obtainStyledAttributes.getLayoutDimension(index, anonymousClass06020.LIZLLL);
                    break;
                case 22:
                    AnonymousClass062 anonymousClass062 = c019905z.LIZIZ;
                    anonymousClass062.LIZIZ = obtainStyledAttributes.getInt(index, anonymousClass062.LIZIZ);
                    AnonymousClass062 anonymousClass0622 = c019905z.LIZIZ;
                    anonymousClass0622.LIZIZ = LIZLLL[anonymousClass0622.LIZIZ];
                    break;
                case 23:
                    AnonymousClass060 anonymousClass06021 = c019905z.LIZLLL;
                    anonymousClass06021.LIZJ = obtainStyledAttributes.getLayoutDimension(index, anonymousClass06021.LIZJ);
                    break;
                case 24:
                    AnonymousClass060 anonymousClass06022 = c019905z.LIZLLL;
                    anonymousClass06022.LJJIIJZLJL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06022.LJJIIJZLJL);
                    break;
                case 25:
                    AnonymousClass060 anonymousClass06023 = c019905z.LIZLLL;
                    anonymousClass06023.LJII = LJIJ(obtainStyledAttributes, index, anonymousClass06023.LJII);
                    break;
                case 26:
                    AnonymousClass060 anonymousClass06024 = c019905z.LIZLLL;
                    anonymousClass06024.LJIIIIZZ = LJIJ(obtainStyledAttributes, index, anonymousClass06024.LJIIIIZZ);
                    break;
                case 27:
                    AnonymousClass060 anonymousClass06025 = c019905z.LIZLLL;
                    anonymousClass06025.LJJIIJ = obtainStyledAttributes.getInt(index, anonymousClass06025.LJJIIJ);
                    break;
                case 28:
                    AnonymousClass060 anonymousClass06026 = c019905z.LIZLLL;
                    anonymousClass06026.LJJIIZ = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06026.LJJIIZ);
                    break;
                case 29:
                    AnonymousClass060 anonymousClass06027 = c019905z.LIZLLL;
                    anonymousClass06027.LJIIIZ = LJIJ(obtainStyledAttributes, index, anonymousClass06027.LJIIIZ);
                    break;
                case 30:
                    AnonymousClass060 anonymousClass06028 = c019905z.LIZLLL;
                    anonymousClass06028.LJIIJ = LJIJ(obtainStyledAttributes, index, anonymousClass06028.LJIIJ);
                    break;
                case 31:
                    AnonymousClass060 anonymousClass06029 = c019905z.LIZLLL;
                    anonymousClass06029.LJJIJIIJIL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06029.LJJIJIIJIL);
                    break;
                case 32:
                    AnonymousClass060 anonymousClass06030 = c019905z.LIZLLL;
                    anonymousClass06030.LJIILLIIL = LJIJ(obtainStyledAttributes, index, anonymousClass06030.LJIILLIIL);
                    break;
                case 33:
                    AnonymousClass060 anonymousClass06031 = c019905z.LIZLLL;
                    anonymousClass06031.LJIIZILJ = LJIJ(obtainStyledAttributes, index, anonymousClass06031.LJIIZILJ);
                    break;
                case 34:
                    AnonymousClass060 anonymousClass06032 = c019905z.LIZLLL;
                    anonymousClass06032.LJJIIZI = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06032.LJJIIZI);
                    break;
                case 35:
                    AnonymousClass060 anonymousClass06033 = c019905z.LIZLLL;
                    anonymousClass06033.LJIIL = LJIJ(obtainStyledAttributes, index, anonymousClass06033.LJIIL);
                    break;
                case 36:
                    AnonymousClass060 anonymousClass06034 = c019905z.LIZLLL;
                    anonymousClass06034.LJIIJJI = LJIJ(obtainStyledAttributes, index, anonymousClass06034.LJIIJJI);
                    break;
                case 37:
                    AnonymousClass060 anonymousClass06035 = c019905z.LIZLLL;
                    anonymousClass06035.LJIJJLI = obtainStyledAttributes.getFloat(index, anonymousClass06035.LJIJJLI);
                    break;
                case 38:
                    c019905z.LIZ = obtainStyledAttributes.getResourceId(index, c019905z.LIZ);
                    break;
                case 39:
                    AnonymousClass060 anonymousClass06036 = c019905z.LIZLLL;
                    anonymousClass06036.LJJJIL = obtainStyledAttributes.getFloat(index, anonymousClass06036.LJJJIL);
                    break;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    AnonymousClass060 anonymousClass06037 = c019905z.LIZLLL;
                    anonymousClass06037.LJJJI = obtainStyledAttributes.getFloat(index, anonymousClass06037.LJJJI);
                    break;
                case 41:
                    AnonymousClass060 anonymousClass06038 = c019905z.LIZLLL;
                    anonymousClass06038.LJJJJ = obtainStyledAttributes.getInt(index, anonymousClass06038.LJJJJ);
                    break;
                case 42:
                    AnonymousClass060 anonymousClass06039 = c019905z.LIZLLL;
                    anonymousClass06039.LJJJJI = obtainStyledAttributes.getInt(index, anonymousClass06039.LJJJJI);
                    break;
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    AnonymousClass062 anonymousClass0623 = c019905z.LIZIZ;
                    anonymousClass0623.LIZLLL = obtainStyledAttributes.getFloat(index, anonymousClass0623.LIZLLL);
                    break;
                case 44:
                    AnonymousClass063 anonymousClass063 = c019905z.LJ;
                    anonymousClass063.LJIIJJI = true;
                    anonymousClass063.LJIIL = obtainStyledAttributes.getDimension(index, anonymousClass063.LJIIL);
                    break;
                case 45:
                    AnonymousClass063 anonymousClass0632 = c019905z.LJ;
                    anonymousClass0632.LIZJ = obtainStyledAttributes.getFloat(index, anonymousClass0632.LIZJ);
                    break;
                case 46:
                    AnonymousClass063 anonymousClass0633 = c019905z.LJ;
                    anonymousClass0633.LIZLLL = obtainStyledAttributes.getFloat(index, anonymousClass0633.LIZLLL);
                    break;
                case 47:
                    AnonymousClass063 anonymousClass0634 = c019905z.LJ;
                    anonymousClass0634.LJ = obtainStyledAttributes.getFloat(index, anonymousClass0634.LJ);
                    break;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    AnonymousClass063 anonymousClass0635 = c019905z.LJ;
                    anonymousClass0635.LJFF = obtainStyledAttributes.getFloat(index, anonymousClass0635.LJFF);
                    break;
                case C61447O9r.LJIIJ:
                    AnonymousClass063 anonymousClass0636 = c019905z.LJ;
                    anonymousClass0636.LJI = obtainStyledAttributes.getDimension(index, anonymousClass0636.LJI);
                    break;
                case 50:
                    AnonymousClass063 anonymousClass0637 = c019905z.LJ;
                    anonymousClass0637.LJII = obtainStyledAttributes.getDimension(index, anonymousClass0637.LJII);
                    break;
                case 51:
                    AnonymousClass063 anonymousClass0638 = c019905z.LJ;
                    anonymousClass0638.LJIIIIZZ = obtainStyledAttributes.getDimension(index, anonymousClass0638.LJIIIIZZ);
                    break;
                case 52:
                    AnonymousClass063 anonymousClass0639 = c019905z.LJ;
                    anonymousClass0639.LJIIIZ = obtainStyledAttributes.getDimension(index, anonymousClass0639.LJIIIZ);
                    break;
                case 53:
                    AnonymousClass063 anonymousClass06310 = c019905z.LJ;
                    anonymousClass06310.LJIIJ = obtainStyledAttributes.getDimension(index, anonymousClass06310.LJIIJ);
                    break;
                case 54:
                    AnonymousClass060 anonymousClass06040 = c019905z.LIZLLL;
                    anonymousClass06040.LJJJJIZL = obtainStyledAttributes.getInt(index, anonymousClass06040.LJJJJIZL);
                    break;
                case 55:
                    AnonymousClass060 anonymousClass06041 = c019905z.LIZLLL;
                    anonymousClass06041.LJJJJJ = obtainStyledAttributes.getInt(index, anonymousClass06041.LJJJJJ);
                    break;
                case 56:
                    AnonymousClass060 anonymousClass06042 = c019905z.LIZLLL;
                    anonymousClass06042.LJJJJJL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06042.LJJJJJL);
                    break;
                case 57:
                    AnonymousClass060 anonymousClass06043 = c019905z.LIZLLL;
                    anonymousClass06043.LJJJJL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06043.LJJJJL);
                    break;
                case 58:
                    AnonymousClass060 anonymousClass06044 = c019905z.LIZLLL;
                    anonymousClass06044.LJJJJLI = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06044.LJJJJLI);
                    break;
                case 59:
                    AnonymousClass060 anonymousClass06045 = c019905z.LIZLLL;
                    anonymousClass06045.LJJJJLL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06045.LJJJJLL);
                    break;
                case 60:
                    AnonymousClass063 anonymousClass06311 = c019905z.LJ;
                    anonymousClass06311.LIZIZ = obtainStyledAttributes.getFloat(index, anonymousClass06311.LIZIZ);
                    break;
                case 61:
                    AnonymousClass060 anonymousClass06046 = c019905z.LIZLLL;
                    anonymousClass06046.LJJ = LJIJ(obtainStyledAttributes, index, anonymousClass06046.LJJ);
                    break;
                case BaseNotice.CREATOR /* 62 */:
                    AnonymousClass060 anonymousClass06047 = c019905z.LIZLLL;
                    anonymousClass06047.LJJI = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06047.LJJI);
                    break;
                case 63:
                    AnonymousClass060 anonymousClass06048 = c019905z.LIZLLL;
                    anonymousClass06048.LJJIFFI = obtainStyledAttributes.getFloat(index, anonymousClass06048.LJJIFFI);
                    break;
                case 64:
                    AnonymousClass061 anonymousClass061 = c019905z.LIZJ;
                    anonymousClass061.LIZIZ = LJIJ(obtainStyledAttributes, index, anonymousClass061.LIZIZ);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        c019905z.LIZJ.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                        break;
                    } else {
                        c019905z.LIZJ.LIZJ = C11Y.LIZJ[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c019905z.LIZJ.LJ = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    AnonymousClass061 anonymousClass0612 = c019905z.LIZJ;
                    anonymousClass0612.LJI = obtainStyledAttributes.getFloat(index, anonymousClass0612.LJI);
                    break;
                case 68:
                    AnonymousClass062 anonymousClass0624 = c019905z.LIZIZ;
                    anonymousClass0624.LJ = obtainStyledAttributes.getFloat(index, anonymousClass0624.LJ);
                    break;
                case 69:
                    c019905z.LIZLLL.LJJJJZ = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c019905z.LIZLLL.LJJJJZI = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                    AnonymousClass060 anonymousClass06049 = c019905z.LIZLLL;
                    anonymousClass06049.LJJJLIIL = obtainStyledAttributes.getInt(index, anonymousClass06049.LJJJLIIL);
                    break;
                case 73:
                    AnonymousClass060 anonymousClass06050 = c019905z.LIZLLL;
                    anonymousClass06050.LJJJLL = obtainStyledAttributes.getDimensionPixelSize(index, anonymousClass06050.LJJJLL);
                    break;
                case 74:
                    c019905z.LIZLLL.LJJL = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 75:
                    AnonymousClass060 anonymousClass06051 = c019905z.LIZLLL;
                    anonymousClass06051.LJJLIIIJILLIZJL = obtainStyledAttributes.getBoolean(index, anonymousClass06051.LJJLIIIJILLIZJL);
                    break;
                case 76:
                    AnonymousClass061 anonymousClass0613 = c019905z.LIZJ;
                    anonymousClass0613.LIZLLL = obtainStyledAttributes.getInt(index, anonymousClass0613.LIZLLL);
                    break;
                case 77:
                    c019905z.LIZLLL.LJJLI = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 78:
                    AnonymousClass062 anonymousClass0625 = c019905z.LIZIZ;
                    anonymousClass0625.LIZJ = obtainStyledAttributes.getInt(index, anonymousClass0625.LIZJ);
                    break;
                case 79:
                    AnonymousClass061 anonymousClass0614 = c019905z.LIZJ;
                    anonymousClass0614.LJFF = obtainStyledAttributes.getFloat(index, anonymousClass0614.LJFF);
                    break;
                case 80:
                    AnonymousClass060 anonymousClass06052 = c019905z.LIZLLL;
                    anonymousClass06052.LJJLIIIIJ = obtainStyledAttributes.getBoolean(index, anonymousClass06052.LJJLIIIIJ);
                    break;
                case 81:
                    AnonymousClass060 anonymousClass06053 = c019905z.LIZLLL;
                    anonymousClass06053.LJJLIIIJ = obtainStyledAttributes.getBoolean(index, anonymousClass06053.LJJLIIIJ);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c019905z;
    }

    public final void LJI(int i, int i2) {
        if (this.LIZJ.containsKey(Integer.valueOf(i))) {
            C019905z c019905z = this.LIZJ.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                    anonymousClass060.LJIIIIZZ = -1;
                    anonymousClass060.LJII = -1;
                    anonymousClass060.LJJIIJZLJL = -1;
                    anonymousClass060.LJJIJIL = -1;
                    return;
                case 2:
                    AnonymousClass060 anonymousClass0602 = c019905z.LIZLLL;
                    anonymousClass0602.LJIIJ = -1;
                    anonymousClass0602.LJIIIZ = -1;
                    anonymousClass0602.LJJIIZ = -1;
                    anonymousClass0602.LJJIJLIJ = -1;
                    return;
                case 3:
                    AnonymousClass060 anonymousClass0603 = c019905z.LIZLLL;
                    anonymousClass0603.LJIIL = -1;
                    anonymousClass0603.LJIIJJI = -1;
                    anonymousClass0603.LJJIIZI = -1;
                    anonymousClass0603.LJJIJL = -1;
                    return;
                case 4:
                    AnonymousClass060 anonymousClass0604 = c019905z.LIZLLL;
                    anonymousClass0604.LJIILIIL = -1;
                    anonymousClass0604.LJIILJJIL = -1;
                    anonymousClass0604.LJJIJ = -1;
                    anonymousClass0604.LJJIL = -1;
                    return;
                case 5:
                    c019905z.LIZLLL.LJIILL = -1;
                    return;
                case 6:
                    AnonymousClass060 anonymousClass0605 = c019905z.LIZLLL;
                    anonymousClass0605.LJIILLIIL = -1;
                    anonymousClass0605.LJIIZILJ = -1;
                    anonymousClass0605.LJJIJIIJIL = -1;
                    anonymousClass0605.LJJJ = -1;
                    return;
                case 7:
                    AnonymousClass060 anonymousClass0606 = c019905z.LIZLLL;
                    anonymousClass0606.LJIJ = -1;
                    anonymousClass0606.LJIJI = -1;
                    anonymousClass0606.LJJIJIIJI = -1;
                    anonymousClass0606.LJJIZ = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void LJIIJ(int i, int i2) {
        LJIILL(i).LIZLLL.LIZLLL = i2;
    }

    public final void LJIIJJI(float f, int i) {
        LJIILL(i).LIZLLL.LJJJJZ = f;
    }

    public final void LJIIL(int i, int i2) {
        LJIILL(i).LIZLLL.LIZJ = i2;
    }

    public final void LJIILLIIL(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        C019905z LJIILJJIL = LJIILJJIL(context, android.util.Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            LJIILJJIL.LIZLLL.LIZ = true;
                        }
                        this.LIZJ.put(Integer.valueOf(LJIILJJIL.LIZ), LJIILJJIL);
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass064.LJIIZILJ(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void LJIJI(int i, String str) {
        LJIILL(i).LIZLLL.LJIL = str;
    }

    public final void LJIJJ(float f, int i) {
        LJIILL(i).LIZLLL.LJIJJ = f;
    }

    public static int LJIJ(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public final void LJIJJLI(int i, int i2, int i3) {
        C019905z LJIILL = LJIILL(i);
        switch (i2) {
            case 1:
                LJIILL.LIZLLL.LJJIIJZLJL = i3;
                return;
            case 2:
                LJIILL.LIZLLL.LJJIIZ = i3;
                return;
            case 3:
                LJIILL.LIZLLL.LJJIIZI = i3;
                return;
            case 4:
                LJIILL.LIZLLL.LJJIJ = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                LJIILL.LIZLLL.LJJIJIIJIL = i3;
                return;
            case 7:
                LJIILL.LIZLLL.LJJIJIIJI = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C019905z());
        }
        C019905z c019905z = this.LIZJ.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                    anonymousClass060.LJII = i3;
                    anonymousClass060.LJIIIIZZ = -1;
                    return;
                } else if (i4 == 2) {
                    AnonymousClass060 anonymousClass0602 = c019905z.LIZLLL;
                    anonymousClass0602.LJIIIIZZ = i3;
                    anonymousClass0602.LJII = -1;
                    return;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("left to ");
                    LIZ.append(LJIL(i4));
                    LIZ.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            case 2:
                if (i4 == 1) {
                    AnonymousClass060 anonymousClass0603 = c019905z.LIZLLL;
                    anonymousClass0603.LJIIIZ = i3;
                    anonymousClass0603.LJIIJ = -1;
                    return;
                } else if (i4 == 2) {
                    AnonymousClass060 anonymousClass0604 = c019905z.LIZLLL;
                    anonymousClass0604.LJIIJ = i3;
                    anonymousClass0604.LJIIIZ = -1;
                    return;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("right to ");
                    LIZ2.append(LJIL(i4));
                    LIZ2.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
            case 3:
                if (i4 == 3) {
                    AnonymousClass060 anonymousClass0605 = c019905z.LIZLLL;
                    anonymousClass0605.LJIIJJI = i3;
                    anonymousClass0605.LJIIL = -1;
                    anonymousClass0605.LJIILL = -1;
                    return;
                }
                if (i4 == 4) {
                    AnonymousClass060 anonymousClass0606 = c019905z.LIZLLL;
                    anonymousClass0606.LJIIL = i3;
                    anonymousClass0606.LJIIJJI = -1;
                    anonymousClass0606.LJIILL = -1;
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("right to ");
                LIZ3.append(LJIL(i4));
                LIZ3.append(" undefined");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            case 4:
                if (i4 == 4) {
                    AnonymousClass060 anonymousClass0607 = c019905z.LIZLLL;
                    anonymousClass0607.LJIILJJIL = i3;
                    anonymousClass0607.LJIILIIL = -1;
                    anonymousClass0607.LJIILL = -1;
                    return;
                }
                if (i4 == 3) {
                    AnonymousClass060 anonymousClass0608 = c019905z.LIZLLL;
                    anonymousClass0608.LJIILIIL = i3;
                    anonymousClass0608.LJIILJJIL = -1;
                    anonymousClass0608.LJIILL = -1;
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("right to ");
                LIZ4.append(LJIL(i4));
                LIZ4.append(" undefined");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
            case 5:
                if (i4 == 5) {
                    AnonymousClass060 anonymousClass0609 = c019905z.LIZLLL;
                    anonymousClass0609.LJIILL = i3;
                    anonymousClass0609.LJIILJJIL = -1;
                    anonymousClass0609.LJIILIIL = -1;
                    anonymousClass0609.LJIIJJI = -1;
                    anonymousClass0609.LJIIL = -1;
                    return;
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("right to ");
                LIZ5.append(LJIL(i4));
                LIZ5.append(" undefined");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ5));
            case 6:
                if (i4 == 6) {
                    AnonymousClass060 anonymousClass06010 = c019905z.LIZLLL;
                    anonymousClass06010.LJIIZILJ = i3;
                    anonymousClass06010.LJIILLIIL = -1;
                    return;
                } else if (i4 == 7) {
                    AnonymousClass060 anonymousClass06011 = c019905z.LIZLLL;
                    anonymousClass06011.LJIILLIIL = i3;
                    anonymousClass06011.LJIIZILJ = -1;
                    return;
                } else {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("right to ");
                    LIZ6.append(LJIL(i4));
                    LIZ6.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ6));
                }
            case 7:
                if (i4 == 7) {
                    AnonymousClass060 anonymousClass06012 = c019905z.LIZLLL;
                    anonymousClass06012.LJIJI = i3;
                    anonymousClass06012.LJIJ = -1;
                    return;
                } else if (i4 == 6) {
                    AnonymousClass060 anonymousClass06013 = c019905z.LIZLLL;
                    anonymousClass06013.LJIJ = i3;
                    anonymousClass06013.LJIJI = -1;
                    return;
                } else {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("right to ");
                    LIZ7.append(LJIL(i4));
                    LIZ7.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ7));
                }
            default:
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(LJIL(i2));
                LIZ8.append(" to ");
                LIZ8.append(LJIL(i4));
                LIZ8.append(" unknown");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ8));
        }
    }

    public final void LIZLLL(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 1 || i3 == 2) {
            LJIIIZ(i, 1, i2, i3, 0);
            LJIIIZ(i, 2, i4, i5, 0);
            this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJ = 0.5f;
        } else if (i3 == 6 || i3 == 7) {
            LJIIIZ(i, 6, i2, i3, 0);
            LJIIIZ(i, 7, i4, i5, 0);
            this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJ = 0.5f;
        } else {
            LJIIIZ(i, 3, i2, i3, 0);
            LJIIIZ(i, 4, i4, i5, 0);
            this.LIZJ.get(Integer.valueOf(i)).LIZLLL.LJIJJLI = 0.5f;
        }
    }

    public final void LJIIIZ(int i, int i2, int i3, int i4, int i5) {
        if (!this.LIZJ.containsKey(Integer.valueOf(i))) {
            this.LIZJ.put(Integer.valueOf(i), new C019905z());
        }
        C019905z c019905z = this.LIZJ.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                    anonymousClass060.LJII = i3;
                    anonymousClass060.LJIIIIZZ = -1;
                } else if (i4 == 2) {
                    AnonymousClass060 anonymousClass0602 = c019905z.LIZLLL;
                    anonymousClass0602.LJIIIIZZ = i3;
                    anonymousClass0602.LJII = -1;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Left to ");
                    LIZ.append(LJIL(i4));
                    LIZ.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
                c019905z.LIZLLL.LJJIIJZLJL = i5;
                return;
            case 2:
                if (i4 == 1) {
                    AnonymousClass060 anonymousClass0603 = c019905z.LIZLLL;
                    anonymousClass0603.LJIIIZ = i3;
                    anonymousClass0603.LJIIJ = -1;
                } else if (i4 == 2) {
                    AnonymousClass060 anonymousClass0604 = c019905z.LIZLLL;
                    anonymousClass0604.LJIIJ = i3;
                    anonymousClass0604.LJIIIZ = -1;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("right to ");
                    LIZ2.append(LJIL(i4));
                    LIZ2.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                }
                c019905z.LIZLLL.LJJIIZ = i5;
                return;
            case 3:
                if (i4 == 3) {
                    AnonymousClass060 anonymousClass0605 = c019905z.LIZLLL;
                    anonymousClass0605.LJIIJJI = i3;
                    anonymousClass0605.LJIIL = -1;
                    anonymousClass0605.LJIILL = -1;
                } else if (i4 == 4) {
                    AnonymousClass060 anonymousClass0606 = c019905z.LIZLLL;
                    anonymousClass0606.LJIIL = i3;
                    anonymousClass0606.LJIIJJI = -1;
                    anonymousClass0606.LJIILL = -1;
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("right to ");
                    LIZ3.append(LJIL(i4));
                    LIZ3.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
                }
                c019905z.LIZLLL.LJJIIZI = i5;
                return;
            case 4:
                if (i4 == 4) {
                    AnonymousClass060 anonymousClass0607 = c019905z.LIZLLL;
                    anonymousClass0607.LJIILJJIL = i3;
                    anonymousClass0607.LJIILIIL = -1;
                    anonymousClass0607.LJIILL = -1;
                } else if (i4 == 3) {
                    AnonymousClass060 anonymousClass0608 = c019905z.LIZLLL;
                    anonymousClass0608.LJIILIIL = i3;
                    anonymousClass0608.LJIILJJIL = -1;
                    anonymousClass0608.LJIILL = -1;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("right to ");
                    LIZ4.append(LJIL(i4));
                    LIZ4.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
                }
                c019905z.LIZLLL.LJJIJ = i5;
                return;
            case 5:
                if (i4 == 5) {
                    AnonymousClass060 anonymousClass0609 = c019905z.LIZLLL;
                    anonymousClass0609.LJIILL = i3;
                    anonymousClass0609.LJIILJJIL = -1;
                    anonymousClass0609.LJIILIIL = -1;
                    anonymousClass0609.LJIIJJI = -1;
                    anonymousClass0609.LJIIL = -1;
                    return;
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("right to ");
                LIZ5.append(LJIL(i4));
                LIZ5.append(" undefined");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ5));
            case 6:
                if (i4 == 6) {
                    AnonymousClass060 anonymousClass06010 = c019905z.LIZLLL;
                    anonymousClass06010.LJIIZILJ = i3;
                    anonymousClass06010.LJIILLIIL = -1;
                } else if (i4 == 7) {
                    AnonymousClass060 anonymousClass06011 = c019905z.LIZLLL;
                    anonymousClass06011.LJIILLIIL = i3;
                    anonymousClass06011.LJIIZILJ = -1;
                } else {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("right to ");
                    LIZ6.append(LJIL(i4));
                    LIZ6.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ6));
                }
                c019905z.LIZLLL.LJJIJIIJIL = i5;
                return;
            case 7:
                if (i4 == 7) {
                    AnonymousClass060 anonymousClass06012 = c019905z.LIZLLL;
                    anonymousClass06012.LJIJI = i3;
                    anonymousClass06012.LJIJ = -1;
                } else if (i4 == 6) {
                    AnonymousClass060 anonymousClass06013 = c019905z.LIZLLL;
                    anonymousClass06013.LJIJ = i3;
                    anonymousClass06013.LJIJI = -1;
                } else {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("right to ");
                    LIZ7.append(LJIL(i4));
                    LIZ7.append(" undefined");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ7));
                }
                c019905z.LIZLLL.LJJIJIIJI = i5;
                return;
            default:
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(LJIL(i2));
                LIZ8.append(" to ");
                LIZ8.append(LJIL(i4));
                LIZ8.append(" unknown");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ8));
        }
    }
}
