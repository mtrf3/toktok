package X;

import Y.IDCListenerS83S0200000;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.ToShowShortCutPanelPallet;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49531wz extends C40771ir {
    public final DataChannel LLD;

    public final void LLJL() {
        int LJZ;
        if (C78880UxY.LJLIIIL(this.LJLJJL) && (LJZ = ORZ.LJZ(this.LJLJJL, this.LJLIL)) >= 0 && LJZ < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(LJZ, "item_normal");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49531wz(DataChannel dataChannel, StickerEffectViewModel viewModel) {
        super(dataChannel, null, viewModel);
        o.LJIIIZ(viewModel, "viewModel");
        this.LLD = dataChannel;
    }

    @Override // X.C1KD
    public final void LLIIIZ(RecyclerView.ViewHolder holder, Object obj) {
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (holder instanceof C30541Hu) {
            LLJJLIIIJLLLLLLLZ((C30541Hu) holder, effect);
        }
    }

    @Override // X.C1KD
    public final void LLIIJI(RecyclerView.ViewHolder holder, Object obj) {
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (holder instanceof C30541Hu) {
            effect.loadingSpecialIcon = false;
            C30541Hu c30541Hu = (C30541Hu) holder;
            if (C29306Beo.LJJIIJ(c30541Hu.LJLILLLLZI)) {
                LLJJL(c30541Hu, effect);
            }
        }
    }

    @Override // X.C40771ir
    public final void LLILZ(C30541Hu holder, LiveEffect sticker) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        if (o.LJ(this.LJLJJL, sticker) && C78880UxY.LJLIIIL(sticker)) {
            if (sticker.loadingSpecialIcon) {
                DataChannel dataChannel = this.LLD;
                if (dataChannel != null && o.LJ(dataChannel.kv0(C54542Cc.class), Boolean.TRUE)) {
                    LLJJLIIIJLLLLLLLZ(holder, sticker);
                    return;
                }
            } else {
                DataChannel dataChannel2 = this.LLD;
                if (dataChannel2 != null && o.LJ(dataChannel2.kv0(C54542Cc.class), Boolean.TRUE)) {
                    this.LLD.qv0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
                }
            }
        }
        LLJJL(holder, sticker);
    }

    @Override // X.C40771ir
    public final void LLIZLLLIL(RecyclerView.ViewHolder holder, LiveEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C30541Hu) {
            C30541Hu c30541Hu = (C30541Hu) holder;
            if (C29306Beo.LJJIIJ(c30541Hu.LJLILLLLZI)) {
                LLJJL(c30541Hu, sticker);
                DataChannel dataChannel = this.LLD;
                if (dataChannel != null) {
                    dataChannel.qv0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        super.LLIZLLLIL(holder, sticker);
    }

    public final void LLJJL(C30541Hu c30541Hu, LiveEffect liveEffect) {
        List<String> list = null;
        if (C29306Beo.LJJIIJ(c30541Hu.LJLILLLLZI)) {
            c30541Hu.LJLIL.setAlpha(0.0f);
            C29306Beo.LJJLJLI(c30541Hu.LJLIL);
            BQO LIZ = C15650jR.LIZ();
            UrlModel urlModel = liveEffect.icon;
            if (urlModel != null) {
                list = urlModel.urlList;
            }
            C78720Uuy LJIIIIZZ = LIZ.LJIIIIZZ("live_effect_grid_list", list);
            LJIIIIZZ.LJIJI = Boolean.FALSE;
            LJIIIIZZ.LJIIIIZZ = R.drawable.cs_;
            LJIIIIZZ.LJIJ(ImageView.ScaleType.FIT_XY);
            int width = c30541Hu.LJLIL.getWidth();
            int height = c30541Hu.LJLIL.getHeight();
            LJIIIIZZ.LJ = width;
            LJIIIIZZ.LJFF = height;
            LJIIIIZZ.LJIIJJI = new C40781is(this, liveEffect);
            LJIIIIZZ.LJIIJJI(c30541Hu.LJLIL);
            C0U2.LIZ(c30541Hu.LJLILLLLZI);
            c30541Hu.LJLIL.animate().alpha(1.0f).setDuration(350L).setInterpolator(new LinearInterpolator());
        } else {
            c30541Hu.LJLIL.setAlpha(1.0f);
            C29306Beo.LJJLJLI(c30541Hu.LJLIL);
            BQO LIZ2 = C15650jR.LIZ();
            UrlModel urlModel2 = liveEffect.icon;
            if (urlModel2 != null) {
                list = urlModel2.urlList;
            }
            C78720Uuy LJIIIIZZ2 = LIZ2.LJIIIIZZ("live_effect_grid_list", list);
            LJIIIIZZ2.LJIJI = Boolean.FALSE;
            LJIIIIZZ2.LJIIIIZZ = R.drawable.cs_;
            LJIIIIZZ2.LJIJ(ImageView.ScaleType.FIT_XY);
            int width2 = c30541Hu.LJLIL.getWidth();
            int height2 = c30541Hu.LJLIL.getHeight();
            LJIIIIZZ2.LJ = width2;
            LJIIIIZZ2.LJFF = height2;
            LJIIIIZZ2.LJIIJJI = new C40781is(this, liveEffect);
            LJIIIIZZ2.LJIIJJI(c30541Hu.LJLIL);
        }
        liveEffect.loadingSpecialIcon = false;
    }

    public final void LLJJLIIIJLLLLLLLZ(C30541Hu c30541Hu, LiveEffect liveEffect) {
        List<String> list;
        if (C29306Beo.LJJIIJ(c30541Hu.LJLILLLLZI)) {
            return;
        }
        c30541Hu.LJLILLLLZI.setAlpha(0.0f);
        C29306Beo.LJJLJLI(c30541Hu.LJLILLLLZI);
        BQO LIZ = C15650jR.LIZ();
        UrlModel urlModel = liveEffect.icon;
        if (urlModel != null) {
            list = urlModel.urlList;
        } else {
            list = null;
        }
        C78720Uuy LJIIIIZZ = LIZ.LJIIIIZZ("live_effect_grid_list", list);
        LJIIIIZZ.LJIJI = Boolean.FALSE;
        LJIIIIZZ.LJIIIIZZ = R.drawable.cs_;
        LJIIIIZZ.LJIJ(ImageView.ScaleType.FIT_XY);
        C47171tB iconView = c30541Hu.LJLILLLLZI.getIconView();
        if (iconView != null) {
            int width = iconView.getWidth();
            C47171tB iconView2 = c30541Hu.LJLILLLLZI.getIconView();
            if (iconView2 != null) {
                int height = iconView2.getHeight();
                LJIIIIZZ.LJ = width;
                LJIIIIZZ.LJFF = height;
                LJIIIIZZ.LJIIJJI = new C40781is(this, liveEffect);
                LJIIIIZZ.LJIIJJI(c30541Hu.LJLILLLLZI.getIconView());
                C0U2.LIZ(c30541Hu.LJLIL);
                c30541Hu.LJLILLLLZI.animate().alpha(1.0f).setDuration(350L).setInterpolator(new LinearInterpolator());
                liveEffect.loadingSpecialIcon = true;
            }
        }
    }

    @Override // X.C40771ir, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c30541Hu;
        View LIZ;
        o.LJIIIZ(parent, "parent");
        if (i == C6NP.NONE.getValue()) {
            c30541Hu = new C30531Ht(C1FL.LIZIZ(parent, R.layout.d30, parent, false, "from(parent.context).inf…e_sticker, parent, false)"));
        } else {
            if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                LIZ = C20780ri.LIZJ(R.layout.d2z, parent, false);
            } else {
                LIZ = C28289B8j.LIZ(parent, R.layout.d2z, parent, false);
            }
            o.LJIIIIZZ(LIZ, "if (LiveUltimateInflateS…se)\n                    }");
            c30541Hu = new C30541Hu(LIZ);
        }
        C0AX.LIZ(parent, c30541Hu.itemView, R.id.lj7);
        View view = c30541Hu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c30541Hu.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c30541Hu.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c30541Hu.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c30541Hu.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c30541Hu.getClass().getName();
        return c30541Hu;
    }

    @Override // X.C40771ir, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIIJLIL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C40771ir, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIILII(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C40771ir, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIIZ(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C40771ir
    /* renamed from: LLILZIL */
    public final void LLIIJLIL(RecyclerView.ViewHolder holder, LiveEffect effect, int i) {
        DataChannel dataChannel;
        C30531Ht c30531Ht;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        super.LLIIJLIL(holder, effect, i);
        View view = null;
        if ((holder instanceof C30531Ht) && (c30531Ht = (C30531Ht) holder) != null) {
            view = c30531Ht.LJLIL;
        }
        C29306Beo.LJJLJLI(view);
        if ((holder instanceof C30541Hu) && C78880UxY.LJLIIIL(effect) && C29306Beo.LJIILLIIL(Boolean.valueOf(effect.loadingSpecialIcon)) && (dataChannel = this.LLD) != null && o.LJ(dataChannel.kv0(C54542Cc.class), Boolean.TRUE)) {
            this.LLD.qv0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
        }
    }

    @Override // X.C40771ir
    /* renamed from: LLILZLL */
    public final void LLIILII(RecyclerView.ViewHolder holder, LiveEffect effect, int i) {
        C30531Ht c30531Ht;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        super.LLIILII(holder, effect, i);
        View view = null;
        if ((holder instanceof C30531Ht) && (c30531Ht = (C30531Ht) holder) != null) {
            view = c30531Ht.LJLIL;
        }
        C29306Beo.LJIIIZ(view);
        if (holder instanceof C30541Hu) {
            C30541Hu c30541Hu = (C30541Hu) holder;
            if (C29306Beo.LJJIIJ(c30541Hu.LJLILLLLZI)) {
                LLJJL(c30541Hu, effect);
            }
        }
    }

    @Override // X.C40771ir
    /* renamed from: LLIZ */
    public final void LLIIZ(RecyclerView.ViewHolder holder, LiveEffect sticker, int i) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        if (holder instanceof C30531Ht) {
            C29306Beo.LJJLIIIJJI(((C30531Ht) holder).LJLIL, C77412UZs.LJJIII(this.LJLJJL));
            C16880lQ.LJIIJ(new IDCListenerS83S0200000(holder, this, 8), holder.itemView);
        } else {
            if (!(holder instanceof C30541Hu)) {
                return;
            }
            super.LLIIZ(holder, sticker, i);
        }
    }

    public final void LLJLIL(List<? extends LiveEffect> effectList, LiveEffect liveEffect, boolean z) {
        o.LJIIIZ(effectList, "effectList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(effectList);
        C03150Al LIZ = C03200Aq.LIZ(new C29591Ed(this.LJLIL, arrayList), true);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(arrayList);
        LIZ.LIZJ(this);
        if (liveEffect != null) {
            LLJJJIL();
            if (z) {
                LLJJIJIIJIL(liveEffect);
            }
        } else {
            liveEffect = new LiveEffect();
        }
        LLIL(liveEffect);
    }
}
