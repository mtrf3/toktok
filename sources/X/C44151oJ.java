package X;

import Y.IDRunnableS85S0100000;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44151oJ extends C1KD<C37221d8, LiveEffect> {
    public int LJLJI;
    public InterfaceC261110t LJLJJI;
    public InterfaceC31981Ni LJLJJLL;
    public int LJLILLLLZI = R.layout.d2n;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C532627e.INSTANCE);
    public String LJLJL = C0TY.LIZLLL;
    public final C37231d9 LJLJLJ = new C0WN() { // from class: X.1d9
        @Override // X.C0WN
        public final void LJFF(int i, Effect effect) {
        }

        @Override // X.C0WN
        public final void LJI(Effect effect) {
        }

        @Override // X.C0WN
        public final void onStart(Effect effect) {
        }

        @Override // X.C0WN
        public final void onSuccess(Effect effect) {
            ((Handler) C44151oJ.this.LJLJJL.getValue()).post(new IDRunnableS85S0100000(C44151oJ.this, 114));
        }
    };

    public final void reset() {
        Object obj;
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LiveEffect) obj).isNone()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect != null) {
            int indexOf = ((ArrayList) this.LJLIL).indexOf(liveEffect);
            LLFII(this.LJLJI);
            LLFFF(indexOf);
            this.LJLJI = indexOf;
            InterfaceC261110t interfaceC261110t = this.LJLJJI;
            if (interfaceC261110t != null) {
                interfaceC261110t.LIZ(liveEffect, indexOf);
            }
        }
    }

    public final void LLILLIZIL(LiveEffect liveEffect) {
        int LJZ = ORZ.LJZ(liveEffect, this.LJLIL);
        if (LJZ >= 0 && LJZ < ((ArrayList) this.LJLIL).size()) {
            notifyItemChanged(LJZ, "item_update_white_dot");
        }
    }

    public static void LLIL(C37221d8 holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View findViewById = holder.itemView.findViewById(R.id.anr);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.cb2);
        }
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView != null) {
            textView.setTextColor(C15380j0.LIZIZ(R.color.zk));
        }
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView2 != null) {
            textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
        TextView textView3 = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView3 != null) {
            textView3.setSelected(true);
        }
        String str = effect.effectPanelKey;
        if (str != null && ujb.o.LJJJLIIL(str, "beauty", false)) {
            InterfaceC30442Bx8.LJJIIJZLJL.LIZ(Boolean.valueOf(C78880UxY.LJJL(effect)));
        }
        C23010vJ.LJ(600, (TextView) holder.itemView.findViewById(R.id.mby));
    }

    public static void LLILII(C37221d8 holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        View findViewById = holder.itemView.findViewById(R.id.anr);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.cb3);
        }
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView != null) {
            textView.setTextColor(C15380j0.LIZIZ(R.color.a48));
        }
        TextView textView2 = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView2 != null) {
            textView2.setEllipsize(null);
        }
        TextView textView3 = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView3 != null) {
            textView3.setSelected(false);
        }
        C23010vJ.LJ(LiveChatShowDelayForHotLiveSetting.DEFAULT, (TextView) holder.itemView.findViewById(R.id.mby));
    }

    public final void LLILL(int i, List list) {
        if (i != -1) {
            this.LJLJI = i;
        }
        C03200Aq.LIZ(new C36991cl(this.LJLIL, list), true).LIZJ(this);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(list);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup view, int i) {
        o.LJIIIZ(view, "view");
        final View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(view.getContext()), this.LJLILLLLZI, view, false);
        o.LJIIIIZZ(LLLLIILL, "from(view.context).inflate(layoutId, view, false)");
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(LLLLIILL) { // from class: X.1d8
        };
        C0AX.LIZ(view, viewHolder.itemView, R.id.lj7);
        View view2 = viewHolder.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(view));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C37221d8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(view.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C37221d8.class.getName();
        return viewHolder;
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C37221d8) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C37221d8) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        final C37221d8 holder = (C37221d8) viewHolder;
        final LiveEffect liveEffect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(liveEffect, "liveEffect");
        if (liveEffect.isLocal) {
            W5G w5g = (W5G) holder.itemView.findViewById(R.id.ezb);
            if (w5g != null) {
                w5g.setImageResource(liveEffect.localIcon);
            }
            ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.ezb);
            if (imageView != null) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
        } else {
            UrlModel urlModel = liveEffect.icon;
            if (urlModel != null) {
                C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(new ImageModel(urlModel.uri, urlModel.urlList));
                LJIIIZ.LJIJI = Boolean.FALSE;
                LJIIIZ.LJIIJJI(holder.itemView.findViewById(R.id.ezb));
            }
        }
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mby);
        if (textView != null) {
            textView.setText(liveEffect.getName());
        }
        C1KJ c1kj = C1KJ.LIZ;
        if (c1kj.LIZ(liveEffect) || C78880UxY.LJJJJLI(liveEffect) || liveEffect.isLocal) {
            ImageView imageView2 = (ImageView) holder.itemView.findViewById(R.id.f6h);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            ImageView imageView3 = (ImageView) holder.itemView.findViewById(R.id.f6h);
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            c1kj.LIZLLL(liveEffect.getEffect(), this.LJLJLJ);
        }
        if (C78880UxY.LJJJJZ(liveEffect, this.LJLJJLL)) {
            holder.itemView.setAlpha(0.4f);
        } else {
            holder.itemView.setAlpha(1.0f);
        }
        if (this.LJLJI == i) {
            LLIL(holder, liveEffect);
        } else {
            LLILII(holder, liveEffect);
        }
        LLIILZL(holder, liveEffect, i);
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.10u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC30442Bx8.LLZZ.LIZ(Boolean.TRUE);
                int adapterPosition = getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= ((ArrayList) this.LJLIL).size()) {
                    return;
                }
                if (!C1KJ.LIZ.LIZ(liveEffect) && !C78880UxY.LJJJJLI(liveEffect)) {
                    return;
                }
                if (C78880UxY.LJJJJZ(liveEffect, this.LJLJJLL)) {
                    C30868C9o.LIZJ(R.string.kdw);
                    return;
                }
                if (LiveBeautySwitchExperimentSetting.INSTANCE.hasNone()) {
                    this.notifyDataSetChanged();
                } else {
                    C44151oJ c44151oJ = this;
                    c44151oJ.LLFII(c44151oJ.LJLJI);
                    this.LLFFF(adapterPosition);
                }
                C44151oJ c44151oJ2 = this;
                c44151oJ2.LJLJI = adapterPosition;
                String str = liveEffect.effectPanelKey;
                if (str != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C48459J0d<java.util.Map<String, Integer>> c48459J0d = InterfaceC30442Bx8.LLZZJLIL;
                    java.util.Map<String, Integer> LIZJ = c48459J0d.LIZJ();
                    o.LJIIIIZZ(LIZJ, "BEAUTY_SELECTED_INDEX.value");
                    linkedHashMap.putAll(LIZJ);
                    linkedHashMap.put(str, Integer.valueOf(c44151oJ2.LJLJI));
                    c48459J0d.LIZ(linkedHashMap);
                }
                InterfaceC261110t interfaceC261110t = this.LJLJJI;
                if (interfaceC261110t == null) {
                    return;
                }
                interfaceC261110t.LIZ(liveEffect, adapterPosition);
            }
        }, holder.itemView);
    }

    @Override // X.C1KD
    /* renamed from: LLILIL, reason: merged with bridge method [inline-methods] */
    public final void LLIILZL(C37221d8 holder, LiveEffect liveEffect, int i) {
        String str;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(liveEffect, "liveEffect");
        if (this.LJLJI == i) {
            LLIL(holder, liveEffect);
        } else {
            LLILII(holder, liveEffect);
        }
        if (LiveBeautySwitchExperimentSetting.INSTANCE.hasNone() && (str = liveEffect.effectPanelKey) != null && ujb.o.LJJJLIIL(str, "beauty", false)) {
            int i2 = this.LJLJI;
            if (i2 > 0) {
                if (i2 == i && C78880UxY.LJLJJI(liveEffect, this.LJLJJLL, this.LJLJL)) {
                    ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.eux);
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = (ImageView) holder.itemView.findViewById(R.id.eux);
                    if (imageView2 == null) {
                        return;
                    }
                    imageView2.setSelected(true);
                    return;
                }
                if (!C78880UxY.LJJL(liveEffect) && C78880UxY.LJLJJI(liveEffect, this.LJLJJLL, this.LJLJL)) {
                    ImageView imageView3 = (ImageView) holder.itemView.findViewById(R.id.eux);
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = (ImageView) holder.itemView.findViewById(R.id.eux);
                    if (imageView4 == null) {
                        return;
                    }
                    imageView4.setSelected(false);
                    return;
                }
                ImageView imageView5 = (ImageView) holder.itemView.findViewById(R.id.eux);
                if (imageView5 == null) {
                    return;
                }
                imageView5.setVisibility(4);
                return;
            }
            ImageView imageView6 = (ImageView) holder.itemView.findViewById(R.id.eux);
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(4);
        }
    }
}
