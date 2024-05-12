package com.ss.android.ugc.aweme.qainvitation.service;

import X.C76800UCe;
import X.EnumC90333gb;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.model.QAInvitationSettingsData;
import com.ss.android.ugc.aweme.qna.model.Qna;
import java.util.List;

/* loaded from: classes2.dex */
public interface IQAInvitationService {
    void LIZ(Activity activity, String str, String str2, long j, long j2, List<? extends User> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    List<User> LIZIZ(List<? extends IMUser> list);

    void LIZJ(Activity activity, String str, String str2, EnumC90333gb enumC90333gb, Long l, Long l2, List<? extends IMUser> list, Qna qna, InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns);

    QAInvitationSettingsData LIZLLL();

    List<IMUser> LJ(List<? extends User> list);

    void LJFF(Activity activity, String str, String str2, Long l, Long l2, List<? extends User> list, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);
}
