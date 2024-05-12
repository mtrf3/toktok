package com.ss.android.ugc.aweme.nows.interaction.assem;

import X.C16880lQ;
import X.C181847Bs;
import X.C196367nE;
import X.C1DH;
import X.C2068389v;
import X.C213688a4;
import X.C214348b8;
import X.C32151Nz;
import X.C45804HyK;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78966Uyw;
import X.C7MK;
import X.C7ML;
import X.C7MQ;
import X.C7MS;
import X.C7MY;
import X.C8XO;
import X.C8YN;
import X.EF7;
import X.EnumC181857Bt;
import X.InterfaceC115514g7;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.O6R;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowShareBottomAssem extends ReusedUISlotAssem<NowShareBottomAssem> implements C8XO<InterfaceC194547kI> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final int LLFF;
    public final int LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final C55749LuL LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public TuxIconView LLII;
    public ConstraintLayout LLIIII;
    public TuxTextView LLIIIILZ;

    static {
        TBT tbt = new TBT(NowShareBottomAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowShareViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.byh;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowShareBottomAssem() {
        new LinkedHashMap();
        Float valueOf = Float.valueOf(36.0f);
        this.LLFF = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        this.LLFFF = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        C65776Prg LIZ = C65352Pkq.LIZ(NowShareViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 665), null, C7MQ.INSTANCE, null, null);
        this.LLFZ = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLI = "";
        this.LLIFFJFJJ = "";
    }

    public final NowShareViewModel n4() {
        return (NowShareViewModel) this.LLFII.LIZ(this, LLIIIJ[0]);
    }

    public final boolean p4() {
        C196367nE c196367nE = C196367nE.LIZ;
        String authorUid = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAuthorUid();
        o.LJIIIIZZ(authorUid, "item.aweme.authorUid");
        c196367nE.getClass();
        if (C196367nE.LJI(authorUid) && C78966Uyw.LJJIJ().LIZIZ()) {
            return true;
        }
        return false;
    }

    public final void q4() {
        Long l;
        String valueOf;
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        AwemeStatistics statistics2;
        C2068389v c2068389v = new C2068389v();
        if (p4()) {
            c2068389v.LIZ = R.raw.icon_download_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
        } else {
            c2068389v.LIZ = R.raw.icon_color_share_shadow_alt_2;
        }
        TuxIconView tuxIconView = this.LLII;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c2068389v);
            if (p4()) {
                TuxTextView tuxTextView = this.LLIIIILZ;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                } else {
                    o.LJIJI("shareCount");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView2 = this.LLIIIILZ;
                if (tuxTextView2 != null) {
                    C7ML c7ml = (C7ML) C51029K0z.LJIILLIIL(this);
                    if (c7ml != null && (aweme2 = c7ml.getAweme()) != null && (statistics2 = aweme2.getStatistics()) != null && statistics2.getShareCount() == 0) {
                        valueOf = EF7.LIZIZ().getString(R.string.tnq);
                    } else {
                        C7ML c7ml2 = (C7ML) C51029K0z.LJIILLIIL(this);
                        if (c7ml2 != null && (aweme = c7ml2.getAweme()) != null && (statistics = aweme.getStatistics()) != null) {
                            l = Long.valueOf(statistics.getShareCount());
                        } else {
                            l = null;
                        }
                        valueOf = String.valueOf(l);
                    }
                    tuxTextView2.setText(valueOf);
                    TuxTextView tuxTextView3 = this.LLIIIILZ;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(0);
                    } else {
                        o.LJIJI("shareCount");
                        throw null;
                    }
                } else {
                    o.LJIJI("shareCount");
                    throw null;
                }
            }
            TuxIconView tuxIconView2 = this.LLII;
            if (tuxIconView2 != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
                int i = this.LLFFF;
                layoutParams.width = i;
                layoutParams.height = i;
                TuxIconView tuxIconView3 = this.LLII;
                if (tuxIconView3 != null) {
                    tuxIconView3.setLayoutParams(layoutParams);
                    return;
                } else {
                    o.LJIJI("shareIcon");
                    throw null;
                }
            }
            o.LJIJI("shareIcon");
            throw null;
        }
        o.LJIJI("shareIcon");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        Activity LJIJJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.runOnUiThread(new ARunnableS39S0100000_3(this, 85));
        }
        n4().jv0(EnumC181857Bt.NORMAL, null);
    }

    public final void m4() {
        TuxIconView tuxIconView = (TuxIconView) Y3().findViewById(R.id.jt3).findViewById(R.id.jtc);
        if (tuxIconView != null) {
            Animation animation = tuxIconView.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(tuxIconView, 84));
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI interfaceC194547kI) {
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        this.LLI = C7MK.LIZLLL(((C181847Bs) this.LLFZ.getValue()).LJLILLLLZI, item);
        q4();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLII = (TuxIconView) C7MY.LIZLLL(view, "view", R.id.jtc, "view.findViewById(R.id.share_icon)");
        View findViewById = view.findViewById(R.id.h8e);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.n…share_bottom_layout_root)");
        this.LLIIII = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.jt6);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.share_count)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LLIIIILZ = tuxTextView;
        tuxTextView.setTuxFont(72);
        ConstraintLayout constraintLayout = this.LLIIII;
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS23S0100000_3(this, 112));
            C8YN.LJII(this, n4(), new TBT() { // from class: X.7MR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C7MT) obj).LJLILLLLZI;
                }
            }, C213688a4.LJ(), C7MS.LJLIL, 4);
        } else {
            o.LJIJI("shareLayout");
            throw null;
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }
}
