package X;

import Y.ACListenerS39S0200000_4;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class A54 extends AbstractC029409q<A55> {
    public final A56 LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final Context LJLJI;
    public final List<CollectionDetailModel> LJLJJI;
    public final List<Long> LJLJJL;
    public final java.util.Set<Long> LJLJJLL;
    public final java.util.Map<Long, C254739zB> LJLJL;
    public Long LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    public final void LJLLLLLL(C254699z7 creatorSeriesData) {
        o.LJIIIZ(creatorSeriesData, "creatorSeriesData");
        this.LJLJLJ = creatorSeriesData.LIZJ;
        ((ArrayList) this.LJLJJI).clear();
        ((ArrayList) this.LJLJJI).addAll(creatorSeriesData.LIZ);
        ((ArrayList) this.LJLJJL).clear();
        ((ArrayList) this.LJLJJL).addAll(creatorSeriesData.LIZIZ);
        notifyDataSetChanged();
        List<CollectionDetailModel> list = creatorSeriesData.LIZ;
        ArrayList arrayList = new ArrayList();
        for (CollectionDetailModel collectionDetailModel : list) {
            PriceInfo priceInfo = collectionDetailModel.getPriceInfo();
            if (priceInfo != null) {
                arrayList.add(new A2Z(collectionDetailModel.getCollectionId(), priceInfo, collectionDetailModel.getDiscountedPriceInfo()));
            }
        }
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-seriesPricingService>(...)");
        ((ISeriesPricingService) value).LIZ(this.LJLJI, arrayList).observe(this.LJLILLLLZI, new AObserverS72S0100000_4(this, 30));
    }

    public final void LJLZ(long j, boolean z) {
        if (z) {
            ((ArrayList) this.LJLJJL).add(Long.valueOf(j));
        } else {
            ((ArrayList) this.LJLJJL).remove(Long.valueOf(j));
        }
        this.LJLJJLL.remove(Long.valueOf(j));
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((CollectionDetailModel) it.next()).getCollectionId() == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        notifyItemChanged(i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(A55 a55, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        String str2;
        String str3;
        int i4;
        int i5;
        int i6;
        List<String> urlList;
        A55 holder = a55;
        o.LJIIIZ(holder, "holder");
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) ListProtector.get(this.LJLJJI, i);
        boolean contains = ((ArrayList) this.LJLJJL).contains(Long.valueOf(collectionDetailModel.getCollectionId()));
        UrlModel collectionCover = collectionDetailModel.getCollectionCover();
        if (collectionCover == null || (urlList = collectionCover.getUrlList()) == null || (str = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = holder.LJLILLLLZI;
        C16880lQ.LLJJJ(LJIIIIZZ);
        holder.LJLJI.setText(collectionDetailModel.getCollectionName());
        C254739zB c254739zB = (C254739zB) ((LinkedHashMap) holder.LJLLLL.LJLJL).get(Long.valueOf(collectionDetailModel.getCollectionId()));
        TuxTextView tuxTextView = holder.LJLLILLLL;
        if (c254739zB != null && !c254739zB.LJFF && C78685UuP.LJJJZ(collectionDetailModel.getVoucherTag())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        tuxTextView.setText(collectionDetailModel.getVoucherTag());
        TuxTextView tuxTextView2 = holder.LJLLI;
        if (c254739zB != null && !c254739zB.LJFF && collectionDetailModel.getDiscountedPriceInfo() != null) {
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
        TuxTextView tuxTextView3 = holder.LJLJJI;
        A54 a54 = holder.LJLLLL;
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
        tuxTextView3.setTextColorRes(a54.LJLIL.LIZ);
        TuxTextView tuxTextView4 = holder.LJLJJL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer LJI = C79045V0n.LJI(R.attr.gx, holder.LJLLLL.LJLJI);
        if (LJI != null) {
            i4 = LJI.intValue();
        } else {
            i4 = 0;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i4);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) holder.itemView.getResources().getQuantityString(R.plurals.t2, collectionDetailModel.getCollectionVideoNum(), Integer.valueOf(collectionDetailModel.getCollectionVideoNum())));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        Integer LJI2 = C79045V0n.LJI(R.attr.dz, holder.LJLLLL.LJLJI);
        if (LJI2 != null) {
            i5 = LJI2.intValue();
        } else {
            i5 = 0;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i5);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " | ");
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        Integer LJI3 = C79045V0n.LJI(R.attr.gx, holder.LJLLLL.LJLJI);
        if (LJI3 != null) {
            i6 = LJI3.intValue();
        } else {
            i6 = 0;
        }
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(i6);
        int length3 = spannableStringBuilder.length();
        long collectionTotalDuration = collectionDetailModel.getCollectionTotalDuration();
        Resources resources = holder.itemView.getResources();
        o.LJIIIIZZ(resources, "itemView.resources");
        spannableStringBuilder.append((CharSequence) C249149qA.LIZ(collectionTotalDuration, resources));
        spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        tuxTextView4.setText(spannableStringBuilder);
        if (holder.LJLLLL.LJLIL.LJFF) {
            holder.LJLL.setVisibility(0);
            holder.LJLJLLL.setText(s.LJJLIL(2, String.valueOf(((ArrayList) holder.LJLLLL.LJLJJI).indexOf(collectionDetailModel) + 1)));
        } else {
            holder.LJLL.setVisibility(8);
        }
        if (holder.LJLLLL.LJLIL.LIZLLL == A59.NOBUTTON) {
            holder.LJLJJLL.setVisibility(8);
            holder.LJLJJLL.setLoading(false);
            holder.LJLILLLLZI.getLayoutParams().height = C7MY.LIZIZ(108);
            holder.LJLILLLLZI.getLayoutParams().width = C7MY.LIZIZ(108);
            holder.LJLJJI.setTextColorRes(R.attr.go);
            holder.LJLJLJ.setVisibility(8);
            holder.LJLJL.setVisibility(8);
            holder.LJLL.setVisibility(8);
        } else if (contains) {
            String string = holder.LJLIL.getResources().getString(holder.LJLLLL.LJLIL.LIZJ);
            o.LJIIIIZZ(string, "view.resources.getString…completedStateButtonText)");
            holder.LJLJJLL.setVisibility(8);
            holder.LJLJJLL.setLoading(false);
            int i7 = A58.LIZ[holder.LJLLLL.LJLIL.LIZLLL.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    holder.LJLJLJ.setText(string);
                    holder.LJLJLJ.setVisibility(0);
                    holder.LJLJL.setVisibility(8);
                }
            } else {
                holder.LJLJL.setText(string);
                holder.LJLJL.setVisibility(0);
                holder.LJLJLJ.setVisibility(8);
                C16880lQ.LJJIZ(holder.LJLJL, new ACListenerS39S0200000_4(holder.LJLLLL, collectionDetailModel, 65));
                holder.LJLJL.setLoading(holder.LJLLLL.LJLJJLL.contains(Long.valueOf(collectionDetailModel.getCollectionId())));
            }
        } else {
            holder.LJLJL.setVisibility(8);
            holder.LJLJLJ.setVisibility(8);
            holder.LJLJJLL.setText(holder.LJLIL.getResources().getString(holder.LJLLLL.LJLIL.LIZIZ));
            holder.LJLJJLL.setVisibility(0);
            C16880lQ.LJJIZ(holder.LJLJJLL, new ACListenerS39S0200000_4(holder.LJLLLL, collectionDetailModel, 66));
            holder.LJLJL.setLoading(false);
            holder.LJLJJLL.setLoading(holder.LJLLLL.LJLJJLL.contains(Long.valueOf(collectionDetailModel.getCollectionId())));
        }
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(holder.LJLLLL, collectionDetailModel, 64), holder.LJLIL);
        if (A53.LIZ()) {
            long collectionId = collectionDetailModel.getCollectionId();
            Long l = holder.LJLLLL.LJLJLJ;
            if (l == null || collectionId != l.longValue()) {
                holder.LJLLJ.setVisibility(8);
                Integer LJI4 = C79045V0n.LJI(R.attr.cl, holder.LJLLLL.LJLJI);
                if (LJI4 != null) {
                    holder.LJLLL.setBackgroundColor(LJI4.intValue());
                    holder.LJLLL.getBackground().setAlpha(255);
                    return;
                }
                return;
            }
            holder.LJLLJ.getBackground().setAlpha(204);
            holder.LJLLJ.setVisibility(0);
            Integer LJI5 = C79045V0n.LJI(R.attr.eb, holder.LJLLLL.LJLJI);
            if (LJI5 == null) {
                return;
            }
            holder.LJLLL.setBackgroundColor(LJI5.intValue());
            holder.LJLLL.getBackground().setAlpha(15);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final A55 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJI), R.layout.ai8, parent, false);
        o.LJIIIIZZ(view, "view");
        A55 a55 = new A55(this, view);
        C0AX.LIZ(parent, a55.itemView, R.id.lj7);
        View view2 = a55.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (a55.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(A55.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) a55.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(a55.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = A55.class.getName();
        return a55;
    }

    public A54(A56 a56, LifecycleOwner lifecycleOwner, Context context) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(context, "context");
        this.LJLIL = a56;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = context;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new LinkedHashSet();
        this.LJLJL = new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(A57.LJLIL);
    }
}
