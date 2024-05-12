package com.bytedance.android.livesdk.broadcast;

import X.ActivityC45651qj;
import X.B3E;
import X.BB9;
import X.BBA;
import X.BBB;
import X.BBC;
import X.BBD;
import X.BBP;
import X.BCR;
import X.BHA;
import X.BJO;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C29046Bac;
import X.C29049Baf;
import X.C29306Beo;
import X.C29S;
import X.C32537Cpp;
import X.C3C5;
import X.C51029K0z;
import X.C5H3;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.InterfaceC28236B6i;
import X.InterfaceC86147XrT;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class LiveBroadcastEndSafetyToolsFragment extends BaseFragment implements BBC, InterfaceC28236B6i {
    public InterfaceC86147XrT LJLIL;
    public DataChannel LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(BB9.LJLIL);
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(BBB.LJLIL);
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(BBA.LJLIL);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            ((C32537Cpp) LJIILIIL.gv0(BCR.class)).LIZ = Boolean.FALSE;
        }
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.InterfaceC28236B6i
    public final DataChannel provideDataChannel() {
        return this.LJLJJL;
    }

    public final CharSequence vl(int i) {
        String str;
        String string;
        String span1 = C15380j0.LJIILJJIL(R.string.mg1);
        if (i != 0) {
            str = C15380j0.LJIILJJIL(i);
        } else {
            str = null;
        }
        int i2 = 0;
        if (str == null) {
            string = C15380j0.LJIILL(R.string.kb4, span1);
        } else {
            string = C15380j0.LJIILL(R.string.kb4, span1, str);
        }
        SpannableString spannableString = new SpannableString(string);
        o.LJIIIIZZ(string, "string");
        o.LJIIIIZZ(span1, "span1");
        int LJJLIIIJL = s.LJJLIIIJL(string, span1, 0, false, 6);
        if (str != null) {
            i2 = s.LJJLIIIJL(string, str, 0, false, 6);
        }
        if (LJJLIIIJL >= 0) {
            C23010vJ.LIZJ(getContext(), spannableString, LJJLIIIJL, span1.length() + LJJLIIIJL, 33, 5, 600);
        }
        if (str != null && i2 >= 0) {
            C23010vJ.LIZJ(getContext(), spannableString, i2, str.length() + i2, 33, 5, 600);
        }
        return spannableString;
    }

    public final Fragment wl(BBP bbp) {
        int i = BBD.LIZ[bbp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return ((IModeratorService) CN1.LIZ(IModeratorService.class)).Z50();
                }
                return (Fragment) this.LJLJJI.getValue();
            }
            return (Fragment) this.LJLJI.getValue();
        }
        return (Fragment) this.LJLILLLLZI.getValue();
    }

    public final void xl(Fragment fragment) {
        CharSequence charSequence;
        View findViewById;
        TextView textView;
        View findViewById2;
        if (o.LJ(fragment, this.LJLILLLLZI.getValue())) {
            charSequence = vl(R.string.mgy);
        } else if (o.LJ(fragment, this.LJLJI.getValue())) {
            charSequence = vl(R.string.mf2);
        } else {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            View view = getView();
            if (view != null && (findViewById2 = view.findViewById(R.id.l8x)) != null) {
                C29306Beo.LJJLJLI(findViewById2);
            }
            View view2 = getView();
            if (view2 != null && (textView = (TextView) view2.findViewById(R.id.ktp)) != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        View view3 = getView();
        if (view3 == null || (findViewById = view3.findViewById(R.id.l8x)) == null) {
            return;
        }
        C29306Beo.LJI(findViewById);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            super.onViewCreated(r6, r7)
            android.os.Bundle r1 = r5.getArguments()
            r4 = 0
            if (r1 == 0) goto L34
            java.lang.String r0 = "scheme"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L34
            java.lang.String r0 = "page"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            if (r2 == 0) goto L34
            int r1 = r2.hashCode()
            r0 = -1252562792(0xffffffffb5576898, float:-8.0245945E-7)
            if (r1 == r0) goto L81
            r0 = -1172077849(0xffffffffba2382e7, float:-6.2374625E-4)
            if (r1 == r0) goto L78
            r0 = 1072421660(0x3febdb1c, float:1.8426242)
            if (r1 == r0) goto L68
        L34:
            X.1qj r0 = r5.mo49getActivity()
            if (r0 == 0) goto L3d
            r0.finish()
        L3d:
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L55
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = X.C51029K0z.LJIILIIL(r5)
            if (r3 == 0) goto L55
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel> r2 = com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel.class
            kotlin.jvm.internal.AqS171S0100000_5 r1 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 127(0x7f, float:1.78E-43)
            r1.<init>(r5, r0)
            r3.lv0(r5, r2, r1)
        L55:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = X.C51029K0z.LJIILIIL(r5)
            if (r2 == 0) goto L67
            java.lang.Class<X.BCR> r0 = X.BCR.class
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.Cps r0 = r2.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r1
        L67:
            return
        L68:
            java.lang.String r0 = "block_keywords"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L71
            goto L34
        L71:
            X.BBP r0 = X.BBP.BLOCK_KEYWORDS
            androidx.fragment.app.Fragment r3 = r5.wl(r0)
            goto L96
        L78:
            java.lang.String r0 = "add_moderator"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L90
            goto L34
        L81:
            java.lang.String r0 = "filter_comment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L34
            X.BBP r0 = X.BBP.FILTER_COMMENT
            androidx.fragment.app.Fragment r3 = r5.wl(r0)
            goto L96
        L90:
            X.BBP r0 = X.BBP.MANAGE_MODERATOR
            androidx.fragment.app.Fragment r3 = r5.wl(r0)
        L96:
            if (r3 != 0) goto L99
            goto L34
        L99:
            r5.xl(r3)
            androidx.fragment.app.FragmentManager r0 = r5.getChildFragmentManager()
            r0.getClass()
            X.1B3 r2 = new X.1B3
            r2.<init>(r0)
            r1 = 1
            r0 = 2131367371(0x7f0a15cb, float:1.8354662E38)
            r2.LJIIIIZZ(r0, r1, r3, r4)
            r2.LJI()
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.LiveBroadcastEndSafetyToolsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.B6s, O] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Long l;
        DataChannel dataChannel;
        o.LJIIIZ(inflater, "inflater");
        this.LJLJJL = BHA.LIZ(new ViewModelProvider(this), this);
        B3E b3e = new B3E();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29046Bac.class);
        b3e.LIZIZ = room;
        b3e.LIZ = "autosuggest";
        C29S c29s = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        b3e.LIZJ = l;
        ?? LIZ = b3e.LIZ();
        DataChannel dataChannel2 = this.LJLJJL;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BJO.class)).LIZ = LIZ;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29049Baf.class)).LIZ = LIZ;
        Room room2 = b3e.LIZIZ;
        if (room2 != null && (dataChannel = this.LJLJJL) != null) {
            dataChannel.rv0(RoomChannel.class, room2);
        }
        DataChannel dataChannel3 = this.LJLJJL;
        if (dataChannel3 != null) {
            dataChannel3.rv0(UserIsAnchorChannel.class, Boolean.TRUE);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d3f, viewGroup, false);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
