package com.ss.android.ugc.aweme.translation.service;

import X.AB4;
import X.ACR;
import X.ACW;
import X.AK4;
import X.AKT;
import X.AbstractC73672Svk;
import X.AnonymousClass845;
import X.C113554cx;
import X.C162476Zf;
import X.C188727au;
import X.C2058886e;
import X.C2068389v;
import X.C208158Ex;
import X.C221108m2;
import X.C223048pA;
import X.C224048qm;
import X.C224158qx;
import X.C224168qy;
import X.C227768wm;
import X.C245649kW;
import X.C2U8;
import X.C32I;
import X.C36922EeM;
import X.C3C8;
import X.C41032G8m;
import X.C46104I7o;
import X.C46426IJy;
import X.C47959Irz;
import X.C48841JEv;
import X.C52263KfD;
import X.C52472Kia;
import X.C52869Koz;
import X.C55204LlY;
import X.C58096Mr6;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73098SmU;
import X.C73969T1h;
import X.C76L;
import X.C78613UtF;
import X.C78685UuP;
import X.C7MY;
import X.C80143Co;
import X.C84763XOl;
import X.C85054XZq;
import X.C86304Xu0;
import X.C86659Xzj;
import X.C86663Xzn;
import X.C86667Xzr;
import X.C86670Xzu;
import X.C86713Y1l;
import X.C86718Y1q;
import X.C8XO;
import X.C93Z;
import X.EFJ;
import X.EnumC55203LlX;
import X.EnumC79500VIa;
import X.EnumC86688Y0m;
import X.FMX;
import X.IQE;
import X.InterfaceC115514g7;
import X.InterfaceC223648q8;
import X.InterfaceC49103JOx;
import X.InterfaceC55053Lj7;
import X.InterfaceC65350Pko;
import X.InterfaceC65462ha;
import X.InterfaceC86658Xzi;
import X.InterfaceC86704Y1c;
import X.OSZ;
import X.T16;
import X.TB6;
import X.TBA;
import X.VIW;
import X.VJ1;
import X.X1D;
import X.XKX;
import X.Y01;
import X.Y02;
import X.Y04;
import X.Y0C;
import X.Y1E;
import X.Y1H;
import X.Y1W;
import X.Y1Y;
import X.Y24;
import Y.ACListenerS42S1100000_3;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.translation.api.TranslationApi$RealApi;
import com.ss.android.ugc.aweme.translation.model.TranslationContent;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ujb.o;

/* loaded from: classes16.dex */
public final class TranslationServiceImpl implements ITranslationService {
    public String LIZIZ;
    public EnumC86688Y0m LIZ = EnumC86688Y0m.NONE;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C86667Xzr.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(VJ1.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C86304Xu0.LJLIL);

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIIIZZ() {
        return C65352Pkq.LIZ(TranslationControlsAssem.class);
    }

    public static ITranslationService LJJIJ() {
        Object LIZ = C58096Mr6.LIZ(ITranslationService.class, false);
        if (LIZ != null) {
            return (ITranslationService) LIZ;
        }
        if (C58096Mr6.L7 == null) {
            synchronized (ITranslationService.class) {
                if (C58096Mr6.L7 == null) {
                    C58096Mr6.L7 = new TranslationServiceImpl();
                }
            }
        }
        return C58096Mr6.L7;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIJ() {
        if (!AnonymousClass845.LIZ) {
            return;
        }
        this.LIZIZ = LJJIJIIJIL().getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJII() {
        if (!AnonymousClass845.LIZ) {
            return LJJIJIIJIL().getAppLanguage();
        }
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            this.LIZIZ = LJJIJIIJIL().getAppLanguage();
        }
        String str2 = this.LIZIZ;
        if (str2 == null) {
            return LJJIJIIJIL().getAppLanguage();
        }
        return str2;
    }

    public final ISettingService LJJIJIIJIL() {
        return (ISettingService) this.LJ.getValue();
    }

    public TranslationServiceImpl() {
        C221108m2.LIZIZ(C86659Xzj.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String[] LJIILLIIL() {
        return C86670Xzu.LJI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC86688Y0m LJJI() {
        if (ACW.LIZIZ()) {
            return this.LIZ;
        }
        return EnumC86688Y0m.NONE;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIFFI() {
        return C41032G8m.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIIZI() {
        String LIZ = SharePrefCache.inst().getSelectedTranslationLanguage().LIZ();
        if (TextUtils.isEmpty(LIZ)) {
            if (AnonymousClass845.LIZ) {
                String str = this.LIZIZ;
                if (str == null || str.length() == 0) {
                    String appLanguage = LJJIJIIJIL().getAppLanguage();
                    this.LIZIZ = appLanguage;
                    return appLanguage;
                }
                String str2 = this.LIZIZ;
                if (str2 != null) {
                    return str2;
                }
                return LJJIJIIJIL().getAppLanguage();
            }
            return LJJIJIIJIL().getAppLanguage();
        }
        if (o.LJJJJIZL("zh-hans", LIZ, true)) {
            return "zh-Hans";
        }
        if (o.LJJJJIZL("zh-hant", LIZ, true)) {
            return "zh-Hant";
        }
        if (o.LJJJJIZL("fr-ca", LIZ, true)) {
            return "fr";
        }
        if (LIZ != null) {
            return LIZ;
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC55053Lj7 LIZ() {
        return Y0C.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC86658Xzi LJ() {
        return C86713Y1l.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC65462ha<String> LJIL() {
        return C86663Xzn.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC49103JOx LJJIIJ() {
        return TB6.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y24>> LIZJ(T assem) {
        kotlin.jvm.internal.o.LJIIIZ(assem, "assem");
        return C85054XZq.LIZ(assem);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final AbstractC73672Svk<TranslationResult> LIZLLL(String content) {
        kotlin.jvm.internal.o.LJIIIZ(content, "content");
        return TBA.LIZIZ(content, null, Y01.LIZIZ.LJJIIZI(), null, 3).LJJJ(C73969T1h.LIZIZ()).LJJL(T16.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C93Z LJIIIZ(EnumC55203LlX scope) {
        EnumSet of;
        VIW putIfAbsent;
        kotlin.jvm.internal.o.LJIIIZ(scope, "scope");
        int i = C55204LlY.LIZ[scope.ordinal()];
        if (i != 1) {
            if (i == 2) {
                of = EnumSet.of(EnumC79500VIa.CAPTION);
                kotlin.jvm.internal.o.LJIIIIZZ(of, "of(TranslationType.CAPTION)");
            } else {
                throw new C162476Zf();
            }
        } else {
            of = EnumSet.of(EnumC79500VIa.DESCRIPTION);
            kotlin.jvm.internal.o.LJIIIIZZ(of, "of(TranslationType.DESCRIPTION)");
        }
        ConcurrentHashMap<EnumC55203LlX, VIW> concurrentHashMap = VIW.LJIJ;
        VIW viw = concurrentHashMap.get(scope);
        if (viw == null && (putIfAbsent = concurrentHashMap.putIfAbsent(scope, (viw = new VIW(of)))) != null) {
            viw = putIfAbsent;
        }
        return viw;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJIIJ(Aweme aweme) {
        Object next;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        kotlin.jvm.internal.o.LJIIIIZZ(interactStickerStructs, "aweme.interactStickerStructs");
        List LJJIJIIJI = LJJIJIIJI(aweme, interactStickerStructs);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
        Iterator it = ((ArrayList) LJJIJIIJI).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((String) it.next()).length()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            while (it2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, Object> LJIILIIL(List<Y1W> interactStickers) {
        int i;
        kotlin.jvm.internal.o.LJIIIZ(interactStickers, "interactStickers");
        boolean z = false;
        int i2 = 0;
        int i3 = 24;
        for (Y1W y1w : interactStickers) {
            if (y1w.LIZIZ.getType() == 18) {
                Y1E y1e = y1w.LIZJ;
                if (y1e instanceof C224158qx) {
                    kotlin.jvm.internal.o.LJII(y1e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.cla.translation.sticker.TextTranslateStickerView");
                    C224168qy c224168qy = ((C224158qx) y1e).LJLLILLLL;
                    if (c224168qy != null) {
                        i = c224168qy.getTranslateTextSize();
                    } else {
                        i = 24;
                    }
                    i3 = Math.min(i3, i);
                    Y1E y1e2 = y1w.LIZJ;
                    kotlin.jvm.internal.o.LJII(y1e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.cla.translation.sticker.TextTranslateStickerView");
                    C224168qy c224168qy2 = ((C224158qx) y1e2).LJLLILLLL;
                    if (c224168qy2 != null && c224168qy2.LJLJL) {
                        i2++;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            return C113554cx.LJJL(new OSZ("background_reduced_cnt", Integer.valueOf(i2)), new OSZ("text_sticker_min_word_size", Integer.valueOf(i3)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (C41032G8m.LIZ()) {
            if (!AK4.LIZ().LJJIIZI() || !AK4.LIZ().LIZJ() || !C2058886e.LIZ(aweme)) {
                return false;
            }
            return true;
        }
        return C2058886e.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final IQE LJIIZILJ(Aweme aweme) {
        Y1Y y1y;
        IQE iqe;
        kotlin.jvm.internal.o.LJIIIZ(aweme, "aweme");
        Y1H LIZJ = TranslationStatusViewModel.LLFZ.LIZJ(aweme, "");
        if (LIZJ == null || (y1y = LIZJ.LJLIL) == null || (iqe = y1y.LIZ) == null) {
            return IQE.INITIALIZED;
        }
        return iqe;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Y1Y LJIJI(Aweme aweme) {
        kotlin.jvm.internal.o.LJIIIZ(aweme, "aweme");
        Y1H LIZJ = TranslationStatusViewModel.LLFZ.LIZJ(aweme, "");
        if (LIZJ != null) {
            return LIZJ.LJLIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJ(Aweme aweme) {
        if (aweme == null || C86718Y1q.LIZIZ.LIZIZ(aweme)) {
            return false;
        }
        this.LIZIZ = LJJII();
        if (!((ICLACaptionService) this.LIZJ.getValue()).LJIIIIZZ(aweme) || !Y04.LIZIZ(aweme) || !C52263KfD.LIZ() || ((ITranslationKevaService) this.LIZLLL.getValue()).LJIIIIZZ() || !((Boolean) C52869Koz.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!kotlin.jvm.internal.o.LJ(SharePrefCache.inst().getSelectedTranslationLanguage().LIZ(), this.LIZIZ) && SharePrefCache.inst().getSelectedTranslationLanguage().LIZ() != null) {
            String LIZ = SharePrefCache.inst().getSelectedTranslationLanguage().LIZ();
            kotlin.jvm.internal.o.LJIIIIZZ(LIZ, "inst().selectedTranslationLanguage.cache");
            if (LIZ.length() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJ(String language) {
        kotlin.jvm.internal.o.LJIIIZ(language, "language");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C80143Co(language, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIII(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (C41032G8m.LIZ()) {
            if (!AK4.LIZ().LJJIIZI() || !AK4.LIZ().LJJJIL() || !Y02.LJ(aweme)) {
                return false;
            }
            return true;
        }
        return Y02.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        if (C41032G8m.LIZ()) {
            if (AK4.LIZ().LJJIIZI() && Y04.LIZIZ(aweme) && AK4.LIZ().LJJIFFI()) {
                return true;
            }
            return false;
        }
        return Y04.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIIZ(EnumC86688Y0m value) {
        kotlin.jvm.internal.o.LJIIIZ(value, "value");
        if (ACW.LIZIZ()) {
            this.LIZ = value;
            C2U8.LIZ(new ACR());
        }
    }

    public static List LJJIJIIJI(Aweme aweme, List list) {
        String textStruct;
        String LIZ = Y02.LIZ(aweme);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            String str = null;
            if (interactStickerStruct.getType() == 18) {
                TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                if (textInfo != null) {
                    str = textInfo.getSrcLanguage();
                }
                if (kotlin.jvm.internal.o.LJ(str, "zh")) {
                    str = "zh-Hans";
                }
                if (kotlin.jvm.internal.o.LJ(str, LIZ) && C78685UuP.LJJJZ(interactStickerStruct.getTextStruct()) && (textStruct = interactStickerStruct.getTextStruct()) != null) {
                    arrayList.add(textStruct);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJI(Aweme aweme, List list) {
        List LJJIJIIJI = LJJIJIIJI(aweme, list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
        Iterator it = ((ArrayList) LJJIJIIJI).iterator();
        while (it.hasNext()) {
            arrayList.add(new TranslationContent((String) it.next()));
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        String json = GsonProtectorUtils.toJson(new Gson(), arrayList);
        kotlin.jvm.internal.o.LJIIIIZZ(json, "Gson().toJson(contents)");
        return json;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILJJIL(Aweme aweme, String targetLanguageCode) {
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        String str;
        Collection values;
        Set keySet;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage2;
        kotlin.jvm.internal.o.LJIIIZ(targetLanguageCode, "targetLanguageCode");
        if (aweme == null) {
            return false;
        }
        if (AB4.LIZ) {
            Video video = aweme.getVideo();
            if (video == null || (captionModel2 = video.getCaptionModel()) == null || (originalCaptionLanguage2 = captionModel2.getOriginalCaptionLanguage()) == null || !kotlin.jvm.internal.o.LJ(originalCaptionLanguage2.getCanTranslateRealtimeSkipTranslationLangCheck(), Boolean.TRUE)) {
                return false;
            }
        } else {
            Video video2 = aweme.getVideo();
            if (video2 == null || (captionModel = video2.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || !originalCaptionLanguage.getCanTranslateRealtime()) {
                return false;
            }
        }
        if (C52472Kia.LIZ == 0 || C86670Xzu.LJIIIIZZ(aweme) == null) {
            return false;
        }
        CaptionItemModel LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme);
        if (LJIIIIZZ != null) {
            str = LJIIIIZZ.getLanguageCode();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.o.LJ(targetLanguageCode, str)) {
            return false;
        }
        Map map = (Map) C46426IJy.LIZ.getValue();
        if (map != null && (keySet = map.keySet()) != null && !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (o.LJJJJIZL((String) it.next(), targetLanguageCode, true)) {
                    break;
                }
            }
        }
        Map map2 = (Map) C46426IJy.LIZ.getValue();
        if (map2 == null || (values = map2.values()) == null || values.isEmpty()) {
            return false;
        }
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            if (o.LJJJJIZL((String) it2.next(), targetLanguageCode, true)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJLI(Aweme aweme, String targetLanguageCode) {
        kotlin.jvm.internal.o.LJIIIZ(targetLanguageCode, "targetLanguageCode");
        if (aweme == null || Y04.LIZJ(aweme, targetLanguageCode) != null || !LJIILJJIL(aweme, targetLanguageCode)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C76L LJFF(int i, String str, String str2) {
        return ((TranslationApi$RealApi) C46104I7o.LJIIZILJ(EFJ.LIZJ, TranslationApi$RealApi.class)).getMultiTranslation(str, str2, i);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIIJJI(List<Y1W> interactStickers, boolean z, InterfaceC223648q8 interfaceC223648q8) {
        C224158qx c224158qx;
        kotlin.jvm.internal.o.LJIIIZ(interactStickers, "interactStickers");
        Iterator it = ((ArrayList) interactStickers).iterator();
        while (it.hasNext()) {
            Y1W y1w = (Y1W) it.next();
            if (y1w.LIZIZ.getType() == 18) {
                Y1E y1e = y1w.LIZJ;
                Long l = null;
                if ((y1e instanceof C224158qx) && (c224158qx = (C224158qx) y1e) != null) {
                    if (interfaceC223648q8 != null) {
                        l = Long.valueOf(interfaceC223648q8.LJZL());
                    }
                    c224158qx.LJJI(l, z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LIZIZ(List<Y1W> interactStickers, boolean z, InterfaceC223648q8 interfaceC223648q8, HashMap<String, String> translateHashMap) {
        Long l;
        kotlin.jvm.internal.o.LJIIIZ(interactStickers, "interactStickers");
        kotlin.jvm.internal.o.LJIIIZ(translateHashMap, "translateHashMap");
        for (Y1W y1w : interactStickers) {
            if (y1w.LIZIZ.getType() == 18) {
                if (z) {
                    Y1E y1e = y1w.LIZJ;
                    kotlin.jvm.internal.o.LJII(y1e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.cla.translation.sticker.TextTranslateStickerView");
                    C224158qx c224158qx = (C224158qx) y1e;
                    String str = translateHashMap.get(y1w.LIZIZ.getTextStruct());
                    if (str == null) {
                        str = "";
                    }
                    String str2 = c224158qx.LJLLLLLL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("translateText: ");
                    LIZ.append(str);
                    LIZ.append("; needTranslate: ");
                    LIZ.append(z);
                    C36922EeM.LIZLLL(4, str2, X1D.LIZIZ(LIZ));
                    c224158qx.LJLLL = str;
                }
                Y1E y1e2 = y1w.LIZJ;
                kotlin.jvm.internal.o.LJII(y1e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.cla.translation.sticker.TextTranslateStickerView");
                C224158qx c224158qx2 = (C224158qx) y1e2;
                if (interfaceC223648q8 != null) {
                    l = Long.valueOf(interfaceC223648q8.LJZL());
                } else {
                    l = null;
                }
                c224158qx2.LJJI(l, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJII(Context context, View view, Aweme aweme, String str) {
        int i;
        Window window;
        View decorView;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (window = LJIIIIZZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect LIZJ = C73098SmU.LIZJ(decorView);
            int i2 = LIZJ.bottom;
            View findViewById = decorView.findViewById(R.id.content);
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(LIZJ);
            }
            i = i2 - LIZJ.bottom;
        } else {
            i = 0;
        }
        int LIZJ2 = C47959Irz.LIZJ(12, Math.max(i, 0) + C7MY.LIZIZ(C61447O9r.LJIIJJI));
        AKT akt = new AKT(view);
        akt.LJFF(com.zhiliaoapp.musically.R.string.j_i);
        akt.LJ(com.zhiliaoapp.musically.R.style.ux);
        akt.LIZ.LJLILLLLZI = 4;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = com.zhiliaoapp.musically.R.raw.icon_a_rectangle;
        c2068389v.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.go);
        akt.LJIIIIZZ(c2068389v);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLJJI = 0;
        c208158Ex.LJLJL = LIZJ2;
        c208158Ex.LJLJLJ = new ACListenerS42S1100000_3(context, str, 9);
        akt.LJII();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("item_id", C227768wm.LIZIZ(aweme));
        FMX.LJIIL("language_setting_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Y1E LJIIL(Context context, C245649kW c245649kW, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, InterfaceC223648q8 interfaceC223648q8) {
        C223048pA c223048pA;
        float f;
        kotlin.jvm.internal.o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        if (c245649kW != null) {
            InterfaceC86704Y1c interfaceC86704Y1c = c245649kW.LJIILIIL;
            if (interfaceC86704Y1c != null) {
                c223048pA = interfaceC86704Y1c.LIZ();
            } else {
                c223048pA = null;
            }
            float f2 = 0.0f;
            if (c245649kW != null) {
                if (c223048pA != null) {
                    f = c223048pA.LIZ;
                } else {
                    f = 0.0f;
                }
                c245649kW.LIZ = f;
                if (c223048pA != null) {
                    f2 = c223048pA.LIZIZ;
                }
                c245649kW.LIZIZ = f2;
            }
        }
        return new C224158qx(interactStickerStruct.getType(), context, c224048qm, interactStickerStruct, c245649kW, interfaceC223648q8);
    }
}
