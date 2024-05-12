package com.ss.android.ugc.aweme.feed.adapter.widget.player;

import X.C221108m2;
import X.C28272B7s;
import X.C28642BLy;
import X.C32186CkA;
import X.C32537Cpp;
import X.C38354F3m;
import X.C62822Ol8;
import X.C75572TlI;
import X.C75806Tp4;
import X.C76800UCe;
import X.C77554UcA;
import X.C79004UzY;
import X.C86341Xub;
import X.C86343Xud;
import X.C86346Xug;
import X.C86350Xuk;
import X.C86361Xuv;
import X.EnumC72797Shd;
import X.EnumC79342VBy;
import X.EnumC83095WjL;
import X.InterfaceC86353Xun;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class LivePreviewPlayerVM extends LiveWidgetViewModel {
    public boolean LJLJLJ;
    public boolean LJLLI;
    public boolean LJLLJ;
    public final InterfaceC86353Xun LJLLLL;
    public final MutableLiveData<EnumC79342VBy> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<C86361Xuv> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<C86350Xuk> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<String> LJLJJLL = new MutableLiveData<>();
    public final C28642BLy LJLJL = new C28642BLy();
    public int LJLJLLL = -1;
    public int LJLL = -1;
    public EnumC83095WjL LJLLILLLL = EnumC83095WjL.IDLE;
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 355));

    public final void destroy() {
        this.LJLJLJ = false;
        this.LJLLLL.destroy();
        this.LJLJLJ = false;
    }

    public final C86343Xud hv0() {
        return (C86343Xud) this.LJLLL.getValue();
    }

    public final void iv0() {
        this.LJLLLL.d();
        this.LJLJLJ = false;
    }

    public final void mv0() {
        this.LJLLLL.LLZZLLIL();
        this.LJLJLJ = false;
        this.LJLJL.LIZIZ();
    }

    public LivePreviewPlayerVM() {
        C32186CkA LJJJJZI = LiveOuterService.LJJJLL().LJJJJZI(new C86341Xub(this), EnumC72797Shd.NORMAL);
        o.LJIIIIZZ(LJJJJZI, "get().getService(ILiveOu…ype.NORMAL,\n            )");
        this.LJLLLL = LJJJJZI;
    }

    public final void kv0() {
        long j;
        LiveRoomStruct liveRoomStruct;
        C86343Xud hv0 = hv0();
        if (hv0 != null && (liveRoomStruct = hv0.LIZIZ) != null) {
            j = liveRoomStruct.allowPreviewTime;
        } else {
            j = -1;
        }
        if (j < 0) {
            this.LJLLI = false;
        } else if (j == 0) {
            this.LJLLI = true;
        } else {
            this.LJLLI = true;
        }
        this.LJLLJ = false;
        this.LJLLILLLL = EnumC83095WjL.IDLE;
    }

    public final void gv0(boolean z) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud hv0 = hv0();
        if (hv0 != null && (liveRoomStruct = hv0.LIZIZ) != null) {
            LiveOuterService.LJJJLL().LJJIJIL().LJIIJJI(String.valueOf(liveRoomStruct.id), liveRoomStruct.owner.getSecUid(), new C86346Xug(z, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lv0(C28272B7s seiData) {
        String optString;
        String str;
        LiveRoomStruct liveRoomStruct;
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        List<SeiRegion> list;
        Map<String, Map<String, String>> map3;
        Map<String, String> map4;
        o.LJIIIZ(seiData, "seiData");
        MutableLiveData<String> mutableLiveData = this.LJLJJLL;
        String str2 = seiData.LIZIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        mutableLiveData.setValue(str2);
        SeiAppData LJIIJ = C75806Tp4.LJIIJ(seiData);
        String str4 = null;
        int i = 0;
        if (!this.LJLLI) {
            LiveSeiStruct liveSeiStruct = seiData.LIZ;
            if (liveSeiStruct != null) {
                optString = liveSeiStruct.subOnlyLive;
                if (optString == null) {
                    optString = "";
                }
            } else {
                String str5 = seiData.LIZIZ;
                if (str5 == null) {
                    str5 = "";
                }
                optString = new JSONObject(str5).optString("sub_only_live");
            }
            if (LJIIJ != null && (map = LJIIJ.businessExtraInfo) != null && (map2 = map.get("sub_only_live")) != null) {
                str = map2.get("sub_only_live");
            } else {
                str = null;
            }
            boolean LIZJ = C38354F3m.LIZJ(String.valueOf(str), "1");
            if (C38354F3m.LIZJ(optString, "1") || LIZJ) {
                C86343Xud hv0 = hv0();
                if (hv0 != null && (liveRoomStruct = hv0.LIZIZ) != null) {
                    liveRoomStruct.liveSubOnly = 1L;
                }
                this.LJLLI = true;
                gv0(false);
            }
        }
        if (this.LJLLILLLL == EnumC83095WjL.SHOW && !this.LJLLJ) {
            LiveSeiStruct liveSeiStruct2 = seiData.LIZ;
            if (liveSeiStruct2 != null) {
                String str6 = liveSeiStruct2.closePreview;
                if (str6 != null) {
                    str3 = str6;
                }
            } else {
                String str7 = seiData.LIZIZ;
                if (str7 != null) {
                    str3 = str7;
                }
                str3 = new JSONObject(str3).optString("close_preview");
            }
            if (LJIIJ != null && (map3 = LJIIJ.businessExtraInfo) != null && (map4 = map3.get("close_preview")) != null) {
                str4 = map4.get("close_preview");
            }
            boolean LIZJ2 = C38354F3m.LIZJ(String.valueOf(str4), "1");
            if (C38354F3m.LIZJ(str3, "1") || LIZJ2) {
                this.LJLLJ = true;
                this.LJLJJI.setValue(new C86350Xuk(false, false));
            }
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75572TlI.class)).LIZ = seiData;
        }
        if (LJIIJ != null && !C79004UzY.LJJIFFI(LJIIJ.grids) && (list = LJIIJ.grids) != null) {
            Iterator<SeiRegion> it = list.iterator();
            while (it.hasNext()) {
                if (!C38354F3m.LJ(it.next().uidStr) && (i = i + 1) >= 2) {
                    C86343Xud hv02 = hv0();
                    if (hv02 == null) {
                        return;
                    }
                    hv02.LJIIL = true;
                    return;
                }
            }
        }
    }

    public final void setMute(boolean z) {
        this.LJLLLL.setMute(z);
    }

    public final void jv0(long j, String str) {
        C77554UcA c77554UcA;
        C86343Xud hv0 = hv0();
        if (hv0 != null && (c77554UcA = hv0.LJII) != null && c77554UcA.LIZ) {
            return;
        }
        this.LJLJL.LIZLLL(str, String.valueOf(j));
    }
}
