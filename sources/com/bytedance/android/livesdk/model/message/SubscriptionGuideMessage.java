package com.bytedance.android.livesdk.model.message;

import X.CBE;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;
import ujb.o;

/* loaded from: classes6.dex */
public final class SubscriptionGuideMessage extends CR6 {
    public String LJLIL;
    public CBE LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;

    @InterfaceC65349Pkn("btn_name")
    public Text buttonName;

    @InterfaceC65349Pkn("btn_url")
    public String buttonUrl;

    @InterfaceC65349Pkn("capsule_scene")
    public String capsuleScene;

    @InterfaceC65349Pkn("description")
    public Text description;

    @InterfaceC65349Pkn("from_user_id")
    public long from_user_id;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if ((!o.LJJJJJL(this.LJLIL)) || this.description != null) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        if (this.description != null) {
            return true;
        }
        return false;
    }

    public SubscriptionGuideMessage() {
        this.type = EnumC31509CYf.SUBSCRIPTION_GUIDE_MESSAGE;
        this.LJLIL = "";
        this.LJLILLLLZI = CBE.SUBSCRIBE;
    }
}
