package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS4S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.28J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28J extends C44351od {
    public long LJLJL;
    public final ArrayList<Long> LJLJLJ;
    public boolean LJLJLLL;

    public final void LLIZ(boolean z) {
        if (z != this.LJLJLLL) {
            this.LJLJLLL = z;
            if (z) {
                this.LJLJLJ.clear();
                ArrayList<Long> arrayList = this.LJLJLJ;
                List<Effect> list = this.LJLIL;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((SoundEffect) it.next()).id));
                }
                arrayList.addAll(arrayList2);
            }
            notifyItemRangeChanged(0, getItemCount(), "item_edit_changed");
        }
    }

    @Override // X.C44351od
    public final void LLIL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (!this.LJLJLLL) {
            C29306Beo.LJJLJLI(holder.LJLILLLLZI);
            C29306Beo.LJIIIZ(holder.LJLJI);
        }
    }

    @Override // X.C44351od
    public final void LLILII(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (!this.LJLJLLL) {
            C29306Beo.LJIIIZ(holder.LJLILLLLZI);
            C29306Beo.LJJLJLI(holder.LJLJI);
            C74282TDi c74282TDi = holder.LJLJI;
            if (c74282TDi != null) {
                c74282TDi.setProgress(90);
            }
        }
    }

    @Override // X.C44351od
    public final void LLILIL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (!this.LJLJLLL) {
            C29306Beo.LJIIIZ(holder.LJLILLLLZI);
            C29306Beo.LJIIIZ(holder.LJLJI);
        }
    }

    @Override // X.C44351od
    public final void LLILL(C37881eC holder, SoundEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if (!this.LJLJLLL) {
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
    }

    @Override // X.C44351od
    public final void LLILLIZIL(C37881eC holder, SoundEffect effect) {
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

    @Override // X.C44351od
    public final C37881eC LLILLL(int i, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C44341oc(parent, this.LJLJJLL);
    }

    public final void LLILZLL(C37881eC holder, SoundEffect effect) {
        C44341oc c44341oc;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        if ((holder instanceof C44341oc) && (c44341oc = (C44341oc) holder) != null) {
            if (this.LJLJLLL) {
                C29306Beo.LJJLJLI(c44341oc.LJLJJLL);
                C29306Beo.LJIIIZ(c44341oc.LJLILLLLZI);
                C29306Beo.LJIIIZ(c44341oc.LJLJI);
                C29306Beo.LJIIIZ(c44341oc.LJLJJL);
                TextView textView = c44341oc.LJLJJI;
                if (textView == null) {
                    return;
                }
                textView.setSelected(false);
                return;
            }
            C29306Beo.LJIIIZ(c44341oc.LJLJJLL);
            SoundEffectViewModel soundEffectViewModel = this.LJLJJL;
            if (soundEffectViewModel != null) {
                soundEffectViewModel.LJLJJL.getClass();
                if (C37951eJ.LIZLLL(effect)) {
                    C29306Beo.LJIIIZ(c44341oc.LJLILLLLZI);
                    C29306Beo.LJIIIZ(c44341oc.LJLJI);
                    return;
                } else if (soundEffectViewModel.LJLJJL.LJLIL.contains(effect)) {
                    C29306Beo.LJIIIZ(c44341oc.LJLILLLLZI);
                    C29306Beo.LJJLJLI(c44341oc.LJLJI);
                    return;
                } else {
                    C29306Beo.LJJLJLI(c44341oc.LJLILLLLZI);
                    C29306Beo.LJIIIZ(c44341oc.LJLJI);
                    return;
                }
            }
            C29306Beo.LJIIIZ(c44341oc.LJLILLLLZI);
            C29306Beo.LJIIIZ(c44341oc.LJLJI);
        }
    }

    @Override // X.C44351od, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C44341oc c44341oc = new C44341oc(parent, this.LJLJJLL);
        C0AX.LIZ(parent, c44341oc.itemView, R.id.lj7);
        View view = c44341oc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c44341oc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C44341oc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c44341oc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c44341oc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C44341oc.class.getName();
        return c44341oc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28J(DataChannel dataChannel, LifecycleOwner lifecycleOwner, SoundEffectViewModel soundEffectViewModel) {
        super(dataChannel, false, lifecycleOwner, soundEffectViewModel, R.layout.d2q);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJL = -1L;
        this.LJLJLJ = new ArrayList<>();
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIIILZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C1KD
    public final void LLIIIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C37881eC holder = (C37881eC) viewHolder;
        SoundEffect effect = (SoundEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        LLILZLL(holder, effect);
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILLIZIL((C37881eC) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C44351od, X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIIZ((C37881eC) viewHolder, (SoundEffect) obj, i);
    }

    @Override // X.C44351od
    /* renamed from: LLILLJJLI */
    public final void LLIIZ(C37881eC holder, SoundEffect effect, int i) {
        View view;
        Boolean bool;
        Boolean bool2;
        C44341oc c44341oc;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBindViewHolder: ");
        LIZ.append(i);
        C0NB.LIZIZ("BaseAnimator", X1D.LIZIZ(LIZ));
        C15650jR.LIZ().LJIIIZ(effect.iconUrl).LJIIJJI(holder.itemView.findViewById(R.id.f51));
        TextView textView = holder.LJLJJI;
        if (textView != null) {
            textView.setText(effect.name);
        }
        View view2 = holder.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        final IDqS4S0201000 iDqS4S0201000 = new IDqS4S0201000(this, effect, i, 5);
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.138
            public final /* synthetic */ long LJLILLLLZI = 200;

            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = C28J.this.LJLJL;
                if (j == -1 || currentTimeMillis - j >= this.LJLILLLLZI) {
                    InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = iDqS4S0201000;
                    o.LJIIIIZZ(it, "it");
                    interfaceC88472Yns.invoke(it);
                }
                C28J.this.LJLJL = currentTimeMillis;
            }
        }, view2);
        if (this.LJLJLLL) {
            LLILZLL(holder, effect);
            return;
        }
        Boolean bool3 = null;
        if ((holder instanceof C44341oc) && (c44341oc = (C44341oc) holder) != null) {
            view = c44341oc.LJLJJLL;
        } else {
            view = null;
        }
        C29306Beo.LJIIIZ(view);
        SoundEffectViewModel soundEffectViewModel = this.LJLJJL;
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

    @Override // X.C44351od
    public final void LLILZ(View v, SoundEffect effect, int i) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(effect, "effect");
        int indexOf = ((ArrayList) this.LJLIL).indexOf(effect);
        if (this.LJLJLLL) {
            C012403c.LJ("onItemClicked: ", i, "BaseAnimator");
            C08930Wr.LIZ(this.LJLILLLLZI, EnumC08910Wp.TOP, effect.id);
            if (indexOf != -1) {
                ListProtector.add(this.LJLIL, 0, ListProtector.remove(this.LJLIL, indexOf));
                notifyItemMoved(indexOf, 0);
                return;
            }
            return;
        }
        super.LLILZ(v, effect, indexOf);
    }
}
