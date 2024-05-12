package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.U7c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76668U7c implements InterfaceC76734U9q {
    public final /* synthetic */ C76669U7d LIZ;

    @Override // X.InterfaceC76734U9q
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
    }

    public C76668U7c(C76669U7d c76669U7d) {
        this.LIZ = c76669U7d;
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
        boolean z;
        Long l;
        U7T u7t = this.LIZ.LJ;
        boolean z2 = false;
        if (u7t != null && u7t.LJFF == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (u7t != null) {
                l = Long.valueOf(u7t.LLZL().getUserId());
            } else {
                l = null;
            }
            long LJIILLIIL = this.LIZ.LJIILLIIL();
            if (l != null && l.longValue() == LJIILLIIL) {
                z2 = true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFirstFrameRender in position manager isRoomOwner：");
            LIZ.append(z2);
            U4R.LIZ("MicPositionManager", X1D.LIZIZ(LIZ));
            this.LIZ.LJJIJ("onFirstFrameRender");
            return;
        }
        if (u7t == null || u7t.LJFF != 2) {
            return;
        }
        UC7.LJ("onFirstRemoteAudio in position manager linkMicId = ", str, "MicPositionManager");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
        U7T u7t = this.LIZ.LJ;
        boolean z = false;
        if (u7t != null) {
            if (u7t.LJFF == 4) {
                Long valueOf = Long.valueOf(u7t.LLZL().getUserId());
                long LJIILLIIL = this.LIZ.LJIILLIIL();
                if (valueOf != null && valueOf.longValue() == LJIILLIIL) {
                    z = true;
                }
                String LJIIZILJ = C76669U7d.LJIIZILJ(332);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onFirstFrameRender in position manager isRoomOwner：");
                LIZ.append(z);
                C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ));
                this.LIZ.LJJIJ("onFirstFrameRender");
                return;
            }
            if (u7t.LJFF != 2) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteVideoFrameRender in position manager linkMicId = ");
            LIZ2.append(str);
            C32014ChO.LJFF("MicPositionManager", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
        ArrayList<LinkLayerRTCMessageUser> arrayList;
        Long l;
        boolean z;
        Integer num;
        OnLineMicInfo onLineMicInfo;
        int i;
        int i2;
        MicPositionInfo micPositionData;
        C32014ChO.LIZ(C76669U7d.LJIIZILJ(311), "onRtcRoomMsgReceived in position manager");
        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) U7V.LJIILLIIL(LinkLayerRTCMessage.class, str2);
        if (linkLayerRTCMessage != null) {
            C76669U7d c76669U7d = this.LIZ;
            String LJIIZILJ = C76669U7d.LJIIZILJ(313);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRtcRoomMsgReceived cur method, ");
            LIZ.append(linkLayerRTCMessage.getMethod());
            C32014ChO.LIZ(LJIIZILJ, X1D.LIZIZ(LIZ));
            if (o.LJ(linkLayerRTCMessage.getMethod(), "linkMicLayerFloatPosition")) {
                LinkLayerRTCMessageParam param = linkLayerRTCMessage.getParam();
                if (param != null) {
                    arrayList = param.getUsers();
                } else {
                    arrayList = null;
                }
                U7T u7t = c76669U7d.LJ;
                if (u7t != null) {
                    l = Long.valueOf(u7t.LLZL().getUserId());
                } else {
                    l = null;
                }
                long LJIILLIIL = c76669U7d.LJIILLIIL();
                if (l == null || l.longValue() != LJIILLIIL) {
                    z = false;
                } else {
                    z = true;
                }
                StringBuilder LJI = JBR.LJI("updateAllFixedAndFloatPositionByRtcMessage, isRoomOwner: ", z, " user size: ");
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                QZY.LIZJ(LJI, num, LJI, "MicPositionManager");
                if (z) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (arrayList != null) {
                    Iterator<LinkLayerRTCMessageUser> it = arrayList.iterator();
                    int i3 = -1;
                    while (it.hasNext()) {
                        LinkLayerRTCMessageUser next = it.next();
                        OSZ osz = (OSZ) ORZ.LJLLLL(C5UN.LJJLJLI(c76669U7d.LJIIIIZZ));
                        if (osz != null) {
                            onLineMicInfo = (OnLineMicInfo) osz.getSecond();
                        } else {
                            onLineMicInfo = null;
                        }
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        if (onLineMicInfo != null) {
                            i = onLineMicInfo.getOnLinePattern();
                        } else {
                            i = 1;
                        }
                        builder.setOnLinePattern(i);
                        if (onLineMicInfo != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
                            i2 = micPositionData.getStrategy();
                        } else {
                            i2 = 1;
                        }
                        builder.setMicPositionData(new MicPositionInfo(i2, next.getPosition(), 0, 0L, 12, null));
                        OnLineMicInfo build = builder.build();
                        OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                        builder2.setOnLinePattern(1);
                        i3++;
                        builder2.setMicPositionData(new MicPositionInfo(0, i3, 0, 0L, 12, null));
                        OnLineMicInfo build2 = builder2.build();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("updateAllFixedAndFloatPositionByRtcMessage, linkMicId ");
                        LIZ2.append(next.getLinkMicId());
                        LIZ2.append(", fixedPosition:");
                        LIZ2.append(build);
                        LIZ2.append(", floatPosition: ");
                        LIZ2.append(build2);
                        C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ2));
                        linkedHashMap.put(next.getLinkMicId(), build);
                        linkedHashMap2.put(next.getLinkMicId(), build2);
                    }
                }
                c76669U7d.LJJIFFI(linkedHashMap);
                c76669U7d.LJJIII(linkedHashMap2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("updateAllFixedAndFloatPositionByRtcMessage, mFloatPositionMap=");
                LIZ3.append(c76669U7d.LJIIIZ);
                C0NB.LIZIZ("MicPositionManager", X1D.LIZIZ(LIZ3));
            }
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcUserLeft in position manager left user: ");
        LIZ.append(str);
        U4R.LIZ("MicPositionManager", X1D.LIZIZ(LIZ));
        U7T u7t = this.LIZ.LJ;
        if (u7t != null && u7t.LJFF == 4) {
            if (!C76726U9i.LIZ(str)) {
                this.LIZ.LJIJJ(str);
                this.LIZ.LJJ(str);
            }
            this.LIZ.LJJIJ("onRtcUserLeft");
        }
    }
}
