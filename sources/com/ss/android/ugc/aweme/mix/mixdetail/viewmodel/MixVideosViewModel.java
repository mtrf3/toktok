package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.A2G;
import X.C00F;
import X.C16880lQ;
import X.C221108m2;
import X.C228118xL;
import X.C228578y5;
import X.C228598y7;
import X.C229098yv;
import X.C229108yw;
import X.C229308zG;
import X.C229318zH;
import X.C229398zP;
import X.C229438zT;
import X.C229528zc;
import X.C38354F3m;
import X.C52941Kq9;
import X.C56549MHh;
import X.C62822Ol8;
import X.C72242sW;
import X.C73969T1h;
import X.C76732zl;
import X.C78613UtF;
import X.EnumC228828yU;
import X.InterfaceC56535MGt;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.M7C;
import X.T16;
import X.XKX;
import Y.ARunnableS14S0300000_3;
import Y.AfS2S0100100_3;
import Y.AfS55S0100000_3;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixVideosViewModel extends AssemViewModel<M7C> {
    public Aweme LJLJJLL;
    public Aweme LJLJL;
    public boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public MixStruct LJLZ;
    public MixVideosResponse LJZ;
    public boolean LJZI;
    public boolean LL;
    public boolean LLD;
    public int LLF;
    public String LLFF;
    public final C229528zc LJLIL = new C229528zc();
    public final String LJLILLLLZI = "PLAYLIST_VIDEO_LIST";
    public final String LJLJI = "PLAYLIST_DETAIL";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public boolean LJLJLJ = true;
    public String LJLLJ = "";
    public String LJLLL = "";
    public String LJLLLL = "";
    public long LJLLLLLL = -1;
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 524));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 523));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final M7C defaultState() {
        return new M7C(0);
    }

    public final void hv0() {
        setStateImmediate(C229318zH.LJLIL);
        this.LJLLL = "";
        this.LJLLJ = "";
        this.LJLJJLL = null;
        this.LJLL = false;
        this.LJLJLLL = false;
        this.LJLLILLLL = 0L;
        this.LJLLI = 0L;
        this.LJLJJL = "";
        this.LJLJJI = "";
        this.LJZI = false;
        onCleared();
    }

    public final String kv0() {
        String str;
        Aweme aweme = this.LJLJJLL;
        if (aweme != null) {
            str = aweme.getSecAuthorUid();
            if (str == null) {
                return "";
            }
        } else {
            str = this.LJLLL;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public final String mv0() {
        String str;
        Aweme aweme = this.LJLJJLL;
        if (aweme != null) {
            str = aweme.getAuthorUid();
            if (str == null) {
                return "";
            }
        } else {
            str = this.LJLLJ;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public final String nv0() {
        return (String) this.LJZL.getValue();
    }

    public final void rv0() {
        MixFeedApi.LIZ.getClass();
        disposeOnClear(C229108yw.LIZ().manageMixFeed(EnumC228828yU.MIXDELETE.getOperation(), this.LJLJJI, null, null, null, "").LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS55S0100000_3(this, 31), new AfS55S0100000_3(this, 32)));
    }

    public final void sv0() {
        MixStruct mixStruct = this.LJLZ;
        if (mixStruct != null && o.LJ(mixStruct.mixId, this.LJLJJI)) {
            withState(new AqS107S0300000_3(this.LJLZ, this, (Long) null, 44));
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MixFeedApi.LIZ.getClass();
        disposeOnClear(C229108yw.LIZ().getMixDetail(this.LJLJJI, mv0(), kv0(), this.LL).LJIIJ(new InterfaceC64592gB() { // from class: X.8zN
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS2S0100100_3(elapsedRealtime, this, 0), new InterfaceC64592gB() { // from class: X.8zO
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
    }

    public final List<Aweme> getAwemeList() {
        return getVmDispatcher().getState().LJLIL;
    }

    public final int lv0(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        List<Aweme> list = getVmDispatcher().getState().LJLIL;
        if (list == null) {
            return -1;
        }
        Iterator<Aweme> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(it.next().getAid(), aweme.getAid())) {
                if (i < 0) {
                    return -1;
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void tv0(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        setState(new AqS169S0100000_3(aweme, 267));
    }

    public static List gv0(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final void jv0(String str, String str2) {
        boolean z;
        int i;
        String str3;
        int i2;
        if (str == null || str2 == null) {
            return;
        }
        final C76732zl c76732zl = new C76732zl();
        c76732zl.element = 1;
        C72242sW c72242sW = new C72242sW();
        int LIZ = C228598y7.LIZ();
        if (!C38354F3m.LJ(this.LJLJJL)) {
            c76732zl.element = 4;
        }
        if (nv0().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((C228118xL.LIZIZ() || C00F.LIZ(31744, 0, "playlist_inner_ui_opt", true) == 1 || z) && this.LLD && this.LLF > 1) {
            c76732zl.element = 2;
        }
        if (this.LLD && (i2 = this.LLF) > 1) {
            c72242sW.element = i2 - 1;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        sv0();
        MixVideosResponse mixVideosResponse = this.LJZ;
        if (mixVideosResponse != null && c76732zl.element == 4) {
            MixStruct mixStruct = this.LJLZ;
            if (mixStruct != null) {
                str3 = mixStruct.mixId;
            } else {
                str3 = null;
            }
            if (o.LJ(str3, this.LJLJJI)) {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS14S0300000_3(this, mixVideosResponse, c76732zl, 2));
                this.LJLZ = null;
                this.LJZ = null;
            }
        }
        if (C229398zP.LIZ) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C229438zT(this, c76732zl, c72242sW, LIZ, elapsedRealtime, null), 2);
        } else {
            MixFeedApi.LIZ.getClass();
            MixFeedApi LIZ2 = C229108yw.LIZ();
            String str4 = this.LJLJJI;
            String str5 = this.LJLJJL;
            long j = c72242sW.element;
            int i3 = c76732zl.element;
            boolean z2 = this.LL;
            Integer valueOf = Integer.valueOf(LIZ);
            if (this.LLD) {
                i = 2;
            } else {
                i = 1;
            }
            disposeOnClear(LIZ2.getMixVideos2(str4, str5, j, i3, str, str2, z2, valueOf, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.8zF
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    MixVideosResponse response = (MixVideosResponse) obj;
                    MixVideosViewModel mixVideosViewModel = MixVideosViewModel.this;
                    o.LJIIIIZZ(response, "response");
                    mixVideosViewModel.qv0(response, c76732zl.element, Long.valueOf(elapsedRealtime));
                }
            }, new InterfaceC64592gB() { // from class: X.8zM
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
        this.LJLZ = null;
        this.LJZ = null;
    }

    public final void ov0(Aweme aweme, String mixID) {
        o.LJIIIZ(mixID, "mixID");
        this.LJLJJI = mixID;
        if (aweme != null) {
            this.LJLJJLL = aweme;
            String aid = aweme.getAid();
            aid.toString();
            this.LJLJJL = aid;
        } else if (C228118xL.LIZJ() || C228118xL.LIZ()) {
            this.LJLJJL = nv0();
        }
        this.LJZI = true;
        ((PowerPageSource) this.LLFFF.getValue()).getOperator().refresh();
    }

    public final void iv0(Long l, String str, String str2) {
        if (l != null) {
            l.longValue();
            if (str == null || str2 == null) {
                return;
            }
            int LIZ = C228578y5.LIZ();
            MixFeedApi.LIZ.getClass();
            disposeOnClear(C229098yv.LIZ(C229108yw.LIZ(), this.LJLJJI, "", this.LJLLILLLL, 3, mv0(), kv0(), this.LL, Integer.valueOf(LIZ), 256).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 30), new InterfaceC64592gB() { // from class: X.8zL
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
    }

    public final void qv0(MixVideosResponse mixVideosResponse, int i, Long l) {
        withState(new AqS54S0201000_3(i, mixVideosResponse, this, 4));
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        if (list == null || list.isEmpty()) {
            setState(C229308zG.LJLIL);
        }
        if (this.LJLLLLLL > 0 && l != null) {
            C56549MHh.LIZ(this.LJLLLL, this.LJLILLLLZI, this.LJLLLLLL, l.longValue(), SystemClock.elapsedRealtime(), C52941Kq9.LIZ(), new InterfaceC56535MGt() { // from class: X.8zJ
                @Override // X.InterfaceC56535MGt
                public final void onEvent(java.util.Map map) {
                    FMX.LJIIL("power_preload_duration_key", map);
                }
            });
        }
    }

    public final void pv0(MixVideosResponse mixVideosResponse, int i, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd, Long l) {
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = i;
        withState(new AqS49S0400000_3(mixVideosResponse, (MixVideosResponse) c76732zl, (C76732zl) this, (MixVideosViewModel) interfaceC67352kd, (InterfaceC67352kd<? super A2G<Long>>) 9));
        if (this.LJLLLLLL > 0 && l != null) {
            C56549MHh.LIZ(this.LJLLLL, this.LJLILLLLZI, this.LJLLLLLL, l.longValue(), SystemClock.elapsedRealtime(), C52941Kq9.LIZ(), new InterfaceC56535MGt() { // from class: X.8zI
                @Override // X.InterfaceC56535MGt
                public final void onEvent(java.util.Map map) {
                    FMX.LJIIL("power_preload_duration_key", map);
                }
            });
        }
    }
}
