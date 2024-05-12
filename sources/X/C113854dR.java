package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4dR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113854dR extends C4RC {
    public static final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C113894dV.LJLIL);
    public List<? extends InterfaceC62225ObV> LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C114064dm LJLJJI;
    public final Context LJLJJL;
    public final InterfaceC113814dN LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final BaseSharePackage LJLLI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int size = this.LJLIL.size();
        if (i < 0 || size <= i || !o.LJ(((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).key(), "invitation")) {
            int size2 = this.LJLIL.size();
            if (i < 0 || size2 <= i || !o.LJ(((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).key(), "repost")) {
                int size3 = this.LJLIL.size();
                if (i < 0 || size3 <= i || !o.LJ(((InterfaceC62225ObV) ListProtector.get(this.LJLIL, i)).key(), "share_to_story")) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override // X.C4RC
    public final void setData(List<? extends InterfaceC62225ObV> channels) {
        o.LJIIIZ(channels, "channels");
        this.LJLIL = channels;
        if (this.LJLILLLLZI) {
            Iterator<? extends InterfaceC62225ObV> it = channels.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.LJLJJI.LIZ(it.next().label())) {
                    this.LJLJI = true;
                    break;
                }
            }
        }
        notifyDataSetChanged();
    }

    public final C113864dS LJLLLLLL(int i, ViewGroup parent) {
        int i2;
        o.LJIIIZ(parent, "parent");
        if (i != 2 && i != 3) {
            i2 = R.layout.bmg;
        } else {
            i2 = R.layout.bmh;
        }
        int i3 = 0;
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(C119364mK.LIZ(parent.getContext())), i2, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        C113864dS c113864dS = new C113864dS(itemView, i);
        if (this.LJLJLJ) {
            c113864dS.LJLILLLLZI.setVisibility(8);
        } else if (c113864dS.LJLJJI != 1) {
            View itemView2 = c113864dS.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            itemView2.getLayoutParams().width = this.LJLJJL.getResources().getDimensionPixelOffset(R.dimen.a76);
        }
        if (this.LJLJL) {
            int dimensionPixelOffset = this.LJLJJL.getResources().getDimensionPixelOffset(R.dimen.a75);
            int i4 = c113864dS.LJLJJI;
            if (i4 != 0) {
                if (i4 == 2 || i4 == 3) {
                    View itemView3 = c113864dS.itemView;
                    o.LJIIIIZZ(itemView3, "itemView");
                    View findViewById = itemView3.findViewById(R.id.zz);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = dimensionPixelOffset;
                        }
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = dimensionPixelOffset;
                        }
                    }
                }
            } else {
                C119604mi c119604mi = c113864dS.LJLIL;
                if (c119604mi != null) {
                    ViewGroup.LayoutParams layoutParams3 = c119604mi.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.height = dimensionPixelOffset;
                    }
                    ViewGroup.LayoutParams layoutParams4 = c119604mi.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = dimensionPixelOffset;
                    }
                }
            }
        }
        TuxTextView tuxTextView = c113864dS.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(this.LJLJLLL);
        if (valueOf.intValue() != 0 || (valueOf = C79045V0n.LJI(R.attr.g7, C119364mK.LIZ(parent.getContext()))) != null) {
            i3 = valueOf.intValue();
        }
        tuxTextView.setTextColor(i3);
        C13930gf.LIZ(itemView, new C113884dU(c113864dS));
        return c113864dS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        if (r13 == (r11.LJLIL.size() - 1)) goto L25;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113854dR.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C113864dS LJLLLLLL = LJLLLLLL(i, viewGroup);
        C0AX.LIZ(viewGroup, LJLLLLLL.itemView, R.id.lj7);
        View view = LJLLLLLL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LJLLLLLL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C113864dS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LJLLLLLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LJLLLLLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C113864dS.class.getName();
        return LJLLLLLL;
    }

    public C113854dR(Context context, InterfaceC113814dN listener, boolean z, boolean z2, int i, int i2, BaseSharePackage baseSharePackage, int i3) {
        z = (i3 & 4) != 0 ? false : z;
        z2 = (i3 & 8) != 0 ? false : z2;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 8 : i2;
        baseSharePackage = (i3 & 64) != 0 ? null : baseSharePackage;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(listener, "listener");
        this.LJLJJL = context;
        this.LJLJJLL = listener;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJLLL = i;
        this.LJLL = i2;
        this.LJLLI = baseSharePackage;
        this.LJLIL = C61878OQg.INSTANCE;
        this.LJLJJI = new C114064dm();
    }
}
