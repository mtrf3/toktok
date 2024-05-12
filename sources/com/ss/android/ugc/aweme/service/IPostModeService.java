package com.ss.android.ugc.aweme.service;

import X.C201427vO;
import X.C3C8;
import X.C40517FvF;
import X.EnumC207218Bh;
import X.InterfaceC207258Bl;
import X.InterfaceC65350Pko;
import X.JHC;
import X.JHD;
import X.KL0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public interface IPostModeService {
    void LIZ(String str);

    InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ(EnumC207218Bh enumC207218Bh);

    JHD LIZJ(JHC jhc);

    InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZLLL();

    boolean LJ();

    Integer LJFF();

    InterfaceC207258Bl LJI(ViewGroup viewGroup);

    void LJII(int i, int i2, Context context, List list);

    void LJIIIIZZ(Context context, Aweme aweme, C40517FvF c40517FvF, KL0 kl0);

    IPhotoModeLogUtil LJIIIZ();

    boolean LJIIJ();

    InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LJIIJJI();

    String LJIIL(String str);

    int LJIILIIL(Context context, Aweme aweme);

    boolean LJIILJJIL();

    void LJIILL(View view, View view2, Aweme aweme, String str, AqS169S0100000_3 aqS169S0100000_3);

    boolean LJIILLIIL(Aweme aweme);

    Object LJIIZILJ(Object obj);

    void LJIJ(int i, Context context, List list);

    boolean LJIJI(Aweme aweme);

    void LJIJJ(String str, C201427vO c201427vO);

    boolean LJIJJLI();

    boolean LJIL(Aweme aweme);

    void LJJ(Activity activity, int i, Object obj, Object obj2);

    boolean LJJI(Aweme aweme);

    boolean LJJIFFI();

    View LJJII(View view);

    float LJJIII();
}
