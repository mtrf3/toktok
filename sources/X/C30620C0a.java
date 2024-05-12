package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLiveModeSlideOptSettings;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.C0a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30620C0a extends FrameLayout {
    public RecyclerView LJLIL;
    public C30623C0d LJLILLLLZI;
    public C40141hq LJLJI;

    public int getHalfScreenWidth() {
        return (int) (((getResources().getDisplayMetrics().widthPixels * 1.0f) / 4.0f) * 3.0f);
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (C15380j0.LJIIZILJ()) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (C15380j0.LJIIZILJ()) {
            return 1.0f;
        }
        return 0.0f;
    }

    public void setAdapter(final AbstractC029409q abstractC029409q) {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(new AbstractC029409q(abstractC029409q) { // from class: X.7YA
            public final AbstractC029409q LJLIL;

            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return this.LJLIL.getItemCount() + 2;
            }

            @Override // X.AbstractC029409q
            public final int getItemViewType(int i) {
                if (i == 0 || i == getItemCount() - 1) {
                    return -1;
                }
                return this.LJLIL.getItemViewType(i);
            }

            {
                this.LJLIL = abstractC029409q;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                this.LJLIL.onBindViewHolder(viewHolder, i - 1);
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___;
                if (i == -1) {
                    final Space space = new Space(viewGroup.getContext());
                    space.setLayoutParams(new ViewGroup.LayoutParams(C30620C0a.this.getHalfScreenWidth(), -2));
                    com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___ = new RecyclerView.ViewHolder(space) { // from class: X.7YB
                    };
                } else {
                    com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___ = this.LJLIL.com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(viewGroup, i);
                }
                C0AX.LIZ(viewGroup, com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView, R.id.lj7);
                View view = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                }
                try {
                    if (com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.getClass().getName();
                return com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___;
            }
        });
    }

    public C30620C0a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        removeAllViews();
        if (LiveLiveModeSlideOptSettings.INSTANCE.enable()) {
            this.LJLIL = new C30624C0e(getContext());
            this.LJLJI = new C40141hq();
        } else {
            this.LJLIL = new RecyclerView(getContext(), null);
            this.LJLJI = new C30621C0b();
        }
        getContext();
        C30623C0d c30623C0d = new C30623C0d();
        this.LJLILLLLZI = c30623C0d;
        this.LJLIL.setLayoutManager(c30623C0d);
        this.LJLJI.LIZIZ(this.LJLIL);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView instanceof C30624C0e) {
            ((C30624C0e) recyclerView).setSnapHelper(this.LJLJI);
        }
        addView(this.LJLIL, new FrameLayout.LayoutParams(-1, -1));
        setWillNotDraw(false);
    }
}
