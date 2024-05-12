package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.BZI;
import X.C15380j0;
import X.C15540jG;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29044Baa;
import X.C2A7;
import X.C47061t0;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CppUnlockGuideDialogV2 extends LiveDialogFragment {
    public InterfaceC88472Yns<? super BZI, BZI> LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLIL = "this feature";
    public boolean LJLJI = true;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        C28507BGt c28507BGt = new C28507BGt(R.layout.cw6);
        if (this.LJLJI) {
            i = R.style.aba;
        } else {
            i = R.style.ab_;
        }
        c28507BGt.LIZJ = i;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(C15380j0.LJIILL(R.string.jyr, this.LJLIL));
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 100), view.findViewById(R.id.nb4));
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.ayy), new ACListenerS25S0100000_5(this, 101));
        C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.c_b);
        TextView textView = (TextView) view.findViewById(R.id.l3j);
        String str = this.LJLIL;
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.mp9))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz_));
            }
            vl(c47061t0, "ttlive_cpp_voice_effect_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.nnc))) {
            TextView textView2 = (TextView) view.findViewById(R.id.title);
            if (textView2 != null) {
                textView2.setText(C15380j0.LJIILL(R.string.jyr, C15380j0.LJIILJJIL(R.string.njs)));
            }
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz1));
            }
            vl(c47061t0, "ttlive_cpp_comment_pin_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.o5f))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz6));
            }
            vl(c47061t0, "ttlive_cpp_star_comment_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.oqh))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz9));
            }
            vl(c47061t0, "ttlive_cpp_treasure_box_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.lrt))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jyz));
            }
            vl(c47061t0, "ttlive_cpp_goody_bag_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.mri))) {
            TextView textView3 = (TextView) view.findViewById(R.id.title);
            if (textView3 != null) {
                textView3.setText(C15380j0.LJIILL(R.string.jyr, C15380j0.LJIILJJIL(R.string.njr)));
            }
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz0));
            }
            vl(c47061t0, "ttlive_cpp_multi_guest_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.mrb))) {
            TextView textView4 = (TextView) view.findViewById(R.id.title);
            if (textView4 != null) {
                textView4.setText(C15380j0.LJIILL(R.string.jyr, C15380j0.LJIILJJIL(R.string.njn)));
            }
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jyv));
            }
            vl(c47061t0, "ttlive_cpp_co_host_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.kst))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jyw));
            }
            vl(c47061t0, "ttlive_cpp_draw_guess_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.kpw))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz2));
            }
            vl(c47061t0, "ttlive_cpp_text_poll_rsc.webp", "tiktok_live_broadcast_demand_3");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.lr6))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jyy));
            }
            vl(c47061t0, "ttlive_cpp_stream_goal_rsc.webp", "tiktok_live_broadcast_demand_4");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.ns1))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz2));
            }
            vl(c47061t0, "ttlive_cpp_quick_poll_rsc.webp", "tiktok_live_broadcast_demand_4");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.m9k))) {
            TextView textView5 = (TextView) view.findViewById(R.id.title);
            if (textView5 != null) {
                textView5.setText(C15380j0.LJIILL(R.string.jyr, C15380j0.LJIILJJIL(R.string.jza)));
            }
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jyu));
            }
            vl(c47061t0, "ttlive_cpp_background_rsc.webp", "tiktok_live_broadcast_demand_4");
            return;
        }
        if (o.LJ(str, C15380j0.LJIILJJIL(R.string.njv))) {
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.jz4));
            }
            vl(c47061t0, "ttlive_cpp_promote_rsc.webp", "tiktok_live_broadcast_demand_4");
        } else {
            if (textView != null) {
                textView.setText("");
            }
            vl(c47061t0, "", "tiktok_live_broadcast_demand_4");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        Long l;
        Long l2;
        LiveMode streamType;
        o.LJIIIZ(manager, "manager");
        super.show(manager, str);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room3 != null && (streamType = room3.getStreamType()) != null) {
            str2 = streamType.logStreamingType;
        }
        InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_cpp_gray_out_pop_up_show");
            LIZ.LJIJJ(l, "anchor_id");
            LIZ.LJIJJ(l2, "room_id");
            LIZ.LJIJJ(str2, "live_type");
            BZI invoke = interfaceC88472Yns.invoke(LIZ);
            if (invoke != null) {
                invoke.LJJIIJZLJL();
            }
        }
    }

    public static void vl(C47061t0 c47061t0, String str, String str2) {
        C15540jG c15540jG = new C15540jG();
        if (c47061t0 != null) {
            c15540jG.LIZJ = str;
            c15540jG.LIZ = c47061t0;
            c15540jG.LIZIZ = str2;
            c15540jG.LJI = 1;
            c15540jG.LJFF = true;
            c15540jG.LIZIZ();
        }
        c15540jG.LJ();
    }
}
