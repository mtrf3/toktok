package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TeJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75139TeJ extends AbstractC76218Tvi<C74900TaS> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final View LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final C47121t6 LJLJJI;
    public final ImageView LJLJJL;
    public final C47121t6 LJLJJLL;
    public final LiveIconView LJLJL;
    public final C31657Cbd LJLJLJ;

    static {
        TBT tbt = new TBT(C75139TeJ.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    public final void M() {
        int i;
        if (!TV3.LJIIJ() && !C74789TWv.LIZIZ()) {
            this.LJLJJI.setTextSize(15.0f);
            C47121t6 c47121t6 = this.LJLJJI;
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            c47121t6.setTextColor(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C75139TeJ(View view, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(view);
        this.LJLIL = interfaceC88472Yns;
        View findViewById = view.findViewById(R.id.title_shadow);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title_shadow)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = view.findViewById(R.id.l_k);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.title_content)");
        this.LJLJI = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.m9d);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_invite_list_title)");
        this.LJLJJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.iy8);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.reservation_info_icon)");
        this.LJLJJL = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.jji);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.second_title_tv)");
        this.LJLJJLL = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.jjh);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.second_title_icon)");
        this.LJLJL = (LiveIconView) findViewById6;
        this.LJLJLJ = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        int i2;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        C74900TaS data = (C74900TaS) obj;
        o.LJIIIZ(data, "data");
        this.LJLJJI.setText(data.LJLIL);
        C87277YNd.LJJIIZ(this.LJLJJLL);
        C87277YNd.LJJIIZ(this.LJLJL);
        C87277YNd.LJJIIZ(this.LJLJJL);
        this.LJLJJI.setTextSize(13.0f);
        C47121t6 c47121t6 = this.LJLJJI;
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gv);
        if (LIZIZ != null) {
            i2 = LIZIZ.intValue();
        } else {
            i2 = 0;
        }
        c47121t6.setTextColor(i2);
        int i3 = data.LJLILLLLZI;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 6) {
                                C87277YNd.LJJIIZ(this.LJLJJL);
                                return;
                            }
                            C87277YNd.LJJIIZ(this.LJLJJL);
                            this.itemView.setBackgroundColor(0);
                            this.LJLJI.setBackgroundResource(0);
                            return;
                        }
                        C87277YNd.LJJIJ(this.LJLJJL);
                        C16880lQ.LJIILLIIL(this.LJLJJL, new ACListenerS33S0100000_13(this, 134));
                        return;
                    }
                    M();
                    return;
                }
                C87277YNd.LJJIJ(this.LJLJJL);
                C16880lQ.LJIILLIIL(this.LJLJJL, new ACListenerS33S0100000_13(this, 132));
                return;
            }
            M();
            return;
        }
        M();
        C75457TjR.LIZ = getAbsoluteAdapterPosition();
        C87277YNd.LJJIIZ(this.LJLJJL);
        if (!TUT.LIZIZ() || (multiGuestDataHolder = (MultiGuestDataHolder) this.LJLJLJ.LIZ(this, LJLJLLL[0])) == null || (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) == null) {
            return;
        }
        int i4 = multiLiveAnchorPanelSettings.applierSortSetting;
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        C87277YNd.LJJIJ(this.LJLJJLL);
        C87277YNd.LJJIJ(this.LJLJL);
        if (i4 != 0) {
            if (i4 == 1) {
                this.LJLJJLL.setText(C15380j0.LJIILJJIL(R.string.n7k));
                c76732zl.element = 0;
            }
        } else {
            this.LJLJJLL.setText(C15380j0.LJIILJJIL(R.string.n7j));
            c76732zl.element = 1;
        }
        if (c76732zl.element != -1) {
            C29306Beo.LJJJLL(this.LJLJJLL, 500L, new AqS144S0200000_13(this, c76732zl, 27));
            C29306Beo.LJJJLL(this.LJLJL, 500L, new AqS144S0200000_13(this, c76732zl, 28));
        }
    }
}
