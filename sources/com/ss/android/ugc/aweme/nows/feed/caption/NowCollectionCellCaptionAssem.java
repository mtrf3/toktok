package com.ss.android.ugc.aweme.nows.feed.caption;

import X.AnonymousClass636;
import X.C17N;
import X.C181847Bs;
import X.C185127Oi;
import X.C185167Om;
import X.C187357Wx;
import X.C187377Wz;
import X.C195627m2;
import X.C195937mX;
import X.C214348b8;
import X.C42625Go9;
import X.C47704Ins;
import X.C53947LFf;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC185147Ok;
import X.InterfaceC74236TBo;
import X.QD3;
import X.TBT;
import Y.AUListenerS92S0100000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class NowCollectionCellCaptionAssem extends ReusedUIContentAssem<NowCollectionCellCaptionAssem> implements C8XO<C195627m2>, InterfaceC185147Ok {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public TuxTextView LJZL;
    public final InterfaceC115514g7 LL;
    public final C55749LuL LLD;
    public C195627m2 LLF;
    public Aweme LLFF;

    static {
        TBT tbt = new TBT(NowCollectionCellCaptionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowOtherCollectionListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowCollectionCellCaptionAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowOtherCollectionListViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 572), null, C187357Wx.INSTANCE, null, null);
        this.LLD = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final TuxTextView Z3() {
        TuxTextView tuxTextView = this.LJZL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        o.LJIJI("caption");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        if (C42625Go9.LIZ(this)) {
            C42625Go9.LIZJ(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!C42625Go9.LIZ(this)) {
            C42625Go9.LIZIZ(this);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C195627m2 c195627m2) {
        int i;
        C195627m2 item = c195627m2;
        o.LJIIIZ(item, "item");
        this.LLF = item;
        C187377Wz c187377Wz = C187377Wz.LIZIZ;
        if (c187377Wz.LIZIZ() != 0) {
            C195627m2 c195627m22 = this.LLF;
            if (c195627m22 != null) {
                i = c195627m22.LJLJI;
            } else {
                i = 0;
            }
            if (c187377Wz.LIZ(i)) {
                return;
            }
            C8YN.LJII(this, (AssemViewModel) this.LL.LIZ(this, LLFFF[0]), new TBT() { // from class: X.7ju
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C194567kK) obj).LJLJJI);
                }
            }, null, new AqS166S0200000_3(item, this, 26), 6);
        }
    }

    public final void a4(String str) {
        boolean z;
        int i;
        boolean z2;
        int height;
        Z3().setTuxFont(33);
        Aweme aweme = this.LLFF;
        if (aweme != null && C195937mX.LJ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView Z3 = Z3();
            Context context = Z3().getContext();
            o.LJIIIIZZ(context, "caption.context");
            Z3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
        } else {
            TuxTextView Z32 = Z3();
            Context context2 = Z3().getContext();
            o.LJIIIIZZ(context2, "caption.context");
            Z32.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
        }
        if (Z3().getVisibility() == 0) {
            i = Z3().getHeight();
        } else {
            i = 0;
        }
        Z3().setText(str);
        StaticLayout staticLayout = new StaticLayout(str, Z3().getPaint(), C17N.LJIILL(C53947LFf.LIZLLL() - 32), Layout.Alignment.ALIGN_NORMAL, Z3().getLineSpacingMultiplier(), Z3().getLineSpacingExtra(), true);
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            height = 0;
        } else if (staticLayout.getLineCount() > 2) {
            height = staticLayout.getLineBottom(1) - staticLayout.getLineTop(0);
        } else {
            height = staticLayout.getHeight();
        }
        ValueAnimator duration = ValueAnimator.ofInt(i, height).setDuration(200L);
        duration.addUpdateListener(new AUListenerS92S0100000_3(this, 11));
        duration.start();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C195627m2 c195627m2) {
        return true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCaptionSaveLocalEvent(C185127Oi event) {
        String str;
        o.LJIIIZ(event, "event");
        if (C185167Om.LIZIZ() != 2) {
            return;
        }
        String aid = event.LJLIL.getAid();
        Aweme aweme = this.LLFF;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (aid.equals(str)) {
            Z3().setTuxFont(33);
            TuxTextView Z3 = Z3();
            Context context = Z3().getContext();
            o.LJIIIIZZ(context, "caption.context");
            Z3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
            a4(event.LJLILLLLZI);
            Aweme aweme2 = this.LLFF;
            if (aweme2 != null) {
                aweme2.setDesc(event.LJLILLLLZI);
            }
            Z3().setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJZL = (TuxTextView) getContainerView();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C195627m2 c195627m2) {
    }
}
