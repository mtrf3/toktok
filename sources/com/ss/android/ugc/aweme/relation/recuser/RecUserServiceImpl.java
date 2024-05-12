package com.ss.android.ugc.aweme.relation.recuser;

import X.ActivityC45651qj;
import X.C05040Hs;
import X.C214298b3;
import X.C214528bQ;
import X.C244869jG;
import X.C25765A9h;
import X.C47261Igj;
import X.C55247LmF;
import X.C57576Mii;
import X.C57582Mio;
import X.C57599Mj5;
import X.C57737MlJ;
import X.C57764Mlk;
import X.C57866MnO;
import X.C57877MnZ;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C86581XyT;
import X.C93L;
import X.EFM;
import X.EnumC57876MnY;
import X.HG3;
import X.InterfaceC25781A9x;
import X.InterfaceC34995DoN;
import X.InterfaceC54422LXm;
import X.InterfaceC55055Lj9;
import X.InterfaceC55143LkZ;
import X.InterfaceC57543MiB;
import X.InterfaceC57579Mil;
import X.InterfaceC57698Mkg;
import X.InterfaceC57702Mkk;
import X.InterfaceC65784Pro;
import X.InterfaceC80643Em;
import X.M42;
import X.M43;
import X.RBX;
import X.URB;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.relation.lego.RecUserRequestLegoTask;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import com.ss.android.ugc.aweme.relation.monitor.RecUserMonManagerImpl;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecUserServiceImpl implements IRecUserService {
    public final C57737MlJ LIZ = C57737MlJ.LIZ;
    public final C57576Mii LIZIZ = C57576Mii.LIZ;
    public final C57764Mlk LIZJ = C57764Mlk.LIZIZ;
    public final Map<String, ArrayList<String>> LIZLLL = new LinkedHashMap();
    public final C57599Mj5 LJ = C57599Mj5.LIZ;
    public final RecUserMonManagerImpl LJFF = RecUserMonManagerImpl.LJLIL;

    public static IRecUserService LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(IRecUserService.class, false);
        if (LIZ != null) {
            return (IRecUserService) LIZ;
        }
        if (C58096Mr6.w4 == null) {
            synchronized (IRecUserService.class) {
                if (C58096Mr6.w4 == null) {
                    C58096Mr6.w4 = new RecUserServiceImpl();
                }
            }
        }
        return C58096Mr6.w4;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC80643Em LJFF() {
        C86581XyT c86581XyT = new C86581XyT(null);
        C55247LmF.LIZIZ(GScope.LJLIL, c86581XyT, InterfaceC80643Em.class, "source_default_key");
        c86581XyT.LJLIL.clear();
        return c86581XyT;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC25781A9x LJI() {
        return new C25765A9h();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJIIJJI() {
        ArrayList arrayList;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null || (arrayList = (ArrayList) ((LinkedHashMap) this.LIZLLL).get(curUserId)) == null) {
            return false;
        }
        return arrayList.contains("homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC34995DoN LIZIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final IRecUserMonManager LJ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC55143LkZ LJIIL() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57702Mkk LJIILIIL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57579Mil LJIILL() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57698Mkg LIZJ(EnumC57876MnY scene) {
        o.LJIIIZ(scene, "scene");
        return new C57877MnZ(new C57866MnO(scene, 131070));
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final List<EFM> LJII(boolean z) {
        return C47261Igj.LJJIJ(new RecUserRequestLegoTask(z));
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIIIZZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        String curUserId = HG3.LJIILL().getCurUserId();
        if (curUserId == null) {
            return;
        }
        if (!this.LIZLLL.containsKey(curUserId)) {
            this.LIZLLL.put(curUserId, C05040Hs.LIZIZ(enterFrom));
            return;
        }
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.LIZLLL).get(curUserId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(enterFrom)) {
            arrayList.add(enterFrom);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJIIIZ(ActivityC45651qj activityC45651qj) {
        Boolean value;
        if (activityC45651qj == null || (value = ((RecUserInMainActivityViewModel) new ViewModelProvider(activityC45651qj).get(RecUserInMainActivityViewModel.class)).LJLJL.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final URB LIZ(ActivityC45651qj activityC45651qj, Bundle bundle) {
        C25765A9h c25765A9h = new C25765A9h();
        C65776Prg LIZ = C65352Pkq.LIZ(RecUserAfterAuthPopupVM.class);
        return new C244869jG(activityC45651qj, c25765A9h, (RecUserAfterAuthPopupVM) new C214298b3(LIZ, new AqS151S0200000_4(LIZ, c25765A9h, 46), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), new AqS154S0100000_4(bundle, 1194), C93L.INSTANCE, (InterfaceC65784Pro) null, 384).getValue(), bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC55055Lj9 LIZLLL(ActivityC45651qj fragmentActivity, Aweme aweme) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        return M42.LIZ(fragmentActivity, M43.FYP, aweme);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIJ(TuxTextView tuxTextView, User user, Aweme aweme) {
        C57582Mio.LIZLLL(tuxTextView, user, aweme, 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC54422LXm LJIILJJIL(Fragment fragment, String str, InterfaceC57543MiB callback) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(callback, "callback");
        return new EmptyGuideV2(fragment, callback);
    }
}
