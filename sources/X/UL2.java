package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUnionPraiseGiftInToolBarSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class UL2 extends GroupableElementSpecImpl {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ UL8 LJLJI;

    public final void LIZ() {
        if (!this.LJLIL && !this.LJLILLLLZI) {
            C31117CJd.LIZ((Room) this.LJLJI.getDataChannel().kv0(RoomChannel.class), this.LJLJI.getDataChannel());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL2(UL8 ul8) {
        super(R.id.j3c);
        this.LJLJI = ul8;
        if (LiveUnionPraiseGiftInToolBarSetting.isEnable()) {
            bindGroups(C77019UKp.LJFF);
            AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 629);
            ul8.getClass();
            ((ArrayList) ul8.LJIIZILJ).add(aqS179S0100000_13);
            ((ArrayList) ul8.LJIJ).add(new AqS179S0100000_13(this, 630));
        } else {
            bindGroup(C77019UKp.LIZIZ);
        }
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(ul8, 631));
        bindGroup(C77019UKp.LIZLLL);
    }
}
