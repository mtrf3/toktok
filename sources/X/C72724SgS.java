package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S0200000_12;
import android.graphics.Color;
import android.util.JsonReader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.FileReader;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SgS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72724SgS extends AbstractC029409q<C187347Ww> {
    public final User LJLIL;
    public final InterfaceC72728SgW LJLILLLLZI;
    public List<? extends InterfaceC72668SfY> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i != 0) {
            return i != 1 ? 1 : 0;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<? extends InterfaceC72668SfY> list = this.LJLJI;
        if (list == null) {
            return 2;
        }
        o.LJI(list);
        return 2 + list.size();
    }

    public C72724SgS(User user, InterfaceC72728SgW eventHandler) {
        o.LJIIIZ(user, "user");
        o.LJIIIZ(eventHandler, "eventHandler");
        this.LJLIL = user;
        this.LJLILLLLZI = eventHandler;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C187347Ww c187347Ww, int i) {
        List<? extends InterfaceC72668SfY> list;
        float f;
        C187347Ww holder = c187347Ww;
        o.LJIIIZ(holder, "holder");
        if (getItemViewType(i) == 2) {
            C71888SJg c71888SJg = holder.LJLILLLLZI;
            c71888SJg.getClass();
            if (!O3U.LIZ(OI6.LIZ, "ug_resource")) {
                c71888SJg.setAnimation("share_navi_create_btn_animation_fallback.json");
            } else {
                String LIZ = OI6.LIZ("share_navi_create_btn_animation.json", "navi_lottie");
                c71888SJg.setAnimation(new JsonReader(new FileReader(LIZ)), LIZ);
            }
            holder.LJLJI.setVisibility(8);
            holder.LJLJJL.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, holder, 4), holder.LJLJJL);
            View view = holder.itemView;
            if (this.LJLJI != null) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            view.setAlpha(f);
        } else {
            holder.LJLJI.setVisibility(0);
            holder.LJLJJL.setVisibility(8);
        }
        if (getItemViewType(i) == 0) {
            UrlModel avatarVideoUri = this.LJLIL.getAvatarVideoUri();
            if (avatarVideoUri != null && avatarVideoUri.getUrlList() != null && avatarVideoUri.getUrlList().size() > 0) {
                o.LJI(avatarVideoUri);
                W5F LJFF = W5U.LJFF(UriProtector.parse((String) ListProtector.get(avatarVideoUri.getUrlList(), 0)));
                LJFF.LJJIJIIJIL = true;
                LJFF.LIZLLL = true;
                LJFF.LJJIIJ = holder.LJLIL;
                C16880lQ.LLJJJ(LJFF);
            } else {
                W5F LJII = W5U.LJII(C78939UyV.LJ(C78688UuS.LJJI(this.LJLIL)));
                LJII.LJJIIJ = holder.LJLIL;
                C16880lQ.LLJJJ(LJII);
            }
            holder.LJLJJI.setVisibility(0);
            C16880lQ.LJIILLIIL(holder.LJLJJI, new ACListenerS32S0100000_12(this, 14));
            C16880lQ.LJJIJL(holder.LJLIL, new ACListenerS32S0100000_12(this, 15));
        }
        if (getItemViewType(i) == 1 && (list = this.LJLJI) != null) {
            InterfaceC72668SfY interfaceC72668SfY = (InterfaceC72668SfY) ListProtector.get(list, i - 2);
            try {
                if (interfaceC72668SfY.LIZ() != null) {
                    holder.LJLIL.setBackgroundColor(Color.parseColor(interfaceC72668SfY.LIZ()));
                }
            } catch (Exception unused) {
            }
            String LIZIZ = interfaceC72668SfY.LIZIZ();
            if (LIZIZ != null) {
                W5F LJFF2 = W5U.LJFF(UriProtector.parse(LIZIZ));
                LJFF2.LJJIIJ = holder.LJLIL;
                LJFF2.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                C16880lQ.LLJJJ(LJFF2);
            }
            holder.LJLJJI.setVisibility(8);
            C16880lQ.LJJIJL(holder.LJLIL, new ACListenerS46S0200000_12(this, interfaceC72668SfY, 5));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C187347Ww com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cm4, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C187347Ww c187347Ww = new C187347Ww(view);
        C0AX.LIZ(viewGroup, c187347Ww.itemView, R.id.lj7);
        View view2 = c187347Ww.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c187347Ww.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C187347Ww.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c187347Ww.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c187347Ww.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C187347Ww.class.getName();
        return c187347Ww;
    }
}
