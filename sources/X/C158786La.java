package X;

import Y.ACListenerS37S0200000_2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158786La extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final /* synthetic */ EditTTSPanelFragment LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL.LJLILLLLZI).size();
    }

    public C158786La(EditTTSPanelFragment editTTSPanelFragment) {
        this.LJLIL = editTTSPanelFragment;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return ((ReadTextEffectBean) ListProtector.get(this.LJLIL.LJLILLLLZI, i)).hashCode();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((ReadTextEffectBean) ListProtector.get(this.LJLIL.LJLILLLLZI, i)).voiceClonePlaceHolder) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        int i2;
        boolean z2;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C158796Lb) {
            final C158796Lb c158796Lb = (C158796Lb) holder;
            final ReadTextEffectBean bean = (ReadTextEffectBean) ListProtector.get(this.LJLIL.LJLILLLLZI, i);
            o.LJIIIZ(bean, "bean");
            c158796Lb.LJLJJL.setText(bean.effect.getName());
            if (bean.mSpeaker.voiceDescriptions.length() > 0) {
                c158796Lb.LJLJJLL.setText(bean.mSpeaker.voiceDescriptions);
                c158796Lb.LJLJJLL.setVisibility(0);
            } else {
                c158796Lb.LJLJJLL.setVisibility(8);
            }
            if (bean.mSpeaker.isFake) {
                C71799SFv.LJIIJ(c158796Lb.LJLIL, Integer.valueOf(R.drawable.b9q), null, false, null, 126);
            } else {
                List<String> url_list = bean.effect.getIcon_url().getUrl_list();
                if (url_list != null && !url_list.isEmpty()) {
                    C71799SFv.LJIIJ(c158796Lb.LJLIL, ListProtector.get(url_list, 0), null, false, null, 126);
                }
            }
            c158796Lb.N(bean.selected);
            View view = c158796Lb.itemView;
            final EditTTSPanelFragment editTTSPanelFragment = c158796Lb.LJLJLLL.LJLIL;
            C16880lQ.LJIIJ(new AbstractViewOnClickListenerC55470Lpq() { // from class: X.6LZ
                @Override // X.AbstractViewOnClickListenerC55470Lpq
                public final void LIZ(View view2) {
                    C158796Lb.this.getClass();
                    C6LY c6ly = editTTSPanelFragment.LJLJI;
                    if (c6ly != null) {
                        c6ly.LLFF(bean);
                    }
                    C6LY c6ly2 = editTTSPanelFragment.LJLJI;
                    if (c6ly2 != null && c6ly2.LLD(bean.mSpeaker.speakreID)) {
                        return;
                    }
                    C158796Lb.M(C158796Lb.this, 2);
                }
            }, view);
            C16880lQ.LJJIZ(c158796Lb.LJLJJI, new ACListenerS37S0200000_2(c158796Lb.LJLJLLL.LJLIL, bean, 6));
            C6LY c6ly = c158796Lb.LJLJLLL.LJLIL.LJLJI;
            if (c6ly != null && c6ly.LLD(bean.mSpeaker.speakreID)) {
                C158796Lb.M(c158796Lb, 1);
            } else if (bean.selected) {
                C158796Lb.M(c158796Lb, 2);
            } else {
                C158796Lb.M(c158796Lb, 0);
            }
            c158796Lb.LJLJJI.setVisibility(8);
            try {
                if (c158796Lb.LJLJLJ.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    ViewGroup.LayoutParams layoutParams = c158796Lb.LJLJLJ.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginEnd(0);
                    c158796Lb.LJLJLJ.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (holder instanceof C158806Lc) {
            C158806Lc c158806Lc = (C158806Lc) holder;
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) ListProtector.get(this.LJLIL.LJLILLLLZI, i);
            o.LJIIIZ(readTextEffectBean, "readTextEffectBean");
            if (!(readTextEffectBean instanceof VoiceCloneReadTextEffectBean)) {
                return;
            }
            VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = (VoiceCloneReadTextEffectBean) readTextEffectBean;
            UrlModel urlModel = voiceCloneReadTextEffectBean.userAvatar;
            if (urlModel != null) {
                C71799SFv.LJIIJ(c158806Lc.LJLIL, new C62562cu(urlModel.getUrlList()), null, false, null, 110);
            }
            if (C78685UuP.LJJJZ(readTextEffectBean.mSpeaker.speakerName)) {
                c158806Lc.LJLJJI.setText(readTextEffectBean.mSpeaker.speakerName);
            } else {
                c158806Lc.LJLJJI.setText(c158806Lc.itemView.getResources().getString(R.string.trm));
            }
            c158806Lc.LJLJLJ.setVisibility(0);
            c158806Lc.LJLJL.setVisibility(0);
            c158806Lc.LJLJJL.setVisibility(0);
            if (voiceCloneReadTextEffectBean.isRecordCompleted && C78685UuP.LJJJZ(readTextEffectBean.mSpeaker.speakreID)) {
                z = true;
            } else {
                z = false;
            }
            if (voiceCloneReadTextEffectBean.requiredCount > 0 && !z) {
                int i3 = (int) ((voiceCloneReadTextEffectBean.succeedCount / r5) * 0.9d * 100);
                c158806Lc.LJLJL.setProgress(i3);
                TuxTextView tuxTextView = c158806Lc.LJLJLJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i3);
                LIZ.append('%');
                tuxTextView.setText(X1D.LIZIZ(LIZ));
                View itemView = c158806Lc.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C146035oF.LIZJ(itemView, new AqS149S0200000_2(c158806Lc, readTextEffectBean, 40));
            } else if (voiceCloneReadTextEffectBean.succeedCount > 0 && z) {
                c158806Lc.LJLJLJ.setVisibility(8);
                c158806Lc.LJLJL.setVisibility(8);
                c158806Lc.LJLJJL.setVisibility(8);
                View itemView2 = c158806Lc.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C146035oF.LIZJ(itemView2, new AqS91S0300000_2(c158806Lc, readTextEffectBean, c158806Lc.LJLL.LJLIL, 8));
            } else {
                c158806Lc.LJLJL.setProgress(0);
                c158806Lc.LJLJLJ.setText("0%");
                View itemView3 = c158806Lc.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                C146035oF.LIZJ(itemView3, new AqS149S0200000_2(c158806Lc, readTextEffectBean, 41));
            }
            TuxIconView tuxIconView = c158806Lc.LJLJJLL;
            if (voiceCloneReadTextEffectBean.isPrivate) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
            if (readTextEffectBean.selected && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            c158806Lc.N(z2);
            if (z) {
                C6LY c6ly2 = c158806Lc.LJLL.LJLIL.LJLJI;
                if (c6ly2 != null && c6ly2.LLD(readTextEffectBean.mSpeaker.speakreID)) {
                    C158806Lc.M(c158806Lc, 1);
                    return;
                } else if (readTextEffectBean.selected) {
                    C158806Lc.M(c158806Lc, 2);
                    return;
                } else {
                    C158806Lc.M(c158806Lc, 0);
                    return;
                }
            }
            c158806Lc.LJLJI.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c158796Lb;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i == 0) {
            c158796Lb = new C158796Lb(this, C1FL.LIZIZ(parent, R.layout.ccv, parent, false, "from(parent.context)\n   …l_rv_item, parent, false)"));
        } else if (i == 1) {
            c158796Lb = new C158806Lc(this, C1FL.LIZIZ(parent, R.layout.ccw, parent, false, "from(parent.context)\n   …lone_item, parent, false)"));
        } else {
            c158796Lb = new C158796Lb(this, C1FL.LIZIZ(parent, R.layout.ccv, parent, false, "from(parent.context)\n   …l_rv_item, parent, false)"));
        }
        C0AX.LIZ(parent, c158796Lb.itemView, R.id.lj7);
        View view = c158796Lb.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c158796Lb.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c158796Lb.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c158796Lb.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c158796Lb.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c158796Lb.getClass().getName();
        return c158796Lb;
    }
}
