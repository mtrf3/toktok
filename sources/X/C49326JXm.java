package X;

import Y.IDTListenerS90S0200000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JXm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49326JXm extends AbstractC029409q<ViewOnAttachStateChangeListenerC49329JXp> {
    public List<ClickSearchWord> LJLIL = C61878OQg.INSTANCE;
    public ISearchContextAbility LJLILLLLZI;
    public JQA LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp, int i) {
        ViewOnAttachStateChangeListenerC49329JXp holder = viewOnAttachStateChangeListenerC49329JXp;
        o.LJIIIZ(holder, "holder");
        ClickSearchWord clickSearchWord = (ClickSearchWord) ListProtector.get(this.LJLIL, i);
        ISearchContextAbility iSearchContextAbility = this.LJLILLLLZI;
        JQA jqa = this.LJLJI;
        holder.LJLJJI = clickSearchWord;
        if (clickSearchWord == null) {
            return;
        }
        holder.LJLILLLLZI = iSearchContextAbility;
        holder.LJLJI = jqa;
        TuxTextView tuxTextView = holder.LJLIL;
        C49328JXo c49328JXo = new C49328JXo(holder, holder.itemView.getContext());
        c49328JXo.LJLJLJ = new C49327JXn(holder, clickSearchWord);
        c49328JXo.LJLJLLL = new IDTListenerS90S0200000_8(holder, clickSearchWord, 6);
        tuxTextView.setOnTouchListener(c49328JXo);
        holder.LJLIL.setText(clickSearchWord.word);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final ViewOnAttachStateChangeListenerC49329JXp com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        int i2 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setWidth(-2);
        tuxTextView.setHeight(ViewOnAttachStateChangeListenerC49329JXp.LJLJL);
        tuxTextView.setTextDirection(5);
        tuxTextView.setTextAlignment(5);
        int i3 = ViewOnAttachStateChangeListenerC49329JXp.LJLJJL;
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
        tuxTextView.setId(R.id.jfr);
        ViewOnAttachStateChangeListenerC49329JXp viewOnAttachStateChangeListenerC49329JXp = new ViewOnAttachStateChangeListenerC49329JXp(tuxTextView);
        C0AX.LIZ(parent, viewOnAttachStateChangeListenerC49329JXp.itemView, R.id.lj7);
        View view = viewOnAttachStateChangeListenerC49329JXp.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewOnAttachStateChangeListenerC49329JXp.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnAttachStateChangeListenerC49329JXp.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewOnAttachStateChangeListenerC49329JXp.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewOnAttachStateChangeListenerC49329JXp.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnAttachStateChangeListenerC49329JXp.class.getName();
        return viewOnAttachStateChangeListenerC49329JXp;
    }
}
