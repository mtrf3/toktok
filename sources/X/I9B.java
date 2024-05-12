package X;

import Y.IDDListenerS146S0100000_7;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I9B implements InterfaceC29939Bp1 {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ LongPressWidget LIZIZ;

    public I9B(Context context, LongPressWidget longPressWidget) {
        this.LIZ = context;
        this.LIZIZ = longPressWidget;
    }

    @Override // X.InterfaceC29939Bp1
    public final void LIZ() {
        LiveRoomStruct liveRoomStruct;
        Context ctx = this.LIZ;
        C86343Xud LJLZ = this.LIZIZ.LJLZ();
        o.LJIIIZ(ctx, "ctx");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(ctx);
        if (LJJIFFI != null) {
            C26224AQy c26224AQy = new C26224AQy();
            String string = ctx.getString(R.string.twt);
            o.LJIIIIZZ(string, "ctx.getString(this)");
            c26224AQy.LJ = string;
            c26224AQy.LJIILIIL = true;
            String string2 = ctx.getString(R.string.tws);
            o.LJIIIIZZ(string2, "ctx.getString(this)");
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(LJLZ, 354);
            c26224AQy.LJII = string2;
            c26224AQy.LJIIIZ = aqS173S0100000_7;
            String string3 = ctx.getString(R.string.twr);
            o.LJIIIIZZ(string3, "ctx.getString(this)");
            c26224AQy.LIZIZ(string3);
            ASL LIZ = c26224AQy.LIZ();
            LIZ.LJI(0);
            IDDListenerS146S0100000_7 iDDListenerS146S0100000_7 = new IDDListenerS146S0100000_7(LJLZ, 14);
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLILLLLZI = iDDListenerS146S0100000_7;
            C1DG.LJII(LJJIFFI, "it.supportFragmentManager", tuxSheet, "why_this_live");
            if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_layer_whythislive_click");
                LIZ2.LJIJJ(LJLZ.LIZJ, "enter_from_merge");
                LIZ2.LJIJJ("live_cell", "enter_method");
                LIZ2.LJIJJ("click", "action_type");
                LIZ2.LJIJJ(Long.valueOf(liveRoomStruct.id), "room_id");
                LIZ2.LJIJJ(Long.valueOf(liveRoomStruct.getAnchorId()), "anchor_id");
                LIZ2.LJJIIJZLJL();
            }
        }
    }
}
