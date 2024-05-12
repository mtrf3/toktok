package X;

import Y.IDTListenerS90S0200000_8;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.JXs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49332JXs extends AbstractC029409q<ViewOnAttachStateChangeListenerC49333JXt> {
    public ISearchContextAbility LJLILLLLZI;
    public List<RelatedWord> LJLIL = C61878OQg.INSTANCE;
    public int LJLJI = -1;
    public int LJLJJI = -1;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt, int i) {
        ViewOnAttachStateChangeListenerC49333JXt holder = viewOnAttachStateChangeListenerC49333JXt;
        o.LJIIIZ(holder, "holder");
        RelatedWord relatedWord = (RelatedWord) ListProtector.get(this.LJLIL, i);
        ISearchContextAbility iSearchContextAbility = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        int i3 = this.LJLJJI;
        holder.LJLJJL = relatedWord;
        if (relatedWord == null) {
            return;
        }
        holder.LJLILLLLZI = iSearchContextAbility;
        holder.LJLJI = i2;
        holder.LJLJJI = i3;
        TuxTextView tuxTextView = holder.LJLIL;
        C49335JXv c49335JXv = new C49335JXv(holder, holder.itemView.getContext());
        c49335JXv.LJLJLJ = new C49334JXu(holder, relatedWord);
        c49335JXv.LJLJLLL = new IDTListenerS90S0200000_8(holder, relatedWord, 4);
        tuxTextView.setOnTouchListener(c49335JXv);
        if (o.LJ("2", relatedWord.wordType)) {
            C2068389v c2068389v = new C2068389v();
            int i4 = ViewOnAttachStateChangeListenerC49333JXt.LJLJLJ;
            c2068389v.LIZIZ = i4;
            int i5 = ViewOnAttachStateChangeListenerC49333JXt.LJLJLLL;
            c2068389v.LIZJ = i5;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            c2068389v.LIZ = R.raw.icon_fire_3_fill;
            SY9 LIZJ = C025908h.LIZJ(holder.itemView, "itemView.context", c2068389v);
            LIZJ.setBounds(0, 0, i4, i5);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(relatedWord.text);
            T59 t59 = new T59(LIZJ);
            t59.LJLIL = C7MY.LIZIZ(2);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(t59, s.LJJLIIIJ(spannableStringBuilder), spannableStringBuilder.length(), 18);
            holder.LJLIL.setText(spannableStringBuilder);
            return;
        }
        holder.LJLIL.setText(relatedWord.text);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final ViewOnAttachStateChangeListenerC49333JXt com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setWidth(-2);
        tuxTextView.setHeight(ViewOnAttachStateChangeListenerC49333JXt.LJLL);
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(5);
        int i3 = ViewOnAttachStateChangeListenerC49333JXt.LJLJJLL;
        tuxTextView.setPaddingRelative(i3, 0, i3, 0);
        tuxTextView.setMaxLines(2);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        Integer LJI = C79045V0n.LJI(R.attr.cf, context2);
        if (LJI != null) {
            i2 = LJI.intValue();
        }
        tuxTextView.setBackgroundColor(i2);
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setTuxFont(52);
        tuxTextView.setGravity(8388627);
        tuxTextView.setId(R.id.jfs);
        ViewOnAttachStateChangeListenerC49333JXt viewOnAttachStateChangeListenerC49333JXt = new ViewOnAttachStateChangeListenerC49333JXt(tuxTextView);
        C0AX.LIZ(parent, viewOnAttachStateChangeListenerC49333JXt.itemView, R.id.lj7);
        View view = viewOnAttachStateChangeListenerC49333JXt.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewOnAttachStateChangeListenerC49333JXt.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnAttachStateChangeListenerC49333JXt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewOnAttachStateChangeListenerC49333JXt.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewOnAttachStateChangeListenerC49333JXt.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnAttachStateChangeListenerC49333JXt.class.getName();
        return viewOnAttachStateChangeListenerC49333JXt;
    }
}
