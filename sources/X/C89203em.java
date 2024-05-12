package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3em, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C89203em extends TBS implements InterfaceC88472Yns<IMUser, InterfaceC65784Pro<? extends C76800UCe>> {
    public C89203em(Object obj) {
        super(1, obj, SingleChatNoticeAssem.class, "createSayHiBtnOnClickCallback", "createSayHiBtnOnClickCallback(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)Lkotlin/jvm/functions/Function0;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC65784Pro<? extends C76800UCe> invoke(IMUser iMUser) {
        IMUser p0 = iMUser;
        o.LJIIIZ(p0, "p0");
        SingleChatNoticeAssem singleChatNoticeAssem = (SingleChatNoticeAssem) this.receiver;
        singleChatNoticeAssem.getClass();
        return new AqS148S0200000_1(singleChatNoticeAssem, p0, 34);
    }
}
