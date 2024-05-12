package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* renamed from: X.U2n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76549U2n extends AbstractC76220Tvk<C76553U2r> {
    public final InterfaceC76555U2t LJLIL;
    public final DataChannel LJLILLLLZI;
    public C76553U2r LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public View LJLJJLL;
    public C47121t6 LJLJL;
    public LiveIconView LJLJLJ;
    public C31597Caf LJLJLLL;
    public C2A7 LJLL;
    public ViewGroup LJLLI;
    public ImageView LJLLILLLL;
    public C47121t6 LJLLJ;
    public C47061t0 LJLLL;
    public C47121t6 LJLLLL;

    @Override // X.AbstractC76220Tvk
    public final void LJJJJIZL() {
        DataChannel dataChannel = this.LJLILLLLZI;
        dataChannel.getClass();
        dataChannel.jv0(this);
    }

    public final boolean M() {
        ShowListUser showListUser;
        C76553U2r c76553U2r = this.LJLJI;
        if (c76553U2r == null || (showListUser = c76553U2r.LJLIL) == null || showListUser.userId != C025908h.LIZ()) {
            return false;
        }
        return true;
    }

    public final void P() {
        LiveIconView liveIconView = this.LJLJLJ;
        if (liveIconView != null) {
            C87277YNd.LJJIIZ(liveIconView);
        }
        C2A7 c2a7 = this.LJLL;
        if (c2a7 != null) {
            C87277YNd.LJJIJ(c2a7);
        }
        N(true);
    }

    public final void Q() {
        LiveIconView liveIconView = this.LJLJLJ;
        if (liveIconView != null) {
            C87277YNd.LJJIJ(liveIconView);
        }
        C2A7 c2a7 = this.LJLL;
        if (c2a7 != null) {
            C87277YNd.LJJIIZ(c2a7);
        }
        N(false);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC76554U2s(this));
    }

    @Override // X.AbstractC76220Tvk
    public final void onViewDetachedFromWindow() {
        C47061t0 c47061t0 = this.LJLLL;
        if (c47061t0 != null) {
            c47061t0.clearAnimation();
        }
    }

    public final void N(boolean z) {
        ViewTreeObserver viewTreeObserver;
        C47121t6 c47121t6 = this.LJLJJL;
        if (c47121t6 != null && (viewTreeObserver = c47121t6.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC76552U2q(z, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7  */
    @Override // X.AbstractC76220Tvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76549U2n.L(int, java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76549U2n(View view, InterfaceC76555U2t interfaceC76555U2t, DataChannel dataChannel) {
        super(view);
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = interfaceC76555U2t;
        this.LJLILLLLZI = dataChannel;
    }
}
