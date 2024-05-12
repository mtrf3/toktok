package Y;

import X.ActivityC45651qj;
import X.C00F;
import X.C10K;
import X.C132425Hq;
import X.C141335gf;
import X.C157776Hd;
import X.C157916Hr;
import X.C164996dj;
import X.C169776lR;
import X.C169786lS;
import X.C26045AKb;
import X.C3C4;
import X.C3C5;
import X.C52830KoM;
import X.C60903NvH;
import X.C68M;
import X.C6IH;
import X.C6PB;
import X.C76800UCe;
import X.C78915Uy7;
import X.H7B;
import X.InterfaceC170656mr;
import X.ORZ;
import X.TN4;
import X.WPZ;
import X.X1D;
import X.XJL;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontExtra;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDObjectS384S0100000_2 implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                return;
            case 1:
                onFail$1(this, exceptionResult);
                return;
            case 2:
                onFail$2(this, exceptionResult);
                return;
            case 3:
                onFail$3(this, exceptionResult);
                return;
            case 4:
                onFail$4(this, exceptionResult);
                return;
            case 5:
                onFail$5(this, exceptionResult);
                return;
            case 6:
                onFail$6(this, exceptionResult);
                return;
            case 7:
                onFail$7(this, exceptionResult);
                return;
            case 8:
                onFail$8(this, exceptionResult);
                return;
            case 9:
                onFail$9(this, exceptionResult);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                return;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                return;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                return;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                return;
            case 4:
                onSuccess$4(this, effectChannelResponse);
                return;
            case 5:
                onSuccess$5(this, effectChannelResponse);
                return;
            case 6:
                onSuccess$6(this, effectChannelResponse);
                return;
            case 7:
                onSuccess$7(this, effectChannelResponse);
                return;
            case 8:
                onSuccess$8(this, effectChannelResponse);
                return;
            case 9:
                onSuccess$9(this, effectChannelResponse);
                return;
            default:
                return;
        }
    }

    public IDObjectS384S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        IDiS266S0100000_2 iDiS266S0100000_2;
        ((C169776lR) iDObjectS384S0100000_2.l0).LJJ(false);
        ArrayList arrayList = new ArrayList();
        ((C169776lR) iDObjectS384S0100000_2.l0).LIZIZ(arrayList);
        ((C169776lR) iDObjectS384S0100000_2.l0).LIZ(arrayList);
        ((C169776lR) iDObjectS384S0100000_2.l0).LJJIJLIJ.setData(arrayList);
        C169776lR c169776lR = (C169776lR) iDObjectS384S0100000_2.l0;
        c169776lR.LJJ.setAdapter(c169776lR.LJJIJLIJ);
        C169776lR c169776lR2 = (C169776lR) iDObjectS384S0100000_2.l0;
        c169776lR2.getClass();
        if (arrayList.size() > 0 && (iDiS266S0100000_2 = c169776lR2.LJJJZ) != null) {
            iDiS266S0100000_2.onPageSelected(0);
        }
        ActivityC45651qj activityC45651qj = ((C169776lR) iDObjectS384S0100000_2.l0).LJJIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.rjt);
        C78915Uy7.LJJIIZI(activityC45651qj, 6001, creativeToastBuilder);
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uniformFetchList fail : ");
        LIZ.append(exceptionResult.toString());
        LJJIIZI.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$1(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prefetch fail err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$2(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("textFontDownload err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$3(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        Exception exception;
        if (!((XJL) iDObjectS384S0100000_2.l0).isActive()) {
            return;
        }
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
            C3C4 LIZ = C141335gf.LIZ(exception);
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        XJL xjl2 = (XJL) iDObjectS384S0100000_2.l0;
        C3C4 LIZ2 = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ2);
        xjl2.resumeWith(LIZ2);
    }

    public static final void onFail$4(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        Exception exception;
        if (!((XJL) iDObjectS384S0100000_2.l0).isActive()) {
            return;
        }
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
            C3C4 LIZ = C141335gf.LIZ(exception);
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        XJL xjl2 = (XJL) iDObjectS384S0100000_2.l0;
        C3C4 LIZ2 = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ2);
        xjl2.resumeWith(LIZ2);
    }

    public static final void onFail$5(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prefetch fail err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        WPZ.LIZIZ.LJ("text", "", "", false);
    }

    public static final void onFail$6(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("textFontDownload err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$7(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("textFontDownload err: ");
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$8(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        IDiS266S0100000_2 iDiS266S0100000_2;
        ((C169786lS) iDObjectS384S0100000_2.l0).LJIJJ(false);
        ArrayList arrayList = new ArrayList();
        boolean LIZLLL = ((C169786lS) iDObjectS384S0100000_2.l0).LIZLLL(arrayList);
        ((C169786lS) iDObjectS384S0100000_2.l0).LIZIZ(arrayList);
        ((C169786lS) iDObjectS384S0100000_2.l0).LJJIJIIJI.setData(arrayList);
        C169786lS c169786lS = (C169786lS) iDObjectS384S0100000_2.l0;
        c169786lS.LJIJI.setAdapter(c169786lS.LJJIJIIJI);
        C169786lS c169786lS2 = (C169786lS) iDObjectS384S0100000_2.l0;
        c169786lS2.getClass();
        if (LIZLLL && arrayList.size() == 1 && (iDiS266S0100000_2 = c169786lS2.LJJJJLL) != null) {
            iDiS266S0100000_2.onPageSelected(0);
        }
        C26045AKb c26045AKb = new C26045AKb(((C169786lS) iDObjectS384S0100000_2.l0).LJJIJIL);
        c26045AKb.LJIIIIZZ(R.string.rjt);
        c26045AKb.LJIIJ();
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uniformFetchList fail : ");
        LIZ.append(exceptionResult.toString());
        LJJIIZI.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    public static final void onFail$9(IDObjectS384S0100000_2 iDObjectS384S0100000_2, ExceptionResult exceptionResult) {
        XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void onSuccess$0(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        IDiS266S0100000_2 iDiS266S0100000_2;
        List<EffectCategoryResponse> categoryResponseList = ((EffectChannelResponseTemplate) obj).getCategoryResponseList();
        ((C169776lR) iDObjectS384S0100000_2.l0).LIZIZ(categoryResponseList);
        ((C169776lR) iDObjectS384S0100000_2.l0).getClass();
        C169776lR.LJIILLIIL("trick_effects", categoryResponseList);
        ((C169776lR) iDObjectS384S0100000_2.l0).LIZ(categoryResponseList);
        ((C169776lR) iDObjectS384S0100000_2.l0).LJJIJLIJ.setData(categoryResponseList);
        C169776lR c169776lR = (C169776lR) iDObjectS384S0100000_2.l0;
        c169776lR.LJJ.setAdapter(c169776lR.LJJIJLIJ);
        if (!categoryResponseList.isEmpty()) {
            ((C169776lR) iDObjectS384S0100000_2.l0).LJJJJJ = ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey();
            if (!C132425Hq.LIZ()) {
                ((C169776lR) iDObjectS384S0100000_2.l0).LJIJJLI(null, C164996dj.LIZIZ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey()), false);
            }
        }
        C169776lR c169776lR2 = (C169776lR) iDObjectS384S0100000_2.l0;
        c169776lR2.getClass();
        if (categoryResponseList.size() > 0 && (iDiS266S0100000_2 = c169776lR2.LJJJZ) != null) {
            iDiS266S0100000_2.onPageSelected(0);
        }
        ((C169776lR) iDObjectS384S0100000_2.l0).LJJ.post(new ARunnableS21S0200000_2(categoryResponseList, iDObjectS384S0100000_2, 7));
        ((C169776lR) iDObjectS384S0100000_2.l0).LJJ(false);
    }

    public static final void onSuccess$1(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        Iterator<Effect> it = ((EffectChannelResponseTemplate) obj).getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            ((C6IH) iDObjectS384S0100000_2.l0).LJI(it.next());
        }
        C6IH c6ih = (C6IH) iDObjectS384S0100000_2.l0;
        for (String str : c6ih.LIZ.keySet()) {
            if (((ConcurrentHashMap) c6ih.LIZIZ).get(str) == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("text font ");
                LIZ.append(str);
                LIZ.append(" is null");
                H7B.LJ(X1D.LIZIZ(LIZ));
                c6ih.LJ.LJJJJLI("textfont", false, true, new IDObjectS384S0100000_2(c6ih, 2));
                return;
            }
        }
    }

    public static final void onSuccess$2(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        Iterator<Effect> it = ((EffectChannelResponseTemplate) obj).getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            ((C6IH) iDObjectS384S0100000_2.l0).LJI(it.next());
        }
    }

    public static final void onSuccess$3(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        ArrayList arrayList;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (effectChannelResponseTemplate == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (Effect effect : effectChannelResponseTemplate.getAllCategoryEffects()) {
                try {
                    EffectTextFontExtra effectTextFontExtra = (EffectTextFontExtra) C6PB.LIZIZ().LJI(effect.getExtra(), EffectTextFontExtra.class);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(effect.getUnzipPath());
                    LIZ.append(File.separator);
                    LIZ.append(effectTextFontExtra.fileName);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    o.LJIIIZ(LIZIZ, "<set-?>");
                    effectTextFontExtra.LIZ = LIZIZ;
                    arrayList.add(new C157916Hr(effect, effectTextFontExtra));
                } catch (Exception unused) {
                }
            }
        }
        if (((XJL) iDObjectS384S0100000_2.l0).isActive()) {
            XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
            C3C5.m7constructorimpl(arrayList);
            xjl.resumeWith(arrayList);
        }
    }

    public static final void onSuccess$4(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        ArrayList arrayList;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (effectChannelResponseTemplate == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (Effect effect : effectChannelResponseTemplate.getAllCategoryEffects()) {
                if (effect != null) {
                    try {
                        EffectTextEffectExtra effectTextEffectExtra = (EffectTextEffectExtra) C6PB.LIZIZ().LJI(effect.getExtra(), EffectTextEffectExtra.class);
                        if (effectTextEffectExtra == null) {
                            effectTextEffectExtra = new EffectTextEffectExtra(false, false, 3, null);
                        }
                        arrayList.add(new C157776Hd(effect, effectTextEffectExtra));
                    } catch (Exception e) {
                        C6PB.LIZJ().LIZIZ(e);
                    }
                }
            }
        }
        if (((XJL) iDObjectS384S0100000_2.l0).isActive()) {
            XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
            C3C5.m7constructorimpl(arrayList);
            xjl.resumeWith(arrayList);
        }
    }

    public static final void onSuccess$5(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (((Boolean) C52830KoM.LIZ.getValue()).booleanValue()) {
            C10K.LIZJ(new ACallableS43S0201000_2(0, iDObjectS384S0100000_2, effectChannelResponse, 1));
        } else {
            ((C68M) iDObjectS384S0100000_2.l0).LJIJJ(effectChannelResponse);
        }
    }

    public static final void onSuccess$6(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        Iterator<Effect> it = ((EffectChannelResponseTemplate) obj).getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            ((C68M) iDObjectS384S0100000_2.l0).LJIIZILJ(it.next());
        }
    }

    public static final void onSuccess$7(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        Iterator<Effect> it = ((EffectChannelResponseTemplate) obj).getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            C10K.LIZJ(new ACallableS43S0201000_2(1, iDObjectS384S0100000_2, it.next(), 1));
        }
    }

    public static final void onSuccess$8(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        IDiS266S0100000_2 iDiS266S0100000_2;
        List<EffectCategoryResponse> categoryResponseList = ((EffectChannelResponseTemplate) obj).getCategoryResponseList();
        boolean LIZLLL = ((C169786lS) iDObjectS384S0100000_2.l0).LIZLLL(categoryResponseList);
        ((C169786lS) iDObjectS384S0100000_2.l0).LIZIZ(categoryResponseList);
        ((C169786lS) iDObjectS384S0100000_2.l0).LJJIJIIJI.setData(categoryResponseList);
        C169786lS c169786lS = (C169786lS) iDObjectS384S0100000_2.l0;
        c169786lS.LJIJI.setAdapter(c169786lS.LJJIJIIJI);
        if (!categoryResponseList.isEmpty()) {
            ((C169786lS) iDObjectS384S0100000_2.l0).LJJJ = ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey();
            ((C169786lS) iDObjectS384S0100000_2.l0).LJIJ(null, C164996dj.LIZIZ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(categoryResponseList, 0)).getKey()), false);
        }
        C169786lS c169786lS2 = (C169786lS) iDObjectS384S0100000_2.l0;
        c169786lS2.getClass();
        if (LIZLLL && categoryResponseList.size() == 1 && (iDiS266S0100000_2 = c169786lS2.LJJJJLL) != null) {
            iDiS266S0100000_2.onPageSelected(0);
        }
        ((C169786lS) iDObjectS384S0100000_2.l0).LJIJI.post(new ARunnableS8S0201000_5(3, iDObjectS384S0100000_2, categoryResponseList, 13));
        ((C169786lS) iDObjectS384S0100000_2.l0).LJIJJ(false);
    }

    public static final void onSuccess$9(IDObjectS384S0100000_2 iDObjectS384S0100000_2, Object obj) {
        List<EffectCategoryResponse> categoryResponseList;
        EffectCategoryResponse effectCategoryResponse;
        List<Effect> totalEffects;
        Effect effect;
        String str;
        EffectChannelResponseTemplate effectChannelResponseTemplate = (EffectChannelResponseTemplate) obj;
        if (effectChannelResponseTemplate != null && (categoryResponseList = effectChannelResponseTemplate.getCategoryResponseList()) != null) {
            Iterator<EffectCategoryResponse> it = categoryResponseList.iterator();
            while (true) {
                if (it.hasNext()) {
                    effectCategoryResponse = it.next();
                    String key = effectCategoryResponse.getKey();
                    if (C00F.LIZ(31744, 1, "music_share_story_music_card_style", true) == 2) {
                        str = "music_card_style_2";
                    } else {
                        str = "music_card_style_1";
                    }
                    if (o.LJ(key, str)) {
                        break;
                    }
                } else {
                    effectCategoryResponse = null;
                    break;
                }
            }
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            if (effectCategoryResponse2 != null && (totalEffects = effectCategoryResponse2.getTotalEffects()) != null && (effect = (Effect) ORZ.LJLLLL(totalEffects)) != null) {
                final XJL xjl = (XJL) iDObjectS384S0100000_2.l0;
                TN4.LIZ().LJJIIZI(effect, new IFetchEffectListener() { // from class: X.5ZE
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        XJL<Effect> xjl2 = xjl;
                        C3C5.m7constructorimpl(effect2);
                        xjl2.resumeWith(effect2);
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult e) {
                        String str2;
                        o.LJIIIZ(e, "e");
                        XJL<Effect> xjl2 = xjl;
                        C76800UCe c76800UCe = null;
                        C3C5.m7constructorimpl(null);
                        xjl2.resumeWith(null);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("downloadEffect effect:");
                        if (effect2 != null) {
                            str2 = effect2.getEffectId();
                        } else {
                            str2 = null;
                        }
                        LIZ.append(str2);
                        LIZ.append(' ');
                        Exception exception = e.getException();
                        if (exception != null) {
                            C16880lQ.LLLLIIL(exception);
                            c76800UCe = C76800UCe.LIZ;
                        }
                        LIZ.append(c76800UCe);
                        X1D.LIZIZ(LIZ);
                    }
                });
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        iDObjectS384S0100000_2.onFail(null);
    }
}
