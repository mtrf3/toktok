package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.U1z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76535U1z extends AbstractC029409q<U23> {
    public final List<LiveEffect> LJLIL;
    public final InterfaceC75222Tfe LJLILLLLZI;
    public String LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final DataChannel LJLJL;
    public final ACListenerS33S0100000_13 LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<LiveEffect> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(U23 u23, int i) {
        boolean z;
        U23 u232 = u23;
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LJLIL, i);
        if (TextUtils.equals(liveEffect.realId, "")) {
            u232.LJLJJI.setImageResource(R.drawable.cvr);
            u232.LJLJJI.getLayoutParams();
            int LIZ = C15380j0.LIZ(8.0f);
            u232.LJLJJI.setPadding(LIZ, LIZ, LIZ, LIZ);
        } else {
            C31665Cbl.LJ(liveEffect.icon.L(), u232.LJLJJI);
            u232.LJLJJI.setPadding(0, 0, 0, 0);
        }
        if (TextUtils.equals(this.LJLJI, liveEffect.realId)) {
            u232.LJLJI.setVisibility(0);
        } else {
            u232.LJLJI.setVisibility(8);
        }
        u232.LJLJJI.setTag(R.id.egd, liveEffect);
        C16880lQ.LJJI(u232.LJLJJI, this.LJLJLJ);
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u232.LJLIL.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new C018905p(-2, -1);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u232.LJLILLLLZI.getLayoutParams();
        if (marginLayoutParams2 == null) {
            marginLayoutParams2 = new C018905p(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams = u232.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            int i2 = this.LJLJJI;
            marginLayoutParams.width = i2;
            marginLayoutParams2.width = i2 / 2;
        } else if (z2) {
            int i3 = this.LJLJJI;
            marginLayoutParams.width = i3 / 2;
            marginLayoutParams2.width = i3;
        } else {
            int i4 = this.LJLJJI / 2;
            marginLayoutParams.width = i4;
            marginLayoutParams2.width = i4;
        }
        layoutParams.width = marginLayoutParams.width + marginLayoutParams2.width + this.LJLJJL;
        u232.itemView.setLayoutParams(layoutParams);
        u232.LJLIL.setLayoutParams(marginLayoutParams);
        u232.LJLILLLLZI.setLayoutParams(marginLayoutParams2);
        if (liveEffect.isDownloading) {
            u232.LJLJJL.setVisibility(0);
        } else {
            u232.LJLJJL.setVisibility(8);
        }
        if (!this.LJLILLLLZI.LIZ(liveEffect) && !TextUtils.equals(liveEffect.realId, "")) {
            u232.LJLJJLL.setVisibility(0);
        } else {
            u232.LJLJJLL.setVisibility(8);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final U23 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        U23 u23 = new U23(C28289B8j.LIZ(viewGroup, R.layout.dkm, viewGroup, false));
        C0AX.LIZ(viewGroup, u23.itemView, R.id.lj7);
        View view = u23.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (u23.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(U23.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) u23.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(u23.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = U23.class.getName();
        return u23;
    }

    public final void LJLLLLLL(int i, LiveEffect liveEffect, String str) {
        if (!C0TY.LIZJ.equals(str)) {
            return;
        }
        String str2 = liveEffect.realId;
        for (LiveEffect liveEffect2 : this.LJLIL) {
            if (TextUtils.equals(str2, liveEffect2.realId)) {
                if (i == 2) {
                    liveEffect2.isDownloading = false;
                    liveEffect2.isDownloaded = true;
                    if (TextUtils.equals(liveEffect2.realId, this.LJLJI)) {
                        this.LJLILLLLZI.LIZIZ(liveEffect2);
                        C74951TbH.LJIIIIZZ(liveEffect2, this.LJLJL);
                    }
                } else if (i == 3) {
                    liveEffect2.isDownloading = false;
                } else if (i == 1) {
                    liveEffect2.isDownloading = true;
                }
                try {
                    notifyItemChanged(this.LJLIL.indexOf(liveEffect2));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
    }

    public C76535U1z(Context context, List<LiveEffect> list, InterfaceC75222Tfe interfaceC75222Tfe, boolean z, DataChannel dataChannel) {
        String str;
        if (C74740TUy.LIZLLL().LJFF == null) {
            str = "";
        } else {
            str = C74740TUy.LIZLLL().LJFF.realId;
        }
        this.LJLJI = str;
        this.LJLJLJ = new ACListenerS33S0100000_13(this, 39);
        if (LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue() && list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                LiveEffect liveEffect = (LiveEffect) ListProtector.get(list, i);
                if (liveEffect != null) {
                    liveEffect.impressionPos = Integer.valueOf(i);
                    liveEffect.parentImpressionPos = Integer.valueOf(i);
                    liveEffect.effectPanelKey = "props";
                }
            }
        }
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC75222Tfe;
        int LJIIJJI = KL2.LJIIJJI(context);
        int LIZJ = (int) KL2.LIZJ(context, 56.0f);
        this.LJLJJL = LIZJ;
        this.LJLJJI = (LJIIJJI - (LIZJ * 5)) / 6;
        this.LJLJJLL = z;
        this.LJLJL = dataChannel;
    }
}
