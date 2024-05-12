package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3XK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XK extends AbstractC029409q<C3XL> {
    public final List<InterfaceC105334Bl> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3XK(List<? extends InterfaceC105334Bl> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C3XL c3xl, int i) {
        Integer valueOf;
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        StickerUrlStruct iconUrl;
        C3XL holder = c3xl;
        o.LJIIIZ(holder, "holder");
        InterfaceC105334Bl interfaceC105334Bl = (InterfaceC105334Bl) ORZ.LJLLLLLL(i, this.LJLIL);
        String str = null;
        r3 = null;
        r3 = null;
        r3 = null;
        UrlModel urlModel = null;
        if (interfaceC105334Bl == null || (valueOf = Integer.valueOf(interfaceC105334Bl.LJ())) == null) {
            return;
        }
        if (valueOf.intValue() == 9) {
            C17N.LJJLIIIJJI(holder.LJLIL);
            C17N.LJJIIJZLJL(holder.LJLILLLLZI);
            Object LJLLLLLL = ORZ.LJLLLLLL(i, this.LJLIL);
            if ((LJLLLLLL instanceof C72422so) && (c72422so = (C72422so) LJLLLLLL) != null && (stickerSetInfo = c72422so.LIZIZ) != null && (iconUrl = stickerSetInfo.getIconUrl()) != null) {
                urlModel = iconUrl.getLowResolutionUrl();
            }
            C4AS.LJII(holder.LJLIL, urlModel, "TabIndicatorEmojiListAdapter", null, null, 0, 0, 504);
            return;
        }
        if (valueOf.intValue() == 6) {
            InterfaceC105334Bl interfaceC105334Bl2 = (InterfaceC105334Bl) ORZ.LJLLLLLL(i, this.LJLIL);
            if (interfaceC105334Bl2 == null) {
                return;
            }
            holder.LJLIL.setActualImageResource(interfaceC105334Bl2.LJFF());
            return;
        }
        if (valueOf.intValue() != 5) {
            return;
        }
        C17N.LJJIIJZLJL(holder.LJLIL);
        TuxTextView tuxTextView = holder.LJLILLLLZI;
        C17N.LJJLIIIJJI(tuxTextView);
        InterfaceC105334Bl interfaceC105334Bl3 = (InterfaceC105334Bl) ORZ.LJLLLLLL(i, this.LJLIL);
        if (interfaceC105334Bl3 != null) {
            str = interfaceC105334Bl3.LJIIIZ();
        }
        tuxTextView.setText(str);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C3XL com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b6d, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C3XL c3xl = new C3XL(view);
        C0AX.LIZ(viewGroup, c3xl.itemView, R.id.lj7);
        View view2 = c3xl.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c3xl.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C3XL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c3xl.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c3xl.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C3XL.class.getName();
        return c3xl;
    }
}
