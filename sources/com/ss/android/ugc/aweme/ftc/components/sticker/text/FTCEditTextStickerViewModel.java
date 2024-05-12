package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import X.C10K;
import X.C149065t8;
import X.C1548065s;
import X.C1552367j;
import X.C1552767n;
import X.C1552867o;
import X.C1552967p;
import X.C1553067q;
import X.C1553367t;
import X.C1553467u;
import X.C1553567v;
import X.C1553667w;
import X.C1553867y;
import X.C1E4;
import X.C221108m2;
import X.C29901Fi;
import X.C5H3;
import X.C67P;
import X.C68A;
import X.C68I;
import X.C76800UCe;
import X.C82536WaK;
import X.C82537WaL;
import X.InterfaceC146845pY;
import X.InterfaceC147435qV;
import X.InterfaceC1542963t;
import X.InterfaceC1543363x;
import X.InterfaceC1552467k;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import Y.AgS120S0100000_2;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditTextStickerViewModel extends LifecycleAwareViewModel<FTCEditTextStickerViewState> implements InterfaceC147435qV, InterfaceC146845pY {
    public static final C68I LJLZ = new Object() { // from class: X.68I
    };
    public MutableLiveData<Boolean> LJLJL;
    public boolean LJLLI;
    public OSZ<Integer, Integer> LJLLILLLL;
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(C149065t8.LJLIL);
    public final List<C67P> LJLJLLL = new ArrayList();
    public boolean LJLL = true;
    public final C5H3 LJLLJ = C221108m2.LIZIZ(C68A.LJLIL);
    public final C29901Fi<C76800UCe> LJLLL = new C29901Fi<>();
    public final C29901Fi<OSZ<Boolean, Boolean>> LJLLLL = new C29901Fi<>();
    public final C29901Fi<Boolean> LJLLLLLL = new C29901Fi<>();

    @Override // X.InterfaceC146845pY
    public InterfaceC147435qV LIZ() {
        return this;
    }

    private final C1552767n Mv0() {
        return (C1552767n) this.LJLLJ.getValue();
    }

    private final List<C67P> Ov0() {
        return ORZ.LLILII(new Comparator() { // from class: X.683
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C67P) obj).LLIIII - ((C67P) obj2).LLIIII;
            }
        }, this.LJLJLLL);
    }

    @Override // X.InterfaceC146845pY
    public void J6() {
        setState(C1553367t.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Kv0, reason: merged with bridge method [inline-methods] */
    public FTCEditTextStickerViewState kv0() {
        return new FTCEditTextStickerViewState(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC146845pY
    public boolean LIZLLL() {
        setState(C1548065s.LJLIL);
        boolean z = false;
        for (C67P c67p : this.LJLJLLL) {
            C1553867y c1553867y = c67p.LJLJJI;
            boolean z2 = c67p.LJZI.LJIIIIZZ;
            c1553867y.LJI = z2;
            if (z2) {
                c67p.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC146845pY
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.InterfaceC146845pY
    public void LJJJJ() {
        setState(C1553667w.LJLIL);
    }

    @Override // X.InterfaceC146845pY
    public void LLILZ() {
        setState(C1553467u.LJLIL);
    }

    @Override // X.InterfaceC146845pY
    public void LLJLL() {
        setState(C1553567v.LJLIL);
    }

    public final MutableLiveData<OSZ<Float, Boolean>> Lv0() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    public final int Wz() {
        if (this.LJLJLLL.isEmpty()) {
            return 0;
        }
        int size = this.LJLJLLL.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List<TextStickerTextWrap> textWrapList = ((C67P) ListProtector.get(this.LJLJLLL, i2)).getTextWrapList();
            o.LJIIIIZZ(textWrapList, "_stickerList[i].textWrapList");
            for (TextStickerTextWrap textStickerTextWrap : textWrapList) {
                if (textStickerTextWrap != null) {
                    i += textStickerTextWrap.safeStrPair().second.size();
                }
            }
        }
        return i;
    }

    public final boolean Zu0() {
        return this.LJLJLLL.isEmpty();
    }

    public final void gQ() {
        this.LJLJLLL.clear();
    }

    public final Iterator<C67P> kM() {
        return this.LJLJLLL.listIterator();
    }

    public final C67P mS() {
        if (this.LJLJLLL.isEmpty()) {
            return null;
        }
        return (C67P) ListProtector.get(this.LJLJLLL, 0);
    }

    public final int qV() {
        return this.LJLJLLL.size();
    }

    @Override // X.InterfaceC146845pY
    public void show() {
        setStateImmediate(C1553067q.LJLIL);
    }

    @Override // X.InterfaceC146845pY
    public boolean LJJL() {
        return !Zu0();
    }

    @Override // X.InterfaceC146845pY
    public List<C67P> LJZL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC146845pY
    public C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC146845pY
    public C29901Fi<C76800UCe> LLZZZZ() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC146845pY
    public C29901Fi<Boolean> o() {
        return this.LJLLLLLL;
    }

    public final void Bp0(long j) {
        for (C67P c67p : this.LJLJLLL) {
            c67p.setPlayPosition(j);
            c67p.LJIL();
        }
    }

    @Override // X.InterfaceC146845pY
    public void F3(InterfaceC1543363x interfaceC1543363x) {
        setState(new AqS168S0100000_2(interfaceC1543363x, 63));
    }

    public final void H5(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        ListProtector.add(this.LJLJLLL, 0, stickerView);
    }

    public final void K4(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJLLL.remove(stickerView);
    }

    @Override // X.InterfaceC146845pY
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLJL = liveData;
    }

    @Override // X.InterfaceC146845pY
    public void LJIILIIL(boolean z) {
        setState(new AqS7S0010000_2(z, 5));
        MutableLiveData<Boolean> mutableLiveData = this.LJLJL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    public final boolean LJJIIZI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIJJLI(event)) {
                setState(C1552967p.LJLIL);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC146845pY
    public void LJJIJIIJIL(int i) {
        setState(new AqS27S0001000_2(i, 4));
    }

    public final boolean LJJIZ(float f) {
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILJJIL(f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILIIL(detector)) {
                setState(C1552867o.LJLIL);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC146845pY
    public void LLILLIZIL(OSZ<Integer, Integer> osz) {
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = osz;
        }
        setState(new AqS168S0100000_2(osz, (OSZ<Integer, Integer>) 62));
    }

    @Override // X.InterfaceC146845pY
    public void LLLILZ(InterfaceC88472Yns<? super C67P, C76800UCe> interfaceC88472Yns) {
        setState(new AqS168S0100000_2(interfaceC88472Yns, 61));
    }

    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILL(detector)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC146845pY
    public void LLLLZ(InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe> interfaceC88471Ynr) {
        setState(new AqS168S0100000_2(interfaceC88471Ynr, (InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe>) 58));
    }

    public final void Nv0(boolean z) {
        this.LJLL = z;
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().setEnableEdit(this.LJLL);
        }
    }

    @Override // X.InterfaceC147435qV
    public boolean Rc(RectF videoRect) {
        o.LJIIIZ(videoRect, "videoRect");
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            PointF[] anglePointList = it.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF LJIILJJIL = C1E4.LJIILJJIL(anglePointList);
                if (LJIILJJIL.top < videoRect.top || LJIILJJIL.bottom > videoRect.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC146845pY
    public void S9(InterfaceC1552467k interfaceC1552467k) {
        setState(new AqS168S0100000_2(interfaceC1552467k, 59));
    }

    public final void f80(C67P stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLJLLL.remove(stickerView);
        ListProtector.add(this.LJLJLLL, 0, stickerView);
    }

    @Override // X.InterfaceC146845pY
    public void h9(C67P c67p) {
        setState(new AqS168S0100000_2(c67p, 64));
    }

    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LJLLI = false;
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJZI.LJIIIZ = 2;
        }
        Iterator<C67P> it2 = this.LJLJLLL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIIL(event)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJLL) {
            return false;
        }
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJIILLIIL(scaleFactor)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJLL) {
            return false;
        }
        for (C67P c67p : this.LJLJLLL) {
            if (c67p.LJIJI(scaleFactor)) {
                setState(new AqS168S0100000_2(c67p, 57));
                return true;
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC146845pY
    public void q5(InterfaceC1542963t interfaceC1542963t) {
        setState(new AqS168S0100000_2(interfaceC1542963t, 60));
    }

    @Override // X.InterfaceC146845pY
    public void setEnable(boolean z) {
        Nv0(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.PointF Pv0(android.graphics.PointF r10, android.content.Context r11) {
        /*
            r9 = this;
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>()
            X.OSZ<java.lang.Integer, java.lang.Integer> r1 = r9.LJLLILLLL
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L2b
        L21:
            if (r11 == 0) goto L2b
            int r3 = X.C81184Vtc.LJ(r11)
            int r8 = X.C81184Vtc.LIZLLL(r11)
        L2b:
            X.68I r2 = com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel.LJLZ
            float r1 = r10.x
            r7 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r7
            float r0 = (float) r3
            float r1 = r1 / r0
            r2.getClass()
            java.math.BigDecimal r2 = new java.math.BigDecimal
            double r0 = (double) r1
            r2.<init>(r0)
            r5 = 4
            r4 = 1
            java.math.BigDecimal r0 = r2.setScale(r5, r4)
            float r3 = r0.floatValue()
            float r1 = r10.y
            float r1 = r1 * r7
            float r0 = (float) r8
            float r1 = r1 / r0
            java.math.BigDecimal r2 = new java.math.BigDecimal
            double r0 = (double) r1
            r2.<init>(r0)
            java.math.BigDecimal r0 = r2.setScale(r5, r4)
            float r0 = r0.floatValue()
            r6.set(r3, r0)
            return r6
        L5e:
            r3 = 0
            r8 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel.Pv0(android.graphics.PointF, android.content.Context):android.graphics.PointF");
    }

    public final C10K<List<TextStickerCompileResult>> Jv0(String str, ViewGroup container) {
        o.LJIIIZ(container, "container");
        LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : this.LJLJLLL) {
            C10K LJIILL = Mv0().LIZ(c67p, container, str, 0, 0, 0, 0).LJIILL(new AgS120S0100000_2(c67p, 7));
            o.LJIIIIZZ(LJIILL, "view in _stickerList) {\n…se null\n                }");
            arrayList.add(LJIILL);
        }
        C10K<List<TextStickerCompileResult>> LJIJJLI = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
        return LJIJJLI;
    }

    public final void c8(TextStickerData stickerData, boolean z) {
        o.LJIIIZ(stickerData, "stickerData");
        setStateImmediate(new AqS45S0110000_2(stickerData, z, 0));
    }

    public final void fL(float f, boolean z) {
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            it.next().LJJ(f, z);
        }
    }

    public final void lp0(float f, boolean z) {
        Lv0().setValue(new OSZ<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC146845pY
    public C10K<List<TextStickerCompileResult>> mx(C1552367j compileParam, ViewGroup container) {
        o.LJIIIZ(compileParam, "compileParam");
        o.LJIIIZ(container, "container");
        LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (C67P c67p : this.LJLJLLL) {
            C10K LJIILL = Mv0().LIZ(c67p, container, compileParam.LIZ, compileParam.LIZIZ, compileParam.LIZJ, compileParam.LIZLLL, compileParam.LJ).LJIILL(new AgS120S0100000_2(c67p, 8));
            o.LJIIIIZZ(LJIILL, "view in _stickerList) {\n…ull\n                    }");
            arrayList.add(LJIILL);
        }
        C10K<List<TextStickerCompileResult>> LJIJJLI = C10K.LJIJJLI(arrayList);
        o.LJIIIIZZ(LJIJJLI, "whenAllResult(tasks)");
        return LJIJJLI;
    }

    public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJLL) {
            return false;
        }
        for (C67P c67p : this.LJLJLLL) {
            if (c67p.LJJIIZ()) {
                c67p.LLIIIJ = c67p.LJIIIIZZ(f, f2);
                c67p.LJZI.LIZIZ(f, f2);
                if (c67p.LLIIIL || c67p.LLIIIZ || c67p.LLIIIJ || c67p.LJZI.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LJLLI) {
            return false;
        }
        this.LJLLI = false;
        return true;
    }

    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<C67P> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LJZI.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }
}
