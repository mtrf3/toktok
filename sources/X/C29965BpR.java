package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.CapsuleViewExpandDisable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import q03.IDaS200S0200000_5;

/* renamed from: X.BpR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29965BpR extends CSF<InterfaceC29964BpQ> {
    public final C29968BpU LJLJLLL;
    public final View LJLL;
    public final C47061t0 LJLLI;
    public boolean LJLLILLLL;

    public final void N() {
        int LJFF;
        View view = this.LJLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.LJLLILLLL) {
                LJFF = C15380j0.LJFF(R.dimen.aab);
            } else {
                LJFF = C15380j0.LJFF(R.dimen.aaa);
            }
            marginLayoutParams.setMarginEnd(LJFF);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29965BpR(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (C29968BpU) itemView.findViewById(R.id.b4g);
        this.LJLL = itemView.findViewById(R.id.bst);
        this.LJLLI = (C47061t0) itemView.findViewById(R.id.ecz);
    }

    @Override // X.CSF
    public final void L(CQQ cqq, InterfaceC29964BpQ interfaceC29964BpQ) {
        View view;
        InterfaceC29964BpQ model = interfaceC29964BpQ;
        o.LJIIIZ(model, "model");
        C47061t0 c47061t0 = this.LJLLI;
        if (c47061t0 != null) {
            ImageModel LJJLJ = model.LJJLJ();
            if (LJJLJ != null) {
                C31665Cbl.LJ(LJJLJ, c47061t0);
            } else {
                C87277YNd.LJJIIJ(model.LJJJ(), c47061t0);
            }
        }
        C29968BpU c29968BpU = this.LJLJLLL;
        if (c29968BpU != null) {
            c29968BpU.LJJLJLI(cqq, model);
        }
        if (!CapsuleViewExpandDisable.INSTANCE.disable() && (view = this.LJLL) != null) {
            C16880lQ.LJIIJ(new IDaS200S0200000_5(model, cqq, 1), view);
        }
        DataChannel dataChannel = cqq.LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.lv0(cqq.LIZIZ, PublicScreenShrinkChannel.class, new AqS171S0100000_5(this, 795));
        }
        N();
    }
}
