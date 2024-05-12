package X;

import Y.ACListenerS19S0201000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116754i7 extends AbstractC029409q<C116764i8> {
    public List<PromptStruct> LJLIL = C61878OQg.INSTANCE;
    public InterfaceC116774i9 LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C116764i8 holder, int i) {
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TuxTextView tuxTextView = (TuxTextView) view;
        PromptStruct promptStruct = (PromptStruct) ListProtector.get(this.LJLIL, i);
        tuxTextView.setText(((PromptStruct) ListProtector.get(this.LJLIL, i)).getPrompt());
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS19S0201000_1(this, promptStruct, i, 10));
        InterfaceC116774i9 interfaceC116774i9 = this.LJLILLLLZI;
        if (interfaceC116774i9 != null) {
            interfaceC116774i9.LIZIZ(promptStruct, i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.4i8, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C116764i8 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "context");
        final TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        Float valueOf = Float.valueOf(10.0f);
        C26338AVi.LJI(tuxTextView, null, null, C65429Pm5.LIZIZ(54.0f), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf))), false, 19);
        Float valueOf2 = Float.valueOf(12.0f);
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf2));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf2));
        Float valueOf3 = Float.valueOf(11.0f);
        C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(LJJIIZ), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf3))), Integer.valueOf(LJJIIZ2), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf3))), 16);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C79045V0n.LJI(R.attr.cj, context);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(valueOf));
        tuxTextView.setBackground(c110614Vt.LIZ(context));
        tuxTextView.setMaxLines(2);
        tuxTextView.setTuxFont(51);
        Integer LJI = C79045V0n.LJI(R.attr.gu, context);
        if (LJI != null) {
            tuxTextView.setTextColor(LJI.intValue());
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        ?? r2 = new RecyclerView.ViewHolder(tuxTextView) { // from class: X.4i8
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view = r2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C116764i8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C116764i8.class.getName();
        return r2;
    }
}
