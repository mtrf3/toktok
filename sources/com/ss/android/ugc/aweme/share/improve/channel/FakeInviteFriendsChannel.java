package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC62625Ohx;
import X.C114104dq;
import X.C119604mi;
import X.C221018lt;
import X.C86V;
import X.InterfaceC62573Oh7;
import Y.IDLListenerS55S0200000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FakeInviteFriendsChannel extends PureLogicChannel {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJ(C119604mi imageView, boolean z) {
        o.LJIIIZ(imageView, "imageView");
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "invitation";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String LJFF = C86V.LJFF(R.string.hj1);
        o.LJIIIIZZ(LJFF, "getString(R.string.invit…sender_share_panel_entry)");
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC62225ObV
    public final void LJFF(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        itemView.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS55S0200000_1(itemView, C114104dq.LJLIL, 1));
        C221018lt.LJFF("Relation_Sharer", "fake invite friends channel show");
    }
}
