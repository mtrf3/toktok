package X;

import Y.ACListenerS31S0300000_5;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftCollection;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQ3 extends CSX<CQ1> {
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final ImageView LJLLI;

    public static int N() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQ3(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.jt4);
        this.LJLL = (TextView) itemView.findViewById(R.id.jsh);
        this.LJLLI = (ImageView) itemView.findViewById(R.id.e_q);
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        MESSAGE message;
        GiftCollection giftCollection;
        Gift gift;
        CQ1 model = (CQ1) crd;
        o.LJIIIZ(model, "model");
        if (this.LJLJLLL == null || this.LJLL == null || this.LJLLI == null || (message = model.LJIJJLI) == 0 || (giftCollection = ((GiftCollectionUpdateMessage) message).giftCollection) == null || (gift = giftCollection.gift) == null) {
            return;
        }
        long j = giftCollection.round;
        long j2 = gift.id;
        BZI LIZ = C28787BRn.LIZ("travel_gift_massage_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j), "round");
        LIZ.LJIJJ(Integer.valueOf(N()), "is_anchor");
        LIZ.LJIJJ(Long.valueOf(j2), "gift_id");
        LIZ.LJJIIJZLJL();
        this.LJLLI.setImageResource(R.drawable.czd);
        this.LJLJLLL.setText(model.getContent());
        this.LJLL.setText(cqq.LIZ.getString(R.string.nsc));
        C16880lQ.LJIJI(this.LJLL, new ACListenerS31S0300000_5(cqq, model, this, 32));
    }
}
