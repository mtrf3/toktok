package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3el, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C89193el extends TBS implements InterfaceC88472Yns<IMUser, InterfaceC65784Pro<? extends C76800UCe>> {
    public C89193el(Object obj) {
        super(1, obj, BaseChatPanel.class, "createSayHiBtnOnClickCallback", "createSayHiBtnOnClickCallback(Lcom/ss/android/ugc/aweme/im/service/model/IMUser;)Lkotlin/jvm/functions/Function0;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC65784Pro<? extends C76800UCe> invoke(IMUser iMUser) {
        IMUser p0 = iMUser;
        o.LJIIIZ(p0, "p0");
        BaseChatPanel baseChatPanel = (BaseChatPanel) this.receiver;
        baseChatPanel.getClass();
        return new AqS148S0200000_1(baseChatPanel, p0, 59);
    }
}
