package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS12S0102000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42175Ggt extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<GZU> LJLIL = new ArrayList(0);
    public int LJLILLLLZI;
    public GSG LJLJI;
    public InterfaceC42180Ggy LJLJJI;
    public View.OnClickListener LJLJJL;
    public Integer LJLJJLL;
    public boolean LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        int i2;
        o.LJIIIZ(holder, "holder");
        W5G w5g = (W5G) holder.itemView.findViewById(R.id.eik);
        ViewGroup.LayoutParams layoutParams = w5g.getLayoutParams();
        double d = C42176Ggu.LJLJJLL;
        layoutParams.width = AnonymousClass391.LIZ(d);
        double d2 = C42176Ggu.LJLJL;
        layoutParams.height = AnonymousClass391.LIZ(d2);
        if (C58B.LIZ()) {
            V8L v8l = new V8L();
            v8l.LJFF(C74275TDb.LIZ(6.0f));
            V92 LIZ = new C79077V1t(w5g.getResources()).LIZ();
            LIZ.LJIL(v8l);
            w5g.setHierarchy(LIZ);
        } else {
            UC0.LJJJZ(w5g, C32151Nz.LJIIZILJ(2));
        }
        String str = ((GZU) ListProtector.get(this.LJLIL, i)).LIZ;
        int i3 = 8;
        if (!o.LJ(str, w5g.getTag())) {
            w5g.setTag(str);
            Context context = holder.itemView.getContext();
            int LIZ2 = AnonymousClass391.LIZ(d);
            int LIZ3 = AnonymousClass391.LIZ(d2);
            if (TextUtils.isEmpty(str)) {
                UrlModel urlModel = ((GZU) ListProtector.get(this.LJLIL, i)).LIZLLL;
                if (urlModel != null) {
                    w5g.setTag(urlModel.getUri());
                    C78764Uvg.LJI(w5g, urlModel, LIZ2, LIZ3);
                } else {
                    o.LJIIIIZZ(context, "context");
                    w5g.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cj, context));
                }
            } else if (ujb.o.LJJJJ(str, ".raw", false)) {
                C151525x6.LJ(str, ((GZU) ListProtector.get(this.LJLIL, i)).LIZIZ, ((GZU) ListProtector.get(this.LJLIL, i)).LIZJ, new AqS12S0102000_1(w5g, LIZ2, LIZ3, 1), 8);
            } else {
                C78764Uvg.LJIIIZ(w5g, android.net.Uri.fromFile(new File(str)).toString(), LIZ2, LIZ3);
            }
        }
        w5g.setOnClickListener(new ViewOnClickListenerC13880ga(new C42172Ggq(this, w5g, holder)));
        w5g.setOnLongClickListener(ViewOnLongClickListenerC42184Gh2.LJLIL);
        TuxTextView tuxTextView = (TuxTextView) holder.itemView.findViewById(R.id.eil);
        C62822Ol8 c62822Ol8 = C42186Gh4.LIZ;
        if (((Number) c62822Ol8.getValue()).doubleValue() == 120.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tuxTextView.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            tuxTextView.setTuxFont(62);
        }
        if (C58B.LIZ()) {
            tuxTextView.setBackgroundResource(R.drawable.r6);
        }
        tuxTextView.getLayoutParams().width = AnonymousClass391.LIZ(d);
        tuxTextView.setAlpha(1.0f);
        if (i == 0 && !this.LJLJL) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        C16880lQ.LJJJJI(tuxTextView, new C42179Ggx(this));
        TuxTextView tuxTextView2 = (TuxTextView) holder.itemView.findViewById(R.id.eio);
        if (((Number) c62822Ol8.getValue()).doubleValue() == 120.0d) {
            tuxTextView2.setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
            tuxTextView2.setTuxFont(62);
            tuxTextView2.setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), 0, 0);
        }
        if (C58B.LIZ()) {
            tuxTextView2.setBackgroundResource(R.drawable.re);
        }
        tuxTextView2.getLayoutParams().width = AnonymousClass391.LIZ(d);
        if (i == this.LJLILLLLZI) {
            i3 = 0;
        }
        tuxTextView2.setVisibility(i3);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.l6, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        C42178Ggw c42178Ggw = new C42178Ggw((FrameLayout) LLLLIILL);
        C0AX.LIZ(parent, c42178Ggw.itemView, R.id.lj7);
        View view = c42178Ggw.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c42178Ggw.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42178Ggw.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c42178Ggw.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c42178Ggw.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42178Ggw.class.getName();
        return c42178Ggw;
    }
}
