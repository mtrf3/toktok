package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.experiment.LibraryCategory;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.S3u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71486S3u extends AbstractC029409q<C71487S3v> {
    public final LibraryCategory[] LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC88471Ynr<View, Integer, C76800UCe> LJLJI;
    public int LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.length;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C71487S3v c71487S3v, int i) {
        boolean z;
        float f;
        C71487S3v holder = c71487S3v;
        o.LJIIIZ(holder, "holder");
        LibraryCategory[] libraryCategoryArr = this.LJLIL;
        if (libraryCategoryArr.length <= i) {
            return;
        }
        LibraryCategory libraryCategory = libraryCategoryArr[i];
        boolean z2 = this.LJLILLLLZI;
        if (libraryCategory == null) {
            return;
        }
        C71486S3u c71486S3u = holder.LJLL;
        if (C78685UuP.LJJJZ(libraryCategory.getImage())) {
            W5F LJFF = W5U.LJFF(UriProtector.parse(libraryCategory.getImage()));
            LJFF.LJJIIJ = holder.LJLJL;
            LJFF.LIZLLL(new C71485S3t(holder, libraryCategory));
            SmartImageView smartImageView = holder.LJLJL;
            if (!C90193gN.LIZ()) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            smartImageView.setScaleX(f);
        }
        if (z2) {
            int i2 = c71486S3u.LJLJJI;
            int i3 = 0;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            View view = holder.LJLJLLL;
            if (!z) {
                i3 = 4;
            }
            view.setVisibility(i3);
            holder.LJLJJLL.setMaxHeight(holder.LJLILLLLZI);
            holder.LJLJJLL.setMaxWidth(holder.LJLJI);
            return;
        }
        holder.LJLJLLL.setVisibility(8);
        holder.LJLJJLL.setMaxHeight(holder.LJLJJI);
        holder.LJLJJLL.setMaxWidth(holder.LJLJJL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C71487S3v com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cdg, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C71487S3v c71487S3v = new C71487S3v(this, itemView, this.LJLJI);
        C0AX.LIZ(viewGroup, c71487S3v.itemView, R.id.lj7);
        View view = c71487S3v.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c71487S3v.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71487S3v.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c71487S3v.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c71487S3v.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71487S3v.class.getName();
        return c71487S3v;
    }

    public C71486S3u(LibraryCategory[] categories, boolean z, AqS194S0100000_12 aqS194S0100000_12) {
        o.LJIIIZ(categories, "categories");
        this.LJLIL = categories;
        this.LJLILLLLZI = z;
        this.LJLJI = aqS194S0100000_12;
    }
}
