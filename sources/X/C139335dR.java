package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.text.TextWatcher;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5dR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139335dR extends AbstractC29891Fh<InterfaceC139655dx> implements InterfaceC139655dx, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;

    static {
        TBT tbt = new TBT(C139335dR.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C139335dR.class, "textStickerNewApi", "getTextStickerNewApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextStickerNewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139335dR.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139335dR.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public InterfaceC139655dx LJJLI() {
        return this;
    }

    private final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJJLL[3]);
    }

    private final InterfaceC139535dl LJJLIIIJILLIZJL() {
        return (InterfaceC139535dl) this.LJLJJI.LIZ(this, LJLJJLL[2]);
    }

    private final C63D LJJLIIIJJI() {
        return (C63D) this.LJLILLLLZI.LIZ(this, LJLJJLL[0]);
    }

    private final InterfaceC139045cy LJJLIIIJJIZ() {
        return (InterfaceC139045cy) this.LJLJI.LIZ(this, LJLJJLL[1]);
    }

    @Override // X.InterfaceC139655dx
    public boolean EC() {
        if (LJJLIIIJJI() == null && LJJLIIIJJIZ() == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC139655dx
    public InterfaceC147435qV LIZ() {
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139535dl LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL == null) {
                return null;
            }
            return LJJLIIIJILLIZJL.LIZ();
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null) {
            return null;
        }
        return LJJLIIIJJI.LIZ();
    }

    @Override // X.InterfaceC139655dx
    public boolean LIZLLL() {
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139535dl LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL == null) {
                return false;
            }
            return LJJLIIIJILLIZJL.Xi();
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null) {
            return false;
        }
        return LJJLIIIJJI.LIZLLL();
    }

    @Override // X.InterfaceC139655dx
    public void LJJJJ() {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LJJJJ();
        }
        InterfaceC139535dl LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.Ms0();
        }
    }

    @Override // X.InterfaceC139655dx
    public boolean LJJL() {
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && LJJLIIIJJIZ.LJJL()) {
            return true;
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && LJJLIIIJJI.LJJL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC139655dx
    public boolean LJLIL() {
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && LJJLIIIJJIZ.LJLIL()) {
            return true;
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null && LJJLIIIJJI.LJLIL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC139655dx
    public void LJLL() {
        C139315dP qe0;
        TextStickerModel LIZIZ;
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LJLL();
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && (qe0 = LJJLIIIJJIZ.qe0()) != null && (LIZIZ = qe0.LIZIZ()) != null) {
            qe0.LJFF.PF(LIZIZ.getBaseStickerModel().getId());
        }
    }

    @Override // X.InterfaceC139655dx
    public void LLIIIILZ() {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            Iterator<C67P> it = LJJLIIIJJI.LJZL().iterator();
            while (it.hasNext()) {
                TextStickerData data = it.next().getData();
                if (data != null) {
                    data.setSpeakerID(null);
                }
            }
            LJJLIIIJJI.LLIIIILZ();
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.LLIIIILZ();
        }
    }

    @Override // X.InterfaceC139655dx
    public void M6() {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LLILZ();
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.Ca0();
        }
    }

    @Override // X.InterfaceC139655dx
    public List<TextStickerData> RW() {
        List<TextStickerData> S2;
        List<TextStickerModel> RR;
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null && (RR = LJJLIIIJJIZ.RR()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(RR, 10));
                Iterator<TextStickerModel> it = RR.iterator();
                while (it.hasNext()) {
                    arrayList.add(C137045Zk.LIZIZ(it.next()));
                }
                return arrayList;
            }
        } else {
            C63D LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null && (S2 = LJJLIIIJJI.S2()) != null) {
                return S2;
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC139655dx
    public List<TextStickerData> YU() {
        List<C67P> LJZL;
        List<TextStickerModel> RR;
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null && (RR = LJJLIIIJJIZ.RR()) != null) {
                ArrayList arrayList = new ArrayList();
                for (TextStickerModel textStickerModel : RR) {
                    TextStickerModel textStickerModel2 = textStickerModel;
                    if (!u.LJIL(textStickerModel2) && !u.LJIJ(textStickerModel2)) {
                        arrayList.add(textStickerModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C137045Zk.LIZIZ((TextStickerModel) it.next()));
                }
                return arrayList2;
            }
        } else {
            C63D LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null && (LJZL = LJJLIIIJJI.LJZL()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (C67P c67p : LJZL) {
                    if (C1JI.LJJIFFI(c67p)) {
                        arrayList3.add(c67p);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C67P) it2.next()).LJ());
                }
                return arrayList4;
            }
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC139655dx
    public void j() {
        C139315dP qe0;
        InterfaceC153045zY value;
        EnumC139385dW textStickerGuidanceType;
        OSZ<Integer, Integer> osz;
        Point point;
        String string;
        if (LJJL() || H7R.LJJLIIIJJIZ(LJJLIIIIJ())) {
            return;
        }
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ == null || (qe0 = LJJLIIIJJIZ.qe0()) == null || (value = qe0.LIZLLL.Kh().getValue()) == null || (textStickerGuidanceType = C44384HbQ.LJL(qe0.LIZJ, Integer.valueOf(value.getDuration()))) == EnumC139385dW.NONE) {
                return;
            }
            if (textStickerGuidanceType == EnumC139385dW.LONG_VIDEO) {
                if (C00F.LIZ(31744, 0, "enable_default_text_sticker_1min_video", true) == 1) {
                    return;
                }
                if (C00F.LIZ(31744, 0, "enable_default_text_sticker_1min_video", true) == 2 && ((Keva) C139495dh.LIZ.getValue()).getBoolean("GuideHasShown", false)) {
                    return;
                }
            }
            InterfaceC139535dl interfaceC139535dl = qe0.LJ;
            if (interfaceC139535dl != null) {
                osz = interfaceC139535dl.Y0();
            } else {
                osz = null;
            }
            Activity activity = qe0.LIZ;
            VideoPublishEditModel editModel = qe0.LIZJ;
            if (osz != null) {
                point = new Point(osz.getFirst().intValue() / 2, osz.getSecond().intValue() / 2);
            } else {
                point = new Point(C170576mj.LIZJ(qe0.LIZ) / 2, C170576mj.LIZIZ(qe0.LIZ) / 2);
            }
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(textStickerGuidanceType, "textStickerGuidanceType");
            o.LJIIIZ(editModel, "editModel");
            TextStickerData textStickerData = new TextStickerData("", 2, -1, 2, "Proxima-Nova-Semibold.otf", null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
            textStickerData.setEditCenterPoint(point);
            int i = C139375dV.LIZ[textStickerGuidanceType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    string = activity.getString(R.string.bgo);
                } else {
                    string = editModel.creativeModel.initialModel.highLightVideoParametersModel.stickerText;
                }
            } else {
                string = activity.getString(R.string.zn);
            }
            textStickerData.setTextWrapList(C47261Igj.LJJIJ(C68W.LIZIZ(string, false)));
            textStickerData.setX(textStickerData.getEditCenterPoint().x);
            textStickerData.setY(C170576mj.LIZ(activity, 154.0f));
            textStickerData.setGuidanceSticker(true);
            if (textStickerGuidanceType == EnumC139385dW.LIVE_HIGHLIGHT) {
                textStickerData.setGuidanceWithDefaultText(true);
            }
            textStickerData.setFontSize(20);
            if (textStickerGuidanceType == EnumC139385dW.TTS_VOICE) {
                textStickerData.setVoiceEffectId(qe0.LIZJ.ttsVoiceModel.getEffectId());
                textStickerData.setSpeakerName(qe0.LIZJ.ttsVoiceModel.getSpeakerName());
                textStickerData.setTtsVoiceModel(new TTSVoiceModel(qe0.LIZJ.ttsVoiceModel.getEffectId(), qe0.LIZJ.ttsVoiceModel.getSpeakerName()));
            }
            long currentTimeMillis = System.currentTimeMillis();
            new C152885zI(qe0.LIZ);
            String fontType = textStickerData.getFontType();
            final C139345dS c139345dS = new C139345dS(qe0, currentTimeMillis, textStickerData, textStickerGuidanceType);
            C68M.LJIIJ().LIZIZ(fontType, new C68O() { // from class: X.5dY
                @Override // X.C68O
                public final void onFail() {
                }

                @Override // X.C68O
                public final void onSuccess() {
                    c139345dS.invoke();
                }

                @Override // X.C68O
                public final /* bridge */ /* synthetic */ void LIZ(Boolean bool) {
                    bool.booleanValue();
                }
            });
            return;
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null) {
            return;
        }
        LJJLIIIJJI.j();
    }

    @Override // X.InterfaceC139655dx
    public C0IB<Boolean> l2() {
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ == null) {
                return null;
            }
            return LJJLIIIJJIZ.l2();
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null) {
            return null;
        }
        return LJJLIIIJJI.H3();
    }

    @Override // X.InterfaceC139655dx
    public ArrayList<TextStickerData> sK() {
        C139275dL Xh0;
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
            if (LJJLIIIJJIZ == null || (Xh0 = LJJLIIIJJIZ.Xh0()) == null) {
                return null;
            }
            return Xh0.LIZIZ();
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null) {
            return null;
        }
        return LJJLIIIJJI.S80();
    }

    @Override // X.InterfaceC139655dx
    public void t8() {
        C139275dL Xh0;
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LLILZ();
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && (Xh0 = LJJLIIIJJIZ.Xh0()) != null) {
            Xh0.LIZLLL();
            Xh0.LJFF(false);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC139655dx getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C139335dR(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJII(getDiContainer(), C63D.class, null);
        this.LJLJI = UCI.LJII(getDiContainer(), InterfaceC139045cy.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC139535dl.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
    }

    @Override // X.InterfaceC139655dx
    public void LJJIJIIJIL(int i) {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LJJIJIIJIL(i);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.LJJIJIIJIL(i);
        }
    }

    @Override // X.InterfaceC139655dx
    public void LJLLLLLL(boolean z) {
        C138655cL aw;
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LJLLLLLL(z);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && (aw = LJJLIIIJJIZ.aw()) != null) {
            aw.LJII(z);
        }
    }

    @Override // X.InterfaceC139655dx
    public void LLLLLLJ(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.LLLLLLJ(watcher);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.LLLLLLJ(watcher);
        }
    }

    @Override // X.InterfaceC139655dx
    public void Op0(boolean z) {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.setEnable(z);
        }
    }

    @Override // X.InterfaceC139655dx
    public OSZ<Float, Float> P5(Context context) {
        OSZ<Float, Float> P5;
        OSZ<Integer, Integer> Y0;
        OSZ<Float, Float> osz = new OSZ<>(Float.valueOf(C143205jg.LJ()), Float.valueOf(C143205jg.LIZLLL()));
        if (C42000Ge4.LJIILIIL(LJJLIIIIJ())) {
            InterfaceC139535dl LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if (LJJLIIIJILLIZJL == null || (Y0 = LJJLIIIJILLIZJL.Y0()) == null) {
                return osz;
            }
            return new OSZ<>(Float.valueOf(Y0.getFirst().intValue()), Float.valueOf(Y0.getSecond().intValue()));
        }
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI == null || (P5 = LJJLIIIJJI.P5(context)) == null) {
            return osz;
        }
        return P5;
    }

    @Override // X.InterfaceC139655dx
    public void b1(InfoStickerModel infoStickerModel) {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.b1(infoStickerModel);
        }
    }

    @Override // X.InterfaceC139655dx
    public void ir(boolean z) {
        MutableLiveData<Boolean> LLLLILI;
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.h6(z);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ == null || (LLLLILI = LJJLIIIJJIZ.LLLLILI()) == null) {
            return;
        }
        LLLLILI.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC139655dx
    public void c8(TextStickerData stickerData, boolean z) {
        o.LJIIIZ(stickerData, "stickerData");
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.c8(stickerData, z);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            C139055cz.LIZ(LJJLIIIJJIZ, stickerData, false, null, 6);
        }
    }

    @Override // X.InterfaceC139655dx
    public void vA(float f, boolean z) {
        List<TextStickerModel> RR;
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.F8(z);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && (RR = LJJLIIIJJIZ.RR()) != null) {
            ArrayList arrayList = new ArrayList();
            for (TextStickerModel textStickerModel : RR) {
                if (!u.LJIJ(textStickerModel)) {
                    arrayList.add(textStickerModel);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TextStickerModel textStickerModel2 = (TextStickerModel) it.next();
                InterfaceC139535dl LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                if (LJJLIIIJILLIZJL != null) {
                    LJJLIIIJILLIZJL.N8(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, Integer.MAX_VALUE, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null));
                }
            }
        }
    }

    @Override // X.InterfaceC139655dx
    public void FC(float f, boolean z, InterfaceC88472Yns<? super StickerModel, Boolean> interfaceC88472Yns) {
        C63D LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.fL(f, z);
        }
        InterfaceC139045cy LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            if (z) {
                f = 1.0f;
            }
            LJJLIIIJJIZ.zY(f, interfaceC88472Yns);
        }
    }
}
