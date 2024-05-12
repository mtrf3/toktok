package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import com.ss.android.ugc.aweme.relation.recuser.RecUserServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MlK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57738MlK implements IRecUserService {
    public static final C57738MlK LIZIZ = new C57738MlK();
    public final /* synthetic */ IRecUserService LIZ = RecUserServiceImpl.LJIILLIIL();

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final URB LIZ(ActivityC45651qj activityC45651qj, Bundle bundle) {
        return this.LIZ.LIZ(activityC45651qj, bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC34995DoN LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57698Mkg LIZJ(EnumC57876MnY scene) {
        o.LJIIIZ(scene, "scene");
        return this.LIZ.LIZJ(scene);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC55055Lj9 LIZLLL(ActivityC45651qj fragmentActivity, Aweme aweme) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        return this.LIZ.LIZLLL(fragmentActivity, aweme);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final IRecUserMonManager LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC80643Em LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC25781A9x LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final List<EFM> LJII(boolean z) {
        return this.LIZ.LJII(z);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIIIZZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJIIIIZZ(enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJIIIZ(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LJIIIZ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final void LJIIJ(TuxTextView tuxTextView, User user, Aweme aweme) {
        this.LIZ.LJIIJ(tuxTextView, user, aweme);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC55143LkZ LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57702Mkk LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC54422LXm LJIILJJIL(Fragment fragment, String str, InterfaceC57543MiB callback) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(callback, "callback");
        return this.LIZ.LJIILJJIL(fragment, str, callback);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.IRecUserService
    public final InterfaceC57579Mil LJIILL() {
        return this.LIZ.LJIILL();
    }
}
