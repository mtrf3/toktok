package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S42 extends AbstractC029409q<S44> {
    public final FavoriteVideoPickerViewModel LJLIL;
    public List<? extends Aweme> LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public S42(FavoriteVideoPickerViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = C61878OQg.INSTANCE;
        this.LJLJI = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.S44 r9, int r10) {
        /*
            r8 = this;
            X.S44 r9 = (X.S44) r9
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r8.LJLILLLLZI
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            int r0 = r8.LJLJI
            r5 = 0
            if (r10 != r0) goto Ld4
            r6 = 1
        L15:
            X.S43 r1 = new X.S43
            r1.<init>(r8, r4)
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r9.LJLIL = r1
            android.view.View r1 = r9.itemView
            r0 = 2131365045(0x7f0a0cb5, float:1.8349944E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "itemView.findViewById(R.id.cover)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.lighten.loader.SmartImageView r1 = (com.bytedance.lighten.loader.SmartImageView) r1
            r9.LJLILLLLZI = r1
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            r3 = 0
            java.lang.String r7 = "coverView"
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r0)
            X.W5F r1 = X.W5U.LJII(r0)
            r0 = 200(0xc8, float:2.8E-43)
            int[] r0 = X.J7H.LIZ(r0)
            if (r0 == 0) goto L55
            r1.LJIILIIL(r0)
        L55:
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Le7
            r1.LJJIIJ = r0
            java.lang.String r0 = "VideoViewHolder - Cover"
            r1.LIZIZ(r0)
            X.C16880lQ.LLJJJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L6e
        L67:
            com.bytedance.lighten.loader.SmartImageView r0 = r9.LJLILLLLZI
            if (r0 == 0) goto Le3
            r0.setImageDrawable(r3)
        L6e:
            com.bytedance.lighten.loader.SmartImageView r2 = r9.LJLILLLLZI
            if (r2 == 0) goto Ldf
            Y.ACListenerS32S0100000_12 r1 = new Y.ACListenerS32S0100000_12
            r0 = 192(0xc0, float:2.69E-43)
            r1.<init>(r9, r0)
            X.C16880lQ.LJJIJLIJ(r2, r1)
            r9.L(r6)
            boolean r0 = r4.canShare()
            java.lang.String r2 = "radioButton"
            if (r0 != 0) goto Lcc
            X.Ooi r1 = r9.LJLJI
            if (r1 == 0) goto Ld7
            r0 = 8
            r1.setVisibility(r0)
        L90:
            android.view.View r1 = r9.itemView
            r0 = 2131380145(0x7f0a47b1, float:1.838057E38)
            android.view.View r3 = r1.findViewById(r0)
            com.bytedance.lighten.loader.SmartImageView r3 = (com.bytedance.lighten.loader.SmartImageView) r3
            android.view.View r1 = r9.itemView
            r0 = 2131380212(0x7f0a47f4, float:1.8380707E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.getAuthor()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r0)
            X.W5F r1 = X.W5U.LJII(r0)
            r1.LJJIIJ = r3
            java.lang.String r0 = "VideoViewHolder - Avatar"
            r1.LIZIZ(r0)
            X.C16880lQ.LLJJJ(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.getAuthor()
            java.lang.String r0 = r0.getUniqueId()
            r2.setText(r0)
            return
        Lcc:
            X.Ooi r0 = r9.LJLJI
            if (r0 == 0) goto Ldb
            r0.setVisibility(r5)
            goto L90
        Ld4:
            r6 = 0
            goto L15
        Ld7:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        Ldb:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r3
        Ldf:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        Le3:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        Le7:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S42.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final S44 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        S44 s44 = new S44(C1FL.LIZIZ(parent, R.layout.b91, parent, false, "from(parent.context)\n   …ideo_item, parent, false)"));
        C0AX.LIZ(parent, s44.itemView, R.id.lj7);
        View view = s44.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (s44.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(S44.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) s44.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(s44.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = S44.class.getName();
        return s44;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(S44 s44, int i, List payloads) {
        S44 holder = s44;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        holder.L(((Boolean) obj).booleanValue());
    }
}
