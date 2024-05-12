package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.A7e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25710A7e implements InterfaceC57133MbZ {
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C25717A7l.LJLIL);
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final WeakReference<ActivityC45651qj> LIZJ;
    public final String LIZLLL;
    public final InviteFriendsApiService LJ;
    public final InterfaceC70422pa LJFF;
    public InterfaceC65784Pro<C76800UCe> LJI;

    @Override // X.InterfaceC57133MbZ
    public final void LIZ() {
        if (!C25706A7a.LIZ()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (A7Y.LIZ()) {
            XKX.LIZLLL(this.LJFF, null, null, new C25708A7c(this, null), 3);
        } else {
            LifecycleOwnerKt.getLifecycleScope(this.LIZ).launchWhenResumed(new C25709A7d(this, null));
        }
    }

    @Override // X.InterfaceC57133MbZ
    public final void LIZIZ(C57132MbY listener) {
        o.LJIIIZ(listener, "listener");
        this.LJI = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25710A7e.LIZJ(X.2kd):java.lang.Object");
    }

    public C25710A7e(ActivityC45651qj activity, boolean z) {
        WeakReference<ActivityC45651qj> weakReference = new WeakReference<>(activity);
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        InviteFriendsApiService apiService = InviteFriendsApiService.LIZIZ;
        C64962gm LIZ = C48841JEv.LIZ(C36636EZk.LIZ.plus(T2R.LJIIJJI()));
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(apiService, "apiService");
        this.LIZ = activity;
        this.LIZIZ = z;
        this.LIZJ = weakReference;
        this.LIZLLL = curUserId;
        this.LJ = apiService;
        this.LJFF = LIZ;
    }

    public final Object LIZLLL(boolean z, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        String str;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        OSZ osz = new OSZ("to_status", str);
        int i = 1;
        FMX.LJIIL("account_auth_switch", C113554cx.LJJL(new OSZ("account_type", "link"), osz, new OSZ("enter_from", "link_pop_up")));
        InviteFriendsApiService inviteFriendsApiService = this.LJ;
        inviteFriendsApiService.getClass();
        if (!z) {
            i = 2;
        }
        Object LIZ = C77318UWc.LIZ(inviteFriendsApiService.setSuggestPrivacySettings("sug_to_who_share_link", i), interfaceC67352kd);
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        if (LIZ != enumC58928NAu) {
            LIZ = C76800UCe.LIZ;
        }
        if (LIZ == enumC58928NAu) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}
