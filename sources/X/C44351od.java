package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.Modification;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS3S0010000;
import kotlin.jvm.internal.o;

/* renamed from: X.1od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44351od extends C1KD<C37881eC, SoundEffect> {
    public final DataChannel LJLILLLLZI;
    public final boolean LJLJI;
    public final LifecycleOwner LJLJJI;
    public final SoundEffectViewModel LJLJJL;
    public final int LJLJJLL;

    public final void LLILZIL(final List<SoundEffect> effectList) {
        o.LJIIIZ(effectList, "effectList");
        final List<Effect> list = this.LJLIL;
        C03200Aq.LIZ(new AbstractC03120Ai(list, effectList) { // from class: X.1eD
            public final List<SoundEffect> LIZ;
            public final List<SoundEffect> LIZIZ;

            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                o.LJIIIZ(list, "oldData");
                o.LJIIIZ(effectList, "newData");
                this.LIZ = list;
                this.LIZIZ = effectList;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i, int i2) {
                if (!o.LJ(((SoundEffect) ListProtector.get(this.LIZ, i)).name, ((SoundEffect) ListProtector.get(this.LIZIZ, i2)).name)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i, int i2) {
                if (((SoundEffect) ListProtector.get(this.LIZ, i)).id == ((SoundEffect) ListProtector.get(this.LIZIZ, i2)).id) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ(this);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(effectList);
    }

    public void LLIL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJJLJLI(holder.LJLILLLLZI);
        C29306Beo.LJIIIZ(holder.LJLJI);
    }

    public void LLILII(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJIIIZ(holder.LJLILLLLZI);
        C29306Beo.LJJLJLI(holder.LJLJI);
        C74282TDi c74282TDi = holder.LJLJI;
        if (c74282TDi != null) {
            c74282TDi.setProgress(90);
        }
    }

    public void LLILIL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJIIIZ(holder.LJLILLLLZI);
        C29306Beo.LJIIIZ(holder.LJLJI);
    }

    public void LLILL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJJLJLI(holder.LJLJJL);
        TextView textView = holder.LJLJJI;
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
        TextView textView2 = holder.LJLJJI;
        if (textView2 == null) {
            return;
        }
        textView2.setSelected(true);
    }

    public void LLILLIZIL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJIIIZ(holder.LJLJJL);
        TextView textView = holder.LJLJJI;
        if (textView != null) {
            textView.setEllipsize(null);
        }
        TextView textView2 = holder.LJLJJI;
        if (textView2 == null) {
            return;
        }
        textView2.setSelected(false);
    }

    public C37881eC LLILLL(int i, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C37881eC(parent, this.LJLJJLL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C37881eC LLILLL = LLILLL(i, viewGroup);
        C0AX.LIZ(viewGroup, LLILLL.itemView, R.id.lj7);
        View view = LLILLL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (LLILLL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LLILLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) LLILLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(LLILLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LLILLL.getClass().getName();
        return LLILLL;
    }

    @Override // X.C1KD
    public /* bridge */ /* synthetic */ void LLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    public /* bridge */ /* synthetic */ void LLIIII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    public /* bridge */ /* synthetic */ void LLIIIILZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    public /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    public /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILLIZIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    /* renamed from: LLILLJJLI, reason: merged with bridge method [inline-methods] */
    public void LLIIZ(C37881eC holder, final SoundEffect effect, final int i) {
        Boolean bool;
        Boolean bool2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C78720Uuy LIZJ = C15650jR.LIZ().LIZJ(Boolean.FALSE);
        LIZJ.LJIIIZ(effect.iconUrl);
        LIZJ.LJIIJJI(holder.itemView.findViewById(R.id.f51));
        TextView textView = holder.LJLJJI;
        if (textView != null) {
            textView.setText(effect.name);
        }
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.137
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                C44351od c44351od = C44351od.this;
                o.LJIIIIZZ(it, "it");
                c44351od.LLILZ(it, effect, i);
            }
        }, holder.itemView);
        SoundEffectViewModel soundEffectViewModel = this.LJLJJL;
        Boolean bool3 = null;
        if (soundEffectViewModel != null) {
            soundEffectViewModel.LJLJJL.getClass();
            bool = Boolean.valueOf(C37951eJ.LIZLLL(effect));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LLILIL(holder, effect);
        } else {
            SoundEffectViewModel soundEffectViewModel2 = this.LJLJJL;
            if (soundEffectViewModel2 != null) {
                bool2 = Boolean.valueOf(soundEffectViewModel2.LJLJJL.LJLIL.contains(effect));
            } else {
                bool2 = null;
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                LLILII(holder, effect);
            } else {
                LLIL(holder, effect);
            }
        }
        SoundEffectViewModel soundEffectViewModel3 = this.LJLJJL;
        if (soundEffectViewModel3 != null) {
            bool3 = Boolean.valueOf(o.LJ(soundEffectViewModel3.LJLJJI.LJLJI, effect));
        }
        if (C29306Beo.LJJIFFI(bool3)) {
            LLILL(holder, effect);
        } else {
            LLILLIZIL(holder, effect);
        }
    }

    public void LLILZ(View v, SoundEffect effect, int i) {
        Boolean bool;
        String str;
        String str2;
        boolean z;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(effect, "effect");
        SoundEffectViewModel soundEffectViewModel = this.LJLJJL;
        if (soundEffectViewModel != null) {
            soundEffectViewModel.LJLJJL.getClass();
            if (C37951eJ.LIZLLL(effect)) {
                z = o.LJ(soundEffectViewModel.LJLJJI.LJLJI, effect);
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            DataChannel dataChannel = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            String scene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
            BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sound_select");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ(Integer.valueOf(i + 1), "impr_position");
            if (z2) {
                str = "shortcut";
            } else {
                str = "normal";
            }
            LIZ.LJIJJ(str, "panel_type");
            LIZ.LJJI(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C08930Wr.LIZ)) ? 1 : 0), "is_live_take_default", new IDqS3S0010000(z2, 2));
            LIZ.LJIJJ(scene, "select_scene");
            LIZ.LJIJJ(Long.valueOf(effect.id), "effect_id");
            LIZ.LJIJJ(effect.nameEn, "effect_name");
            LIZ.LJJIIJZLJL();
            o.LJIIIIZZ(scene, "scene");
            long j = effect.id;
            String valueOf = String.valueOf(j);
            String str3 = effect.nameEn;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (z2) {
                str2 = "shortcut_panel";
            } else {
                str2 = "normal_panel";
            }
            C32101Nu.LJIIJ(C32101Nu.LIZJ(), C47261Igj.LJJIJIL(new Modification(j, str3, valueOf, 7L, Long.valueOf(currentTimeMillis), null, 0L, str2, null, null, null, null, scene, null, null, 0L, 61280, null)));
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLJJI), null, null, new C2H4(this, effect, null), 3);
    }

    public C44351od(DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner, SoundEffectViewModel soundEffectViewModel, int i) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = z;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = soundEffectViewModel;
        this.LJLJJLL = i;
    }
}
