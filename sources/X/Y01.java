package X;

import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y01 implements ITranslationService {
    public static final Y01 LIZIZ = new Y01();
    public final /* synthetic */ ITranslationService LIZ = TranslationServiceImpl.LJJIJ();

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC55053Lj7 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LIZIZ(List<Y1W> interactStickers, boolean z, InterfaceC223648q8 interfaceC223648q8, HashMap<String, String> translateHashMap) {
        o.LJIIIZ(interactStickers, "interactStickers");
        o.LJIIIZ(translateHashMap, "translateHashMap");
        this.LIZ.LIZIZ(interactStickers, z, interfaceC223648q8, translateHashMap);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y24>> LIZJ(T assem) {
        o.LJIIIZ(assem, "assem");
        return this.LIZ.LIZJ(assem);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final AbstractC73672Svk<TranslationResult> LIZLLL(String content) {
        o.LJIIIZ(content, "content");
        return this.LIZ.LIZLLL(content);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC86658Xzi LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C76L LJFF(int i, String str, String str2) {
        return this.LIZ.LJFF(i, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJI(Aweme aweme, List list) {
        return this.LIZ.LJI(aweme, list);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJII(Context context, View view, Aweme aweme, String str) {
        this.LIZ.LJII(context, view, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C93Z LJIIIZ(EnumC55203LlX scope) {
        o.LJIIIZ(scope, "scope");
        return this.LIZ.LJIIIZ(scope);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJIIJ(Aweme aweme) {
        return this.LIZ.LJIIJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIIJJI(List<Y1W> list, boolean z, InterfaceC223648q8 interfaceC223648q8) {
        o.LJIIIZ(list, "list");
        this.LIZ.LJIIJJI(list, z, interfaceC223648q8);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Y1E LJIIL(Context context, C245649kW c245649kW, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, InterfaceC223648q8 interfaceC223648q8) {
        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
        return this.LIZ.LJIIL(context, c245649kW, interactStickerStruct, c224048qm, interfaceC223648q8);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final java.util.Map<String, Object> LJIILIIL(List<Y1W> interactStickers) {
        o.LJIIIZ(interactStickers, "interactStickers");
        return this.LIZ.LJIILIIL(interactStickers);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILJJIL(Aweme aweme, String targetLanguageCode) {
        o.LJIIIZ(targetLanguageCode, "targetLanguageCode");
        return this.LIZ.LJIILJJIL(aweme, targetLanguageCode);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILL(Aweme aweme) {
        return this.LIZ.LJIILL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String[] LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final IQE LJIIZILJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJIIZILJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIJ() {
        this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Y1Y LJIJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJIJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJ(Aweme aweme) {
        return this.LIZ.LJIJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJLI(Aweme aweme, String targetLanguageCode) {
        o.LJIIIZ(targetLanguageCode, "targetLanguageCode");
        return this.LIZ.LJIJJLI(aweme, targetLanguageCode);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC65462ha<String> LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJ(String language) {
        o.LJIIIZ(language, "language");
        this.LIZ.LJJ(language);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC86688Y0m LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJII() {
        return this.LIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIII(Aweme aweme) {
        return this.LIZ.LJJIII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC49103JOx LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        return this.LIZ.LJJIIJZLJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIIZ(EnumC86688Y0m value) {
        o.LJIIIZ(value, "value");
        this.LIZ.LJJIIZ(value);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }
}
