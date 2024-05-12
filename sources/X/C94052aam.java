package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aam, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94052aam extends AbstractC029409q<RecyclerView.ViewHolder> {
    public C93419aQZ LJLILLLLZI;
    public C93420aQa LJLJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final List<C94054aao> LJLIL = new ArrayList();
    public EnumC93413aQT LJLJJI = EnumC93413aQT.NONE;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (((ArrayList) this.LJLIL).isEmpty()) {
            return 0;
        }
        return ((ArrayList) this.LJLIL).size() + 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if ((!this.LJLIL.isEmpty()) && i == getItemCount() - 1) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return super.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new C94051aal(this, layoutManager));
        }
    }

    public C94052aam(boolean z, int i) {
        this.LJLJJL = z;
        this.LJLJJLL = i;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String str;
        int i2;
        float f;
        String height;
        Float LJJIJLIJ;
        String width;
        Float LJJIJLIJ2;
        C93420aQa c93420aQa;
        o.LJIIIZ(holder, "holder");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            if (this.LJLJJI == EnumC93413aQT.NONE && (c93420aQa = this.LJLJI) != null) {
                GifsViewModel vl = c93420aQa.LIZ.vl();
                if (!vl.LJLLILLLL) {
                    return;
                }
                XKX.LIZLLL(ViewModelKt.getViewModelScope(vl), null, null, new C94744alw(vl, null), 3);
                return;
            }
            return;
        }
        C94414agc c94414agc = (C94414agc) holder;
        if (this.LJLJJL) {
            C94054aao c94054aao = (C94054aao) ListProtector.get(this.LJLIL, i);
            ViewGroup.LayoutParams layoutParams = c94414agc.LJLJJL.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(0, 0);
            }
            o.LJIIIIZZ(c94414agc.LJLJJL.getContext(), "holder.imageView.context");
            float LJFF = (C93742aVm.LJFF(r1) - 6) / this.LJLJJLL;
            ProviderEffect.StickerBean sticker_info = c94054aao.LJLIL.getSticker_info();
            float f2 = 1.0f;
            if (sticker_info != null && (width = sticker_info.getWidth()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(width)) != null) {
                f = LJJIJLIJ2.floatValue();
            } else {
                f = 1.0f;
            }
            float f3 = LJFF / f;
            ProviderEffect.StickerBean sticker_info2 = c94054aao.LJLIL.getSticker_info();
            if (sticker_info2 != null && (height = sticker_info2.getHeight()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(height)) != null) {
                f2 = LJJIJLIJ.floatValue();
            }
            layoutParams.height = (int) (f2 * f3);
            c94414agc.LJLJJL.setLayoutParams(layoutParams);
        }
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        ProviderEffect.StickerBean sticker_info3 = ((C94054aao) ListProtector.get(this.LJLIL, i)).LJLIL.getSticker_info();
        if (sticker_info3 == null || (str = sticker_info3.getUrl()) == null) {
            str = "";
        }
        ImageView imageView = c94414agc.LJLJJL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        if (this.LJLJJL) {
            i2 = R.drawable.dfv;
        } else {
            i2 = R.drawable.dfx;
        }
        c94019aaF.LIZ(i2);
        imageLoaderService.loadGif(context, str, imageView, new C94020aaG(c94019aaF));
        C16880lQ.LJIILLIIL(c94414agc.LJLJJL, new ViewOnClickListenerC93414aQU(this, i));
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        int i2;
        RecyclerView.ViewHolder c94414agc;
        o.LJIIIZ(parent, "parent");
        if (i == Integer.MIN_VALUE) {
            View view = new View(parent.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, C93742aVm.LIZJ(20.0f)));
            c94414agc = new C94050aak(view);
        } else {
            LayoutInflater LLZIL = C16880lQ.LLZIL(parent.getContext());
            if (this.LJLJJL) {
                i2 = R.layout.dup;
            } else {
                i2 = R.layout.duq;
            }
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i2, parent, false);
            if (LLLLIILL != null) {
                FrameLayout frameLayout = (FrameLayout) LLLLIILL;
                c94414agc = new C94414agc(this, frameLayout, frameLayout);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
        }
        c94414agc.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view2 = c94414agc.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94414agc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c94414agc.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94414agc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94414agc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c94414agc.getClass().getName();
        return c94414agc;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (getItemViewType(i) != Integer.MIN_VALUE) {
            C94205adF c94205adF = (C94205adF) holder;
            int i2 = C93415aQV.LIZ[((C94054aao) ListProtector.get(this.LJLIL, i)).LJLILLLLZI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    holder.itemView.animate().cancel();
                    c94205adF.N();
                    c94205adF.L(false);
                } else {
                    c94205adF.N();
                    c94205adF.L(true);
                }
            } else {
                c94205adF.L(false);
                c94205adF.M();
            }
        }
        if (!payloads.contains(1)) {
            onBindViewHolder(holder, i);
        }
    }
}
