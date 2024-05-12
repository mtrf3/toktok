package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.UNv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77103UNv extends AbstractC029409q<UO0> {
    public final UO1 LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final InterfaceC88474Ynu<Long, Long, Long, Long, C76800UCe> LJLJI;
    public XKQ LJLJJI;
    public List<C77105UNx> LJLJJL;
    public final HashSet<Long> LJLJJLL;
    public final LinkedBlockingQueue<Long> LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL.size();
    }

    public final void LJLLLLLL(C77105UNx c77105UNx) {
        Iterator<C77106UNy> it = c77105UNx.LJII.iterator();
        while (it.hasNext()) {
            Iterator<C77107UNz> it2 = it.next().LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LJLZ(it2.next());
            }
        }
    }

    public final void LJLZ(C77107UNz c77107UNz) {
        Long poll;
        C77106UNy c77106UNy = c77107UNz.LJFF;
        if (c77106UNy != null && !this.LJLJJLL.contains(Long.valueOf(c77106UNy.LJLJJL))) {
            this.LJLJL.offer(Long.valueOf(c77106UNy.LJLJJL));
            this.LJLJJLL.add(Long.valueOf(c77106UNy.LJLJJL));
            if (this.LJLJL.size() > 49 && (poll = this.LJLJL.poll()) != null) {
                this.LJLJJLL.remove(Long.valueOf(poll.longValue()));
            }
            this.LJLJI.invoke(Long.valueOf(c77106UNy.LJLJLJ), Long.valueOf(c77106UNy.LJLJL), Long.valueOf(this.LJLIL.LIZJ()), Long.valueOf(c77106UNy.LJLJJL));
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UO0 uo0, int i) {
        UO0 holder = uo0;
        o.LJIIIZ(holder, "holder");
        C77105UNx c77105UNx = (C77105UNx) ListProtector.get(this.LJLJJL, i);
        c77105UNx.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator<C77106UNy> it = c77105UNx.LJII.iterator();
        while (it.hasNext()) {
            sb.append(it.next().LJLJJLL);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringBuilder.toString()");
        StringBuilder sb3 = new StringBuilder(sb2);
        long LIZJ = this.LJLIL.LIZJ();
        C77105UNx c77105UNx2 = (C77105UNx) ListProtector.get(this.LJLJJL, i);
        long j = c77105UNx2.LIZIZ;
        if (LIZJ < j) {
            TextView textView = holder.LJLIL;
            if (textView != null) {
                textView.setText(sb3.subSequence(0, sb3.length()));
            }
            LJLLLLLL(c77105UNx2);
            return;
        }
        if (LIZJ < j + c77105UNx2.LIZLLL && i == getItemCount() - 1) {
            TextView textView2 = holder.LJLIL;
            if (textView2 == null) {
                return;
            }
            UO1 uo1 = this.LJLIL;
            c77105UNx2.LIZIZ(LIZJ);
            C77107UNz c77107UNz = c77105UNx2.LJFF;
            C76732zl c76732zl = new C76732zl();
            int i2 = c77105UNx2.LJ;
            c76732zl.element = i2;
            if (i2 < 0 || i2 > sb3.length()) {
                i2 = sb3.length();
            }
            textView2.setText(sb3.subSequence(0, i2));
            if (c77107UNz == null) {
                return;
            }
            this.LJLJJI = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLILLLLZI), null, null, new C77104UNw(c77107UNz, uo1, c77105UNx2, c76732zl, this, sb3, textView2, sb3, null), 3);
            return;
        }
        if (LIZJ >= c77105UNx2.LIZIZ + c77105UNx2.LIZLLL) {
            TextView textView3 = holder.LJLIL;
            if (textView3 == null) {
                return;
            }
            textView3.setText(sb3.subSequence(0, sb3.length()));
            LJLLLLLL(c77105UNx2);
            return;
        }
        TextView textView4 = holder.LJLIL;
        if (textView4 != null) {
            textView4.setText(sb3.subSequence(0, sb3.length()));
        }
        LJLLLLLL(c77105UNx2);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UO0 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        UO0 uo0 = new UO0(C1FL.LIZIZ(parent, R.layout.vd, parent, false, "from(parent.context)\n   …text_item, parent, false)"));
        C0AX.LIZ(parent, uo0.itemView, R.id.lj7);
        View view = uo0.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (uo0.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UO0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) uo0.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(uo0.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UO0.class.getName();
        return uo0;
    }

    public C77103UNv(UO1 uo1, LifecycleOwner lifecycleOwner, C30167Bsh c30167Bsh) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = uo1;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = c30167Bsh;
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new HashSet<>(50);
        this.LJLJL = new LinkedBlockingQueue<>(50);
    }
}
