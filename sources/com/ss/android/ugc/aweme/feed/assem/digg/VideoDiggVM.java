package com.ss.android.ugc.aweme.feed.assem.digg;

import X.AnonymousClass114;
import X.AnonymousClass799;
import X.C03660Ck;
import X.C10K;
import X.C15070iV;
import X.C178476zT;
import X.C1810878u;
import X.C188727au;
import X.C193127i0;
import X.C1A7;
import X.C200417tl;
import X.C200427tm;
import X.C200447to;
import X.C200497tt;
import X.C200507tu;
import X.C200537tx;
import X.C200617u5;
import X.C200647u8;
import X.C200727uG;
import X.C2043180d;
import X.C214148ao;
import X.C221108m2;
import X.C227768wm;
import X.C2304092m;
import X.C2KM;
import X.C2U8;
import X.C33Q;
import X.C36922EeM;
import X.C3A5;
import X.C40883G2t;
import X.C45804HyK;
import X.C47704Ins;
import X.C48229IwL;
import X.C48231IwN;
import X.C50420Jqa;
import X.C54838Lfe;
import X.C55688LtM;
import X.C55749LuL;
import X.C56509MFt;
import X.C59955Nfz;
import X.C5S1;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C77123UOp;
import X.C78596Usy;
import X.C78996UzQ;
import X.C78999UzT;
import X.C79N;
import X.C7C1;
import X.C7HV;
import X.C80S;
import X.C87O;
import X.C8O4;
import X.FH5;
import X.FMX;
import X.HG3;
import X.IW7;
import X.InterfaceC200717uF;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.J9P;
import X.R3A;
import X.RBX;
import X.RBY;
import X.T16;
import X.TBV;
import X.V16;
import X.VPK;
import X.X1D;
import X.XKX;
import Y.ACallableS106S0100000_3;
import Y.AfS52S0200000_3;
import Y.AfS7S1201000_3;
import Y.AgS121S0100000_3;
import Y.IDgS137S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.AnimatedBtnScenario;
import com.ss.android.ugc.aweme.feed.model.AnimatedBtnStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS12S0200100_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VideoDiggVM extends FeedBaseViewModel<C200617u5> implements InterfaceC200717uF {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public long LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public C200537tx LJZ;
    public final C87O LJZI = new C87O(C200507tu.LJLIL);
    public final C55749LuL LJZL = new C55749LuL(C47704Ins.LJFF(this, C200447to.class, null), true);
    public final C55749LuL LL = new C55749LuL(C47704Ins.LJFF(this, C200427tm.class, null), true);
    public final C200727uG LLD;
    public final C62822Ol8 LLF;
    public final VPK LLFF;

    static {
        TBV tbv = new TBV(VideoDiggVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C200617u5(false, null, 31);
    }

    public final Context getContext() {
        return (Context) this.LJZI.LIZ(LLFFF[0]);
    }

    public final C200447to mv0() {
        C200447to c200447to = (C200447to) this.LJZL.getValue();
        if (c200447to == null) {
            return new C200447to((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
        }
        return c200447to;
    }

    public final IUnLoginDiggService ov0() {
        return (IUnLoginDiggService) this.LLF.getValue();
    }

    public VideoDiggVM() {
        C200727uG c200727uG = new C200727uG();
        this.LLD = c200727uG;
        this.LLF = C221108m2.LIZIZ(C200497tt.LJLIL);
        c200727uG.LJJ(new C178476zT());
        c200727uG.LJLILLLLZI = this;
        this.LLFF = new VPK();
    }

    public final DataCenter LLI() {
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            return gv0.dataCenter;
        }
        return null;
    }

    public final JSONObject getMobBaseJsonObject() {
        Aweme aweme;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        int i = this.LJLILLLLZI;
        String str = this.LJLJJL;
        if (str == null) {
            str = "";
        }
        return V16.LJIJJ(aweme, str, this.LJLJI, i);
    }

    public final long nv0() {
        if (C214148ao.LIZ()) {
            C200427tm c200427tm = (C200427tm) this.LL.getValue();
            if (c200427tm == null) {
                c200427tm = new C200427tm(null);
            }
            InterfaceC65784Pro<Long> interfaceC65784Pro = c200427tm.LJLIL;
            if (interfaceC65784Pro != null) {
                return interfaceC65784Pro.invoke().longValue();
            }
        } else {
            InterfaceC65784Pro<Long> interfaceC65784Pro2 = mv0().LJLJL;
            if (interfaceC65784Pro2 != null) {
                return interfaceC65784Pro2.invoke().longValue();
            }
        }
        return 0L;
    }

    public final void kv0(Exception exc) {
        Aweme aweme;
        int i;
        this.LJLLI = false;
        VideoItemParams gv0 = gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        if (getContext() != null && aweme != null) {
            XKX.LIZLLL(getAssemVMScope(), null, null, new C7C1(this, aweme, null), 3);
        }
        Context context = getContext();
        T t = this.LLD.LJLIL;
        if (t == 0 || ((C178476zT) t).LJLIL != 1) {
            i = R.string.tdd;
        } else {
            i = R.string.ei0;
        }
        C1A7.LJIJJLI(context, exc, i);
    }

    public final void m6(Aweme aweme) {
        if (getContext() == null || aweme == null) {
            return;
        }
        if (C63081OpJ.LJIJJ(aweme)) {
            runOnUIThread(new AqS169S0100000_3(this, 196));
            return;
        }
        if (C63081OpJ.LJLJJI(aweme)) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.hs5);
            c5s1.LJ();
        } else {
            if (this.LJLL || aweme.getUserDigg() != 0) {
                return;
            }
            this.LJLJLLL++;
            long xv0 = xv0(aweme, true);
            withState(new AqS12S0200100_3(this, xv0, aweme, 1));
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            C2U8.LIZ(new AnonymousClass799(aid, xv0, 1, C79N.ICON));
            rv0("click_double_like");
        }
    }

    @Override // X.InterfaceC200717uF
    public final void onItemDiggFailed(Exception e) {
        o.LJIIIZ(e, "e");
        kv0(e);
    }

    @Override // X.InterfaceC200717uF
    public final void onItemDiggSuccess(C15070iV<String, Integer> pair) {
        String str;
        Aweme aweme;
        VideoItemParams gv0;
        Aweme aweme2;
        Aweme aweme3;
        o.LJIIIZ(pair, "pair");
        DataCenter LLI = LLI();
        if (LLI != null) {
            LLI.jv0(pair, "digg_success");
        }
        this.LJLLI = false;
        C50420Jqa c50420Jqa = new C50420Jqa(13, pair.LIZ);
        Bundle bundle = new Bundle();
        Integer num = pair.LIZIZ;
        if (num == null) {
            num = -1;
        }
        VideoItemParams gv02 = gv0();
        String str2 = null;
        if (gv02 != null && (aweme3 = gv02.getAweme()) != null) {
            str2 = aweme3.getAid();
        }
        if (o.LJ(str2, pair.LIZ) && (gv0 = gv0()) != null && (aweme2 = gv0.getAweme()) != null) {
            aweme2.setUserDigg(num.intValue());
        }
        bundle.putInt("user_digged", num.intValue());
        c50420Jqa.LJLJI = bundle;
        C2U8.LIZ(c50420Jqa);
        C2U8.LIZ(new C1810878u(num.intValue()));
        VideoItemParams gv03 = gv0();
        if (gv03 != null) {
            gv03.getAweme();
        }
        if (num.intValue() == 1) {
            ISpecActService LJJJIL = SpecActServiceImpl.LJJJIL();
            VideoItemParams gv04 = gv0();
            if (gv04 == null || (aweme = gv04.getAweme()) == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            LJJJIL.LJIIZILJ("like", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r20.getUserDigg() == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r19.LJLL = r3;
        r10.element = xv0(r20, r3);
        r3 = r19.LJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r3 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        r19.LJLJLLL++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        r12.element = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r19.LJLJLLL--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ce, code lost:
    
        if (r20 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pv0(com.ss.android.ugc.aweme.feed.model.Aweme r20) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.pv0(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void qv0(Exception exc) {
        Aweme aweme;
        this.LJLLI = false;
        VideoItemParams gv0 = gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            if (aweme.getUserDigg() == 1) {
                aweme.setUserDigg(0);
                aweme.getStatistics().setDiggCount(Math.max(0L, this.LJLJLLL - 1));
            } else {
                aweme.setUserDigg(1);
                aweme.getStatistics().setDiggCount(this.LJLJLLL + 1);
            }
        }
        kv0(exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0685, code lost:
    
        if (r6.isEmpty() == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01f9, code lost:
    
        if (r9 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x046d, code lost:
    
        if (r9 == null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rv0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.rv0(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C200647u8 sv0(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService r0 = r8.ov0()
            java.util.Set r3 = r0.LJIIIIZZ()
            r6 = 0
            if (r9 == 0) goto Lbf
            java.lang.String r1 = r9.getAid()
        Lf:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            r5 = 0
            if (r0 != 0) goto L1e
            if (r1 != 0) goto Lb5
        L1e:
            r0 = 0
        L1f:
            r2 = 1
            if (r0 == 0) goto Lb2
            if (r9 == 0) goto Laf
            java.lang.String r0 = r9.getAid()
        L28:
            boolean r0 = X.ORZ.LJLJJI(r0, r3)
            if (r0 != 0) goto Lb2
            if (r9 == 0) goto L3c
            java.lang.String r0 = r9.getAid()
            if (r0 == 0) goto L39
            r3.add(r0)
        L39:
            r9.setUserDigg(r2)
        L3c:
            r8.LJLL = r2
            if (r9 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r9.getStatistics()
            if (r0 == 0) goto L54
            long r0 = r0.getDiggCount()
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r7 = r9.getStatistics()
            r3 = 1
            long r0 = r0 + r3
            r7.setDiggCount(r0)
        L54:
            com.ss.android.ugc.aweme.feed.model.AnimatedBtnStruct r0 = r9.animatedBtnStruct
            if (r0 == 0) goto L5f
            X.7tx r0 = new X.7tx
            r0.<init>(r9)
            r8.LJZ = r0
        L5f:
            r8.gv0()
            r8.gv0()
            boolean r0 = X.C178726zs.LIZJ(r9)
            r8.LJLLLL = r0
            if (r9 == 0) goto Lac
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r9.getStatistics()
            if (r0 == 0) goto Lac
            long r0 = r0.getDiggCount()
        L77:
            r8.LJLJLLL = r0
            r8.LJLLILLLL = r0
            if (r9 == 0) goto Laa
            int r0 = r9.getUserDigg()
        L81:
            r8.LJLLJ = r0
            if (r9 == 0) goto L8c
            int r0 = r9.getUserDigg()
            if (r0 != r2) goto L8c
            r5 = 1
        L8c:
            long r2 = r8.xv0(r9, r5)
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "digg aweme "
            r4.append(r0)
            if (r9 == 0) goto L9f
            java.lang.String r6 = r9.getAid()
        L9f:
            r1 = 6
            java.lang.String r0 = "VideoDiggVM"
            X.C1FJ.LJFF(r4, r6, r4, r1, r0)
            X.7u8 r0 = r8.lv0(r2, r9, r5)
            return r0
        Laa:
            r0 = 0
            goto L81
        Lac:
            r0 = 0
            goto L77
        Laf:
            r0 = r6
            goto L28
        Lb2:
            if (r9 == 0) goto L5f
            goto L54
        Lb5:
            com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService r0 = r8.ov0()
            boolean r0 = r0.LJII(r1)
            goto L1f
        Lbf:
            r1 = r6
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.sv0(com.ss.android.ugc.aweme.feed.model.Aweme):X.7u8");
    }

    public final void vv0(InterfaceC88471Ynr<? super Boolean, ? super Aweme, C76800UCe> onAllowClick) {
        Aweme aweme;
        boolean z;
        Activity activity;
        String str;
        Aweme aweme2;
        String str2;
        Activity activity2;
        Aweme aweme3;
        Aweme aweme4;
        Aweme aweme5;
        Activity LJIJJ;
        Aweme aweme6;
        o.LJIIIZ(onAllowClick, "onAllowClick");
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        DataCenter LLI = LLI();
        if (LLI != null) {
            LLI.jv0(aweme.getAid(), "VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR");
        }
        PublishPreviewInfo previewData = aweme.getPreviewData();
        if (previewData != null && previewData.getInPublishing()) {
            C5S1 c5s1 = new C5S1(getContext());
            c5s1.LIZJ(R.string.tfy);
            c5s1.LJ();
            return;
        }
        VideoItemParams gv02 = gv0();
        if (gv02 != null && (aweme6 = gv02.getAweme()) != null && C63081OpJ.LJIJJ(aweme6)) {
            C5S1 c5s12 = new C5S1(getContext());
            c5s12.LIZJ(R.string.b95);
            c5s12.LJ();
            return;
        }
        Aweme aweme7 = null;
        r2 = null;
        String str3 = null;
        if (aweme.isScheduleVideo()) {
            Context context = getContext();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                AnonymousClass114.LIZ(LJIJJ, R.string.qa7);
                return;
            }
            return;
        }
        int LJ = IW7.LJ();
        UnLoginDiggExperiment2022.LIZ();
        if (UnLoginDiggExperiment2022.LJ && !((RBX) HG3.LJIILL()).isLogin()) {
            FH5 LIZIZ = FH5.LIZIZ();
            String str4 = UnLoginDiggExperiment2022.LIZ().preciseExpVid;
            LIZIZ.getClass();
            FH5.LIZ(str4);
        }
        if (UnLoginDiggExperiment2022.LIZIZ() && !((RBX) HG3.LJIILL()).isLogin()) {
            if (ov0().LIZLLL() && !this.LJLL && aweme.getUserDigg() == 0) {
                z = true;
                ov0().LIZ(null);
            } else {
                z = false;
            }
        } else if (LJ == 0) {
            z = !((RBX) HG3.LJIILL()).isLogin();
        } else if (LJ > 0 && !((RBX) HG3.LJIILL()).isLogin() && !this.LJLL && aweme.getUserDigg() == 0 && C2043180d.LIZ() >= LJ) {
            z = true;
        } else {
            z = false;
        }
        C62822Ol8 c62822Ol8 = C193127i0.LIZ;
        if (((Keva) c62822Ol8.getValue()).getBoolean("first_like_config", true)) {
            UnLoginDiggExperiment2022.LIZ();
            if (!UnLoginDiggExperiment2022.LJ) {
                C193127i0.LIZ("default");
            } else {
                C193127i0.LIZ("non_default");
            }
            ((Keva) c62822Ol8.getValue()).storeBoolean("first_like_config", false);
        }
        if (z) {
            C200417tl c200417tl = new C200417tl();
            String str5 = this.LJLJI;
            if (str5 == null) {
                str5 = "";
            }
            c200417tl.LIZLLL = str5;
            c200417tl.LJJLIIIJJIZ = this.LJLILLLLZI;
            VideoItemParams gv03 = gv0();
            if (gv03 == null || (aweme5 = gv03.getAweme()) == null || (str = aweme5.getAid()) == null) {
                str = "";
            }
            c200417tl.LJJL = str;
            VideoItemParams gv04 = gv0();
            if (gv04 != null) {
                aweme2 = gv04.getAweme();
            } else {
                aweme2 = null;
            }
            c200417tl.LJJIIZ(aweme2);
            c200417tl.LJJLIIIJ = "click_like";
            c200417tl.LJJLIIIJILLIZJL = !C2043180d.LIZIZ() ? 1 : 0;
            c200417tl.LJJLIIIJJI = 1;
            c200417tl.LJIILIIL();
            if (!C2043180d.LIZIZ()) {
                C2043180d.LIZJ();
            }
            VideoItemParams gv05 = gv0();
            if (gv05 == null || (aweme4 = gv05.getAweme()) == null || (str2 = aweme4.getAid()) == null) {
                str2 = "";
            }
            Context context2 = getContext();
            if (context2 != null) {
                activity2 = C45804HyK.LJIJJ(context2);
            } else {
                activity2 = null;
            }
            String str6 = this.LJLJI;
            if (str6 == null) {
                str6 = "";
            }
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("login_title", "");
            c40883G2t.LIZLLL("group_id", str2);
            VideoItemParams gv06 = gv0();
            if (gv06 != null && (aweme3 = gv06.getAweme()) != null) {
                str3 = aweme3.getAuthorUid();
            }
            c40883G2t.LIZLLL("author_id", str3);
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str2));
            J9P.LIZIZ(activity2, str6, "click_like", (Bundle) c40883G2t.LIZ, new IDgS137S0200000_3(this, onAllowClick, 0));
            return;
        }
        if (C63081OpJ.LJLJLLL(aweme) && aweme.getUserDigg() == 0) {
            String LJJIL = C63081OpJ.LJJIL(R.string.tob, aweme);
            C5S1 c5s13 = new C5S1(getContext());
            c5s13.LIZLLL(LJJIL);
            c5s13.LJ();
            return;
        }
        if (C63081OpJ.LJLJJI(aweme)) {
            C5S1 c5s14 = new C5S1(getContext());
            c5s14.LIZJ(R.string.hs5);
            c5s14.LJ();
            return;
        }
        if (!aweme.isCanPlay() && aweme.getUserDigg() == 0) {
            if (aweme.isImage()) {
                C5S1 c5s15 = new C5S1(getContext());
                c5s15.LIZJ(R.string.h_y);
                c5s15.LJ();
                return;
            } else {
                C5S1 c5s16 = new C5S1(getContext());
                c5s16.LIZJ(R.string.tob);
                c5s16.LJ();
                return;
            }
        }
        if (aweme.isDelete() && aweme.getUserDigg() == 0) {
            C5S1 c5s17 = new C5S1(getContext());
            c5s17.LIZJ(R.string.tob);
            c5s17.LJ();
            return;
        }
        if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
            return;
        }
        if (aweme.isProhibited()) {
            C5S1 c5s18 = new C5S1(getContext());
            c5s18.LIZJ(R.string.hs5);
            c5s18.LJ();
            return;
        }
        Context context3 = getContext();
        if (context3 != null) {
            activity = C45804HyK.LJIJJ(context3);
        } else {
            activity = null;
        }
        if (C78996UzQ.LJJIIZI(aweme) && C80S.LJFF(aweme) && activity != null) {
            AnonymousClass114.LIZ(activity, R.string.pav);
            return;
        }
        if (!this.LJLL && C80S.LIZJ(aweme) && C80S.LJ(aweme)) {
            onAllowClick.invoke(Boolean.FALSE, null);
            return;
        }
        Boolean bool = Boolean.TRUE;
        VideoItemParams gv07 = gv0();
        if (gv07 != null) {
            aweme7 = gv07.getAweme();
        }
        onAllowClick.invoke(bool, aweme7);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C200617u5 iv0(C200617u5 state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C200617u5(R3A.LJII(), sv0(item.getAweme()), 28);
    }

    public final long xv0(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJLL = z;
            if (z) {
                if (this.LJLLJ == 1) {
                    if (this.LJLLILLLL < 1 && !aweme.isDelete()) {
                        this.LJLLILLLL = 1L;
                    }
                    return this.LJLLILLLL;
                }
                return this.LJLLILLLL + 1;
            }
            if (this.LJLLJ == 1 && !aweme.isDelete()) {
                return this.LJLLILLLL - 1;
            }
            return this.LJLLILLLL;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateDiggView when aweme is null:");
        LIZ.append(Log.getStackTraceString(new Throwable()));
        C36922EeM.LIZLLL(6, "VideoDiggVM", X1D.LIZIZ(LIZ));
        return 0L;
    }

    public final HashMap<String, String> buildQueryMap(String str, int i, boolean z) {
        HashMap<String, String> LIZJ = C03660Ck.LIZJ("aweme_id", str);
        LIZJ.put("type", String.valueOf(i));
        LIZJ.put("channel_id", String.valueOf(C55688LtM.LIZ(this.LJLJI)));
        LIZJ.put("friends_upvote", String.valueOf(z));
        return LIZJ;
    }

    public final C200647u8 lv0(long j, Aweme aweme, boolean z) {
        boolean z2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        DataCenter dataCenter;
        if (aweme != null) {
            VideoItemParams gv0 = gv0();
            if (gv0 != null && (dataCenter = gv0.dataCenter) != null) {
                dataCenter.jv0(Boolean.valueOf(z), "update_diig_view");
            }
            if (j < 0) {
                j = 0;
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateDiggView when aweme is null:");
            LIZ.append(Log.getStackTraceString(new Throwable()));
            C36922EeM.LIZLLL(6, "VideoDiggVM", X1D.LIZIZ(LIZ));
            j = 0;
        }
        boolean z3 = false;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.getDiggShowScene() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C54838Lfe.LJJI(aweme) ? !(aweme == null || z2) : !C2304092m.LIZ()) {
            z3 = true;
        }
        boolean LJLJLLL = C63081OpJ.LJLJLLL(aweme);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!LJLJLLL && j > 0) {
            str = C77123UOp.LJJIIJ(j);
        }
        return new C200647u8(str, z, z3);
    }

    public final void tv0(int i, String str, boolean z) {
        HashMap<String, String> buildQueryMap = buildQueryMap(str, i, z);
        this.LJLLI = true;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        C78999UzT.LJFF(ov0().LJIIIZ(buildQueryMap).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS7S1201000_3(i, this, str, c73318Sq2, 0), new AfS52S0200000_3(c73318Sq2, this, 1)), c73318Sq2);
    }

    public final void wv0(Double d, C8O4 cellContext, AqS153S0100000_3 aqS153S0100000_3) {
        VideoItemParams gv0;
        Aweme aweme;
        VideoItemParams gv02;
        Aweme aweme2;
        AnimatedBtnStruct animatedBtnStruct;
        VideoItemParams gv03;
        Aweme aweme3;
        AnimatedBtnStruct animatedBtnStruct2;
        Integer appearTime;
        C200537tx c200537tx;
        o.LJIIIZ(cellContext, "cellContext");
        if (!this.LJLZ && !this.LJLLLLLL && (gv0 = gv0()) != null && (aweme = gv0.getAweme()) != null && aweme.animatedBtnStruct != null && (gv02 = gv0()) != null && (aweme2 = gv02.getAweme()) != null && (animatedBtnStruct = aweme2.animatedBtnStruct) != null) {
            Integer scenario = animatedBtnStruct.getScenario();
            int value = AnimatedBtnScenario.LIKE_GUIDE.getValue();
            if (scenario == null || scenario.intValue() != value || (gv03 = gv0()) == null || (aweme3 = gv03.getAweme()) == null || (animatedBtnStruct2 = aweme3.animatedBtnStruct) == null || (appearTime = animatedBtnStruct2.getAppearTime()) == null || appearTime.intValue() < 0 || d == null || d.doubleValue() < appearTime.intValue() || ((RBY) HG3.LJIILL()).isChildrenMode() || !C56509MFt.LJIIJ(cellContext.LIZIZ()) || this.LJLL || this.LJLLI || this.LJLLLL || this.LJLLL || (c200537tx = this.LJZ) == null) {
                return;
            }
            C10K.LIZJ(new ACallableS106S0100000_3(c200537tx, 2)).LJ(new AgS121S0100000_3(new AqS134S0200000_3(this, aqS153S0100000_3, 16), 0), C10K.LJIIIIZZ, null);
        }
    }

    public final void uv0(Aweme aweme, boolean z, int i, String str) {
        Aweme aweme2;
        String str2;
        String str3;
        Long creativeId;
        Long adId;
        if (!C2043180d.LIZIZ()) {
            C2043180d.LIZJ();
        }
        if (!TextUtils.isEmpty(this.LJLJI) && i == 1) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            long currentTimeMillis = System.currentTimeMillis();
            String str4 = this.LJLJI;
            if (str4 == null) {
                str4 = "";
            }
            C48229IwL.LIZ(new C48231IwN(1, aid, str4, currentTimeMillis));
        }
        if ((UnLoginDiggExperiment2022.LIZIZ() && !((RBX) HG3.LJIILL()).isLogin()) || (IW7.LJ() != 0 && !((RBX) HG3.LJIILL()).isLogin())) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                C2043180d.LJ(C2043180d.LIZ() + 1);
                aweme.setUserDigg(1);
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(this.LJLJLLL);
                }
                C2U8.LIZ(new C50420Jqa(13, aweme.getAid()));
                tv0(i, str, z);
                return;
            }
            int LIZ = C2043180d.LIZ() - 1;
            if (LIZ < 0) {
                LIZ = 0;
            }
            C2043180d.LJ(LIZ);
            if (aweme != null) {
                String LJIILIIL = C62819Ol5.LJIILIIL(this.LJLILLLLZI, this.LJLJI, true);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", LJIILIIL);
                c188727au.LJIIIZ("enter_method", "click_like");
                c188727au.LJIIIZ("group_id", aweme.getAid());
                c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
                c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(aweme.getRequestId()));
                c188727au.LJIIIZ("from_group_id", C2KM.LIZ(mv0().LJLIL, mv0().LJLILLLLZI));
                C78596Usy.LJI(aweme, c188727au);
                FMX.LJIIL("unlogin_like_cancel", c188727au.LIZ);
            }
            aweme.setUserDigg(0);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(this.LJLJLLL);
            }
            C2U8.LIZ(new C50420Jqa(13, aweme.getAid()));
            tv0(i, str, z);
            return;
        }
        HashMap<String, String> buildQueryMap = buildQueryMap(str, i, z);
        VideoItemParams gv0 = gv0();
        String str5 = null;
        if (gv0 != null && (aweme2 = gv0.getAweme()) != null && aweme2.isAd()) {
            Context context = getContext();
            if (context != null) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str2 = awemeRawAd.getLogExtra();
                } else {
                    str2 = null;
                }
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
                    str3 = String.valueOf(adId);
                } else {
                    str3 = null;
                }
                AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                if (awemeRawAd3 != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
                    str5 = String.valueOf(creativeId);
                }
                C59955Nfz.LIZ(context, str2, str3, str5, buildQueryMap);
            }
        } else {
            C59955Nfz.LIZIZ(this.LJLJI, null, buildQueryMap);
        }
        this.LJLLI = true;
        this.LLD.LJIILL(buildQueryMap);
        if (i == 1) {
            C2U8.LIZ(new C50420Jqa(1301, str));
            C7HV.LIZIZ.LJIJ().LIZJ(str);
        }
    }
}
