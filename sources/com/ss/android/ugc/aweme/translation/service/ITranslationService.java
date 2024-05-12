package com.ss.android.ugc.aweme.translation.service;

import X.AbstractC73672Svk;
import X.C224048qm;
import X.C245649kW;
import X.C3C8;
import X.C76L;
import X.C8XO;
import X.C93Z;
import X.EnumC55203LlX;
import X.EnumC86688Y0m;
import X.IQE;
import X.InterfaceC115514g7;
import X.InterfaceC223648q8;
import X.InterfaceC49103JOx;
import X.InterfaceC55053Lj7;
import X.InterfaceC65350Pko;
import X.InterfaceC65462ha;
import X.InterfaceC86658Xzi;
import X.Y1E;
import X.Y1W;
import X.Y1Y;
import X.Y24;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public interface ITranslationService {
    InterfaceC55053Lj7 LIZ();

    void LIZIZ(List<Y1W> list, boolean z, InterfaceC223648q8 interfaceC223648q8, HashMap<String, String> hashMap);

    <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y24>> LIZJ(T t);

    AbstractC73672Svk<TranslationResult> LIZLLL(String str);

    InterfaceC86658Xzi LJ();

    C76L LJFF(int i, String str, String str2);

    String LJI(Aweme aweme, List list);

    void LJII(Context context, View view, Aweme aweme, String str);

    InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJIIIIZZ();

    C93Z LJIIIZ(EnumC55203LlX enumC55203LlX);

    int LJIIJ(Aweme aweme);

    void LJIIJJI(List<Y1W> list, boolean z, InterfaceC223648q8 interfaceC223648q8);

    Y1E LJIIL(Context context, C245649kW c245649kW, InteractStickerStruct interactStickerStruct, C224048qm c224048qm, InterfaceC223648q8 interfaceC223648q8);

    Map<String, Object> LJIILIIL(List<Y1W> list);

    boolean LJIILJJIL(Aweme aweme, String str);

    boolean LJIILL(Aweme aweme);

    String[] LJIILLIIL();

    IQE LJIIZILJ(Aweme aweme);

    void LJIJ();

    Y1Y LJIJI(Aweme aweme);

    boolean LJIJJ(Aweme aweme);

    boolean LJIJJLI(Aweme aweme, String str);

    InterfaceC65462ha<String> LJIL();

    void LJJ(String str);

    EnumC86688Y0m LJJI();

    boolean LJJIFFI();

    String LJJII();

    boolean LJJIII(Aweme aweme);

    InterfaceC49103JOx LJJIIJ();

    boolean LJJIIJZLJL(Aweme aweme);

    void LJJIIZ(EnumC86688Y0m enumC86688Y0m);

    String LJJIIZI();
}
