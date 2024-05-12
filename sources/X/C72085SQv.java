package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.NearbyTag;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.tag.IPoiTagService;
import com.ss.android.ugc.aweme.poi.tag.NearbyPoiTagTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SQv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72085SQv implements IPoiTagService, InterfaceC64451PRf {
    public static final int LJLIL = 2;
    public static V1B LJLILLLLZI;

    public void LJFF(int i, long j, long j2) {
        throw null;
    }

    public void LJIILJJIL(C78983UzD c78983UzD) {
        throw null;
    }

    public void LJIILL(int i, long j, long j2) {
        throw null;
    }

    public void LJIILLIIL(C78983UzD c78983UzD, long j, long j2) {
        throw null;
    }

    public void LJIIZILJ(long j) {
        throw null;
    }

    public void LJJI(int i, long j, long j2) {
        throw null;
    }

    public void LJJIIJZLJL(C78983UzD c78983UzD) {
        throw null;
    }

    public void LJJIIZI(int i, long j, long j2) {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public VideoTagCategoryProtocol getPoiTagTrigger() {
        return new NearbyPoiTagTrigger();
    }

    public /* synthetic */ C72085SQv() {
    }

    public /* synthetic */ C72085SQv(int i) {
    }

    public static void LJ(InterfaceC65784Pro interfaceC65784Pro) {
        C195817mL.LIZ().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 104));
    }

    public static String LJJJJJL(AbstractC87141YHx abstractC87141YHx) {
        C1UD c1ud = new C1UD(abstractC87141YHx);
        StringBuilder sb = new StringBuilder(abstractC87141YHx.size());
        for (int i = 0; i < ((AbstractC87141YHx) c1ud.LIZ).size(); i++) {
            byte zzfi = ((AbstractC87141YHx) c1ud.LIZ).zzfi(i);
            if (zzfi != 34) {
                if (zzfi != 39) {
                    if (zzfi != 92) {
                        switch (zzfi) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                sb.append("\\r");
                                break;
                            default:
                                if (zzfi >= 32 && zzfi <= 126) {
                                    sb.append((char) zzfi);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zzfi >>> 6) & 3) + 48));
                                    sb.append((char) (((zzfi >>> 3) & 7) + 48));
                                    sb.append((char) ((zzfi & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public InterfaceC211228Qs getPoiTagView(Context context) {
        o.LJIIIZ(context, "context");
        return new C199837sp(context, null);
    }

    @Override // X.InterfaceC64451PRf
    public boolean LIZIZ(long j, long j2) {
        if (((float) (j2 - j)) / PH9.LIZ >= 3.0f) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public boolean isPoiTagShow(String str, Aweme aweme) {
        NearbyTag nearbyTag;
        String text;
        o.LJIIIZ(aweme, "aweme");
        if (!o.LJ(str, "homepage_nearby")) {
            return false;
        }
        C51556KLg.LIZ.getClass();
        if (C51556KLg.LIZ().shouldShowCustomFeedSingleAnchor(aweme) || C51556KLg.LIZ().shouldShowOldFeedSingleAnchor(aweme)) {
            return false;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it.next();
                if (next.getType() == EnumC42934Gt8.POI.getTYPE()) {
                    if (next != null) {
                        return false;
                    }
                }
            }
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct == null || (nearbyTag = poiDataStruct.getNearbyTag()) == null || (text = nearbyTag.getText()) == null || text.length() <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZJ(DataChannel dataChannel, Fragment fragment, C37 broadcastScene) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(broadcastScene, "broadcastScene");
        if (EffectParseOptSetting.enableOpt()) {
            C30686C2o c30686C2o = C30686C2o.LJLIL;
            String STICKER = C0TY.LIZIZ;
            o.LJIIIIZZ(STICKER, "STICKER");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), C78613UtF.LIZJ, null, new C54342Bi((StickerEffectViewModel) new ViewModelProvider(c30686C2o, new C38991fz(new C39011g1(STICKER), new C44821pO())).get(StickerEffectViewModel.class), dataChannel, broadcastScene, null), 2);
            return;
        }
        C30686C2o c30686C2o2 = C30686C2o.LJLIL;
        String STICKER2 = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER2, "STICKER");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C54352Bj((StickerEffectViewModel) new ViewModelProvider(c30686C2o2, new C38991fz(new C39011g1(STICKER2), new C44821pO())).get(StickerEffectViewModel.class), dataChannel, broadcastScene, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.poi.tag.IPoiTagService
    public void appendPoiTagParamsIfHave(String str, HashMap params, Aweme aweme) {
        String str2;
        NearbyTag nearbyTag;
        o.LJIIIZ(params, "params");
        if (aweme != null && isPoiTagShow(str, aweme)) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (nearbyTag = poiDataStruct.getNearbyTag()) == null || (str2 = nearbyTag.getText()) == null) {
                str2 = "";
            }
            params.put("region_label_text", str2);
        }
    }
}
