package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountMessage;
import com.ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.LVd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54361LVd extends C51031K1b<MusNewNotificationModel> implements LVR {
    public final int LJLJJL = 1;
    public final int LJLJJLL = 3;
    public final int LJLJL = 4;

    @Override // X.C51031K1b, X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        EventBus.LIZJ().LJIJ(this);
        if (ENR.LIZ()) {
            LVL.LJLIL.getClass();
            LVL.LJLJLJ.remove(2);
        } else {
            LVM.LJIJ().LJLJI.remove(2);
        }
    }

    @Override // X.LVR
    public final void LJIIJ(NoticeCountMessage noticeCountMessage) {
        String str;
        o.LJIIIZ(noticeCountMessage, "noticeCountMessage");
        if (noticeCountMessage.noticeGroup == 11) {
            int i = noticeCountMessage.noticeType;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LJIIIIZZ(this.LJLJL, new Bundle());
                return;
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get(false)");
            Bundle bundle = new Bundle();
            StrangerNoticeMessage strangerNoticeMessage = noticeCountMessage.strangerMessage;
            if (strangerNoticeMessage != null) {
                bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                SimpleUser fromUser = strangerNoticeMessage.getFromUser();
                if (fromUser == null || (str = fromUser.getNickName()) == null) {
                    str = "";
                }
                bundle.putString("from_user_name", str);
                bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
            }
            bundle.putInt("unread_count", C54362LVe.LJIILJJIL(11));
            createIIMServicebyMonsterPlugin.getImNotificationService().LJIIIIZZ(this.LJLJJLL, bundle);
        }
    }

    @Override // X.C8BR
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public final void LJJI(InterfaceC223218pR<?> view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
        EventBus.LIZJ().LJIILJJIL(this);
        if (ENR.LIZ()) {
            LVL.LJLIL.getClass();
            LVL.LJLJLJ.put(2, this);
        } else {
            LVM.LJIJ().LJLJI.put(2, this);
        }
    }

    @QD3
    public final void onEvent(C82773Mr event) {
        o.LJIIIZ(event, "event");
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get(false)");
        Bundle bundle = new Bundle();
        bundle.putInt("unread_count", C54362LVe.LJIILJJIL(11));
        createIIMServicebyMonsterPlugin.getImNotificationService().LJIIIIZZ(this.LJLJJL, bundle);
    }
}
