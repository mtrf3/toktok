package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Insets;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestWatermarkBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSeiEnabledBusinessIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMuteAudioSeiSetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.AqS9S0600000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U8O extends LiveStreamMixer {
    public final C76665U6z LIZ;
    public final C76703U8l LIZIZ;
    public final U9E LIZJ;
    public final U8P LIZLLL;
    public final U92 LJ;
    public final U8Q LJFF;
    public final OnLineMicInfo LJI;
    public final InterfaceC65784Pro<Long> LJII;
    public final InterfaceC65784Pro<List<String>> LJIIIIZZ;
    public final InterfaceC65784Pro<Float> LJIIIZ;
    public final InterfaceC65784Pro<Long> LJIIJ;
    public final InterfaceC65784Pro<Integer> LJIIJJI;
    public final InterfaceC88472Yns<String, C76800UCe> LJIIL;
    public final HashMap<String, java.util.Map<String, String>> LJIILIIL;
    public final HashMap<String, java.util.Map<String, String>> LJIILJJIL;
    public final HashMap<String, java.util.Map<String, JSONObject>> LJIILL;
    public long LJIILLIIL;
    public Bitmap LJIIZILJ;

    @Override // com.ss.avframework.livestreamv2.core.interact.Client.StreamMixer
    public final boolean updateMixAudioVolumeIndication(Client.RTCAudioVolumeIndication p0) {
        o.LJIIIZ(p0, "p0");
        return false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client.StreamMixer
    public final boolean updateMixSpatialAudio(Client.RTCSpatialAudioPosition rTCSpatialAudioPosition, Client.RTCSpatialAudioHumanOrientation p1) {
        o.LJIIIZ(p1, "p1");
        return false;
    }

    public static C76710U8s LIZ(int i, RectF rectF, java.util.Map map) {
        if (((LayoutArray) map.get(String.valueOf(i + 1))) == null) {
            return null;
        }
        return new C76710U8s((rectF.width() * r3.getLeft()) + rectF.left, (rectF.height() * r3.getTop()) + rectF.top, rectF.width() * r3.getWidth(), rectF.height() * r3.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout] */
    /* JADX WARN: Type inference failed for: r2v46, types: [T, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    @Override // com.ss.avframework.livestreamv2.core.interact.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        LinkedHashMap linkedHashMap;
        InterfaceC75807Tp5 mPlayerInfoProvider;
        InterfaceC75807Tp5 mPlayerInfoProvider2;
        int i3;
        Region region;
        String str;
        boolean z;
        MicPositionInfo micPositionData;
        java.util.Map<String, LayoutArray> map;
        MicPositionInfo micPositionInfo;
        int position;
        Integer num;
        float f;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(list, "list");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = this.LIZIZ.LIZJ(false);
        if (this.LIZJ.LIZ()) {
            Layout layout = this.LIZJ.LJ;
            ?? r2 = layout;
            if (layout == null) {
                r2 = this.LIZIZ.LIZJ(false);
            }
            c68322mC.element = r2;
            if (r2 != 0) {
                Layout LIZJ = this.LIZIZ.LIZJ(false);
                if (LIZJ != null) {
                    i5 = LIZJ.getVersion();
                } else {
                    i5 = 0;
                }
                r2.setVersion(i5);
            }
            Layout layout2 = (Layout) c68322mC.element;
            if (layout2 != null) {
                Layout LIZJ2 = this.LIZIZ.LIZJ(false);
                if (LIZJ2 != null) {
                    i6 = LIZJ2.getScene();
                } else {
                    i6 = 0;
                }
                layout2.setScene(i6);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.LIZ.LJFF.LJIJJ(linkedHashMap2);
        String str2 = null;
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isDisableAll()) {
            linkedHashMap = new LinkedHashMap();
            synchronized (this.LJIILJJIL) {
                linkedHashMap.putAll(this.LJIILJJIL);
            }
            synchronized (this.LJIILIIL) {
                linkedHashMap.putAll(this.LJIILIIL);
                this.LJIILIIL.clear();
            }
        } else {
            linkedHashMap = null;
        }
        T t = c68322mC.element;
        if (t == 0 || ((Layout) t).isNormalType()) {
            this.LJIIL.invoke("mixStream normalType");
            String jSONObject = C75806Tp4.LIZIZ(getMConfig(), list, i, i2, C113554cx.LJJJLIIL(), (Layout) c68322mC.element, this.LIZIZ.LJIIIIZZ(), linkedHashMap2, null, getMPlayerInfoProvider(), linkedHashMap, null, -1.0f, -1L, -1, this.LJIILL).toString();
            o.LJIIIIZZ(jSONObject, "createSeiJson(\n         …\n            ).toString()");
            return jSONObject;
        }
        Insets viewForCanvas = ((Layout) c68322mC.element).getViewForCanvas();
        java.util.Map<String, OnLineMicInfo> LJI = this.LIZLLL.LJI();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, OnLineMicInfo> entry : LJI.entrySet()) {
            String key = entry.getKey();
            MicPositionInfo micPositionData2 = entry.getValue().getMicPositionData();
            if (micPositionData2 != null) {
                i4 = micPositionData2.getPosition();
            } else {
                i4 = -1;
            }
            linkedHashMap3.put(key, Integer.valueOf(i4));
        }
        String str3 = "";
        if (!list.isEmpty()) {
            str3 = ((Region) ListProtector.get(list, 0)).getInteractId();
            o.LJIIIIZZ(str3, "list[0].interactId");
            InterfaceC75807Tp5 mPlayerInfoProvider3 = getMPlayerInfoProvider();
            Layout LIZ = this.LIZLLL.LIZ();
            if (LIZ != null) {
                LayoutArrayList layoutMaskConfigListByOnlineMicCount = LIZ.getLayoutMaskConfigListByOnlineMicCount(this.LJ.LJIIIIZZ());
                if (layoutMaskConfigListByOnlineMicCount != null) {
                    map = layoutMaskConfigListByOnlineMicCount.getIndexLayoutArrayMap();
                } else {
                    map = null;
                }
                if (map == null) {
                    InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJIIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("convertRegion return can't find arraymap which size is ");
                    LIZ2.append(this.LJ.LJIIIIZZ());
                    interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ2));
                } else {
                    new ArrayList();
                    if (list.size() == 1 && !this.LIZLLL.LJII()) {
                        Region region2 = (Region) ListProtector.get(list, 0);
                        region2.size(1.0d, 1.0d);
                        region2.position(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    } else {
                        this.LIZLLL.getClass();
                        RectF LIZIZ = U8P.LIZIZ(i / i2, viewForCanvas);
                        for (Region region3 : list) {
                            U8M u8m = this.LIZ.LJFF;
                            String interactId = region3.getInteractId();
                            o.LJIIIIZZ(interactId, "region.interactId");
                            region3.muteAudio(u8m.LJJIJIIJI(interactId));
                            U8P u8p = this.LIZLLL;
                            String interactId2 = region3.getInteractId();
                            o.LJIIIIZZ(interactId2, "region.interactId");
                            OnLineMicInfo LJ = u8p.LJ(interactId2);
                            if (LJ != null) {
                                micPositionInfo = LJ.getMicPositionData();
                            } else {
                                micPositionInfo = null;
                            }
                            if (this.LIZJ.LIZ()) {
                                if (micPositionInfo != null) {
                                    position = micPositionInfo.getUiPos();
                                    num = Integer.valueOf(position);
                                }
                                num = null;
                            } else {
                                if (micPositionInfo != null) {
                                    position = micPositionInfo.getPosition();
                                    num = Integer.valueOf(position);
                                }
                                num = null;
                            }
                            if (micPositionInfo == null || num == null) {
                                java.util.Map<String, OnLineMicInfo> LJI2 = this.LIZLLL.LJI();
                                if (this.LJIILLIIL == 0 || System.currentTimeMillis() - this.LJIILLIIL >= 10000) {
                                    StringBuilder sb = new StringBuilder();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (Region region4 : list) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(region4.getInteractId());
                                        LIZ3.append("; ");
                                        sb.append(X1D.LIZIZ(LIZ3));
                                    }
                                    for (String str4 : LJI2.keySet()) {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append(str4);
                                        LIZ4.append("; ");
                                        sb2.append(X1D.LIZIZ(LIZ4));
                                    }
                                    C76175Tv1 c76175Tv1 = C76175Tv1.LIZ;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("regionList", sb.toString());
                                    hashMap.put("positionMap", sb2.toString());
                                    c76175Tv1.LIZ(40009, "sei user unfound when mix stream", hashMap);
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("regionList: ");
                                    LIZ5.append((Object) sb);
                                    LIZ5.append("  positionMap: ");
                                    LIZ5.append((Object) sb2);
                                    C0NB.LIZIZ("InternalLiveStreamMixer", X1D.LIZIZ(LIZ5));
                                    this.LJIILLIIL = System.currentTimeMillis();
                                }
                            }
                            if (num == null && list.size() == 1) {
                                Long invoke = this.LJII.invoke();
                                if (invoke != null) {
                                    region3.userId(invoke.longValue());
                                }
                                MicPositionInfo micPositionData3 = this.LJI.getMicPositionData();
                                if (micPositionData3 != null) {
                                    LIZIZ(map, micPositionData3.getPosition(), region3, LIZIZ, mPlayerInfoProvider3, 0.0f);
                                }
                            } else if (num != null && num.intValue() != -1) {
                                int intValue = num.intValue();
                                if (viewForCanvas.lessThanRatioAlign() == 256) {
                                    f = viewForCanvas.getStreamOffset();
                                } else {
                                    f = 0.0f;
                                }
                                LIZIZ(map, intValue, region3, LIZIZ, mPlayerInfoProvider3, f);
                            } else {
                                region3.size(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                            }
                        }
                    }
                }
            }
        }
        for (Region region5 : list) {
            if (!linkedHashMap3.containsKey(region5.getInteractId())) {
                region5.writeToSei(false);
            }
        }
        if (this.LIZ.LIZIZ == 4 && (mPlayerInfoProvider2 = getMPlayerInfoProvider()) != null) {
            U8Q u8q = this.LJFF;
            Layout layout3 = (Layout) c68322mC.element;
            Bitmap bitmap = this.LJIIZILJ;
            U8V u8v = new U8V(c68322mC, this, viewForCanvas, i, i2);
            u8q.getClass();
            o.LJIIIZ(layout3, "layout");
            if (LinkMicMultiGuestWatermarkBugfixSetting.INSTANCE.getValue()) {
                C29306Beo.LJJJ(new AqS9S0600000_13(u8q, mPlayerInfoProvider2, list, bitmap, layout3, u8v, 0));
            } else if (!u8q.LIZ(mPlayerInfoProvider2, list) || !o.LJ(u8q.LJFF, bitmap)) {
                u8q.LIZIZ.clear();
                u8q.LIZIZ.addAll(list);
                u8q.LIZJ = mPlayerInfoProvider2;
                u8q.LIZ.LJFF.removeAllWaterMarks();
                u8q.LJFF = bitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    C0NB.LIZIZ("def_mask", "WaterMarkController_apply bg bitmap");
                    U8M u8m2 = u8q.LIZ.LJFF;
                    Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
                    rTCWaterMarkRegion.setX(0.0f);
                    rTCWaterMarkRegion.setY(0.0f);
                    rTCWaterMarkRegion.setW(1.0f);
                    rTCWaterMarkRegion.setH(1.0f);
                    rTCWaterMarkRegion.setImage(bitmap);
                    rTCWaterMarkRegion.setRenderMode(Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_HIDDEN);
                    rTCWaterMarkRegion.setZorder(0);
                    u8m2.LJJIZ("mask_bg", rTCWaterMarkRegion);
                    u8q.LIZ.LJFF.LJJIL();
                }
                if (layout3.isFixedType() && bitmap == null) {
                    ArrayList arrayList = new ArrayList(layout3.getMicCount());
                    ArrayList arrayList2 = new ArrayList();
                    int micCount = layout3.getMicCount();
                    if (micCount >= 0) {
                        int i7 = 0;
                        boolean z2 = false;
                        while (true) {
                            Iterator<? extends Region> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    region = it.next();
                                    U8M u8m3 = u8q.LIZ.LJFF;
                                    String interactId3 = region.getInteractId();
                                    o.LJIIIIZZ(interactId3, "region.interactId");
                                    OnLineMicInfo LJII = u8m3.LJII(interactId3);
                                    if (LJII != null && (micPositionData = LJII.getMicPositionData()) != null && micPositionData.getPosition() == i7) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        break;
                                    }
                                } else {
                                    region = null;
                                    break;
                                }
                            }
                            if (z2 || region != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            java.util.Map<String, Resolution> resolutionMap = layout3.getResolutionMap();
                            LayoutArray layoutByPosAndSize = layout3.getLayoutByPosAndSize(i7, u8q.LIZ.LJFF.LJIIIIZZ());
                            if (layoutByPosAndSize != null) {
                                str = layoutByPosAndSize.getReso_id();
                            } else {
                                str = null;
                            }
                            Resolution resolution = resolutionMap.get(str);
                            if (region == null && resolution != null) {
                                OSZ<Integer, Integer> h5 = mPlayerInfoProvider2.h5(resolution);
                                if (!arrayList.contains(Long.valueOf(h5.getSecond().longValue() * h5.getFirst().intValue()))) {
                                    arrayList.add(Long.valueOf(h5.getSecond().longValue() * h5.getFirst().intValue()));
                                    arrayList2.add(u8q.LIZLLL(h5.getFirst().intValue(), h5.getSecond().intValue()));
                                }
                            }
                            if (i7 == micCount) {
                                break;
                            }
                            i7++;
                        }
                    }
                    i3 = 0;
                    AbstractC73672Svk.LJJLJ(arrayList2, UCI.LJLILLLLZI).LJJJJZI(new U8S(layout3, list, u8q, u8v, mPlayerInfoProvider2));
                } else {
                    i3 = 0;
                }
                for (Region region6 : list) {
                    int i8 = i3 + 1;
                    if (i3 >= 0) {
                        Region region7 = region6;
                        String interactId4 = region7.getInteractId();
                        o.LJIIIIZZ(interactId4, "region.interactId");
                        if (mPlayerInfoProvider2.e5(i3, interactId4)) {
                            String interactId5 = region7.getInteractId();
                            o.LJIIIIZZ(interactId5, "region.interactId");
                            ImageModel j5 = mPlayerInfoProvider2.j5(interactId5);
                            RectF g5 = mPlayerInfoProvider2.g5(region7);
                            if (g5 == null) {
                                g5 = U8Q.LJ(region7);
                            }
                            if (j5 != null) {
                                ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(j5, new C31609Car(j5.width, j5.height, new AqS117S0300000_13(u8q, g5, mPlayerInfoProvider2, 19)));
                            } else {
                                String interactId6 = region7.getInteractId();
                                o.LJIIIIZZ(interactId6, "region.interactId");
                                mPlayerInfoProvider2.b5(i3, interactId6, new AqS58S0400000_13(u8q, region7, g5, mPlayerInfoProvider2, 10));
                            }
                        }
                        i3 = i8;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        if (this.LIZ.LIZIZ == 4 && (mPlayerInfoProvider = getMPlayerInfoProvider()) != null) {
            for (Region region8 : list) {
                Layout layout4 = (Layout) c68322mC.element;
                String interactId7 = region8.getInteractId();
                o.LJIIIIZZ(interactId7, "region.interactId");
                double d5 = mPlayerInfoProvider.d5(layout4, interactId7);
                double LIZ6 = C15380j0.LIZ(i);
                double d = LIZ6 / 2.0d;
                double LIZ7 = C15380j0.LIZ(i2) / 2.0d;
                if (d5 < Math.min(d, LIZ7)) {
                    region8.setCornerRadius(d5 / LIZ6);
                } else {
                    region8.setCornerRadius(Math.min(d, LIZ7) / LIZ6);
                }
            }
        }
        InterfaceC75807Tp5 mPlayerInfoProvider4 = getMPlayerInfoProvider();
        if (mPlayerInfoProvider4 != null) {
            JSONObject c5 = mPlayerInfoProvider4.c5(getMConfig(), list, i, i2, linkedHashMap3, (Layout) c68322mC.element, this.LIZIZ.LJIIIIZZ(), linkedHashMap2, str3, getMPlayerInfoProvider(), linkedHashMap, this.LJIIIIZZ.invoke(), this.LJIIIZ.invoke().floatValue(), this.LJIIJ.invoke().longValue(), this.LJIIJJI.invoke().intValue(), this.LJIILL);
            if (c5 != null) {
                str2 = c5.toString();
            }
        }
        if (str2 == null) {
            String jSONObject2 = C75806Tp4.LIZIZ(getMConfig(), list, i, i2, linkedHashMap3, (Layout) c68322mC.element, this.LIZIZ.LJIIIIZZ(), linkedHashMap2, str3, getMPlayerInfoProvider(), linkedHashMap, this.LJIIIIZZ.invoke(), this.LJIIIZ.invoke().floatValue(), this.LJIIJ.invoke().longValue(), this.LJIIJJI.invoke().intValue(), this.LJIILL).toString();
            o.LJIIIIZZ(jSONObject2, "createSeiJson(\n         …ueue\n        ).toString()");
            return jSONObject2;
        }
        return str2;
    }

    public final void LIZIZ(java.util.Map<String, LayoutArray> map, int i, Region region, RectF rectF, InterfaceC75807Tp5 interfaceC75807Tp5, float f) {
        C76710U8s LIZ = LIZ(i, rectF, map);
        if (LIZ == null) {
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJIIL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("linkMicId = ");
            LIZ2.append(region.getInteractId());
            LIZ2.append(" isNotInMic");
            interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ2));
            return;
        }
        region.size(LIZ.LIZJ, LIZ.LIZLLL);
        region.position(LIZ.LIZ, LIZ.LIZIZ + f);
        if (this.LIZ.LIZIZ == 4) {
            if (interfaceC75807Tp5 != null) {
                String str = "";
                if (MultiGuestMuteAudioSeiSetting.INSTANCE.isMuteAudioFalse()) {
                    region.muteAudio(false);
                } else {
                    String interactId = region.getInteractId();
                    if (interactId == null) {
                        interactId = "";
                    }
                    region.muteAudio(interfaceC75807Tp5.a5(interactId));
                }
                if (i == 0) {
                    region.zOrder(0);
                    String interactId2 = region.getInteractId();
                    o.LJIIIIZZ(interactId2, "region.interactId");
                    region.muteVideo(interfaceC75807Tp5.e5(i, interactId2));
                } else {
                    region.zOrder(1);
                    String interactId3 = region.getInteractId();
                    if (interactId3 != null) {
                        str = interactId3;
                    }
                    region.muteVideo(interfaceC75807Tp5.p5(str));
                }
            }
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LJIIL;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("convertRegion actualSize = {");
            LIZ3.append(region.getWidth());
            LIZ3.append(", ");
            LIZ3.append(region.getHeight());
            LIZ3.append("} pos = {");
            LIZ3.append(region.getX());
            LIZ3.append(", ");
            LIZ3.append(region.getY());
            LIZ3.append("} ");
            interfaceC88472Yns2.invoke(X1D.LIZIZ(LIZ3));
        }
        if (((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(this.LIZ.LIZJ))) {
            region.muteAudio(true);
        }
    }

    public U8O(C76665U6z config, C76703U8l dataCenter, U9E mappingHelper, U8P micHelper, U92 micPositionManager, U8Q waterMarkController, OnLineMicInfo selfMicInfo, AqS163S0100000_13 aqS163S0100000_13, AqS163S0100000_13 aqS163S0100000_132, AqS163S0100000_13 aqS163S0100000_133, AqS163S0100000_13 aqS163S0100000_134, AqS163S0100000_13 aqS163S0100000_135, AqS179S0100000_13 aqS179S0100000_13, HashMap businessMixStreamTaskQueue, HashMap businessMixStreamPermanentTaskQueue, HashMap businessMixStreamPermanentRegionTaskQueue) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(dataCenter, "dataCenter");
        o.LJIIIZ(mappingHelper, "mappingHelper");
        o.LJIIIZ(micHelper, "micHelper");
        o.LJIIIZ(micPositionManager, "micPositionManager");
        o.LJIIIZ(waterMarkController, "waterMarkController");
        o.LJIIIZ(selfMicInfo, "selfMicInfo");
        o.LJIIIZ(businessMixStreamTaskQueue, "businessMixStreamTaskQueue");
        o.LJIIIZ(businessMixStreamPermanentTaskQueue, "businessMixStreamPermanentTaskQueue");
        o.LJIIIZ(businessMixStreamPermanentRegionTaskQueue, "businessMixStreamPermanentRegionTaskQueue");
        this.LIZ = config;
        this.LIZIZ = dataCenter;
        this.LIZJ = mappingHelper;
        this.LIZLLL = micHelper;
        this.LJ = micPositionManager;
        this.LJFF = waterMarkController;
        this.LJI = selfMicInfo;
        this.LJII = aqS163S0100000_13;
        this.LJIIIIZZ = aqS163S0100000_132;
        this.LJIIIZ = aqS163S0100000_133;
        this.LJIIJ = aqS163S0100000_134;
        this.LJIIJJI = aqS163S0100000_135;
        this.LJIIL = aqS179S0100000_13;
        this.LJIILIIL = businessMixStreamTaskQueue;
        this.LJIILJJIL = businessMixStreamPermanentTaskQueue;
        this.LJIILL = businessMixStreamPermanentRegionTaskQueue;
    }
}
