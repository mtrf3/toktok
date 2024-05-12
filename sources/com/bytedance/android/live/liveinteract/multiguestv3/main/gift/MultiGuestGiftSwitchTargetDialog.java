package com.bytedance.android.live.liveinteract.multiguestv3.main.gift;

import X.AbstractC73672Svk;
import X.AbstractC74727TUl;
import X.C16880lQ;
import X.C32I;
import X.C62705OjF;
import X.C73318Sq2;
import X.C75428Tiy;
import X.C75432Tj2;
import X.C75433Tj3;
import X.C75559Tl5;
import X.CJ2;
import X.InterfaceC31805Ce1;
import X.InterfaceC75429Tiz;
import X.InterfaceC92693kP;
import X.ORZ;
import X.RunnableC31065CHd;
import X.TQ8;
import X.TV3;
import Y.ACListenerS33S0100000_13;
import Y.AfS57S0100000_5;
import Y.AfS65S0100000_13;
import Y.IDuS82S0200000_13;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestGiftSwitchTargetDialog extends LiveDialogFragment implements InterfaceC75429Tiz {
    public static User LJLJJL;
    public static boolean LJLJJLL;
    public static String LJLJL;
    public RunnableC31065CHd LJLIL;
    public C75428Tiy LJLILLLLZI;
    public C75433Tj3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

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

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            int r3 = X.B9K.LIZJ(r0)
            X.BGt r2 = new X.BGt
            r0 = 2131564007(0x7f0d15e7, float:1.8753487E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L4a
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L4a
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L46
        L24:
            r0 = 80
        L26:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L44
            r0 = -1
        L2f:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L34
            r3 = -1
        L34:
            r2.LJIIJ = r3
            if (r1 == 0) goto L3e
            r0 = 2131887533(0x7f1205ad, float:1.9409676E38)
            r2.LIZJ = r0
        L3d:
            return r2
        L3e:
            r0 = 2131887534(0x7f1205ae, float:1.9409678E38)
            r2.LIZJ = r0
            goto L3d
        L44:
            r0 = r3
            goto L2f
        L46:
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto L26
        L4a:
            r1 = 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL = null;
        C75428Tiy c75428Tiy = this.LJLILLLLZI;
        if (c75428Tiy != null) {
            c75428Tiy.LIZ();
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // X.InterfaceC75429Tiz
    public final void ve(List<LinkListUser> giftUserList) {
        o.LJIIIZ(giftUserList, "giftUserList");
        C75433Tj3 c75433Tj3 = new C75433Tj3(this, LJLJJL, giftUserList, this.dataChannel, LJLJJLL, LJLJL);
        c75433Tj3.LJLZ(LinkListUser.class, new C75432Tj2());
        this.LJLJI = c75433Tj3;
        CJ2 cj2 = new CJ2();
        cj2.addAll(giftUserList);
        C75433Tj3 c75433Tj32 = this.LJLJI;
        if (c75433Tj32 != null) {
            c75433Tj32.LJLIL = cj2;
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLIL;
        if (runnableC31065CHd != null) {
            getContext();
            runnableC31065CHd.setLayoutManager(new GridLayoutManager(3));
        }
        RunnableC31065CHd runnableC31065CHd2 = this.LJLIL;
        if (runnableC31065CHd2 == null) {
            return;
        }
        runnableC31065CHd2.setAdapter(this.LJLJI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC74727TUl LIZ;
        List LJJI;
        AbstractC74727TUl LIZ2;
        List<LinkPlayerInfo> LJJI2;
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 24), view.findViewById(R.id.liz));
        this.LJLIL = (RunnableC31065CHd) view.findViewById(R.id.j_3);
        C75428Tiy c75428Tiy = new C75428Tiy();
        if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJI2 = LIZ2.LJJI()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJI2, 10));
                for (LinkPlayerInfo linkPlayerInfo : LJJI2) {
                    LinkListUser linkListUser = new LinkListUser();
                    linkListUser.user = linkPlayerInfo.mUser;
                    linkListUser.fanTicket = linkPlayerInfo.mFanTicket;
                    String str = linkPlayerInfo.mInteractIdStr;
                    o.LJIIIIZZ(str, "it.interactId");
                    linkListUser.linkMicId = str;
                    arrayList.add(linkListUser);
                }
                LJJI = ORZ.LLJILJILJ(arrayList);
            }
            LJJI = null;
        } else {
            TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (tq8 != null && (LIZ = tq8.LIZ()) != null) {
                LJJI = LIZ.LJJI();
            }
            LJJI = null;
        }
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJIIJ(new IDuS82S0200000_13(c75428Tiy, LJJI, 0)).LJII(new C62705OjF()).LJJJLIIL(new AfS65S0100000_13(this, 14), new AfS57S0100000_5(c75428Tiy, 21));
        C73318Sq2 compositeDisposable = c75428Tiy.LIZ;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJLIIL);
        this.LJLILLLLZI = c75428Tiy;
    }
}
