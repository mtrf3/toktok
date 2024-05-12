package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS112S0101000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VzL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81539VzL extends AbstractC029409q<C81541VzN> implements InterfaceC81543VzP {
    public final ShortVideoContext LJLIL;
    public final InterfaceC84498XEg LJLILLLLZI;
    public final L48 LJLJI;
    public List<? extends StickerWrapper> LJLJJI;
    public int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    public final void LJLLLLLL(int i) {
        StickerWrapper stickerWrapper = (StickerWrapper) ORZ.LJLLLLLL(i, this.LJLJJI);
        if (stickerWrapper != null) {
            C6QQ.LIZ(new AqS112S0101000_14(i, this, 2));
            L48 l48 = this.LJLJI;
            Effect effect = stickerWrapper.mEffect;
            l48.LJLJJL.invoke(W2T.LIZ(effect.getIconUrl()));
            this.LJLJI.LJLJJLL.invoke(effect, Integer.valueOf(EHI.LIZ(effect)), Integer.valueOf(ID0.LJJIFFI(effect) ? 1 : 0), Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC81543VzP
    public final void LJJLIIIJ(int i, boolean z) {
        String str;
        if (z) {
            Effect effect = ((StickerWrapper) ListProtector.get(this.LJLJJI, i)).mEffect;
            o.LJIIIIZZ(effect, "duetLayoutList[position].effect");
            DuetLayoutBean LIZIZ = EHI.LIZIZ(effect);
            if (LIZIZ == null || (str = LIZIZ.name) == null) {
                str = "";
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LJLIL.LJI());
            c145995oB.LJI("shoot_way", this.LJLIL.shootWay);
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("to_status", str);
            FMX.LJIIL("select_duet_layout", c145995oB.LIZ);
        }
        this.LJLIL.isDuetGreenSrceen = ID0.LJIJJLI(((StickerWrapper) ListProtector.get(this.LJLJJI, i)).mEffect, "green_screen");
        InterfaceC88472Yns<Effect, C76800UCe> interfaceC88472Yns = this.LJLJI.LJLLI;
        Effect effect2 = ((StickerWrapper) ListProtector.get(this.LJLJJI, i)).mEffect;
        o.LJIIIIZZ(effect2, "duetLayoutList[position].effect");
        interfaceC88472Yns.invoke(effect2);
        LJLLLLLL(i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C81541VzN c81541VzN, int i) {
        boolean z;
        C81541VzN viewHolder = c81541VzN;
        o.LJIIIZ(viewHolder, "viewHolder");
        StickerWrapper stickerWrapper = (StickerWrapper) ListProtector.get(this.LJLJJI, i);
        if (i == this.LJLJJL) {
            z = true;
        } else {
            z = false;
        }
        viewHolder.L(stickerWrapper, z);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C81541VzN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C81541VzN c81541VzN = new C81541VzN(C81399Vx5.LIZ(C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLILLLLZI, this);
        C0AX.LIZ(viewGroup, c81541VzN.itemView, R.id.lj7);
        View view = c81541VzN.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c81541VzN.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C81541VzN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c81541VzN.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c81541VzN.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C81541VzN.class.getName();
        return c81541VzN;
    }

    public C81539VzL(ShortVideoContext shortVideoContext, InterfaceC84498XEg effectPlatform, L48 uiActions) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(uiActions, "uiActions");
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = effectPlatform;
        this.LJLJI = uiActions;
        this.LJLJJI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C81541VzN c81541VzN, int i, List payloads) {
        C81541VzN holder = c81541VzN;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        boolean z = false;
        if (payloads.isEmpty()) {
            StickerWrapper stickerWrapper = (StickerWrapper) ListProtector.get(this.LJLJJI, i);
            if (i == this.LJLJJL) {
                z = true;
            }
            holder.L(stickerWrapper, z);
            return;
        }
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        holder.LJLJJI.LJ(((Boolean) obj).booleanValue());
    }
}
