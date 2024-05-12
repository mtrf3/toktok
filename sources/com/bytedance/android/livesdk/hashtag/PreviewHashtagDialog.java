package com.bytedance.android.livesdk.hashtag;

import X.BHZ;
import X.C259710f;
import X.C28507BGt;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC14450hV;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewHashtagDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public BHZ LJLJI;
    public InterfaceC14450hV LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public LiveMode LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 213));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 214));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.czu);
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJJI = 73;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    public final GameCategoryListFragment vl() {
        return (GameCategoryListFragment) this.LJLIL.getValue();
    }

    public final PreviewHashtagListFragment wl() {
        return (PreviewHashtagListFragment) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC12810er
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        InterfaceC14450hV interfaceC14450hV = this.LJLJJI;
        if (interfaceC14450hV != null) {
            interfaceC14450hV.LIZ(wl().LJLILLLLZI, vl().LJLJI);
        }
        super.onDismiss(dialog);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r2.LIZJ()) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (wl().LJLILLLLZI != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (vl().LJLJI != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        r1 = wl();
        r0 = getChildFragmentManager();
        r2 = X.C1B6.LIZ(r0, r0);
        r2.LJIIIIZZ(com.zhiliaoapp.musically.R.id.xl, 1, wl(), null);
        r2.LJIILJJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        r0 = getChildFragmentManager();
        r2 = X.C1B6.LIZ(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (wl().LJLILLLLZI == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r5 = wl();
        r2.LIZIZ(com.zhiliaoapp.musically.R.id.xl, wl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (vl().LJLJI == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        r1 = vl();
        r2.LIZIZ(com.zhiliaoapp.musically.R.id.xl, vl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        r2.LJIILJJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6.LJLJJLL, "inapp") != false) goto L22;
     */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.onViewCreated(r7, r8)
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r1 = r6.wl()
            r0 = 0
            r1.setUserVisibleHint(r0)
            int r0 = r6.LJLJJL
            r4 = 2131362312(0x7f0a0208, float:1.8344401E38)
            r5 = 0
            r3 = 1
            if (r0 == r3) goto L59
            X.J0d<java.lang.Long> r2 = X.InterfaceC30442Bx8.W0
            java.lang.Object r1 = r2.LIZJ()
            X.BHZ r0 = r6.LJLJI
            if (r0 == 0) goto Le2
            com.bytedance.android.livesdk.model.Hashtag r0 = r0.getHashtag()
            if (r0 == 0) goto Le2
            java.lang.Long r0 = r0.id
        L2b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4f
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto Ldf
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto Ldf
            com.bytedance.android.livesdk.model.Hashtag r0 = r0.hashtag
            if (r0 == 0) goto Ldf
            java.lang.Long r1 = r0.id
        L45:
            java.lang.Object r0 = r2.LIZJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L84
        L4f:
            java.lang.String r1 = r6.LJLJJLL
            java.lang.String r0 = "inapp"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L84
        L59:
            com.bytedance.android.livesdk.game.GameCategoryListFragment r1 = r6.vl()
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            X.1B3 r2 = X.C1B6.LIZ(r0, r0)
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = r6.vl()
            r2.LJIIIIZZ(r4, r3, r0, r5)
            r2.LJIILJJIL()
        L6f:
            if (r1 != 0) goto L80
        L71:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r6.dataChannel
            if (r2 == 0) goto L7f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagDialogPageChannel> r1 = com.bytedance.android.livesdk.dataChannel.HashtagDialogPageChannel.class
            X.BHu r0 = new X.BHu
            r0.<init>(r6)
            r2.lv0(r6, r1, r0)
        L7f:
            return
        L80:
            r1.setUserVisibleHint(r3)
            goto L71
        L84:
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r0 = r6.wl()
            com.bytedance.android.livesdk.model.Hashtag r0 = r0.LJLILLLLZI
            if (r0 != 0) goto Lab
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = r6.vl()
            com.bytedance.android.livesdk.model.GameTag r0 = r0.LJLJI
            if (r0 != 0) goto Lab
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r1 = r6.wl()
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            X.1B3 r2 = X.C1B6.LIZ(r0, r0)
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r0 = r6.wl()
            r2.LJIIIIZZ(r4, r3, r0, r5)
            r2.LJIILJJIL()
            goto L6f
        Lab:
            androidx.fragment.app.FragmentManager r0 = r6.getChildFragmentManager()
            X.1B3 r2 = X.C1B6.LIZ(r0, r0)
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r0 = r6.wl()
            com.bytedance.android.livesdk.model.Hashtag r0 = r0.LJLILLLLZI
            if (r0 == 0) goto Lc6
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r5 = r6.wl()
            com.bytedance.android.livesdk.hashtag.PreviewHashtagListFragment r0 = r6.wl()
            r2.LIZIZ(r4, r0)
        Lc6:
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = r6.vl()
            com.bytedance.android.livesdk.model.GameTag r0 = r0.LJLJI
            if (r0 == 0) goto Ldd
            com.bytedance.android.livesdk.game.GameCategoryListFragment r1 = r6.vl()
            com.bytedance.android.livesdk.game.GameCategoryListFragment r0 = r6.vl()
            r2.LIZIZ(r4, r0)
        Ld9:
            r2.LJIILJJIL()
            goto L6f
        Ldd:
            r1 = r5
            goto Ld9
        Ldf:
            r1 = r5
            goto L45
        Le2:
            r0 = r5
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
