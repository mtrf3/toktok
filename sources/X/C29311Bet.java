package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RemoveFollowMsgChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bet, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29311Bet extends CSX<C29821Bn7> {
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final C47061t0 LJLLI;
    public DataChannel LJLLILLLL;
    public Room LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29311Bet(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.dk8);
        this.LJLL = (TextView) itemView.findViewById(R.id.djm);
        this.LJLLI = (C47061t0) itemView.findViewById(R.id.e_q);
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        Room room;
        C29821Bn7 model = (C29821Bn7) crd;
        o.LJIIIZ(model, "model");
        TextView textView = this.LJLJLLL;
        if (textView != null) {
            textView.setText(model.getContent());
        }
        if (!this.LJLJJI || cqq.LJFF) {
            C47061t0 c47061t0 = this.LJLLI;
            if (c47061t0 != null) {
                ImageModel LJJLJ = model.LJJLJ();
                if (LJJLJ != null) {
                    C31665Cbl.LJ(LJJLJ, c47061t0);
                } else {
                    c47061t0.setImageResource(R.drawable.d65);
                }
            }
        } else {
            C47061t0 c47061t02 = this.LJLLI;
            if (c47061t02 != null) {
                c47061t02.setVisibility(8);
            }
        }
        TextView textView2 = this.LJLL;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS40S0200000_5(model, this, 76));
        }
        View view = this.itemView;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 388), view);
        }
        DataChannel dataChannel = cqq.LJIIIIZZ;
        this.LJLLILLLL = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLLJ = room;
        DataChannel dataChannel2 = this.LJLLILLLL;
        if (dataChannel2 != null) {
            dataChannel2.lv0(dataChannel2.LJLJJI, RemoveFollowMsgChannel.class, new AqS136S0200000_5(this, model, 51));
        }
    }
}
