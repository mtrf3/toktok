package com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow;

import X.C16880lQ;
import X.C29306Beo;
import X.C41081jM;
import X.C73318Sq2;
import X.C73671Svj;
import X.C73969T1h;
import X.C78999UzT;
import X.CVT;
import X.Q7L;
import X.RunnableC31065CHd;
import X.T16;
import X.TV3;
import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import Y.AfS7S2000000_13;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankParams;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveShowLeaveRankDialog extends LiveDialogFragment implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public CVT LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public RunnableC31065CHd LJLJJI;
    public C41081jM LJLJJL;
    public LifecycleOwner LJLJL;
    public Long LJLJLJ;
    public Long LJLJLLL;
    public Long LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C73318Sq2 LJLJJLL = new C73318Sq2();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    public final void vl() {
        Long l = this.LJLJLJ;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.LJLJLLL;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                Long l3 = this.LJLL;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    CVT cvt = this.LJLIL;
                    if (cvt != null) {
                        C29306Beo.LJJLIIIJJI(cvt, true);
                    }
                    RunnableC31065CHd runnableC31065CHd = this.LJLJJI;
                    if (runnableC31065CHd != null) {
                        C29306Beo.LJJLIIIJJI(runnableC31065CHd, false);
                    }
                    View view = this.LJLILLLLZI;
                    if (view != null) {
                        C29306Beo.LJJLIIIJJI(view, false);
                    }
                    View view2 = this.LJLJI;
                    if (view2 != null) {
                        C29306Beo.LJJLIIIJJI(view2, false);
                    }
                    GetShowRankParams getShowRankParams = new GetShowRankParams();
                    getShowRankParams.roomId = longValue;
                    getShowRankParams.channelId = longValue2;
                    getShowRankParams.showId = longValue3;
                    C78999UzT.LJFF(new C73671Svj(((ILiveShowApi) Q7L.LIZIZ(ILiveShowApi.class)).getShowRank(getShowRankParams).LJIILIIL(new AfS7S2000000_13(1)).LJIIJ(new AfS7S2000000_13(2)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIILIIL(new AfS65S0100000_13(this, 27)).LJIIJ(new AfS65S0100000_13(this, 28))).LJIIIIZZ().LJIIJJI(), this.LJLJJLL);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C28507BGt createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L4e
            int r3 = X.B9K.LIZJ(r0)
        La:
            X.BGt r2 = new X.BGt
            r0 = 2131564011(0x7f0d15eb, float:1.8753495E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L4c
            java.lang.Class<X.BCW> r0 = X.BCW.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L4c
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L48
        L26:
            r0 = 80
        L28:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L46
            r0 = -1
        L31:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L36
            r3 = -1
        L36:
            r2.LJIIJ = r3
            if (r1 == 0) goto L40
            r0 = 2131887533(0x7f1205ad, float:1.9409676E38)
            r2.LIZJ = r0
        L3f:
            return r2
        L40:
            r0 = 2131887534(0x7f1205ae, float:1.9409678E38)
            r2.LIZJ = r0
            goto L3f
        L46:
            r0 = r3
            goto L31
        L48:
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto L28
        L4c:
            r1 = 1
            goto L26
        L4e:
            r3 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog.createParams():X.BGt");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Lifecycle lifecycle;
        super.dismiss();
        LifecycleOwner lifecycleOwner = this.LJLJL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Lifecycle lifecycle;
        super.onDestroy();
        LifecycleOwner lifecycleOwner = this.LJLJL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onLifecycleOwnerDestroy() {
        TV3.LJIILJJIL(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLJJLL.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 27), view.findViewById(R.id.liz));
        this.LJLJJL = (C41081jM) view.findViewById(R.id.eca);
        this.LJLJJI = (RunnableC31065CHd) view.findViewById(R.id.j_2);
        this.LJLIL = (CVT) view.findViewById(R.id.g94);
        this.LJLILLLLZI = view.findViewById(R.id.cvv);
        View findViewById = view.findViewById(R.id.gyt);
        this.LJLJI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 28), findViewById);
        }
        C41081jM c41081jM = this.LJLJJL;
        if (c41081jM != null) {
            C16880lQ.LJJIIZI(c41081jM, new ACListenerS33S0100000_13(this, 29));
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLJJI;
        if (runnableC31065CHd != null) {
            if (getContext() == null) {
                return;
            } else {
                runnableC31065CHd.setLayoutManager(new LinearLayoutManager());
            }
        }
        vl();
    }
}
