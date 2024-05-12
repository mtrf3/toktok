package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TKi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74464TKi extends AbstractC45801HyH<OSZ<? extends FilterBean, ? extends EnumC82260WQe>> {
    public final /* synthetic */ C74467TKl LJLILLLLZI;

    public C74464TKi(C74467TKl c74467TKl) {
        this.LJLILLLLZI = c74467TKl;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        int i2;
        o.LJIIIZ(holder, "holder");
        OSZ osz = (OSZ) ListProtector.get(this.LJLIL, i);
        C74467TKl c74467TKl = this.LJLILLLLZI;
        FilterBean filterBean = (FilterBean) osz.getFirst();
        EnumC82260WQe filterState = (EnumC82260WQe) osz.getSecond();
        c74467TKl.getClass();
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(filterState, "filterState");
        String str = null;
        if (!(holder instanceof C74465TKj)) {
            holder = null;
        }
        C74465TKj c74465TKj = (C74465TKj) holder;
        if (c74465TKj != null) {
            FilterBean filterBean2 = c74467TKl.LIZLLL;
            if (filterBean2 != null) {
                z = o.LJ(filterBean, filterBean2);
            } else {
                z = false;
            }
            C72790ShW imageView = c74465TKj.LJLILLLLZI.getImageView();
            android.net.Uri thumbnailFileUri = filterBean.getThumbnailFileUri();
            if (thumbnailFileUri != null) {
                str = thumbnailFileUri.toString();
            }
            C78764Uvg.LJIIIZ(imageView, str, -1, -1);
            c74465TKj.LJLILLLLZI.setText(filterBean.getName());
            c74465TKj.LJLILLLLZI.setCustomSelected(z);
            if (c74465TKj.LJLJJL != filterState) {
                int i3 = C82270WQo.LIZ[filterState.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        if (i3 == 5) {
                            ImageView ivDownload = c74465TKj.LJLIL;
                            o.LJIIIIZZ(ivDownload, "ivDownload");
                            ivDownload.setVisibility(0);
                            Integer valueOf = Integer.valueOf(c74465TKj.LJLJJLL.LJ);
                            if (valueOf.intValue() != 0) {
                                i2 = valueOf.intValue();
                            } else {
                                i2 = R.drawable.th;
                            }
                            c74465TKj.LJLIL.setImageResource(i2);
                            ObjectAnimator animator = ObjectAnimator.ofFloat(c74465TKj.LJLIL, "rotation", 0.0f, 360.0f);
                            o.LJIIIIZZ(animator, "animator");
                            animator.setDuration(800L);
                            animator.setRepeatMode(1);
                            animator.setRepeatCount(-1);
                            animator.start();
                            c74465TKj.LJLJI = animator;
                        }
                    } else {
                        c74465TKj.L();
                        ImageView ivDownload2 = c74465TKj.LJLIL;
                        o.LJIIIIZZ(ivDownload2, "ivDownload");
                        ivDownload2.setVisibility(8);
                    }
                } else {
                    c74465TKj.L();
                    ImageView ivDownload3 = c74465TKj.LJLIL;
                    o.LJIIIIZZ(ivDownload3, "ivDownload");
                    ivDownload3.setVisibility(0);
                }
            }
            c74465TKj.LJLJJI = filterBean;
            c74465TKj.LJLJJL = filterState;
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C74467TKl c74467TKl = this.LJLILLLLZI;
        AqS194S0100000_12 clickListener = c74467TKl.LJII;
        o.LJIIIZ(clickListener, "clickListener");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.j8, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        InterfaceC88472Yns<? super TextView, C76800UCe> interfaceC88472Yns = c74467TKl.LJIILIIL.LIZLLL;
        AqS143S0200000_12 aqS143S0200000_12 = new AqS143S0200000_12(c74467TKl, itemView, 143);
        C74462TKg c74462TKg = new C74462TKg(context);
        aqS143S0200000_12.invoke(c74462TKg);
        Context context2 = c74462TKg.LJJIJ;
        boolean z = c74462TKg.LIZ;
        int i2 = c74462TKg.LIZIZ;
        int i3 = c74462TKg.LIZLLL;
        int i4 = c74462TKg.LJ;
        int i5 = c74462TKg.LJFF;
        int i6 = c74462TKg.LJI;
        int i7 = c74462TKg.LJII;
        boolean z2 = c74462TKg.LJIIIIZZ;
        int i8 = c74462TKg.LJIIIZ;
        int i9 = c74462TKg.LJIIJ;
        int i10 = c74462TKg.LJIIJJI;
        int i11 = c74462TKg.LJIIL;
        int i12 = c74462TKg.LJIILIIL;
        int i13 = c74462TKg.LJIILJJIL;
        int i14 = c74462TKg.LJIILLIIL;
        boolean z3 = c74462TKg.LJIIZILJ;
        boolean z4 = c74462TKg.LJIJ;
        boolean z5 = c74462TKg.LJJIII;
        int i15 = c74462TKg.LJIJJ;
        int i16 = c74462TKg.LJIL;
        int i17 = c74462TKg.LJJ;
        int i18 = c74462TKg.LJJI;
        int LIZ = c74462TKg.LIZ();
        boolean z6 = c74462TKg.LJIJI;
        boolean z7 = c74462TKg.LJJIFFI;
        int i19 = c74462TKg.LJIJJLI;
        int i20 = c74462TKg.LJIILL;
        boolean z8 = c74462TKg.LJJII;
        boolean z9 = c74462TKg.LJJIIJ;
        boolean z10 = c74462TKg.LJJIIZ;
        boolean z11 = c74462TKg.LJJIIJZLJL;
        int i21 = c74462TKg.LJJIIZI;
        if (i21 == -1) {
            i21 = c74462TKg.LIZIZ;
        }
        TDG tdg = new TDG(context2, z, i2, i3, i4, i5, i6, i7, z2, i8, i9, i10, i11, i12, i13, i14, z3, z4, i15, i16, i17, i18, LIZ, z6, z7, false, i19, i20, z8, false, z9, z11, z10, z5, i21, 536870912, 0);
        TextView textView = tdg.getTextView();
        if (textView != null) {
            if (C82852WfQ.LIZ().LJFF) {
                textView.setTextSize(12.0f);
                C78880UxY.LJLIIL(textView);
            } else {
                textView.setTextSize(11.0f);
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(textView);
            }
        }
        tdg.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tdg.setId(R.id.eu8);
        ((ViewGroup) itemView.findViewById(R.id.eto)).addView(tdg, 0);
        C74465TKj c74465TKj = new C74465TKj(itemView, c74467TKl.LJIILIIL, clickListener);
        C0AX.LIZ(parent, c74465TKj.itemView, R.id.lj7);
        View view = c74465TKj.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c74465TKj.itemView.getParent() != null) {
                boolean z12 = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z12 = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z12) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C74465TKj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c74465TKj.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c74465TKj.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C74465TKj.class.getName();
        return c74465TKj;
    }
}
