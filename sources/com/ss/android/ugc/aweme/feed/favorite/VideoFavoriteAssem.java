package com.ss.android.ugc.aweme.feed.favorite;

import X.AnonymousClass843;
import X.C16880lQ;
import X.C1DH;
import X.C200647u8;
import X.C202677xP;
import X.C203327yS;
import X.C203347yU;
import X.C203417yb;
import X.C203427yc;
import X.C203477yh;
import X.C203487yi;
import X.C203497yj;
import X.C203507yk;
import X.C203537yn;
import X.C203547yo;
import X.C203557yp;
import X.C203607yu;
import X.C203657yz;
import X.C203857zJ;
import X.C208078Ep;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C29701Eo;
import X.C51029K0z;
import X.C52535Kjb;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79004UzY;
import X.C86V;
import X.C8T7;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.OSJ;
import X.OSZ;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public class VideoFavoriteAssem extends BaseCellSlotComponent<VideoFavoriteAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIZ;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final C5H3 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C5H3 LLIIII;
    public Drawable LLIIIILZ;
    public C203347yU LLIIIJ;
    public boolean LLIIIL;

    static {
        TBT tbt = new TBT(VideoFavoriteAssem.class, "favoriteVM", "getFavoriteVM()Lcom/ss/android/ugc/aweme/feed/favorite/VideoFavoriteVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoFavoriteAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.ad_;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_favorite";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7yq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203577yr) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 49), 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7ys
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203577yr) obj).LJLILLLLZI;
            }
        }, null, C203427yc.LJLIL, 6);
        if (!C52535Kjb.LIZ()) {
            C8YN.LJII(this, (AssemViewModel) this.LLIIII.getValue(), new TBT() { // from class: X.7yw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C8UB) obj).LJZ;
                }
            }, C213688a4.LIZLLL(), C203487yi.LJLIL, 4);
        }
        z4();
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7yl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C203507yk.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.7ym
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C203497yj.LJLIL, 4);
        if (AnonymousClass843.LIZ()) {
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 78));
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7yt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203577yr) obj).LJLJI;
            }
        }, null, C203477yh.LJLIL, 6);
    }

    public void z4() {
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIIIZ[1]), new TBT() { // from class: X.7yT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLIL;
            }
        }, null, C203327yS.LJLIL, 6);
    }

    public VideoFavoriteAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 396));
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoFavoriteVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 397), null, C203607yu.INSTANCE, null, null);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C203547yo.INSTANCE);
        C65776Prg LIZ2 = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 398), null, C203537yn.INSTANCE, null, null);
        this.LLII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 395));
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C203557yp.INSTANCE);
    }

    public final VideoFavoriteVM q4() {
        return (VideoFavoriteVM) this.LLFZ.LIZ(this, LLIIIZ[0]);
    }

    public final C203347yU r4() {
        if (this.LLIIIJ == null) {
            C203347yU c203347yU = new C203347yU();
            this.LLIIIJ = c203347yU;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C79004UzY.LJJIJIIJI(context)) {
                z = true;
            }
            c203347yU.LIZ = z;
        }
        C203347yU c203347yU2 = this.LLIIIJ;
        o.LJI(c203347yU2);
        return c203347yU2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        q4().LJLLILLLL.LIZIZ(VideoFavoriteVM.LJLZ[0], null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C203657yz.LIZ = true;
        C203347yU r4 = r4();
        r4.LIZIZ = getContainerView();
        r4.LIZJ = Y3();
        r4.LIZLLL = Y3().findViewById(R.id.d59);
        r4.LJ = (C203417yb) Y3().findViewById(R.id.d56);
        r4.LJFF = (TuxTextView) Y3().findViewById(R.id.d5_);
        this.LLIIIILZ = r4.LIZ();
        ((C29701Eo) Y3().findViewById(R.id.d56)).setImageDrawable(this.LLIIIILZ);
        h0.LJIJI(Y3().findViewById(R.id.d5j), new IDaS89S0000000_3(3));
        View findViewById = Y3().findViewById(R.id.d5j);
        o.LJIIIIZZ(findViewById, "contentView.favorite_view_layout");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 10, 42, 42), findViewById);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoFavoriteVM q4 = q4();
        q4.LJLLILLLL.LIZIZ(VideoFavoriteVM.LJLZ[0], getContext());
    }

    public void u4(C200647u8 c200647u8) {
        DescBottomViewModel descBottomViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Aweme aweme;
        String aid;
        if (c200647u8 == null) {
            return;
        }
        VideoItemParams gv0 = q4().gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && (aid = aweme.getAid()) != null) {
            C203857zJ.LIZ.put(toString(), new OSJ<>(aid, Boolean.valueOf(c200647u8.LIZJ), Boolean.valueOf(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().isAd())));
        }
        if (c200647u8.LIZJ) {
            Y3().findViewById(R.id.d5j).setVisibility(0);
            Y3().findViewById(R.id.d59).setVisibility(0);
            Y3().findViewById(R.id.d5_).setVisibility(0);
        } else {
            Y3().findViewById(R.id.d5j).setVisibility(8);
            Y3().findViewById(R.id.d59).setVisibility(8);
            Y3().findViewById(R.id.d5_).setVisibility(8);
            C203857zJ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        }
        ((ImageView) Y3().findViewById(R.id.d56)).setSelected(c200647u8.LIZIZ);
        ((TextView) Y3().findViewById(R.id.d5_)).setText(c200647u8.LIZ);
        if (Y3().findViewById(R.id.d56).isSelected()) {
            View findViewById = Y3().findViewById(R.id.d5j);
            String LJFF = C86V.LJFF(R.string.ac5);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…btn_favorite_StatusAdded)");
            h0.LJJII(findViewById, C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(c200647u8.LIZ)))));
        } else {
            View findViewById2 = Y3().findViewById(R.id.d5j);
            String LJFF2 = C86V.LJFF(R.string.ac6);
            o.LJIIIIZZ(LJFF2, "getString(R.string.acces…_favorite_StatusNotAdded)");
            h0.LJJII(findViewById2, C208078Ep.LIZ(LJFF2, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(c200647u8.LIZ)))));
        }
        if (C202677xP.LIZIZ() && !C79004UzY.LJJIJIIJI(getContext())) {
            ((C29701Eo) Y3().findViewById(R.id.d56)).setImageDrawable(r4().LIZ());
        }
        if (this.LLIIIL && (descBottomViewModel = (DescBottomViewModel) this.LLII.getValue()) != null && (mutableLiveData = descBottomViewModel.LJLILLLLZI) != null) {
            mutableLiveData.postValue(Boolean.valueOf(c200647u8.LIZIZ));
        }
    }
}
