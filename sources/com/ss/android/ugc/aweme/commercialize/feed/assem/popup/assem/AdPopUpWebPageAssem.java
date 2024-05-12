package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem;

import X.C16880lQ;
import X.C188727au;
import X.C214348b8;
import X.C240999d1;
import X.C58909NAb;
import X.C59516NXk;
import X.C59522NXq;
import X.C59523NXr;
import X.C59526NXu;
import X.C59527NXv;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.NH3;
import X.NWF;
import X.NXJ;
import X.NXX;
import X.NY1;
import X.NY7;
import X.NYK;
import X.TBT;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdPopUpWebPageAssem extends AbsAdPopUpWebPageAssem<AdPopUpWebPageAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFFF;
    public final C59516NXk LLFII;
    public final C59526NXu LLFZ;
    public final NY1 LLI;

    static {
        TBT tbt = new TBT(AdPopUpWebPageAssem.class, "popUpVM", "getPopUpVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/popup/viewmodel/AdPopUpWebPageVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NYA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59532NYa) obj).LJLJI;
            }
        }, null, C59527NXv.LJLIL, 6);
        C8YN.LJII(this, a4(), new TBT() { // from class: X.NY6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59532NYa) obj).LJLIL;
            }
        }, null, C59522NXq.LJLIL, 6);
    }

    public AdPopUpWebPageAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AdPopUpWebPageVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 82), null, NY7.INSTANCE, null, null);
        this.LLFII = new C59516NXk(this);
        this.LLFZ = new C59526NXu(this);
        this.LLI = new NY1(this);
    }

    public final AdPopUpWebPageVM a4() {
        return (AdPopUpWebPageVM) this.LLFFF.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
        super.E3();
        NWF nwf = this.LLFF;
        if (nwf != null) {
            nwf.LJIJ();
            C16880lQ.LJLLL(nwf, (ViewGroup) getContainerView());
        }
        this.LLFF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void X3() {
        AdPopUpWebPageVM a4 = a4();
        long currentTimeMillis = System.currentTimeMillis() - a4().LJLL;
        a4.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("h5_stay_time", c188727au.LIZ);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Y3() {
        AdPopUpWebPageVM a4 = a4();
        a4.getClass();
        a4.LJLL = System.currentTimeMillis();
        NWF nwf = this.LLFF;
        if (nwf != null && nwf.LJIIJJI()) {
            ((VideoPlayViewModel) this.LJZL.getValue()).LJJJJL();
        }
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    public final FrameLayout Z3(Activity activity) {
        FrameLayout frameLayout;
        Integer num;
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.ro);
        if (viewStub == null || viewStub.getParent() == null) {
            frameLayout = (FrameLayout) activity.findViewById(R.id.rn);
        } else {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZ() != null) {
                num = Integer.valueOf(R.layout.azj);
            } else {
                num = null;
            }
            o.LJI(num);
            viewStub.setLayoutResource(num.intValue());
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            frameLayout = (FrameLayout) inflate;
        }
        if (frameLayout == null) {
            ViewStub viewStub2 = (ViewStub) activity.findViewById(R.id.qo);
            if (viewStub2 == null || viewStub2.getParent() == null) {
                return (FrameLayout) activity.findViewById(R.id.qn);
            }
            viewStub2.setLayoutResource(R.layout.fv);
            View inflate2 = viewStub2.inflate();
            o.LJII(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            return (FrameLayout) inflate2;
        }
        return frameLayout;
    }

    @Override // X.C8XO
    public final boolean c2(VideoItemParams videoItemParams) {
        String extra;
        AwemeRawAd awemeRawAd;
        boolean z;
        boolean z2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        AdPopUpWebPageVM a4 = a4();
        Aweme aweme = item.getAweme();
        a4.getClass();
        if (aweme != null) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it.next();
                    if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                        Boolean bool = (Boolean) GsonProtectorUtils.fromJson(new Gson(), GsonProtectorUtils.parse(new com.google.gson.o(), next.getExtra()).LJIIZILJ().LJJIJ("is_schema_lynx"), new NYK().getType());
                        if (bool != null && bool.booleanValue()) {
                            return true;
                        }
                    }
                }
            }
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                if (awemeRawAd.getWebviewType() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (awemeRawAd.getProfileWithWebview() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8YN.LJII(this, (AssemViewModel) this.LLD.getValue(), new TBT() { // from class: X.NYF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLILLLLZI;
            }
        }, null, NXX.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLF.getValue(), new TBT() { // from class: X.NXW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2309894s) obj).LJLIL;
            }
        }, null, NXJ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.NYB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C59542NYk) obj).LJLJLLL;
            }
        }, null, C59523NXr.LJLIL, 6);
    }
}
