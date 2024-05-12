package com.ss.android.ugc.aweme.relation.recuser;

import X.ActivityC45651qj;
import X.EFM;
import X.EnumC57876MnY;
import X.InterfaceC25781A9x;
import X.InterfaceC34995DoN;
import X.InterfaceC54422LXm;
import X.InterfaceC55055Lj9;
import X.InterfaceC55143LkZ;
import X.InterfaceC57543MiB;
import X.InterfaceC57579Mil;
import X.InterfaceC57698Mkg;
import X.InterfaceC57702Mkk;
import X.InterfaceC80643Em;
import X.URB;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import java.util.List;

/* loaded from: classes10.dex */
public interface IRecUserService {
    URB LIZ(ActivityC45651qj activityC45651qj, Bundle bundle);

    InterfaceC34995DoN LIZIZ();

    InterfaceC57698Mkg LIZJ(EnumC57876MnY enumC57876MnY);

    InterfaceC55055Lj9 LIZLLL(ActivityC45651qj activityC45651qj, Aweme aweme);

    IRecUserMonManager LJ();

    InterfaceC80643Em LJFF();

    InterfaceC25781A9x LJI();

    List<EFM> LJII(boolean z);

    void LJIIIIZZ(String str);

    boolean LJIIIZ(ActivityC45651qj activityC45651qj);

    void LJIIJ(TuxTextView tuxTextView, User user, Aweme aweme);

    boolean LJIIJJI();

    InterfaceC55143LkZ LJIIL();

    InterfaceC57702Mkk LJIILIIL();

    InterfaceC54422LXm LJIILJJIL(Fragment fragment, String str, InterfaceC57543MiB interfaceC57543MiB);

    InterfaceC57579Mil LJIILL();
}
