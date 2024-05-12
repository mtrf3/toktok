package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131765Fc extends AnonymousClass134 {
    public long LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public final ArrayList<C14H> LJLJJL;
    public final RectF LJLJJLL;
    public final Rect LJLJL;
    public final Rect LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public ValueAnimator LJLLI;
    public boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final java.util.Map<String, Float> LJLLL;
    public final java.util.Map<String, Rect> LJLLLL;
    public final java.util.Map<String, Rect> LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public List<C14H> LJZI;
    public float LJZL;
    public List<C14H> LL;
    public long LLD;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C131765Fc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final boolean getCountDownEnable() {
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
    }

    public final void setAnimatingHide(boolean z) {
    }

    public final int getlyricsLineCount() {
        return this.LJLJJL.size();
    }

    public final int getAddedLines() {
        return this.LJLZ;
    }

    public final int getAnimationY() {
        return this.LJLL;
    }

    public final int getCurShowIndex() {
        return this.LJLJLLL;
    }

    public final int getCurToAddLineIndex() {
        return this.LJLJJI;
    }

    public final long getCurrMusicProcess() {
        return this.LJLILLLLZI;
    }

    @Override // X.AnonymousClass134
    public ArrayList<C14H> getCurrentLyrics() {
        return this.LJLJJL;
    }

    public final RectF getDynamicRectF() {
        return this.LJLJJLL;
    }

    public final boolean getInScroll() {
        return this.LJZ;
    }

    public final long getLastMusicProcess() {
        return this.LJLJI;
    }

    public final ArrayList<C14H> getLyricsLineInfos() {
        return this.LJLJJL;
    }

    public final Rect getLyricsRect() {
        return this.LJLJL;
    }

    public final ValueAnimator getScrollAnimator() {
        return this.LJLLI;
    }

    public final void LIZIZ(long j) {
        float f;
        String str;
        if (this.LJLJLLL >= this.LJLJJL.size()) {
            return;
        }
        Object obj = ListProtector.get(this.LJLJJL, this.LJLJLLL);
        o.LJIIIIZZ(obj, "lyricsLineInfos[curShowIndex]");
        C14H c14h = (C14H) obj;
        float LJFF = LJFF(c14h.LIZJ);
        long j2 = j - c14h.LIZ;
        if (getConfig().LJIIIIZZ == 3) {
            StringBuilder sb = new StringBuilder();
            int[] iArr = c14h.LJ;
            if (iArr != null) {
                int length = iArr.length;
                long j3 = 0;
                for (int i = 0; i < length; i++) {
                    long j4 = iArr[i];
                    j3 += j4;
                    String[] strArr = c14h.LIZLLL;
                    if (strArr == null || (str = strArr[i]) == null) {
                        str = "";
                    }
                    if (j2 < j3) {
                        if (i > 0) {
                            j2 -= j3 - j4;
                        }
                        f = (LJFF(str) / iArr[i]) * ((float) j2);
                        getConfig().LIZLLL.LIZ(this.LJLJJLL, getMeasuredHeight(), getMeasuredWidth(), LJFF, LJFF(sb.toString()) + f, true);
                        return;
                    }
                    sb.append(str);
                }
            }
            f = 0.0f;
            getConfig().LIZLLL.LIZ(this.LJLJJLL, getMeasuredHeight(), getMeasuredWidth(), LJFF, LJFF(sb.toString()) + f, true);
            return;
        }
        getConfig().LIZLLL.LIZ(this.LJLJJLL, getMeasuredHeight(), getMeasuredWidth(), LJFF, (((float) j2) / ((Number) c14h.LJFF.getValue()).intValue()) * LJFF, true);
    }

    public final int LIZLLL(long j) {
        int size = this.LJLJJL.size();
        for (int i = 0; i < size; i++) {
            ListProtector.get(this.LJLJJL, i).getClass();
            if (j < ((C14H) ListProtector.get(this.LJLJJL, 0)).LIZ) {
                return 0;
            }
            if (j < ((C14H) ListProtector.get(this.LJLJJL, i)).LIZ && i > 0) {
                if (getConfig().LJIIIIZZ == 3 || getConfig().LJIIIIZZ == 2) {
                    LIZIZ(j);
                }
                return i - 1;
            }
            if (i == this.LJLJJL.size() - 1 && j >= ((C14H) ListProtector.get(this.LJLJJL, i)).LIZ) {
                if (getConfig().LJIIIIZZ == 3 || getConfig().LJIIIIZZ == 2) {
                    LIZIZ(j);
                }
                return this.LJLJJL.size() - 1;
            }
        }
        return 0;
    }

    public final Rect LJ(String str) {
        if (((LinkedHashMap) this.LJLLLL).get(str) != null) {
            Rect rect = (Rect) ((LinkedHashMap) this.LJLLLL).get(str);
            if (rect == null) {
                return new Rect();
            }
            return rect;
        }
        Rect rect2 = new Rect();
        getConfig().LJFF.getTextBounds(str, 0, str.length(), rect2);
        this.LJLLLL.put(str, rect2);
        return rect2;
    }

    public final float LJFF(String str) {
        Float valueOf;
        if (str != null) {
            if (((LinkedHashMap) this.LJLLL).get(str) != null) {
                valueOf = (Float) ((LinkedHashMap) this.LJLLL).get(str);
            } else {
                float measureText = getConfig().LJFF.measureText(str);
                this.LJLLL.put(str, Float.valueOf(measureText));
                valueOf = Float.valueOf(measureText);
            }
            if (valueOf != null) {
                return valueOf.floatValue();
            }
        }
        return 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        C14H c14h;
        if (canvas != null) {
            i = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null);
        } else {
            i = 1;
        }
        if (this.LJLJLLL >= this.LJLJJL.size() || (c14h = (C14H) ListProtector.get(this.LJLJJL, this.LJLJLLL)) == null) {
            return;
        }
        String str = c14h.LIZJ;
        if (str == null) {
            str = "";
        }
        this.LJLJL.set(LJ(str));
        C17C c17c = getConfig().LIZLLL;
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        float LIZJ = c17c.LIZJ(measuredWidth);
        C17C c17c2 = getConfig().LIZLLL;
        getMeasuredWidth();
        getMeasuredHeight();
        float LIZLLL = c17c2.LIZLLL(this.LJLL, this.LJLJL);
        if (canvas != null) {
            canvas.drawText(str, LIZJ, LIZLLL, getConfig().LJI);
        }
        int i2 = getConfig().LIZJ + 1;
        for (int i3 = 1; i3 < i2; i3++) {
            LIZJ(canvas, i3, LIZJ, LIZLLL);
        }
        if (canvas != null) {
            canvas.restoreToCount(i);
        }
        if (getConfig().LJIIIIZZ != 3 || canvas == null) {
            return;
        }
        canvas.clipRect(this.LJLJJLL);
        canvas.drawText(str, LIZJ, LIZLLL, getConfig().LJFF);
    }

    public final void setAddedLines(int i) {
        this.LJLZ = i;
    }

    public final void setAnimating(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setAnimationY(int i) {
        this.LJLL = i;
    }

    public final void setCurShowIndex(int i) {
        this.LJLJLLL = i;
    }

    public final void setCurToAddLineIndex(int i) {
        this.LJLJJI = i;
    }

    public final void setCurrMusicProcess(long j) {
        this.LJLILLLLZI = j;
    }

    public final void setInScroll(boolean z) {
        this.LJZ = z;
    }

    public final void setLastMusicProcess(long j) {
        this.LJLJI = j;
    }

    public final void setScrollAnimator(ValueAnimator valueAnimator) {
        this.LJLLI = valueAnimator;
    }

    public void LIZ(long j, List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LL = list;
        if (getConfig().LIZ <= 0.0f) {
            if (getWidth() > 0) {
                getConfig().LIZ = getWidth();
            } else {
                this.LJZI = list;
                return;
            }
        }
        this.LLD = j;
        this.LJLJJL.clear();
        this.LJLZ = 0;
        this.LJLJL.setEmpty();
        this.LJLJJLL.setEmpty();
        this.LJLJLJ.setEmpty();
        ((LinkedHashMap) this.LJLLL).clear();
        ((LinkedHashMap) this.LJLLLL).clear();
        ((LinkedHashMap) this.LJLLLLLL).clear();
        this.LJLJLLL = 0;
        this.LJLLILLLL = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14H c14h = (C14H) it.next();
            if (!TextUtils.isEmpty(c14h.LIZJ)) {
                float f = getConfig().LIZ;
                String str = c14h.LIZJ;
                Paint paint = getConfig().LJFF;
                this.LJLZ = i;
                this.LJZL = f;
                if (paint.measureText(str) <= f) {
                    int i2 = this.LJLJJI + 1;
                    this.LJLJJI = i2;
                    if (this.LJLZ < i2) {
                        this.LJLJJL.add(c14h);
                    }
                } else if (getConfig().LJIIIIZZ == 2) {
                    C14H c14h2 = new C14H();
                    C14H c14h3 = new C14H();
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c14h.LIZJ;
                    if (str2 != null) {
                        int length = str2.length();
                        while (i < length) {
                            char charAt = str2.charAt(i);
                            sb.append(charAt);
                            if (paint.measureText(sb.toString()) > f) {
                                sb3.append(charAt);
                            } else {
                                sb2.append(charAt);
                            }
                            i++;
                        }
                        c14h2.LIZ = c14h.LIZ;
                        c14h2.LIZJ = sb2.toString();
                        int i3 = this.LJLJJI + 1;
                        this.LJLJJI = i3;
                        if (this.LJLZ < i3) {
                            this.LJLJJL.add(c14h2);
                        }
                        c14h3.LIZ = c14h.LIZ + LivePlayerResourceReleaseSetting.ENABLE;
                        c14h3.LIZJ = sb3.toString();
                        int i4 = this.LJLJJI + 1;
                        this.LJLJJI = i4;
                        if (this.LJLZ < i4) {
                            this.LJLJJL.add(c14h3);
                        }
                    }
                } else if (getConfig().LJIIIIZZ == 3) {
                    C14H c14h4 = new C14H();
                    C14H c14h5 = new C14H();
                    StringBuilder sb4 = new StringBuilder();
                    String[] strArr = c14h.LIZLLL;
                    if (strArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        StringBuilder sb5 = new StringBuilder();
                        StringBuilder sb6 = new StringBuilder();
                        ArrayList arrayList4 = new ArrayList();
                        int i5 = c14h.LIZ;
                        int length2 = strArr.length;
                        for (int i6 = 0; i6 < length2; i6++) {
                            String str3 = strArr[i6];
                            sb4.append(str3);
                            if (paint.measureText(sb4.toString()) > f) {
                                arrayList3.add(str3);
                                sb6.append(str3);
                                int[] iArr = c14h.LJ;
                                if (iArr != null && i6 < iArr.length) {
                                    arrayList4.add(Integer.valueOf(iArr[i6]));
                                }
                            } else {
                                arrayList.add(str3);
                                sb5.append(str3);
                                int[] iArr2 = c14h.LJ;
                                if (iArr2 != null && i6 < iArr2.length) {
                                    arrayList2.add(Integer.valueOf(iArr2[i6]));
                                    i5 += iArr2[i6];
                                }
                            }
                        }
                        c14h4.LIZ = c14h.LIZ;
                        c14h4.LIZLLL = (String[]) arrayList.toArray(new String[0]);
                        c14h4.LJ = new int[arrayList2.size()];
                        int size = arrayList2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            int[] iArr3 = c14h4.LJ;
                            if (iArr3 != null) {
                                Object obj = ListProtector.get(arrayList2, i7);
                                o.LJIIIIZZ(obj, "newWordsDisInterval[i]");
                                iArr3[i7] = ((Number) obj).intValue();
                            }
                        }
                        if (this.LJLLJ) {
                            String sb7 = sb5.toString();
                            o.LJIIIIZZ(sb7, "newLineLyrics.toString()");
                            c14h4.LIZJ = s.LJZI(sb7).toString();
                        } else {
                            c14h4.LIZJ = sb5.toString();
                        }
                        int i8 = this.LJLJJI + 1;
                        this.LJLJJI = i8;
                        if (this.LJLZ < i8) {
                            this.LJLJJL.add(c14h4);
                        }
                        c14h5.LIZ = i5;
                        c14h5.LIZLLL = (String[]) arrayList3.toArray(new String[0]);
                        c14h5.LJ = new int[arrayList4.size()];
                        int size2 = arrayList4.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            int[] iArr4 = c14h5.LJ;
                            if (iArr4 != null) {
                                Object obj2 = ListProtector.get(arrayList4, i9);
                                o.LJIIIIZZ(obj2, "nextWordsDisInterval[i]");
                                iArr4[i9] = ((Number) obj2).intValue();
                            }
                        }
                        c14h5.LIZJ = sb6.toString();
                        int i10 = this.LJLJJI + 1;
                        this.LJLJJI = i10;
                        if (this.LJLZ < i10) {
                            this.LJLJJL.add(c14h5);
                        }
                    }
                }
                i = 0;
            }
        }
        long j2 = this.LJLILLLLZI;
        if (j2 <= 0) {
            j2 = j;
        }
        this.LJLJLLL = LIZLLL(j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131765Fc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = new ArrayList<>();
        this.LJLJJLL = new RectF();
        this.LJLJL = new Rect();
        this.LJLJLJ = new Rect();
        C5S0.LIZ(20.0f);
        this.LJLLJ = true;
        this.LJLLL = new LinkedHashMap();
        this.LJLLLL = new LinkedHashMap();
        this.LJLLLLLL = new LinkedHashMap();
    }

    public final void LIZJ(Canvas canvas, int i, float f, float f2) {
        C14H c14h;
        if (this.LJLJLLL + i >= this.LJLJJL.size() || (c14h = (C14H) ListProtector.get(this.LJLJJL, this.LJLJLLL + i)) == null) {
            return;
        }
        String str = c14h.LIZJ;
        if (str == null) {
            str = "";
        }
        float LIZ = f2 + (C5S0.LIZ(17.0f) * i);
        getConfig().getClass();
        if ((C5S0.LIZ(4.0f) * i) + LIZ >= this.LJLJLJ.height() + getMeasuredHeight() || canvas == null) {
            return;
        }
        getConfig().getClass();
        canvas.drawText(str, f, LIZ + (C5S0.LIZ(4.0f) * i), getConfig().LJ);
    }

    @Override // X.AnonymousClass134, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        List<C14H> list;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && ((int) this.LJZL) != i) {
            z = true;
        } else {
            z = false;
        }
        getConfig().LIZ = i;
        if (z && (list = this.LL) != null && list.size() > 0) {
            LIZ(this.LLD, this.LL);
        }
    }
}
