package com.ss.android.ugc.aweme.viewmodel;

import X.ActivityC45651qj;
import X.C03660Ck;
import X.C15070iV;
import X.C178476zT;
import X.C17N;
import X.C183887Jo;
import X.C1A7;
import X.C200347te;
import X.C200367tg;
import X.C200407tk;
import X.C200427tm;
import X.C200437tn;
import X.C200447to;
import X.C200727uG;
import X.C2043180d;
import X.C227768wm;
import X.C26045AKb;
import X.C2U8;
import X.C36922EeM;
import X.C40328FsC;
import X.C40883G2t;
import X.C45804HyK;
import X.C47704Ins;
import X.C50420Jqa;
import X.C55688LtM;
import X.C55749LuL;
import X.C59955Nfz;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C76800UCe;
import X.C77123UOp;
import X.C78996UzQ;
import X.C80S;
import X.C87O;
import X.HG3;
import X.InterfaceC200717uF;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.J9P;
import X.RBX;
import X.TBV;
import X.VPK;
import X.X1D;
import X.XKX;
import Y.IDgS137S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostDiggViewModel extends AssemViewModel<C200367tg> implements InterfaceC200717uF {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public long LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public final C87O LJLJJL = new C87O(C200437tn.LJLIL);
    public final C200727uG LJLJJLL;
    public final VPK LJLJL;
    public Aweme LJLJLJ;
    public final C55749LuL LJLJLLL;
    public final C55749LuL LJLL;

    static {
        TBV tbv = new TBV(PostDiggViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C200367tg defaultState() {
        return new C200367tg(null, null);
    }

    public final Context getContext() {
        return (Context) this.LJLJJL.LIZ(LJLLI[0]);
    }

    public final boolean iv0() {
        return this.LJLJJLL.LJJIFFI();
    }

    public PostDiggViewModel() {
        C200727uG c200727uG = new C200727uG();
        this.LJLJJLL = c200727uG;
        this.LJLJL = new VPK();
        this.LJLJLLL = new C55749LuL(C47704Ins.LJFF(this, C200447to.class, null), true);
        this.LJLL = new C55749LuL(C47704Ins.LJFF(this, C200427tm.class, null), true);
        c200727uG.LJJ(new C178476zT());
        c200727uG.LJLILLLLZI = this;
    }

    public final void kv0(InterfaceC88471Ynr<? super Boolean, ? super Aweme, C76800UCe> onAllowClick) {
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(onAllowClick, "onAllowClick");
        Aweme aweme = this.LJLJLJ;
        if (aweme == null) {
            return;
        }
        Activity activity = null;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            Context context = getContext();
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            }
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("login_title", "");
            c40883G2t.LIZLLL("group_id", aid);
            c40883G2t.LIZLLL("author_id", aweme.getAuthorUid());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
            J9P.LIZIZ(activity, "enterFrom", "click_like", (Bundle) c40883G2t.LIZ, new IDgS137S0200000_3(this, onAllowClick, 2));
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (LJJIFFI = C45804HyK.LJJIFFI(context2)) != null) {
            if (C63081OpJ.LJLJLLL(aweme) && aweme.getUserDigg() == 0) {
                String LJJIL = C63081OpJ.LJJIL(R.string.tob, aweme);
                C26045AKb c26045AKb = new C26045AKb(LJJIFFI);
                c26045AKb.LJIIIZ(LJJIL);
                c26045AKb.LJIIJ();
                return;
            }
            if (aweme.isDelete() && aweme.getUserDigg() == 0) {
                C40328FsC.LIZLLL(LJJIFFI, R.string.tob);
                return;
            } else if (aweme.isProhibited()) {
                C40328FsC.LIZLLL(LJJIFFI, R.string.hs5);
                return;
            } else if (C78996UzQ.LJJIIZI(aweme) && C80S.LJFF(aweme)) {
                C40328FsC.LIZLLL(LJJIFFI, R.string.pav);
                return;
            }
        }
        if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
            return;
        }
        if (!this.LJLILLLLZI && C80S.LIZJ(aweme) && C80S.LJ(aweme)) {
            onAllowClick.invoke(Boolean.FALSE, null);
        } else {
            onAllowClick.invoke(Boolean.TRUE, aweme);
        }
    }

    @Override // X.InterfaceC200717uF
    public final void onItemDiggFailed(Exception e) {
        int i;
        o.LJIIIZ(e, "e");
        Aweme aweme = this.LJLJLJ;
        if (getContext() != null && aweme != null) {
            XKX.LIZLLL(getAssemVMScope(), null, null, new C200407tk(this, aweme, null), 3);
        }
        Context context = getContext();
        T t = this.LJLJJLL.LJLIL;
        if (t == 0 || ((C178476zT) t).LJLIL != 1) {
            i = R.string.tdd;
        } else {
            i = R.string.ei0;
        }
        C1A7.LJIJJLI(context, e, i);
    }

    @Override // X.InterfaceC200717uF
    public final void onItemDiggSuccess(C15070iV<String, Integer> pair) {
        o.LJIIIZ(pair, "pair");
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C17N.LJJIII(this));
        LIZ.append(" : OnItemDiggSucess");
        printStream.println(X1D.LIZIZ(LIZ));
        C50420Jqa c50420Jqa = new C50420Jqa(13, pair.LIZ);
        Bundle bundle = new Bundle();
        Integer num = pair.LIZIZ;
        if (num == null) {
            num = -1;
        }
        bundle.putInt("user_digged", num.intValue());
        c50420Jqa.LJLJI = bundle;
        C2U8.LIZ(c50420Jqa);
        Integer num2 = pair.LIZIZ;
        if (num2 != null) {
            num2.intValue();
            String str = pair.LIZ;
            if (str != null) {
                PrintStream printStream2 = System.out;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C17N.LJJIII(this));
                LIZ2.append(" : OnDiggUpdateEvent");
                printStream2.println(X1D.LIZIZ(LIZ2));
                C2U8.LIZ(new C183887Jo(str));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        if (r6 == null) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(com.ss.android.ugc.aweme.model.PostModeDetailParams r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel.hv0(com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.String):void");
    }

    public final long lv0(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJLILLLLZI = z;
            if (z) {
                if (this.LJLJJI == 1) {
                    if (this.LJLJI < 1 && !aweme.isDelete()) {
                        this.LJLJI = 1L;
                    }
                    return this.LJLJI;
                }
                return this.LJLJI + 1;
            }
            if (this.LJLJJI == 1 && !aweme.isDelete()) {
                return this.LJLJI - 1;
            }
            return this.LJLJI;
        }
        String LJJIII = C17N.LJJIII(this);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDiggView when aweme is null:");
        LIZ.append(Log.getStackTraceString(new Throwable()));
        C36922EeM.LIZLLL(6, LJJIII, X1D.LIZIZ(LIZ));
        return 0L;
    }

    public final C200347te gv0(long j, Aweme aweme, boolean z) {
        boolean z2;
        boolean LJLJLLL;
        String str;
        if (aweme != null) {
            if (j < 0) {
                j = 0;
            }
            if (aweme != null && !aweme.isDelete()) {
                z2 = true;
                LJLJLLL = C63081OpJ.LJLJLLL(aweme);
                str = CardStruct.IStatusCode.DEFAULT;
                if (!LJLJLLL && j > 0) {
                    str = C77123UOp.LJJIIJ(j);
                }
                return new C200347te(str, z, z2);
            }
        } else {
            String LJJIII = C17N.LJJIII(this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateDiggView when aweme is null:");
            LIZ.append(Log.getStackTraceString(new Throwable()));
            C36922EeM.LIZLLL(6, LJJIII, X1D.LIZIZ(LIZ));
            j = 0;
        }
        z2 = false;
        LJLJLLL = C63081OpJ.LJLJLLL(aweme);
        str = CardStruct.IStatusCode.DEFAULT;
        if (!LJLJLLL) {
            str = C77123UOp.LJJIIJ(j);
        }
        return new C200347te(str, z, z2);
    }

    public final void jv0(int i, String str, Aweme aweme) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                C2043180d.LJ(C2043180d.LIZ() + 1);
                aweme.setUserDigg(1);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(this.LJLIL);
                }
                C2U8.LIZ(new C50420Jqa(13, (Object) 0));
                return;
            }
            int LIZ = C2043180d.LIZ() - 1;
            if (LIZ < 0) {
                LIZ = 0;
            }
            C2043180d.LJ(LIZ);
            aweme.setUserDigg(0);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(this.LJLIL);
            }
            C2U8.LIZ(new C50420Jqa(13, (Object) 1));
            return;
        }
        HashMap LIZJ = C03660Ck.LIZJ("aweme_id", str);
        LIZJ.put("type", String.valueOf(i));
        LIZJ.put("channel_id", String.valueOf(C55688LtM.LIZ("eventType")));
        C59955Nfz.LIZIZ("eventType", null, LIZJ);
        this.LJLJJLL.LJIILL(LIZJ);
    }
}
