package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.C05170If;
import X.C15380j0;
import X.C29306Beo;
import X.C29927Bop;
import X.C32136CjM;
import X.C73943T0h;
import X.C74838TYs;
import X.CX5;
import X.EnumC31509CYf;
import X.ViewOnClickListenerC13880ga;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.gson.internal.b;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNewGiftGuestInfoWidget extends LiveWidget implements View.OnClickListener, OnMessageListener {
    public C32136CjM LJLIL;
    public TextView LJLILLLLZI;
    public User LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cxe;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            C29306Beo.LJJLJLI(viewGroup);
        }
        CX5 cx5 = (CX5) this.contentView.findViewById(R.id.abh);
        TextView textView = (TextView) this.contentView.findViewById(R.id.lbj);
        View findViewById = this.contentView.findViewById(R.id.myq);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.user_coin_num)");
        this.LJLILLLLZI = (TextView) findViewById;
        C32136CjM c32136CjM = this.LJLIL;
        if (c32136CjM != null) {
            this.LJLJI = c32136CjM.LIZ;
            LJLZ(c32136CjM.LJII);
        }
        User user = this.LJLJI;
        if (user != null) {
            if (cx5 != null) {
                cx5.setAvatar(user.getAvatarThumb());
            }
            if (textView != null) {
                textView.setText(C15380j0.LJIILL(R.string.o1m, C05170If.LIZ(this.LJLJI)));
            }
        }
        if (cx5 != null) {
            cx5.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC.getIntType(), this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public final void LJLZ(long j) {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            String LJIILJJIL = b.LJIILJJIL(j);
            o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(count)");
            String upperCase = LJIILJJIL.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            textView.setText(upperCase);
            return;
        }
        o.LJIJI("userCoinNum");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        C32136CjM c32136CjM;
        o.LJIIIZ(v, "v");
        if (v.getId() == R.id.abh && (c32136CjM = this.LJLIL) != null) {
            c32136CjM.LJ.postValue(Boolean.TRUE);
            C74838TYs.LJ().LJIIZILJ = true;
            UserProfileEvent userProfileEvent = new UserProfileEvent(c32136CjM.LIZ, "guest_connection");
            userProfileEvent.mReportType = "report_anchor";
            userProfileEvent.mSource = "guest_connection";
            C73943T0h.LIZ().LIZIZ(userProfileEvent);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        User user;
        o.LJIIIZ(message, "message");
        if ((message instanceof LinkMicMessage) && (user = this.LJLJI) != null && user.getId() == ((LinkMicMessage) message).userId) {
            LinkMicMessage linkMicMessage = (LinkMicMessage) message;
            if (linkMicMessage.mType == 8) {
                LJLZ(linkMicMessage.fanTicket);
            }
        }
    }
}
