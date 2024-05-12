package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;

/* renamed from: X.Mkk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC57702Mkk {
    public static final C57701Mkj LIZ = C57701Mkj.LIZ;

    Object LIZ(User user, EnumC57876MnY enumC57876MnY, int i, int i2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    AbstractC029409q<?> LIZIZ(C57838Mmw c57838Mmw);

    InterfaceC98113t9 LIZJ();

    void LIZLLL(ActivityC45651qj activityC45651qj);

    FrameLayout LJ(ActivityC45651qj activityC45651qj, String str, boolean z);

    void LJFF(Context context, User user, String str, String str2, String str3, String str4, String str5);

    AbsUserCardInboxWidget LJI(Fragment fragment, int i, LiveData<EnumC94693nd> liveData, AbstractC57896Mns abstractC57896Mns, int i2);
}
