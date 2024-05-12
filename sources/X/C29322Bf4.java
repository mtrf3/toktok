package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bf4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29322Bf4 extends CSX<C29326Bf8> {
    public final View LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29322Bf4(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content)");
        this.LJLJLLL = findViewById;
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        InterfaceC29321Bf3 c29324Bf6;
        DataChannel dataChannel;
        boolean z;
        float f;
        Boolean bool;
        C29326Bf8 model = (C29326Bf8) crd;
        o.LJIIIZ(model, "model");
        int i = ((LinkMicAnchorGuideMessage) model.LJIJJLI).guideType;
        if (i != 0) {
            if (i == 1) {
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                c29324Bf6 = new C29320Bf2(itemView);
            }
            dataChannel = cqq.LJIIIIZZ;
            if (dataChannel == null && (bool = (Boolean) dataChannel.kv0(PublicScreenShrinkChannel.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p = (C018905p) layoutParams;
            if (z || ((LinkMicAnchorGuideMessage) model.LJIJJLI).guideType == 1) {
                f = 0.99f;
            } else {
                f = 0.8f;
            }
            c018905p.matchConstraintPercentWidth = f;
            this.LJLJLLL.setLayoutParams(c018905p);
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        c29324Bf6 = new C29324Bf6(itemView2);
        c29324Bf6.LIZ(cqq, model);
        dataChannel = cqq.LJIIIIZZ;
        if (dataChannel == null) {
        }
        z = false;
        ViewGroup.LayoutParams layoutParams2 = this.LJLJLLL.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p2 = (C018905p) layoutParams2;
        if (z) {
            f = 0.8f;
            c018905p2.matchConstraintPercentWidth = f;
            this.LJLJLLL.setLayoutParams(c018905p2);
        }
        f = 0.99f;
        c018905p2.matchConstraintPercentWidth = f;
        this.LJLJLLL.setLayoutParams(c018905p2);
    }
}
