package Y;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C15280iq;
import X.C36411EQt;
import X.C36413EQv;
import X.C43073GvN;
import X.C44423Hc3;
import X.C45593Huv;
import X.C46193IAz;
import X.C60903NvH;
import X.C62850Ola;
import X.C780334l;
import X.EGL;
import X.ER8;
import X.ERB;
import X.ERD;
import X.ERE;
import X.ERF;
import X.ES0;
import X.ES2;
import X.ES4;
import X.ES5;
import X.ES6;
import X.ESA;
import X.ET4;
import X.EXV;
import X.EnumC43649HBd;
import X.EnumC43651HBf;
import X.H78;
import X.IB3;
import X.InterfaceC29911Fj;
import X.InterfaceC43072GvM;
import X.InterfaceC65784Pro;
import X.OR7;
import X.ORS;
import X.V0N;
import X.V16;
import X.X1D;
import X.XKQ;
import X.XKX;
import X.XN6;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateEffectInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AObjectS85S0100000_6 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            default:
                return;
        }
    }

    public AObjectS85S0100000_6(C46193IAz c46193IAz, int i) {
        this.$t = i;
        this.l0 = c46193IAz;
    }

    public static final void onChanged$0(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        String str;
        Long l;
        String str2;
        FaceStickerBean faceStickerBean;
        Long l2;
        String str3;
        ERD LLLLLJLJLL = ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLJLJLL();
        Effect effect = LLLLLJLJLL.LJLL;
        ERB erb = LLLLLJLJLL.LJLLI;
        String str4 = LLLLLJLJLL.LJLJLLL;
        if (effect != null && erb != null) {
            UploadableMobileEffect2 LIZ = erb.LIZ(LLLLLJLJLL.LJLIL.creativeModel.mobileEffectsModel2.exportedEffects);
            if (LIZ != null) {
                ERE ere = (ERE) ((LinkedHashMap) LLLLLJLJLL.LJLJLJ).get(LIZ.effectId);
                if (ere != null) {
                    faceStickerBean = ere.LIZIZ;
                } else {
                    faceStickerBean = null;
                }
                LLLLLJLJLL.LJLLJ = faceStickerBean;
                LLLLLJLJLL.LJLLILLLL = LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("using previous export, stickerId=");
                FaceStickerBean faceStickerBean2 = LLLLLJLJLL.LJLLJ;
                if (faceStickerBean2 != null) {
                    l2 = Long.valueOf(faceStickerBean2.getStickerId());
                } else {
                    l2 = null;
                }
                LIZ2.append(l2);
                LIZ2.append(", effectName=");
                FaceStickerBean faceStickerBean3 = LLLLLJLJLL.LJLLJ;
                if (faceStickerBean3 != null) {
                    str3 = faceStickerBean3.getName();
                } else {
                    str3 = null;
                }
                LIZ2.append(str3);
                H78.LIZIZ("MET-JEFF", X1D.LIZIZ(LIZ2));
                return;
            }
            if (str4 != null) {
                String LIZJ = DiyPropParser.LIZJ(effect);
                InterfaceC43072GvM LJ = C62850Ola.LJ();
                CreativeInfo creativeInfo = LLLLLJLJLL.LJLIL.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                File LJIIIZ = LJ.LJIIIZ(creativeInfo, EnumC43649HBd.MOBILE_EFFECT, str4, false);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(effect.getName());
                LIZ3.append('-');
                C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
                if (currentUser != null) {
                    str = currentUser.getNickname();
                } else {
                    str = null;
                }
                LIZ3.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ3);
                String absolutePath = OR7.LLLILZJ(LJIIIZ, "icon.png").getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "propDir.resolve(\"icon.png\").absolutePath");
                String absolutePath2 = OR7.LLLILZJ(LJIIIZ, "all.zip").getAbsolutePath();
                o.LJIIIIZZ(absolutePath2, "propDir.resolve(\"all.zip\").absolutePath");
                UploadableMobileEffect2 uploadableMobileEffect2 = new UploadableMobileEffect2(str4, LIZIZ, absolutePath, absolutePath2, LJIIIZ.getAbsolutePath(), new TemplateEffectInfo(LIZJ, effect.getEffectId()), null, null, 192, null);
                ERF LIZJ2 = erb.LIZJ(effect, uploadableMobileEffect2);
                InterfaceC65784Pro<Boolean> interfaceC65784Pro = LIZJ2.LIZ;
                int i = LIZJ2.LIZIZ;
                FaceStickerBean faceStickerBean4 = LIZJ2.LIZJ;
                LLLLLJLJLL.LJLLJ = faceStickerBean4;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("convertToStickerBean stickerId=");
                if (faceStickerBean4 != null) {
                    l = Long.valueOf(faceStickerBean4.getStickerId());
                } else {
                    l = null;
                }
                LIZ4.append(l);
                LIZ4.append(" stickerName=");
                if (faceStickerBean4 != null) {
                    str2 = faceStickerBean4.getName();
                } else {
                    str2 = null;
                }
                LIZ4.append(str2);
                H78.LIZIZ("MET-JEFF", X1D.LIZIZ(LIZ4));
                if (i == 1 || interfaceC65784Pro.invoke().booleanValue()) {
                    LLLLLJLJLL.LJLLILLLL = uploadableMobileEffect2;
                    LLLLLJLJLL.LJLJLJ.put(uploadableMobileEffect2.effectId, new ERE(uploadableMobileEffect2, faceStickerBean4, i, interfaceC65784Pro));
                } else {
                    LLLLLJLJLL.LJLLILLLL = null;
                }
                LLLLLJLJLL.LJLJLLL = null;
                ((ArrayList) LLLLLJLJLL.LJLJL).add(XKX.LIZLLL(LLLLLJLJLL.LJLJJLL, null, null, new EGL(LLLLLJLJLL, null), 3));
                return;
            }
            H78.LIZIZ("MET-JEFF", "Pre-record started before newEffectId is ready");
            C60903NvH.LJIIJJI().LJIJJLI();
        }
    }

    public static final void onChanged$1(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        Integer valueOf;
        ERD LLLLLJLJLL = ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLJLJLL();
        LLLLLJLJLL.getClass();
        H78.LIZIZ("MET-JEFF", "onRecordStart");
        Effect effect = LLLLLJLJLL.LJLL;
        UploadableMobileEffect2 uploadableMobileEffect2 = LLLLLJLJLL.LJLLILLLL;
        ERB erb = LLLLLJLJLL.LJLLI;
        if (effect != null && erb != null && uploadableMobileEffect2 != null) {
            ERE ere = (ERE) ((LinkedHashMap) LLLLLJLJLL.LJLJLJ).get(uploadableMobileEffect2.effectId);
            if (ere == null || (valueOf = Integer.valueOf(ere.LIZJ)) == null || valueOf.intValue() != 0) {
                ((ArrayList) LLLLLJLJLL.LJLJL).add(XKX.LIZLLL(C780334l.LJLIL, EXV.LIZ, null, new ER8(LLLLLJLJLL, uploadableMobileEffect2, erb, effect, null), 2));
            } else {
                LLLLLJLJLL.LIZJ(effect, uploadableMobileEffect2, erb, false);
            }
        }
    }

    public static final void onChanged$2(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        Integer valueOf;
        ERD LLLLLJLJLL = ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLJLJLL();
        LLLLLJLJLL.getClass();
        H78.LIZIZ("MET-JEFF", "onRecordStop");
        Effect effect = LLLLLJLJLL.LJLL;
        UploadableMobileEffect2 uploadableMobileEffect2 = LLLLLJLJLL.LJLLILLLL;
        ERB erb = LLLLLJLJLL.LJLLI;
        if (effect != null && erb != null && uploadableMobileEffect2 != null) {
            ERE ere = (ERE) ((LinkedHashMap) LLLLLJLJLL.LJLJLJ).get(uploadableMobileEffect2.effectId);
            if (ere == null || (valueOf = Integer.valueOf(ere.LIZJ)) == null || valueOf.intValue() != 1) {
                return;
            }
            LLLLLJLJLL.LIZJ(effect, uploadableMobileEffect2, erb, true);
        }
    }

    public static final void onChanged$3(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLJLJLL().LJLIL.creativeModel.mobileEffectsModel2.exportedEffects.clear();
    }

    public static final void onChanged$4(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        IB3 ib3;
        String str;
        String str2;
        ES5 c36411EQt;
        String str3;
        List<IB3> list;
        List<IB3> list2;
        UploadableDraftEffect uploadableDraftEffect;
        String str4;
        ES0 LLLLLL = ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLL();
        UploadPicStickerARPresenter uploadPicStickerARPresenter = ((C46193IAz) aObjectS85S0100000_6.l0).LLJJJ;
        LLLLLL.getClass();
        C15280iq.LJ("DiyProp", "onPreRecordStart");
        Effect LLJJIJIIJIL = LLLLLL.LIZLLL.LLJJIJIIJIL();
        if (LLJJIJIIJIL == null) {
            C15280iq.LJ("DiyProp", "current effect is null");
            LLLLLL.LJI = null;
            LLLLLL.LJII = null;
            return;
        }
        String str5 = "";
        if ((LLJJIJIIJIL instanceof DraftEffect) && e1.LIZ(31744, "ame_is_publish_effect_with_video", true, false)) {
            ESA.LIZ.getClass();
            if (ESA.LIZ() && ES4.LIZ() && ES2.LIZ()) {
                C15280iq.LJ("DiyProp", "current effect is draft effect");
                DraftEffect draftEffect = (DraftEffect) LLJJIJIIJIL;
                List<UploadableDraftEffect> list3 = LLLLLL.LIZJ.creativeModel.mobileEffectsModel.usedDraftEffects;
                Iterator<UploadableDraftEffect> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        uploadableDraftEffect = it.next();
                        if (o.LJ(uploadableDraftEffect.draftId, draftEffect.getDraft().draftID)) {
                            break;
                        }
                    } else {
                        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
                        File LJFF = C43073GvN.LJFF(C62850Ola.LJ(), EnumC43651HBf.ADVANCED_MOBILE_EFFECT, null, 6);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZ);
                        LIZ2.append("_effect.zip");
                        File LLLILZJ = OR7.LLLILZJ(LJFF, X1D.LIZIZ(LIZ2));
                        String str6 = draftEffect.getDraft().effectId;
                        if (V0N.LJJII(str6)) {
                            ET4 et4 = LLLLLL.LJIIIIZZ;
                            if (true ^ ((ArrayList) et4.LIZJ).isEmpty()) {
                                str6 = (String) ORS.LJJLJ(et4.LIZJ);
                            } else {
                                str6 = null;
                            }
                            et4.LIZ();
                            if (str6 == null) {
                                C60903NvH.LJIIJJI().LJIJJLI();
                                uploadableDraftEffect = null;
                            }
                        }
                        draftEffect.setEffectId(str6);
                        String str7 = draftEffect.getDraft().draftID;
                        String str8 = draftEffect.getDraft().name;
                        String LJIILJJIL = V16.LJIILJJIL(draftEffect.getDraft());
                        String LJIILIIL = V16.LJIILIIL(draftEffect.getDraft());
                        String absolutePath = LLLILZJ.getAbsolutePath();
                        EffectHintWrapper effectHintWrapper = draftEffect.getDraft().effectHint;
                        if (effectHintWrapper != null && (str4 = effectHintWrapper.hintKey) != null) {
                            str5 = str4;
                        }
                        o.LJIIIIZZ(absolutePath, "absolutePath");
                        uploadableDraftEffect = new UploadableDraftEffect(str6, str7, str8, LJIILJJIL, absolutePath, LJIILIIL, false, false, str5, 192, null);
                        list3.add(uploadableDraftEffect);
                    }
                }
                LLLLLL.LJII = uploadableDraftEffect;
                LLLLLL.LJI = null;
                return;
            }
        }
        XKQ xkq = LLLLLL.LJFF;
        if (xkq != null && xkq.isActive()) {
            C15280iq.LJ("DiyProp", "Is already exporting effect, skipped");
            C60903NvH.LJIIJJI().LJIJJLI();
        } else if (ES0.LIZ(LLJJIJIIJIL) || LLLLLL.LIZIZ(LLJJIJIIJIL)) {
            String unzipPath = LLJJIJIIJIL.getUnzipPath();
            if (V0N.LJJI(LLJJIJIIJIL)) {
                if (uploadPicStickerARPresenter != null && (list = uploadPicStickerARPresenter.LJLZ) != null && !list.isEmpty() && uploadPicStickerARPresenter != null && (list2 = uploadPicStickerARPresenter.LJLZ) != null && (ib3 = (IB3) ListProtector.get(list2, 0)) != null && ib3.LJLJJI == 1 && C45593Huv.LIZ()) {
                    List<UploadableMobileEffect> list4 = LLLLLL.LIZJ.creativeModel.mobileEffectsModel.exportedEffects;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator<UploadableMobileEffect> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (TextUtils.equals(it2.next().selectedMedia, ib3.LJLILLLLZI)) {
                                break;
                            }
                        }
                    }
                }
            } else {
                ib3 = null;
            }
            XN6 LJFF2 = DiyPropParser.LJFF(LLJJIJIIJIL);
            if (V0N.LJJI(LLJJIJIIJIL) || (LJFF2 != null && (!DiyPropParser.LJIIIZ(LLJJIJIIJIL) || DiyPropParser.LJIIJ(LLJJIJIIJIL)))) {
                if (!V0N.LJJI(LLJJIJIIJIL) && !LLLLLL.LJIIIZ.LJLJJI) {
                    C15280iq.LJ("DiyProp", "no change");
                } else {
                    ET4 et42 = LLLLLL.LJIIIIZZ;
                    if (true ^ ((ArrayList) et42.LIZJ).isEmpty()) {
                        str = (String) ORS.LJJLJ(et42.LIZJ);
                    } else {
                        str = null;
                    }
                    et42.LIZ();
                    if (str == null) {
                        C15280iq.LJ("DiyProp", "Cannot export, failed to generate effectId");
                        C60903NvH.LJIIJJI().LJIJJLI();
                    } else {
                        if (!V0N.LJJI(LLJJIJIIJIL)) {
                            LLLLLL.LJIIIZ.LJLJJI = false;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LLJJIJIIJIL.getName());
                        LIZ3.append('-');
                        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
                        if (currentUser != null) {
                            str2 = currentUser.getNickname();
                        } else {
                            str2 = null;
                        }
                        LIZ3.append(str2);
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        InterfaceC43072GvM LJ = C62850Ola.LJ();
                        CreativeInfo creativeInfo = LLLLLL.LIZJ.creativeInfo;
                        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                        File LIZJ = C43073GvN.LIZJ(LJ, creativeInfo, EnumC43649HBd.MOBILE_EFFECT, str, 8);
                        String LIZJ2 = DiyPropParser.LIZJ(LLJJIJIIJIL);
                        if (LIZJ2.length() == 0) {
                            H78.LIZJ("DiyProp: templateResourceId null");
                        } else {
                            String absolutePath2 = OR7.LLLILZJ(LIZJ, "icon.png").getAbsolutePath();
                            o.LJIIIIZZ(absolutePath2, "propDir.resolve(\"icon.png\").absolutePath");
                            String absolutePath3 = OR7.LLLILZJ(LIZJ, "all.zip").getAbsolutePath();
                            o.LJIIIIZZ(absolutePath3, "propDir.resolve(\"all.zip\").absolutePath");
                            String effectId = LLJJIJIIJIL.getEffectId();
                            if (ib3 != null && (str3 = ib3.LJLILLLLZI) != null) {
                                str5 = str3;
                            }
                            UploadableMobileEffect uploadableMobileEffect = new UploadableMobileEffect(str, LIZIZ, absolutePath2, absolutePath3, LIZJ2, effectId, str5);
                            ES6 es6 = ES5.LIZ;
                            ActivityC45651qj context = LLLLLL.LIZ;
                            boolean LJJI = V0N.LJJI(LLJJIJIIJIL);
                            es6.getClass();
                            o.LJIIIZ(context, "context");
                            o.LJIIIZ(unzipPath, "unzipPath");
                            if (LJJI) {
                                c36411EQt = new C36413EQv(context, uploadableMobileEffect, unzipPath, LLJJIJIIJIL, ib3, LIZJ);
                            } else {
                                c36411EQt = new C36411EQt(uploadableMobileEffect, LJFF2, unzipPath);
                            }
                            LLLLLL.LJI = c36411EQt;
                            LLLLLL.LJII = null;
                            C15280iq.LJ("DiyProp", "onPreRecordStart lastExport");
                        }
                    }
                }
            }
        } else {
            C15280iq.LJ("DiyProp", "can not edit");
        }
        c36411EQt = null;
        LLLLLL.LJI = c36411EQt;
        LLLLLL.LJII = null;
        C15280iq.LJ("DiyProp", "onPreRecordStart lastExport");
    }

    public static final void onChanged$5(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLL().LIZJ();
    }

    public static final void onChanged$6(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLL().LIZJ();
    }

    public static final void onChanged$7(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLL().LIZJ();
    }

    public static final void onChanged$8(AObjectS85S0100000_6 aObjectS85S0100000_6, Object obj) {
        ((C46193IAz) aObjectS85S0100000_6.l0).LLLLLL().LIZJ.creativeModel.mobileEffectsModel.usedDraftEffects.clear();
    }
}
