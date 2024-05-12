package X;

import Y.ACListenerS22S0101000_3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88593dn extends AbstractC029409q<C88603do> {
    public final ViewGroup LJLIL;
    public final Context LJLILLLLZI;
    public final View.OnClickListener LJLJI;
    public final boolean LJLJJI;
    public ArrayList<CommentGiftStruct> LJLJJL;
    public final LayoutInflater LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C88603do c88603do, int i) {
        C88603do holder = c88603do;
        o.LJIIIZ(holder, "holder");
        CommentGiftStruct commentGiftStruct = (CommentGiftStruct) ListProtector.get(this.LJLJJL, i);
        SmartImageView smartImageView = (SmartImageView) holder.LJLIL.findViewById(R.id.lex);
        if (commentGiftStruct != null && smartImageView != null) {
            C16880lQ.LJJIJLIJ(smartImageView, holder.LJLJI);
            if (holder.LJLJJI) {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                layoutParams.width = C7MY.LIZIZ(48);
                layoutParams.height = C7MY.LIZIZ(36);
                smartImageView.setPadding(C7MY.LIZIZ(10), C7MY.LIZIZ(4), C7MY.LIZIZ(10), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(6);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cu);
                smartImageView.setBackground(c110614Vt.LIZ(holder.LJLILLLLZI));
                holder.LJLIL.setPadding(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), 0);
            }
            UrlModel image = commentGiftStruct.getImage();
            if (image != null && image.getUrlList() != null) {
                UrlModel image2 = commentGiftStruct.getImage();
                o.LJI(image2);
                o.LJI(image2.getUrlList());
                if (!r0.isEmpty()) {
                    smartImageView.setVisibility(0);
                    W5F LJII = W5U.LJII(C78939UyV.LJ(commentGiftStruct.getImage()));
                    LJII.LJJIIJ = smartImageView;
                    LJII.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                    C16880lQ.LLJJJ(LJII);
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C88603do com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup vg, int i) {
        o.LJIIIZ(vg, "vg");
        View view = C16880lQ.LLLLIILL(this.LJLJJLL, R.layout.ra, this.LJLIL, false);
        o.LJIIIIZZ(view, "view");
        C88603do c88603do = new C88603do(view, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        C0AX.LIZ(vg, c88603do.itemView, R.id.lj7);
        View view2 = c88603do.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(vg));
        }
        try {
            if (c88603do.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C88603do.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(vg.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c88603do.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c88603do.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C88603do.class.getName();
        return c88603do;
    }

    public C88593dn(ViewGroup parent, Context context, ACListenerS22S0101000_3 aCListenerS22S0101000_3, boolean z) {
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent;
        this.LJLILLLLZI = context;
        this.LJLJI = aCListenerS22S0101000_3;
        this.LJLJJI = z;
        this.LJLJJL = new ArrayList<>();
        this.LJLJJLL = C16880lQ.LLZIL(context);
    }
}
