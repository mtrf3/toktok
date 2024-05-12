package X;

import Y.IDcS169S0100000;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastImageCacheRefactorSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40771ir extends C1KD<RecyclerView.ViewHolder, LiveEffect> {
    public final DataChannel LJLILLLLZI;
    public final C32001Nk LJLJI;
    public final StickerEffectViewModel LJLJJI;
    public LiveEffect LJLJJL;
    public LiveEffect LJLJJLL;
    public boolean LJLJL;
    public final List<LiveEffect> LJLJLJ;
    public InterfaceC88472Yns<? super LiveEffect, C76800UCe> LJLJLLL;
    public LiveEffect LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public C15600jM LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public XKQ LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final C29611Ef LJZL;
    public final C29621Eg LL;

    public final void LLJ() {
        C15600jM c15600jM;
        this.LJLLILLLL = true;
        if (this.LJLLI && C0LU.LIZLLL(this.LJLJJL) && (c15600jM = this.LJLLJ) != null) {
            c15600jM.LIZ();
        }
    }

    public final void LLJI() {
        C15600jM c15600jM;
        this.LJLLILLLL = false;
        if (this.LJLLI && C0LU.LIZLLL(this.LJLJJL) && (c15600jM = this.LJLLJ) != null) {
            c15600jM.LIZJ();
        }
        if (this.LJLLL) {
            C32041No.LJIILL(C0LU.LIZ, this.LJLILLLLZI);
        }
        LLJJJJ();
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    public final int LLILLIZIL() {
        return ((Number) C29306Beo.LJ(new IDqS416S0100000(this, 22), this.LJLIL).getSecond()).intValue();
    }

    public final void LLJILJIL() {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.mv0(StickerSelectChannel.class, this, new IDqS416S0100000(this, 23));
            dataChannel.mv0(StickerCancelChannel.class, this, new IDqS416S0100000(this, 24));
            dataChannel.mv0(MultiLiveRTCLayoutChannel.class, this, new IDqS416S0100000(this, 25));
            dataChannel.nv0(GreenScreenCreatorBlockChannel.class, this, new IDqS416S0100000(this, 26));
        }
        DataChannelGlobal.LJLJJI.ov0(BroadcastSceneGlobalChannel.class, this, new IDqS416S0100000(this, 27));
        this.LJLZ = XKX.LIZLLL(ViewModelKt.getViewModelScope(this.LJLJJI), null, null, new C539929z(this, null), 3);
    }

    public final void LLJILJILJ() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        XKQ xkq = this.LJLZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJJL = null;
        this.LJLL = null;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = null;
        this.LJLLL = false;
    }

    public final void LLJJJIL() {
        int intValue = ((Number) C29306Beo.LJ(C46551sB.LJLIL, this.LJLIL).getSecond()).intValue();
        if (intValue >= 0 && intValue < ((ArrayList) this.LJLIL).size()) {
            LLFII(intValue);
        }
    }

    public final void LLJJJJ() {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect.forbidInLink) {
                    if (LLILLJJLI(liveEffect)) {
                        if (i < ((ArrayList) this.LJLIL).size()) {
                            notifyItemChanged(i, "item_lock");
                        }
                    } else if (i < ((ArrayList) this.LJLIL).size()) {
                        notifyItemChanged(i, "item_unlock");
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LLIL(LiveEffect selectSticker) {
        o.LJIIIZ(selectSticker, "selectSticker");
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next(), this.LJLJJL)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (selectSticker.isSubItem()) {
            Iterator it2 = ((ArrayList) this.LJLIL).iterator();
            while (it2.hasNext()) {
                if (o.LJ(((LiveEffect) it2.next()).getResourceId(), selectSticker.parentResId)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            Iterator it3 = ((ArrayList) this.LJLIL).iterator();
            while (it3.hasNext()) {
                if (o.LJ(it3.next(), selectSticker)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        }
        this.LJLJJL = selectSticker;
        if (i2 != i) {
            if (i2 != -1) {
                LLFII(i2);
            }
            if (i != -1) {
                LLFFF(i);
            }
        }
    }

    public final LiveEffect LLILII(String str) {
        LiveEffect liveEffect;
        Object obj;
        Iterator it = this.LJLIL.iterator();
        while (true) {
            liveEffect = null;
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((LiveEffect) obj).getResourceId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) obj;
        if (liveEffect2 == null) {
            Iterator<LiveEffect> it2 = this.LJLJLJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LiveEffect next = it2.next();
                if (o.LJ(next.getResourceId(), str)) {
                    liveEffect = next;
                    break;
                }
            }
            return liveEffect;
        }
        return liveEffect2;
    }

    public final int LLILIL(String str) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((LiveEffect) it.next()).getResourceId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int LLILL(LiveEffect liveEffect) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str = null;
            if (i >= 0) {
                LiveEffect liveEffect2 = (LiveEffect) next;
                LiveEffect.Companion.getClass();
                if (C30522ByQ.LIZ(liveEffect2, liveEffect) && liveEffect != null) {
                    return i;
                }
                o.LJIIIZ(liveEffect2, "<this>");
                if (liveEffect != null) {
                    str = liveEffect.parentEffectId;
                }
                if (o.LJ(str, String.valueOf(liveEffect2.effectId)) && C29306Beo.LJIJJLI(liveEffect.parentEffectId)) {
                    return i;
                }
                if (C77412UZs.LJJIII(liveEffect) && C77412UZs.LJJIII(liveEffect2)) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public final boolean LLILLJJLI(LiveEffect liveEffect) {
        Boolean bool;
        C75233Tfp c75233Tfp;
        if (!liveEffect.forbidInLink) {
            return false;
        }
        C37 c37 = (C37) DataChannelGlobal.LJLJJI.mv0(BroadcastSceneGlobalChannel.class);
        Boolean bool2 = null;
        if (c37 != null) {
            bool = Boolean.valueOf(c37.isLink());
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (c75233Tfp = (C75233Tfp) dataChannel.kv0(MultiLiveRTCLayoutChannel.class)) != null) {
            bool2 = Boolean.valueOf(c75233Tfp.L());
        }
        boolean LJIILLIIL = C29306Beo.LJIILLIIL(bool2);
        if (!LJJIFFI && !LJIILLIIL) {
            return false;
        }
        return true;
    }

    public final void LLJIJIL(LiveEffect liveEffect) {
        this.LJLL = null;
        LiveEffect liveEffect2 = this.LJLJJL;
        this.LJLJJL = liveEffect;
        LiveEffect.Companion.getClass();
        if (C30522ByQ.LIZ(liveEffect, liveEffect2)) {
            this.LJLJJL = null;
        } else {
            LiveEffect liveEffect3 = this.LJLJJL;
            if (liveEffect3 != null) {
                liveEffect3.logParams.LIZIZ = C0LU.LIZLLL(liveEffect3);
                Integer valueOf = Integer.valueOf(ORZ.LJZ(this.LJLJJL, this.LJLIL));
                liveEffect3.parentImpressionPos = valueOf;
                liveEffect3.impressionPos = valueOf;
                List<? extends LiveEffect> list = liveEffect.subStickers;
                if (list != null) {
                    int i = 0;
                    for (LiveEffect liveEffect4 : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            LiveEffect liveEffect5 = liveEffect4;
                            liveEffect5.impressionPos = Integer.valueOf(i);
                            liveEffect5.parentImpressionPos = liveEffect3.parentImpressionPos;
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
        }
        if (liveEffect2 != null) {
            if (((ArrayList) this.LJLIL).contains(liveEffect2)) {
                LLFII(((ArrayList) this.LJLIL).indexOf(liveEffect2));
            }
        } else {
            LLJJJIL();
        }
        InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLJJL);
        }
        LLFFF(LLILL(this.LJLJJL));
    }

    public final void LLJILLL(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_conflict_popup");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        C06490Nh.LIZLLL(LIZ, "background", "conflict_function", str, "action_type");
    }

    public final void LLJJIJIIJIL(LiveEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        if (C77412UZs.LJIL(sticker)) {
            if (C78880UxY.LJJJJJL(sticker)) {
                LLJIJIL(sticker);
                return;
            }
            if (sticker.isDownloading) {
                return;
            }
            int indexOf = ((ArrayList) this.LJLIL).indexOf(sticker);
            sticker.parentImpressionPos = Integer.valueOf(indexOf);
            if (indexOf >= 0) {
                ((LiveEffect) ListProtector.get(this.LJLIL, indexOf)).parentImpressionPos = Integer.valueOf(indexOf);
            }
            this.LJLL = sticker;
            List<? extends LiveEffect> list = sticker.subStickers;
            if (list == null) {
                return;
            }
            for (LiveEffect liveEffect : list) {
                if (!this.LJLJJI.iv0(liveEffect)) {
                    sticker.isDownloaded = false;
                    sticker.isDownloading = true;
                    this.LJLJJI.gv0(liveEffect, this.LJZL);
                } else {
                    liveEffect.isDownloaded = true;
                    liveEffect.isDownloading = false;
                }
            }
            return;
        }
        if (this.LJLJJI.iv0(sticker)) {
            LLJIJIL(sticker);
        } else {
            if (sticker.isDownloading) {
                return;
            }
            this.LJLL = sticker;
            sticker.isDownloading = true;
            this.LJLJJI.gv0(sticker, this.LL);
        }
    }

    public final void LLJJIJIL(LiveEffect liveEffect) {
        String str;
        String str2;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        if (C29306Beo.LJIIJ(this.LJLILLLLZI) || C29306Beo.LJJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_anchor");
        C77412UZs.LJJIIZ(LIZ, liveEffect);
        C32001Nk c32001Nk = this.LJLJI;
        if (c32001Nk != null) {
            str2 = c32001Nk.LJLILLLLZI;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "tab");
        LIZ.LJJIIJZLJL();
        LLJJIJIIJIL(liveEffect);
    }

    public final void LLJJJ(LiveEffect liveEffect) {
        Boolean bool;
        LiveEffect liveEffect2;
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect3 = this.LJLJJL;
        c30522ByQ.getClass();
        if (!C30522ByQ.LIZ(liveEffect3, liveEffect)) {
            LLFII(LLILL(this.LJLJJL));
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            LiveEffect liveEffect4 = (LiveEffect) dataChannelGlobal.mv0(C2BW.class);
            if (liveEffect4 != null) {
                bool = Boolean.valueOf(C78880UxY.LJJJJL(liveEffect4, liveEffect));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                liveEffect2 = (LiveEffect) dataChannelGlobal.mv0(C2BW.class);
            } else {
                liveEffect2 = liveEffect;
            }
            this.LJLJJL = liveEffect2;
        }
        LLFFF(LLILL(liveEffect));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((LiveEffect) ListProtector.get(this.LJLIL, i)).localViewType.getValue();
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null && (c30541Hu instanceof C41231jb)) {
            C41231jb c41231jb = (C41231jb) c30541Hu;
            C15600jM c15600jM = c41231jb.LJLJL;
            if (c15600jM != null) {
                c15600jM.LIZ();
            }
            c41231jb.LJLJL = null;
            this.LJLLJ = null;
            c30541Hu.LJLIL.setController(null);
            this.LJLLL = false;
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null && (c30541Hu instanceof C41231jb)) {
            C41231jb c41231jb = (C41231jb) c30541Hu;
            C15600jM c15600jM = c41231jb.LJLJL;
            if (c15600jM != null) {
                c15600jM.LIZ();
            }
            c41231jb.LJLJL = null;
            this.LJLLJ = null;
            c30541Hu.LJLIL.setController(null);
            this.LJLLL = false;
        }
    }

    public void LLILZ(C30541Hu holder, LiveEffect sticker) {
        int i;
        int i2;
        int i3;
        List<String> list;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        int LIZ = C15380j0.LIZ(56.0f);
        C29306Beo.LJI(holder.itemView.findViewById(R.id.csj));
        C29306Beo.LJJLIIIJJIZ(LIZ - C15380j0.LIZ(2.0f), LIZ - C15380j0.LIZ(2.0f), holder.LJLIL);
        C29306Beo.LJJLIIIJJIZ(LIZ, LIZ, holder.LJLJI);
        View view = holder.LJLJI;
        if (U4D.LIZ()) {
            i = R.drawable.cr5;
        } else {
            i = R.drawable.cr4;
        }
        view.setBackgroundResource(i);
        if (LiveBroadcastImageCacheRefactorSetting.INSTANCE.getValue()) {
            i2 = holder.LJLIL.getLayoutParams().width;
            i3 = holder.LJLIL.getLayoutParams().height;
        } else {
            i2 = -1;
            i3 = -1;
        }
        BQO LIZ2 = C15650jR.LIZ();
        UrlModel urlModel = sticker.icon;
        if (urlModel != null) {
            list = urlModel.urlList;
        } else {
            list = null;
        }
        LIZ2.LJIIIIZZ("live_effect_grid_list", list);
        LIZ2.LIZJ(Boolean.FALSE);
        if (!EffectParseOptSetting.enableOpt()) {
            LIZ2.LJ(new C40781is(this, sticker));
        }
        C78720Uuy LJII = LIZ2.LJII(R.drawable.cs_);
        LJII.LJIJ(ImageView.ScaleType.FIT_XY);
        LJII.LJI = i2;
        LJII.LJII = i3;
        LJII.LJIIJJI(holder.LJLIL);
    }

    public void LLIZLLLIL(RecyclerView.ViewHolder holder, LiveEffect sticker) {
        String str;
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(holder, "holder");
        if (C1HK.LJLJI) {
            return;
        }
        if (this.LJZ && C29306Beo.LJJIFFI(Boolean.valueOf(sticker.isGreenScreen))) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel == null || (str = (String) dataChannel.kv0(BDG.class)) == null) {
                str = "";
            }
            C30868C9o.LJIIJJI(C29306Beo.LIZIZ(holder.itemView.getContext()), str);
            return;
        }
        if (LLILLJJLI(sticker)) {
            C30868C9o.LIZJ(R.string.l6p);
            return;
        }
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        LLJJIJI(sticker, context);
    }

    public final void LLJJIJI(final LiveEffect liveEffect, Context context) {
        if (C79081V1x.LJJIFFI()) {
            if (!this.LJZI) {
                this.LJZI = true;
                LLJILLL("show");
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LJIILLIIL(R.string.m9s);
                c47071t1.LJFF(R.string.m9r);
                c47071t1.LJIIL(R.string.m9p, new C0K7() { // from class: X.1Eh
                    @Override // X.C0K7
                    public final void LJIILLIIL(LiveDialog liveDialog) {
                        C40771ir.this.LLJILLL("confirm");
                        C79081V1x.LJJIJIIJIL(C40771ir.this.LJLILLLLZI);
                        liveDialog.dismiss();
                        C40771ir c40771ir = C40771ir.this;
                        c40771ir.LJZI = false;
                        c40771ir.LLJJIJIL(liveEffect);
                    }
                });
                c47071t1.LJIIIZ(R.string.m9q, new IDcS169S0100000(this, 2));
                c47071t1.LJIILJJIL = false;
                c47071t1.LJIILL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "7013921197953610930")).LIZ) {
                    return;
                }
                LIZ.show();
                return;
            }
            return;
        }
        LLJJIJIL(liveEffect);
    }

    public final void LLJJJJLIIL(C30541Hu c30541Hu, LiveEffect liveEffect) {
        int i = 0;
        if (!liveEffect.isDownloaded && (this.LJLJJI.iv0(liveEffect) || C78880UxY.LJJJJJL(liveEffect))) {
            liveEffect.isDownloaded = true;
            liveEffect.isDownloading = false;
        }
        C74282TDi c74282TDi = c30541Hu.LJLJJI;
        if (!liveEffect.isDownloading) {
            i = 8;
        }
        c74282TDi.setVisibility(i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c30541Hu;
        o.LJIIIZ(parent, "parent");
        if (i == C6NP.RECOMMEND_STICKER.getValue() && this.LJLLI && o.LJ(this.LJLLLL, C0TY.LIZIZ)) {
            c30541Hu = new C41231jb(C1FL.LIZIZ(parent, R.layout.d2r, parent, false, "from(parent.context)\n   …_composer, parent, false)"));
        } else {
            c30541Hu = new C30541Hu(C1FL.LIZIZ(parent, R.layout.d2r, parent, false, "from(parent.context)\n   …_composer, parent, false)"));
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

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ef] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Eg] */
    public C40771ir(DataChannel dataChannel, C32001Nk c32001Nk, StickerEffectViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = c32001Nk;
        this.LJLJJI = viewModel;
        this.LJLJLJ = new ArrayList();
        this.LJLLLL = C0TY.LIZIZ;
        this.LJZL = new C0WN() { // from class: X.1Ef
            public long LIZ;

            @Override // X.C0WN
            public final void LJFF(int i, Effect effect) {
            }

            @Override // X.C0WN
            public final void LJI(Effect effect) {
                String str;
                C40771ir c40771ir = C40771ir.this;
                String str2 = null;
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                LiveEffect LLILII = c40771ir.LLILII(str);
                if (LLILII != null) {
                    LLILII.isDownloaded = false;
                    LLILII.isDownloading = false;
                } else {
                    LLILII = null;
                }
                C40771ir c40771ir2 = C40771ir.this;
                if (c40771ir2.LJLLILLLL) {
                    return;
                }
                c40771ir2.LLJJIII(System.currentTimeMillis() - this.LIZ, LLILII, false);
                C40771ir c40771ir3 = C40771ir.this;
                if (LLILII != null) {
                    str2 = LLILII.parentResId;
                }
                c40771ir3.LJLZ(c40771ir3.LLILIL(str2));
                C30868C9o.LIZJ(R.string.mge);
            }

            @Override // X.C0WN
            public final void onStart(Effect effect) {
                String str;
                C40771ir c40771ir = C40771ir.this;
                String str2 = null;
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                LiveEffect LLILII = c40771ir.LLILII(str);
                if (LLILII != null) {
                    LLILII.isDownloaded = false;
                    LLILII.isDownloading = true;
                } else {
                    LLILII = null;
                }
                if (C40771ir.this.LJLLILLLL) {
                    return;
                }
                this.LIZ = System.currentTimeMillis();
                C40771ir c40771ir2 = C40771ir.this;
                if (LLILII != null) {
                    str2 = LLILII.parentResId;
                }
                c40771ir2.LJZI(c40771ir2.LLILIL(str2));
            }

            /* JADX WARN: Code restructure failed: missing block: B:61:0x004a, code lost:
            
                if (r3 != null) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
            @Override // X.C0WN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
                /*
                    Method dump skipped, instructions count: 225
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C29611Ef.onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
            }
        };
        this.LL = new C0WN() { // from class: X.1Eg
            public long LIZ;

            @Override // X.C0WN
            public final void LJI(Effect effect) {
                String str;
                C40771ir c40771ir = C40771ir.this;
                LiveEffect liveEffect = null;
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                LiveEffect LLILII = c40771ir.LLILII(str);
                if (LLILII != null) {
                    LLILII.isDownloaded = false;
                    LLILII.isDownloading = false;
                    liveEffect = LLILII;
                }
                C40771ir c40771ir2 = C40771ir.this;
                if (c40771ir2.LJLLILLLL) {
                    return;
                }
                c40771ir2.LLJJIII(System.currentTimeMillis() - this.LIZ, liveEffect, false);
                int LJZ = ORZ.LJZ(liveEffect, C40771ir.this.LJLIL);
                if (LJZ >= 0) {
                    C40771ir.this.LJLZ(LJZ);
                }
                C30868C9o.LIZJ(R.string.mge);
            }

            @Override // X.C0WN
            public final void onStart(Effect effect) {
                String str;
                int LJZ;
                C40771ir c40771ir = C40771ir.this;
                LiveEffect liveEffect = null;
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                LiveEffect LLILII = c40771ir.LLILII(str);
                if (LLILII != null) {
                    LLILII.isDownloaded = false;
                    LLILII.isDownloading = true;
                    liveEffect = LLILII;
                }
                C40771ir c40771ir2 = C40771ir.this;
                if (!c40771ir2.LJLLILLLL && (LJZ = ORZ.LJZ(liveEffect, c40771ir2.LJLIL)) >= 0) {
                    this.LIZ = System.currentTimeMillis();
                    C40771ir.this.LJZI(LJZ);
                }
            }

            @Override // X.C0WN
            public final void onSuccess(Effect effect) {
                String str;
                C30496By0 c30496By0;
                C40771ir c40771ir = C40771ir.this;
                LiveEffect liveEffect = null;
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                LiveEffect LLILII = c40771ir.LLILII(str);
                boolean z = false;
                if (LLILII != null) {
                    LLILII.isDownloaded = true;
                    LLILII.isDownloading = false;
                } else {
                    LLILII = null;
                }
                C40771ir c40771ir2 = C40771ir.this;
                if (c40771ir2.LJLLILLLL) {
                    return;
                }
                c40771ir2.LLJJIII(System.currentTimeMillis() - this.LIZ, LLILII, true);
                C40771ir.this.LLD(LLILII);
                C30522ByQ c30522ByQ = LiveEffect.Companion;
                LiveEffect liveEffect2 = C40771ir.this.LJLL;
                c30522ByQ.getClass();
                if (C30522ByQ.LIZ(liveEffect2, LLILII)) {
                    C40771ir c40771ir3 = C40771ir.this;
                    if (c40771ir3.LJLJLLL != null) {
                        LiveEffect liveEffect3 = c40771ir3.LJLJJL;
                        if (LLILII != null) {
                            C30496By0 c30496By02 = LLILII.logParams;
                            LiveEffect liveEffect4 = c40771ir3.LJLL;
                            if (liveEffect4 != null && (c30496By0 = liveEffect4.logParams) != null) {
                                z = c30496By0.LIZ;
                            }
                            c30496By02.LIZ = z;
                            liveEffect = LLILII;
                        }
                        c40771ir3.LJLJJL = liveEffect;
                        if (liveEffect3 != null && ((ArrayList) c40771ir3.LJLIL).contains(liveEffect3)) {
                            C40771ir c40771ir4 = C40771ir.this;
                            c40771ir4.LLFII(((ArrayList) c40771ir4.LJLIL).indexOf(liveEffect3));
                        }
                        C40771ir c40771ir5 = C40771ir.this;
                        InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns = c40771ir5.LJLJLLL;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(c40771ir5.LJLJJL);
                        }
                        C40771ir c40771ir6 = C40771ir.this;
                        c40771ir6.LLFFF(ORZ.LJZ(LLILII, c40771ir6.LJLIL));
                    }
                }
            }

            @Override // X.C0WN
            public final void LJFF(int i, Effect effect) {
                String str;
                C40771ir c40771ir = C40771ir.this;
                if (c40771ir.LJLLILLLL) {
                    return;
                }
                if (effect != null) {
                    str = effect.getResourceId();
                } else {
                    str = null;
                }
                int LLILIL = c40771ir.LLILIL(str);
                if (LLILIL >= 0) {
                    C40771ir.this.LLF(LLILIL, i);
                }
            }
        };
    }

    public static void LLILLL(ImageModel imageModel, View view, ImageView imageView) {
        C29306Beo.LJJLJLI(view);
        C29306Beo.LJJLJLI(imageView);
        C78720Uuy LJI = C15650jR.LIZ().LJI(imageView.getWidth(), imageView.getHeight());
        LJI.LJIIIZ(imageModel);
        LJI.LJIIL = Boolean.TRUE;
        LJI.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        LJI.LJIJI = Boolean.FALSE;
        LJI.LJIIJJI(imageView);
    }

    @Override // X.C1KD
    public final void LLIFFJFJJ(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            C29306Beo.LJJLJLI(c30541Hu.LJLJJLL);
        }
    }

    @Override // X.C1KD
    public final void LLII(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            C29306Beo.LJIIIZ(c30541Hu.LJLJJI);
        }
    }

    @Override // X.C1KD
    public final void LLIIII(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            C29306Beo.LJJLJLI(c30541Hu.LJLJJI);
            c30541Hu.LJLJJI.setProgress(0);
        }
    }

    @Override // X.C1KD
    public final void LLIIIILZ(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            C29306Beo.LJIIIZ(c30541Hu.LJLJJI);
        }
    }

    @Override // X.C1KD
    public final void LLIIIJ(RecyclerView.ViewHolder holder, Object obj, int i) {
        C30541Hu c30541Hu;
        LiveEffect sticker = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            LLJJJJLIIL(c30541Hu, sticker);
            if (i >= 0) {
                c30541Hu.LJLJJI.setProgress(i);
            }
        }
    }

    @Override // X.C1KD
    public final void LLIIL(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            C29306Beo.LJI(c30541Hu.LJLJJLL);
        }
    }

    @Override // X.C1KD
    /* renamed from: LLILZIL, reason: merged with bridge method [inline-methods] */
    public void LLIIJLIL(RecyclerView.ViewHolder holder, LiveEffect effect, int i) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C41231jb) && this.LJLLI && !this.LJLLILLLL) {
            C15600jM c15600jM = ((C41231jb) holder).LJLJL;
            if (c15600jM != null) {
                c15600jM.LIZJ();
            }
            if (C29306Beo.LJJIFFI(Boolean.valueOf(effect.logParams.LIZIZ))) {
                C32041No.LJII = C32041No.LJIJJLI(effect);
            }
            C48459J0d<java.util.Set<String>> c48459J0d = InterfaceC30442Bx8.w;
            c48459J0d.LIZJ().add(effect.getResourceId());
            c48459J0d.LIZLLL();
        }
        View view = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJI;
        }
        C29306Beo.LJJLJLI(view);
    }

    @Override // X.C1KD
    /* renamed from: LLILZLL, reason: merged with bridge method [inline-methods] */
    public void LLIILII(RecyclerView.ViewHolder holder, LiveEffect effect, int i) {
        C30541Hu c30541Hu;
        String str;
        AnimatedDrawable2 animatedDrawable2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View view = null;
        if (holder instanceof C41231jb) {
            C41231jb c41231jb = (C41231jb) holder;
            C15600jM c15600jM = c41231jb.LJLJL;
            if (c15600jM != null) {
                c15600jM.LIZ();
            }
            C15600jM c15600jM2 = c41231jb.LJLJL;
            if (c15600jM2 != null && (animatedDrawable2 = c15600jM2.LJIIIZ) != null) {
                animatedDrawable2.LJ(0);
            }
            String resourceId = effect.getResourceId();
            C08870Wl c08870Wl = C32041No.LJII;
            if (c08870Wl != null) {
                str = c08870Wl.LIZIZ;
            } else {
                str = null;
            }
            if (o.LJ(resourceId, str)) {
                C32041No.LJII = null;
            }
        }
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJI;
        }
        C29306Beo.LJIIIZ(view);
    }

    @Override // X.C1KD
    /* renamed from: LLIZ, reason: merged with bridge method [inline-methods] */
    public void LLIIZ(final RecyclerView.ViewHolder holder, final LiveEffect sticker, int i) {
        int i2;
        C15600jM c15600jM;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        holder.setIsRecyclable(false);
        if (holder instanceof C30541Hu) {
            C30541Hu c30541Hu = (C30541Hu) holder;
            LLJJJJLIIL(c30541Hu, sticker);
            C30522ByQ c30522ByQ = LiveEffect.Companion;
            LiveEffect liveEffect = this.LJLJJL;
            c30522ByQ.getClass();
            if (C30522ByQ.LIZ(liveEffect, sticker)) {
                LLIIJLIL(holder, sticker, i);
            } else {
                LLIILII(holder, sticker, i);
            }
            C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0G9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C40771ir.this.LLIZLLLIL(holder, sticker);
                }
            }, holder.itemView);
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LJLIL, i);
            C40641ie c40641ie = C40641ie.LJLIL;
            String resourceId = liveEffect2.getResourceId();
            c40641ie.getClass();
            o.LJIIIZ(resourceId, "resourceId");
            List list = (ArrayList) C40641ie.LJLJI.get(resourceId);
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    if (size != 2) {
                        ImageModel imageModel = (ImageModel) ListProtector.get(list, 2);
                        View findViewById = view.findViewById(R.id.d_z);
                        o.LJIIIIZZ(findViewById, "itemView.first_avatar_container");
                        ImageView imageView = (ImageView) view.findViewById(R.id.da0);
                        o.LJIIIIZZ(imageView, "itemView.first_avatar_image");
                        LLILLL(imageModel, findViewById, imageView);
                        ImageModel imageModel2 = (ImageModel) ListProtector.get(list, 1);
                        View findViewById2 = view.findViewById(R.id.jin);
                        o.LJIIIIZZ(findViewById2, "itemView.second_avatar_container");
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.jio);
                        o.LJIIIIZZ(imageView2, "itemView.second_avatar_image");
                        LLILLL(imageModel2, findViewById2, imageView2);
                        ImageModel imageModel3 = (ImageModel) ListProtector.get(list, 0);
                        View findViewById3 = view.findViewById(R.id.l69);
                        o.LJIIIIZZ(findViewById3, "itemView.third_avatar_container");
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.l6_);
                        o.LJIIIIZZ(imageView3, "itemView.third_avatar_image");
                        LLILLL(imageModel3, findViewById3, imageView3);
                    } else {
                        C29306Beo.LJI(view.findViewById(R.id.l69));
                        ((ImageView) view.findViewById(R.id.l6_)).setImageDrawable(null);
                        ImageModel imageModel4 = (ImageModel) ListProtector.get(list, 1);
                        View findViewById4 = view.findViewById(R.id.d_z);
                        o.LJIIIIZZ(findViewById4, "itemView.first_avatar_container");
                        ImageView imageView4 = (ImageView) view.findViewById(R.id.da0);
                        o.LJIIIIZZ(imageView4, "itemView.first_avatar_image");
                        LLILLL(imageModel4, findViewById4, imageView4);
                        ImageModel imageModel5 = (ImageModel) ListProtector.get(list, 0);
                        View findViewById5 = view.findViewById(R.id.jin);
                        o.LJIIIIZZ(findViewById5, "itemView.second_avatar_container");
                        ImageView imageView5 = (ImageView) view.findViewById(R.id.jio);
                        o.LJIIIIZZ(imageView5, "itemView.second_avatar_image");
                        LLILLL(imageModel5, findViewById5, imageView5);
                    }
                } else {
                    C29306Beo.LJI(view.findViewById(R.id.jin));
                    C29306Beo.LJI(view.findViewById(R.id.l69));
                    ((ImageView) view.findViewById(R.id.jio)).setImageDrawable(null);
                    ((ImageView) view.findViewById(R.id.l6_)).setImageDrawable(null);
                    ImageModel imageModel6 = (ImageModel) ListProtector.get(list, 0);
                    View findViewById6 = view.findViewById(R.id.d_z);
                    o.LJIIIIZZ(findViewById6, "itemView.first_avatar_container");
                    ImageView imageView6 = (ImageView) view.findViewById(R.id.da0);
                    o.LJIIIIZZ(imageView6, "itemView.first_avatar_image");
                    LLILLL(imageModel6, findViewById6, imageView6);
                }
            } else {
                C29306Beo.LJI(view.findViewById(R.id.d_z));
                C29306Beo.LJI(view.findViewById(R.id.jin));
                C29306Beo.LJI(view.findViewById(R.id.l69));
                ((ImageView) view.findViewById(R.id.da0)).setImageDrawable(null);
                ((ImageView) view.findViewById(R.id.jio)).setImageDrawable(null);
                ((ImageView) view.findViewById(R.id.l6_)).setImageDrawable(null);
            }
            if ((holder instanceof C41231jb) && C0LU.LIZLLL(sticker) && this.LJLLI) {
                final C41231jb c41231jb = (C41231jb) holder;
                if (C29306Beo.LJJIFFI(Boolean.valueOf(sticker.logParams.LIZIZ))) {
                    C32041No.LJII = C32041No.LJIJJLI(sticker);
                }
                int LIZ = C15380j0.LIZ(56.0f);
                int LJIIL = (LIZ * 2) + ((C15380j0.LJIIL() / 5) - LIZ);
                C29306Beo.LJJLIIIJJIZ(LJIIL, LJIIL, c41231jb.LJLJI);
                C29306Beo.LJJLIIIJJIZ(LJIIL - C15380j0.LIZ(10.0f), LJIIL - C15380j0.LIZ(10.0f), c41231jb.LJLIL);
                c41231jb.LJLJJI.setCircleRadius(C15380j0.LIZ(30.0f));
                c41231jb.LJLJJI.setStrokeWidth(C15380j0.LIZ(8.0f));
                C29306Beo.LJJLIIIJJIZ(LJIIL - C15380j0.LIZ(10.0f), LJIIL - C15380j0.LIZ(10.0f), c41231jb.LJLJJI);
                View view2 = c41231jb.LJLJI;
                if (U4D.LIZ()) {
                    i2 = R.drawable.cr3;
                } else {
                    i2 = R.drawable.cr2;
                }
                view2.setBackgroundResource(i2);
                C023107f.LIZJ((AppCompatTextView) c41231jb.itemView.findViewById(R.id.csj), 1);
                C023107f.LIZIZ((TextView) c41231jb.itemView.findViewById(R.id.csj), 12, 15, 1, 1);
                ((TextView) c41231jb.itemView.findViewById(R.id.csj)).setText(sticker.getName());
                C29306Beo.LJJLJLI(c41231jb.itemView.findViewById(R.id.csj));
                C15600jM c15600jM2 = new C15600jM();
                c15600jM2.LIZ = c41231jb.LJLIL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(sticker.urlPrefix);
                LIZ2.append('/');
                LIZ2.append(sticker.recommendPreviewIcon);
                c15600jM2.LIZJ = X1D.LIZIZ(LIZ2);
                c15600jM2.LIZLLL = false;
                c15600jM2.LJ = -1;
                c15600jM2.LJFF = 3000L;
                c15600jM2.LJI = 1000L;
                c15600jM2.LJII = true;
                c15600jM2.LIZIZ = new C76857UEj() { // from class: X.1it
                    public long LJLJI;
                    public boolean LJLJJI;

                    @Override // X.C76857UEj
                    public final void LJIIJ() {
                        C29306Beo.LJIIIZ(C41231jb.this.itemView.findViewById(R.id.csj));
                    }

                    @Override // X.C76857UEj
                    public final void LJIIIZ(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C29306Beo.LJJLJLI(C41231jb.this.itemView.findViewById(R.id.csj));
                        this.LJLJJI = true;
                    }

                    @Override // X.C76857UEj
                    public final void LJIIJJI(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C29306Beo.LJIIIZ(C41231jb.this.itemView.findViewById(R.id.csj));
                        this.LJLJI = SystemClock.elapsedRealtime();
                        this.LJLJJI = false;
                    }

                    @Override // X.C76857UEj
                    public final void LJIIL(int i3) {
                        String str;
                        C29306Beo.LJJLJLI(C41231jb.this.itemView.findViewById(R.id.csj));
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJI;
                        LiveEffect sticker2 = sticker;
                        boolean z = this.LJLJJI;
                        DataChannel dataChannel = this.LJLILLLLZI;
                        o.LJIIIZ(sticker2, "sticker");
                        String resourceId2 = sticker2.getResourceId();
                        C08870Wl c08870Wl = C32041No.LJII;
                        Boolean bool = null;
                        if (c08870Wl != null) {
                            str = c08870Wl.LIZIZ;
                        } else {
                            str = null;
                        }
                        if (!o.LJ(resourceId2, str)) {
                            return;
                        }
                        BZI LIZ3 = C28787BRn.LIZ("livesdk_live_take_rec_sticker_show_duration");
                        LIZ3.LJIILLIIL(dataChannel);
                        LIZ3.LJIJJ(Long.valueOf(elapsedRealtime), "duration");
                        LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish");
                        LIZ3.LJIJJ(Integer.valueOf(i3), "play_cnt");
                        C32041No.LJIJJ(LIZ3, C32041No.LJII);
                        C50461yU c50461yU = C50461yU.LJLIL;
                        C08870Wl c08870Wl2 = C32041No.LJII;
                        if (c08870Wl2 != null) {
                            bool = Boolean.valueOf(c08870Wl2.LJIILLIIL);
                        }
                        LIZ3.LJJI(Integer.valueOf(C29306Beo.LJJIFFI(bool) ? 1 : 0), "is_same_effect_scene", c50461yU);
                        C32041No.LIZIZ(LIZ3, C32041No.LJII);
                        LIZ3.LJJIIJZLJL();
                    }
                };
                c15600jM2.LIZIZ();
                c41231jb.LJLJL = c15600jM2;
                this.LJLLJ = c15600jM2;
                if (C30522ByQ.LIZ(sticker, this.LJLJJL) && !this.LJLLILLLL && (c15600jM = c41231jb.LJLJL) != null) {
                    c15600jM.LIZJ();
                }
                C32041No.LJIILL(sticker, this.LJLILLLLZI);
                this.LJLLL = true;
            } else {
                LLILZ(c30541Hu, sticker);
            }
            if (LLILLJJLI(sticker) || (this.LJZ && C29306Beo.LJJIFFI(Boolean.valueOf(sticker.isGreenScreen)))) {
                if (c30541Hu != null) {
                    C29306Beo.LJJLJLI(c30541Hu.LJLJJLL);
                }
            } else {
                if (c30541Hu == null) {
                    return;
                }
                C29306Beo.LJI(c30541Hu.LJLJJLL);
            }
        }
    }

    public final void LLJJI(long j, LiveEffect liveEffect, boolean z) {
        Object obj;
        if (V0Q.Default.nextFloat() < 0.002f) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_cover_download_time");
            LIZ.LJIILLIIL(this.LJLILLLLZI);
            C77412UZs.LJJIIZ(LIZ, liveEffect);
            C32001Nk c32001Nk = this.LJLJI;
            if (c32001Nk != null) {
                obj = c32001Nk.LJLILLLLZI;
            } else {
                obj = null;
            }
            LIZ.LJIJJ(obj, "tab");
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
            C30869C9p.LIZ(j, LIZ, "use_time");
        }
    }

    public void LLJJIII(long j, LiveEffect liveEffect, boolean z) {
        String str;
        if (liveEffect == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_download_time");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        C77412UZs.LJJIIZ(LIZ, liveEffect);
        LIZ.LJIJI(true);
        LIZ.LJIJJ(liveEffect.effectPanelKey, "tab");
        LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
        LIZ.LJIJJ(Long.valueOf(j), "use_time");
        if (C29306Beo.LJIIJ(this.LJLILLLLZI) || C29306Beo.LJJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_anchor");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJJIL(java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r12, boolean r13, com.bytedance.android.livesdkapi.depend.model.LiveEffect r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40771ir.LLJJJJJIL(java.util.List, boolean, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String):void");
    }
}
