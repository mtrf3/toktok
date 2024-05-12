package X;

import Y.ACallableS30S1100000_2;
import Y.ARunnableS38S0100000_2;
import Y.AgS120S0100000_2;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import defpackage.b1;
import defpackage.e1;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS0S0020000_2;
import kotlin.jvm.internal.AqS106S0300000_2;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5MG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MG {
    public static final /* synthetic */ int LJJIJ = 0;
    public final C135235Sl LIZ;
    public MutableLiveData<Boolean> LIZIZ;
    public MutableLiveData<C5RV> LIZJ;
    public MutableLiveData<IAudioEffectParam> LIZLLL;
    public ArrayList<EffectPointModel> LJ;
    public VEEditorAutoStartStopArbiter LJFF;
    public Context LJI;
    public C133765Mu LJII;
    public InterfaceC133095Kf LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public C5PF LJIIJJI;
    public C123764tQ LJIIL;
    public boolean LJIILIIL;
    public InterfaceC148845sm LJIILJJIL;
    public final C124064tu LJIILL;
    public ExecutorService LJIILLIIL;
    public int LJIIZILJ;
    public SafeHandler LJIJ;
    public final C5NP LJIJI;
    public SurfaceView LJIJJ;
    public LifecycleOwner LJIJJLI;
    public InterfaceC134025Nu LJIL;
    public C5MX LJJ;
    public C5MS LJJI;
    public C5MY LJJIFFI;
    public java.util.Set<String> LJJII;
    public String LJJIII;
    public final int LJJIIJ;
    public C76801UCf LJJIIJZLJL;
    public FilterBean LJJIIZ;
    public float LJJIIZI;

    public void LJJIIZI(SurfaceView surfaceView) {
    }

    public final void LJIILLIIL() {
        if (this.LJII == null) {
            return;
        }
        C5NP c5np = this.LJIJI;
        StringBuilder LIZJ = b1.LIZJ("VEVideoEditor", "enableComposerFilter: mComposerFilterIndex = ");
        LIZJ.append(this.LJJIIJ);
        c5np.i(X1D.LIZIZ(LIZJ));
    }

    public final InterfaceC148845sm LJIIZILJ() {
        InterfaceC148845sm interfaceC148845sm = this.LJIILJJIL;
        if (interfaceC148845sm != null) {
            return interfaceC148845sm;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC153045zY LJIJ() {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            return c133765Mu;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final int LJIJJ() {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            return c133765Mu.LLIZLLLIL();
        }
        return 0;
    }

    public final ExecutorService LJIJJLI() {
        ExecutorService executorService = this.LJIILLIIL;
        if (executorService != null) {
            return executorService;
        }
        ExecutorService LLLLZLLIL = C16880lQ.LLLLZLLIL();
        this.LJIILLIIL = LLLLZLLIL;
        return LLLLZLLIL;
    }

    public final C76801UCf LJIL() {
        C76801UCf c76801UCf = this.LJJIIJZLJL;
        if (c76801UCf != null) {
            return c76801UCf;
        }
        C76801UCf c76801UCf2 = new C76801UCf(2);
        final AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 55);
        final AqS152S0100000_2 aqS152S0100000_22 = new AqS152S0100000_2(this, 56);
        final AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 35);
        final AqS168S0100000_2 aqS168S0100000_22 = new AqS168S0100000_2(this, 36);
        c76801UCf2.LIZ(new C5MI(aqS152S0100000_2, aqS152S0100000_22, aqS168S0100000_2, aqS168S0100000_22) { // from class: X.5MH
            public final InterfaceC65784Pro<InterfaceC153045zY> LIZIZ;
            public final InterfaceC65784Pro<List<EffectPointModel>> LIZJ;
            public final InterfaceC88472Yns<Integer, Integer> LIZLLL;
            public final InterfaceC88472Yns<Integer, Integer> LJ;

            @Override // X.C5MI
            public final void LIZIZ(C5RV c5rv) {
                List<EffectPointModel> invoke = this.LIZJ.invoke();
                InterfaceC65784Pro<InterfaceC153045zY> veEditorProvider = this.LIZIZ;
                InterfaceC88472Yns<Integer, Integer> timeEffectPositionProvider = this.LJ;
                o.LJIIIZ(veEditorProvider, "veEditorProvider");
                o.LJIIIZ(timeEffectPositionProvider, "timeEffectPositionProvider");
                if (invoke != null) {
                    for (EffectPointModel effectPointModel : invoke) {
                        if (C5RV.LJ(c5rv)) {
                            int LLIZLLLIL = veEditorProvider.invoke().LLIZLLLIL();
                            int endPoint = LLIZLLLIL - effectPointModel.getEndPoint();
                            int startPoint = LLIZLLLIL - effectPointModel.getStartPoint();
                            effectPointModel.setStartPoint(endPoint);
                            effectPointModel.setEndPoint(startPoint);
                        } else if (!C5RV.LIZJ(c5rv) && !C5RV.LIZLLL(c5rv) && !C5RV.LIZIZ(c5rv)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("apply time effect: ");
                            LIZ.append(c5rv);
                            LIZ.append(" is not supported yet.");
                            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
                        }
                    }
                }
            }

            @Override // X.C5MI
            public final void LIZJ(C5RV c5rv) {
                List<EffectPointModel> invoke = this.LIZJ.invoke();
                InterfaceC65784Pro<InterfaceC153045zY> veEditorProvider = this.LIZIZ;
                InterfaceC88472Yns<Integer, Integer> originalPositionProvider = this.LIZLLL;
                o.LJIIIZ(veEditorProvider, "veEditorProvider");
                o.LJIIIZ(originalPositionProvider, "originalPositionProvider");
                if (invoke != null) {
                    for (EffectPointModel effectPointModel : invoke) {
                        if (C5RV.LJ(c5rv)) {
                            int LLIZLLLIL = veEditorProvider.invoke().LLIZLLLIL();
                            int endPoint = LLIZLLLIL - effectPointModel.getEndPoint();
                            int startPoint = LLIZLLLIL - effectPointModel.getStartPoint();
                            effectPointModel.setStartPoint(endPoint);
                            effectPointModel.setEndPoint(startPoint);
                        } else if (!C5RV.LIZJ(c5rv) && !C5RV.LIZLLL(c5rv) && !C5RV.LIZIZ(c5rv)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("remove time effect: ");
                            LIZ.append(c5rv);
                            LIZ.append(" is not supported yet.");
                            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
                        }
                    }
                }
            }

            {
                super(aqS152S0100000_2);
                this.LIZIZ = aqS152S0100000_2;
                this.LIZJ = aqS152S0100000_22;
                this.LIZLLL = aqS168S0100000_2;
                this.LJ = aqS168S0100000_22;
            }
        });
        c76801UCf2.LIZ(new C124094tx(aqS152S0100000_2, new AqS152S0100000_2(this, 57)));
        final AqS152S0100000_2 aqS152S0100000_23 = new AqS152S0100000_2(this, 58);
        c76801UCf2.LIZ(new C5MI(aqS152S0100000_2, aqS152S0100000_23) { // from class: X.4ty
            public final InterfaceC65784Pro<MutableLiveData<IAudioEffectParam>> LIZIZ;

            @Override // X.C5MI
            public final void LIZIZ(C5RV c5rv) {
                IAudioEffectParam value;
                MutableLiveData<IAudioEffectParam> invoke = this.LIZIZ.invoke();
                if (invoke != null && (value = invoke.getValue()) != null) {
                    int seqIn = value.getSeqIn();
                    int seqOut = value.getSeqOut();
                    int LIZ = LIZ(c5rv, seqIn);
                    int LIZ2 = LIZ(c5rv, seqOut);
                    value.setSeqIn(LIZ);
                    value.setSeqOut(LIZ2);
                    invoke.setValue(value);
                }
            }

            @Override // X.C5MI
            public final void LIZJ(C5RV c5rv) {
                IAudioEffectParam value;
                MutableLiveData<IAudioEffectParam> invoke = this.LIZIZ.invoke();
                if (invoke != null && (value = invoke.getValue()) != null) {
                    int seqIn = value.getSeqIn();
                    int seqOut = value.getSeqOut();
                    int LIZLLL = LIZLLL(c5rv, seqIn);
                    int LIZLLL2 = LIZLLL(c5rv, seqOut);
                    value.setSeqIn(LIZLLL);
                    value.setSeqOut(LIZLLL2);
                    invoke.setValue(value);
                }
            }

            {
                this.LIZIZ = aqS152S0100000_23;
            }
        });
        this.LJJIIJZLJL = c76801UCf2;
        return c76801UCf2;
    }

    public final InterfaceC153045zY LJJ() {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            return c133765Mu;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4tu] */
    public C5MG(C135235Sl c135235Sl) {
        this.LIZ = c135235Sl == null ? new C135235Sl() : c135235Sl;
        this.LJIIIZ = -1;
        this.LJIIJ = -1;
        new ArrayList();
        new ArrayList();
        this.LJIILL = new InterfaceC122704ri() { // from class: X.4tu
            @Override // X.InterfaceC122704ri
            public final float LIZ(FilterBean filterBean) {
                o.LJIIIZ(filterBean, "filterBean");
                C56K c56k = new C56K();
                float LIZLLL = C44659Hfr.LIZLLL(filterBean);
                c56k.element = LIZLLL;
                if (LIZLLL == 0.0f) {
                    C5MG c5mg = C5MG.this;
                    if (c5mg.LJII != null) {
                        C78841Uwv.LJJIII(c5mg, "", c5mg.LJIJ(), new AqS133S0200000_2(c56k, filterBean, 13));
                    }
                }
                return c56k.element;
            }
        };
        this.LJIJI = C82891Wg3.LIZLLL();
        this.LJJIIJ = -1;
        this.LJJIIZI = -1.0f;
    }

    public static EffectPointModel LJI(C5RT c5rt) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setType(1);
        effectPointModel.setSelectedColor(c5rt.LJIIIIZZ);
        effectPointModel.setResDir(c5rt.LJIIJJI);
        effectPointModel.setKey(c5rt.LJIIL);
        effectPointModel.setFromEnd(c5rt.LJII);
        effectPointModel.setStartPoint((int) c5rt.LIZJ);
        effectPointModel.setUiStartPoint((int) c5rt.LJ);
        effectPointModel.setUiEndPoint((int) c5rt.LJFF);
        effectPointModel.setName(c5rt.LJIILJJIL);
        effectPointModel.setDuration(c5rt.LJIILL);
        effectPointModel.setCategory(c5rt.LJIILLIIL);
        effectPointModel.setExtra(c5rt.LJIIZILJ);
        effectPointModel.setAdjustParams(c5rt.LJIJ);
        effectPointModel.setIsNewEngineEffect(c5rt.LJIJI);
        return effectPointModel;
    }

    public static NLETrack LJIJI(C122034qd c122034qd) {
        NLETrack LJIIIZ = c122034qd.LJIIIZ(new AqS168S0100000_2(c122034qd, 34));
        if (LJIIIZ != null && NLETrackMV.LJJII(LJIIIZ) == null) {
            return LJIIIZ;
        }
        return null;
    }

    public final void LIZJ(String path) {
        o.LJIIIZ(path, "path");
        C10K.LIZJ(new ACallableS30S1100000_2(this, path, 0)).LIZLLL(new AgS120S0100000_2(this, 6));
    }

    public final void LIZLLL(C5RT op) {
        String str;
        o.LJIIIZ(op, "op");
        if (this.LJ == null) {
            this.LJ = new ArrayList<>();
        }
        ArrayList<EffectPointModel> arrayList = this.LJ;
        if (arrayList != null) {
            String[] strArr = op.LIZIZ;
            int i = 0;
            if (strArr == null || strArr.length == 0) {
                str = "";
            } else {
                str = strArr[0];
            }
            int i2 = op.LJI;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 5) {
                            if (i2 != 10) {
                                if (i2 != 7) {
                                    if (i2 != 8) {
                                        return;
                                    }
                                }
                            }
                            Iterator<EffectPointModel> it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (o.LJ(it.next().getUuid(), str)) {
                                    if (i >= 0 && i < arrayList.size()) {
                                        Object obj = ListProtector.get(arrayList, i);
                                        o.LJIIIIZZ(obj, "stack[index]");
                                        ((EffectPointModel) obj).setStartPoint((int) op.LIZJ);
                                        Object obj2 = ListProtector.get(arrayList, i);
                                        o.LJIIIIZZ(obj2, "stack[index]");
                                        ((EffectPointModel) obj2).setUiStartPoint((int) op.LJ);
                                        Object obj3 = ListProtector.get(arrayList, i);
                                        o.LJIIIIZZ(obj3, "stack[index]");
                                        ((EffectPointModel) obj3).setEndPoint((int) op.LIZLLL);
                                        Object obj4 = ListProtector.get(arrayList, i);
                                        o.LJIIIIZZ(obj4, "stack[index]");
                                        ((EffectPointModel) obj4).setUiEndPoint((int) op.LJFF);
                                        return;
                                    }
                                    return;
                                }
                                i++;
                            }
                            return;
                        }
                        LJJIJ(op, arrayList);
                        return;
                    }
                    Iterator<EffectPointModel> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (o.LJ(it2.next().getUuid(), str)) {
                            if (i >= 0 && i < arrayList.size()) {
                                ListProtector.remove(arrayList, i);
                                return;
                            }
                            return;
                        }
                        i++;
                    }
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj5 = ListProtector.get(arrayList, arrayList.size() - 1);
                o.LJIIIIZZ(obj5, "stack[stack.size - 1]");
                EffectPointModel effectPointModel = (EffectPointModel) obj5;
                effectPointModel.setEndPoint((int) op.LIZJ);
                effectPointModel.setUiEndPoint((int) op.LJFF);
                return;
            }
            if (strArr == null || strArr.length == 0) {
                return;
            }
            EffectPointModel LJI = LJI(op);
            C78841Uwv.LJJIIJ(this, new AqS149S0200000_2(LJI, op, 3));
            arrayList.add(LJI);
        }
    }

    public final void LJ(C122144qo c122144qo) {
        String str;
        String str2;
        if (c122144qo == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (c122144qo.LIZ) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.append(str);
        LIZ.append(" auto enhance, type: ");
        LIZ.append(c122144qo.LIZIZ);
        LIZ.append(", use lens hdr model: ");
        LIZ.append(c122144qo.LIZLLL);
        X1D.LIZIZ(LIZ);
        int i = c122144qo.LIZIZ;
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 20001:
                    case 20002:
                    case 20003:
                    case 20004:
                        if (c122144qo.LJFF.LIZIZ) {
                            C133765Mu c133765Mu = this.LJII;
                            if (c133765Mu != null) {
                                C78841Uwv.LJJIII(this, "", c133765Mu, new AqS133S0200000_2(this, c122144qo, 18));
                                return;
                            } else {
                                o.LJIJI("mVEEditor");
                                throw null;
                            }
                        }
                        P4Q.LIZ("VEVideoEditor", "Model acquisition error, not available");
                        LJFF(c122144qo);
                        return;
                    default:
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Draw frame failed，current type = ");
                        LIZ2.append(c122144qo.LIZIZ);
                        P4Q.LIZ("HDREnhance", X1D.LIZIZ(LIZ2));
                        LJFF(c122144qo);
                        return;
                }
            }
            LJFF(c122144qo);
            return;
        }
        boolean z = c122144qo.LIZ;
        boolean z2 = c122144qo.LIZJ;
        C133765Mu c133765Mu2 = this.LJII;
        if (c133765Mu2 != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu2, new AqS0S0020000_2(z2, z, 0));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("apply light enhance ");
            LIZ3.append(z);
            if (z2) {
                str2 = "is";
            } else {
                str2 = "is not";
            }
            C0MT.LJ(LIZ3, str2, " preview", LIZ3);
            return;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final void LJFF(C122144qo c122144qo) {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu, new AqS168S0100000_2(c122144qo, 38));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public NLEEditor LJII(VEPreviewParams params) {
        o.LJIIIZ(params, "params");
        return new NLEEditor();
    }

    public final void LJIIIIZZ(C5PF newOp) {
        o.LJIIIZ(newOp, "newOp");
        String str = newOp.LIZ;
        int hashCode = str.hashCode();
        if (hashCode != 93029230) {
            if (hashCode != 94746189 || !str.equals("clear")) {
                return;
            }
            this.LJIIJJI = null;
            C133765Mu c133765Mu = this.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(this, "", c133765Mu, new AqS168S0100000_2(this, 32));
                return;
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
        if (!str.equals("apply")) {
            return;
        }
        this.LJIIJJI = newOp;
        C133765Mu c133765Mu2 = this.LJII;
        if (c133765Mu2 != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu2, new AqS133S0200000_2(this, newOp, 9));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public final void LJIIIZ(C5MM op) {
        VEEditor.SEEK_MODE seek_mode;
        int LLJJJJJIL;
        o.LJIIIZ(op, "op");
        int i = op.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        return;
                    } else {
                        seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
                    }
                } else {
                    seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing;
                }
                InterfaceC133865Ne interfaceC133865Ne = op.LIZJ;
                if (interfaceC133865Ne == null) {
                    C133765Mu c133765Mu = this.LJII;
                    if (c133765Mu != null) {
                        LLJJJJJIL = c133765Mu.LLJJJIL((int) op.LIZIZ, seek_mode);
                    } else {
                        o.LJIJI("mVEEditor");
                        throw null;
                    }
                } else {
                    C133765Mu c133765Mu2 = this.LJII;
                    if (c133765Mu2 != null) {
                        LLJJJJJIL = c133765Mu2.LLJJJJJIL((int) op.LIZIZ, seek_mode, interfaceC133865Ne);
                    } else {
                        o.LJIJI("mVEEditor");
                        throw null;
                    }
                }
                if (LLJJJJJIL == 0) {
                    return;
                }
                C5NP c5np = this.LJIJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Seek failed. ret = ");
                LIZ.append(LLJJJJJIL);
                LIZ.append(" See logs for more details.");
                c5np.d(X1D.LIZIZ(LIZ));
                return;
            }
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LJFF;
            if (vEEditorAutoStartStopArbiter == null) {
                return;
            }
            vEEditorAutoStartStopArbiter.LIZJ(true, false);
            return;
        }
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LJFF;
        if (vEEditorAutoStartStopArbiter2 == null) {
            return;
        }
        if (vEEditorAutoStartStopArbiter2.LJLJJI) {
            vEEditorAutoStartStopArbiter2.LIZJ(false, false);
        } else {
            vEEditorAutoStartStopArbiter2.LIZ();
        }
    }

    public boolean LJIIJJI(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(this, "veEditor#changeMusic", c133765Mu, new AqS133S0200000_2(this, params, 17));
            return false;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public void LJIIL(VEVolumeChangeOp op) {
        o.LJIIIZ(op, "op");
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu, new AqS133S0200000_2(this, op, 10));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public void LJIILL(C123774tR op) {
        o.LJIIIZ(op, "op");
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu, new AqS133S0200000_2(this, op, 12));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public void LJJIII(boolean z) {
        boolean z2;
        InterfaceC133095Kf interfaceC133095Kf = this.LJIIIIZZ;
        if (interfaceC133095Kf != null) {
            if (interfaceC133095Kf.getCanvasWidth() > 0 && interfaceC133095Kf.getCanvasHeight() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJIJJ != null && z2) {
                ((C133765Mu) LJIJ()).LLLFFI(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                ((C133765Mu) LJIJ()).LLJIJIL(interfaceC133095Kf.getCanvasWidth(), interfaceC133095Kf.getCanvasHeight());
            }
        }
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            c133765Mu.LLJILJIL(true);
            if ((this.LJIJJ != null || (interfaceC133095Kf != null && interfaceC133095Kf.getVeAudioEffectParam() != null)) && z) {
                if (this.LIZ.LIZJ) {
                    LJIJJLI().submit(new ARunnableS38S0100000_2(this, 21));
                    return;
                }
                C133765Mu c133765Mu2 = this.LJII;
                if (c133765Mu2 != null) {
                    c133765Mu2.prepare();
                    return;
                } else {
                    o.LJIJI("mVEEditor");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final void LJJIIJZLJL(boolean z) {
        this.LJIILIIL = z;
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            c133765Mu.LJI().LJIIIIZZ().LJJIFFI(Boolean.valueOf(z));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public final int LIZ(AudioRecorderParam audioEffectParam, C43523H6h cache) {
        o.LJIIIZ(audioEffectParam, "audioEffectParam");
        o.LJIIIZ(cache, "cache");
        C5NP c5np = this.LJIJI;
        StringBuilder LIZJ = b1.LIZJ("VEVideoEditor", " addAudioRecord needDel ");
        LIZJ.append(audioEffectParam.getNeedDel());
        LIZJ.append(" hasRecord ");
        LIZJ.append(audioEffectParam.hasRecord());
        LIZJ.append(" recordIndex ");
        LIZJ.append(audioEffectParam.getAudioRecordIndex());
        c5np.i(X1D.LIZIZ(LIZJ));
        String str = null;
        if (audioEffectParam.getNeedDel()) {
            C133765Mu c133765Mu = this.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(this, "VEVideoEditor.removeAudioRecord", c133765Mu, C5MN.LJLIL);
                audioEffectParam.setNeedDel(false);
                audioEffectParam.setAudioRecordIndex(-2);
                this.LJIIJ = -1;
                return -2;
            }
            o.LJIJI("mVEEditor");
            throw null;
        }
        if (!audioEffectParam.hasRecord()) {
            return -1;
        }
        C133765Mu c133765Mu2 = this.LJII;
        if (c133765Mu2 != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu2, new AqS133S0200000_2(this, audioEffectParam, 15));
            if (audioEffectParam.getAudioRecordIndex() >= 0) {
                C5NP c5np2 = this.LJIJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("VEVideoEditor");
                LIZ.append(" audioRecordIndex >= 0 return");
                c5np2.i(X1D.LIZIZ(LIZ));
                int audioRecordIndex = audioEffectParam.getAudioRecordIndex();
                this.LJIIIZ = audioRecordIndex;
                return audioRecordIndex;
            }
            C133765Mu c133765Mu3 = this.LJII;
            if (c133765Mu3 != null) {
                C78841Uwv.LJJIII(this, "VEVideoEditor.addAudioRecord", c133765Mu3, new AqS133S0200000_2(this, audioEffectParam, 16));
                C5PF c5pf = this.LJIIJJI;
                if (c5pf != null) {
                    str = c5pf.LIZ;
                }
                if (o.LJ(str, "apply") && this.LJIIJ == -1 && !audioEffectParam.getHasOriginVoiceConversion() && !audioEffectParam.getHasDubVoiceConversion()) {
                    LJIIIIZZ(c5pf);
                }
                audioEffectParam.setAudioRecordIndex(this.LJIIIZ);
                return this.LJIIIZ;
            }
            o.LJIJI("mVEEditor");
            throw null;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final void LJIIJ(boolean z, FilterBean filterBean) {
        float f;
        if (filterBean != null) {
            if (z) {
                f = TML.LIZJ(filterBean, LJIIZILJ(), this.LJIILL);
                if (f == -1.0f) {
                    f = 0.8f;
                }
            } else {
                f = 1.0f;
            }
            LJJIIZ(f, filterBean, z);
        }
    }

    public final void LJIILIIL(C5RT op, C5LU effectManager) {
        Object obj;
        String LJJJJ;
        C122334r7 c122334r7;
        String LJJJJ2;
        o.LJIIIZ(op, "op");
        o.LJIIIZ(effectManager, "effectManager");
        ArrayList<EffectPointModel> arrayList = this.LJ;
        o.LJI(arrayList);
        int i = op.LJI;
        int i2 = 2;
        if (i == 0) {
            String str = "";
            if (TextUtils.isEmpty(op.LJIIJJI)) {
                op.LJIIJJI = "";
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("changeNormalEffectWithNLE:key=");
                LIZ.append(op.LJIIL);
                LIZ.append(",name:");
                LIZ.append(op.LJIILJJIL);
                LIZ.append(",category:");
                LIZ.append(op.LJIILLIIL);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                C83964WxM c83964WxM = C83964WxM.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("changeNormalEffectWithNLE:key=");
                LIZ2.append(op.LJIIL);
                LIZ2.append(",name:");
                LIZ2.append(op.LJIILJJIL);
                LIZ2.append(",category:");
                LIZ2.append(op.LJIILLIIL);
                c83964WxM.LIZIZ(X1D.LIZIZ(LIZ2));
            }
            if (this.LIZ.LIZLLL) {
                Boolean bool = op.LJIJI;
                o.LJIIIIZZ(bool, "op.isNewEngineEffect");
                if (bool.booleanValue()) {
                    C122314r5 c122314r5 = new C122314r5();
                    c122314r5.LJIJ = 1000;
                    if (!this.LIZ.LJ) {
                        i2 = 0;
                    }
                    c122314r5.LJIJI = i2;
                    c122314r5.LJIJJ = new JSONObject(op.LJIJ);
                    c122334r7 = c122314r5;
                } else {
                    c122334r7 = new C122334r7() { // from class: X.4r6
                    };
                }
            } else {
                c122334r7 = new C122334r7();
            }
            c122334r7.LIZIZ = op.LIZJ;
            c122334r7.LIZJ = -2;
            c122334r7.LIZLLL = op.LJIIJJI;
            c122334r7.LJ = op.LJIIZILJ;
            c122334r7.LJFF = op.LJIIL;
            c122334r7.LJI = op.LJIILIIL;
            c122334r7.LJII = op.LJIILJJIL;
            String str2 = op.LJIIJ;
            if (str2 != null) {
                str = str2;
            }
            c122334r7.LJIILJJIL = str;
            c122334r7.LJIILIIL = op.LJIIIZ;
            c122334r7.LJIIIIZZ = op.LJIIIIZZ;
            c122334r7.LJIIIZ = 1;
            c122334r7.LJIIJ = op.LJIILLIIL;
            C122034qd LJJI = C17N.LJJI(LJJ());
            if (LJJI != null) {
                NLEModel LJ = LJJI.LJIIJ.LJ();
                o.LJIIIIZZ(LJ, "requireNotNull(veEditor.getNLEPro()).editor.model");
                c122334r7.LJIIJJI = C122364rA.LIZ(LJ) + 1;
                if (this.LIZ.LJFF) {
                    C122034qd LJJI2 = C17N.LJJI(LJJ());
                    if (LJJI2 != null) {
                        LJJJJ2 = LJJI2.LIZLLL().LJJIJIIJI(c122334r7);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    C122034qd LJJI3 = C17N.LJJI(LJJ());
                    if (LJJI3 != null) {
                        LJJJJ2 = LJJI3.LIZLLL().LJJJJ(c122334r7);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                op.LIZIZ = new String[]{LJJJJ2};
                EffectPointModel LJI = LJI(op);
                LJI.setUuid(op.LIZIZ[0]);
                arrayList.add(LJI);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 5) {
            LJJIJ(op, arrayList);
            return;
        }
        if (i == 6) {
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return;
                }
                obj = ListProtector.get(arrayList, size);
                o.LJIIIIZZ(obj, "stack[i]");
            } while (!C164996dj.LIZIZ(((EffectPointModel) obj).getCategory()));
            Object obj2 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj2, "stack[i]");
            String uuid = ((EffectPointModel) obj2).getUuid();
            o.LJIIIIZZ(uuid, "stack[i].uuid");
            effectManager.LJJIIZ(new String[]{uuid});
            Object obj3 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj3, "stack[i]");
            ((EffectPointModel) obj3).setFromEnd(op.LJII);
            Object obj4 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj4, "stack[i]");
            ((EffectPointModel) obj4).setStartPoint((int) op.LIZJ);
            Object obj5 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj5, "stack[i]");
            ((EffectPointModel) obj5).setEndPoint((int) op.LIZLLL);
            Object obj6 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj6, "stack[i]");
            ((EffectPointModel) obj6).setUiStartPoint((int) op.LJ);
            Object obj7 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj7, "stack[i]");
            ((EffectPointModel) obj7).setUiEndPoint((int) op.LJFF);
            Object obj8 = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj8, "stack[i]");
            EffectPointModel effectPointModel = (EffectPointModel) obj8;
            C122334r7 c122334r72 = new C122334r7();
            c122334r72.LIZIZ = effectPointModel.getStartPoint();
            c122334r72.LIZJ = effectPointModel.getEndPoint();
            c122334r72.LIZLLL = effectPointModel.getResDir();
            c122334r72.LJ = effectPointModel.getExtra();
            c122334r72.LJFF = op.LJIIL;
            c122334r72.LJII = op.LJIILJJIL;
            c122334r72.LJIIIIZZ = op.LJIIIIZZ;
            c122334r72.LJIIIZ = 3;
            c122334r72.LJIIJ = op.LJIILLIIL;
            C122034qd LJJI4 = C17N.LJJI(LJJ());
            if (LJJI4 != null) {
                NLEModel LJ2 = LJJI4.LJIIJ.LJ();
                o.LJIIIIZZ(LJ2, "requireNotNull(veEditor.getNLEPro()).editor.model");
                c122334r72.LJIIJJI = C122364rA.LIZ(LJ2) + 1;
                if (this.LIZ.LJFF) {
                    LJJJJ = effectManager.LJJIJIIJI(c122334r72);
                } else {
                    LJJJJ = effectManager.LJJJJ(c122334r72);
                }
                Object obj9 = ListProtector.get(arrayList, size);
                o.LJIIIIZZ(obj9, "stack[i]");
                ((EffectPointModel) obj9).setUuid(LJJJJ);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 1) {
            Object obj10 = ListProtector.get(arrayList, arrayList.size() - 1);
            o.LJIIIIZZ(obj10, "stack[stack.size - 1]");
            EffectPointModel effectPointModel2 = (EffectPointModel) obj10;
            String uuid2 = effectPointModel2.getUuid();
            o.LJIIIIZZ(uuid2, "last.uuid");
            C122334r7 LJIIZILJ = effectManager.LJIIZILJ(uuid2);
            if (LJIIZILJ != null) {
                LJIIZILJ.LIZJ = op.LIZJ;
                effectManager.LIZLLL(LJIIZILJ);
            }
            effectPointModel2.setEndPoint((int) op.LIZJ);
            effectPointModel2.setUiEndPoint((int) op.LJFF);
            return;
        }
        if (i == 2 || i == 7) {
            LJJIIJ(op, arrayList);
            return;
        }
        if (i == 3) {
            String[] strArr = op.LIZIZ;
            o.LJIIIIZZ(strArr, "op.effectUUIDs");
            effectManager.LJJIIZ(strArr);
            arrayList.clear();
            return;
        }
        if (i == 4) {
            String[] strArr2 = op.LIZIZ;
            o.LJIIIIZZ(strArr2, "op.effectUUIDs");
            effectManager.LJJIIZ(strArr2);
            int[] iArr = op.LIZ;
            o.LJIIIIZZ(iArr, "op.mEffectIndexes");
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (arrayList.size() > 0) {
                    ListProtector.remove(arrayList, arrayList.size() - 1);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("removeEffectOnNLE:category:");
                    LIZ3.append(op.LJIILLIIL);
                    LIZ3.append("; info: ");
                    LIZ3.append(op);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                    C83964WxM c83964WxM2 = C83964WxM.LIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("removeEffectOnNLE:category:");
                    LIZ4.append(op.LJIILLIIL);
                    LIZ4.append("; info: ");
                    LIZ4.append(op);
                    c83964WxM2.LIZIZ(X1D.LIZIZ(LIZ4));
                    return;
                }
            }
            return;
        }
        if (i != 8) {
            return;
        }
        LJJIIJ(op, arrayList);
        LJJIJ(op, arrayList);
    }

    public void LJJI(NLEModel nLEModel, boolean z) {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            c133765Mu.LJZ(nLEModel);
            if (z) {
                C133765Mu c133765Mu2 = this.LJII;
                if (c133765Mu2 != null) {
                    C78841Uwv.LJJIII(this, "", c133765Mu2, C5L8.LJLIL);
                    return;
                } else {
                    o.LJIJI("mVEEditor");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public void LJJIFFI(String str, boolean z) {
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            if (str != null && (!ujb.o.LJJJJJL(str))) {
                c133765Mu.LIZJ.LJI(str);
            }
            C133765Mu c133765Mu2 = this.LJII;
            if (c133765Mu2 != null) {
                c133765Mu2.LLLF();
                if (z) {
                    C133765Mu c133765Mu3 = this.LJII;
                    if (c133765Mu3 != null) {
                        C78841Uwv.LJJIII(this, "", c133765Mu3, C5L6.LJLIL);
                        return;
                    } else {
                        o.LJIJI("mVEEditor");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mVEEditor");
            throw null;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final void LJJIIJ(C5RT c5rt, ArrayList<EffectPointModel> arrayList) {
        String str;
        int[] iArr = c5rt.LIZ;
        if (iArr != null) {
            int length = iArr.length;
        }
        String[] strArr = c5rt.LIZIZ;
        if (strArr == null || strArr.length == 0) {
            str = "";
        } else {
            str = strArr[0];
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C133765Mu c133765Mu = this.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(this, "", c133765Mu, new C1295756r(str, arrayList, i, atomicBoolean));
                if (atomicBoolean.get()) {
                    return;
                }
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
    }

    public final void LJJIJ(C5RT c5rt, ArrayList<EffectPointModel> arrayList) {
        EffectPointModel effectPointModel = new EffectPointModel();
        C133765Mu c133765Mu = this.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(this, "", c133765Mu, new AqS106S0300000_2(this, c5rt, effectPointModel, 2));
            effectPointModel.setType(3);
            effectPointModel.setSelectedColor(c5rt.LJIIIIZZ);
            effectPointModel.setResDir(c5rt.LJIIJJI);
            effectPointModel.setKey(c5rt.LJIIL);
            effectPointModel.setFromEnd(c5rt.LJII);
            effectPointModel.setStartPoint((int) c5rt.LIZJ);
            effectPointModel.setEndPoint((int) c5rt.LIZLLL);
            effectPointModel.setUiStartPoint((int) c5rt.LJ);
            effectPointModel.setUiEndPoint((int) c5rt.LJFF);
            effectPointModel.setName(c5rt.LJIILJJIL);
            effectPointModel.setCategory(c5rt.LJIILLIIL);
            effectPointModel.setExtra(c5rt.LJIIZILJ);
            effectPointModel.setAdjustParams(c5rt.LJIJ);
            effectPointModel.setIsNewEngineEffect(c5rt.LJIJI);
            arrayList.add(effectPointModel);
            return;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    public final void LJIILJJIL(C5RV c5rv, C5RV c5rv2, C5LU effectManager) {
        boolean z;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        C5RV LJI;
        C5RV LJI2;
        o.LJIIIZ(effectManager, "effectManager");
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LJFF;
        if (vEEditorAutoStartStopArbiter2 != null) {
            z = vEEditorAutoStartStopArbiter2.LJLJJI;
            if (!z) {
                vEEditorAutoStartStopArbiter2.LIZJ(true, false);
            }
        } else {
            z = false;
        }
        for (C5MI c5mi : (List) LJIL().LJLIL) {
            if (c5rv != null) {
                LJI2 = c5rv;
            } else {
                c5mi.getClass();
                LJI2 = C5RV.LJI();
            }
            c5mi.LIZJ(LJI2);
        }
        MutableLiveData<Boolean> mutableLiveData = this.LIZIZ;
        if (effectManager.LJJIZ()) {
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            effectManager.LJJJJJ(false);
        }
        effectManager.LLIL();
        if (C5RV.LJ(c5rv2)) {
            MutableLiveData<Boolean> mutableLiveData2 = this.LIZIZ;
            if (mutableLiveData2 != null) {
                mutableLiveData2.setValue(Boolean.TRUE);
            }
            effectManager.LJJJJJ(true);
        } else if (C5RV.LIZJ(c5rv2)) {
            if (c5rv2 != null) {
                int i = (int) c5rv2.LJLILLLLZI;
                int min = (int) (Math.min(LJIJJ(), c5rv2.LJLJI) - c5rv2.LJLILLLLZI);
                new VERepeatFilterParam();
                VEEditor.TIME_MODE.EDITOR_SLOMO_MODE.ordinal();
                c5rv2.LJLJJI = effectManager.LJIJ(C121144pC.LIZ(i, min));
                MutableLiveData<C5RV> mutableLiveData3 = this.LIZJ;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.setValue(c5rv2);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        } else if (C5RV.LIZLLL(c5rv2)) {
            if (c5rv2 != null) {
                int i2 = (int) c5rv2.LJLILLLLZI;
                int min2 = (int) (Math.min(LJIJJ(), c5rv2.LJLJI) - c5rv2.LJLILLLLZI);
                new VESlowMotionFilterParam();
                VEEditor.TIME_MODE.EDITOR_SLOMO_MODE.ordinal();
                c5rv2.LJLJJI = effectManager.LJIJ(C121144pC.LIZIZ(i2, min2));
                MutableLiveData<C5RV> mutableLiveData4 = this.LIZJ;
                if (mutableLiveData4 != null) {
                    mutableLiveData4.setValue(c5rv2);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        for (C5MI c5mi2 : (List) LJIL().LJLIL) {
            if (c5rv2 != null) {
                LJI = c5rv2;
            } else {
                c5mi2.getClass();
                LJI = C5RV.LJI();
            }
            c5mi2.LIZIZ(LJI);
        }
        if (!z && (vEEditorAutoStartStopArbiter = this.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LIZJ(false, false);
        }
    }

    public final void LJJIIZ(float f, FilterBean filterBean, boolean z) {
        if (filterBean == null) {
            return;
        }
        if (C44659Hfr.LJ(filterBean)) {
            LJIILLIIL();
            C133765Mu c133765Mu = this.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(this, "setFilter", c133765Mu, new AqS5S0100001_2(filterBean, f, 2));
                this.LJJIIZ = filterBean;
                this.LJJIIZI = f;
                return;
            }
            o.LJIJI("mVEEditor");
            throw null;
        }
        C133765Mu c133765Mu2 = this.LJII;
        if (c133765Mu2 != null) {
            C78841Uwv.LJJIII(this, "setFilter without composer", c133765Mu2, new C122174qr(f, filterBean, z));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    public int LJJII(Context context, final InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        VEUserConfig vEUserConfig;
        boolean z;
        boolean z2;
        C133765Mu c133765Mu;
        o.LJIIIZ(params, "params");
        this.LJI = context;
        this.LJIIIIZZ = params;
        this.LJIJJ = surfaceView;
        this.LJIJJLI = lifecycleOwner;
        EnumC62052c5 enumC62052c5 = EnumC62052c5.NLEEditorType;
        if (params.getNeedVEUserConfig()) {
            vEUserConfig = new VEUserConfig();
            EnumC139125d6 enumC139125d6 = EnumC139125d6.ConfigID_GraphRefactor;
            Boolean bool = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC139125d6, bool));
            EnumC139125d6 enumC139125d62 = EnumC139125d6.ConfigID_EnableGlobalEffect;
            Boolean bool2 = Boolean.FALSE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC139125d62, bool2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_PinRefactor, bool2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_UseImageAllocator, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_UseNewEngineEffectOpt, 2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_UseRefaCanvasWrap, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxSoftwareVideoReaderCount, 7));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxSoftwareFreeReaderCount, 2));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxImageTextureBufferCount, 10));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxImageTextureBufferWidth, 2200));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxImageTextureBufferHeight, 2200));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_ForceDropFrameWithoutAudio, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxAudioReaderCount, Integer.MAX_VALUE));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_MaxTexturePoolCount, 50));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_TexturePoolCleanCount, 35));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_UseEffectTransiton, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_ForceDetectFace, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_EnableStickerAmazing, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_LoadImageOptimize, bool));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_EnableHighSpeedChange, bool));
        } else {
            vEUserConfig = null;
        }
        if (params.getLoadImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            EnumC139125d6 enumC139125d63 = EnumC139125d6.ConfigID_UseImageAllocator;
            Boolean bool3 = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC139125d63, bool3));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_LoadImageOptimize, bool3));
        }
        if (this.LIZ.LIZLLL) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_UseNewEngineEffectOpt, Integer.valueOf(C5MP.EFFECT_NEW_OLD_ENGINE_COEXIST.mode)));
        }
        if (params.getLoadImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            EnumC139125d6 enumC139125d64 = EnumC139125d6.ConfigID_UseImageAllocator;
            Boolean bool4 = Boolean.TRUE;
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC139125d64, bool4));
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_LoadImageOptimize, bool4));
        }
        if (params.getLoadMixImageOptimizeByVEUserConfig()) {
            if (vEUserConfig == null) {
                vEUserConfig = new VEUserConfig();
            }
            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC139125d6.ConfigID_LoadImageOptimize, Boolean.TRUE));
        }
        C5MK.LJI = params.getNeedTemplateExtra();
        C62326Od8 c62326Od8 = C5MU.LIZ;
        if (c62326Od8 != null) {
            C5MT c5mt = (C5MT) c62326Od8.LIZ;
            String workspace = params.getWorkspace();
            long editorHandler = params.getEditorHandler();
            boolean useVEPublic = params.getUseVEPublic();
            C135235Sl c135235Sl = this.LIZ;
            C5MJ c5mj = new C5MJ(enumC62052c5, workspace, editorHandler, vEUserConfig, useVEPublic, c135235Sl.LJ, c135235Sl.LJI);
            c5mt.getClass();
            if (c5mj.LIZ == enumC62052c5) {
                R3A r3a = new R3A();
                C5MZ.LIZ = ((Boolean) C133635Mh.LIZ.getValue()).booleanValue();
                if (e1.LIZ(31744, "edit_nle_audio_update_optimize", true, false) && (!C139895eL.LIZIZ)) {
                    z = true;
                } else {
                    z = false;
                }
                C5MK.LIZ = z;
                C5MK.LIZIZ = c5mj.LJFF;
                C5MK.LIZJ = c5mj.LJI;
                if (C00F.LIZ(31744, 0, "editor_pro_black_frame_optimization", true) != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C5MK.LJFF = z2;
                C5MK.LJII = C148705sY.LIZ();
                C5MK.LJIIIIZZ = C133625Mg.LIZ();
                if (e1.LIZ(31744, "enable_nle_model_check", true, true) && ((Boolean) C126244xQ.LIZ.getValue()).booleanValue()) {
                    H78.LJI("enable nleModel checker");
                    C5MK.LJIIIZ = new C5D3(C124144u2.LIZ);
                }
                C5MK.LJIIJ = e1.LIZ(31744, "nle_setdatasource_and_destroy_lock", true, false);
                FFL.LJIIIZ().getClass();
                FFL.LJ(31744, "studio_nle_public_enable_hot_update", true, false);
                HashMap hashMap = new HashMap();
                if (((Boolean) C171016nR.LIZ.getValue()).booleanValue()) {
                    hashMap.put("ve_enable_seek_parallel_decode", Boolean.TRUE);
                }
                if (((Boolean) C170996nP.LIZ.getValue()).booleanValue()) {
                    hashMap.put("ve_enable_seek_backward_drop_opt", Boolean.TRUE);
                }
                if (((Boolean) C170956nL.LIZ.getValue()).booleanValue()) {
                    hashMap.put("ve_enable_forward_ongoingseek_opt", Boolean.TRUE);
                }
                if (((Boolean) C170976nN.LIZ.getValue()).booleanValue()) {
                    hashMap.put("EnableMultiThreadDecode", Boolean.TRUE);
                }
                C5MK.LIZLLL = hashMap;
                VEUserConfig vEUserConfig2 = c5mj.LIZLLL;
                if (vEUserConfig2 != null) {
                    C82891Wg3.LIZLLL().i("NLEEditorCreator create ASNLEEditor with ve_user_config");
                    if (surfaceView == null) {
                        c133765Mu = new C133765Mu(c5mj.LIZIZ, null, r3a, vEUserConfig2, 32);
                    } else if (c5mj.LIZJ > 0) {
                        c133765Mu = new C133765Mu(c5mj.LIZIZ, surfaceView, r3a, vEUserConfig2, 32);
                    } else {
                        c133765Mu = new C133765Mu(c5mj.LIZIZ, surfaceView, r3a, vEUserConfig2, 32);
                    }
                } else if (surfaceView == null) {
                    C82891Wg3.LIZLLL().i("NLEEditorCreator create ASNLEEditor without ve_user_config, surfaceView == null");
                    c133765Mu = new C133765Mu(c5mj.LIZIZ, null, r3a, null, 56);
                } else if (c5mj.LIZJ > 0) {
                    C82891Wg3.LIZLLL().i("NLEEditorCreator create ASNLEEditor without ve_user_config, params.handler > 0");
                    c133765Mu = new C133765Mu(c5mj.LIZIZ, surfaceView, r3a, null, 56);
                } else {
                    C82891Wg3.LIZLLL().i("NLEEditorCreator create ASNLEEditor");
                    c133765Mu = new C133765Mu(c5mj.LIZIZ, surfaceView, r3a, null, 56);
                }
                this.LJII = c133765Mu;
                if (this.LJIJJ != null) {
                    if (params.getEditorHandler() > 0) {
                        C133765Mu c133765Mu2 = this.LJII;
                        if (c133765Mu2 != null) {
                            c133765Mu2.LLJLLL(false);
                            C133765Mu c133765Mu3 = this.LJII;
                            if (c133765Mu3 != null) {
                                c133765Mu3.LLILLJJLI(0);
                            } else {
                                o.LJIJI("mVEEditor");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mVEEditor");
                            throw null;
                        }
                    }
                    Context context2 = this.LJI;
                    LifecycleOwner lifecycleOwner2 = this.LJIJJLI;
                    C133765Mu c133765Mu4 = this.LJII;
                    if (c133765Mu4 != null) {
                        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = new VEEditorAutoStartStopArbiter(context2, lifecycleOwner2, c133765Mu4, this.LJIJJ, params.getEnableAutoStart());
                        this.LJFF = vEEditorAutoStartStopArbiter;
                        vEEditorAutoStartStopArbiter.LJLLILLLL = new InterfaceC145625na() { // from class: X.5LL
                            @Override // X.InterfaceC145625na
                            public final boolean LIZJ() {
                                return false;
                            }

                            @Override // X.InterfaceC145625na
                            public final boolean LJJJIL() {
                                return false;
                            }

                            @Override // X.InterfaceC145625na
                            public final boolean LJJIJ() {
                                return InterfaceC133095Kf.this.getInterceptAutoPlay();
                            }
                        };
                        SurfaceView surfaceView2 = this.LJIJJ;
                        o.LJI(surfaceView2);
                        LJJIIZI(surfaceView2);
                        InterfaceC134025Nu interfaceC134025Nu = this.LJIL;
                        if (interfaceC134025Nu != null) {
                            C133765Mu c133765Mu5 = this.LJII;
                            if (c133765Mu5 != null) {
                                c133765Mu5.LLIIII(interfaceC134025Nu);
                            } else {
                                o.LJIJI("mVEEditor");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mVEEditor");
                        throw null;
                    }
                }
                this.LJIJI.d("yarkey mVEEditor create");
                this.LJIJI.d(android.util.Log.getStackTraceString(new Throwable()));
                C133765Mu c133765Mu6 = this.LJII;
                if (c133765Mu6 != null) {
                    c133765Mu6.LJII();
                    if (this.LJJ != null) {
                        C133765Mu c133765Mu7 = this.LJII;
                        if (c133765Mu7 != null) {
                            c133765Mu7.LLIIJLIL(new InterfaceC133905Ni() { // from class: X.5MQ
                                @Override // X.InterfaceC133905Ni
                                public final void LIZ(int i, int i2, float f, String str) {
                                    if (i == 4116) {
                                        C5MX c5mx = C5MG.this.LJJ;
                                        o.LJI(c5mx);
                                        c5mx.LIZ();
                                    }
                                }
                            });
                        } else {
                            o.LJIJI("mVEEditor");
                            throw null;
                        }
                    }
                    final C5MS c5ms = this.LJJI;
                    if (c5ms != null) {
                        C133765Mu c133765Mu8 = this.LJII;
                        if (c133765Mu8 != null) {
                            c133765Mu8.LLIIJLIL(new InterfaceC133905Ni() { // from class: X.5MR
                                @Override // X.InterfaceC133905Ni
                                public final void LIZ(int i, int i2, float f, String str) {
                                    C5MS handleEditPreviewPerformanceInfo = C5MS.this;
                                    o.LJIIIZ(handleEditPreviewPerformanceInfo, "$this$handleEditPreviewPerformanceInfo");
                                    if (i == 4122) {
                                        handleEditPreviewPerformanceInfo.LIZ(f);
                                        return;
                                    }
                                    if (i == 4162) {
                                        handleEditPreviewPerformanceInfo.LIZJ(f);
                                    } else if (i == 4163) {
                                        handleEditPreviewPerformanceInfo.LIZLLL((int) f);
                                    } else {
                                        if (i != 4164) {
                                            return;
                                        }
                                        handleEditPreviewPerformanceInfo.LIZIZ((int) f);
                                    }
                                }
                            });
                        } else {
                            o.LJIJI("mVEEditor");
                            throw null;
                        }
                    }
                    final C5MY c5my = this.LJJIFFI;
                    if (c5my != null) {
                        this.LJJII = new LinkedHashSet();
                        C133765Mu c133765Mu9 = this.LJII;
                        if (c133765Mu9 != null) {
                            c133765Mu9.LLIIJLIL(new InterfaceC133905Ni() { // from class: X.5MO
                                @Override // X.InterfaceC133905Ni
                                public final void LIZ(int i, int i2, float f, String msg) {
                                    java.util.Set<String> set;
                                    if (i == 4197 && (set = this.LJJII) != null && !set.contains(msg)) {
                                        o.LJIIIIZZ(msg, "msg");
                                        set.add(msg);
                                        o.LJI(this.LJJII);
                                        C5MY.this.LIZ(i2, (int) f, r0.size() - 1);
                                    }
                                }
                            });
                        } else {
                            o.LJIJI("mVEEditor");
                            throw null;
                        }
                    }
                    C133765Mu c133765Mu10 = this.LJII;
                    if (c133765Mu10 != null) {
                        c133765Mu10.LLLIIIIL(params.getFps());
                        C133765Mu c133765Mu11 = this.LJII;
                        if (c133765Mu11 != null) {
                            c133765Mu11.LLILLJJLI(params.getPageMode());
                            if (params.getPreviewHeight() > 0 && params.getPreviewWidth() > 0) {
                                C133765Mu c133765Mu12 = this.LJII;
                                if (c133765Mu12 != null) {
                                    c133765Mu12.LLJ(params.getPreviewWidth(), params.getPreviewHeight());
                                    return -1;
                                }
                                o.LJIJI("mVEEditor");
                                throw null;
                            }
                            return -1;
                        }
                        o.LJIJI("mVEEditor");
                        throw null;
                    }
                    o.LJIJI("mVEEditor");
                    throw null;
                }
                o.LJIJI("mVEEditor");
                throw null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unknown editor type ");
            LIZ.append(c5mj.LIZ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        o.LJIJI("context");
        throw null;
    }

    public static void LIZIZ(String str, double d, double d2, double d3, C122034qd editorPro) {
        o.LJIIIZ(editorPro, "editorPro");
        C121634pz c121634pz = new C121634pz(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
        c121634pz.LJIIIIZZ = Double.valueOf(d3);
        c121634pz.LJIIIZ = Double.valueOf(d2);
        c121634pz.LJIIJ = Double.valueOf(d);
        editorPro.LJFF().LJJJ(str, c121634pz);
    }
}
