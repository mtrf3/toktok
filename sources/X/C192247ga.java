package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentManageAssem;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192247ga extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C192217gX>, C76800UCe> {
    public final /* synthetic */ CollectionContentManageAssem LJLIL;
    public final /* synthetic */ C73305Spp LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ TextView LJLJJL;
    public final /* synthetic */ TextView LJLJJLL;
    public final /* synthetic */ View LJLJL;
    public final /* synthetic */ View LJLJLJ;
    public final /* synthetic */ TextView LJLJLLL;
    public final /* synthetic */ View LJLL;
    public final /* synthetic */ SY4 LJLLI;
    public final /* synthetic */ SY4 LJLLILLLL;
    public final /* synthetic */ RecyclerView LJLLJ;
    public final /* synthetic */ ActivityC45651qj LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192247ga(CollectionContentManageAssem collectionContentManageAssem, C73305Spp c73305Spp, Context context, View view, TextView textView, TextView textView2, View view2, View view3, TextView textView3, View view4, SY4 sy4, SY4 sy42, RecyclerView recyclerView, ActivityC45651qj activityC45651qj) {
        super(1);
        this.LJLIL = collectionContentManageAssem;
        this.LJLILLLLZI = c73305Spp;
        this.LJLJI = context;
        this.LJLJJI = view;
        this.LJLJJL = textView;
        this.LJLJJLL = textView2;
        this.LJLJL = view2;
        this.LJLJLJ = view3;
        this.LJLJLLL = textView3;
        this.LJLL = view4;
        this.LJLLI = sy4;
        this.LJLLILLLL = sy42;
        this.LJLLJ = recyclerView;
        this.LJLLL = activityC45651qj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<C192217gX> it) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C192047gG c192047gG;
        String string;
        boolean z3;
        o.LJIIIZ(it, "it");
        int i6 = 8;
        boolean z4 = true;
        int i7 = 0;
        if (it.isEmpty()) {
            C192047gG c192047gG2 = (C192047gG) this.LJLIL.LJLILLLLZI.getValue();
            if (c192047gG2 != null && c192047gG2.LJLILLLLZI) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                C26338AVi.LJI(this.LJLILLLLZI, null, AnonymousClass391.LIZJ(UserLevelGeckoUpdateSetting.DEFAULT), null, null, false, 29);
                C73305Spp c73305Spp = this.LJLILLLLZI;
                C73306Spq c73306Spq = new C73306Spq();
                String string2 = this.LJLJI.getString(R.string.gbo);
                o.LJIIIIZZ(string2, "context.getString(R.stri…ction_empty_videos_title)");
                c73306Spq.LJFF = string2;
                String string3 = this.LJLJI.getString(R.string.gbn);
                o.LJIIIIZZ(string3, "context.getString(R.stri…ection_empty_videos_desc)");
                c73306Spq.LJI = string3;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_bookmark;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                c73306Spq.LJII = new AqS134S0200000_3(this.LJLLL, this.LJLIL, 69);
                c73305Spp.setStatus(c73306Spq);
            } else {
                C26338AVi.LJI(this.LJLILLLLZI, null, 0, null, null, false, 29);
                C73305Spp c73305Spp2 = this.LJLILLLLZI;
                C73306Spq c73306Spq2 = new C73306Spq();
                String string4 = this.LJLJI.getString(R.string.it7);
                o.LJIIIIZZ(string4, "context.getString(R.stri…n_collection_error_title)");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('\"');
                c73306Spq2.LJFF = Q8U.LIZIZ(new Object[]{q.LIZIZ(LIZ, this.LJLIL.x3().name, '\"', LIZ)}, 1, string4, "format(this, *args)");
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_large_favorites_collection;
                c2068389v2.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq2.LIZJ = 0;
                c73306Spq2.LIZIZ = c2068389v2;
                String string5 = this.LJLJI.getString(R.string.it6);
                o.LJIIIIZZ(string5, "context.getString(R.stri…ection_error_description)");
                c73306Spq2.LJI = string5;
                c73305Spp2.setStatus(c73306Spq2);
            }
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJI.setEnabled(false);
        } else {
            this.LJLILLLLZI.setVisibility(8);
            this.LJLJJI.setEnabled(true);
        }
        this.LJLJJL.setText(this.LJLIL.x3().name);
        if (!it.isEmpty()) {
            Iterator<C192217gX> it2 = it.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJLILLLLZI != 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        String str = null;
        if (it.isEmpty()) {
            i = 0;
        } else {
            Iterator<C192217gX> it3 = it.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (it3.next().LJLILLLLZI == 2 && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        TextView textView = this.LJLJJLL;
        Context context = this.LJLJI;
        if (context != null && (string = context.getString(R.string.gc0)) != null) {
            str = Q8U.LIZIZ(new Object[]{String.valueOf(i)}, 1, string, "format(this, *args)");
        }
        textView.setText(str);
        View view = this.LJLJL;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        ImageView imageView = (ImageView) this.LJLJLJ;
        if (!z && ((Boolean) this.LJLIL.LJLJJL.getValue()).booleanValue()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        TextView textView2 = this.LJLJLLL;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        View view2 = this.LJLL;
        if (z) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        view2.setVisibility(i5);
        View view3 = this.LJLJJI;
        if (!z) {
            i6 = 0;
        }
        view3.setVisibility(i6);
        SY4 sy4 = this.LJLLI;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sy4.setEnabled(z2);
        SY4 sy42 = this.LJLLI;
        float f2 = 0.4f;
        if (sy42.isEnabled() && (c192047gG = (C192047gG) this.LJLIL.LJLILLLLZI.getValue()) != null && c192047gG.LJLIL) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        sy42.setAlpha(f);
        SY4 sy43 = this.LJLLILLLL;
        if (i <= 0) {
            z4 = false;
        }
        sy43.setEnabled(z4);
        SY4 sy44 = this.LJLLILLLL;
        if (sy44.isEnabled()) {
            f2 = 1.0f;
        }
        sy44.setAlpha(f2);
        ViewGroup.LayoutParams layoutParams = this.LJLLJ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view4 = this.LJLL;
            RecyclerView recyclerView = this.LJLLJ;
            if (z) {
                i7 = view4.getHeight();
            }
            marginLayoutParams.bottomMargin = i7;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(List<? extends C192217gX> list) {
        invoke2((List<C192217gX>) list);
        return C76800UCe.LIZ;
    }
}
