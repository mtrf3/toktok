package X;

import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment.PaidSeriesAddedListFragment;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class A5D extends AbstractC029409q<A5C> {
    public final A5F LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final LifecycleOwner LJLJJI;
    public final Context LJLJJL;
    public final List<CollectionDetailModel> LJLJJLL;
    public final java.util.Map<Long, C254739zB> LJLJL;
    public Long LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(A5C a5c, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        String str2;
        String str3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        List<String> urlList;
        A5C holder = a5c;
        o.LJIIIZ(holder, "holder");
        CollectionDetailModel series = (CollectionDetailModel) ListProtector.get(this.LJLJJLL, i);
        o.LJIIIZ(series, "series");
        UrlModel collectionCover = series.getCollectionCover();
        if (collectionCover == null || (urlList = collectionCover.getUrlList()) == null || (str = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = holder.LJLIL;
        C16880lQ.LLJJJ(LJIIIIZZ);
        holder.LJLILLLLZI.setText(series.getCollectionName());
        C254739zB c254739zB = (C254739zB) ((LinkedHashMap) holder.LJLLILLLL.LJLJL).get(Long.valueOf(series.getCollectionId()));
        TuxTextView tuxTextView = holder.LJLL;
        if (c254739zB != null && !c254739zB.LJFF && C78685UuP.LJJJZ(series.getVoucherTag())) {
            z = true;
        } else {
            z = false;
        }
        int i9 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        tuxTextView.setText(series.getVoucherTag());
        TuxTextView tuxTextView2 = holder.LJLJLLL;
        if (c254739zB != null && !c254739zB.LJFF && series.getDiscountedPriceInfo() != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextView2.setVisibility(i3);
        tuxTextView2.setPaintFlags(tuxTextView2.getPaintFlags() | 16);
        String str4 = null;
        if (c254739zB != null) {
            str2 = c254739zB.LIZJ;
        } else {
            str2 = null;
        }
        tuxTextView2.setText(str2);
        TuxTextView tuxTextView3 = holder.LJLJI;
        if (c254739zB != null) {
            str3 = c254739zB.LIZLLL;
        } else {
            str3 = null;
        }
        if (C78685UuP.LJJJZ(str3)) {
            if (c254739zB != null) {
                str4 = c254739zB.LIZLLL;
            }
        } else if (c254739zB != null) {
            str4 = c254739zB.LIZJ;
        }
        tuxTextView3.setText(str4);
        TuxTextView tuxTextView4 = holder.LJLJJI;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer LJI = C79045V0n.LJI(R.attr.gx, holder.LJLLILLLL.LJLJJL);
        if (LJI != null) {
            i4 = LJI.intValue();
        } else {
            i4 = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i4);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) holder.itemView.getResources().getQuantityString(R.plurals.t2, series.getCollectionVideoNum(), Integer.valueOf(series.getCollectionVideoNum())));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        Integer LJI2 = C79045V0n.LJI(R.attr.dz, holder.LJLLILLLL.LJLJJL);
        if (LJI2 != null) {
            i5 = LJI2.intValue();
        } else {
            i5 = 0;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i5);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " | ");
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        Integer LJI3 = C79045V0n.LJI(R.attr.gx, holder.LJLLILLLL.LJLJJL);
        if (LJI3 != null) {
            i6 = LJI3.intValue();
        } else {
            i6 = 0;
        }
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(i6);
        int length3 = spannableStringBuilder.length();
        long collectionTotalDuration = series.getCollectionTotalDuration();
        Resources resources = holder.itemView.getResources();
        o.LJIIIIZZ(resources, "itemView.resources");
        spannableStringBuilder.append((CharSequence) C249149qA.LIZ(collectionTotalDuration, resources));
        spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        tuxTextView4.setText(spannableStringBuilder);
        holder.LJLJLJ.setText(s.LJJLIL(2, String.valueOf(((ArrayList) holder.LJLLILLLL.LJLJJLL).indexOf(series) + 1)));
        FrameLayout frameLayout = holder.LJLJJLL;
        if (A53.LIZ() && ((ArrayList) holder.LJLLILLLL.LJLJJLL).size() > 1 && i != 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        C16880lQ.LJIILJJIL(holder.LJLJJLL, new ACListenerS39S0200000_4(holder.LJLLILLLL, series, 67));
        C16880lQ.LJIILJJIL(holder.LJLJJL, new ACListenerS39S0200000_4(holder.LJLLILLLL, series, 68));
        SY4 sy4 = holder.LJLJL;
        if (A53.LIZ() && !holder.LJLLILLLL.LJLJI) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        sy4.setVisibility(i8);
        long collectionId = series.getCollectionId();
        Long l = holder.LJLLILLLL.LJLJLJ;
        if (l == null || collectionId != l.longValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        holder.LJLLI.getBackground().setAlpha(204);
        LinearLayout linearLayout = holder.LJLLI;
        if (A53.LIZ() && z2) {
            i9 = 0;
        }
        linearLayout.setVisibility(i9);
        if (z2) {
            SY4 sy42 = holder.LJLJL;
            A5D a5d = holder.LJLLILLLL;
            sy42.setButtonVariant(1);
            sy42.setText(sy42.getContext().getString(R.string.qhw));
            C16880lQ.LJJIZ(sy42, new ACListenerS39S0200000_4(a5d, series, 69));
            return;
        }
        SY4 sy43 = holder.LJLJL;
        A5D a5d2 = holder.LJLLILLLL;
        sy43.setButtonVariant(0);
        sy43.setText(sy43.getContext().getString(R.string.qhv));
        C16880lQ.LJJIZ(sy43, new ACListenerS39S0200000_4(a5d2, series, 70));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final A5C com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJL), R.layout.ai_, parent, false);
        o.LJIIIIZZ(view, "view");
        A5C a5c = new A5C(this, view);
        C0AX.LIZ(parent, a5c.itemView, R.id.lj7);
        View view2 = a5c.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (a5c.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(A5C.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) a5c.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(a5c.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = A5C.class.getName();
        return a5c;
    }

    public A5D(PaidSeriesAddedSeriesViewModel listener, long j, boolean z, PaidSeriesAddedListFragment lifecycleOwner, Context context) {
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = listener;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = context;
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(A5E.LJLIL);
    }
}
