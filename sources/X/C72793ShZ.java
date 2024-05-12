package X;

import Y.ACListenerS37S0300000_12;
import Y.ARunnableS48S0100000_12;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.ShZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72793ShZ extends AbstractC28801Bc<Effect, C72794Sha> {
    public final I0N LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC88472Yns<Effect, C76800UCe> LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public final HashSet<String> LJLJJLL;

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C72794Sha holder = (C72794Sha) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.itemView.post(new ARunnableS48S0100000_12(holder, 51));
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        String effectId;
        C72794Sha holder = (C72794Sha) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        Effect effect = holder.LJLILLLLZI;
        if (effect != null && (effectId = effect.getEffectId()) != null) {
            this.LJLJJLL.remove(effectId);
        }
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<Effect> list) {
        this.LJLJJLL.clear();
        super.submitList(list);
    }

    public static C145995oB LJLLLLLL(C145995oB c145995oB, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music != null && (str = (String) ORZ.LJLLLL(music)) != null) {
            if (TextUtils.isEmpty(str)) {
                return c145995oB;
            }
            if (V3N.LJJII(effect)) {
                c145995oB.LJI("music_selected_from", "prop_music_bind");
            } else {
                c145995oB.LJI("music_selected_from", "prop_music_soft_bind");
            }
        }
        return c145995oB;
    }

    public final void LJLZ(String searchId, String searchWord) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchWord, "searchWord");
        this.LJLJJI = searchId;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C72794Sha holder = (C72794Sha) viewHolder;
        o.LJIIIZ(holder, "holder");
        Effect it = getItem(i);
        o.LJIIIIZZ(it, "it");
        holder.LJLILLLLZI = it;
        TuxTextView tuxTextView = holder.LJLJI;
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(it.getName());
        tuxTextView.setText(c116724i4.LIZ);
        if (it.getUse_number() > 0) {
            String number = C77123UOp.LJJIIJ(it.getUse_number());
            holder.LJLJJI.setVisibility(0);
            TuxTextView tuxTextView2 = holder.LJLJJI;
            C116724i4 c116724i42 = new C116724i4();
            Resources resources = holder.itemView.getContext().getResources();
            o.LJIIIIZZ(resources, "itemView.context.resources");
            o.LJIIIIZZ(number, "number");
            c116724i42.LIZ(resources, R.string.ij_, number);
            tuxTextView2.setText(c116724i42.LIZ);
        } else {
            holder.LJLJJI.setVisibility(8);
        }
        String str = (String) ORZ.LJLLLL(it.getIconUrl().getUrlList());
        if (str != null) {
            C78764Uvg.LJIIIZ(holder.LJLJJL, str, -1, -1);
        }
        C16880lQ.LJIIJ(new ACListenerS37S0300000_12(holder, it, holder.LJLJJLL, 1), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View container = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ata, viewGroup, false);
        o.LJIIIIZZ(container, "container");
        C72794Sha c72794Sha = new C72794Sha(this, container, this.LJLJI);
        C0AX.LIZ(viewGroup, c72794Sha.itemView, R.id.lj7);
        View view = c72794Sha.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c72794Sha.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72794Sha.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c72794Sha.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c72794Sha.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72794Sha.class.getName();
        return c72794Sha;
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<Effect> list, Runnable runnable) {
        this.LJLJJLL.clear();
        super.submitList(list, runnable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72793ShZ(I0N stickerApiComponent, String str, AqS173S0100000_7 aqS173S0100000_7) {
        super(new SGJ());
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        this.LJLIL = stickerApiComponent;
        this.LJLILLLLZI = str;
        this.LJLJI = aqS173S0100000_7;
        this.LJLJJI = "";
        this.LJLJJLL = new HashSet<>();
    }
}
