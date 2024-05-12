package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import com.ss.ugc.android.editor.components.base.api.IMagicProcessorService;
import defpackage.g0;
import defpackage.i0;
import dmt.av.video.StoredLiveData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS6S0100001_2;
import kotlin.jvm.internal.AqS70S1100000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.4yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126844yO {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final NLEEditor LIZ;
    public final C122034qd LIZIZ;
    public final StoredLiveData<C5RV> LIZJ;
    public final Activity LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final InterfaceC126184xK LJI;
    public NLENode LJII;
    public final C62822Ol8 LJIIIIZZ;

    public final A90 LJII() {
        return (A90) this.LJFF.getValue();
    }

    public final NLEModel LJIIIIZZ() {
        if (this.LIZ.LJ() == null) {
            NLEModel nLEModel = new NLEModel();
            this.LIZ.LJII(nLEModel);
            return nLEModel;
        }
        NLEModel LJ = this.LIZ.LJ();
        o.LJIIIIZZ(LJ, "{\n            nleEditor.model\n        }");
        return LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> LJIIJ() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126844yO.LJIIJ():java.util.List");
    }

    public final Integer LJIIJJI() {
        NLETrackSlot LJIIL = LJIIL();
        if (LJIIL != null) {
            if (C78596Usy.LJJJJI(LJIIL)) {
                return 1;
            }
            NLESegment LJI = LJIIL.LJI();
            if (LJI != null) {
                NLESegmentTimeEffect LIZLLL = NLESegmentTimeEffect.LIZLLL(LJI);
                return Integer.valueOf((int) NLEEditorJniJNI.NLESegmentTimeEffect_getTimeEffectType(LIZLLL.LIZJ, LIZLLL));
            }
            return null;
        }
        return null;
    }

    public final NLETrackSlot LJIIL() {
        NLETrack LJJIJIIJI = C17J.LJJIJIIJI(LJIIIIZZ());
        if (LJJIJIIJI != null) {
            return LJJIJIIJI.LJIILIIL(0);
        }
        return null;
    }

    public static String LJFF(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return null;
        }
        if (C17J.LJJIJLIJ(nLETrackSlot)) {
            return "time";
        }
        if (C17J.LJJIL(nLETrackSlot)) {
            return LJIILIIL(nLETrackSlot, "nleExtraEffectCategory");
        }
        NLESegment LJI = nLETrackSlot.LJI();
        if (LJI == null) {
            return null;
        }
        return LJI.getExtra("nleExtraEffectCategory");
    }

    public static String LJIIIZ(NLETrackSlot nLETrackSlot) {
        if (C17J.LJJIL(nLETrackSlot)) {
            if (nLETrackSlot != null) {
                return LJIILIIL(nLETrackSlot, "nleExtraEffectKey");
            }
        } else if (nLETrackSlot != null) {
            return C124574uj.LJIJJ(nLETrackSlot);
        }
        return null;
    }

    public final String LJI(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        if (C17J.LJJIJLIJ(slot) || C78596Usy.LJJJJI(slot)) {
            return String.valueOf(LJIIJJI());
        }
        String LJIJJ = C124574uj.LJIJJ(slot);
        if (LJIJJ != null) {
            return LJIJJ;
        }
        return "";
    }

    public final void LJIILLIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        NLEModel LJ = this.LIZ.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        List LJJIIJ = C17J.LJJIIJ(LJ);
        interfaceC65784Pro.invoke();
        NLEModel LJ2 = this.LIZ.LJ();
        o.LJIIIIZZ(LJ2, "nleEditor.model");
        if (((ArrayList) C17J.LJJIIJ(LJ2)).isEmpty()) {
            Iterator it = ((ArrayList) LJJIIJ).iterator();
            while (it.hasNext()) {
                NLETrack nLETrack = (NLETrack) it.next();
                nLETrack.setEnable(false);
                this.LIZ.LJ().addTrack(nLETrack);
            }
            C122034qd c122034qd = this.LIZIZ;
            if (c122034qd != null) {
                c122034qd.LJIIJJI();
            }
        }
    }

    public final void LJIJ(EnumC126674y7 enumC126674y7) {
        String LJIILJJIL;
        NLECommit LIZ = this.LIZ.LIZLLL().LIZ();
        String NLECommit_getDescription = NLEEditorJniJNI.NLECommit_getDescription(LIZ.LIZ, LIZ);
        if (NLECommit_getDescription == null || NLECommit_getDescription.length() == 0) {
            return;
        }
        Object obj = null;
        if (0 != 0) {
            return;
        }
        Gson gson = C6YK.LIZIZ;
        if (gson != null) {
            try {
                obj = gson.LJI(NLECommit_getDescription, C139795eB.class);
            } catch (Exception unused) {
            }
        }
        C139795eB c139795eB = (C139795eB) obj;
        if (c139795eB == null || (LJIILJJIL = C77413UZt.LJIILJJIL(c139795eB, enumC126674y7, this.LIZLLL, (java.util.Map) this.LJIIIIZZ.getValue())) == null || LJIILJJIL.length() <= 0) {
            return;
        }
        Activity activity = this.LIZLLL;
        o.LJIIIZ(activity, "activity");
        C5OG.LIZJ(new AqS70S1100000_2(activity, LJIILJJIL, 3));
    }

    public static void LIZ(NLENode nLENode, EffectModel effectModel) {
        H78.LIZIZ("EditEffectNLEHandler", "processing extra to NLENode");
        nLENode.setExtra("nleExtraEffectKey", effectModel.key);
        nLENode.setExtra("nleExtraEffectType", String.valueOf(effectModel.type));
        nLENode.setExtra("original_effect_name", effectModel.name);
        nLENode.setExtra("nleExtraEffectColor", String.valueOf(effectModel.color));
        nLENode.setExtra("nleExtraEffectTag", effectModel.extra);
        nLENode.setExtra("nleExtraEffectDirectory", effectModel.resDir);
        nLENode.setExtra("nleExtraEffectSelectedColor", String.valueOf(effectModel.color));
        nLENode.setExtra("nleExtraEffectCategory", effectModel.category);
        nLENode.setExtra("nleExtraEffectIndex", String.valueOf(effectModel.index));
        nLENode.setExtra("nleExtraEffectSelectFrom", effectModel.selectFrom);
        nLENode.setExtra("nle_extra_resource_id", effectModel.resourceId);
        String str = effectModel.challenge;
        if (str == null) {
            str = "";
        }
        nLENode.setExtra("nleExtraEffectChallenge", str);
    }

    public static String LJIILIIL(NLETrackSlot nleTrackSlot, String str) {
        NLENode nLENode;
        NLENode nLENode2;
        NLESegmentFilter LIZIZ;
        NLEFilter nLEFilter;
        NLESegmentFilter LIZIZ2;
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        NLETrackSlot LJIIIIZZ = nleTrackSlot.LJIIIIZZ();
        if (LJIIIIZZ != null && LJIIIIZZ.LJI() != null) {
            if (!nleTrackSlot.LJIIIIZZ().LJI().hasExtra(str)) {
                return null;
            }
            return nleTrackSlot.LJIIIIZZ().LJI().getExtra(str);
        }
        if (ORZ.LJLLLL(nleTrackSlot.LJ()) != null) {
            NLEFilter nLEFilter2 = (NLEFilter) ORZ.LJLLLL(nleTrackSlot.LJ());
            if (nLEFilter2 == null || (LIZIZ = nLEFilter2.LIZIZ()) == null || !LIZIZ.hasExtra(str) || (nLEFilter = (NLEFilter) ORZ.LJLLLL(nleTrackSlot.LJ())) == null || (LIZIZ2 = nLEFilter.LIZIZ()) == null) {
                return null;
            }
            return LIZIZ2.getExtra(str);
        }
        if (ORZ.LJLLLLLL(0, nleTrackSlot.LJIIJ()) == null || (nLENode = (NLENode) ORZ.LJLLLL(nleTrackSlot.LJIIJ())) == null || !nLENode.hasExtra(str) || (nLENode2 = (NLENode) ORZ.LJLLLL(nleTrackSlot.LJIIJ())) == null) {
            return null;
        }
        return nLENode2.getExtra(str);
    }

    public final void LIZIZ(int i, OSZ<Long, Long> osz) {
        C5RV LJII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    LJII = C5RV.LJI();
                } else if (osz == null) {
                    return;
                } else {
                    LJII = new C5RV("3", osz.getFirst().longValue(), osz.getSecond().longValue());
                }
            } else if (osz == null) {
                return;
            } else {
                LJII = new C5RV("2", osz.getFirst().longValue(), osz.getSecond().longValue());
            }
        } else {
            LJII = C5RV.LJII();
        }
        this.LIZJ.setValue(LJII);
    }

    public final void LIZLLL(EnumC124724uy enumC124724uy, String msg) {
        String LIZ;
        o.LJIIIZ(msg, "msg");
        if (enumC124724uy != null) {
            int i = C124744v0.LIZ[enumC124724uy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                NLEEditor nLEEditor = this.LIZ;
                if (msg.length() == 0) {
                    LIZ = null;
                } else {
                    LIZ = C6YK.LIZ(new C139795eB(msg, null, null, null, null, 30));
                }
                g0.LJIILIIL(nLEEditor, true, LIZ, false, false, 12);
                return;
            }
            this.LIZ.LIZIZ();
        }
    }

    public final void LJIILL(NLETrackSlot nLETrackSlot, InterfaceC126184xK interfaceC126184xK) {
        NLETrackSlot LJIIIIZZ;
        int i = 0;
        if (nLETrackSlot != null && (LJIIIIZZ = nLETrackSlot.LJIIIIZZ()) != null && LJIIIIZZ.LJI() != null) {
            nLETrackSlot.setProcessor(new VecString(new String[0]));
            nLETrackSlot.LJIILJJIL(new NLETrackSlot());
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
        if (extra == null) {
            extra = "";
        }
        String extra2 = nLETrackSlot.getExtra("ep_magic_effect_id");
        if (extra2 == null) {
            extra2 = "";
        }
        if (!ujb.o.LJJJJJL(extra)) {
            NLEModel LJIIIIZZ2 = LJIIIIZZ();
            List LJLJJL = s.LJLJJL(extra2, new String[]{","}, 0, 6);
            for (Object obj : s.LJLJJL(extra, new String[]{","}, 0, 6)) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (!ujb.o.LJJJJJL(str)) {
                        String str2 = (String) ORZ.LJLLLLLL(i, LJLJJL);
                        if (str2 == null) {
                            str2 = "";
                        }
                        interfaceC126184xK.LIZIZ(new C125184vi(new C125244vo(null, str, str2, null, null, null, 121), nLETrackSlot, LJIIIIZZ2));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void LJIIZILJ(long j, boolean z) {
        NLEModel LJIIIIZZ = LJIIIIZZ();
        List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(LJIIIIZZ);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = LJIILIIL.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJIILL(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
            if (nLETrackSlot.getEndTime() > j) {
                if (nLETrackSlot.getStartTime() >= j) {
                    NLETrack trackBySlot = LJIIIIZZ.getTrackBySlot(nLETrackSlot);
                    trackBySlot.LJIJJLI(nLETrackSlot);
                    if (trackBySlot.LJIILL().isEmpty()) {
                        LJIIIIZZ.removeTrack(trackBySlot);
                    }
                } else {
                    nLETrackSlot.setEndTime(j);
                }
            }
        }
        if (z) {
            LIZLLL(EnumC124724uy.DONE, "");
        }
    }

    public static final void LIZJ(C126844yO c126844yO, NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot = c126844yO.LJIIIIZZ().getTrackBySlot(nLETrackSlot);
        if (trackBySlot == null) {
            return;
        }
        if (trackBySlot.LJIILL().size() == 1) {
            nLEModel.removeTrack(trackBySlot);
        } else {
            trackBySlot.LJIJJLI(nLETrackSlot);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.bytedance.ies.nle.editor_jni.NLESegmentEffect] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.bytedance.ies.nle.editor_jni.NLESegment] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter, com.bytedance.ies.nle.editor_jni.NLESegmentFilter] */
    public static NLETrackSlot LJ(EffectModel effectModel, long j, long j2) {
        EnumC123834tX enumC123834tX;
        ?? nLESegmentEffect;
        boolean LIZ = C126234xP.LIZ();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        Boolean bool = effectModel.isNewEngineEffect;
        o.LJIIIIZZ(bool, "param.isNewEngineEffect");
        if (bool.booleanValue()) {
            enumC123834tX = EnumC123834tX.AMAZING;
        } else {
            enumC123834tX = EnumC123834tX.NORMAL;
        }
        nLEResourceNode.LJIIL(enumC123834tX);
        nLEResourceNode.LJIIIZ(effectModel.resDir);
        nLEResourceNode.LJIIJJI(effectModel.name);
        nLEResourceNode.LJIIJ(effectModel.key);
        nLEResourceNode.LJIILIIL(EnumC123874tb.COMPOSER);
        ?? nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(j);
        nLETrackSlot.setEndTime(j2);
        int i = 0;
        if (LIZ && !effectModel.isNewEngineEffect.booleanValue()) {
            nLESegmentEffect = new NLESegmentComposerFilter();
            nLESegmentEffect.LJI(nLEResourceNode);
            NLEEditorJniJNI.NLESegmentComposerFilter_setStatus(nLESegmentEffect.LJ, nLESegmentEffect, 1);
            nLESegmentEffect.LJII(effectModel.name);
            String[] strArr = new String[1];
            String str = effectModel.extra;
            if (str == null) {
                str = "";
            }
            strArr[0] = str;
            nLESegmentEffect.LJIIJ(new VecString(strArr));
        } else {
            nLESegmentEffect = new NLESegmentEffect();
            nLESegmentEffect.LJFF(nLEResourceNode);
            NLEEditorJniJNI.NLESegmentEffect_setEffectName(nLESegmentEffect.LIZJ, nLESegmentEffect, effectModel.name);
            Boolean bool2 = effectModel.isNewEngineEffect;
            o.LJIIIIZZ(bool2, "param.isNewEngineEffect");
            if (bool2.booleanValue()) {
                if (C126934yX.LIZ()) {
                    i = 2;
                }
                NLEEditorJniJNI.NLESegmentEffect_setApplyTargetType(nLESegmentEffect.LIZJ, nLESegmentEffect, i);
                try {
                    JSONObject jSONObject = new JSONObject(effectModel.adjustParams);
                    Iterator<String> keys = jSONObject.keys();
                    o.LJIIIIZZ(keys, "adjustObj.keys()");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                        NLEEditorJniJNI.NLEStringFloatPair_setFirst(nLEStringFloatPair.LIZ, nLEStringFloatPair, next);
                        nLEStringFloatPair.LIZIZ((float) jSONObject.optDouble(next));
                        NLEEditorJniJNI.NLESegmentEffect_addAdjustParams(nLESegmentEffect.LIZJ, nLESegmentEffect, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
                    }
                } catch (Exception unused) {
                }
            }
        }
        nLETrackSlot.LJIIL(nLESegmentEffect);
        return nLETrackSlot;
    }

    public final void LJIILJJIL(final EffectModel model, Context context, final InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        NLETrack mainTrack;
        EnumC126954yZ enumC126954yZ;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(context, "context");
        if (!C74216TAu.LIZIZ.LJIIIZ()) {
            C78596Usy.LJJJLIIL(context, true);
            interfaceC88472Yns.invoke("Network Error");
            return;
        }
        A90 LJII = LJII();
        if (LJII != null) {
            LJII.LJLJJLL = new A91() { // from class: X.4yQ
                @Override // X.A91
                public final void LIZ(Dialog dialog) {
                    NLEModel dynamicCast;
                    o.LJIIIZ(dialog, "dialog");
                    InterfaceC126184xK interfaceC126184xK = C126844yO.this.LJI;
                    if (interfaceC126184xK != null) {
                        interfaceC126184xK.LIZJ();
                    }
                    C126844yO c126844yO = C126844yO.this;
                    NLENode nLENode = c126844yO.LJII;
                    if (nLENode != null && (dynamicCast = NLEModel.dynamicCast(nLENode)) != null) {
                        c126844yO.LIZ.LJII(dynamicCast);
                        c126844yO.LIZ.LIZIZ();
                    }
                    C126844yO c126844yO2 = C126844yO.this;
                    InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                    c126844yO2.getClass();
                    C6QQ.LIZ(new C127244z2(c126844yO2, null, interfaceC88472Yns2, "cancel", 0));
                }
            };
        }
        if (C17J.LJJIJL(LJIIIIZZ())) {
            mainTrack = (NLETrack) ListProtector.get(C17J.LJJIIJ(LJIIIIZZ()), 0);
        } else if (LJIIIIZZ().getMainTrack() == null) {
            mainTrack = new NLETrack();
            mainTrack.LJJ(true);
            LJIIIIZZ().addTrack(mainTrack);
        } else {
            mainTrack = LJIIIIZZ().getMainTrack();
        }
        final NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, mainTrack.LJIILLIIL());
        if (nLETrackSlot != null) {
            NLENode deepClone = LJIIIIZZ().deepClone(false);
            InterfaceC126184xK interfaceC126184xK = this.LJI;
            if (interfaceC126184xK != null) {
                LJIILL(nLETrackSlot, interfaceC126184xK);
                ArrayList arrayList = new ArrayList();
                Boolean isServerEffect = model.isServerEffect();
                o.LJIIIIZZ(isServerEffect, "model.isServerEffect");
                if (isServerEffect.booleanValue()) {
                    arrayList.add(EnumC126884yS.PHOTO);
                    enumC126954yZ = EnumC126954yZ.SERVER_GAME_PLAY;
                } else {
                    Boolean isClientEffect = model.isClientEffect();
                    o.LJIIIIZZ(isClientEffect, "model.isClientEffect");
                    if (isClientEffect.booleanValue()) {
                        arrayList.add(EnumC126884yS.VIDEO);
                        enumC126954yZ = EnumC126954yZ.CLIENT_GAME_PLAY;
                    } else {
                        arrayList.add(EnumC126884yS.PHOTO);
                        enumC126954yZ = EnumC126954yZ.COMBINE_GAME_PLAY;
                    }
                }
                String str = model.name;
                o.LJIIIIZZ(str, "model.name");
                String str2 = model.resourceId;
                o.LJIIIIZZ(str2, "model.resourceId");
                String str3 = model.key;
                o.LJIIIIZZ(str3, "model.key");
                String str4 = model.resDir;
                o.LJIIIIZZ(str4, "model.resDir");
                C125184vi c125184vi = new C125184vi(new C125244vo(str, str2, str3, str4, arrayList, enumC126954yZ, 64), nLETrackSlot, LJIIIIZZ());
                InterfaceC126184xK interfaceC126184xK2 = this.LJI;
                if (interfaceC126184xK2 != null) {
                    interfaceC126184xK2.LJ(c125184vi, new InterfaceC126134xF() { // from class: X.4yP
                        @Override // X.InterfaceC126134xF
                        public final void onStart() {
                            H78.LIZIZ("EditEffectNLEHandler", "onStart");
                            C126844yO c126844yO = C126844yO.this;
                            c126844yO.getClass();
                            C6QQ.LIZ(new AqS152S0100000_2(c126844yO, 244));
                        }

                        @Override // X.InterfaceC126134xF
                        public final void onSuccess() {
                            NLEVideoEffect nLEVideoEffect;
                            NLESegment LJI;
                            NLESegment LJI2;
                            NLESegmentFilter LIZIZ;
                            H78.LIZIZ("EditEffectNLEHandler", "onSuccess");
                            C126844yO c126844yO = C126844yO.this;
                            NLETrackSlot targetSlot = nLETrackSlot;
                            EffectModel effectModel = model;
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                            c126844yO.getClass();
                            Boolean isClientEffect2 = effectModel.isClientEffect();
                            o.LJIIIIZZ(isClientEffect2, "model.isClientEffect");
                            if (isClientEffect2.booleanValue()) {
                                H78.LIZIZ("EditEffectNLEHandler", "processing client rendering extra");
                                NLEFilter nLEFilter = (NLEFilter) ORZ.LJLLLL(targetSlot.LJ());
                                if (nLEFilter != null && (LIZIZ = nLEFilter.LIZIZ()) != null) {
                                    H78.LIZIZ("EditEffectNLEHandler", "processing client rendering filter segment");
                                    C126844yO.LIZ(LIZIZ, effectModel);
                                }
                                NLETrackSlot LJIIIIZZ = targetSlot.LJIIIIZZ();
                                if (LJIIIIZZ != null && (LJI2 = LJIIIIZZ.LJI()) != null) {
                                    H78.LIZIZ("EditEffectNLEHandler", "processing client rendering main segment");
                                    C126844yO.LIZ(LJI2, effectModel);
                                }
                            } else {
                                Boolean isServerEffect2 = effectModel.isServerEffect();
                                o.LJIIIIZZ(isServerEffect2, "model.isServerEffect");
                                if (isServerEffect2.booleanValue()) {
                                    NLETrackSlot LJIIIIZZ2 = targetSlot.LJIIIIZZ();
                                    if (LJIIIIZZ2 != null && (LJI = LJIIIIZZ2.LJI()) != null) {
                                        H78.LIZIZ("EditEffectNLEHandler", "processing server rendering extra");
                                        C126844yO.LIZ(LJI, effectModel);
                                    }
                                } else {
                                    Boolean isCombinedEffect = effectModel.isCombinedEffect();
                                    o.LJIIIIZZ(isCombinedEffect, "model.isCombinedEffect");
                                    if (isCombinedEffect.booleanValue() && (nLEVideoEffect = (NLEVideoEffect) ORZ.LJLLLLLL(0, targetSlot.LJIIJ())) != null && C124614un.LJIIIZ(nLEVideoEffect)) {
                                        H78.LIZIZ("EditEffectNLEHandler", "processing combined rendering extra");
                                        C126844yO.LIZ(nLEVideoEffect, effectModel);
                                    }
                                }
                            }
                            o.LJIIIZ(targetSlot, "targetSlot");
                            targetSlot.removeExtraWithKey("ep_magic_resource_id");
                            targetSlot.removeExtraWithKey("ep_magic_effect_id");
                            String str5 = effectModel.resourceId;
                            o.LJIIIIZZ(str5, "model.resourceId");
                            String str6 = effectModel.key;
                            o.LJIIIIZZ(str6, "model.key");
                            C125204vk.LIZIZ(targetSlot, str5, str6);
                            C2U8.LIZ(new IEvent() { // from class: X.4yT
                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent post() {
                                    C2U8.LIZ(this);
                                    return this;
                                }

                                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                public final /* synthetic */ IEvent postSticky() {
                                    C2U8.LIZIZ(this);
                                    return this;
                                }
                            });
                            c126844yO.LJIIZILJ(targetSlot.getDuration(), false);
                            C6QQ.LIZ(new AqS91S0300000_2(targetSlot, (NLETrackSlot) c126844yO, (C126844yO) interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 3));
                        }

                        @Override // X.InterfaceC126134xF
                        public final void LIZ(C126124xE c126124xE) {
                            NLEModel dynamicCast;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("onFail :: ");
                            LIZ.append(c126124xE.LJLILLLLZI);
                            LIZ.append(". ");
                            LIZ.append(c126124xE.LJLIL);
                            H78.LIZIZ("EditEffectNLEHandler", X1D.LIZIZ(LIZ));
                            C126844yO c126844yO = C126844yO.this;
                            NLENode nLENode = c126844yO.LJII;
                            if (nLENode != null && (dynamicCast = NLEModel.dynamicCast(nLENode)) != null) {
                                c126844yO.LIZ.LJII(dynamicCast);
                                c126844yO.LIZ.LIZIZ();
                            }
                            C126844yO c126844yO2 = C126844yO.this;
                            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                            int i = c126124xE.LJLIL;
                            String str5 = c126124xE.LJLILLLLZI;
                            c126844yO2.getClass();
                            C6QQ.LIZ(new C127244z2(c126844yO2, str5, interfaceC88472Yns2, "mix effect fail", i));
                        }

                        @Override // X.InterfaceC126134xF
                        public final void onProgress(int i) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("onProgress ::  ");
                            LIZ.append(i);
                            H78.LIZIZ("EditEffectNLEHandler", X1D.LIZIZ(LIZ));
                            C126844yO c126844yO = C126844yO.this;
                            c126844yO.getClass();
                            C6QQ.LIZ(new AqS6S0100001_2(c126844yO, i, 0));
                        }
                    });
                }
                if (C76800UCe.LIZ != null) {
                    this.LJII = deepClone;
                    return;
                }
            }
            H78.LIZIZ("EditEffectNLEHandler", "magic processor manager is null");
        }
    }

    public C126844yO(NLEEditor nleEditor, C122034qd c122034qd, StoredLiveData timeEffectOpLiveData, ActivityC45651qj activity, CreativeInfo creativeInfo) {
        o.LJIIIZ(nleEditor, "nleEditor");
        o.LJIIIZ(timeEffectOpLiveData, "timeEffectOpLiveData");
        o.LJIIIZ(activity, "activity");
        this.LIZ = nleEditor;
        this.LIZIZ = c122034qd;
        this.LIZJ = timeEffectOpLiveData;
        this.LIZLLL = activity;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 241));
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 242));
        EnumC43651HBf enumC43651HBf = EnumC43651HBf.STYLE_EFFECT;
        C44683HgF c44683HgF = new C44683HgF(enumC43651HBf, creativeInfo);
        C126874yR c126874yR = new C126874yR();
        c126874yR.LIZ = c44683HgF;
        c126874yR.LIZIZ = c44683HgF;
        c126874yR.LIZJ = c44683HgF;
        c126874yR.LIZLLL = c44683HgF;
        c126874yR.LJ = c44683HgF;
        C126944yY LIZ = c126874yR.LIZ();
        IMagicProcessorService iMagicProcessorService = (IMagicProcessorService) C171096nZ.LIZ(IMagicProcessorService.class);
        if (iMagicProcessorService != null) {
            DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
            InterfaceC126184xK magicProcessorManager = iMagicProcessorService.getMagicProcessorManager();
            DAVUnZipFunc dAVUnZipFunc = new DAVUnZipFunc() { // from class: X.5lC
                @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
                public final boolean unZip(String str, String str2, boolean z) {
                    boolean z2 = false;
                    if (str != null && !ujb.o.LJJJJJL(str) && str2 != null && !ujb.o.LJJJJJL(str2)) {
                        String LJFF = i0.LJFF(str2, "_temp");
                        File file = new File(LJFF);
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        }
                        try {
                            C10820be.LJIJI(str, LJFF);
                            String absolutePath = file.getAbsolutePath();
                            o.LJIIIIZZ(absolutePath, "unzipTemp.absolutePath");
                            if (new File(str2).exists()) {
                                OR7.LLLIIL(new File(str2));
                            }
                            File file2 = new File(absolutePath);
                            File file3 = new File(str2);
                            if (file2.exists()) {
                                z2 = file2.renameTo(file3);
                            }
                            if (z) {
                                C16880lQ.LLLZZIL(new File(str));
                            }
                        } catch (Exception e) {
                            H78.LIZLLL("EditEffectNLEHandler", e);
                        }
                    }
                    return z2;
                }
            };
            Context LLLLJ = C16880lQ.LLLLJ(activity);
            o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
            magicProcessorManager.LIZLLL(LLLLJ, LIZ, dAVUnZipFunc);
            String dir = C43073GvN.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathService(), enumC43651HBf, null, 6).getPath();
            C133035Jz c133035Jz = C133785Mw.LJFF;
            NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
            c133035Jz.getClass();
            C5J1 V8 = C133035Jz.LIZ(nLEMediaConfig, null, nleEditor).V8();
            o.LJIIIIZZ(dir, "dir");
            magicProcessorManager.LIZ(C47261Igj.LJII(new C125224vm(), new C125214vl(), new C125254vp(nleEditor, V8, dir)));
            this.LJI = magicProcessorManager;
            C126924yW.LIZ = true;
            XBE.LJIIIIZZ.getClass();
            XBE LIZ2 = C84419XBf.LIZ();
            OQN oqn = new OQN();
            synchronized (LIZ2) {
                LIZ2.LJFF = oqn;
            }
        }
        this.LJIIIIZZ = C221108m2.LIZIZ(C126824yM.LJLIL);
    }
}
