package X;

import Y.ACListenerS38S0300000_13;
import Y.ACListenerS40S0200000_5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tsu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76044Tsu extends AbstractC31414CUo<C76046Tsw, C76045Tsv> {
    public final InterfaceC76056Tt6 LIZIZ;
    public final DataChannel LIZJ;

    public C76044Tsu(InterfaceC76056Tt6 listener, DataChannel dataChannel) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ = listener;
        this.LIZJ = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76045Tsv c76045Tsv, C76046Tsw c76046Tsw) {
        C76045Tsv holder = c76045Tsv;
        C76046Tsw item = c76046Tsw;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        int i = C76043Tst.LIZ[item.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJIIIIZZ(holder, item);
            }
        } else {
            LJII(holder, item);
        }
        C29306Beo.LJJLJLI(holder.L());
        Object value = holder.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-title>(...)");
        ((TextView) value).setText(item.LJLIL);
        Object value2 = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-reserveNotice>(...)");
        C16880lQ.LJJII((LiveIconView) value2, new ACListenerS40S0200000_5(item, this, 89));
    }

    @Override // X.AbstractC31414CUo
    public final C76045Tsv LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8c, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C76045Tsv(LLLLIILL);
    }

    public final void LJI(C76045Tsv c76045Tsv, C76046Tsw c76046Tsw) {
        Long l;
        EnumC76042Tss enumC76042Tss;
        int i = C76043Tst.LIZ[c76046Tsw.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJII(c76045Tsv, c76046Tsw);
                enumC76042Tss = EnumC76042Tss.EXTENSION;
            } else {
                throw new C162476Zf();
            }
        } else {
            LJIIIIZZ(c76045Tsv, c76046Tsw);
            int s7 = this.LIZIZ.s7();
            EnumC75182Tf0 clickTime = C44432HcC.LJIIIIZZ();
            o.LJIIIZ(clickTime, "clickTime");
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            Long l2 = null;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            hashMap.put("anchor_id", String.valueOf(l));
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            }
            hashMap.put("room_id", String.valueOf(l2));
            hashMap.put("current_reservation_cnts", String.valueOf(s7));
            hashMap.put("click_time", clickTime.getType());
            AnonymousClass172.LIZ("livesdk_reservation_close_click", hashMap);
            enumC76042Tss = EnumC76042Tss.SHRINK;
        }
        o.LJIIIZ(enumC76042Tss, "<set-?>");
        c76046Tsw.LJLILLLLZI = enumC76042Tss;
    }

    public final void LJII(C76045Tsv c76045Tsv, C76046Tsw c76046Tsw) {
        c76045Tsv.L().setIconAttr(R.attr.asu);
        c76045Tsv.L().setIconTint(C15380j0.LIZIZ(R.color.ey));
        C16880lQ.LJJII(c76045Tsv.L(), new ACListenerS38S0300000_13(this, c76046Tsw, c76045Tsv, 10));
    }

    public final void LJIIIIZZ(C76045Tsv c76045Tsv, C76046Tsw c76046Tsw) {
        c76045Tsv.L().setIconAttr(R.attr.asi);
        c76045Tsv.L().setIconTint(C15380j0.LIZIZ(R.color.ey));
        C16880lQ.LJJII(c76045Tsv.L(), new ACListenerS38S0300000_13(this, c76046Tsw, c76045Tsv, 11));
    }
}
