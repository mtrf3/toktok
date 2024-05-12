package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GKi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41340GKi extends AbstractC029409q<C41341GKj> {
    public final InterfaceC88471Ynr<Integer, Boolean, Object> LJLIL;
    public final List<PUgcSlotData> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C41340GKi(AqS189S0100000_7 aqS189S0100000_7) {
        this.LJLIL = aqS189S0100000_7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L15;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C41341GKj r8, int r9) {
        /*
            r7 = this;
            X.GKj r8 = (X.C41341GKj) r8
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData> r0 = r7.LJLILLLLZI
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r9)
            com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData r5 = (com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData) r5
            boolean r4 = r7.LJLJI
            boolean r3 = r7.LJLJJI
            java.lang.String r0 = "slot"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r8.LJLJJI = r4
            r8.LJLJJL = r5
            com.bytedance.tux.input.TuxTextView r1 = r8.LJLILLLLZI
            if (r1 != 0) goto Lc5
        L20:
            android.graphics.Bitmap r2 = r5.cover
            if (r2 == 0) goto L39
            boolean r0 = r2.isRecycled()
            if (r0 != 0) goto L35
            X.W5G r1 = r8.LJLIL
            if (r1 != 0) goto Lbe
        L2e:
            X.W5G r0 = r8.LJLIL
            if (r0 == 0) goto L35
            r0.setImageBitmap(r2)
        L35:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L4a
        L39:
            X.W5G r6 = r8.LJLIL
            boolean r0 = r5.isVideoType
            if (r0 != 0) goto L98
            if (r6 == 0) goto L4a
            java.lang.String r0 = r5.videoPath
            android.net.Uri r0 = X.C44694HgQ.LJIIIIZZ(r0)
            r6.setImageURI(r0)
        L4a:
            X.SJp r1 = r8.LJLJI
            boolean r0 = r5.isFixed
            r1.setChecked(r0)
            if (r3 != 0) goto L5f
            X.SJp r0 = r8.LJLJI
            r1 = 0
            r0.setEnabled(r1)
            android.view.View r0 = r8.itemView
            r0.setEnabled(r1)
        L5e:
            return
        L5f:
            X.SJp r0 = r8.LJLJI
            r2 = 1
            r0.setEnabled(r2)
            android.view.View r0 = r8.itemView
            r0.setEnabled(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L7e
            android.view.View r0 = r8.itemView
            r0.setEnabled(r2)
            X.SJp r0 = r8.LJLJI
            r0.setEnabled(r2)
            android.view.View r0 = r8.itemView
            r0.setAlpha(r1)
            goto L5e
        L7e:
            boolean r0 = r5.isFixed
            if (r0 == 0) goto L8f
            android.view.View r0 = r8.itemView
            r0.setAlpha(r1)
        L87:
            X.SJp r1 = r8.LJLJI
            boolean r0 = r5.isFixed
            r1.setEnabled(r0)
            goto L5e
        L8f:
            android.view.View r1 = r8.itemView
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r0)
            goto L87
        L98:
            X.GKl r0 = new X.GKl
            r0.<init>(r5, r8)
            X.SuF r1 = X.AbstractC73638SvC.LJI(r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sun r1 = r1.LJJIIJ(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsU r2 = r1.LJIJJ(r0)
            Y.AfS56S0200000_7 r1 = new Y.AfS56S0200000_7
            r0 = 12
            r1.<init>(r6, r5, r0)
            X.9Fd<T> r0 = new X.InterfaceC64592gB() { // from class: X.9Fd
                static {
                    /*
                        X.9Fd r0 = new X.9Fd
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9Fd<T>) X.9Fd.LJLIL X.9Fd
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C233699Fd.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C233699Fd.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C233699Fd.accept(java.lang.Object):void");
                }
            }
            r2.LJJII(r1, r0)
            goto L4a
        Lbe:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            goto L2e
        Lc5:
            float r0 = r5.extraDuration
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41340GKi.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C41341GKj com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c9c, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C41341GKj c41341GKj = new C41341GKj(itemView, this.LJLIL);
        C0AX.LIZ(viewGroup, c41341GKj.itemView, R.id.lj7);
        View view = c41341GKj.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c41341GKj.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41341GKj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c41341GKj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c41341GKj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41341GKj.class.getName();
        return c41341GKj;
    }
}
