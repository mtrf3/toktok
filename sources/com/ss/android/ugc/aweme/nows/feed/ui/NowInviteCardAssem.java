package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C16880lQ;
import X.C184767My;
import X.C2067089i;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C25600zU;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C71895SJn;
import X.C78926UyI;
import X.C7MY;
import X.C7WM;
import X.C7WN;
import X.C8YN;
import X.InterfaceC251799uR;
import X.SY4;
import X.TBT;
import X.Z8A;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowInviteCardViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowInviteCardAssem extends UISlotAssem {
    public final C55749LuL LJLJLLL;
    public final C214298b3 LJLL;
    public C71799SFv LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public SY4 LJLLL;
    public C71895SJn LJLLLL;
    public C71895SJn LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.by3;
    }

    public NowInviteCardAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C184767My.class, null), checkSupervisorPrepared());
        C65776Prg LIZ = C65352Pkq.LIZ(NowInviteCardViewModel.class);
        this.LJLL = new C214298b3(new AqS153S0100000_3(LIZ, 602), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C7WM.INSTANCE, LIZ);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        View findViewById;
        View view = getSupervisor().LJLLL;
        if (view != null && (findViewById = view.findViewById(this.LJLIL)) != null) {
            if (findViewById instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(new C25600zU(getContext(), R.style.vo)), R.layout.by3, viewGroup, false);
                if (LLLLIILL != null) {
                    viewGroup.addView(LLLLIILL);
                    E3(LLLLIILL);
                    setContainerView(findViewById);
                    onViewCreated(LLLLIILL);
                    return;
                }
                return;
            }
            "container must be a ViewGroup.".toString();
            throw new IllegalStateException("container must be a ViewGroup.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LJLLI = (C71799SFv) C7MY.LIZLLL(view, "view", R.id.ace, "view.findViewById(R.id.avatar_inviter)");
        View findViewById = view.findViewById(R.id.mq0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_username)");
        this.LJLLILLLL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.m4n);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_desc)");
        this.LJLLJ = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.axm);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.btn_now)");
        this.LJLLL = (SY4) findViewById3;
        View findViewById4 = view.findViewById(R.id.acr);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.avatar_skeleton)");
        this.LJLLLL = (C71895SJn) findViewById4;
        View findViewById5 = view.findViewById(R.id.mke);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_skeleton)");
        this.LJLLLLLL = (C71895SJn) findViewById5;
        SY4 sy4 = this.LJLLL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new View.OnClickListener() { // from class: X.7WL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Z89 z89 = Z89.LIZIZ;
                    Context context = view2.getContext();
                    o.LJIIIIZZ(context, "v.context");
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_method", "chat_share_invite");
                    C197457oz.LIZ(z89, context, bundle, true, 8);
                }
            });
            TuxTextView tuxTextView = this.LJLLJ;
            if (tuxTextView != null) {
                tuxTextView.LJJJ(28.0f);
                TuxTextView tuxTextView2 = this.LJLLJ;
                if (tuxTextView2 != null) {
                    C2067089i.LIZ(R.string.j3d, tuxTextView2);
                    C8YN.LJII(this, (AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.7WP
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C7WO) obj).LJLIL;
                        }
                    }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 59), 4);
                    final NowInviteCardViewModel nowInviteCardViewModel = (NowInviteCardViewModel) this.LJLL.getValue();
                    String uid = ((C184767My) this.LJLJLLL.getValue()).getUid();
                    o.LJIIIZ(uid, "uid");
                    if (uid.length() == 0) {
                        nowInviteCardViewModel.setState(C7WN.LJLIL);
                        return;
                    } else {
                        Z8A.LIZIZ.requestUser(uid, null, new InterfaceC251799uR() { // from class: X.7WQ
                            @Override // X.InterfaceC251799uR
                            public final void LIZ(User user) {
                                NowInviteCardViewModel.this.setState(new AqS169S0100000_3(user, 27));
                            }

                            @Override // X.InterfaceC251799uR
                            public final void onFailed(Exception exc) {
                                StackTraceElement[] stackTraceElementArr;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("queryInviter:onFailed");
                                if (exc != null) {
                                    stackTraceElementArr = exc.getStackTrace();
                                } else {
                                    stackTraceElementArr = null;
                                }
                                LIZ.append(stackTraceElementArr);
                                X1D.LIZIZ(LIZ);
                            }
                        });
                        return;
                    }
                }
                o.LJIJI("descTv");
                throw null;
            }
            o.LJIJI("descTv");
            throw null;
        }
        o.LJIJI("btnNow");
        throw null;
    }
}
