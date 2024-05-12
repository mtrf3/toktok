package X;

import Y.IDCListenerS135S0100000;
import Y.IDCListenerS83S0200000;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48971w5 extends C40771ir {
    public final DataChannel LLD;
    public final C62822Ol8 LLF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48971w5(DataChannel dataChannel, StickerEffectViewModel viewModel) {
        super(dataChannel, null, viewModel);
        o.LJIIIZ(viewModel, "viewModel");
        this.LLD = dataChannel;
        this.LLF = C221108m2.LIZIZ(C48961w4.LJLIL);
    }

    @Override // X.C40771ir, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c30541Hu;
        o.LJIIIZ(parent, "parent");
        if (i == C6NP.NONE.getValue()) {
            c30541Hu = new C30531Ht(LLJJL(R.layout.d2v, parent, this));
        } else if (i == C6NP.MORE_V1.getValue()) {
            final View LLJJL = LLJJL(R.layout.d2t, parent, this);
            c30541Hu = new RecyclerView.ViewHolder(LLJJL) { // from class: X.1Hs
            };
        } else if (i == C6NP.MORE_V2.getValue()) {
            final View LLJJL2 = LLJJL(R.layout.d2u, parent, this);
            c30541Hu = new RecyclerView.ViewHolder(LLJJL2) { // from class: X.1Hs
            };
        } else {
            c30541Hu = new C30541Hu(LLJJL(R.layout.d2r, parent, this));
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

    public static final View LLJJL(int i, ViewGroup viewGroup, C48971w5 c48971w5) {
        View LIZ = C28289B8j.LIZ(viewGroup, i, viewGroup, false);
        LIZ.getLayoutParams().width = ((Number) c48971w5.LLF.getValue()).intValue();
        return LIZ;
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
        C30531Ht c30531Ht;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        super.LLIIJLIL(holder, effect, i);
        View view = null;
        if ((holder instanceof C30531Ht) && (c30531Ht = (C30531Ht) holder) != null) {
            view = c30531Ht.LJLIL;
        }
        C29306Beo.LJJLJLI(view);
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
    }

    @Override // X.C40771ir
    /* renamed from: LLIZ */
    public final void LLIIZ(RecyclerView.ViewHolder holder, LiveEffect sticker, int i) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        if (holder instanceof C30531Ht) {
            C29306Beo.LJJLIIIJJI(((C30531Ht) holder).LJLIL, C77412UZs.LJJIII(this.LJLJJL));
            C16880lQ.LJIIJ(new IDCListenerS83S0200000(this, holder, 6), holder.itemView);
        } else if (holder instanceof C30521Hs) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 65), holder.itemView);
        } else {
            super.LLIIZ(holder, sticker, i);
        }
    }

    @Override // X.C40771ir
    public final void LLJJIII(long j, LiveEffect liveEffect, boolean z) {
        String str;
        if (liveEffect == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_download_time");
        LIZ.LJIILLIIL(this.LLD);
        C77412UZs.LJJIIZ(LIZ, liveEffect);
        LIZ.LJIJI(true);
        LIZ.LJIJJ("props", "tab");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
        LIZ.LJIJJ(Long.valueOf(j), "use_time");
        if (C29306Beo.LJIIJ(this.LLD) || C29306Beo.LJJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_anchor");
        LIZ.LJJIIJZLJL();
    }
}
