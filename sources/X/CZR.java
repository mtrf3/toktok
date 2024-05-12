package X;

import Y.AObserverS73S0100000_5;
import Y.AfS54S0200000_5;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.CancelStarCommentAdministratorEvent;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdk.model.message.StarCommentNotificationMessage;
import com.bytedance.android.livesdk.model.message.StarCommentPushMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.StarCommentItem;
import tikcast.api.privilege.StarCommentQueue;

/* loaded from: classes6.dex */
public final class CZR implements CZZ, OnMessageListener {
    public static int LJZL = -1;
    public final Fragment LJLIL;
    public final DataChannel LJLILLLLZI;
    public StarCommentViewModel LJLJI;
    public CZY LJLJJI;
    public final Room LJLJJL;
    public final IMessageManager LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;
    public final C46708IUu LJLJLLL;
    public final C199767si LJLL;
    public CVC LJLLI;
    public CZV LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public final Handler LJLLLL;
    public int LJLLLLLL;
    public CZN LJLZ;
    public CZO LJZ;
    public AObserverS73S0100000_5 LJZI;

    @Override // X.CZZ
    public final int LIZ() {
        return this.LJLLLLLL;
    }

    @Override // X.CZZ
    public final StarCommentViewModel LIZIZ() {
        return this.LJLJI;
    }

    @Override // X.CZZ
    public final long LJ() {
        return this.LJLJLJ;
    }

    @Override // X.CZZ
    public final int getVersion() {
        return this.LJLJL;
    }

    @Override // X.CZZ
    public final void LIZJ(CZX czx) {
        Long l;
        long j;
        MutableLiveData<CVC> mutableLiveData;
        User owner;
        CZY czy = this.LJLJJI;
        if (czy != null) {
            Room room = (Room) czy.LIZIZ.kv0(RoomChannel.class);
            String str = null;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            if (room != null && (owner = room.getOwner()) != null) {
                str = owner.getSecUid();
            }
            String valueOf2 = String.valueOf(str);
            StarCommentViewModel LIZIZ = czy.LIZ.LIZIZ();
            if (LIZIZ == null || (mutableLiveData = LIZIZ.LJLILLLLZI) == null || mutableLiveData.getValue() == null) {
                j = 0;
            } else {
                j = czy.LIZ.LJ();
            }
            C1EW.LIZ(((StarCommentApi) Q7L.LIZIZ(StarCommentApi.class)).purchaseComment(valueOf, valueOf2, czx.LIZ, czx.LIZIZ, czx.LIZJ, czx.LIZLLL, czx.LJ, czy.LIZ.getVersion(), j, czx.LJFF, czx.LJI)).LJII(BTJ.LIZIZ(czy.LIZJ)).LJJJLIIL(new AfS54S0200000_5(czy, czx, 74), new AfS54S0200000_5(czy, czx, 75));
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    public final void LJFF(int i) {
        Room room;
        StarCommentConfig starCommentConfig;
        DataChannel dataChannel;
        if (i != this.LJLLLLLL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("role change -> ");
            LIZ.append(CZT.LIZ(i));
            CZT.LIZLLL(X1D.LIZIZ(LIZ));
        }
        ?? r3 = 1;
        if (this.LJLLLLLL == 0) {
            if (i != 0) {
                int i2 = this.LJLJL;
                if (i2 > 1) {
                    this.LJLJL = i2 - 1;
                }
                Handler handler = this.LJLLLL;
                handler.sendMessage(handler.obtainMessage(1));
            }
        } else if (i == 0) {
            this.LJLLLL.removeMessages(1);
        }
        if (this.LJLLLLLL == 2 && i != 2 && (dataChannel = this.LJLILLLLZI) != null) {
            dataChannel.pv0(CancelStarCommentAdministratorEvent.class);
        }
        if (!LiveStarCommentEnableSetting.INSTANCE.getSettingValue() || (room = this.LJLJJL) == null || (starCommentConfig = room.starCommentConfig) == null || !starCommentConfig.starCommentQualification || !room.showStarCommentEntrance || i == 1) {
            r3 = 0;
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(StarCommentEntranceVisibleEvent.class, Boolean.valueOf((boolean) r3));
        }
        if (r3 != LJZL) {
            LJZL = r3;
            Context context = this.LJLIL.getContext();
            if (context != null) {
                ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(context, Integer.valueOf(LJZL), "star_comment_entrance_visible");
            }
        }
        this.LJLLLLLL = i;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        long j;
        long j2;
        StarCommentViewModel starCommentViewModel;
        int i;
        int i2;
        User user;
        User user2;
        int i3 = 0;
        if (iMessage instanceof StarCommentPushMessage) {
            StarCommentPushMessage starCommentPushMessage = (StarCommentPushMessage) iMessage;
            StarCommentMessage starCommentMessage = starCommentPushMessage.current;
            if (starCommentMessage != null && (user2 = starCommentMessage.user) != null) {
                this.LJLJLLL.put(Long.valueOf(user2.getId()), user2);
            }
            StarCommentMessage starCommentMessage2 = starCommentPushMessage.next;
            if (starCommentMessage2 != null && (user = starCommentMessage2.user) != null) {
                this.LJLJLLL.put(Long.valueOf(user.getId()), user);
            }
            StarCommentMessage starCommentMessage3 = starCommentPushMessage.current;
            if (starCommentMessage3 != null) {
                C199767si c199767si = this.LJLL;
                String str = starCommentMessage3.starCommentId;
                c199767si.put(str, str);
            }
            StarCommentMessage starCommentMessage4 = starCommentPushMessage.next;
            if (starCommentMessage4 != null) {
                C199767si c199767si2 = this.LJLL;
                String str2 = starCommentMessage4.starCommentId;
                c199767si2.put(str2, str2);
            }
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                CVJ.LIZJ++;
                StarCommentMessage starCommentMessage5 = starCommentPushMessage.current;
                if (starCommentMessage5 != null) {
                    HashSet<String> hashSet = CVJ.LJI;
                    if (!hashSet.contains(starCommentMessage5.starCommentId)) {
                        hashSet.add(starCommentMessage5.starCommentId);
                        BZI LIZ = C28787BRn.LIZ("livesdk_push_message_receive");
                        CVJ.LIZLLL(LIZ, dataChannel);
                        LIZ.LJIJJ(starCommentMessage5.starCommentId, "msg_id");
                        LIZ.LJIJJ("current", "index");
                        User user3 = starCommentMessage5.user;
                        if (user3 != null && user3.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        LIZ.LJIJJ(Integer.valueOf(i2), "is_self");
                        LIZ.LJIJJ(Long.valueOf(starCommentMessage5.startTimeMs), "server_start_time_ms");
                        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "client_receive_time_ms");
                        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "client_receive_time_ntp_ms");
                        LIZ.LJJIIJZLJL();
                    }
                }
                StarCommentMessage starCommentMessage6 = starCommentPushMessage.next;
                if (starCommentMessage6 != null) {
                    HashSet<String> hashSet2 = CVJ.LJI;
                    if (!hashSet2.contains(starCommentMessage6.starCommentId)) {
                        hashSet2.add(starCommentMessage6.starCommentId);
                        BZI LIZ2 = C28787BRn.LIZ("livesdk_push_message_receive");
                        CVJ.LIZLLL(LIZ2, dataChannel);
                        LIZ2.LJIJJ(starCommentMessage6.starCommentId, "msg_id");
                        LIZ2.LJIJJ("next", "index");
                        User user4 = starCommentMessage6.user;
                        if (user4 != null && user4.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        LIZ2.LJIJJ(Integer.valueOf(i), "is_self");
                        LIZ2.LJIJJ(Long.valueOf(starCommentMessage6.startTimeMs), "server_start_time_ms");
                        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis()), "client_receive_time_ms");
                        LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "client_receive_time_ntp_ms");
                        LIZ2.LJJIIJZLJL();
                    }
                }
            }
            if (this.LJLLLLLL == 0) {
                Room room = this.LJLJJL;
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                ArrayList arrayList = new ArrayList();
                StarCommentMessage starCommentMessage7 = starCommentPushMessage.current;
                if (starCommentMessage7 != null) {
                    arrayList.add(C77125UOr.LJIIL(starCommentMessage7, j2, "message"));
                }
                StarCommentMessage starCommentMessage8 = starCommentPushMessage.next;
                if (starCommentMessage8 != null) {
                    arrayList.add(C77125UOr.LJIIL(starCommentMessage8, j2, "message"));
                }
                int i4 = starCommentPushMessage.queueVersion;
                int i5 = this.LJLJL;
                if (i4 > i5) {
                    this.LJLJL = i4;
                    StarCommentViewModel starCommentViewModel2 = this.LJLJI;
                    if (starCommentViewModel2 != null) {
                        starCommentViewModel2.iv0(arrayList);
                        return;
                    }
                    return;
                }
                if (i4 != i5 || !(!arrayList.isEmpty()) || ((CVC) ListProtector.get(arrayList, 0)).LJLJJI < this.LJLJLJ || (starCommentViewModel = this.LJLJI) == null) {
                    return;
                }
                starCommentViewModel.iv0(arrayList);
                return;
            }
            return;
        }
        if (iMessage instanceof StarCommentNotificationMessage) {
            if (this.LJLLLLLL != 1) {
                return;
            }
            StarCommentNotificationMessage starCommentNotificationMessage = (StarCommentNotificationMessage) iMessage;
            if (starCommentNotificationMessage.starCommentAction != 1) {
                return;
            }
            Room room2 = this.LJLJJL;
            if (room2 != null) {
                j = room2.getId();
            } else {
                j = 0;
            }
            StarCommentMessage starCommentMessage9 = starCommentNotificationMessage.starCommentMessage;
            CVG cvg = null;
            if (starCommentMessage9 == null) {
                return;
            }
            CVC LJIIL = C77125UOr.LJIIL(starCommentMessage9, j, "message");
            LJIIL.LJLJL = 2;
            LJIIL.LJLLLLLL = starCommentNotificationMessage.operator;
            StarCommentViewModel starCommentViewModel3 = this.LJLJI;
            if (starCommentViewModel3 == null) {
                return;
            }
            CZR czr = starCommentViewModel3.LJLJJLL;
            if (czr != null && czr.LJLLLLLL == 1) {
                MutableLiveData<CVG> mutableLiveData = starCommentViewModel3.LJLIL;
                CVG value = mutableLiveData.getValue();
                if (value != null) {
                    value.LIZ(LJIIL);
                    cvg = value;
                }
                mutableLiveData.setValue(cvg);
            }
            starCommentViewModel3.LJLJLLL.add(LJIIL.LJLIL);
            return;
        }
        if (!(iMessage instanceof MemberMessage) || this.LJLLLLLL == 1) {
            return;
        }
        MemberMessage memberMessage = (MemberMessage) iMessage;
        int i6 = memberMessage.action;
        if (i6 != 5 && i6 != 6 && i6 != 20) {
            return;
        }
        java.util.Map<Integer, Integer> map = memberMessage.adminPermissions;
        if (map == null || (num = map.get(9)) == null || num.intValue() != 1) {
            StarCommentViewModel starCommentViewModel4 = this.LJLJI;
            if (starCommentViewModel4 != null && starCommentViewModel4.LJLJL) {
                i3 = 3;
            }
        } else {
            i3 = 2;
        }
        LJFF(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        if (r6 != null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CZR(androidx.fragment.app.Fragment r13, com.bytedance.ies.sdk.datachannel.DataChannel r14) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZR.<init>(androidx.fragment.app.Fragment, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.CZZ
    public final void LIZLLL(StarCommentQueue starCommentQueue, boolean z) {
        String LJIILL;
        Object obj;
        String LJIILL2;
        String str;
        String str2;
        long j;
        StarCommentMessage starCommentMessage;
        CVC LJIIL;
        int i = starCommentQueue.queueVersion;
        if (i > this.LJLJL) {
            this.LJLJL = i;
            if (z) {
                C29306Beo.LJJIJIIJI(new AqS171S0100000_5(this, 770), starCommentQueue.starCommentList);
            }
            ArrayList arrayList = new ArrayList();
            for (StarCommentItem starCommentItem : starCommentQueue.starCommentList) {
                Room room = this.LJLJJL;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                o.LJIIIZ(starCommentItem, "<this>");
                if (starCommentItem.startCommentStatus != 2 && (starCommentMessage = starCommentItem.starComment) != null && (LJIIL = C77125UOr.LJIIL(starCommentMessage, j, "api")) != null) {
                    arrayList.add(LJIIL);
                }
            }
            if (z && arrayList.size() == 1 && ((CVC) ListProtector.get(arrayList, 0)).LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                CVC cvc = (CVC) ListProtector.get(arrayList, 0);
                CZV czv = CZV.SELF_WAITING;
                cvc.getClass();
                o.LJIIIZ(czv, "<set-?>");
                cvc.LJLLI = czv;
            }
            StarCommentViewModel starCommentViewModel = this.LJLJI;
            if (starCommentViewModel != null) {
                ArrayList arrayList2 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    if (starCommentViewModel.LJLLL.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            CVC cvc2 = (CVC) it.next();
                            starCommentViewModel.LJLLL.put(cvc2.LJLIL, cvc2);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            CVC cvc3 = (CVC) it2.next();
                            HashMap<String, CVC> hashMap = starCommentViewModel.LJLLL;
                            String str3 = cvc3.LJLIL;
                            cvc3.LJLZ = true;
                            hashMap.put(str3, cvc3);
                        }
                        Iterator<Map.Entry<String, CVC>> it3 = starCommentViewModel.LJLLL.entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry<String, CVC> next = it3.next();
                            o.LJIIIIZZ(next, "iterator.next()");
                            Map.Entry<String, CVC> entry = next;
                            if (!entry.getValue().LJLZ) {
                                if (entry.getValue().LJLJJI + entry.getValue().LJLJJL > ((CVC) ListProtector.get(arrayList, 0)).LJLJJI) {
                                    arrayList2.add(entry.getValue());
                                }
                                it3.remove();
                            } else {
                                entry.getValue().LJLZ = false;
                            }
                        }
                    }
                }
                C29306Beo.LJJIJIIJI(new AqS171S0100000_5(starCommentViewModel, 774), arrayList);
                String str4 = "myself";
                String str5 = "comment_area";
                if (!arrayList.isEmpty()) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            starCommentViewModel.LJLJLLL.add(((CVC) it4.next()).LJLIL);
                        }
                        Iterator it5 = arrayList2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj = it5.next();
                                if (((CVC) obj).LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (obj != null) {
                            MutableLiveData<CZP> mutableLiveData = starCommentViewModel.LJLJJI;
                            ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
                            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o5_);
                            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_starcmt_live_deleted)");
                            mutableLiveData.setValue(new CZP(avatarThumb, LJIILJJIL, CZW.DELETED));
                            starCommentViewModel.LJLL = (4 * 1000) + SystemClock.elapsedRealtime();
                            DataChannel dataChannel = starCommentViewModel.LJLJJL;
                            if (dataChannel != null) {
                                CVC cvc4 = (CVC) ListProtector.get(arrayList2, 0);
                                String str6 = ((CVC) ListProtector.get(arrayList2, 0)).LJLIL;
                                CVC value = starCommentViewModel.LJLILLLLZI.getValue();
                                if (value != null) {
                                    str2 = value.LJLIL;
                                } else {
                                    str2 = null;
                                }
                                if (!o.LJ(str6, str2)) {
                                    str5 = "queue_list";
                                }
                                CVI.LIZIZ(dataChannel, cvc4, str5);
                            }
                        } else {
                            CZR czr = starCommentViewModel.LJLJJLL;
                            if (czr != null && (czr.LJLLLLLL == 1 || czr.LJLLLLLL == 2)) {
                                MutableLiveData<CZP> mutableLiveData2 = starCommentViewModel.LJLJJI;
                                if (o.LJ(((CVC) ListProtector.get(arrayList2, 0)).LJLIL, starCommentViewModel.LJLJLJ)) {
                                    LJIILL2 = C15380j0.LJIILL(R.string.o5a, C05170If.LIZ(((CVC) ListProtector.get(arrayList2, 0)).LJLILLLLZI));
                                } else {
                                    LJIILL2 = C15380j0.LJIILL(R.string.o5b, C05170If.LIZ(((CVC) ListProtector.get(arrayList2, 0)).LJLILLLLZI));
                                }
                                o.LJIIIIZZ(LJIILL2, "if (deleteList[0].starCo…r))\n                    }");
                                mutableLiveData2.setValue(new CZP(null, LJIILL2, CZW.DELETED));
                                starCommentViewModel.LJLL = (4 * 1000) + SystemClock.elapsedRealtime();
                                DataChannel dataChannel2 = starCommentViewModel.LJLJJL;
                                if (dataChannel2 != null) {
                                    CVC cvc5 = (CVC) ListProtector.get(arrayList2, 0);
                                    if (!o.LJ(((CVC) ListProtector.get(arrayList2, 0)).LJLIL, starCommentViewModel.LJLJLJ)) {
                                        str4 = "others";
                                    }
                                    String str7 = ((CVC) ListProtector.get(arrayList2, 0)).LJLIL;
                                    CVC value2 = starCommentViewModel.LJLILLLLZI.getValue();
                                    if (value2 != null) {
                                        str = value2.LJLIL;
                                    } else {
                                        str = null;
                                    }
                                    if (!o.LJ(str7, str)) {
                                        str5 = "queue_list";
                                    }
                                    CVI.LIZ(dataChannel2, cvc5, str4, str5);
                                }
                            }
                        }
                    }
                    starCommentViewModel.LJLLJ = false;
                    CVC value3 = starCommentViewModel.LJLILLLLZI.getValue();
                    if (value3 != null) {
                        if (o.LJ(((CVC) ListProtector.get(arrayList, 0)).LJLIL, value3.LJLIL)) {
                            MutableLiveData<List<CVC>> mutableLiveData3 = starCommentViewModel.LJLJI;
                            List<CVC> subList = arrayList.subList(1, arrayList.size());
                            StarCommentViewModel.kv0(value3.LJLL + value3.LJLLILLLL + value3.LJLJJL, subList);
                            mutableLiveData3.setValue(subList);
                            starCommentViewModel.jv0();
                            long j2 = ((CVC) ListProtector.get(arrayList, 0)).LJLJJI;
                            value3.LJLJJI = j2;
                            CZR czr2 = starCommentViewModel.LJLJJLL;
                            if (czr2 == null) {
                                return;
                            }
                            czr2.LJLJLJ = j2;
                            return;
                        }
                        starCommentViewModel.hv0(arrayList, true);
                        return;
                    }
                    if (!(true ^ arrayList.isEmpty())) {
                        return;
                    }
                    starCommentViewModel.LJLJI.setValue(arrayList);
                    starCommentViewModel.gv0();
                    return;
                }
                if (starCommentViewModel.LJLLJ || starCommentViewModel.LJLILLLLZI.getValue() == null) {
                    starCommentViewModel.LJLLJ = true;
                    return;
                }
                starCommentViewModel.LJLLILLLL.removeMessages(1);
                starCommentViewModel.LJLLILLLL.removeMessages(2);
                CVC value4 = starCommentViewModel.LJLILLLLZI.getValue();
                if (value4 != null) {
                    starCommentViewModel.LJLJLLL.add(value4.LJLIL);
                    MutableLiveData<CVC> mutableLiveData4 = starCommentViewModel.LJLILLLLZI;
                    value4.LJLJLLL = 0L;
                    mutableLiveData4.setValue(value4);
                    MutableLiveData<List<CVC>> mutableLiveData5 = starCommentViewModel.LJLJI;
                    List<CVC> value5 = mutableLiveData5.getValue();
                    if (value5 != null) {
                        value5.clear();
                    } else {
                        value5 = null;
                    }
                    mutableLiveData5.setValue(value5);
                    if (value4.LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                        MutableLiveData<CZP> mutableLiveData6 = starCommentViewModel.LJLJJI;
                        ImageModel avatarThumb2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
                        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.o5_);
                        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_starcmt_live_deleted)");
                        mutableLiveData6.setValue(new CZP(avatarThumb2, LJIILJJIL2, CZW.DELETED));
                        CZR czr3 = starCommentViewModel.LJLJJLL;
                        if (czr3 != null && czr3.LJLLLLLL == 3) {
                            czr3.LJFF(0);
                        }
                        DataChannel dataChannel3 = starCommentViewModel.LJLJJL;
                        if (dataChannel3 != null) {
                            CVI.LIZIZ(dataChannel3, value4, "comment_area");
                        }
                    } else {
                        CZR czr4 = starCommentViewModel.LJLJJLL;
                        if (czr4 != null && (czr4.LJLLLLLL == 1 || czr4.LJLLLLLL == 2)) {
                            MutableLiveData<CZP> mutableLiveData7 = starCommentViewModel.LJLJJI;
                            if (o.LJ(value4.LJLIL, starCommentViewModel.LJLJLJ)) {
                                LJIILL = C15380j0.LJIILL(R.string.o5a, C05170If.LIZ(value4.LJLILLLLZI));
                            } else {
                                LJIILL = C15380j0.LJIILL(R.string.o5b, C05170If.LIZ(value4.LJLILLLLZI));
                            }
                            o.LJIIIIZZ(LJIILL, "if (showingComment.starC…r))\n                    }");
                            mutableLiveData7.setValue(new CZP(null, LJIILL, CZW.DELETED));
                            DataChannel dataChannel4 = starCommentViewModel.LJLJJL;
                            if (dataChannel4 != null) {
                                if (!o.LJ(value4.LJLIL, starCommentViewModel.LJLJLJ)) {
                                    str4 = "others";
                                }
                                CVI.LIZ(dataChannel4, value4, str4, "comment_area");
                            }
                        }
                    }
                    Handler handler = starCommentViewModel.LJLLILLLL;
                    handler.sendMessageDelayed(handler.obtainMessage(2), 4 * 1000);
                }
                starCommentViewModel.LJLLJ = true;
            }
        }
    }
}
