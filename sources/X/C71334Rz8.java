package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71334Rz8 extends AbstractC029409q<C71335Rz9> {
    public final Activity LJLIL;
    public final List<ShopWindowAnchorModel> LJLILLLLZI;
    public final CommonVideoAnchorModel LJLJI;
    public final IECommerceVideoService LJLJJI;
    public final IECommerceAnchorService LJLJJL;
    public final EnumC71337RzB LJLJJLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJL;
    public final LayoutInflater LJLJLJ;
    public final ArrayList<Integer> LJLJLLL;
    public final ArrayList<Integer> LJLL;
    public final ArrayList<Integer> LJLLI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C71335Rz9 r26, int r27) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71334Rz8.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C71335Rz9 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View LLLLIILL;
        Drawable LIZ;
        o.LJIIIZ(parent, "parent");
        EnumC71337RzB enumC71337RzB = this.LJLJJLL;
        int[] iArr = C71336RzA.LIZ;
        int i2 = iArr[enumC71337RzB.ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 == 2) {
                LLLLIILL = C16880lQ.LLLLIILL(this.LJLJLJ, R.layout.y_, parent, false);
            } else {
                throw new C162476Zf();
            }
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(this.LJLJLJ, R.layout.y9, parent, false);
        }
        if (LLLLIILL != null) {
            int i3 = iArr[this.LJLJJLL.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZ = Integer.valueOf(C04330Ez.LIZIZ(this.LJLIL, R.color.aw));
                    c110614Vt.LIZJ = C61328O5c.LIZJ(2);
                    LIZ = c110614Vt.LIZ(this.LJLIL);
                } else {
                    throw new C162476Zf();
                }
            } else {
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZ = Integer.valueOf(C04330Ez.LIZIZ(this.LJLIL, R.color.aw));
                c110614Vt2.LIZJ = C61328O5c.LIZJ(4);
                LIZ = c110614Vt2.LIZ(this.LJLIL);
            }
            LLLLIILL.setBackground(LIZ);
        }
        C71335Rz9 c71335Rz9 = new C71335Rz9(LLLLIILL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        C0AX.LIZ(parent, c71335Rz9.itemView, R.id.lj7);
        View view = c71335Rz9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c71335Rz9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71335Rz9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c71335Rz9.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c71335Rz9.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71335Rz9.class.getName();
        return c71335Rz9;
    }

    public C71334Rz8(Activity context, List anchors, CommonVideoAnchorModel commonVideoAnchorModel, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, EnumC71337RzB commodityListStyle, AqS178S0100000_12 aqS178S0100000_12) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(commodityListStyle, "commodityListStyle");
        this.LJLIL = context;
        this.LJLILLLLZI = anchors;
        this.LJLJI = commonVideoAnchorModel;
        this.LJLJJI = iECommerceVideoService;
        this.LJLJJL = iECommerceAnchorService;
        this.LJLJJLL = commodityListStyle;
        this.LJLJL = aqS178S0100000_12;
        this.LJLJLJ = C16880lQ.LLZIL(context);
        this.LJLJLLL = new ArrayList<>();
        this.LJLL = new ArrayList<>();
        this.LJLLI = new ArrayList<>();
        Iterator it = anchors.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i >= 0) {
                this.LJLL.add(Integer.valueOf(i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
