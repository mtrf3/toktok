package Y;

import X.C10K;
import X.C131935Ft;
import X.C132205Gu;
import X.C150835vz;
import X.C151105wQ;
import X.C151285wi;
import X.C151385ws;
import X.C163186ao;
import X.C169696lJ;
import X.C1FP;
import X.C37203Eit;
import X.C39214FaE;
import X.C42299Git;
import X.C42307Gj1;
import X.C43882HKc;
import X.C44514HdW;
import X.C47261Igj;
import X.C5OO;
import X.C60903NvH;
import X.C62819Ol5;
import X.C67P;
import X.C68322mC;
import X.C6BK;
import X.C6DR;
import X.C6P9;
import X.C6PA;
import X.C6PB;
import X.C6PV;
import X.C6QO;
import X.C76732zl;
import X.C76800UCe;
import X.C82891Wg3;
import X.EnumC127484zQ;
import X.EnumC43649HBd;
import X.InterfaceC131065Ck;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.RunnableC151315wl;
import X.V16;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shoutouts.network.EditProductApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ACallableS80S0200000_2 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        int[] iArr = new int[10];
        long currentTimeMillis = System.currentTimeMillis();
        String str = ((MediaModel) aCallableS80S0200000_2.l0).fileLocalUriPath;
        o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
        int LJIJI = C62819Ol5.LJIJI(str, iArr);
        long currentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) (currentTimeMillis2 - currentTimeMillis));
        C43882HKc.LIZJ("ve_get_video_info_consume_monitor", jSONObject, new C6BK().LJ());
        if (LJIJI == 0) {
            MediaModel mediaModel = (MediaModel) aCallableS80S0200000_2.l0;
            mediaModel.width = iArr[0];
            mediaModel.height = iArr[1];
            ((C76732zl) aCallableS80S0200000_2.l1).element = iArr[8];
        }
        return Integer.valueOf(LJIJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$1(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        return Boolean.valueOf(C42307Gj1.LJ((Bitmap) ((C68322mC) aCallableS80S0200000_2.l0).element, new File(((VideoPublishEditModel) aCallableS80S0200000_2.l1).multiEditVideoRecordData.coverImagePath), 60, Bitmap.CompressFormat.PNG));
    }

    public static final Object call$10(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        String productId = ((C163186ao) aCallableS80S0200000_2.l0).LLJJ().getProductId();
        o.LJI(productId);
        String jSONObject = ((JSONObject) aCallableS80S0200000_2.l1).toString();
        o.LJIIIIZZ(jSONObject, "productJson.toString()");
        BaseResponse baseResponse = ((EditProductApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, EditProductApi.Api.class)).get(productId, jSONObject).execute().LIZIZ;
        o.LJIIIIZZ(baseResponse, "api.get(price, productId).execute().body()");
        return baseResponse;
    }

    public static final Object call$11(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        C6DR c6dr = (C6DR) aCallableS80S0200000_2.l0;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) aCallableS80S0200000_2.l1;
        c6dr.getClass();
        Iterator<Effect> it = effectChannelResponse.getAllCategoryEffects().iterator();
        while (it.hasNext()) {
            c6dr.LIZIZ.LIZLLL(it.next());
        }
        return null;
    }

    public static final Object call$12(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        C6PA c6pa = (C6PA) ((C6PV) aCallableS80S0200000_2.l0).LJIIJ.getValue();
        List<C6QO> stickers = ((C6PV) aCallableS80S0200000_2.l0).LJIIJJI;
        c6pa.getClass();
        o.LJIIIZ(stickers, "stickers");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) stickers).iterator();
        while (it.hasNext()) {
            C6QO c6qo = (C6QO) it.next();
            C10K LJIILLIIL = C10K.LIZIZ(new ACallableS105S0100000_2(c6qo.LJIILIIL(), 33), C10K.LJIIIIZZ, null).LJIILLIIL(new AgS107S0200000_2(c6pa, c6qo.LJIJJ(), 10), C10K.LJI);
            o.LJIIIIZZ(LJIILLIIL, "private fun getCompileSt…EXECUTOR,\n        )\n    }");
            arrayList.add(LJIILLIIL);
        }
        try {
            C10K.LJIJJ(arrayList).LJIJI();
        } catch (Exception unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C6P9) ((C10K) ListProtector.get(arrayList, i)).LJIIJJI()).LJLILLLLZI) {
                linkedHashMap.put(Integer.valueOf(((C6QO) ListProtector.get(stickers, i)).LJJLIIIJLJLI()), ((C6P9) ((C10K) ListProtector.get(arrayList, i)).LJIIJJI()).LJLIL);
            } else {
                linkedHashMap.put(Integer.valueOf(((C6QO) ListProtector.get(stickers, i)).LJJLIIIJLJLI()), "");
            }
        }
        ((InterfaceC88472Yns) aCallableS80S0200000_2.l1).invoke(linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        return Boolean.valueOf(C42307Gj1.LJ((Bitmap) aCallableS80S0200000_2.l0, new File(((VideoPublishEditModel) aCallableS80S0200000_2.l1).getVideoCoverPath()), 100, Bitmap.CompressFormat.PNG));
    }

    public static final Object call$14(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        int i;
        InterfaceC131065Ck interfaceC131065Ck = (InterfaceC131065Ck) aCallableS80S0200000_2.l0;
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.MAX_PIP_TRACK_COUNT;
        ((C1FP) aCallableS80S0200000_2.l1).getClass();
        if (!e1.LIZ(31744, "editor_pro_pip_tracks_limit_switch", true, true)) {
            i = 6;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pipTrackLimitCount = ");
            LIZ.append(C44514HdW.LIZIZ().countLimit);
            C131935Ft.LIZIZ("EditorProKVSettings", X1D.LIZIZ(LIZ));
            i = C44514HdW.LIZIZ().countLimit;
        }
        interfaceC131065Ck.LIZ(enumC127484zQ, Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        String videoCoverPath = ((VideoPublishEditModel) aCallableS80S0200000_2.l0).getVideoCoverPath();
        if (videoCoverPath != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS80S0200000_2.l0;
            Bitmap bitmap = (Bitmap) aCallableS80S0200000_2.l1;
            PublishPreviewModel publishPreviewModel = videoPublishEditModel.creativeModel.publishPreviewModel;
            publishPreviewModel.getClass();
            publishPreviewModel.firstFramePath = videoCoverPath;
            return Boolean.valueOf(C42307Gj1.LJ(bitmap, new File(videoCoverPath), 100, Bitmap.CompressFormat.PNG));
        }
        return null;
    }

    public static final Object call$3(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        C151285wi c151285wi = (C151285wi) aCallableS80S0200000_2.l0;
        return new RunnableC151315wl(c151285wi.LIZIZ, c151285wi.LIZJ, null, new C151385ws(false, (Boolean) aCallableS80S0200000_2.l1), null, null, 52).LIZIZ();
    }

    public static final Object call$4(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        C5OO c5oo = (C5OO) aCallableS80S0200000_2.l0;
        C132205Gu c132205Gu = (C132205Gu) aCallableS80S0200000_2.l1;
        String str = c132205Gu.LJLIL;
        String str2 = c132205Gu.LJLILLLLZI;
        c5oo.getClass();
        return C60903NvH.LJIIJJI().getAccountService().LJII(str, str2);
    }

    public static final Object call$5(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        EditorProScene editorProScene = (EditorProScene) aCallableS80S0200000_2.l0;
        C132205Gu c132205Gu = (C132205Gu) aCallableS80S0200000_2.l1;
        return editorProScene.queryUser(c132205Gu.LJLIL, c132205Gu.LJLILLLLZI);
    }

    public static final Object call$6(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        Bitmap bitmap;
        String str;
        Context requireSceneContext = ((ImageEditRootScene) aCallableS80S0200000_2.l0).requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) aCallableS80S0200000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            C150835vz c150835vz = new C150835vz(requireSceneContext, videoPublishEditModel, C151105wQ.LIZIZ, C151105wQ.LIZ);
            int i = 0;
            for (Object obj : (List) aCallableS80S0200000_2.l1) {
                int i2 = i + 1;
                if (i >= 0) {
                    StickerItemModel stickerModel = (StickerItemModel) obj;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    OSZ osz = new OSZ(Integer.valueOf(c150835vz.LIZJ), Integer.valueOf(c150835vz.LIZLLL));
                    int intValue = ((Number) osz.getFirst()).intValue();
                    int intValue2 = ((Number) osz.getSecond()).intValue();
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C6PB.LIZIZ(), stickerModel.extra, TextStickerData.class);
                    C67P c67p = new C67P(c150835vz.LIZ, null, textStickerData, false, null, Boolean.FALSE);
                    c67p.LJIIJJI(textStickerData);
                    VideoPublishEditModel videoPublishEditModel2 = c150835vz.LIZIZ;
                    EnumC43649HBd enumC43649HBd = EnumC43649HBd.TEXT_STICKER;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(i);
                    LIZ.append(".png");
                    File LJIIL = V16.LJIIL(videoPublishEditModel2, enumC43649HBd, X1D.LIZIZ(LIZ), true);
                    LJIIL.createNewFile();
                    try {
                        bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                        bitmap.setDensity(C82891Wg3.LIZ().getResources().getDisplayMetrics().densityDpi);
                        if (c67p.getDrawingCacheBackgroundColor() != 0) {
                            bitmap.eraseColor(c67p.getDrawingCacheBackgroundColor());
                        }
                        Canvas canvas = new Canvas(bitmap);
                        C37203Eit.LIZJ.getClass();
                        C39214FaE.LIZ(c67p, canvas);
                    } catch (OutOfMemoryError e) {
                        C82891Wg3.LIZLLL().LIZIZ(e);
                        bitmap = null;
                    }
                    if (C42299Git.LJFF(bitmap, LJIIL, 100, Bitmap.CompressFormat.PNG)) {
                        str = LJIIL.getPath();
                    } else {
                        C42299Git.LJ(bitmap);
                        str = null;
                    }
                    stickerModel.path = str;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("mModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        if (r0 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$7(Y.ACallableS80S0200000_2 r16) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS80S0200000_2.call$7(Y.ACallableS80S0200000_2):java.lang.Object");
    }

    public static final Object call$8(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        ((InterfaceC88472Yns) aCallableS80S0200000_2.l0).invoke((Effect) aCallableS80S0200000_2.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS80S0200000_2 aCallableS80S0200000_2) {
        ((InterfaceC88472Yns) aCallableS80S0200000_2.l0).invoke((Effect) aCallableS80S0200000_2.l1);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS80S0200000_2(android.graphics.Bitmap r2, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS80S0200000_2.<init>(android.graphics.Bitmap, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):void");
    }

    public ACallableS80S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
