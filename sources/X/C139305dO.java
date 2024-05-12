package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.text.TextWatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139305dO extends AbstractC29891Fh<InterfaceC139045cy> implements InterfaceC139045cy, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final C82622Wbi LJLIL;
    public final WM7 LJLILLLLZI;
    public final InterfaceC65784Pro<C63C> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final C29901Fi<C76800UCe> LJLJJL;
    public final LiveEvent<C76800UCe> LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final C40871j1<Boolean> LL;
    public TextWatcher LLD;
    public final C5H3 LLF;

    public InterfaceC139045cy LJJLI() {
        return this;
    }

    static {
        TBT tbt = new TBT(C139305dO.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C139305dO.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "readTextEffectOperator", "getReadTextEffectOperator()Lcom/ss/android/ugc/gamora/editor/sticker/read/panel/TTSPanelUIComponentApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "unlockTTSVoiceVoiceApi", "getUnlockTTSVoiceVoiceApi()Lcom/ss/android/ugc/gamora/editor/sticker/read/unlocktts/UnlockReadTextVoiceApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "textToSpeechApiComponent", "getTextToSpeechApiComponent()Lcom/ss/android/ugc/gamora/editor/audio/tts/base/TextToSpeechApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C139305dO.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    private final InterfaceC147865rC LJJLIIIJJIZ() {
        return (InterfaceC147865rC) this.LJLJLJ.LIZ(this, LLFF[1]);
    }

    private final void LJLLL() {
        if (getDiContainer().LIZIZ(InterfaceC139535dl.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC139535dl.class, new AqS168S0100000_2(this, 221));
        }
        C138655cL LJLJLJ = LJLJLJ();
        C0IB<Boolean> l2 = LJLJLJ.LIZ.l2();
        InterfaceC139045cy interfaceC139045cy = LJLJLJ.LIZ;
        o.LJII(interfaceC139045cy, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        l2.LIZIZ((LifecycleOwner) interfaceC139045cy, new AObjectS84S0100000_2(LJLJLJ, 86));
        C139275dL LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.LJ.Wh().LIZIZ(LJJLIIIIJ.LIZ, new AObjectS84S0100000_2(LJJLIIIIJ, 87));
            LJJLIIIIJ.LJ.J9().observe(LJJLIIIIJ.LIZ, new AObserverS70S0100000_2(LJJLIIIIJ, 67));
            LJJLIIIIJ.LJ.z1().observe(LJJLIIIIJ.LIZ, new AObserverS70S0100000_2(LJJLIIIIJ, 68));
            LJJLIIIIJ.LJ.E0().observe(LJJLIIIIJ.LIZ, new AObserverS70S0100000_2(LJJLIIIIJ, 69));
            LJJLIIIIJ.LJ.p3().observe(LJJLIIIIJ.LIZ, new AObserverS70S0100000_2(LJJLIIIIJ, 70));
        }
        C139315dP LJJLIIJ = LJJLIIJ();
        LJJLIIJ.LIZLLL.kn0().observe(LJJLIIJ.LIZIZ, new AObserverS70S0100000_2(LJJLIIJ, 71));
    }

    @Override // X.InterfaceC139045cy
    public InterfaceC88472Yns<StickerModel, C76800UCe> Db() {
        return new AqS168S0100000_2(this, 220);
    }

    public final C139275dL LJJLIIIIJ() {
        return (C139275dL) this.LJZI.getValue();
    }

    public final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLLLL.LIZ(this, LLFF[8]);
    }

    public final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLLL.LIZ(this, LLFF[7]);
    }

    public final InterfaceC143855kj LJJLIIIJLLLLLLLZ() {
        return (InterfaceC143855kj) this.LJLL.LIZ(this, LLFF[3]);
    }

    public final C139315dP LJJLIIJ() {
        return (C139315dP) this.LJZL.getValue();
    }

    public final InterfaceC139535dl LJJLJ() {
        return (InterfaceC139535dl) this.LJLJL.LIZ(this, LLFF[0]);
    }

    public final InterfaceC147905rG LJJLJLI() {
        return (InterfaceC147905rG) this.LJLJLLL.LIZ(this, LLFF[2]);
    }

    public final InterfaceC138705cQ LJJLL() {
        return (InterfaceC138705cQ) this.LJLLI.LIZ(this, LLFF[4]);
    }

    public final C139295dN LJJZZI() {
        return (C139295dN) this.LLF.getValue();
    }

    public final AnonymousClass635 LJLIIL() {
        return (AnonymousClass635) this.LJLZ.getValue();
    }

    public final InterfaceC139695e1 LJLJJL() {
        return (InterfaceC139695e1) this.LJLLLLLL.getValue();
    }

    public final InterfaceC138185ba LJLJJLL() {
        return (InterfaceC138185ba) this.LJLLJ.LIZ(this, LLFF[6]);
    }

    public final C138655cL LJLJLJ() {
        return (C138655cL) this.LJZ.getValue();
    }

    public final InterfaceC138265bi LJLLILLLL() {
        return (InterfaceC138265bi) this.LJLLILLLL.LIZ(this, LLFF[5]);
    }

    @Override // X.InterfaceC139045cy
    public C6OE LLLLLLZ() {
        return new C6OE() { // from class: X.5dQ
            @Override // X.C6OE
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C6OE
            public final void LIZ() {
                C139305dO.this.LJLJJL().LIZ();
            }

            @Override // X.C6OE
            public final void LIZIZ() {
                C139305dO.this.LJLJJL().LIZIZ();
            }

            @Override // X.C6OE
            public final boolean LIZLLL() {
                return C139305dO.this.LJJLIIIJILLIZJL().isMvThemeVideoType();
            }

            @Override // X.C6OE
            public final TTSVoiceModel LJII() {
                return C139305dO.this.LJJLIIIJILLIZJL().getTtsVoiceModel();
            }

            @Override // X.C6OE
            public final AnonymousClass635 LJIIIIZZ() {
                return C139305dO.this.LJLIIL();
            }

            @Override // X.C6OE
            public final TextWatcher LJIIIZ() {
                return C139305dO.this.LLD;
            }

            @Override // X.C6OE
            public final void LIZJ(Context context) {
                AnonymousClass632.LIZ(context);
            }

            @Override // X.C6OE
            public final int LJ(TextStickerModel textStickerModel) {
                o.LJIIIZ(textStickerModel, "textStickerModel");
                return C139305dO.this.LJLJLJ().LJIIIIZZ(textStickerModel, true);
            }

            @Override // X.C6OE
            public final void LJI(TextStickerModel stickerModel) {
                EnumC139365dU enumC139365dU;
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC139695e1 LJLJJL = C139305dO.this.LJLJJL();
                TextFontStyleData textFontStyleData = new TextFontStyleData();
                textFontStyleData.title = stickerModel.getFontModel().fontTitle;
                if (u.LJIJ(stickerModel)) {
                    enumC139365dU = EnumC139365dU.CAPTION;
                } else {
                    enumC139365dU = EnumC139365dU.TEXT;
                }
                C139685e0.LIZIZ(LJLJJL, textFontStyleData, 0, enumC139365dU.getValue(), null, false, 24);
            }

            @Override // X.C6OE
            public final void LJIIJ(TextStickerModel textStickerModel) {
                o.LJIIIZ(textStickerModel, "textStickerModel");
                C138655cL LJLJLJ = C139305dO.this.LJLJLJ();
                LJLJLJ.getClass();
                InterfaceC138705cQ interfaceC138705cQ = LJLJLJ.LJI;
                if (interfaceC138705cQ != null) {
                    interfaceC138705cQ.G7(C137045Zk.LIZIZ(textStickerModel));
                }
            }

            @Override // X.C6OE
            public final void LJIIJJI(TextStickerModel stickerModel) {
                EnumC139365dU enumC139365dU;
                o.LJIIIZ(stickerModel, "stickerModel");
                InterfaceC139695e1 LJLJJL = C139305dO.this.LJLJJL();
                int color = stickerModel.getColor();
                if (u.LJIJ(stickerModel)) {
                    enumC139365dU = EnumC139365dU.CAPTION;
                } else {
                    enumC139365dU = EnumC139365dU.TEXT;
                }
                LJLJJL.LJ(color, 0, enumC139365dU.getValue(), null, false);
            }
        };
    }

    @Override // X.InterfaceC139045cy
    public void OA() {
        this.LJLJJL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC139045cy
    public void Ca0() {
        Iterator<TextStickerModel> it = RR().iterator();
        while (it.hasNext()) {
            PF(it.next().getId());
        }
    }

    @Override // X.InterfaceC139045cy
    public boolean LJJL() {
        List<StickerModel> sk0;
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ == null || (sk0 = LJJLJ.sk0(EnumC157656Gr.TEXT)) == null || sk0.isEmpty()) {
            return false;
        }
        Iterator<StickerModel> it = sk0.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof TextStickerModel) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC139045cy
    public boolean LJLIL() {
        List<StickerModel> sk0;
        TextStickerModel textStickerModel;
        InterfaceC139535dl interfaceC139535dl = LJLJLJ().LJFF;
        if (interfaceC139535dl == null || (sk0 = interfaceC139535dl.sk0(EnumC157656Gr.TEXT)) == null || sk0.isEmpty()) {
            return false;
        }
        for (StickerModel stickerModel : sk0) {
            if ((stickerModel instanceof TextStickerModel) && (textStickerModel = (TextStickerModel) stickerModel) != null && u.LJIILL(textStickerModel)) {
                return true;
            }
        }
        return false;
    }

    public final void LJLZ() {
        H8F.LJJJJZ(0, LJJLIIIJILLIZJL());
    }

    @Override // X.InterfaceC139045cy
    public void LLIIIILZ() {
        List<StickerModel> sk0;
        C138655cL LJLJLJ = LJLJLJ();
        InterfaceC139535dl interfaceC139535dl = LJLJLJ.LJFF;
        if (interfaceC139535dl != null && (sk0 = interfaceC139535dl.sk0(EnumC157656Gr.TEXT)) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(sk0, 10));
            for (StickerModel stickerModel : sk0) {
                if (!(stickerModel instanceof TextStickerModel)) {
                    stickerModel = null;
                }
                arrayList.add(stickerModel);
            }
            Iterator it = ORZ.LJLL(arrayList).iterator();
            while (it.hasNext()) {
                LJLJLJ.LJIILIIL((TextStickerModel) it.next());
            }
        }
    }

    @Override // X.InterfaceC139045cy
    public List<TextStickerModel> RR() {
        List<StickerModel> sk0;
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null && (sk0 = LJJLJ.sk0(EnumC157656Gr.TEXT)) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(sk0, 10));
            for (StickerModel stickerModel : sk0) {
                o.LJII(stickerModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
                arrayList.add(stickerModel);
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC139045cy
    public void SU() {
        Iterator<TextStickerModel> it = C42000Ge4.LJII(LJJLIIIJILLIZJL()).iterator();
        while (it.hasNext()) {
            fp(it.next());
        }
    }

    @Override // X.InterfaceC139045cy
    public InterfaceC139535dl Sj() {
        return LJJLJ();
    }

    @Override // X.InterfaceC139045cy
    public C139275dL Xh0() {
        return LJJLIIIIJ();
    }

    @Override // X.InterfaceC139045cy
    public C138655cL aw() {
        return LJLJLJ();
    }

    @Override // X.InterfaceC139045cy
    public C159636Oh nm() {
        return new C159636Oh(EnumC157656Gr.TEXT, 0, true, true, true, !H7R.LJJJJI(LJJLIIIJILLIZJL()), true, (List) C47261Igj.LJII(4, 3, 2), false, (String) null, new OSZ(Float.valueOf(0.2f), Float.valueOf(10.0f)), true, ((Boolean) C6HC.LIZ.getValue()).booleanValue(), true, true, true, 770);
    }

    @Override // X.InterfaceC139045cy
    public void nt() {
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            C139545dm.LIZ(LJJLJ, null, EnumC157656Gr.TEXT, 1);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJLLL();
    }

    @Override // X.InterfaceC139045cy
    public C139315dP qe0() {
        return LJJLIIJ();
    }

    @Override // X.InterfaceC139045cy
    public MutableLiveData<Boolean> LLLLILI() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC139045cy
    public LiveEvent<C76800UCe> W6() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC139045cy getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC139045cy
    public C0IB<Boolean> l2() {
        return this.LL;
    }

    @Override // X.InterfaceC139045cy
    public void LJJIJIIJIL(int i) {
        int intValue;
        int intValue2;
        for (TextStickerModel textStickerModel : RR()) {
            o.LJIIIZ(textStickerModel, "<this>");
            OSZ<Integer, Integer> LIZ = C139555dn.LIZ((int) textStickerModel.getBaseStickerModel().getUiStartTime(), (int) textStickerModel.getBaseStickerModel().getUiEndTime(), i);
            if (u.LJIJ(textStickerModel) && LIZ.getSecond().intValue() == 0) {
                LIZ = new OSZ<>(Integer.valueOf((int) textStickerModel.getBaseStickerModel().getUiStartTime()), Integer.valueOf((int) textStickerModel.getBaseStickerModel().getUiEndTime()));
            }
            textStickerModel.getBaseStickerModel().setStartTime(LIZ.getFirst().intValue());
            textStickerModel.getBaseStickerModel().setEndTime(LIZ.getSecond().intValue());
            InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
            BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
            if (value != null) {
                intValue = value.LLFZ(LIZ.getFirst().intValue());
            } else {
                intValue = LIZ.getFirst().intValue();
            }
            baseStickerModel.setUiStartTime(intValue);
            BaseStickerModel baseStickerModel2 = textStickerModel.getBaseStickerModel();
            if (value != null) {
                intValue2 = value.LLFZ(LIZ.getSecond().intValue());
            } else {
                intValue2 = LIZ.getSecond().intValue();
            }
            baseStickerModel2.setUiEndTime(intValue2);
            InterfaceC139535dl LJJLJ = LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.N8(textStickerModel);
            }
        }
    }

    public final String LJJZZIII(TextStickerModel textStickerModel) {
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
            return "auto";
        }
        return "user_click";
    }

    @Override // X.InterfaceC139045cy
    public void LJLLLLLL(boolean z) {
        LJLJLJ().LJII(z);
    }

    @Override // X.InterfaceC139045cy
    public void LLLLLLJ(TextWatcher watcher) {
        o.LJIIIZ(watcher, "watcher");
        this.LLD = watcher;
    }

    @Override // X.InterfaceC139045cy
    public void PF(int i) {
        TextStickerModel textStickerModel;
        InterfaceC139535dl LJJLJ;
        Iterator<TextStickerModel> it = RR().iterator();
        while (true) {
            if (it.hasNext()) {
                textStickerModel = it.next();
                if (textStickerModel.getId() == i) {
                    break;
                }
            } else {
                textStickerModel = null;
                break;
            }
        }
        TextStickerModel textStickerModel2 = textStickerModel;
        if (textStickerModel2 != null && (LJJLJ = LJJLJ()) != null) {
            LJJLJ.Zp(textStickerModel2.getId());
        }
    }

    @Override // X.InterfaceC139045cy
    public void Rw(boolean z) {
        for (TextStickerModel textStickerModel : RR()) {
            InterfaceC139535dl LJJLJ = LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.N8(TextStickerModel.copy$default(textStickerModel, null, null, null, 0, 0, 0, 0.0f, null, false, z, false, null, null, null, null, null, null, false, 261631, null));
            }
        }
    }

    @Override // X.InterfaceC139045cy
    public TextStickerModel fp(TextStickerModel textStickerModel) {
        StickerModel stickerModel;
        o.LJIIIZ(textStickerModel, "textStickerModel");
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            stickerModel = LJJLJ.hG(textStickerModel, EnumC157656Gr.TEXT);
        } else {
            stickerModel = null;
        }
        o.LJII(stickerModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
        return (TextStickerModel) stickerModel;
    }

    @Override // X.InterfaceC139045cy
    public void hj0(boolean z) {
        LJLJLJ().LJIILJJIL = z;
    }

    @Override // X.InterfaceC139045cy
    public void i6(boolean z) {
        InterfaceC138675cN interfaceC138675cN;
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null && (interfaceC138675cN = (InterfaceC138675cN) LJJLJ.T9(EnumC157656Gr.TEXT)) != null) {
            interfaceC138675cN.LIZJ(z);
        }
    }

    @Override // X.InterfaceC139045cy
    public void vo(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.N8(stickerModel);
        }
    }

    @Override // X.InterfaceC139045cy
    public void xf(boolean z) {
        LJLJLJ().LJIILIIL = z;
    }

    @Override // X.InterfaceC139045cy
    public void EW(int i, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(editDone, "editDone");
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.Zt(i, C47261Igj.LJJIJ(editDone));
        }
    }

    @Override // X.InterfaceC139045cy
    public void fl0(String enterFrom, InterfaceC88472Yns<? super StickerModel, C76800UCe> editDone) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(editDone, "editDone");
        TextStickerModel LIZIZ = LJJLIIJ().LIZIZ();
        if (LIZIZ != null) {
            LJJLIIJ().LIZJ(LIZIZ, "click_button");
            return;
        }
        InterfaceC139535dl LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.BZ(EnumC157656Gr.TEXT, null, enterFrom, editDone);
        }
    }

    @Override // X.InterfaceC139045cy
    public void z4(String str, String str2) {
        InterfaceC138675cN interfaceC138675cN;
        InterfaceC139535dl interfaceC139535dl = LJLJLJ().LJFF;
        if (interfaceC139535dl != null && (interfaceC138675cN = (InterfaceC138675cN) interfaceC139535dl.T9(EnumC157656Gr.TEXT)) != null) {
            interfaceC138675cN.LJFF(new OSZ<>(str, str2));
        }
    }

    @Override // X.InterfaceC139045cy
    public void zY(float f, InterfaceC88472Yns<? super StickerModel, Boolean> interfaceC88472Yns) {
        List<TextStickerModel> RR = RR();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : RR) {
            if (interfaceC88472Yns == null || interfaceC88472Yns.invoke(textStickerModel).booleanValue()) {
                arrayList.add(textStickerModel);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TextStickerModel textStickerModel2 = (TextStickerModel) it.next();
            InterfaceC139535dl LJJLJ = LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.N8(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, Integer.MAX_VALUE, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C139305dO(C82622Wbi diContainer, WM7 wm7, InterfaceC65784Pro<? extends C63C> stickerSceneGetter) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerSceneGetter, "stickerSceneGetter");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = wm7;
        this.LJLJI = stickerSceneGetter;
        this.LJLJJI = new MutableLiveData<>();
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJJL = c29901Fi;
        this.LJLJJLL = c29901Fi;
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC139535dl.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC147905rG.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC138705cQ.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC138265bi.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC138185ba.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 321));
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 320));
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 322));
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 317));
        this.LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 318));
        this.LL = new C40871j1<>(Boolean.FALSE);
        this.LLF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 319));
    }

    @Override // X.InterfaceC139045cy
    public TextStickerModel ko0(TextStickerData textStickerData, boolean z, InterfaceC88472Yns<? super TextStickerModel, C76800UCe> fillTextStickerModel) {
        OSZ<Integer, Integer> Y0;
        o.LJIIIZ(textStickerData, "textStickerData");
        o.LJIIIZ(fillTextStickerModel, "fillTextStickerModel");
        InterfaceC139535dl LJJLJ = LJJLJ();
        OSZ osz = null;
        if (LJJLJ != null && (Y0 = LJJLJ.Y0()) != null) {
            osz = new OSZ(Integer.valueOf(Y0.getFirst().intValue() / 2), Integer.valueOf(Y0.getSecond().intValue() / 2));
        }
        TextStickerModel LIZJ = C137045Zk.LIZJ(textStickerData, z, osz);
        fillTextStickerModel.invoke(LIZJ);
        TextStickerModel fp = fp(LIZJ);
        InterfaceC139535dl LJJLJ2 = LJJLJ();
        if (LJJLJ2 != null) {
            LJJLJ2.xQ(fp);
        }
        return fp;
    }
}
