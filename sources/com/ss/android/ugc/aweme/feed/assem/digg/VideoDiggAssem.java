package com.ss.android.ugc.aweme.feed.assem.digg;

import X.AbstractC48820JEa;
import X.C16880lQ;
import X.C196497nR;
import X.C200647u8;
import X.C202087wS;
import X.C202327wq;
import X.C202337wr;
import X.C202347ws;
import X.C202357wt;
import X.C202367wu;
import X.C202377wv;
import X.C202387ww;
import X.C202457x3;
import X.C202467x4;
import X.C202477x5;
import X.C208078Ep;
import X.C214348b8;
import X.C221108m2;
import X.C2304092m;
import X.C241249dQ;
import X.C243099gP;
import X.C243109gQ;
import X.C29701Eo;
import X.C33920DSy;
import X.C34597Dhx;
import X.C35183DrP;
import X.C35666DzC;
import X.C36636EZk;
import X.C36922EeM;
import X.C37179EiV;
import X.C38805FKv;
import X.C43I;
import X.C51029K0z;
import X.C54838Lfe;
import X.C5H3;
import X.C61845OOz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79004UzY;
import X.C86V;
import X.C8T7;
import X.C8YN;
import X.C9BE;
import X.E3H;
import X.HG3;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.M62;
import X.OSZ;
import X.OUP;
import X.RBX;
import X.TBT;
import X.X1D;
import X.XKX;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes4.dex */
public class VideoDiggAssem extends BaseCellSlotComponent<VideoDiggAssem> implements ComponentPriorityProtocol {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public Drawable LLIIIL;
    public C202477x5 LLIIIZ;
    public boolean LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final ACListenerS23S0100000_3 LLIIL;

    static {
        TBT tbt = new TBT(VideoDiggAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoDiggAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoDiggAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0, c65351Pkp)};
    }

    public void D4() {
        C8YN.LJII(this, (AssemViewModel) this.LLIFFJFJJ.LIZ(this, LLIILII[2]), new TBT() { // from class: X.7wT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C203457yf) obj).LJLIL;
            }
        }, null, C202087wS.LJLIL, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int W3() {
        return R.layout.ad8;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_digg";
    }

    public VideoDiggAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 321));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StatePassingVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 323), null, C202327wq.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoDiggVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, c241249dQ, new AqS153S0100000_3(LIZ2, 324), null, C202337wr.INSTANCE, null, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(RightAreaContainerVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ3, c241249dQ, new AqS153S0100000_3(LIZ3, 325), null, C202347ws.INSTANCE, null, null);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C202357wt.INSTANCE);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C202367wu.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C202377wv.INSTANCE);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 320));
        this.LLIIJLIL = C221108m2.LIZIZ(C202387ww.LJLIL);
        this.LLIIL = new ACListenerS23S0100000_3(this, 66);
    }

    public final void B4() {
        boolean booleanValue = ((Boolean) C34597Dhx.LJ.getValue()).booleanValue();
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 322);
        C38805FKv.LIZIZ(C38805FKv.LIZ, new C35666DzC("VideoDiggAssem_SubscribeAsync", booleanValue, E3H.ASYNC_PRIORITY, -20), null, new AqS153S0100000_3(aqS153S0100000_3, 1615), 2);
    }

    public final VideoDiggVM r4() {
        return (VideoDiggVM) this.LLI.LIZ(this, LLIILII[1]);
    }

    public final C202477x5 u4() {
        if (this.LLIIIZ == null) {
            C202477x5 c202477x5 = new C202477x5();
            this.LLIIIZ = c202477x5;
            Context context = getContext();
            boolean z = false;
            if (context != null && !C79004UzY.LJJIJIIJI(context)) {
                z = true;
            }
            c202477x5.LIZ = z;
        }
        C202477x5 c202477x52 = this.LLIIIZ;
        o.LJI(c202477x52);
        return c202477x52;
    }

    public final VideoViewModel z4() {
        return (VideoViewModel) this.LLII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        r4().LJZI.LIZIZ(VideoDiggVM.LLFFF[0], null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        Drawable drawable = ((ImageView) Y3().findViewById(R.id.c_r)).getDrawable();
        if (drawable == null || o.LJ(drawable, this.LLIIIL)) {
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(r4()), C36636EZk.LIZ, null, new C196497nR(this, null), 2);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate: ");
        LIZ.append(this);
        C36922EeM.LIZLLL(2, "VideoDiggAssem", X1D.LIZIZ(LIZ));
        if (((Boolean) C35183DrP.LJIILL.getValue()).booleanValue()) {
            if (!C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS39S0100000_3(this, 62));
                return;
            } else {
                B4();
                return;
            }
        }
        B4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A4(C43I<? extends VideoItemParams> c43i) {
        Aweme aweme;
        if (c43i == null) {
            return;
        }
        VideoDiggVM r4 = r4();
        VideoItemParams videoItemParams = (VideoItemParams) c43i.LIZ;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        r4.getClass();
        r4.setState(new AqS134S0200000_3(r4, aweme, 17));
    }

    public void C4(C200647u8 c200647u8) {
        Aweme aweme;
        DescBottomViewModel descBottomViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        if (c200647u8 == null) {
            return;
        }
        if (!c200647u8.LIZJ) {
            Y3().findViewById(R.id.c_u).setVisibility(4);
        } else {
            try {
                Y3().findViewById(R.id.c_u).setVisibility(0);
                ((TextView) Y3().findViewById(R.id.c_u)).setText(c200647u8.LIZ);
            } catch (NullPointerException e) {
                TextView textView = (TextView) Y3().findViewById(R.id.c_u);
                VideoItemParams gv0 = r4().gv0();
                if (gv0 != null) {
                    aweme = gv0.getAweme();
                } else {
                    aweme = null;
                }
                C63081OpJ.LJLJLLL(aweme);
                textView.setText(CardStruct.IStatusCode.DEFAULT);
                C36922EeM.LJFF(e);
                C16880lQ.LLLLIIL(e);
            }
        }
        ((ImageView) Y3().findViewById(R.id.c_r)).setSelected(c200647u8.LIZIZ);
        if (Y3().findViewById(R.id.c_r).isSelected()) {
            Y3().findViewById(R.id.c_x).setContentDescription(C86V.LJFF(R.string.aea));
        } else {
            View findViewById = Y3().findViewById(R.id.c_x);
            String LJFF = C86V.LJFF(R.string.abj);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…abels_following_btn_like)");
            findViewById.setContentDescription(C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(c200647u8.LIZ)))));
        }
        if (this.LLIIJI && (descBottomViewModel = (DescBottomViewModel) this.LLIIIJ.getValue()) != null && (mutableLiveData = descBottomViewModel.LJLIL) != null) {
            mutableLiveData.postValue(Boolean.valueOf(c200647u8.LIZIZ));
        }
        ((AbstractC48820JEa) this.LLIIJLIL.getValue()).LJIIIIZZ("showDiggState containerView : " + getContainerView().getVisibility() + " contentView : " + Y3().getVisibility());
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        boolean z = C202457x3.LIZ;
        if (z) {
            String aid = item.getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            C243099gP LIZJ = C243109gQ.LIZJ(aid, "digg");
            if (LIZJ != null) {
                LIZJ.LIZ("VideoDiggAssem.onBind");
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBind: ");
        LIZ.append(this);
        LIZ.append(", item: ");
        LIZ.append(item);
        C36922EeM.LIZLLL(2, "VideoDiggAssem", X1D.LIZIZ(LIZ));
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LLIIJLIL.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onBind containerView : ");
        LIZ2.append(getContainerView().getVisibility());
        LIZ2.append(" contentView : ");
        LIZ2.append(Y3().getVisibility());
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        ((C29701Eo) Y3().findViewById(R.id.c_r)).setImageDrawable(this.LLIIIL);
        M62 m62 = M62.LIZIZ;
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        m62.LIZJ(str);
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        if (z) {
            Y3().post(new ARunnableS22S0200000_3(item, this, 3));
        }
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && C54838Lfe.LJJI(aweme2) && C2304092m.LIZ()) {
            if (((RBX) HG3.LJIILL()).isMe(item.getAweme().getAuthorUid())) {
                OUP.LJIJJLI(getContainerView());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewCreated: ");
        LIZ.append(this);
        C36922EeM.LIZLLL(2, "VideoDiggAssem", X1D.LIZIZ(LIZ));
        super.onViewCreated(view);
        this.LLIIIL = C202467x4.LIZJ(view.getContext());
        C202477x5 u4 = u4();
        u4.LIZIZ = getContainerView();
        u4.LJFF = Y3();
        u4.LIZJ = Y3().findViewById(R.id.c_t);
        u4.LIZLLL = (C202467x4) Y3().findViewById(R.id.c_r);
        u4.LJ = (TuxTextView) Y3().findViewById(R.id.c_u);
        Drawable LIZJ = C202477x5.LIZJ();
        if (LIZJ != null) {
            this.LLIIIL = LIZJ;
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 67), getContainerView());
        C16880lQ.LJIILJJIL((FrameLayout) Y3().findViewById(R.id.c_t), this.LLIIL);
        h0.LJIJI(Y3().findViewById(R.id.c_x), new IDaS89S0000000_3(0));
        C16880lQ.LJJJJI((TuxTextView) Y3().findViewById(R.id.c_u), this.LLIIL);
        C33920DSy.LJLIL.LJLIL(getContainerView().findViewById(R.id.c_u));
        C16880lQ.LJIIZILJ((LinearLayout) Y3().findViewById(R.id.c_x), this.LLIIL);
        Y3().post(new ARunnableS39S0100000_3(this, 63));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoDiggVM r4 = r4();
        r4.LJZI.LIZIZ(VideoDiggVM.LLFFF[0], getContext());
    }

    public final void q4(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewParent parent = Y3().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            viewGroup2.setClipChildren(z);
        }
        ViewParent parent2 = Y3().getParent().getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return;
        }
        viewGroup.setClipChildren(z);
    }
}
