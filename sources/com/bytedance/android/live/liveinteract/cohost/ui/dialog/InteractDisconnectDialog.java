package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import X.B5G;
import X.C16880lQ;
import X.C28507BGt;
import X.C2A7;
import X.C75017TcL;
import X.C75457TjR;
import X.C75832TpU;
import X.C76265TwT;
import X.C76280Twi;
import X.C76800UCe;
import X.EnumC75614Tly;
import X.EnumC76178Tv4;
import X.InterfaceC65784Pro;
import Y.ACListenerS33S0100000_13;
import Y.IDCListenerS209S0100000_13;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InteractDisconnectDialog extends LiveDialogFragment {
    public String LJLIL;
    public String LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d3c);
        c28507BGt.LIZJ = R.style.aai;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        EnumC76178Tv4 LJ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(R.id.mo6)).setText(this.LJLIL);
        ((TextView) _$_findCachedViewById(R.id.m4u)).setText(this.LJLILLLLZI);
        boolean z2 = false;
        if (B5G.LIZIZ().LJIIJ.getType() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && this.LJLJI == 1) {
            _$_findCachedViewById(R.id.nar).setVisibility(0);
            _$_findCachedViewById(R.id.b7g).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.nar).setVisibility(8);
            _$_findCachedViewById(R.id.b7g).setVisibility(8);
        }
        ((C2A7) _$_findCachedViewById(R.id.gyj)).setText(this.LJLJJL);
        ((C2A7) _$_findCachedViewById(R.id.hy_)).setText(this.LJLJJI);
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.gyj), new ACListenerS33S0100000_13(this, 17));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.hy_), new ACListenerS33S0100000_13(this, 18));
        ((CompoundButton) view.findViewById(R.id.b7g)).setOnCheckedChangeListener(new IDCListenerS209S0100000_13(this, 0));
        HashMap hashMap = new HashMap();
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.FOLLOW_INVITE) {
            str = "mutual_follow";
        } else {
            str = "recommend";
        }
        hashMap.put("invitee_list", str);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJ() != EnumC76178Tv4.NORMAL) {
            z2 = true;
        }
        if (!z2) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        C75017TcL.LJJIFFI("cancel_connection_popup", hashMap);
        int i = this.LJLJI;
        if (i == 3 || i == 2) {
            if (this.LJLJJLL) {
                LJ = C76265TwT.LIZIZ.LJ();
            } else {
                LJ = c76280Twi.LJ();
            }
            if (LJ == EnumC76178Tv4.INVITED) {
                boolean z3 = this.LJLJJLL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C75457TjR.LIZIZ(linkedHashMap, z3);
                C75457TjR.LIZLLL(linkedHashMap);
                if (!TextUtils.isEmpty(B5G.LIZIZ().LJJJJL)) {
                    String str2 = B5G.LIZIZ().LJJJJL;
                    o.LJI(str2);
                    linkedHashMap.put("request_from", str2);
                }
                C75457TjR.LIZ(linkedHashMap);
                C75832TpU.LJI(linkedHashMap, z3);
                C75457TjR.LJJI("livesdk_pk_invite_withdraw_page_show", linkedHashMap);
            }
        }
    }
}
