package com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter;

import X.C16880lQ;
import X.C29306Beo;
import X.C31533CZd;
import X.CN1;
import X.CVC;
import X.CVG;
import X.CZP;
import X.CZR;
import X.CZT;
import X.CZV;
import X.ORS;
import X.X1D;
import Y.IDCallbackS367S0100000_5;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentConfig;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class StarCommentViewModel extends ViewModel {
    public DataChannel LJLJJL;
    public CZR LJLJJLL;
    public boolean LJLJL;
    public long LJLL;
    public long LJLLI;
    public boolean LJLLJ;
    public final MutableLiveData<CVG> LJLIL = new MutableLiveData<>(new CVG(new ArrayList()));
    public final MutableLiveData<CVC> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<List<CVC>> LJLJI = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<CZP> LJLJJI = new MutableLiveData<>();
    public String LJLJLJ = "";
    public final HashSet<String> LJLJLLL = new HashSet<>();
    public final Handler LJLLILLLL = new Handler(C16880lQ.LLJJJJ(), new IDCallbackS367S0100000_5(this, 0));
    public final HashMap<String, CVC> LJLLL = new HashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r8 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jv0() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel.jv0():void");
    }

    public final void reset() {
        this.LJLILLLLZI.setValue(null);
        MutableLiveData<List<CVC>> mutableLiveData = this.LJLJI;
        List<CVC> value = mutableLiveData.getValue();
        if (value != null) {
            value.clear();
        } else {
            value = null;
        }
        mutableLiveData.setValue(value);
        this.LJLJJI.setValue(null);
        this.LJLL = 0L;
        this.LJLLL.clear();
        CZR czr = this.LJLJJLL;
        if (czr != null && czr.LJLLLLLL == 3) {
            czr.LJFF(0);
        }
    }

    public final void gv0() {
        boolean z;
        IMessageManager iMessageManager;
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLLILLLL.removeMessages(1);
        this.LJLLILLLL.removeMessages(2);
        CVC value = this.LJLILLLLZI.getValue();
        if (value != null) {
            if (value.LJLL + value.LJLJJL + value.LJLLILLLL <= SystemClock.elapsedRealtime()) {
                this.LJLJLLL.add(value.LJLIL);
                CZR czr = this.LJLJJLL;
                if (czr != null && czr.LJLLLLLL == 1) {
                    z = true;
                } else {
                    z = false;
                }
                ChatMessage chatMessage = null;
                if (z) {
                    MutableLiveData<CVG> mutableLiveData = this.LJLIL;
                    CVG value2 = mutableLiveData.getValue();
                    if (value2 != null) {
                        value2.LIZ(value);
                    } else {
                        value2 = null;
                    }
                    mutableLiveData.setValue(value2);
                }
                CZR czr2 = this.LJLJJLL;
                if (czr2 != null && (iMessageManager = czr2.LJLJJLL) != null) {
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
                    Room room = czr2.LJLJJL;
                    if (room != null) {
                        j = room.getId();
                    } else {
                        j = 0;
                    }
                    String str = value.LJLJI;
                    User user = (User) czr2.LJLJLLL.get(Long.valueOf(value.LJLILLLLZI.getId()));
                    if (user == null) {
                        user = value.LJLILLLLZI;
                    }
                    ChatMessage ib = iPublicScreenService.ib(j, str, user, Long.valueOf(value.getMessageId()));
                    if (ib != null) {
                        ib.contentLanguage = value.LJLJLJ;
                        chatMessage = ib;
                    }
                    iMessageManager.insertMessage(chatMessage, true);
                }
                hv0(this.LJLJI.getValue(), false);
                return;
            }
            CZV czv = value.LJLLI;
            if (czv == CZV.BLANK || czv == CZV.SELF_WAITING) {
                if (SystemClock.elapsedRealtime() - value.LJLL >= value.LJLLILLLL) {
                    CZV czv2 = CZV.DISPLAYING;
                    o.LJIIIZ(czv2, "<set-?>");
                    value.LJLLI = czv2;
                    this.LJLILLLLZI.setValue(value);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("update status -> ");
                    LIZ.append(CZT.LIZIZ(value.LJLLI));
                    CZT.LIZLLL(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("progress difference: ");
                    LIZ2.append(System.currentTimeMillis() - value.LJLJJI);
                    LIZ2.append("ms");
                    CZT.LIZLLL(X1D.LIZIZ(LIZ2));
                }
            } else {
                value.LJLJLLL = (((value.LJLJJL - (SystemClock.elapsedRealtime() - value.LJLL)) + 499) + value.LJLLILLLL) / 1000;
                this.LJLILLLLZI.setValue(value);
            }
            MutableLiveData<List<CVC>> mutableLiveData2 = this.LJLJI;
            mutableLiveData2.setValue(mutableLiveData2.getValue());
            jv0();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Handler handler = this.LJLLILLLL;
            handler.sendMessageDelayed(handler.obtainMessage(1), 1000 - (elapsedRealtime2 - elapsedRealtime));
            return;
        }
        List<CVC> value3 = this.LJLJI.getValue();
        if (value3 == null || value3.isEmpty()) {
            return;
        }
        hv0(this.LJLJI.getValue(), true);
    }

    public final void iv0(List<CVC> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            hv0(list, true);
        }
        C29306Beo.LJJIJIIJI(new AqS171S0100000_5(this, 396), list);
        this.LJLLI = -1L;
        CVC value = this.LJLILLLLZI.getValue();
        if (value != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((CVC) ListProtector.get(list, i)).LJLJJI >= value.LJLJJI && ((CVC) ListProtector.get(list, i)).LJLJJI < value.LJLJJI + value.LJLJJL) {
                    if (i >= 0) {
                        if (o.LJ(value.LJLIL, ((CVC) ListProtector.get(list, i)).LJLIL)) {
                            if (i < arrayList.size()) {
                                MutableLiveData<List<CVC>> mutableLiveData = this.LJLJI;
                                List<CVC> subList = arrayList.subList(i + 1, arrayList.size());
                                kv0(value.LJLL + value.LJLLILLLL + value.LJLJJL, subList);
                                mutableLiveData.setValue(subList);
                            } else {
                                this.LJLJI.setValue(new ArrayList());
                            }
                            long j = ((CVC) ListProtector.get(list, i)).LJLJJI;
                            value.LJLJJI = j;
                            CZR czr = this.LJLJJLL;
                            if (czr == null) {
                                return;
                            }
                            czr.LJLJLJ = j;
                            return;
                        }
                        hv0(arrayList.subList(i, arrayList.size()), true);
                        return;
                    }
                } else {
                    i++;
                }
            }
            if (!(!arrayList.isEmpty()) || ((CVC) ListProtector.get(list, 0)).LJLJJI <= value.LJLJJI) {
                return;
            }
            MutableLiveData<List<CVC>> mutableLiveData2 = this.LJLJI;
            kv0(value.LJLL + value.LJLLILLLL + value.LJLJJL, list);
            mutableLiveData2.setValue(list);
            return;
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        this.LJLJI.setValue(list);
        gv0();
    }

    public static void kv0(long j, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CVC cvc = (CVC) it.next();
            cvc.LJLL = j;
            j += cvc.LJLLILLLL + cvc.LJLJJL;
        }
    }

    public final void hv0(List<CVC> list, boolean z) {
        this.LJLLILLLL.removeMessages(1);
        this.LJLLILLLL.removeMessages(2);
        if (list == null || list.isEmpty()) {
            reset();
            return;
        }
        CVC cvc = (CVC) ORS.LJJLJ(list);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (cvc.LJLLI == CZV.SELF_WAITING) {
            cvc.LJLLILLLL = LiveStarCommentConfig.INSTANCE.getSettingValue();
        } else if (z) {
            cvc.LJLLILLLL = 0L;
            CZV czv = CZV.DISPLAYING;
            o.LJIIIZ(czv, "<set-?>");
            cvc.LJLLI = czv;
        } else {
            long j = this.LJLLI;
            if (j > 0 && j < cvc.LJLJJI) {
                cvc.LJLLILLLL = C31533CZd.LIZLLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("display fast ");
                LIZ.append(cvc.LJLJJI - this.LJLLI);
                LIZ.append("ms");
                CZT.LIZLLL(X1D.LIZIZ(LIZ));
            } else if (j > cvc.LJLJJI) {
                cvc.LJLLILLLL = C31533CZd.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("display slow ");
                LIZ2.append(this.LJLLI - cvc.LJLJJI);
                LIZ2.append("ms");
                CZT.LIZLLL(X1D.LIZIZ(LIZ2));
            } else {
                cvc.LJLLILLLL = C31533CZd.LIZJ;
            }
            CZV czv2 = CZV.BLANK;
            o.LJIIIZ(czv2, "<set-?>");
            cvc.LJLLI = czv2;
        }
        cvc.LJLL = elapsedRealtime;
        cvc.LJLJLLL = cvc.LJLJJL / 1000;
        this.LJLILLLLZI.setValue(cvc);
        CZR czr = this.LJLJJLL;
        if (czr != null) {
            czr.LJLJLJ = cvc.LJLJJI;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("play next -> ");
        LIZ3.append(CZT.LIZIZ(cvc.LJLLI));
        CZT.LIZLLL(X1D.LIZIZ(LIZ3));
        MutableLiveData<List<CVC>> mutableLiveData = this.LJLJI;
        kv0(cvc.LJLJJL + elapsedRealtime + cvc.LJLLILLLL, list);
        mutableLiveData.setValue(list);
        jv0();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Handler handler = this.LJLLILLLL;
        handler.sendMessageDelayed(handler.obtainMessage(1), 1000 - (elapsedRealtime2 - elapsedRealtime));
    }
}
