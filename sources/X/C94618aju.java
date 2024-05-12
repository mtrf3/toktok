package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aju, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94618aju extends AbstractC94454ahG {
    public final InterfaceC88471Ynr<C94033aaT, C94618aju, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C94618aju(InterfaceC88471Ynr<? super C94033aaT, ? super C94618aju, C76800UCe> interfaceC88471Ynr) {
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C94033aaT c94033aaT = (C94033aaT) ListProtector.get(this.LJLIL, i);
        View view = holder.itemView;
        long currentTimeMillis = System.currentTimeMillis();
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        String str = c94033aaT.LIZIZ;
        View findViewById = view.findViewById(R.id.nne);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_effect_kind_icon)");
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.loadBitmap(context, str, (ImageView) findViewById, new C94020aaG(c94019aaF), new C94617ajt(currentTimeMillis, this, c94033aaT));
        View findViewById2 = view.findViewById(R.id.npo);
        o.LJIIIIZZ(findViewById2, "findViewById<TextView>(R.id.tv_effect_kind_name)");
        ((TextView) findViewById2).setText(c94033aaT.LIZJ);
        C93750aVu.LIZ(view, 800L, new IDqS175S0200000_42(c94033aaT, this, 10));
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dv7, parent, false);
        if (LLLLIILL != null) {
            FrameLayout frameLayout = (FrameLayout) LLLLIILL;
            View findViewById = LLLLIILL.findViewById(R.id.eb4);
            o.LJIIIIZZ(findViewById, "item.findViewById(R.id.icon_container)");
            C94453ahF c94453ahF = new C94453ahF(frameLayout, (ViewGroup) findViewById);
            c94453ahF.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
            View view = c94453ahF.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (c94453ahF.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C94453ahF.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) c94453ahF.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(c94453ahF.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = C94453ahF.class.getName();
            return c94453ahF;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
