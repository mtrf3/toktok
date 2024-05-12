package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.4Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105254Bd extends AbstractC029409q<C105364Bo<InterfaceC105334Bl>> {
    public final C4BU LJLIL;
    public final InterfaceC88471Ynr<View, Integer, Boolean> LJLILLLLZI;
    public final java.util.Set<Long> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.LJLJLJ.LIZJ();
    }

    public C105254Bd(C4BU mEmojiTypeView) {
        o.LJIIIZ(mEmojiTypeView, "mEmojiTypeView");
        this.LJLIL = mEmojiTypeView;
        this.LJLILLLLZI = null;
        this.LJLJI = new LinkedHashSet();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLIL.LJLJLJ.LIZIZ(i).LJ();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C105364Bo<InterfaceC105334Bl> holder) {
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        Long setId;
        o.LJIIIZ(holder, "holder");
        InterfaceC105334Bl LIZIZ = this.LJLIL.LJLJLJ.LIZIZ(holder.getAbsoluteAdapterPosition());
        if (LIZIZ.LJ() == 9) {
            if ((LIZIZ instanceof C72422so) && (c72422so = (C72422so) LIZIZ) != null && (stickerSetInfo = c72422so.LIZIZ) != null && (setId = stickerSetInfo.getSetId()) != null) {
                long longValue = setId.longValue();
                if (this.LJLJI.add(Long.valueOf(longValue))) {
                    String valueOf = String.valueOf(longValue);
                    C85323Wm onEventV3 = C772831o.LIZ();
                    o.LJIIIZ(onEventV3, "onEventV3");
                    C1HQ c1hq = new C1HQ();
                    c1hq.put("enter_from", "chat");
                    c1hq.put("sticker_set_id", valueOf);
                    onEventV3.LIZIZ("show_dm_sticker_thumbnail", c1hq);
                }
            } else {
                return;
            }
        }
        if (LIZIZ.LJ() == 7) {
            C42625Go9.LIZIZ(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(C105364Bo<InterfaceC105334Bl> c105364Bo) {
        C105264Be c105264Be;
        InterfaceC105334Bl interfaceC105334Bl;
        C105364Bo<InterfaceC105334Bl> holder = c105364Bo;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C105264Be) && (c105264Be = (C105264Be) holder) != null && (interfaceC105334Bl = c105264Be.LJLJJI) != null && interfaceC105334Bl.LJ() == 7) {
            C42625Go9.LIZJ(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C105364Bo<InterfaceC105334Bl> c105364Bo, int i) {
        C105364Bo<InterfaceC105334Bl> holder = c105364Bo;
        o.LJIIIZ(holder, "holder");
        holder.bind(this.LJLIL.LJLJLJ.LIZIZ(i), i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C105364Bo<InterfaceC105334Bl> com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C105364Bo<InterfaceC105334Bl> c105264Be;
        o.LJIIIZ(parent, "parent");
        if (i == 5 && !C88963eO.LJFF()) {
            c105264Be = new C105304Bi(this, C28289B8j.LIZ(parent, R.layout.atp, parent, false));
        } else {
            c105264Be = new C105264Be(this, C28289B8j.LIZ(parent, R.layout.ato, parent, false));
        }
        C0AX.LIZ(parent, c105264Be.itemView, R.id.lj7);
        View view = c105264Be.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c105264Be.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c105264Be.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c105264Be.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c105264Be.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c105264Be.getClass().getName();
        return c105264Be;
    }
}
