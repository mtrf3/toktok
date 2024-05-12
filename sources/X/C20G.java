package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.20G */
/* loaded from: classes.dex */
public final class C20G extends C40741io {
    public final DataChannel LJLJLLL;
    public final String LJLL;
    public InterfaceC30594Bza LJLLI;

    @Override // X.C40741io
    public final void LLILL() {
        if (C78886Uxe.LJJIZ(this.LJLL)) {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    LiveEffect liveEffect = (LiveEffect) next;
                    if (liveEffect.forbidInLink) {
                        if (LLIL(liveEffect)) {
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
    }

    @Override // X.C40741io
    public final void LLILIL(View view, LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
        if (C78886Uxe.LJJIZ(this.LJLL)) {
            o.LJIIIIZZ(C12890ez.LIZ().LIZ(C0TY.LIZIZ), "LiveComposerManagerProvi…cker(EffectPanel.STICKER)");
            if (!r1.isEmpty()) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                LLILZ(context, "effect", R.string.m_4, R.string.m_3, new IDqS32S0300000(this, liveEffect, view, 8));
                return;
            } else if (C79081V1x.LJJI()) {
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "view.context");
                LLILZ(context2, "livegoal_background", R.string.m_8, R.string.m_7, new IDqS32S0300000(this, liveEffect, view, 9));
                return;
            }
        }
        InterfaceC30594Bza interfaceC30594Bza = this.LJLLI;
        if (interfaceC30594Bza != null) {
            interfaceC30594Bza.LIZLLL(liveEffect);
        }
        super.LLILIL(view, liveEffect);
    }

    public final void LLILLL(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_live_background_conflict_popup");
        LIZ.LJIILLIIL(this.LJLJLLL);
        C06490Nh.LIZLLL(LIZ, str, "conflict_function", str2, "action_type");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C30541Hu c30541Hu = new C30541Hu(C1FL.LIZIZ(parent, R.layout.cum, parent, false, "from(parent.context)\n   …_composer, parent, false)"));
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
                    stringBuffer.append(C30541Hu.class.getName());
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
        C29127Bbv.LIZ = C30541Hu.class.getName();
        return c30541Hu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20G(DataChannel dataChannel, String dialogType, BgEffectViewModel viewModel) {
        super(dataChannel, viewModel);
        o.LJIIIZ(dialogType, "dialogType");
        o.LJIIIZ(viewModel, "viewModel");
        new C32001Nk(dialogType, dialogType, false);
        this.LJLJLLL = dataChannel;
        this.LJLL = dialogType;
    }

    @Override // X.C1KD
    public final void LLIIZ(int i, RecyclerView.ViewHolder holder, Object obj) {
        View view;
        C30541Hu c30541Hu;
        C30541Hu c30541Hu2;
        C30541Hu c30541Hu3;
        List<String> list;
        View view2;
        C30541Hu c30541Hu4;
        LiveEffect effect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        LLILLIZIL(holder, effect);
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect = this.LJLJJLL;
        c30522ByQ.getClass();
        View view3 = null;
        if (C30522ByQ.LIZ(liveEffect, effect)) {
            if ((holder instanceof C30541Hu) && (c30541Hu4 = (C30541Hu) holder) != null) {
                view2 = c30541Hu4.LJLJI;
            } else {
                view2 = null;
            }
            C29306Beo.LJJLJLI(view2);
        } else {
            if ((holder instanceof C30541Hu) && (c30541Hu = (C30541Hu) holder) != null) {
                view = c30541Hu.LJLJI;
            } else {
                view = null;
            }
            C29306Beo.LJIIIZ(view);
        }
        View view4 = holder.itemView;
        o.LJIIIIZZ(view4, "holder.itemView");
        C29306Beo.LJJJLL(view4, 500L, C46531s9.LJLIL);
        View view5 = holder.itemView;
        o.LJIIIIZZ(view5, "holder.itemView");
        C29306Beo.LJJJLL(view5, 500L, new IDqS28S0300000(this, effect, holder, 4));
        boolean z = holder instanceof C30541Hu;
        if (z) {
            BQO LIZ = C15650jR.LIZ();
            UrlModel urlModel = effect.icon;
            if (urlModel != null) {
                list = urlModel.urlList;
            } else {
                list = null;
            }
            C78720Uuy LJIIIIZZ = LIZ.LJIIIIZZ("live_effect_grid_list", list);
            LJIIIIZZ.LJIJI = Boolean.FALSE;
            LJIIIIZZ.LJIIIIZZ = R.drawable.cs_;
            LJIIIIZZ.LJIJ(ImageView.ScaleType.FIT_XY);
            C30541Hu c30541Hu5 = (C30541Hu) holder;
            int width = c30541Hu5.LJLIL.getWidth();
            int height = c30541Hu5.LJLIL.getHeight();
            LJIIIIZZ.LJ = width;
            LJIIIIZZ.LJFF = height;
            LJIIIIZZ.LJIIJJI = new C40761iq(effect, this.LJLILLLLZI);
            LJIIIIZZ.LJIIJJI(c30541Hu5.LJLIL);
        }
        if (LLIL(effect) || (this.LJLJLJ && C29306Beo.LJJIFFI(Boolean.valueOf(effect.isGreenScreen)))) {
            if (z && (c30541Hu2 = (C30541Hu) holder) != null) {
                view3 = c30541Hu2.LJLJJLL;
            }
            C29306Beo.LJJLJLI(view3);
        } else {
            if (z && (c30541Hu3 = (C30541Hu) holder) != null) {
                view3 = c30541Hu3.LJLJJLL;
            }
            C29306Beo.LJI(view3);
        }
        holder.setIsRecyclable(false);
        if (z) {
            ((C30541Hu) holder).LJLJI.setBackgroundResource(R.drawable.ccz);
        }
    }

    public final void LLILZ(Context context, final String str, int i, int i2, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LLILLL(str, "show");
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILLIIL(i);
        c47071t1.LJFF(i2);
        c47071t1.LJIIL(R.string.m_1, new C0K7() { // from class: X.1Q8
            @Override // X.C0K7
            public final void LJIILLIIL(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C20G.this.LLILLL(str, "confirm");
                interfaceC65784Pro.invoke();
            }
        });
        c47071t1.LJIIIZ(R.string.m_2, new C0K7() { // from class: X.1Q9
            @Override // X.C0K7
            public final void LJIILLIIL(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C20G.this.LLILLL(str, "cancel");
            }
        });
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "8773228098213359636")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
