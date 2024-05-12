package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$onGuideRealShow$2", f = "SlideGuideViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66192il extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C66192il(InterfaceC67352kd<? super C66192il> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66192il(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Keva repo = Keva.getRepo("slide_mask_guide_repo");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        int LIZ = SU4.LIZ(System.currentTimeMillis());
        if (repo.getInt("last_show_day", -1) == LIZ) {
            C221018lt.LJFF("SlideGuide", "today is record!");
        } else {
            repo.storeInt("last_show_day", LIZ);
            int i = repo.getInt("show_day_count", 0) + 1;
            repo.storeInt("show_day_count", i);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mark show day: ");
            LIZ2.append(i);
            LIZ2.append('!');
            C221018lt.LJFF("SlideGuide", X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C66192il(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
