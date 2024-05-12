package X;

import Y.ACListenerS30S0300000_4;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Y7, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y7 extends AbstractC029409q<C9Y8> {
    public List<C237749Us> LJLIL = new ArrayList();
    public InterfaceC237779Uv LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C9Y8 c9y8, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        Video video;
        UrlModel originCover;
        C9Y8 holder = c9y8;
        o.LJIIIZ(holder, "holder");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            if (i == 0) {
                i2 = C7MY.LIZIZ(20);
            } else {
                i2 = 0;
            }
            marginLayoutParams.topMargin = i2;
        }
        C237749Us c237749Us = (C237749Us) ListProtector.get(this.LJLIL, i);
        holder.LJLIL.setText(c237749Us.LJLIL.getReturnedQuery());
        C16880lQ.LJJIZ(holder.LJLJI, new ACListenerS39S0200000_4(this, c237749Us, 95));
        C16880lQ.LJJIJLIJ(holder.LJLILLLLZI, new ACListenerS30S0300000_4(this, holder, c237749Us, 20));
        Aweme aweme = c237749Us.LJLIL.getAweme();
        if (aweme == null || (video = aweme.getVideo()) == null || (originCover = video.getOriginCover()) == null) {
            C17N.LJJIIJZLJL(holder.LJLILLLLZI);
        } else {
            C17N.LJJLIIIJJI(holder.LJLILLLLZI);
            W5F LJII = W5U.LJII(C78939UyV.LJ(originCover));
            LJII.LJJIIJ = holder.LJLILLLLZI;
            S3I s3i = new S3I();
            s3i.LIZLLL = C32151Nz.LJIIZILJ(Float.valueOf(4.0f));
            LJII.LJIJJLI = s3i.LIZ();
            C16880lQ.LLJJJ(LJII);
        }
        holder.LJLJI.setLoading(false);
        holder.LJLJI.setLoading(c237749Us.LJLILLLLZI);
        holder.LJLJI.setClickable(!c237749Us.LJLILLLLZI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C9Y8 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.ae0, viewGroup, false, "from(parent.context)\n   …tory_item, parent, false)");
        Context context = LIZ.getContext();
        C110614Vt c110614Vt = new C110614Vt();
        o.LJIIIIZZ(context, "context");
        c110614Vt.LIZ = C79045V0n.LJI(R.attr.cl, context);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(14.0f)));
        LIZ.setBackground(c110614Vt.LIZ(context));
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.c9);
        c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(4.0f)));
        ((SmartImageView) LIZ.findViewById(R.id.cover)).setPlaceholderImage(c110614Vt2.LIZ(context));
        C9Y8 c9y8 = new C9Y8(LIZ);
        C0AX.LIZ(viewGroup, c9y8.itemView, R.id.lj7);
        View view = c9y8.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c9y8.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C9Y8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c9y8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c9y8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C9Y8.class.getName();
        return c9y8;
    }
}
