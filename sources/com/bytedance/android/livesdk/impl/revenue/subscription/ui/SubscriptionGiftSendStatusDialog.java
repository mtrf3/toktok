package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.BZI;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C41081jM;
import X.C47121t6;
import X.InterfaceC88472Yns;
import Y.ACListenerS33S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SubscriptionGiftSendStatusDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLL = 0;
    public C47121t6 LJLIL;
    public C2A7 LJLILLLLZI;
    public C2A7 LJLJI;
    public C47121t6 LJLJJI;
    public C41081jM LJLJJL;
    public boolean LJLJJLL;
    public Integer LJLJL;
    public long LJLL;
    public InterfaceC88472Yns<? super BZI, BZI> LJLLI;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public String LJLJLJ = "";
    public String LJLJLLL = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d16);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        Long l2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = (C41081jM) view.findViewById(R.id.c_b);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.title);
        this.LJLIL = (C47121t6) view.findViewById(R.id.c_7);
        this.LJLJI = (C2A7) view.findViewById(R.id.h_x);
        this.LJLILLLLZI = (C2A7) view.findViewById(R.id.h3n);
        C2A7 c2a7 = this.LJLJI;
        if (c2a7 != null) {
            c2a7.setRadius(C15380j0.LIZ(8.0f));
        }
        C2A7 c2a72 = this.LJLILLLLZI;
        if (c2a72 != null) {
            c2a72.setRadius(C15380j0.LIZ(8.0f));
        }
        Long l3 = null;
        if (this.LJLJJLL) {
            C15490jB.LIZJ(this.LJLJJL, C15510jD.LJIIIZ("tiktok_live_broadcast_normal_1", "ttlive_gift_sub_sent_success.png"));
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.lpg));
            }
            C47121t6 c47121t62 = this.LJLIL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.lpf));
            }
            C2A7 c2a73 = this.LJLJI;
            if (c2a73 != null) {
                c2a73.setText(C15380j0.LJIILJJIL(R.string.lpe));
                C16880lQ.LJJIII(c2a73, new ACListenerS33S0100000_13(this, 82));
            }
            C29306Beo.LJI(this.LJLILLLLZI);
            InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns = this.LJLLI;
            if (interfaceC88472Yns != null) {
                BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_send_successfully");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(this.LJLJLLL, "room_id");
                LIZ.LJIJJ(String.valueOf(this.LJLL), "send_quantity");
                AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.dataChannel);
                if (LJJIJLIJ != null) {
                    l2 = Long.valueOf(LJJIJLIJ.getOwnerUserId());
                } else {
                    l2 = null;
                }
                LIZ.LJJI(String.valueOf(l2), "anchor_id", aqS163S0100000_13);
                AqS163S0100000_13 aqS163S0100000_132 = new AqS163S0100000_13(this, 395);
                Room LJJIJLIJ2 = C29306Beo.LJJIJLIJ(this.dataChannel);
                if (LJJIJLIJ2 != null) {
                    l3 = Long.valueOf(LJJIJLIJ2.getOwnerUserId());
                }
                LIZ.LJJI(String.valueOf(l3), "for_anchor_id", aqS163S0100000_132);
                BZI invoke = interfaceC88472Yns.invoke(LIZ);
                if (invoke != null) {
                    invoke.LJJIIJZLJL();
                    return;
                }
                return;
            }
            return;
        }
        C15490jB.LIZJ(this.LJLJJL, C15510jD.LJIIIZ("tiktok_live_broadcast_normal_1", "ttlive_gift_sub_sent_fail.png"));
        C47121t6 c47121t63 = this.LJLJJI;
        if (c47121t63 != null) {
            c47121t63.setText(C15380j0.LJIILJJIL(R.string.loy));
        }
        C47121t6 c47121t64 = this.LJLIL;
        if (c47121t64 != null) {
            c47121t64.setText(C15380j0.LJIILJJIL(R.string.lox));
        }
        C2A7 c2a74 = this.LJLJI;
        if (c2a74 != null) {
            c2a74.setText(C15380j0.LJIILJJIL(R.string.lp0));
            C16880lQ.LJJIII(c2a74, new ACListenerS33S0100000_13(this, 83));
        }
        C2A7 c2a75 = this.LJLILLLLZI;
        if (c2a75 != null) {
            C29306Beo.LJJLJLI(c2a75);
            C16880lQ.LJJIII(c2a75, new ACListenerS33S0100000_13(this, 84));
        }
        InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns2 = this.LJLLI;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_gift_sub_send_failed");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(this.LJLJLLL, "room_id");
        LIZ2.LJIJJ(String.valueOf(this.LJLL), "send_quantity");
        AqS163S0100000_13 aqS163S0100000_133 = new AqS163S0100000_13(this, 396);
        Room LJJIJLIJ3 = C29306Beo.LJJIJLIJ(this.dataChannel);
        if (LJJIJLIJ3 != null) {
            l = Long.valueOf(LJJIJLIJ3.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJJI(String.valueOf(l), "anchor_id", aqS163S0100000_133);
        AqS163S0100000_13 aqS163S0100000_134 = new AqS163S0100000_13(this, 397);
        Room LJJIJLIJ4 = C29306Beo.LJJIJLIJ(this.dataChannel);
        if (LJJIJLIJ4 != null) {
            l3 = Long.valueOf(LJJIJLIJ4.getOwnerUserId());
        }
        LIZ2.LJJI(String.valueOf(l3), "for_anchor_id", aqS163S0100000_134);
        LIZ2.LJIJJ(this.LJLJL, "failed_reason");
        BZI invoke2 = interfaceC88472Yns2.invoke(LIZ2);
        if (invoke2 == null) {
            return;
        }
        invoke2.LJJIIJZLJL();
    }
}
