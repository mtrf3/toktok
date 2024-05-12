package X;

import Y.IDTListenerS115S0100000_5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.android.play.core.appupdate.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAO extends CAA implements InterfaceC72822Si2 {
    public final LifecycleOwner LJLJL;
    public C0CM LJLJLJ;
    public C80897Voz LJLJLLL;
    public XKQ LJLL;
    public final long LJLLI;
    public final boolean LJLLILLLL;
    public CAQ LJLLJ;

    @Override // X.CAA
    public final void LIZIZ() {
        XKQ xkq = this.LJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLL = null;
    }

    @Override // X.CAA
    public final void LJFF() {
        NewTopRightBannerWidget newTopRightBannerWidget = this.LJLJJL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.LJZL();
        }
        Context context = this.LJLIL;
        if (context != null) {
            C80897Voz c80897Voz = new C80897Voz(context);
            c80897Voz.setRubberBandCoefficient(1.0f);
            c80897Voz.setMaxOverScrollDistance(C15380j0.LJIIL());
            C0CM c0cm = new C0CM(context);
            c0cm.setOrientation(0);
            c0cm.setAdapter(new C28307B9b(this.LJLILLLLZI, new CA8(this)));
            CAQ caq = new CAQ(this.LJLILLLLZI, this.LJLJJL);
            this.LJLLJ = caq;
            c0cm.LIZIZ(caq);
            c80897Voz.addView(c0cm);
            this.LJLJLLL = c80897Voz;
            this.LJLJLJ = c0cm;
        }
        NewTopRightBannerWidget newTopRightBannerWidget2 = this.LJLJJL;
        if (newTopRightBannerWidget2 != null) {
            newTopRightBannerWidget2.LL(0);
        }
        if (!this.LJLLILLLL) {
            return;
        }
        C72818Shy.LIZLLL("live_banner_panel_dismiss", this);
        C72818Shy.LIZLLL("live_banner_panel_tab_scrolled", this);
    }

    @Override // X.CAA
    public final void LJI() {
        View childAt;
        NewTopRightBannerWidget newTopRightBannerWidget = this.LJLJJL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.LLF();
        }
        if (this.LJLILLLLZI.size() <= 1) {
            return;
        }
        C0CM c0cm = this.LJLJLJ;
        if (c0cm != null && (childAt = c0cm.getChildAt(0)) != null) {
            childAt.setOnTouchListener(new IDTListenerS115S0100000_5(this, 10));
        }
        LJIILJJIL();
    }

    public final void LJIILJJIL() {
        if (this.LJLILLLLZI.size() <= 1) {
            return;
        }
        XKQ xkq = this.LJLL;
        if (xkq != null && xkq.isActive()) {
            return;
        }
        this.LJLL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLJL), null, null, new CAP(this, null), 3);
    }

    @Override // X.CAA
    public final View LIZJ() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2 = c199097rd.LJLIL;
        if (o.LJ(str2, "live_banner_panel_dismiss")) {
            LJIILJJIL();
            return;
        }
        if (!o.LJ(str2, "live_banner_panel_tab_scrolled")) {
            return;
        }
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns != null) {
            str = u.LJJIJIL(interfaceC78280Uns, "bannerId", "");
        } else {
            str = null;
        }
        Iterator<BannerInRoom> it = this.LJLILLLLZI.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(String.valueOf(it.next().id), str)) {
                if (i < 0) {
                    return;
                }
                CAQ caq = this.LJLLJ;
                if (caq != null) {
                    CAH cah = CAH.PANEL_ITEM_SCROLL;
                    o.LJIIIZ(cah, "<set-?>");
                    caq.LJLJJI = cah;
                }
                C0CM c0cm = this.LJLJLJ;
                if (c0cm == null) {
                    return;
                }
                c0cm.LIZLLL(i, true);
                return;
            }
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CAO(Context context, List list, boolean z, Room room, NewTopRightBannerWidget lifecycleOwner) {
        super(context, list, z, room);
        long j;
        boolean z2;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJL = lifecycleOwner;
        LiveBannerConfigSetting.BannerConfig value = LiveBannerConfigSetting.INSTANCE.getValue();
        if (z) {
            j = value.anchorInterval;
        } else {
            j = value.normalInterval;
        }
        this.LJLLI = j;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((BannerInRoom) it.next()).openWithNavigationTag) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        this.LJLLILLLL = z2;
    }
}
