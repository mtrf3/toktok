package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Mkl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57703Mkl implements InterfaceC57702Mkk {
    public static final C57703Mkl LIZJ = new C57703Mkl();
    public final /* synthetic */ InterfaceC57702Mkk LIZIZ = C57738MlK.LIZIZ.LJIILIIL();

    @Override // X.InterfaceC57702Mkk
    public final Object LIZ(User user, EnumC57876MnY enumC57876MnY, int i, int i2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return this.LIZIZ.LIZ(user, enumC57876MnY, i, i2, interfaceC67352kd);
    }

    @Override // X.InterfaceC57702Mkk
    public final AbstractC029409q<?> LIZIZ(C57838Mmw c57838Mmw) {
        return this.LIZIZ.LIZIZ(c57838Mmw);
    }

    @Override // X.InterfaceC57702Mkk
    public final InterfaceC98113t9 LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC57702Mkk
    public final void LIZLLL(ActivityC45651qj activityC45651qj) {
        this.LIZIZ.LIZLLL(activityC45651qj);
    }

    @Override // X.InterfaceC57702Mkk
    public final FrameLayout LJ(ActivityC45651qj activityC45651qj, String enterFrom, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        return this.LIZIZ.LJ(activityC45651qj, enterFrom, z);
    }

    @Override // X.InterfaceC57702Mkk
    public final void LJFF(Context context, User user, String enterFrom, String str, String previousPage, String enterMethod, String str2) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZIZ.LJFF(context, user, enterFrom, str, previousPage, enterMethod, str2);
    }

    @Override // X.InterfaceC57702Mkk
    public final AbsUserCardInboxWidget LJI(Fragment fragment, int i, LiveData<EnumC94693nd> liveData, AbstractC57896Mns authCardStrategy, int i2) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(authCardStrategy, "authCardStrategy");
        return this.LIZIZ.LJI(fragment, i, liveData, authCardStrategy, i2);
    }
}
