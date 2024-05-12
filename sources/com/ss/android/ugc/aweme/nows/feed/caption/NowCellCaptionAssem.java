package com.ss.android.ugc.aweme.nows.feed.caption;

import X.AnonymousClass636;
import X.C04270Et;
import X.C16880lQ;
import X.C17N;
import X.C181847Bs;
import X.C185127Oi;
import X.C185167Om;
import X.C195937mX;
import X.C42625Go9;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C78963Uyt;
import X.C7ML;
import X.C8XO;
import X.C90193gN;
import X.InterfaceC185147Ok;
import X.InterfaceC194547kI;
import X.QD3;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class NowCellCaptionAssem extends ReusedUIContentAssem<NowCellCaptionAssem> implements C8XO<InterfaceC194547kI>, InterfaceC185147Ok {
    public TuxTextView LJZL;
    public final C55749LuL LL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowCellCaptionAssem() {
        new LinkedHashMap();
        this.LL = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
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
    public final void q4(InterfaceC194547kI interfaceC194547kI) {
        int z;
        boolean z2;
        Drawable drawable;
        InterfaceC194547kI item = interfaceC194547kI;
        o.LJIIIZ(item, "item");
        if (C185167Om.LIZIZ() == 0 || item.LLLLIIIILLL() || ((z = item.z()) != 0 && z != 1 && z != 3 && z != 4)) {
            Z3().setVisibility(8);
            return;
        }
        String desc = item.getAweme().getDesc();
        if (desc == null || desc.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!C78963Uyt.LJJIIZ(item.getAweme()) || C195937mX.LJ(item.getAweme())) {
                Z3().setVisibility(8);
                return;
            }
            Z3().setVisibility(0);
            Context context = getContext();
            if (context != null) {
                drawable = C04270Et.LIZIZ(context, R.drawable.btp);
                if (drawable != null) {
                    drawable.setBounds(0, 0, C17N.LJIILL(14.0d), C17N.LJIILL(14.0d));
                }
            } else {
                drawable = null;
            }
            TuxTextView Z3 = Z3();
            Z3.setText(Z3().getContext().getString(R.string.y2));
            Z3.setTuxFont(33);
            Context context2 = Z3.getContext();
            o.LJIIIIZZ(context2, "this.context");
            Z3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
            if (C90193gN.LIZ()) {
                Z3.setCompoundDrawables(null, null, drawable, null);
            } else {
                Z3.setCompoundDrawables(drawable, null, null, null);
            }
            Z3.setCompoundDrawablePadding(C17N.LJIILL(4.0d));
            C16880lQ.LJJJJI(Z3, new ACListenerS38S0200000_3(item, this, 101));
            return;
        }
        if (C185167Om.LIZIZ() == 1) {
            Z3().setVisibility(8);
            return;
        }
        Z3().setVisibility(0);
        Z3().setTuxFont(33);
        if (C195937mX.LJ(item.getAweme())) {
            Context context3 = getContext();
            if (context3 != null) {
                Z3().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context3));
            }
        } else {
            Context context4 = getContext();
            if (context4 != null) {
                Z3().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context4));
            }
        }
        Z3().setText(item.getAweme().getDesc());
        Z3().setCompoundDrawables(null, null, null, null);
        C16880lQ.LJJJJI(Z3(), new View.OnClickListener() { // from class: X.7Oj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6ZT.LIZ(view);
            }
        });
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCaptionSaveLocalEvent(C185127Oi event) {
        o.LJIIIZ(event, "event");
        if (!event.LJLIL.getAid().equals(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid())) {
            return;
        }
        if (C185167Om.LIZIZ() != 2) {
            Z3().setVisibility(8);
            return;
        }
        Z3().setTuxFont(33);
        TuxTextView Z3 = Z3();
        Context context = Z3().getContext();
        o.LJIIIIZZ(context, "caption.context");
        Z3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
        Z3().setCompoundDrawables(null, null, null, null);
        Z3().setText(event.LJLILLLLZI);
        ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().setDesc(event.LJLILLLLZI);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJZL = (TuxTextView) getContainerView();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }
}
