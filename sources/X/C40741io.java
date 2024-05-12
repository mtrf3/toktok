package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS40S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40741io extends C1KD<RecyclerView.ViewHolder, LiveEffect> {
    public final DataChannel LJLILLLLZI;
    public final StickerEffectViewModel LJLJI;
    public boolean LJLJJI;
    public LiveEffect LJLJJL;
    public LiveEffect LJLJJLL;
    public InterfaceC88472Yns<? super LiveEffect, C76800UCe> LJLJL;
    public boolean LJLJLJ;

    public void LLILL() {
        throw null;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.C1KD
    public final void LL(int i) {
        super.LL(i);
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect = this.LJLJJL;
        LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LJLIL, i);
        c30522ByQ.getClass();
        if (C30522ByQ.LIZ(liveEffect, liveEffect2) && this.LJLJL != null) {
            LLILII((LiveEffect) ListProtector.get(this.LJLIL, i));
        }
    }

    public final boolean LLIL(LiveEffect liveEffect) {
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

    public final void LLILII(LiveEffect liveEffect) {
        this.LJLJJL = null;
        LiveEffect liveEffect2 = this.LJLJJLL;
        if (liveEffect2 != null) {
            LLFII(ORZ.LJZ(liveEffect2, this.LJLIL));
        }
        if (o.LJ(liveEffect, this.LJLJJLL)) {
            this.LJLJJLL = null;
            InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns = this.LJLJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(null);
                return;
            }
            return;
        }
        this.LJLJJLL = liveEffect;
        InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns2 = this.LJLJL;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(liveEffect);
        }
        LLFFF(ORZ.LJZ(liveEffect, this.LJLIL));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((LiveEffect) ListProtector.get(this.LJLIL, i)).localViewType.getValue();
    }

    public C40741io(DataChannel dataChannel, StickerEffectViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = viewModel;
    }

    public void LLILIL(View view, final LiveEffect liveEffect) {
        String str;
        String str2;
        o.LJIIIZ(liveEffect, "liveEffect");
        o.LJIIIZ(view, "view");
        if (!liveEffect.isShareBackground ? !liveEffect.isDownloaded : (str2 = liveEffect.shareImagePath) == null || str2.length() <= 0 || !C1B6.LIZIZ(str2)) {
            if (liveEffect.isDownloading) {
                return;
            }
            this.LJLJJL = liveEffect;
            if (C77412UZs.LJIL(liveEffect)) {
                StickerEffectViewModel viewModel = this.LJLJI;
                DataChannel dataChannel = this.LJLILLLLZI;
                o.LJIIIZ(viewModel, "viewModel");
                LJZL(liveEffect);
                long currentTimeMillis = System.currentTimeMillis();
                List<? extends LiveEffect> list = liveEffect.subStickers;
                if (list != null) {
                    boolean z = true;
                    for (LiveEffect liveEffect2 : list) {
                        if (viewModel.iv0(liveEffect2)) {
                            liveEffect2.isDownloaded = true;
                            liveEffect2.isDownloading = false;
                        } else {
                            liveEffect.isDownloaded = false;
                            liveEffect.isDownloading = true;
                            C0G6.LIZ(liveEffect2, (C20G) this, viewModel, dataChannel, liveEffect, Long.valueOf(currentTimeMillis));
                            z = false;
                        }
                    }
                    if (!z) {
                        return;
                    }
                }
                LLD(liveEffect);
                return;
            }
            if (liveEffect.isShareBackground) {
                final DataChannel dataChannel2 = this.LJLILLLLZI;
                String str3 = liveEffect.shareImageUrl;
                if (str3 == null || (str = liveEffect.shareImageId) == null) {
                    return;
                }
                final C31824CeK c31824CeK = new C31824CeK(str, EnumC31874Cf8.SHARE_EFFECT, null, null, str3, null, false, 3, false, 748);
                final C20G c20g = (C20G) this;
                C79258V8s.LIZ.LIZIZ(c31824CeK, new InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe>() { // from class: X.1ip
                    @Override // X.InterfaceC88472Yns
                    public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
                        InterfaceC72996Skq cb = interfaceC72996Skq;
                        o.LJIIIZ(cb, "cb");
                        cb.LIZ(new IDqS172S0200000(c20g, LiveEffect.this, 4));
                        cb.LIZLLL(new IDqS28S0300000(LiveEffect.this, c31824CeK, c20g, 5));
                        cb.LIZIZ(new IDqS172S0200000(c20g, LiveEffect.this, 5));
                        cb.LIZJ(new IDqS40S0300000(LiveEffect.this, c20g, dataChannel2, 0));
                        return C76800UCe.LIZ;
                    }
                });
                return;
            }
            C0G6.LIZ(liveEffect, (C20G) this, this.LJLJI, this.LJLILLLLZI, null, null);
            return;
        }
        LLILII(liveEffect);
    }

    public final void LLILLIZIL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect) {
        C30541Hu c30541Hu;
        C74282TDi c74282TDi;
        int i = 0;
        if (!liveEffect.isDownloaded && (this.LJLJI.iv0(liveEffect) || C78880UxY.LJJJJJL(liveEffect))) {
            liveEffect.isDownloaded = true;
            liveEffect.isDownloading = false;
        }
        if (!(viewHolder instanceof C30541Hu) || (c30541Hu = (C30541Hu) viewHolder) == null || (c74282TDi = c30541Hu.LJLJJI) == null) {
            return;
        }
        if (!liveEffect.isDownloading) {
            i = 8;
        }
        c74282TDi.setVisibility(i);
    }

    @Override // X.C1KD
    public final void LLIFFJFJJ(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View view = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJJLL;
        }
        C29306Beo.LJJLJLI(view);
    }

    @Override // X.C1KD
    public final void LLII(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C74282TDi c74282TDi = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            c74282TDi = c30541Hu.LJLJJI;
        }
        C29306Beo.LJIIIZ(c74282TDi);
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
        C74282TDi c74282TDi = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            c74282TDi = c30541Hu.LJLJJI;
        }
        C29306Beo.LJIIIZ(c74282TDi);
    }

    @Override // X.C1KD
    public final void LLIIIJ(RecyclerView.ViewHolder holder, Object obj, int i) {
        C30541Hu c30541Hu;
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            LLILLIZIL(c30541Hu, effect);
            if (i >= 0) {
                c30541Hu.LJLJJI.setProgress(i);
            }
        }
    }

    @Override // X.C1KD
    public final void LLIIJLIL(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View view = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJI;
        }
        C29306Beo.LJJLJLI(view);
    }

    @Override // X.C1KD
    public final void LLIIL(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View view = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJJLL;
        }
        C29306Beo.LJI(view);
    }

    @Override // X.C1KD
    public final void LLIILII(int i, RecyclerView.ViewHolder holder, Object effect) {
        C30541Hu c30541Hu;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View view = null;
        if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
            view = c30541Hu.LJLJI;
        }
        C29306Beo.LJIIIZ(view);
    }
}
