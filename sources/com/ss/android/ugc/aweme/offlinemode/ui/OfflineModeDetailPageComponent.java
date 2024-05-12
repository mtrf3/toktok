package com.ss.android.ugc.aweme.offlinemode.ui;

import X.AbstractC252339vJ;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221138m5;
import X.C252259vB;
import X.C252269vC;
import X.C252309vG;
import X.C252319vH;
import X.C252329vI;
import X.C252359vL;
import X.C26218AQs;
import X.C26222AQw;
import X.C47261Igj;
import X.C47497IkX;
import X.C57939MoZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C78926UyI;
import X.C86918Y9i;
import X.C8W0;
import X.C8YN;
import X.C9BD;
import X.EnumC236939Rp;
import X.EnumC48190Ivi;
import X.FBC;
import X.InterfaceC236979Rt;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.KR8;
import X.SYL;
import X.TBR;
import X.TBT;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class OfflineModeDetailPageComponent extends DetailPageComponent {
    public static final C26222AQw LLILLL = new C26222AQw("OfflineModeDetailPageComponent");
    public final C214378bB LLIILII;
    public final C214298b3 LLIILZL;
    public final C252269vC LLIIZ;
    public TuxTextView LLIL;
    public View LLILII;
    public View LLILIL;
    public final C221138m5 LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;

    public OfflineModeDetailPageComponent() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C252259vB c252259vB = C252259vB.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeListVM.class);
        C252319vH c252319vH = C252319vH.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 496);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LLIILII = new C214378bB(LIZ, c252259vB, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c252319vH, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LLIILZL = C78926UyI.LJ(this, LIZ2, c9bd, new AqS154S0100000_4(LIZ2, 495), C252309vG.INSTANCE, null);
        this.LLIIZ = new C252269vC();
        this.LLILL = KR8.LJIIJJI(new AqS154S0100000_4(this, 494));
    }

    public final OfflineModeManagerVM P3() {
        return (OfflineModeManagerVM) this.LLIILZL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.9Rr, X.FBC] */
    @Override // X.C8W0
    public final void onAssemPostCreate() {
        EnumC236939Rp enumC236939Rp;
        String str;
        String str2;
        Intent intent;
        Intent intent2;
        super.onAssemPostCreate();
        if (((Boolean) this.LLILL.getValue()).booleanValue()) {
            final OfflineModeManagerVM P3 = P3();
            P3.getClass();
            ?? r1 = new FBC() { // from class: X.9Rr
                @Override // X.FBC
                public final void onEffectiveConnectionTypeChanged(int i) {
                    if (i > 3) {
                        OfflineModeManagerVM offlineModeManagerVM = OfflineModeManagerVM.this;
                        offlineModeManagerVM.getClass();
                        if (System.currentTimeMillis() - offlineModeManagerVM.LJLJI <= 600000) {
                            return;
                        }
                        OfflineModeManagerVM.this.LJLJI = System.currentTimeMillis();
                        OfflineModeManagerVM offlineModeManagerVM2 = OfflineModeManagerVM.this;
                        EnumC236919Rn value = EnumC236919Rn.RETURN_FYP;
                        offlineModeManagerVM2.getClass();
                        o.LJIIIZ(value, "value");
                        offlineModeManagerVM2.mv0(value);
                    }
                }
            };
            P3.LJLILLLLZI = r1;
            C252329vI.LIZIZ.LIZ.addEffectiveConnectionTypeChangedListener(r1);
        }
        if (P3().getState().LJLIL <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || ((InterfaceC236979Rt) ((OfflineModeListVM) this.LLIILII.getValue()).LJLIL.getValue().getOperator()).LLIFFJFJJ()) {
            OfflineModeManagerVM P32 = P3();
            if (P3().gv0().getOperator().LJIIIZ()) {
                P3().gv0().getOperator().LJJIJ();
                enumC236939Rp = EnumC236939Rp.FIRST_ENTER;
            } else {
                enumC236939Rp = EnumC236939Rp.NO_OFFLINE_VIDEO;
            }
            P32.hv0(enumC236939Rp);
        }
        final C252269vC c252269vC = this.LLIIZ;
        c252269vC.LIZ = 0;
        c252269vC.LIZIZ = 0;
        c252269vC.LIZJ = 0L;
        c252269vC.LIZLLL = 0L;
        c252269vC.LJ = 0;
        c252269vC.LJFF = 0;
        c252269vC.LJI = 0;
        c252269vC.LJII = System.currentTimeMillis();
        if (!c252269vC.LJIIIZ) {
            c252269vC.LJIIIZ = true;
            C86918Y9i.LJFF.add(new AbstractC252339vJ() { // from class: X.9vD
                @Override // X.AbstractC252339vJ
                public final boolean LIZ(YG0 yg0, String eventType) {
                    o.LJIIIZ(yg0, "enum");
                    o.LJIIIZ(eventType, "eventType");
                    return TextUtils.equals(eventType, "offline_mode_page");
                }

                @Override // X.AbstractC252339vJ
                public final void LIZIZ(YG0 yg0, String awemeId, Object param) {
                    java.util.Map map;
                    JSONObject jSONObject;
                    String str3;
                    o.LJIIIZ(yg0, "enum");
                    o.LJIIIZ(awemeId, "awemeId");
                    o.LJIIIZ(param, "param");
                    C252269vC c252269vC2 = C252269vC.this;
                    c252269vC2.getClass();
                    Object obj = null;
                    if (param instanceof JSONObject) {
                        jSONObject = (JSONObject) param;
                        map = null;
                    } else {
                        if (!C65777Prh.LJII(param)) {
                            return;
                        }
                        map = (java.util.Map) param;
                        jSONObject = null;
                    }
                    c252269vC2.LJIIIIZZ.LIZ(yg0, "record");
                    switch (YG2.LIZ[yg0.ordinal()]) {
                        case 1:
                            c252269vC2.LJ++;
                            return;
                        case 2:
                            c252269vC2.LJFF++;
                            return;
                        case 3:
                            c252269vC2.LJI++;
                            return;
                        case 4:
                            c252269vC2.LIZ++;
                            return;
                        case 5:
                            c252269vC2.LIZIZ++;
                            return;
                        case 6:
                            long j = 0;
                            try {
                                if (jSONObject != null) {
                                    j = jSONObject.optLong("duration", 0L);
                                } else {
                                    if (map != null) {
                                        obj = map.get("duration");
                                    }
                                    if ((obj instanceof String) && (str3 = (String) obj) != null) {
                                        j = CastLongProtector.parseLong(str3);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            c252269vC2.LIZLLL += j;
                            return;
                        default:
                            return;
                    }
                }
            });
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Application application = null;
        if (LIZ != null && (intent2 = LIZ.getIntent()) != null) {
            str = C16880lQ.LLJJIJIIJIL(intent2, "event_type");
        } else {
            str = null;
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (intent = LIZ2.getIntent()) != null) {
            str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
        } else {
            str2 = null;
        }
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 != null) {
            application = LIZ3.getApplication();
        }
        EnumC48190Ivi LLJJI = C16880lQ.LLJJI(application);
        o.LJIIIIZZ(LLJJI, "getNetworkTypeFast(it)");
        C26218AQs.LIZ("enter_offline_mode_page", str, str2, C252359vL.LIZ(LLJJI), Integer.valueOf(C47497IkX.LIZJ()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388576);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        if (this.LLILLIZIL) {
            str = "back_to_fyp";
        } else if (((Boolean) this.LLILL.getValue()).booleanValue()) {
            str = "click_return_fyp";
        } else {
            str = "back_to_setting";
        }
        Application application = null;
        LLILLL.LIZIZ("exitOfflineMode", null, str);
        C252269vC c252269vC = this.LLIIZ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        c252269vC.getClass();
        c252269vC.LIZJ = System.currentTimeMillis() - c252269vC.LJII;
        if (LIZ != null) {
            application = LIZ.getApplication();
        }
        EnumC48190Ivi LLJJI = C16880lQ.LLJJI(application);
        o.LJIIIIZZ(LLJJI, "getNetworkTypeFast(it)");
        String LIZ2 = C252359vL.LIZ(LLJJI);
        int LIZJ = C47497IkX.LIZJ();
        String valueOf = String.valueOf(c252269vC.LIZ);
        String valueOf2 = String.valueOf(c252269vC.LIZIZ);
        String valueOf3 = String.valueOf(c252269vC.LIZJ);
        long j = c252269vC.LIZLLL;
        String valueOf4 = String.valueOf(c252269vC.LJ);
        String valueOf5 = String.valueOf(c252269vC.LJI);
        C26218AQs.LIZ("exit_offline_mode", "offline_mode_page", null, LIZ2, Integer.valueOf(LIZJ), null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, str, valueOf, valueOf2, valueOf3, valueOf4, String.valueOf(c252269vC.LJFF), valueOf5, 57316);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        P3().gv0().getOperator().LJJZZI();
    }

    public final void Q3(int i) {
        float f;
        int i2 = 0;
        for (View view : C47261Igj.LJJIJIIJI(this.LLILII, this.LLILIL)) {
            if (view != null) {
                if (i > 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                view.setAlpha(f);
            }
        }
        TuxTextView tuxTextView = this.LLIL;
        if (tuxTextView == null) {
            return;
        }
        if (i <= 0) {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = null;
        String str = null;
        SYL syl = new SYL(view.getContext(), null);
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 5;
        syl.setListConfig(c57939MoZ);
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LLIILII.getValue();
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        o.LJIIIIZZ(state, "fakeList.state");
        assemListViewModel.setListState(state);
        final OfflineModeListVM offlineModeListVM = (OfflineModeListVM) this.LLIILII.getValue();
        syl.LJLJLLL((AbstractC72278SYg) new TBR(offlineModeListVM) { // from class: X.9vF
            @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        View findViewById = view.findViewById(R.id.j7n);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.bul);
        }
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.l_2);
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(33);
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                str = LIZ.getString(R.string.j95);
            }
            tuxTextView2.setText(str);
            tuxTextView = tuxTextView2;
        }
        this.LLIL = tuxTextView;
        this.LLILII = view.findViewById(R.id.arj);
        this.LLILIL = view.findViewById(R.id.lgd);
        Q3(P3().getState().LJLILLLLZI);
        C8YN.LJII(this, P3(), new TBT() { // from class: X.9v3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 130), 6);
        C8YN.LJII(this, P3(), new TBT() { // from class: X.9v4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9S3) obj).LJLLJ;
            }
        }, null, new AqS186S0100000_4(this, 131), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLIILII.getValue(), new TBT() { // from class: X.9v2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240039bT) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 132), 6);
    }
}
