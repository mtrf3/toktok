package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.40o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1025040o extends TBS implements InterfaceC65784Pro<IMUser> {
    public C1025040o(Object obj) {
        super(0, obj, SingleChatNoticeAssem.class, "getMafUser", "getMafUser()Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final IMUser invoke() {
        return ((SingleChatNoticeAssem) this.receiver).M3();
    }
}
