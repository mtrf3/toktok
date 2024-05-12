package X;

import Y.ARunnableS10S1300000_13;
import Y.ARunnableS14S1100000_13;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiguestOptPauseWhenRTCExceptionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutApplogCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8I {
    public final /* synthetic */ U8H LIZ;

    public U8I(U8H u8h) {
        this.LIZ = u8h;
    }

    public final void LIZJ(String linkMicId) {
        Long userId;
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(453);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onUserJoin linkMicId = ");
        LIZ.append(linkMicId);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        this.LIZ.LJJLJ(true);
        LinkUser LJI = this.LIZ.LJIL().LJI(linkMicId);
        if (LJI == null || (userId = LJI.getUserId()) == null) {
            this.LIZ.getClass();
            String LJJJ2 = U8H.LJJJ(446);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LIZ.LJJIJ());
            LIZ2.append(":onUserJoined return as  there isn't linkMicId in linkedList");
            C32014ChO.LJFF(LJJJ2, X1D.LIZIZ(LIZ2));
            this.LIZ.LIZIZ.add(new ARunnableS14S1100000_13(this, linkMicId, 12));
            return;
        }
        U8H u8h = this.LIZ;
        Iterator<InterfaceC76112Tu0> it = u8h.LJIILJJIL.iterator();
        while (it.hasNext()) {
            InterfaceC76112Tu0 next = it.next();
            LinkUser LIZ3 = u8h.LJIL().LIZ(userId.longValue());
            if (LIZ3 == null) {
                LinkUser.Builder builder = new LinkUser.Builder();
                builder.setUserId(userId);
                builder.setLinkMicId(linkMicId);
                LIZ3 = builder.build();
            }
            next.LJLLL(LIZ3);
        }
        C76701U8j c76701U8j = new C76701U8j(EnumC75419Tip.StateJoined, userId, linkMicId, null, null, null, 248);
        U8H u8h2 = this.LIZ;
        if (u8h2.LJIJJ().LJIILJJIL(c76701U8j, null)) {
            u8h2.LJJJIL(null);
        }
        this.LIZ.LJJIJIL();
    }

    public final void LIZLLL(String linkMicId, long j) {
        Long l;
        C76701U8j c76701U8j;
        SurfaceView surfaceView;
        LayoutSlardarMonitor layoutSlardarMonitor;
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(484);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onUserLeft linkMicId = ");
        LIZ.append(linkMicId);
        LIZ.append(" leaveReason = ");
        C72972SkS.LJI(LIZ, j, LIZ, LJJJ);
        LinkUser LJI = this.LIZ.LJIL().LJI(linkMicId);
        if (LJI != null) {
            l = LJI.getUserId();
        } else {
            l = null;
        }
        if (LiveMultiguestOptPauseWhenRTCExceptionSetting.INSTANCE.isOptOnRTCException()) {
            long j2 = this.LIZ.LIZ.LJ;
            if (l != null && l.longValue() == j2) {
                return;
            }
        }
        Iterator<C76711U8t> it = this.LIZ.LJIJJ().LIZIZ().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().LJLIL.LIZJ, linkMicId)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        U8H u8h = this.LIZ;
        if (i != -1 && (layoutSlardarMonitor = u8h.LJJJI) != null) {
            layoutSlardarMonitor.LIZIZ(false, l, linkMicId, Integer.valueOf(u8h.LJIJJ().LJIIL(i)), Integer.valueOf(i), false, u8h.LJJIJ());
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (l == null || l.longValue() != currentUserId) {
            C76711U8t LJI2 = this.LIZ.LJIJJ().LJI(linkMicId);
            if (LJI2 != null && (c76701U8j = LJI2.LJLIL) != null && (surfaceView = c76701U8j.LIZLLL) != null) {
                this.LIZ.getClass();
                U8H.LJJJJLL(surfaceView);
            }
            this.LIZ.LJIJJ().LJIIJJI(linkMicId);
        } else {
            U8H u8h2 = this.LIZ;
            if (u8h2.LJJJ) {
                return;
            }
            Integer LIZLLL = u8h2.LJJIIJZLJL().LIZLLL(linkMicId);
            if (LIZLLL != null) {
                U8H u8h3 = this.LIZ;
                SurfaceView surfaceView2 = u8h3.LJIJJ().LJFF(LIZLLL.intValue()).LJLIL.LIZLLL;
                if (surfaceView2 == null) {
                    u8h3.LJIJJ().LJIIJJI(linkMicId);
                    String LJJJ2 = U8H.LJJJ(502);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(u8h3.LJJIJ());
                    LIZ2.append(":onUserLeft release return as surfaceView is null!");
                    C32014ChO.LIZJ(LJJJ2, X1D.LIZIZ(LIZ2), null);
                    return;
                }
                U8H.LJJJJLL(surfaceView2);
            }
            this.LIZ.LJJLJ(false);
            this.LIZ.LJIJJ().LJIIJJI(linkMicId);
        }
        this.LIZ.LJJIJIL();
        this.LIZ.LJJJIL(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0164, code lost:
    
        if (r3.dslEqual(r6.LJIJJ().LJIIIIZZ) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout r25, com.bytedance.android.livesdk.sei.SeiAppData r26) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U8I.LJ(com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout, com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    public final void LJFF(DslLayout dslLayout, InterfaceC75804Tp2 interfaceC75804Tp2) {
        String str;
        Long l;
        SeiDsl seiDsl;
        FrameLayout frameLayout;
        U8H u8h = this.LIZ;
        Long l2 = null;
        if (u8h.LJJIL != null) {
            SeiAppData seiAppData = u8h.LJJIJLIJ;
            if (seiAppData != null) {
                seiDsl = seiAppData.dsl;
            } else {
                seiDsl = null;
            }
            if (o.LJ(seiDsl, interfaceC75804Tp2.LJI())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i = 0;
                for (C76711U8t c76711U8t : this.LIZ.LJIJJ().LIZIZ()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C76711U8t c76711U8t2 = c76711U8t;
                        String str2 = c76711U8t2.LJLIL.LIZJ;
                        if (str2 != null) {
                            linkedHashMap2.put(str2, c76711U8t2);
                            linkedHashMap.put(str2, Integer.valueOf(i));
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                java.util.Set<String> LJIIIZ = F5P.LJIIIZ(this.LIZ.LJIJJ().LJII(), ORZ.LLJJ(interfaceC75804Tp2.LIZJ()));
                U8H u8h2 = this.LIZ;
                for (String str3 : LJIIIZ) {
                    if (str3 != null) {
                        u8h2.LJIJJ().LJIIJJI(str3);
                    }
                }
                List<String> LIZJ = interfaceC75804Tp2.LIZJ();
                U8H u8h3 = this.LIZ;
                for (String str4 : LIZJ) {
                    if (str4 != null) {
                        LinkUser LJI = u8h3.LIZ.LJFF.LJI(str4);
                        if (LJI != null) {
                            l2 = LJI.getUserId();
                        }
                        String LJJIJ = u8h3.LJJIJ();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onSei linkMicId:");
                        LIZ.append(str4);
                        LIZ.append(", userId:");
                        LIZ.append(l2);
                        C0NB.LIZIZ(LJJIJ, X1D.LIZIZ(LIZ));
                        C76703U8l LJIJJ = u8h3.LJIJJ();
                        EnumC75419Tip enumC75419Tip = EnumC75419Tip.StateLinked;
                        C76701U8j c76701U8j = new C76701U8j(enumC75419Tip, l2, str4, null, null, enumC75419Tip, 216);
                        C76711U8t c76711U8t3 = (C76711U8t) linkedHashMap2.get(str4);
                        if (c76711U8t3 != null) {
                            frameLayout = c76711U8t3.LJLILLLLZI;
                        } else {
                            frameLayout = null;
                        }
                        LJIJJ.LJIILJJIL(c76701U8j, frameLayout);
                    }
                    l2 = null;
                }
                return;
            }
        }
        java.util.Set<String> LJIIIZ2 = F5P.LJIIIZ(this.LIZ.LJIJJ().LJII(), ORZ.LLJJ(interfaceC75804Tp2.LIZJ()));
        U8H u8h4 = this.LIZ;
        for (String str5 : LJIIIZ2) {
            if (str5 != null) {
                u8h4.LJIJJ().LJIIJJI(str5);
            }
        }
        List<String> LIZJ2 = interfaceC75804Tp2.LIZJ();
        U8H u8h5 = this.LIZ;
        for (String str6 : LIZJ2) {
            if (str6 != null) {
                LinkUser LJI2 = u8h5.LIZ.LJFF.LJI(str6);
                if (LJI2 != null) {
                    l = LJI2.getUserId();
                } else {
                    l = null;
                }
                String LJJJ = U8H.LJJJ(340);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(u8h5.LJJIJ());
                LIZ2.append(":onSei linkMicId:");
                LIZ2.append(str6);
                LIZ2.append(", userId:");
                LIZ2.append(l);
                C32014ChO.LIZ(LJJJ, X1D.LIZIZ(LIZ2));
                u8h5.LJIJJ().LJIILJJIL(new C76701U8j(EnumC75419Tip.StateLinked, l, str6, null, null, null, 248), null);
            }
        }
        this.LIZ.LJIIL.LJLIL = dslLayout.getVersion();
        SeiDsl LJI3 = interfaceC75804Tp2.LJI();
        if (LJI3 != null && (str = LJI3.layoutId) != null) {
            U8H u8h6 = this.LIZ;
            u8h6.LIZ.LJFF.LJIIZILJ(dslLayout.getVersion(), str, new U90(u8h6));
        }
    }

    public final void LIZ(String linkMicId, SurfaceView surfaceView, ILayerControl.ILayer iLayer) {
        C76701U8j c76701U8j;
        SurfaceView surfaceView2 = surfaceView;
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(538);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onFirstRemoteVideoFrameRender linkMicId = ");
        LIZ.append(linkMicId);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        this.LIZ.LJJLJ(true);
        LinkUser LJI = this.LIZ.LJIL().LJI(linkMicId);
        if (LJI == null) {
            String msgId = this.LIZ.LIZ.LJFF.LJJIIJ();
            o.LJIIIZ(msgId, "msgId");
            if (LivesdkLinkmicLayoutApplogCombineSetting.INSTANCE.isLinkUserNotFoundReportEnable()) {
                JSONObject LIZ2 = U8K.LIZ(null);
                LIZ2.put("sub_event", "linkuser_not_found");
                LIZ2.put("target_linkmic_id", linkMicId);
                LIZ2.put("latest_msg_id", msgId);
                if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_layout_exception", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_layout_exception");
                    LIZ3.LJJ(LIZ2);
                    if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                        LIZ3.LJJIIJZLJL();
                    } else {
                        LIZ3.LJJIJ();
                        LIZ3.LJJIIZI();
                    }
                }
                C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
                String jSONObject = LIZ2.toString();
                o.LJIIIIZZ(jSONObject, "this.toString()");
                c76175Tv1.LIZ(40003, jSONObject, null);
            }
            this.LIZ.getClass();
            String LJJJ2 = U8H.LJJJ(581);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LIZ.LJJIJ());
            LIZ4.append(",onFirstRemoteVideoFrameRender linkUser ");
            LIZ4.append(linkMicId);
            LIZ4.append(" not found and report");
            C32014ChO.LIZJ(LJJJ2, X1D.LIZIZ(LIZ4), null);
            this.LIZ.LIZIZ.add(new ARunnableS10S1300000_13(this, surfaceView2, iLayer, linkMicId, 0));
            return;
        }
        C76711U8t LJI2 = this.LIZ.LJIJJ().LJI(linkMicId);
        C76703U8l LJIJJ = this.LIZ.LJIJJ();
        Long userId = LJI.getUserId();
        String linkMicId2 = LJI.getLinkMicId();
        EnumC75419Tip enumC75419Tip = EnumC75419Tip.StateLinked;
        if (surfaceView2 == null) {
            if (LJI2 != null && (c76701U8j = LJI2.LJLIL) != null) {
                surfaceView2 = c76701U8j.LIZLLL;
            } else {
                surfaceView2 = null;
            }
        }
        LJIJJ.LJIILJJIL(new C76701U8j(enumC75419Tip, userId, linkMicId2, surfaceView2, new WeakReference(iLayer), null, 224), null);
        this.LIZ.LJJJIL(null);
    }

    public final void LIZIZ(C28272B7s seiString, InterfaceC75804Tp2 linkLayoutSei, boolean z) {
        Integer num;
        Integer num2;
        String str;
        java.util.Map<String, String> map;
        N2K n2k;
        DataChannel LJIIL;
        InterfaceC28296B8q interfaceC28296B8q;
        Integer num3;
        Integer num4;
        InterfaceC28296B8q interfaceC28296B8q2;
        InterfaceC28296B8q interfaceC28296B8q3;
        String str2;
        List<LinkUser> LLJILJILJ;
        Long l;
        o.LJIIIZ(seiString, "seiString");
        o.LJIIIZ(linkLayoutSei, "linkLayoutSei");
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("LinkLayoutManager", "onSei");
        if (!this.LIZ.LJJIJL()) {
            C31811Ce7.LIZLLL("LinkLayoutManager", "isAudience().not return");
            return;
        }
        Integer num5 = null;
        if (linkLayoutSei instanceof SeiAppData) {
            U8H u8h = this.LIZ;
            u8h.LJJJ = false;
            SeiAppData seiAppData = (SeiAppData) linkLayoutSei;
            long j = seiAppData.timestamp;
            long j2 = u8h.LJJIJL;
            if (j < j2) {
                if (!u8h.LIZ.LJI && !z) {
                    U8K.LJFF(j2, j);
                    return;
                }
                return;
            }
            if (!o.LJ(seiAppData.channelId, U8K.LIZLLL) && !this.LIZ.LIZ.LJI && !z) {
                U8K.LIZIZ(U8K.LIZLLL, seiAppData.channelId);
            }
            java.util.Map<String, java.util.Map<String, String>> map2 = seiAppData.businessExtraInfo;
            if (map2 != null) {
                U8H u8h2 = this.LIZ;
                for (Map.Entry<String, java.util.Map<String, String>> entry : map2.entrySet()) {
                    N2K n2k2 = u8h2.LJIILL().get(entry.getKey());
                    if (n2k2 != null) {
                        String key = entry.getKey();
                        o.LJIIIIZZ(key, "it.key");
                        java.util.Map<String, String> value = entry.getValue();
                        o.LJIIIIZZ(value, "it.value");
                        n2k2.LIZIZ(key, value);
                    }
                }
            }
            if (this.LIZ.LJJJJJL == null) {
                String LJJJ = U8H.LJJJ(274);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LIZ.LJJIJ());
                LIZ.append(":received sei but do not handle cause vp is null");
                C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
                return;
            }
            List<SeiRegion> list = seiAppData.grids;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (SeiRegion seiRegion : list) {
                    if (!C29306Beo.LJIJJLI(seiRegion.LIZ())) {
                        break;
                    } else {
                        arrayList.add(seiRegion);
                    }
                }
                U8H u8h3 = this.LIZ;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SeiRegion seiRegion2 = (SeiRegion) it.next();
                    String linkMicId = seiRegion2.LIZ();
                    U8M u8m = u8h3.LIZ.LJFF;
                    o.LJIIIIZZ(linkMicId, "linkMicId");
                    LinkUser LJI = u8m.LJI(linkMicId);
                    if (LJI != null) {
                        l = LJI.getUserId();
                    } else {
                        l = null;
                    }
                    String LJJJ2 = U8H.LJJJ(282);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(u8h3.LJJIJ());
                    LIZ2.append(":onSei onAudioMute linkMicId:");
                    LIZ2.append(linkMicId);
                    LIZ2.append(", userId:");
                    LIZ2.append(l);
                    LIZ2.append(", isAudioMute:");
                    LIZ2.append(seiRegion2.muteAudioBool);
                    C32014ChO.LIZ(LJJJ2, X1D.LIZIZ(LIZ2));
                    U8M u8m2 = u8h3.LIZ.LJFF;
                    if (l != null) {
                        l.longValue();
                    }
                    u8m2.LJIILLIIL(linkMicId, seiRegion2.muteAudioBool);
                }
            }
            List<String> list2 = seiAppData.localChangeLinkMicIds;
            if (list2 == null || list2.isEmpty()) {
                U8H u8h4 = this.LIZ;
                if (u8h4.LJJIII) {
                    u8h4.LJJIII = false;
                    u8h4.LIZ.LJFF.LJJJJIZL(u8h4.LJJIIJ, u8h4.LJJIIJZLJL);
                }
            } else if (!this.LIZ.LJJIII) {
                ArrayList arrayList2 = new ArrayList();
                List<String> list3 = seiAppData.localChangeLinkMicIds;
                o.LJIIIIZZ(list3, "seiAppData.localChangeLinkMicIds");
                U8H u8h5 = this.LIZ;
                for (String it2 : list3) {
                    UBK LJIL = u8h5.LJIL();
                    o.LJIIIIZZ(it2, "it");
                    LinkUser LJI2 = LJIL.LJI(it2);
                    if (LJI2 == null) {
                        LinkUser.Builder builder = new LinkUser.Builder();
                        builder.setLinkMicId(it2);
                        LJI2 = builder.build();
                    }
                    arrayList2.add(LJI2);
                }
                U8H u8h6 = this.LIZ;
                u8h6.LJJIIJZLJL = arrayList2;
                if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                    C76665U6z c76665U6z = this.LIZ.LIZ;
                    if (c76665U6z.LIZIZ == 2 && c76665U6z.LJFF.LJJIJL() == EnumC53637L3h.CO_LINK) {
                        LLJILJILJ = ORZ.LLJILJILJ(this.LIZ.LIZ.LJFF.LJJIIZI());
                    } else {
                        LLJILJILJ = ORZ.LLJILJILJ(this.LIZ.LIZ.LJFF.LJFF());
                    }
                } else {
                    LLJILJILJ = ORZ.LLJILJILJ(this.LIZ.LIZ.LJFF.LJJIIZI());
                }
                u8h6.LJJIIJ = LLJILJILJ;
                U8H u8h7 = this.LIZ;
                u8h7.LJJIII = true;
                String LJJIJ = u8h7.LJJIJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mOldLinkedList:");
                LIZ3.append(this.LIZ.LJJIIJ);
                C0NB.LIZIZ(LJJIJ, X1D.LIZIZ(LIZ3));
                String LJJIJ2 = this.LIZ.LJJIJ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("mNewLinkedList:");
                LIZ4.append(this.LIZ.LJJIIJZLJL);
                C0NB.LIZIZ(LJJIJ2, X1D.LIZIZ(LIZ4));
                U8H u8h8 = this.LIZ;
                u8h8.LIZ.LJFF.LJJJIL(u8h8.LJJIIJ, u8h8.LJJIIJZLJL);
            }
            if (!this.LIZ.LJJIIJ().LIZJ) {
                String LJJJLL = U8H.LJJJLL(this.LIZ.LJJIZ);
                String str3 = seiString.LIZIZ;
                if (str3 != null) {
                    this.LIZ.getClass();
                    str2 = U8H.LJJJLL(str3);
                } else {
                    str2 = null;
                }
                if (o.LJ(LJJJLL, str2) || o.LJ(this.LIZ.LJJIJLIJ, linkLayoutSei)) {
                    this.LIZ.LJJIJL = seiAppData.timestamp;
                    return;
                }
            }
            SeiAppData seiAppData2 = this.LIZ.LJJIJLIJ;
            if (seiAppData2 == null || seiAppData2.battleId != seiAppData.battleId) {
                String LJJJ3 = U8H.LJJJ(300);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.LIZ.LJJIJ());
                LIZ5.append(":onSeiBattleIdUpdated battleId:");
                C72972SkS.LJI(LIZ5, seiAppData.battleId, LIZ5, LJJJ3);
                Iterator<InterfaceC76112Tu0> it3 = this.LIZ.LJIILJJIL.iterator();
                while (it3.hasNext()) {
                    it3.next().LJJLIIIJ(seiAppData);
                }
            }
            DslLayout dslLayout = this.LIZ.LJIILIIL;
            if (dslLayout != null) {
                Integer valueOf = Integer.valueOf(dslLayout.getScene());
                SeiDsl seiDsl = seiAppData.dsl;
                if (seiDsl != null) {
                    num3 = Integer.valueOf(seiDsl.scene);
                } else {
                    num3 = null;
                }
                if (o.LJ(valueOf, num3)) {
                    DslLayout dslLayout2 = this.LIZ.LJIILIIL;
                    if (dslLayout2 != null) {
                        num4 = Integer.valueOf(dslLayout2.getVersion());
                    } else {
                        num4 = null;
                    }
                    SeiDsl seiDsl2 = seiAppData.dsl;
                    if (seiDsl2 != null) {
                        num5 = Integer.valueOf(seiDsl2.version);
                    }
                    if (o.LJ(num4, num5)) {
                        C76665U6z c76665U6z2 = this.LIZ.LIZ;
                        if (!c76665U6z2.LJI) {
                            DataChannel LJIIL2 = c76665U6z2.LJFF.LJIIL();
                            if (LJIIL2 != null && (interfaceC28296B8q3 = (InterfaceC28296B8q) LJIIL2.kv0(C28406BCw.class)) != null) {
                                interfaceC28296B8q3.LJIILIIL();
                            }
                            DataChannel LJIIL3 = this.LIZ.LIZ.LJFF.LJIIL();
                            if (LJIIL3 != null && (interfaceC28296B8q2 = (InterfaceC28296B8q) LJIIL3.kv0(C28406BCw.class)) != null) {
                                interfaceC28296B8q2.LJIILJJIL();
                            }
                        }
                        DslLayout dslLayout3 = this.LIZ.LJIILIIL;
                        if (dslLayout3 != null) {
                            LJ(dslLayout3, seiAppData);
                        }
                        this.LIZ.LJJIJLIJ = seiAppData;
                        this.LIZ.LJJIZ = String.valueOf(seiString.LIZIZ);
                        this.LIZ.LJJIJL = seiAppData.timestamp;
                        return;
                    }
                }
            }
            SeiDsl seiDsl3 = seiAppData.dsl;
            if (seiDsl3 != null) {
                U8H u8h9 = this.LIZ;
                C76665U6z c76665U6z3 = u8h9.LIZ;
                if (!c76665U6z3.LJI && (LJIIL = c76665U6z3.LJFF.LJIIL()) != null && (interfaceC28296B8q = (InterfaceC28296B8q) LJIIL.kv0(C28406BCw.class)) != null) {
                    interfaceC28296B8q.LJIILIIL();
                }
                u8h9.LIZ.LJFF.LJJI(seiDsl3.scene, seiDsl3.version, new C76709U8r(u8h9, this, linkLayoutSei));
            }
            this.LIZ.LJJIZ = String.valueOf(seiString.LIZIZ);
            this.LIZ.LJJIJL = seiAppData.timestamp;
            return;
        }
        this.LIZ.LJJJ = false;
        long LJ = linkLayoutSei.LJ();
        U8H u8h10 = this.LIZ;
        long j3 = u8h10.LJJIJL;
        if (LJ < j3) {
            if (!u8h10.LIZ.LJI && !z) {
                U8K.LJFF(j3, linkLayoutSei.LJ());
                return;
            }
            return;
        }
        if (!o.LJ(linkLayoutSei.LLLLLLIL(), U8K.LIZLLL) && !this.LIZ.LIZ.LJI && !z) {
            U8K.LIZIZ(U8K.LIZLLL, linkLayoutSei.LLLLLLIL());
        }
        java.util.Map<String, java.util.Map<String, String>> LIZLLL = linkLayoutSei.LIZLLL();
        if (LIZLLL != null) {
            U8H u8h11 = this.LIZ;
            for (Map.Entry<String, java.util.Map<String, String>> entry2 : LIZLLL.entrySet()) {
                java.util.Map<String, String> value2 = entry2.getValue();
                if (C65777Prh.LJII(value2) && (map = value2) != null && (n2k = u8h11.LJIILL().get(entry2.getKey())) != null) {
                    n2k.LIZIZ(entry2.getKey(), map);
                }
            }
        }
        U8H u8h12 = this.LIZ;
        if (u8h12.LJJJJJL == null) {
            String LJJJ4 = U8H.LJJJ(377);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(this.LIZ.LJJIJ());
            LIZ6.append(":received sei but do not handle cause vp is null");
            C32014ChO.LJFF(LJJJ4, X1D.LIZIZ(LIZ6));
            return;
        }
        if (!u8h12.LJJIIJ().LIZJ) {
            String LJJJLL2 = U8H.LJJJLL(this.LIZ.LJJIZ);
            String str4 = seiString.LIZIZ;
            if (str4 != null) {
                this.LIZ.getClass();
                str = U8H.LJJJLL(str4);
            } else {
                str = null;
            }
            if (o.LJ(LJJJLL2, str) || o.LJ(this.LIZ.LJJIL, linkLayoutSei)) {
                this.LIZ.LJJIJL = linkLayoutSei.LJ();
                return;
            }
        }
        DslLayout dslLayout4 = this.LIZ.LJIILIIL;
        if (dslLayout4 != null) {
            Integer valueOf2 = Integer.valueOf(dslLayout4.getScene());
            SeiDsl LJI3 = linkLayoutSei.LJI();
            if (LJI3 != null) {
                num = Integer.valueOf(LJI3.scene);
            } else {
                num = null;
            }
            if (o.LJ(valueOf2, num)) {
                DslLayout dslLayout5 = this.LIZ.LJIILIIL;
                if (dslLayout5 != null) {
                    num2 = Integer.valueOf(dslLayout5.getVersion());
                } else {
                    num2 = null;
                }
                SeiDsl LJI4 = linkLayoutSei.LJI();
                if (LJI4 != null) {
                    num5 = Integer.valueOf(LJI4.version);
                }
                if (o.LJ(num2, num5)) {
                    DslLayout dslLayout6 = this.LIZ.LJIILIIL;
                    if (dslLayout6 != null) {
                        LJFF(dslLayout6, linkLayoutSei);
                    }
                    this.LIZ.LJJIL = linkLayoutSei;
                    this.LIZ.LJJIZ = String.valueOf(seiString.LIZIZ);
                    this.LIZ.LJJIJL = linkLayoutSei.LJ();
                }
            }
        }
        SeiDsl LJI5 = linkLayoutSei.LJI();
        if (LJI5 != null) {
            U8H u8h13 = this.LIZ;
            u8h13.LIZ.LJFF.LJJI(LJI5.scene, LJI5.version, new U9R(u8h13, this, linkLayoutSei));
        }
        this.LIZ.LJJIZ = String.valueOf(seiString.LIZIZ);
        this.LIZ.LJJIJL = linkLayoutSei.LJ();
    }
}
