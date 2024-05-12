package com.ss.android.ugc.aweme.profile.aigc;

import X.APM;
import X.APN;
import X.AbstractC73638SvC;
import X.ActivityC45651qj;
import X.C110614Vt;
import X.C16880lQ;
import X.C19N;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C244419iX;
import X.C246649m8;
import X.C252709vu;
import X.C26227ARb;
import X.C2VQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C61328O5c;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72121SSf;
import X.C73458SsI;
import X.C73849Syb;
import X.C73969T1h;
import X.C74040T4a;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C8YN;
import X.C9TY;
import X.EnumC244439iZ;
import X.InterfaceC72136SSu;
import X.InterfaceC88472Yns;
import X.OPL;
import X.Q7K;
import X.ST6;
import X.ST8;
import X.ST9;
import X.STD;
import X.STE;
import X.STG;
import X.STH;
import X.STK;
import X.STL;
import X.STM;
import X.STN;
import X.SY4;
import X.T16;
import X.UC0;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.AfS60S0100000_8;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS3S1202000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileAigcProgressAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public C252709vu LJLJI;
    public SY4 LJLJJI;
    public C74040T4a LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public Handler LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public final STG LJLLL;
    public InterfaceC72136SSu LJLLLL;
    public ST8 LJLLLLLL;
    public STH LJLZ;
    public C73458SsI LJZ;
    public final C73849Syb<List<AIGCQuota>> LJZI;
    public List<AIGCQuota> LJZL;

    public ProfileAigcProgressAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcProgressVM.class);
        this.LJLIL = new C214298b3(new AqS153S0100000_3(LIZ, 798), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), STM.INSTANCE, LIZ);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C246649m8.class, "PROFILE_AIGC_PROGRESS_PAGE_DATA"), checkSupervisorPrepared());
        this.LJLLILLLL = "creating";
        this.LJLLL = new STG(this);
        this.LJLZ = STH.GONE;
        this.LJZI = new C73849Syb<>();
    }

    public final String E3() {
        C246649m8 c246649m8 = (C246649m8) this.LJLILLLLZI.getValue();
        if (c246649m8 != null) {
            return c246649m8.LJLILLLLZI;
        }
        return null;
    }

    public final ProfileAigcProgressVM H3() {
        return (ProfileAigcProgressVM) this.LJLIL.getValue();
    }

    public final void I3() {
        String str;
        String E3;
        if (this.LJLLJ) {
            str = "fast";
        } else {
            str = "slow";
        }
        STD.LIZIZ(str, "back", null, getEnterFrom(), this.LJLLILLLL);
        int i = STE.LIZIZ[this.LJLZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 || ((E3 = E3()) != null && E3.length() != 0)) {
                x3();
                return;
            }
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                LIZ.finish();
                return;
            }
            return;
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            LIZ2.finish();
        }
    }

    public final void N3() {
        String F3;
        String F32;
        TuxTextView tuxTextView = this.LJLJL;
        if (tuxTextView != null) {
            if (this.LJLLJ) {
                F3 = F3(R.string.bp);
            } else {
                F3 = F3(R.string.bt);
            }
            tuxTextView.setText(F3);
            TuxTextView tuxTextView2 = this.LJLJLJ;
            if (tuxTextView2 != null) {
                if (this.LJLLJ) {
                    F32 = F3(R.string.bm);
                } else {
                    F32 = F3(R.string.br);
                }
                tuxTextView2.setText(F32);
                return;
            }
            o.LJIJI("subtitleText");
            throw null;
        }
        o.LJIJI("titleText");
        throw null;
    }

    public final String getEnterFrom() {
        C246649m8 c246649m8 = (C246649m8) this.LJLILLLLZI.getValue();
        if (c246649m8 != null) {
            return c246649m8.LJLJJI;
        }
        return null;
    }

    public final boolean A3() {
        return C78685UuP.LJJJZ(E3());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C73458SsI c73458SsI = this.LJZ;
        if (c73458SsI != null) {
            c73458SsI.dispose();
        }
        Handler handler = this.LJLLI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJLLI = null;
        AIGCAvatarServiceImpl.LJIILL().LIZLLL(EnumC244439iZ.SOCIAL, this.LJLLL);
    }

    @Override // X.C8W0
    public final void onStart() {
        String str;
        super.onStart();
        this.LJLL = true;
        ST8 st8 = this.LJLLLLLL;
        if (st8 != null) {
            O3(st8);
        }
        if (!A3()) {
            ST8 st82 = this.LJLLLLLL;
            if (st82 != null) {
                str = st82.LJII;
            } else {
                str = null;
            }
            this.LJLLJ = o.LJ(str, "fast");
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        this.LJLL = false;
    }

    public final void x3() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C26227ARb c26227ARb = new C26227ARb(LIZ);
            c26227ARb.LIZIZ(LIZ.getResources().getString(R.string.bu));
            UC0.LIZJ(c26227ARb, new AqS143S0200000_12(LIZ, this, 51));
            c26227ARb.LJI().LIZLLL();
        }
    }

    public final void C3(InterfaceC88472Yns<? super List<AIGCQuota>, C76800UCe> interfaceC88472Yns) {
        List<AIGCQuota> list = this.LJZL;
        if (list != null) {
            interfaceC88472Yns.invoke(list);
            return;
        }
        if (this.LJZ == null) {
            this.LJZ = AbstractC73638SvC.LJIILLIIL(STK.LJLIL).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJ(new STL(this));
        }
        this.LJZI.LJJJJZI(new AfS60S0100000_8(interfaceC88472Yns, 5));
    }

    public final String F3(int i) {
        Resources resources;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (resources = LIZ.getResources()) != null) {
            return resources.getString(i);
        }
        return null;
    }

    public final void M3(int i) {
        C74040T4a c74040T4a = this.LJLJJL;
        if (c74040T4a != null) {
            c74040T4a.setProgress(i);
            C74040T4a c74040T4a2 = this.LJLJJL;
            if (c74040T4a2 != null) {
                String string = c74040T4a2.getContext().getString(R.string.bn, Integer.valueOf(i));
                TuxTextView tuxTextView = this.LJLJJLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(string);
                    return;
                } else {
                    o.LJIJI("progressText");
                    throw null;
                }
            }
            o.LJIJI("progressCircle");
            throw null;
        }
        o.LJIJI("progressCircle");
        throw null;
    }

    public final void O3(ST8 st8) {
        String str;
        List<String> list;
        List<AIGCQuota> list2;
        OPL opl;
        if (!this.LJLL) {
            return;
        }
        int i = STE.LIZ[st8.LIZ.ordinal()];
        if (i != 1) {
            String str2 = null;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ProfileAigcProgressVM.gv0(H3(), ST9.IDLE, 0, st8.LIZIZ, st8.LJ);
                            return;
                        } else {
                            ProfileAigcProgressVM.gv0(H3(), ST9.IDLE, 0, st8.LIZIZ, st8.LJ);
                            return;
                        }
                    }
                    Handler handler = this.LJLLI;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    this.LJLLI = null;
                    ProfileAigcProgressVM.gv0(H3(), ST9.FAILED, 0, st8.LIZIZ, st8.LJ);
                    return;
                }
                ProfileAigcProgressVM H3 = H3();
                ST9 status = ST9.IN_QUEUE;
                int i2 = st8.LIZIZ;
                String str3 = st8.LJ;
                Integer num = st8.LJIIIIZZ;
                H3.getClass();
                o.LJIIIZ(status, "status");
                H3.setState(new AqS3S1202000_12(status, 0, i2, str3, num, 0));
                return;
            }
            Integer num2 = st8.LJFF;
            if (num2 != null) {
                ProfileAigcProgressVM.gv0(H3(), ST9.SUCCESSFUL, num2.intValue(), st8.LIZIZ, st8.LJ);
            }
            Context context = getContext();
            if (context == null) {
                return;
            }
            Handler handler2 = this.LJLLI;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.LJLLI = null;
            if (this.LJLLJ) {
                str = "fast";
            } else {
                str = "slow";
            }
            STD.LIZIZ(str, "finish", Long.valueOf(SystemClock.elapsedRealtime() - this.LJLJLLL), getEnterFrom(), this.LJLLILLLL);
            C72121SSf c72121SSf = new C72121SSf();
            ST6 st6 = st8.LJI;
            if (st6 != null) {
                list = st6.LIZ;
            } else {
                list = null;
            }
            c72121SSf.setAvatarUris(list);
            ST6 st62 = st8.LJI;
            if (st62 != null) {
                list2 = st62.LIZIZ;
            } else {
                list2 = null;
            }
            c72121SSf.setRemainingQuota(list2);
            ST6 st63 = st8.LJI;
            if (st63 != null) {
                str2 = st63.LIZJ;
            }
            c72121SSf.setTaskId(str2);
            String str4 = st8.LJII;
            if (str4 == null || (opl = c72121SSf.getPathMode(str4)) == null) {
                if (this.LJLLJ) {
                    opl = OPL.FAST;
                } else {
                    opl = OPL.SLOW;
                }
            }
            c72121SSf.setPathMode(opl);
            if (A3()) {
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    Intent intent = new Intent();
                    intent.putExtra("key_avatar_result", c72121SSf);
                    LIZ.setResult(201, intent);
                }
            } else {
                ProfileAIGCServiceImpl.LJFF().LIZLLL(context, APM.TOOLS_CREATION_FLOW, APN.AI_AVATAR_CREATING_PAGE, null, c72121SSf);
            }
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 == null) {
                return;
            }
            LIZ2.finish();
            return;
        }
        Integer num3 = st8.LJFF;
        if (num3 == null) {
            return;
        }
        ProfileAigcProgressVM.gv0(H3(), ST9.GENERATING, num3.intValue(), st8.LIZIZ, st8.LJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        if (r0 > 40) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P3(X.STI r15) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.aigc.ProfileAigcProgressAssem.P3(X.STI):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        int i;
        String str;
        String str2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = SystemClock.elapsedRealtime();
        C246649m8 c246649m8 = (C246649m8) this.LJLILLLLZI.getValue();
        if (c246649m8 != null) {
            z = c246649m8.LJLIL;
        } else {
            z = false;
        }
        this.LJLLJ = z;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (onBackPressedDispatcher = LIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new STN(this));
        }
        if (this.LJLLJ && A3()) {
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            this.LJLLI = handler;
            handler.postDelayed(new ARunnableS48S0100000_12(this, 44), Q7K.LIZIZ("aigc_creative_fast_timeout", 20) * 1000);
        }
        View findViewById = view.findViewById(R.id.kej);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Context context = findViewById.getContext();
        o.LJIIIIZZ(context, "context");
        layoutParams.height = C63081OpJ.LJJJJLI(context);
        View findViewById2 = view.findViewById(R.id.gwg);
        C252709vu c252709vu = (C252709vu) findViewById2;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 837));
        c252709vu.LIZJ(LIZJ);
        c252709vu.LJIILJJIL(false);
        if (this.LJLLJ) {
            c252709vu.setVisibility(4);
        } else {
            c252709vu.setVisibility(0);
        }
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxNav…E\n            }\n        }");
        this.LJLJI = (C252709vu) findViewById2;
        View findViewById3 = view.findViewById(R.id.ib5);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.progress_title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById3;
        this.LJLJL = tuxTextView;
        tuxTextView.LJJJ(32.0f);
        View findViewById4 = view.findViewById(R.id.ib1);
        o.LJIIIIZZ(findViewById4, "view.findViewById<TuxTex…>(R.id.progress_subtitle)");
        this.LJLJLJ = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.iam);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.progress_circular)");
        this.LJLJJL = (C74040T4a) findViewById5;
        Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.eb);
        if (LIZIZ != null) {
            int intValue = LIZIZ.intValue();
            C74040T4a c74040T4a = this.LJLJJL;
            if (c74040T4a != null) {
                c74040T4a.setColor(intValue);
            } else {
                o.LJIJI("progressCircle");
                throw null;
            }
        }
        View findViewById6 = view.findViewById(R.id.ib2);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.progress_text)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById6;
        this.LJLJJLL = tuxTextView2;
        tuxTextView2.LJJJ(32.0f);
        View findViewById7 = view.findViewById(R.id.zr);
        SY4 sy4 = (SY4) findViewById7;
        if (this.LJLLJ) {
            i = 8;
        } else {
            i = 0;
        }
        sy4.setVisibility(i);
        C16880lQ.LJJIZ(sy4, new ACListenerS32S0100000_12(this, 72));
        o.LJIIIIZZ(findViewById7, "view.findViewById<TuxBut…)\n            }\n        }");
        this.LJLJJI = (SY4) findViewById7;
        if (E3() == null) {
            AIGCAvatarServiceImpl.LJIILL().LIZJ(EnumC244439iZ.SOCIAL, this.LJLLL);
        } else {
            C244419iX.LIZIZ().storeBoolean(C9TY.LIZ("has_shown_notification_permission"), false);
            C2VQ.LIZ(new AqS162S0100000_12(this, 11));
        }
        N3();
        C8YN.LJIILLIIL(this, H3(), null, new AqS194S0100000_12(this, 136), 3);
        if (this.LJLLJ) {
            str = "fast";
        } else {
            str = "slow";
        }
        String enterFrom = getEnterFrom();
        C246649m8 c246649m82 = (C246649m8) this.LJLILLLLZI.getValue();
        if (c246649m82 == null || (str2 = c246649m82.LJLJJL) == null) {
            str2 = this.LJLLILLLL;
        }
        STD.LIZIZ(str, "show", null, enterFrom, str2);
    }

    public final boolean v3(List<AIGCQuota> list) {
        AIGCQuota aIGCQuota;
        Integer quotaRemain;
        String str;
        Iterator<AIGCQuota> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                aIGCQuota = it.next();
                boolean z = this.LJLLJ;
                String quotaType = aIGCQuota.getQuotaType();
                if (z) {
                    str = "fast";
                } else {
                    str = "slow";
                }
                if (o.LJ(quotaType, str)) {
                    break;
                }
            } else {
                aIGCQuota = null;
                break;
            }
        }
        AIGCQuota aIGCQuota2 = aIGCQuota;
        if (aIGCQuota2 == null || (quotaRemain = aIGCQuota2.getQuotaRemain()) == null || quotaRemain.intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final void K3(String str, boolean z) {
        int i;
        int i2;
        SY4 sy4 = this.LJLJJI;
        if (sy4 != null) {
            sy4.setText(str);
            SY4 sy42 = this.LJLJJI;
            if (sy42 != null) {
                sy42.setEnabled(z);
                SY4 sy43 = this.LJLJJI;
                if (sy43 != null) {
                    sy43.setSupportClickWhenDisable(true);
                    SY4 sy44 = this.LJLJJI;
                    if (sy44 != null) {
                        C110614Vt c110614Vt = new C110614Vt();
                        if (z) {
                            i = R.attr.eb;
                        } else {
                            i = R.attr.cg;
                        }
                        c110614Vt.LIZIZ = Integer.valueOf(i);
                        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                        SY4 sy45 = this.LJLJJI;
                        if (sy45 != null) {
                            Context context = sy45.getContext();
                            o.LJIIIIZZ(context, "bottomBtn.context");
                            sy44.setBackground(c110614Vt.LIZ(context));
                            SY4 sy46 = this.LJLJJI;
                            if (sy46 != null) {
                                if (z) {
                                    i2 = R.attr.dj;
                                } else {
                                    i2 = R.attr.gp;
                                }
                                sy46.setTextColorRes(i2);
                                return;
                            }
                            o.LJIJI("bottomBtn");
                            throw null;
                        }
                        o.LJIJI("bottomBtn");
                        throw null;
                    }
                    o.LJIJI("bottomBtn");
                    throw null;
                }
                o.LJIJI("bottomBtn");
                throw null;
            }
            o.LJIJI("bottomBtn");
            throw null;
        }
        o.LJIJI("bottomBtn");
        throw null;
    }

    public final void L3(String str, boolean z) {
        int i;
        SY4 sy4 = this.LJLJJI;
        if (sy4 != null) {
            sy4.setText(str);
            SY4 sy42 = this.LJLJJI;
            if (sy42 != null) {
                sy42.setEnabled(z);
                SY4 sy43 = this.LJLJJI;
                if (sy43 != null) {
                    sy43.setSupportClickWhenDisable(true);
                    SY4 sy44 = this.LJLJJI;
                    if (sy44 != null) {
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
                        SY4 sy45 = this.LJLJJI;
                        if (sy45 != null) {
                            Context context = sy45.getContext();
                            o.LJIIIIZZ(context, "bottomBtn.context");
                            sy44.setBackground(c110614Vt.LIZ(context));
                            SY4 sy46 = this.LJLJJI;
                            if (sy46 != null) {
                                if (z) {
                                    i = R.attr.go;
                                } else {
                                    i = R.attr.gp;
                                }
                                sy46.setTextColorRes(i);
                                return;
                            }
                            o.LJIJI("bottomBtn");
                            throw null;
                        }
                        o.LJIJI("bottomBtn");
                        throw null;
                    }
                    o.LJIJI("bottomBtn");
                    throw null;
                }
                o.LJIJI("bottomBtn");
                throw null;
            }
            o.LJIJI("bottomBtn");
            throw null;
        }
        o.LJIJI("bottomBtn");
        throw null;
    }
}
