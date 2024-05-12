package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C0IB;
import X.C221108m2;
import X.C29901Fi;
import X.C40871j1;
import X.C5H3;
import X.C66851QLn;
import X.C76800UCe;
import X.C76928UHc;
import X.C77119UOl;
import X.C81184Vtc;
import X.C81683W3z;
import X.C82536WaK;
import X.C82537WaL;
import X.C87196YKa;
import X.C87197YKb;
import X.C87198YKc;
import X.C87199YKd;
import X.C87200YKe;
import X.C87201YKf;
import X.C87202YKg;
import X.C87203YKh;
import X.C87204YKi;
import X.C87205YKj;
import X.C87206YKk;
import X.C87208YKm;
import X.C87210YKo;
import X.EF7;
import X.H7B;
import X.InterfaceC158076Ih;
import X.InterfaceC158086Ii;
import X.InterfaceC87207YKl;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.O5Y;
import X.ORZ;
import X.OSZ;
import X.UGD;
import X.V1M;
import X.X1D;
import X.YKR;
import X.YKT;
import X.YKW;
import X.YKX;
import X.YKY;
import X.YKZ;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS19S0010000_15;
import kotlin.jvm.internal.AqS38S1000000_15;
import kotlin.jvm.internal.AqS39S0001000_15;
import kotlin.jvm.internal.AqS57S0110000_15;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EditTextStickerViewModel extends LifecycleAwareViewModel<EditTextStickerViewState> implements InterfaceC158086Ii, InterfaceC158076Ih {
    public static final C81683W3z LLD = new C81683W3z();
    public boolean LJLJL;
    public TextStickerData LJLJLLL;
    public MutableLiveData<Boolean> LJLL;
    public boolean LJLLI;
    public boolean LJLLLLLL;
    public OSZ<Integer, Integer> LJLZ;
    public final MutableLiveData<TextStickerData> LJLJLJ = new MutableLiveData<>();
    public final C5H3 LJLLILLLL = C221108m2.LIZIZ(C76928UHc.LJLIL);
    public final List<YKR> LJLLJ = new ArrayList();
    public boolean LJLLL = true;
    public boolean LJLLLL = true;
    public final C29901Fi<C76800UCe> LJZ = new C29901Fi<>();
    public final C29901Fi<OSZ<Boolean, Boolean>> LJZI = new C29901Fi<>();
    public final C29901Fi<Boolean> LJZL = new C29901Fi<>();
    public final C40871j1<Boolean> LL = new C40871j1<>(Boolean.FALSE);

    @Override // X.InterfaceC158076Ih
    public InterfaceC158086Ii LIZ() {
        return this;
    }

    @Override // X.InterfaceC158076Ih
    public void wI() {
        fL(0.0f, false);
    }

    private final List<YKR> Xv0() {
        return ORZ.LLILII(C87210YKo.LJLIL, this.LJLLJ);
    }

    public final void A20() {
        this.LJLLJ.clear();
    }

    @Override // X.InterfaceC158076Ih
    public void J6() {
        setState(C87204YKi.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public boolean LIZLLL() {
        setState(C87202YKg.LJLIL);
        boolean z = false;
        for (YKR ykr : this.LJLLJ) {
            C87208YKm c87208YKm = ykr.LJLJJI;
            boolean z2 = ykr.LJLLLLLL.LJIIIIZZ;
            c87208YKm.LJI = z2;
            if (z2) {
                ykr.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC158076Ih
    public boolean LJIIIIZZ() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LJLL;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.InterfaceC158076Ih
    public void LJJJJ() {
        setState(C87201YKf.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public boolean LJLIL() {
        for (YKR ykr : this.LJLLJ) {
            TextStickerData data = ykr.getData();
            if (data != null && data.getHasReadTextAudio()) {
                if (ykr == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC158076Ih
    public void LJLL() {
        setStateImmediate(C87197YKb.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public void LLILZ() {
        setStateImmediate(YKZ.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public void LLJLL() {
        setState(C87198YKc.LJLIL);
    }

    public final void M6() {
        setStateImmediate(C87196YKa.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Mv0, reason: merged with bridge method [inline-methods] */
    public EditTextStickerViewState kv0() {
        return new EditTextStickerViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    public final MutableLiveData<OSZ<Float, Boolean>> Nv0() {
        return (MutableLiveData) this.LJLLILLLL.getValue();
    }

    public final YKR Ov0() {
        if (this.LJLLJ.isEmpty()) {
            return null;
        }
        return (YKR) ListProtector.get(this.LJLLJ, 0);
    }

    @Override // X.InterfaceC158076Ih
    public void R7() {
        setState(C87200YKe.LJLIL);
    }

    public final void Rm0() {
        setState(C87199YKd.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public List<TextStickerData> S2() {
        ArrayList arrayList = new ArrayList();
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            TextStickerData LIZIZ = it.next().LIZIZ();
            o.LJIIIIZZ(LIZIZ, "view.dumpData()");
            arrayList.add(LIZIZ);
        }
        return arrayList;
    }

    @Override // X.InterfaceC158076Ih
    public void T3() {
        setState(C87203YKh.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public void U90() {
        setStateImmediate(C87206YKk.LJLIL);
    }

    public final int Wz() {
        if (this.LJLLJ.isEmpty()) {
            return 0;
        }
        int size = this.LJLLJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List<TextStickerTextWrap> textWrapList = ((YKR) ListProtector.get(this.LJLLJ, i2)).getTextWrapList();
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
        return this.LJLLJ.isEmpty();
    }

    public final void gQ() {
        this.LJLLJ.clear();
    }

    @Override // X.InterfaceC158076Ih
    public String getTextContent() {
        StringBuilder sb = new StringBuilder();
        int size = this.LJLLJ.size();
        for (int i = 0; i < size; i++) {
            ((YKR) ListProtector.get(this.LJLLJ, i)).LIZIZ();
            TextStickerData data = ((YKR) ListProtector.get(this.LJLLJ, i)).getData();
            if (data != null) {
                sb.append(V1M.LJJIII(data.getTextWrapList()));
            }
            if (i != this.LJLLJ.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    @Override // X.InterfaceC158076Ih
    public void j() {
        setState(YKW.LJLIL);
    }

    public final Iterator<YKR> kM() {
        return this.LJLLJ.listIterator();
    }

    public final int qV() {
        List<YKR> list = this.LJLLJ;
        ArrayList arrayList = new ArrayList();
        for (YKR ykr : list) {
            if (V1M.LJJIIZI(ykr)) {
                arrayList.add(ykr);
            }
        }
        return arrayList.size();
    }

    @Override // X.InterfaceC158076Ih
    public void show() {
        setStateImmediate(C87205YKj.LJLIL);
    }

    @Override // X.InterfaceC158076Ih
    public boolean LJJL() {
        return !Zu0();
    }

    @Override // X.InterfaceC158076Ih
    public C0IB<Boolean> H3() {
        return this.LL;
    }

    @Override // X.InterfaceC158076Ih
    public List<YKR> LJZL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC158076Ih
    public C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI() {
        return this.LJZI;
    }

    @Override // X.InterfaceC158076Ih
    public boolean LLLLILI() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC158076Ih
    public C29901Fi<C76800UCe> LLZZZZ() {
        return this.LJZ;
    }

    @Override // X.InterfaceC158076Ih
    public boolean X1() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC158076Ih
    public LiveData<TextStickerData> g3() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC158076Ih
    public C29901Fi<Boolean> o() {
        return this.LJZL;
    }

    private final void Vv0(boolean z) {
        H7B.LIZ("EditStickerScene -> set enableEditTextSticker");
        this.LJLLLL = z;
        List<YKR> list = this.LJLLJ;
        ArrayList arrayList = new ArrayList();
        for (YKR ykr : list) {
            if (V1M.LJJIIZI(ykr)) {
                arrayList.add(ykr);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            YKR ykr2 = (YKR) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditStickerScene -> is Text Sticker, setEnableEdit = ");
            LIZ.append(this.LJLLLL);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            ykr2.setEnableEdit(this.LJLLLL);
        }
    }

    public final void Bp0(long j) {
        for (YKR ykr : this.LJLLJ) {
            ykr.setPlayPosition(j);
            ykr.LJIIIZ();
        }
    }

    @Override // X.InterfaceC158076Ih
    public void Bs0(InterfaceC87207YKl interfaceC87207YKl) {
        setState(new AqS181S0100000_15(interfaceC87207YKl, 68));
    }

    @Override // X.InterfaceC158076Ih
    public void DY(YKR ykr) {
        setState(new AqS181S0100000_15(ykr, 64));
    }

    @Override // X.InterfaceC158076Ih
    public void F8(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        List<YKR> list = this.LJLLJ;
        ArrayList arrayList = new ArrayList();
        for (YKR ykr : list) {
            if (V1M.LJJIIZI(ykr)) {
                arrayList.add(ykr);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((YKR) it.next()).LJIIJ(f, z);
        }
    }

    @Override // X.InterfaceC158076Ih
    public void K3(boolean z) {
        this.LJLJL = z;
    }

    public final void Kv0(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        ListProtector.add(this.LJLLJ, 0, stickerView);
    }

    @Override // X.InterfaceC158076Ih
    public void LJIIL(MutableLiveData<Boolean> liveData) {
        o.LJIIIZ(liveData, "liveData");
        this.LJLL = liveData;
    }

    @Override // X.InterfaceC158076Ih
    public void LJIILIIL(boolean z) {
        setState(new AqS19S0010000_15(z, 1));
        MutableLiveData<Boolean> mutableLiveData = this.LJLL;
        if (mutableLiveData != null && !o.LJ(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    public final boolean LJJIIZI(MotionEvent event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (!this.LJLLL) {
            return false;
        }
        for (YKR ykr : this.LJLLJ) {
            ykr.LLF.set(event.getRawX(), event.getRawY());
            if (ykr.LJIILJJIL()) {
                YKT ykt = ykr.LJLLLLLL;
                ykt.getClass();
                long currentTimeMillis = System.currentTimeMillis() - ykt.LJFF;
                if (ykt.LIZ != null && currentTimeMillis <= 200 && ykt.LJIILL.LJ(ykt.LIZLLL, ykt.LJ) && ykt.LJIILL.LJ(event.getX() - ykt.LJIIJ, event.getY() - ykt.LJIIJJI)) {
                    ykt.LIZ.LIZIZ(ykt.LJIILL);
                }
                if (ykr.LJLLLLLL.LJIIIZ != 2 && ykr.LLFF != null) {
                    ykr.getCenterX();
                    ykr.LLFF.getClass();
                    ykr.getCenterY();
                    ykr.LLFF.getClass();
                    YKT ykt2 = ykr.LJLLLLLL;
                    ykt2.LJIIZILJ = true;
                    if (ykt2.LIZ != null && ykt2.LJIIIZ == 3) {
                        RectF helpRect = ykt2.LJIILL.getHelpRect();
                        C77119UOl.LJJIIJZLJL(helpRect.centerX(), helpRect.centerY(), helpRect, ykt2.LJIILL.getStickerRotate());
                        C77119UOl.LJJIIZ(helpRect, ykt2.LJIILL.getStickerScale());
                        ykt2.LIZ.LIZLLL(ykt2.LJIILL, helpRect, new UGD(true, ((int) ykt2.LJI) + ykt2.LJIIJ, ((int) ykt2.LJII) + ykt2.LJIIJJI, ykt2.LIZ()));
                        if (ykt2.LJIILLIIL) {
                            if (ykt2.LIZ()) {
                                ykt2.LIZJ(false);
                            } else {
                                ykt2.LIZJ(false);
                            }
                            ykt2.LJIILLIIL = false;
                        }
                        ykt2.LIZ.LJFF(ykt2.LJIILL);
                        ykt2.LIZ.LJI(ykt2.LJIILL);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ykt2.LJIIL) {
                        long currentTimeMillis2 = System.currentTimeMillis() - ykt2.LJFF;
                        int abs = (int) Math.abs(event.getX() - (ykt2.LIZLLL + ykt2.LJIIJ));
                        int abs2 = (int) Math.abs((event.getY() - 0) - (ykt2.LJ + ykt2.LJIIJJI));
                        if (currentTimeMillis2 <= 200 && ((abs <= 5 || abs2 <= 5) && !ykt2.LJIJI.LIZ())) {
                            if (!ykt2.LJIIIIZZ && !ykt2.LIZ()) {
                                InterfaceC87207YKl interfaceC87207YKl = ykt2.LIZ;
                                if (interfaceC87207YKl != null) {
                                    interfaceC87207YKl.LIZJ(ykt2.LJIILL);
                                }
                                ykt2.LIZJ(true);
                            } else {
                                InterfaceC87207YKl interfaceC87207YKl2 = ykt2.LIZ;
                                if (interfaceC87207YKl2 != null) {
                                    interfaceC87207YKl2.LIZJ(ykt2.LJIILL);
                                }
                                ykt2.LIZJ(false);
                            }
                        }
                        z = true;
                    }
                } else {
                    z = false;
                }
                ykr.LLI = false;
                ykr.LLFZ = false;
                ykr.LLIFFJFJJ = false;
                YKT ykt3 = ykr.LJLLLLLL;
                ykt3.LJI = 0.0f;
                ykt3.LJII = 0.0f;
                ykr.setTouching(false);
                if (z) {
                    setState(YKY.LJLIL);
                    TextStickerData LIZIZ = ykr.LIZIZ();
                    o.LJIIIIZZ(LIZIZ, "view.dumpData()");
                    Qv0(LIZIZ);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC158076Ih
    public void LJJIJIIJIL(int i) {
        setState(new AqS39S0001000_15(i, 1));
    }

    public final boolean LJJIZ(float f) {
        if (!this.LJLLL) {
            return false;
        }
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJI(f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJLI(C82537WaL detector) {
        boolean z;
        o.LJIIIZ(detector, "detector");
        if (!this.LJLLL) {
            return false;
        }
        for (YKR ykr : this.LJLLJ) {
            if (ykr.LJIILJJIL() && (ykr.LLI || ykr.LLIFFJFJJ || ykr.LLFZ || ykr.LJLLLLLL.LJIIIZ == 3)) {
                PointF pointF = detector.LJIIIZ;
                float f = pointF.x;
                float f2 = pointF.y;
                YKT ykt = ykr.LJLLLLLL;
                if (ykt.LJIILL == null) {
                    continue;
                } else {
                    float f3 = ykt.LJI + f;
                    float f4 = ykt.LJII + f2;
                    float abs = Math.abs(f3 - ykt.LIZLLL);
                    float abs2 = Math.abs(f4 - ykt.LJ);
                    if (abs < 5.0f && abs2 < 5.0f) {
                        if (ykt.LJIIIZ == 3) {
                            setState(YKX.LJLIL);
                            return true;
                        }
                    } else {
                        if (ykt.LIZ != null && ykt.LJIIIZ == 3) {
                            RectF helpRect = ykt.LJIILL.getHelpRect();
                            C77119UOl.LJJIIJZLJL(helpRect.centerX(), helpRect.centerY(), helpRect, ykt.LJIILL.getStickerRotate());
                            C77119UOl.LJJIIZ(helpRect, ykt.LJIILL.getStickerScale());
                            boolean z2 = ykt.LJIIIIZZ;
                            if (z2) {
                                ykt.LJIILLIIL = z2;
                            }
                            ykt.LIZ.LIZLLL(ykt.LJIILL, helpRect, new UGD(false, (int) (ykt.LJIIJ + f3), (int) (ykt.LJIIJJI + f4), ykt.LIZ()));
                            if (!ykt.LIZ()) {
                                ykt.LIZ.LJFF(ykt.LJIILL);
                                ykt.LIZ.LJ(ykt.LJIILL);
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ykt.LJIIIZ == 3) {
                            ykt.LJIIIZ = 3;
                            ykt.LIZIZ = f3 - ykt.LJI;
                            ykt.LIZJ = f4 - ykt.LJII;
                            YKR ykr2 = ykt.LJIILL;
                            ykr2.setCenterX(ykr2.getCenterX() + ykt.LIZIZ);
                            YKR ykr3 = ykt.LJIILL;
                            ykr3.setCenterY(ykr3.getCenterY() + ykt.LIZJ);
                            ykt.LJIILL.invalidate();
                            ykt.LJI = f3;
                            ykt.LJII = f4;
                        } else if (z) {
                        }
                        if (ykt.LJIIIIZZ) {
                            ykt.LIZJ(false);
                        }
                        setState(YKX.LJLIL);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean LJLJI(float f) {
        if (!this.LJLLL) {
            return false;
        }
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJIIIIZZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC158076Ih
    public void LJLLLLLL(boolean z) {
        setState(new AqS19S0010000_15(z, 6));
    }

    @Override // X.InterfaceC158076Ih
    public void LLILLIZIL(OSZ<Integer, Integer> osz) {
        if (this.LJLZ == null) {
            this.LJLZ = osz;
        }
        setState(new AqS181S0100000_15((OSZ) osz, (OSZ<Integer, Integer>) 72));
    }

    @Override // X.InterfaceC158076Ih
    public void LLLILZ(InterfaceC88472Yns<? super YKR, C76800UCe> interfaceC88472Yns) {
        setState(new AqS181S0100000_15((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super YKR, C76800UCe>) 70));
    }

    @Override // X.InterfaceC158076Ih
    public void LLLIZZ(boolean z) {
        setStateImmediate(new AqS19S0010000_15(z, 3));
    }

    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJLLL) {
            return false;
        }
        for (YKR ykr : this.LJLLJ) {
            if (ykr.LJIILJJIL()) {
                ykr.LLI = C77119UOl.LJIILL(detector.LJIILIIL, detector.LJIILJJIL - ykr.LJLLJ, ykr.getHelpRect(), ykr.LJLJJI.LIZIZ);
                ykr.LJLLLLLL.LIZIZ(detector.LJIILIIL, detector.LJIILJJIL);
                if (ykr.LLI || ykr.LLFZ || ykr.LJLLLLLL.LJIIIZ == 3) {
                    if (ykr.LLFFF) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC158076Ih
    public void LLLLZ(InterfaceC88471Ynr<? super YKR, ? super YKR, C76800UCe> interfaceC88471Ynr) {
        setState(new AqS181S0100000_15((InterfaceC88471Ynr) interfaceC88471Ynr, (InterfaceC88471Ynr<? super YKR, ? super YKR, C76800UCe>) 66));
    }

    public final void Lv0(TextStickerData data) {
        o.LJIIIZ(data, "data");
        setState(new AqS181S0100000_15(data, 69));
    }

    public final void O90(String string) {
        o.LJIIIZ(string, "string");
        setState(new AqS38S1000000_15(string, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.Float, java.lang.Float> P5(android.content.Context r4) {
        /*
            r3 = this;
            X.OSZ<java.lang.Integer, java.lang.Integer> r2 = r3.LJLZ
            if (r2 == 0) goto L38
            java.lang.Object r0 = r2.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r1 = (float) r0
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            X.UCe r2 = X.C76800UCe.LIZ
            if (r2 != 0) goto L2a
        L1e:
            if (r4 == 0) goto L2a
            int r0 = X.C81184Vtc.LJ(r4)
            float r1 = (float) r0
            int r0 = X.C81184Vtc.LIZLLL(r4)
            float r0 = (float) r0
        L2a:
            X.OSZ r2 = new X.OSZ
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L38:
            r1 = 0
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel.P5(android.content.Context):X.OSZ");
    }

    @Override // X.InterfaceC158076Ih
    public void P8(boolean z) {
        Vv0(z);
    }

    public final void Pv0(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        setState(new AqS181S0100000_15(stickerView, 74));
    }

    @Override // X.InterfaceC158076Ih
    public void Qu0(String content) {
        o.LJIIIZ(content, "content");
        setState(new AqS38S1000000_15(content, 0));
    }

    public final void Qv0(TextStickerData data) {
        o.LJIIIZ(data, "data");
        this.LJLJLJ.setValue(data);
    }

    public boolean Rc(RectF videoRect) {
        o.LJIIIZ(videoRect, "videoRect");
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            PointF[] anglePointList = it.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF LJJI = O5Y.LJJI(anglePointList);
                if (LJJI.top < videoRect.top || LJJI.bottom > videoRect.bottom) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void Tv0(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLLJ.remove(stickerView);
    }

    public final void Uv0(boolean z) {
        this.LJLLL = z;
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            it.next().setEnableEdit(this.LJLLL);
        }
    }

    @Override // X.InterfaceC158076Ih
    public void W2(InterfaceC88472Yns<? super YKR, C76800UCe> interfaceC88472Yns) {
        setState(new AqS181S0100000_15((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super YKR, C76800UCe>) 67));
    }

    public final void WI(boolean z) {
        setStateImmediate(new AqS19S0010000_15(z, 7));
    }

    public final void Wv0(boolean z) {
        this.LL.LJI(Boolean.valueOf(z));
    }

    public final void Yv0(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLLJ.remove(stickerView);
        ListProtector.add(this.LJLLJ, 0, stickerView);
    }

    @Override // X.InterfaceC158076Ih
    public void c7(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        setState(new AqS181S0100000_15(listener, 63));
    }

    @Override // X.InterfaceC158076Ih
    public void d2(boolean z) {
        setState(new AqS19S0010000_15(z, 0));
    }

    @Override // X.InterfaceC158076Ih
    public void g5(boolean z) {
        setStateImmediate(new AqS19S0010000_15(z, 5));
    }

    @Override // X.InterfaceC158076Ih
    public void h6(boolean z) {
        setState(new AqS19S0010000_15(z, 4));
        this.LJLLI = z;
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void i6(boolean z) {
        setState(new AqS19S0010000_15(z, 2));
    }

    @Override // X.InterfaceC158076Ih
    public void ko(YKR ykr) {
        setState(new AqS181S0100000_15(ykr, 73));
    }

    @Override // X.InterfaceC158076Ih
    public void l9(TextWatcher listener) {
        o.LJIIIZ(listener, "listener");
        setStateImmediate(new AqS181S0100000_15(listener, 65));
    }

    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LJLLLLLL = false;
        if (!this.LJLLL) {
            return false;
        }
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            it.next().LJLLLLLL.LJIIIZ = 2;
        }
        for (YKR ykr : this.LJLLJ) {
            if (ykr.LJIILJJIL()) {
                float centerX = ykr.getCenterX();
                float centerY = ykr.getCenterY();
                ykr.getStickerRotate();
                ykr.getStickerScale();
                ykr.LLFF = new C66851QLn(centerX, centerY);
                event.getY();
                event.getRawY();
                if (ykr.LJLLLLLL.LIZIZ(event.getX(), event.getY())) {
                    ykr.setTouching(true);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJLLL) {
            return false;
        }
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJII(scaleFactor)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        if (!this.LJLLL) {
            return false;
        }
        for (YKR ykr : this.LJLLJ) {
            if (ykr.LJIILJJIL()) {
                ykr.LLIFFJFJJ = C77119UOl.LJIILL(scaleFactor.getFocusX(), scaleFactor.getFocusY() - ykr.LJLLJ, ykr.getHelpRect(), ykr.LJLJJI.LIZIZ);
                ykr.LJLLLLLL.LIZIZ(scaleFactor.getFocusX(), scaleFactor.getFocusY());
                if (ykr.LLIFFJFJJ || ykr.LLFZ || ykr.LJLLLLLL.LJIIIZ == 3) {
                    setState(new AqS181S0100000_15(ykr, 75));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJLLLLLL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC158076Ih
    public void setEnable(boolean z) {
        Uv0(z);
    }

    @Override // X.InterfaceC158076Ih
    public void z90(YKR ykr) {
        setState(new AqS181S0100000_15(ykr, 71));
    }

    private final PointF Zv0(PointF pointF, Context context) {
        int i;
        C76800UCe c76800UCe;
        int i2;
        PointF pointF2 = new PointF();
        OSZ<Integer, Integer> osz = this.LJLZ;
        if (osz != null) {
            i = osz.getFirst().intValue();
            i2 = osz.getSecond().intValue();
            c76800UCe = C76800UCe.LIZ;
        } else {
            i = 0;
            c76800UCe = null;
            i2 = 0;
        }
        if (c76800UCe == null && context != null) {
            i = C81184Vtc.LJ(context);
            i2 = C81184Vtc.LIZLLL(context);
        }
        if (i2 == 0 || i == 0) {
            i = C81184Vtc.LJ(EF7.LIZIZ());
            i2 = C81184Vtc.LIZLLL(EF7.LIZIZ());
        }
        try {
            C81683W3z c81683W3z = LLD;
            float f = (pointF.x * 1.0f) / i;
            c81683W3z.getClass();
            pointF2.set(C81683W3z.LIZ(f), C81683W3z.LIZ((pointF.y * 1.0f) / i2));
        } catch (Exception unused) {
        }
        return pointF2;
    }

    public final void Jv0(TextStickerData stickerData, boolean z) {
        o.LJIIIZ(stickerData, "stickerData");
        setStateImmediate(new AqS57S0110000_15(stickerData, z, 0));
    }

    public final void Rv0(TextStickerData data, String str) {
        o.LJIIIZ(data, "data");
        setState(new AqS68S1100000_15(data, str, 6));
    }

    public final void fL(float f, boolean z) {
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(f, z);
        }
    }

    public final void lp0(float f, boolean z) {
        Nv0().setValue(new OSZ<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        if (!this.LJLLL) {
            return false;
        }
        for (YKR ykr : this.LJLLJ) {
            if (ykr.LJIILJJIL()) {
                ykr.LLFZ = C77119UOl.LJIILL(f, f2 - ykr.LJLLJ, ykr.getHelpRect(), ykr.LJLJJI.LIZIZ);
                ykr.LJLLLLLL.LIZIZ(f, f2);
                if (ykr.LLI || ykr.LLIFFJFJJ || ykr.LLFZ || ykr.LJLLLLLL.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:15|(1:17)(1:67)|(2:19|(1:21)(15:65|23|(1:64)(1:27)|28|(1:63)(1:32)|33|34|35|36|(1:(1:60)(2:38|(2:41|42)(1:40)))|43|(1:45)(1:59)|46|(2:48|(2:55|56)(2:52|53))(2:57|58)|54))(1:66)|22|23|(1:25)|64|28|(1:30)|63|33|34|35|36|(2:(0)(0)|40)|43|(0)(0)|46|(0)(0)|54|13) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[EDGE_INSN: B:60:0x015a->B:43:0x015a BREAK  A[LOOP:2: B:37:0x011f->B:40:0x01ed], SYNTHETIC] */
    @Override // X.InterfaceC158076Ih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> S7(android.content.Context r25, java.util.List<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> r26, com.google.gson.Gson r27) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel.S7(android.content.Context, java.util.List, com.google.gson.Gson):java.util.List");
    }

    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJLLLLLL.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LJLLLLLL) {
            return false;
        }
        this.LJLLLLLL = false;
        return true;
    }

    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        Iterator<YKR> it = this.LJLLJ.iterator();
        while (it.hasNext()) {
            if (it.next().LJLLLLLL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void Sv0(EditTextStickerViewModel editTextStickerViewModel, TextStickerData textStickerData, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        editTextStickerViewModel.Rv0(textStickerData, str);
    }
}
