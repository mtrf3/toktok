package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CjQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32140CjQ extends FrameLayout implements InterfaceC32144CjU {
    public final DataChannel LJLIL;
    public LiveIconView LJLILLLLZI;
    public C32141CjR LJLJI;
    public final boolean LJLJJI;
    public C2A8 LJLJJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C32141CjR c32141CjR = this.LJLJI;
        if (c32141CjR != null) {
            c32141CjR.LIZJ.LIZLLL();
        }
        super.onDetachedFromWindow();
    }

    public final DataChannel getDataChannel() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC32144CjU
    public final void LIZ(Gift gift) {
        if (gift == null) {
            return;
        }
        if (this.LJLJJI) {
            C2A8 c2a8 = this.LJLJJL;
            if (c2a8 != null) {
                String str = gift.name;
                if (str == null) {
                    str = C15380j0.LJIILJJIL(R.string.mrk);
                }
                c2a8.setText(str);
            }
            C31665Cbl.LJIIJ(this.LJLILLLLZI, gift.image, C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f), 0);
        } else {
            C31665Cbl.LJIIJ(this.LJLILLLLZI, gift.image, C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f), 0);
        }
        if (isShown()) {
            BJH.LIZIZ(true, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32140CjQ(Context context, DataChannel dataChannel) {
        super(context);
        boolean z;
        long j;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        new LinkedHashMap();
        this.LJLIL = dataChannel;
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJI = z;
        if (z) {
            View LJI = C20910rv.LJI(R.layout.do5, null, false, 12);
            this.LJLILLLLZI = (LiveIconView) LJI.findViewById(R.id.ld4);
            this.LJLJJL = (C2A8) LJI.findViewById(R.id.ldm);
            LiveIconView liveIconView = this.LJLILLLLZI;
            if (liveIconView != null) {
                liveIconView.setAlpha(0.5f);
            }
            C2A8 c2a8 = this.LJLJJL;
            if (c2a8 != null) {
                c2a8.setAlpha(0.3f);
            }
            addView(LJI);
        } else {
            this.LJLILLLLZI = new LiveIconView(getContext(), null);
            int LIZJ = (int) KL2.LIZJ(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f));
            layoutParams.topMargin = LIZJ;
            layoutParams.leftMargin = LIZJ;
            layoutParams.setMarginStart(LIZJ);
            LiveIconView liveIconView2 = this.LJLILLLLZI;
            if (liveIconView2 != null) {
                liveIconView2.setLayoutParams(layoutParams);
            }
            LiveIconView liveIconView3 = this.LJLILLLLZI;
            if (liveIconView3 != null) {
                liveIconView3.setAlpha(0.5f);
            }
            addView(this.LJLILLLLZI);
        }
        C32141CjR c32141CjR = new C32141CjR(dataChannel);
        this.LJLJI = c32141CjR;
        c32141CjR.LIZLLL = this;
        if (!C32142CjS.LIZ(dataChannel)) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            Gift fastGift = GiftManager.inst().getFastGift(j);
            if (fastGift != null) {
                c32141CjR.LIZIZ = fastGift;
                EnumC30204BtI.DUMMY_FAST_GIFT.show(dataChannel);
                InterfaceC32144CjU interfaceC32144CjU = c32141CjR.LIZLLL;
                if (interfaceC32144CjU != null) {
                    interfaceC32144CjU.LIZ(c32141CjR.LIZIZ);
                }
            }
        }
        c32141CjR.LIZJ.LIZ(C73943T0h.LIZ().LJ(C32145CjV.class).LJJJJZI(new AfS57S0100000_5(c32141CjR, 324)));
        setClipChildren(false);
    }
}
