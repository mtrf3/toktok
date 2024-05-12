package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.3tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98633tz extends TBS implements InterfaceC88474Ynu<Activity, C98563ts, Integer, Boolean, C76800UCe> {
    public static final C98633tz LJLIL = new C98633tz();

    public C98633tz() {
        super(4, V9W.class, "jumpToGroupChatDetail", "jumpToGroupChatDetail(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/group/data/GroupSessionInfo;IZ)V", 1);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Activity activity, C98563ts c98563ts, Integer num, Boolean bool) {
        Activity p0 = activity;
        C98563ts p1 = c98563ts;
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        V9W.LIZ(p0, p1, intValue, booleanValue);
        return C76800UCe.LIZ;
    }
}
