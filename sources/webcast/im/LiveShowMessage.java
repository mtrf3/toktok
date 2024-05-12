package webcast.im;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import webcast.data.multi_guest_play.ShowContent;

/* loaded from: classes14.dex */
public final class LiveShowMessage extends CR6 {

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("show_content")
    public ShowContent showContent;

    public LiveShowMessage() {
        this.type = EnumC31509CYf.LIVE_SHOW_MESSAGE;
    }
}
