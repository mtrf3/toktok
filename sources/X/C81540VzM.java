package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.VzM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81540VzM extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC81543VzP {
    public final WM7 LJLIL;
    public final ShortVideoContext LJLILLLLZI;
    public final InterfaceC84498XEg LJLJI;
    public final DuetLayoutModeViewModel LJLJJI;
    public List<? extends StickerWrapper> LJLJJL;
    public final ActivityC45651qj LJLJJLL;
    public int LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJL.size();
    }

    public final void LJLLLLLL(int i) {
        StickerWrapper stickerWrapper = (StickerWrapper) ORZ.LJLLLLLL(i, this.LJLJJL);
        if (stickerWrapper != null) {
            int i2 = this.LJLJL;
            if (i != i2) {
                notifyItemChanged(i2, Boolean.FALSE);
                notifyItemChanged(i, Boolean.TRUE);
                this.LJLJL = i;
            }
            DuetLayoutModeViewModel duetLayoutModeViewModel = this.LJLJJI;
            Effect effect = stickerWrapper.mEffect;
            duetLayoutModeViewModel.Zi0(W2T.LIZ(effect.getIconUrl()));
            duetLayoutModeViewModel.Jv0(effect, EHI.LIZ(effect), ID0.LJJIFFI(effect) ? 1 : 0, i);
        }
    }

    @Override // X.InterfaceC81543VzP
    public final void LJJLIIIJ(int i, boolean z) {
        String str;
        if (i < 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("position is invalid when click item.trace:\n");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            H7B.LJFF(X1D.LIZIZ(LIZ));
            return;
        }
        if (z) {
            Effect effect = ((StickerWrapper) ListProtector.get(this.LJLJJL, i)).mEffect;
            o.LJIIIIZZ(effect, "duetLayoutList[position].effect");
            DuetLayoutBean LIZIZ = EHI.LIZIZ(effect);
            if (LIZIZ == null || (str = LIZIZ.name) == null) {
                str = "";
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LJLILLLLZI.LJI());
            c145995oB.LJI("shoot_way", this.LJLILLLLZI.shootWay);
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("to_status", str);
            FMX.LJIIL("select_duet_layout", c145995oB.LIZ);
        }
        this.LJLILLLLZI.isDuetGreenSrceen = ID0.LJIJJLI(((StickerWrapper) ListProtector.get(this.LJLJJL, i)).mEffect, "green_screen");
        JediViewModel LIZ2 = C163726bg.LIZIZ(this.LJLJJLL, this.LJLIL).LIZ(ChangeDuetLayoutViewModel.class);
        Effect effect2 = ((StickerWrapper) ListProtector.get(this.LJLJJL, i)).mEffect;
        o.LJIIIIZZ(effect2, "duetLayoutList[position].effect");
        LIZ2.getClass();
        LIZ2.setState(new AqS173S0100000_7(effect2, 408));
        LJLLLLLL(i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        o.LJIIIZ(viewHolder, "viewHolder");
        C81541VzN c81541VzN = (C81541VzN) viewHolder;
        StickerWrapper stickerWrapper = (StickerWrapper) ListProtector.get(this.LJLJJL, i);
        if (i == this.LJLJL) {
            z = true;
        } else {
            z = false;
        }
        c81541VzN.L(stickerWrapper, z);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C81541VzN c81541VzN = new C81541VzN(C81399Vx5.LIZ(C16880lQ.LLZIL(viewGroup.getContext()), viewGroup), this.LJLJI, this);
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

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        ((C81541VzN) holder).LJLJJI.LJ(((Boolean) obj).booleanValue());
    }

    public C81540VzM(WM7 scene, ShortVideoContext shortVideoContext, InterfaceC84498XEg interfaceC84498XEg, DuetLayoutModeViewModel duetLayoutModeViewModel) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(duetLayoutModeViewModel, "duetLayoutModeViewModel");
        this.LJLIL = scene;
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = interfaceC84498XEg;
        this.LJLJJI = duetLayoutModeViewModel;
        this.LJLJJL = new ArrayList();
        Activity requireActivity = scene.requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLJJLL = (ActivityC45651qj) requireActivity;
    }
}
