package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cd1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31743Cd1 extends AbstractC029409q<C31747Cd5> {
    public final LiveDialogFragment LJLIL;
    public final EnumC30736C4m LJLILLLLZI;
    public final C31738Ccw LJLJI;
    public final List<InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m>> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final String LJLLLLLL(String str) {
        switch (str.hashCode()) {
            case -1949982086:
                if (str.equals("business_links")) {
                    Context context = this.LJLIL.getContext();
                    if (context != null) {
                        return context.getString(R.string.qhr);
                    }
                    return null;
                }
                return "";
            case -1925858825:
                if (str.equals("ec_shop")) {
                    Context context2 = this.LJLIL.getContext();
                    if (context2 != null) {
                        return context2.getString(R.string.qho);
                    }
                    return null;
                }
                return "";
            case -1732499337:
                if (str.equals("live_paid_series")) {
                    Context context3 = this.LJLIL.getContext();
                    if (context3 != null) {
                        return context3.getString(R.string.qhq);
                    }
                    return null;
                }
                return "";
            case 671572535:
                if (str.equals("game_partnership")) {
                    Context context4 = this.LJLIL.getContext();
                    if (context4 != null) {
                        return context4.getString(R.string.n5t);
                    }
                    return null;
                }
                return "";
            case 1224862632:
                if (str.equals("ba_leads_gen")) {
                    Context context5 = this.LJLIL.getContext();
                    if (context5 != null) {
                        return context5.getString(R.string.qhp);
                    }
                    return null;
                }
                return "";
            default:
                return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r5 != null) goto L29;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C31747Cd5 r7, int r8) {
        /*
            r6 = this;
            X.Cd5 r7 = (X.C31747Cd5) r7
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.util.List<X.CcU<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.C4m>> r0 = r6.LJLJJI
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            X.CcU r4 = (X.InterfaceC31710CcU) r4
            boolean r0 = r4 instanceof com.bytedance.android.live.slot.AbsSlotWidget
            r5 = 0
            if (r0 == 0) goto L1b
            r0 = r4
            com.bytedance.android.live.slot.AbsSlotWidget r0 = (com.bytedance.android.live.slot.AbsSlotWidget) r0
            if (r0 == 0) goto L1b
            androidx.lifecycle.ViewModel r5 = r0.LJLIL
        L1b:
            boolean r0 = r5 instanceof com.bytedance.android.live.slot.IIconSlot.SlotViewModel
            if (r0 == 0) goto La7
            com.bytedance.android.live.slot.IIconSlot$SlotViewModel r5 = (com.bytedance.android.live.slot.IIconSlot.SlotViewModel) r5
            if (r5 == 0) goto La7
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r5.LJLLILLLL
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L3d
            android.view.View r1 = r7.LJLIL
            r0 = 2131377827(0x7f0a3ea3, float:1.837587E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
        L3d:
            androidx.lifecycle.MutableLiveData<android.graphics.drawable.Drawable> r0 = r5.LJLJLLL
            if (r0 == 0) goto L57
            java.lang.Object r2 = r0.getValue()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r2 == 0) goto L57
            android.view.View r1 = r7.LJLIL
            r0 = 2131368281(0x7f0a1959, float:1.8356508E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
        L57:
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r5.LJLJJI
            if (r0 == 0) goto L66
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L66
            r7.L(r0)
        L66:
            java.lang.Boolean r1 = r5.LLIFFJFJJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lb4
            float r1 = r5.LLII
            android.view.View r0 = r7.LJLIL
            r0.setAlpha(r1)
        L77:
            androidx.lifecycle.MutableLiveData<java.lang.String> r3 = r5.LJLLILLLL
            if (r3 == 0) goto L87
            com.bytedance.android.livesdk.LiveDialogFragment r2 = r6.LJLIL
            Y.AObserverS73S0100000_5 r1 = new Y.AObserverS73S0100000_5
            r0 = 65
            r1.<init>(r7, r0)
            r3.observe(r2, r1)
        L87:
            androidx.lifecycle.MutableLiveData<android.graphics.drawable.Drawable> r3 = r5.LJLJLLL
            if (r3 == 0) goto L97
            com.bytedance.android.livesdk.LiveDialogFragment r2 = r6.LJLIL
            Y.AObserverS73S0100000_5 r1 = new Y.AObserverS73S0100000_5
            r0 = 66
            r1.<init>(r7, r0)
            r3.observe(r2, r1)
        L97:
            androidx.lifecycle.MutableLiveData<java.lang.String> r3 = r5.LJLJJI
            if (r3 == 0) goto La7
            com.bytedance.android.livesdk.LiveDialogFragment r2 = r6.LJLIL
            Y.AObserverS73S0100000_5 r1 = new Y.AObserverS73S0100000_5
            r0 = 67
            r1.<init>(r7, r0)
            r3.observe(r2, r1)
        La7:
            Y.ACListenerS40S0200000_5 r1 = new Y.ACListenerS40S0200000_5
            r0 = 91
            r1.<init>(r4, r6, r0)
            android.view.View r0 = r7.LJLIL
            X.C16880lQ.LJIIJ(r1, r0)
            return
        Lb4:
            if (r5 == 0) goto La7
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31743Cd1.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    public final C31747Cd5 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C31747Cd5 c31747Cd5 = new C31747Cd5(C1FL.LIZIZ(parent, R.layout.dik, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
        C0AX.LIZ(parent, c31747Cd5.itemView, R.id.lj7);
        View view = c31747Cd5.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c31747Cd5.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C31747Cd5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c31747Cd5.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c31747Cd5.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C31747Cd5.class.getName();
        return c31747Cd5;
    }

    public C31743Cd1(LiveDialogFragment dialog, EnumC30736C4m slotID, C31738Ccw eventTrackInfo) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(slotID, "slotID");
        o.LJIIIZ(eventTrackInfo, "eventTrackInfo");
        this.LJLIL = dialog;
        this.LJLILLLLZI = slotID;
        this.LJLJI = eventTrackInfo;
        this.LJLJJI = new ArrayList();
    }
}
