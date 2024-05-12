package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.AbstractC029409q;
import X.BC6;
import X.C29306Beo;
import X.C72818Shy;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AnchorStarCommentManageDialog extends StarCommentManageDialog {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final BC6 LJLJJI = new BC6(this);

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.impl.revenue.starcomment.manage.DarkDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            C72818Shy.LJII("star_comment_setting_event", this.LJLJJI);
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void vl(boolean z) {
        AbstractC029409q adapter = ((RecyclerView) _$_findCachedViewById(R.id.isn)).getAdapter();
        if (adapter != null && adapter.getItemCount() == 0) {
            dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
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
            r0 = 2131375628(0x7f0a360c, float:1.837141E38)
            android.view.View r0 = r5._$_findCachedViewById(r0)
            r4 = 8
            r0.setVisibility(r4)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            r3 = 0
            if (r0 == 0) goto La1
            boolean r1 = X.C29306Beo.LJIIJ(r0)
            r0 = 1
            if (r1 != r0) goto La1
        L20:
            r2 = 2131375760(0x7f0a3690, float:1.8371677E38)
            r1 = 2131373927(0x7f0a2f67, float:1.836796E38)
            if (r0 == 0) goto L80
            android.view.View r0 = r5._$_findCachedViewById(r1)
            r0.setVisibility(r3)
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.CCJ.LIZ(r0)
            if (r0 != 0) goto L6f
            android.view.View r1 = r5._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131841037(0x7f11500d, float:1.931537E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            r1.setText(r0)
        L49:
            android.view.View r0 = r5._$_findCachedViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r3)
            android.view.View r3 = r5._$_findCachedViewById(r2)
            com.bytedance.android.live.design.view.icon.LiveIconView r3 = (com.bytedance.android.live.design.view.icon.LiveIconView) r3
            X.BCG r2 = new X.BCG
            Y.ACListenerS25S0100000_5 r1 = new Y.ACListenerS25S0100000_5
            r0 = 393(0x189, float:5.51E-43)
            r1.<init>(r5, r0)
            r2.<init>(r1)
            X.C16880lQ.LJJII(r3, r2)
            java.lang.String r1 = "star_comment_setting_event"
            X.BC6 r0 = r5.LJLJJI
            X.C72818Shy.LIZLLL(r1, r0)
        L6e:
            return
        L6f:
            android.view.View r1 = r5._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131841036(0x7f11500c, float:1.9315369E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            r1.setText(r0)
            goto L49
        L80:
            android.view.View r0 = r5._$_findCachedViewById(r1)
            r0.setVisibility(r4)
            android.view.View r0 = r5._$_findCachedViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r4)
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.dataChannel
            if (r3 == 0) goto L6e
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.CancelStarCommentAdministratorEvent> r2 = com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.CancelStarCommentAdministratorEvent.class
            kotlin.jvm.internal.AqS171S0100000_5 r1 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 800(0x320, float:1.121E-42)
            r1.<init>(r5, r0)
            r3.lv0(r5, r2, r1)
            goto L6e
        La1:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.manage.AnchorStarCommentManageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
