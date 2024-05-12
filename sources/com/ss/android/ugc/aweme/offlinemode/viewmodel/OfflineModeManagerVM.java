package com.ss.android.ugc.aweme.offlinemode.viewmodel;

import X.AQP;
import X.C214188as;
import X.C236959Rr;
import X.C237009Rw;
import X.C252329vI;
import X.C26218AQs;
import X.C26222AQw;
import X.C78404Ups;
import X.C78613UtF;
import X.C9Q1;
import X.C9Q6;
import X.C9QD;
import X.C9S1;
import X.C9S3;
import X.C9SD;
import X.C9SN;
import X.C9SO;
import X.C9SV;
import X.EnumC236919Rn;
import X.EnumC236939Rp;
import X.EnumC236999Rv;
import X.EnumC237029Ry;
import X.EnumC237129Si;
import X.InterfaceC214228aw;
import X.InterfaceC236979Rt;
import X.X1D;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeManagerVM extends AssemViewModel<C9S3> implements AQP {
    public static final C26222AQw LJLJJI = new C26222AQw("OfflineModeManagerVM");
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C237009Rw.LJLIL);
    public C236959Rr LJLILLLLZI;
    public long LJLJI;

    @Override // X.AQP
    public final void fY(EnumC237129Si enumC237129Si) {
    }

    public final InterfaceC214228aw<InterfaceC236979Rt> gv0() {
        return (InterfaceC214228aw) this.LJLIL.getValue();
    }

    public final void uv0() {
        int i;
        EnumC236939Rp enumC236939Rp;
        int i2 = C9SD.LIZ[getState().LJLJI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                C9SO LLF = gv0().getOperator().LLF();
                LJLJJI.LIZ(LLF, "try DOWNLOAD");
                if (LLF == null || (i = C9SD.LIZIZ[LLF.ordinal()]) == -1) {
                    rv0(C9SN.DOWNLOADING);
                    C9Q1 c9q1 = getState().LJLJL;
                    C9Q1 c9q12 = C9Q1.OFFLINE_MODE_PANEL;
                    if (c9q1 != c9q12) {
                        nv0(c9q12);
                        if (gv0().getOperator().LJJIIJZLJL()) {
                            gv0().getOperator().LJJJJIZL();
                            enumC236939Rp = EnumC236939Rp.FIRST_ENTER;
                        } else {
                            enumC236939Rp = EnumC236939Rp.CLICK_DOWNLOAD_ENTER;
                        }
                        ov0(enumC236939Rp);
                        C26218AQs.LIZ("click_download_offline_mode_video", null, null, null, null, Integer.valueOf(getState().LJLJJL), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388574);
                        return;
                    }
                    return;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        lv0(C9S1.NETWORK_MOBILE_DIALOG);
                        return;
                    } else {
                        mv0(EnumC236919Rn.NETWORK_NO_TOAST);
                        C26218AQs.LIZ("offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LJLJJL), EnumC236999Rv.NO_INTERNET_CONNECTION.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388510);
                        return;
                    }
                }
                mv0(EnumC236919Rn.STORAGE_FULL_TOAST);
                C26218AQs.LIZ("offline_mode_cache_load_block", null, null, null, null, Integer.valueOf(getState().LJLJJL), EnumC236999Rv.NOT_ENOUGH_SPACE.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388510);
                return;
            }
            return;
        }
        rv0(C9SN.USER_PAUSE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9S3 defaultState() {
        return new C9S3(gv0().getOperator().LLFF() / 1024, gv0().getOperator().LJJLIIIJLLLLLLLZ(), gv0().getOperator().LJJLIIIJLJLI(), gv0().getOperator().LJJIZ(), gv0().getOperator().LIZIZ(), null, null, null, null, null, null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        gv0().getOperator().LJJIL(this);
        C236959Rr c236959Rr = this.LJLILLLLZI;
        if (c236959Rr != null) {
            C252329vI.LIZIZ.LIZ.removeEffectiveConnectionTypeChangedListener(c236959Rr);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        gv0().getOperator().LJJLJLI(this);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C9Q6(this, null), 2);
    }

    @Override // X.AQP
    public final void Fu(int i) {
        if (i == getState().LJLJJL) {
            return;
        }
        iv0(i);
    }

    @Override // X.AQP
    public final void Xh(boolean z) {
        String str;
        if (z == getState().LJLJJI) {
            return;
        }
        kv0(z);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C26218AQs.LIZ("change_offline_mode_wifi_status", null, null, null, null, Integer.valueOf(getState().LJLJJL), null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, 8384478);
    }

    @Override // X.AQP
    public final void Xk(C9SN state) {
        o.LJIIIZ(state, "state");
        LJLJJI.LIZ(state, "onUpdateDownloadState");
        jv0(state);
        qv0(state);
    }

    @Override // X.AQP
    public final void Xk0(List<String> aids) {
        o.LJIIIZ(aids, "aids");
        List<String> list = ((C9S3) getState()).LJLJJLL;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!aids.contains(str)) {
                arrayList.add(str);
            }
        }
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeleteCaches, oldList ");
        LIZ.append(list.size());
        LIZ.append(", aids ");
        LIZ.append(aids.size());
        LIZ.append(", newList ");
        LIZ.append(arrayList.size());
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        pv0(arrayList);
    }

    @Override // X.AQP
    public final void hD(int i) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cachedVideoCount: ");
        LIZ.append(i);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS29S0001000_4(i, 5));
    }

    public final void hv0(EnumC236939Rp enterMethod) {
        C9Q1 c9q1;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (getState().LJLJI == C9SN.UNINITIALIZED) {
            c9q1 = C9Q1.OFFLINE_MODE_SETTING_PANEL;
            c9q1.setWithBack(false);
        } else {
            c9q1 = C9Q1.OFFLINE_MODE_PANEL;
        }
        nv0(c9q1);
        ov0(enterMethod);
    }

    public final void iv0(int i) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCacheCount ");
        LIZ.append(i);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS29S0001000_4(i, 6));
    }

    public final void jv0(C9SN c9sn) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDownloadState ");
        LIZ.append(c9sn);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(c9sn, 463));
    }

    public final void kv0(boolean z) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setIsWifiOnly ");
        LIZ.append(z);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS9S0010000_4(z, 14));
    }

    public final void lv0(C9S1 c9s1) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPopupDialogEvent ");
        LIZ.append(c9s1);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(c9s1, 464));
    }

    public final void mv0(EnumC236919Rn enumC236919Rn) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPopupSheetToastEvent ");
        LIZ.append(enumC236919Rn);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(enumC236919Rn, 465));
    }

    public final void nv0(C9Q1 c9q1) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSheetStyle ");
        LIZ.append(c9q1);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(c9q1, 466));
    }

    public final void ov0(EnumC236939Rp enumC236939Rp) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSheetUpdateEvent ");
        LIZ.append(enumC236939Rp);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(enumC236939Rp, 467));
    }

    public final void pv0(List<String> list) {
        Integer num;
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setWatchedList ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(list, (List<? extends Object>) 468));
    }

    public final void qv0(C9SN c9sn) {
        if (c9sn == null) {
            c9sn = getState().LJLJI;
        }
        int i = C9SD.LIZ[c9sn.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                mv0(EnumC236919Rn.NETWORK_NO_TOAST);
                return;
            }
            mv0(EnumC236919Rn.STORAGE_FULL_TOAST);
            return;
        }
        mv0(EnumC236919Rn.NETWORK_WIFI_TOAST);
    }

    public final void rv0(C9SN state) {
        EnumC237029Ry enumC237029Ry;
        o.LJIIIZ(state, "state");
        int i = C9SD.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 6) {
                    gv0().getOperator().LJZL();
                }
            } else {
                gv0().getOperator().LJZL();
            }
        } else {
            vv0(true);
            if (getState().LJLJL != C9Q1.OFFLINE_MODE_PANEL) {
                enumC237029Ry = EnumC237029Ry.CLICK_DOWNLOAD;
            } else {
                enumC237029Ry = EnumC237029Ry.USER_RESUME;
            }
            gv0().getOperator().LJLLLL(enumC237029Ry);
        }
        jv0(state);
    }

    public final void sv0(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (!getState().LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        gv0().getOperator().LJJJJL(z);
        kv0(z);
    }

    public final void tv0(C9SV value) {
        o.LJIIIZ(value, "value");
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPopupVideoToastEvent ");
        LIZ.append(value);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new AqS170S0100000_4(value, 969));
    }

    public final void vv0(boolean z) {
        int LIZIZ = gv0().getOperator().LIZIZ();
        int i = getState().LJLJJL;
        if (LIZIZ == i) {
            return;
        }
        if (z) {
            gv0().getOperator().LJLJLJ(i);
        } else {
            iv0(LIZIZ);
        }
    }

    @Override // X.AQP
    public final void zn0(double d) {
        C26222AQw c26222AQw = LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CachedVideoSize: ");
        LIZ.append(d / 1024);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
        setState(new C9QD(d));
    }
}
