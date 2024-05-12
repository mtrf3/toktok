package X;

import Y.IDComparatorS30S0000000_2;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.TemplateResponseItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.UlikeMergedTemplateStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.17J, reason: invalid class name */
/* loaded from: classes.dex */
public class C17J implements InterfaceC40570Fw6, C0Y3, InterfaceC29074Bb4 {
    public static Method LJLIL;
    public static boolean LJLILLLLZI;
    public static Field LJLJI;
    public static boolean LJLJJI;
    public static InterfaceC68803QzP LJLJJLL;
    public static final C17J LJLJJL = new C17J();
    public static final C17J LJLJL = new C17J();

    public /* synthetic */ C17J(int i) {
    }

    @Override // X.C0Y3
    public List LIZJ() {
        return null;
    }

    @Override // X.C0Y3
    public List LJFF() {
        return null;
    }

    @Override // X.C0Y3
    public boolean LJI(C38531fF c38531fF) {
        return false;
    }

    @Override // X.C0Y3
    public void LJII(C38531fF c38531fF) {
    }

    @Override // X.C0Y3
    public void LJIIIIZZ(C38531fF c38531fF) {
    }

    @Override // X.C0Y3
    public void LJIIIZ() {
    }

    @Override // X.C0Y3
    public List LJIIJ(List list) {
        return null;
    }

    public void LJIJI(Bundle bundle, String str) {
    }

    public Bundle LJIJJ(Bundle bundle, String str) {
        return null;
    }

    public void LJJJI(Bundle bundle) {
    }

    public void LJJJIL(int i, Bundle bundle) {
        throw null;
    }

    public void LJJJJ(Bundle bundle, String str) {
    }

    public void LJJJJI(int i, android.net.Uri uri, boolean z, Bundle bundle) {
    }

    @Override // X.InterfaceC40570Fw6
    public void onFailure(Exception exc) {
    }

    @Override // X.C0Y3
    public void release() {
    }

    public static final void LJJIIZ() {
        long LIZIZ = C23520w8.LIZIZ(0L);
        if (C23540wA.LIZ(LIZIZ, 4294967296L)) {
            return;
        }
        C23540wA.LIZ(LIZIZ, 8589934592L);
    }

    public static final boolean LJJJJZ() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C17J() {
    }

    public static C07070Pn LIZIZ(float f) {
        return new C07070Pn(Float.valueOf(f), C0QD.LIZ, Float.valueOf(0.01f));
    }

    public static final int LJIILL(C1M2 element) {
        int i;
        o.LJIIIZ(element, "element");
        if (element instanceof InterfaceC44951pb) {
            i = 3;
        } else {
            i = 1;
        }
        if (element instanceof InterfaceC536328p) {
            i |= 512;
        }
        if (element instanceof InterfaceC42201lA) {
            i |= 4;
        }
        if (element instanceof InterfaceC41461jy) {
            i |= 8;
        }
        if (element instanceof InterfaceC44261oU) {
            i |= 16;
        }
        if ((element instanceof InterfaceC39641h2) || (element instanceof InterfaceC39651h3) || (element instanceof InterfaceC42261lG)) {
            i |= 32;
        }
        if (element instanceof InterfaceC44901pW) {
            i |= 256;
        }
        if (element instanceof InterfaceC44931pZ) {
            i |= 64;
        }
        if ((element instanceof InterfaceC44911pX) || (element instanceof InterfaceC44921pY) || (element instanceof C44841pQ)) {
            return i | 128;
        }
        return i;
    }

    public static final boolean LJJI(int i) {
        if ((i & 128) != 0) {
            return true;
        }
        return false;
    }

    public static final int LJJII(InfoStickerModel infoStickerModel) {
        int i = 0;
        if (infoStickerModel == null) {
            return 0;
        }
        List<StickerItemModel> list = infoStickerModel.stickers;
        if (list != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                int i2 = it.next().type;
                if (i2 != 8 && i2 != 4 && i2 != 7 && i2 != 9 && i2 != 19 && i2 != 2) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final List LJJIII(NLEModel getNormalEffectTrackList) {
        o.LJIIIZ(getNormalEffectTrackList, "$this$getNormalEffectTrackList");
        VecNLETrackSPtr tracks = getNormalEffectTrackList.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (it2.getEnable() && o.LJ(C77357UXp.LJIILLIIL(it2), "NORMAL")) {
                arrayList.add(next);
            }
        }
        return ORZ.LLILII(new IDComparatorS30S0000000_2(12), arrayList);
    }

    public static final List LJJIIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (o.LJ(C77357UXp.LJIL(it2), EnumC121854qL.VIDEO.name()) || o.LJ(C77357UXp.LJIL(it2), EnumC121854qL.AUDIO.name())) {
                LIZ.add(next);
            }
        }
        return LIZ;
    }

    public static final RoundRectShape LJJIIJZLJL(float f) {
        return new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null);
    }

    public static final NLETrack LJJIJIIJI(NLEModel nLEModel) {
        Object obj;
        Object obj2;
        Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
        while (true) {
            obj = null;
            if (LIZJ.hasNext()) {
                obj2 = LIZJ.next();
                NLETrack it = (NLETrack) obj2;
                o.LJIIIIZZ(it, "it");
                if (it.getEnable() && o.LJ(C77357UXp.LJIL(it), EnumC121854qL.VIDEO.name())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj2;
        if (nLETrack != null) {
            return nLETrack;
        }
        Iterator LIZJ2 = t1.LIZJ(nLEModel, "tracks");
        while (true) {
            if (!LIZJ2.hasNext()) {
                break;
            }
            Object next = LIZJ2.next();
            NLETrack it2 = (NLETrack) next;
            o.LJIIIIZZ(it2, "it");
            if (it2.getEnable() && o.LJ(C77357UXp.LJIILLIIL(it2), "TIME")) {
                obj = next;
                break;
            }
        }
        return (NLETrack) obj;
    }

    public static final int LJJIJIIJIL(NLETrackSlot getTimeEffectUiEnd) {
        o.LJIIIZ(getTimeEffectUiEnd, "$this$getTimeEffectUiEnd");
        String extra = getTimeEffectUiEnd.LJI().getExtra("nleUIEndTime");
        o.LJIIIIZZ(extra, "mainSegment.getExtra(Nor…tFetcher.NLE_UI_END_TIME)");
        return CastIntegerProtector.parseInt(extra);
    }

    public static final boolean LJJIJL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        if (tracks.isEmpty()) {
            return false;
        }
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (it2.getEnable() && o.LJ(C77357UXp.LJIL(it2), EnumC121854qL.VIDEO.name())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJLIJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot != null && NLESegmentTimeEffect.LIZLLL(nLETrackSlot.LJI()) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r1) {
        /*
            if (r1 == 0) goto L30
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r1.LJIIIIZZ()
            if (r0 == 0) goto L10
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.LJI()
            if (r0 != 0) goto L2e
            if (r1 == 0) goto L30
        L10:
            com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr r0 = r1.LJ()
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.bytedance.ies.nle.editor_jni.NLEFilter r0 = (com.bytedance.ies.nle.editor_jni.NLEFilter) r0
            if (r0 == 0) goto L24
            com.bytedance.ies.nle.editor_jni.NLESegmentFilter r0 = r0.LIZIZ()
            if (r0 != 0) goto L2e
            if (r1 == 0) goto L30
        L24:
            com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr r0 = r1.LJIIJ()
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            if (r0 == 0) goto L30
        L2e:
            r0 = 1
        L2f:
            return r0
        L30:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17J.LJJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot):boolean");
    }

    public static final void LJJIZ(ActivityC45651qj activityC45651qj) {
        String str;
        int i;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        if (activityC45651qj != null) {
            ISearchContextAbility LJJJJJL = C17N.LJJJJJL(activityC45651qj);
            if (LJJJJJL != null && (If = LJJJJJL.If()) != null && (LIZJ = If.LIZJ()) != null) {
                C50652JuK.Companion.getClass();
                TMC.LJIIJ(C50651JuJ.LJIIJ(activityC45651qj), LIZJ, "SurveyExtension 59");
            }
            C50652JuK.Companion.getClass();
            C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(activityC45651qj);
            C51529KKf c51529KKf = new C51529KKf();
            String str2 = null;
            if (LJIIJJI != null) {
                str = LJIIJJI.getSearchId();
            } else {
                str = null;
            }
            c51529KKf.LJIIZILJ("search_id", str);
            int i2 = -1;
            if (LJIIJJI != null) {
                i = LJIIJJI.getTabIndex();
            } else {
                i = -1;
            }
            c51529KKf.LJIIZILJ("search_type", C50605JtZ.LJFF(i));
            if (LJIIJJI != null) {
                str2 = LJIIJJI.getSearchKeyword();
            }
            c51529KKf.LJIIZILJ("search_keyword", str2);
            c51529KKf.LJIJI(C50605JtZ.LIZIZ(activityC45651qj));
            c51529KKf.LIZLLL("button_type", "close");
            Integer num = C50656JuO.LIZ;
            if (num != null) {
                i2 = num.intValue();
            }
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    c51529KKf.LIZJ(0, "is_from_survey_card");
                    c51529KKf.LIZJ(1, "is_from_feedback_card");
                }
            } else {
                c51529KKf.LIZJ(i2, "is_from_survey_card");
                c51529KKf.LIZJ(0, "is_from_feedback_card");
            }
            c51529KKf.LJIILIIL();
        }
    }

    public static final String LJJJJJL(Object obj) {
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, obj);
        o.LJIIIIZZ(json, "get().toJson(this)");
        return json;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC82548WaW LJJJJL(UlikeMergedTemplateStruct ulikeMergedTemplateStruct) {
        TemplateResponseItem templateResponseItem;
        int i;
        o.LJIIIZ(ulikeMergedTemplateStruct, "<this>");
        int i2 = ulikeMergedTemplateStruct.templateType;
        if (i2 == EnumC43998HOo.MV_TEMPLATE.getValue()) {
            if (ulikeMergedTemplateStruct.mvData == null) {
                return null;
            }
            MvThemeData mvThemeData = new MvThemeData();
            UrlModel urlModel = new UrlModel(null, null, null, null, null, 31, null);
            List<String> url_list = ulikeMergedTemplateStruct.mvData.getFile_url().getUrl_list();
            ArrayList arrayList = new ArrayList(C32I.LJJL(url_list, 10));
            for (String str : url_list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(ulikeMergedTemplateStruct.mvData.getFile_url().getUri());
                arrayList.add(X1D.LIZIZ(LIZ));
            }
            urlModel.setUrl_list(arrayList);
            urlModel.setUri(ulikeMergedTemplateStruct.mvData.getMd5());
            UrlModel urlModel2 = new UrlModel(null, null, null, null, null, 31, null);
            List<String> url_list2 = ulikeMergedTemplateStruct.mvData.getIcon_url().getUrl_list();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(url_list2, 10));
            for (String str2 : url_list2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(ulikeMergedTemplateStruct.mvData.getIcon_url().getUri());
                arrayList2.add(X1D.LIZIZ(LIZ2));
            }
            urlModel2.setUrl_list(arrayList2);
            Effect effect = ulikeMergedTemplateStruct.mvData;
            effect.setFile_url(urlModel);
            effect.setIcon_url(urlModel2);
            mvThemeData.LJIILJJIL(effect);
            mvThemeData.urlPrefixList = ulikeMergedTemplateStruct.urlPrefix;
            mvThemeData.sourceId = 2;
            return mvThemeData;
        }
        EnumC43998HOo enumC43998HOo = EnumC43998HOo.CUT_SAME;
        if (i2 != enumC43998HOo.getValue() || (templateResponseItem = ulikeMergedTemplateStruct.cutsameInfo) == null) {
            return null;
        }
        String mediaId = ulikeMergedTemplateStruct.media_id;
        boolean z = ulikeMergedTemplateStruct.isCommerceMusic;
        String region = ulikeMergedTemplateStruct.region;
        String videoRatio = ulikeMergedTemplateStruct.videoRatio;
        int value = enumC43998HOo.getValue();
        o.LJIIIZ(mediaId, "mediaId");
        o.LJIIIZ(region, "region");
        o.LJIIIZ(videoRatio, "videoRatio");
        try {
            i = C172266pS.LIZ(templateResponseItem.extra).size();
        } catch (Exception unused) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cutsame extra illegal ");
            LIZ3.append(mediaId);
            H7B.LIZJ(X1D.LIZIZ(LIZ3));
            i = 0;
        }
        int i3 = 0;
        return new CutsameDataItem(mediaId, value, templateResponseItem.title, templateResponseItem.description, templateResponseItem.templateUrl, null, templateResponseItem.video, i3, 0L, templateResponseItem.extra, templateResponseItem.sdkVersion, templateResponseItem.md5, templateResponseItem.iconUrl, templateResponseItem.musicIds, templateResponseItem.challengeIds, z, i, region, videoRatio, templateResponseItem.authorInfo, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15729056, 0 == true ? 1 : 0);
    }

    public static final void LJJJJLI(int i) {
        FRW.LIZIZ(i, "power_permission_trace");
    }

    public static final C7WH LJJJJLL(RVG rvg) {
        long j;
        o.LJIIIZ(rvg, "<this>");
        String str = rvg.LIZLLL;
        Long l = rvg.LJI;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return new C7WH(str, Long.valueOf(j * 1000), 12);
    }

    public static void LIZLLL(C125184vi c125184vi, InterfaceC172486po interfaceC172486po) {
        NLEResourceAV LJ;
        String LIZJ;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(c125184vi.LJLILLLLZI.LJI());
        if (LJJ != null && (LJ = LJJ.LJ()) != null && (LIZJ = LJ.LIZJ()) != null) {
            String resourcePath = c125184vi.LJLIL.LIZLLL;
            o.LJIIIZ(resourcePath, "resourcePath");
            ((InterfaceC126144xG) C172286pU.LJ.getValue()).LIZ(LIZJ, resourcePath, interfaceC172486po);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        interfaceC172486po.onError(-1, "");
    }

    public static final OHW LJ(Cert cert, String[] strArr) {
        return new OHW(cert, "contentProvider_query", strArr, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 240004);
    }

    public static void LJIILIIL(Context context, Bundle bundle) {
        if (context == null) {
            return;
        }
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final List LJIJ(Context context, List list) {
        EnumC61598OFm enumC61598OFm;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(list, OHQ.LIZIZ);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            OHI.LIZ.getClass();
            if (OHI.LJ(context, str)) {
                enumC61598OFm = EnumC61598OFm.GRANTED;
            } else if (OHI.LJI((Activity) context, str)) {
                enumC61598OFm = EnumC61598OFm.DENIED_PERMANENT;
            } else {
                enumC61598OFm = EnumC61598OFm.THIS_OPERATION_NOT_PERMITTED;
            }
            arrayList.add(new C164906da(str, enumC61598OFm));
        }
        return arrayList;
    }

    public static final Object LJIJJLI(Class cls, String str) {
        try {
            return C09650Zl.LIZIZ.LJI(str, cls);
        } catch (Exception e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("fromJson(). jsonString=", str, ", e=");
            LIZIZ.append(e.getMessage());
            C0NB.LJ("SpeedManager_Base", X1D.LIZIZ(LIZIZ));
            return null;
        }
    }

    public static final String LJJ(C8W0 c8w0, boolean z) {
        String str;
        o.LJIIIZ(c8w0, "<this>");
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        String str2 = null;
        if (z) {
            C9ID c9id = (C9ID) new C55749LuL(C47704Ins.LJ(c8w0, C9ID.class, null), c8w0.checkSupervisorPrepared()).getValue();
            if (c9id != null) {
                str2 = c9id.LJLILLLLZI;
            }
            if (o.LJ(str2, "sticker_set_details_page")) {
                str = "sticker_set_details_page";
            }
        } else {
            C26175APb c26175APb = (C26175APb) new C55749LuL(C47704Ins.LJ(c8w0, C26175APb.class, null), c8w0.checkSupervisorPrepared()).getValue();
            if (c26175APb != null) {
                str2 = c26175APb.LJLJI;
            }
            if (o.LJ(str2, "sticker_set_details_page")) {
                return "sticker_set_details_page";
            }
        }
        return str;
    }

    public static final String LJJIJ(InfoStickerModel infoStickerModel, int i) {
        int i2;
        if (infoStickerModel == null || i < 0) {
            return null;
        }
        List<StickerItemModel> list = infoStickerModel.stickers;
        ArrayList LIZIZ = s1.LIZIZ(list, "stickers");
        Iterator<StickerItemModel> it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            StickerItemModel next = it.next();
            if (next.type == 2) {
                LIZIZ.add(next);
            }
        }
        if (!(!LIZIZ.isEmpty())) {
            LIZIZ = null;
        }
        String str = "";
        if (LIZIZ != null) {
            int size = LIZIZ.size();
            Iterator it2 = LIZIZ.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StickerItemModel stickerItemModel = (StickerItemModel) next2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(LJIL(stickerItemModel.startTime, stickerItemModel.endTime, i));
                    str = X1D.LIZIZ(LIZ);
                    if (i2 < size - 1) {
                        str = C42398GkU.LIZIZ(str, ',');
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return str;
    }

    public void LJJJJJ(int i, View view) {
        if (!LJLJJI) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                LJLJI = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            LJLJJI = true;
        }
        Field field = LJLJI;
        if (field != null) {
            try {
                LJLJI.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void LJIIJJI(Context context, Bundle bundle, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("control_request_url", true);
    }

    public static void LJIIL(Context context, Bundle bundle, Aweme aweme) {
        String webTitle;
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            webTitle = aweme.getAwemeRawAd().getSource();
        } else {
            webTitle = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString("bundle_download_app_name", webTitle);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        bundle.putString("aweme_json_extra", NN1.LJIIIZ(context, aweme).toString());
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (groupId != null && groupId.longValue() != 0) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        bundle.putInt("preload_web_second_page", aweme.getAwemeRawAd().getPreloadWebSecondPage());
        bundle.putString("preload_scene", "feed");
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putString("commerce_enter_from", "feedad");
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().LIZ());
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        bundle.putString("page_id", aweme.getAwemeRawAd().getPageId());
        bundle.putString("browser_config", GsonProtectorUtils.toJson(C75792yF.LIZIZ(), aweme.getAwemeRawAd().getBrowserConfig()));
    }

    public static void LJIILJJIL(Context context, Bundle bundle, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        String webTitle = aweme.getAwemeRawAd().getWebTitle();
        if (TextUtils.isEmpty(webTitle)) {
            webTitle = " ";
        }
        bundle.putString("bundle_web_title", webTitle);
        boolean z = true;
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        int i = -1;
        if (aweme.getAwemeRawAd().isUseDefaultColor()) {
            Integer LJI = C79045V0n.LJI(R.attr.cl, context);
            if (LJI != null) {
                i = LJI.intValue();
            }
            bundle.putInt("bundle_webview_background", i);
        } else {
            bundle.putInt("bundle_webview_background", -1);
        }
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putBoolean("web_apply_camera", aweme.getAwemeRawAd().getWebApplyCamera());
        if (aweme.getAwemeRawAd().getAutofillModel() != null) {
            bundle.putBoolean("autofill_enable", aweme.getAwemeRawAd().getAutofillModel().getEnable());
        }
        if (aweme.getAwemeRawAd().getLandingPageNetworkOptimization() != null) {
            bundle.putInt("network_optimization_type", aweme.getAwemeRawAd().getLandingPageNetworkOptimization().getNetworkOptimization());
        }
        bundle.putBoolean("use_ordinary_web", C78939UyV.LJJIZ(aweme.getAwemeRawAd()));
        if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
    }

    public static final String LJIL(int i, int i2, int i3) {
        if (i >= 0 && i2 > 0 && i2 <= i3) {
            return Q8U.LIZIZ(new Object[]{Float.valueOf((i2 - i) / 1000.0f)}, 1, "%.3f", "format(this, *args)");
        }
        return Q8U.LIZIZ(new Object[]{Float.valueOf(i3 / 1000.0f)}, 1, "%.3f", "format(this, *args)");
    }

    public static final String LJJIFFI(InfoStickerModel infoStickerModel, int i, List list) {
        if (infoStickerModel == null || i < 0) {
            return null;
        }
        List<StickerItemModel> list2 = infoStickerModel.stickers;
        ArrayList LIZIZ = s1.LIZIZ(list2, "stickers");
        for (StickerItemModel stickerItemModel : list2) {
            if (!list.contains(Integer.valueOf(stickerItemModel.type))) {
                LIZIZ.add(stickerItemModel);
            }
        }
        if (!(!LIZIZ.isEmpty())) {
            LIZIZ = null;
        }
        String str = "";
        if (LIZIZ != null) {
            int size = LIZIZ.size();
            Iterator it = LIZIZ.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StickerItemModel stickerItemModel2 = (StickerItemModel) next;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(LJIL(stickerItemModel2.startTime, stickerItemModel2.endTime, i));
                    str = X1D.LIZIZ(LIZ);
                    if (i2 < size - 1) {
                        str = C42398GkU.LIZIZ(str, ',');
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return str;
    }

    public static final String LJJIIZI(StickerNewEngineModel stickerNewEngineModel, EnumC157656Gr stickerType, int i) {
        int i2;
        o.LJIIIZ(stickerNewEngineModel, "<this>");
        o.LJIIIZ(stickerType, "stickerType");
        if (i < 0) {
            return null;
        }
        List<StickerModel> LJ = C6H4.LJ(stickerNewEngineModel);
        ArrayList arrayList = new ArrayList();
        Iterator<StickerModel> it = LJ.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            StickerModel next = it.next();
            if (next.getStickerType() == stickerType) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        String str = "";
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                StickerModel stickerModel = (StickerModel) next2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(LJIL((int) stickerModel.getBaseSticker().getStartTime(), (int) stickerModel.getBaseSticker().getEndTime(), i));
                str = X1D.LIZIZ(LIZ);
                if (i2 < arrayList.size() - 1) {
                    str = C42398GkU.LIZIZ(str, ',');
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return str;
    }

    public static I2E LJJIJIL(C17J c17j, long j, long j2) {
        c17j.getClass();
        if (j2 != 0) {
            long min = Math.min(j, j2);
            if (min == j2 && min < j) {
                return I2E.MUSIC;
            }
            return I2E.NONE;
        }
        return I2E.NONE;
    }

    public static final void LJJJ(C8W0 c8w0, boolean z, String scene) {
        String str;
        C9PN c9pn;
        String str2;
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(scene, "scene");
        String LJJ = LJJ(c8w0, z);
        if (z) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(c8w0, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn2 != null) {
                str = c9pn2.LIZ;
            } else {
                str = null;
            }
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (!z && (c9pn = (C9PN) C8VC.LJIIIIZZ(c8w0, C65352Pkq.LIZ(InterfaceC235089Km.class))) != null && (str2 = c9pn.LJII) != null) {
            str3 = str2;
        }
        C26335AVf.LJIIL(LJJ, str, str3, scene);
    }

    @Override // X.InterfaceC29074Bb4
    public void LIZ(ActivityC45651qj activity, C29930Bos c29930Bos, BNE bne) {
        if (C4LD.LIZIZ.LJJIJL()) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            shareService.LJIIJ(activity, c29930Bos, bne);
        } else {
            ShareService shareService2 = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            DialogC62475OfX LJI = shareService2.LJI(activity, c29930Bos, bne);
            if (LJI == null) {
                return;
            }
            C16880lQ.LIZ(LJI);
        }
    }

    public static final void LJIIZILJ(C8W0 c8w0, boolean z, C9IL contentType, java.util.Map hasFeatureMap) {
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(hasFeatureMap, "hasFeatureMap");
        for (Map.Entry entry : hasFeatureMap.entrySet()) {
            String str = (String) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJFF(c8w0, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk != null) {
                interfaceC235069Kk.y6(z, contentType, str, booleanValue);
            }
        }
    }

    public static final void LJIILLIIL(C8W0 c8w0, boolean z, C9IL contentType, String str, boolean z2) {
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(contentType, "contentType");
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJFF(c8w0, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            interfaceC235069Kk.y6(z, contentType, str, z2);
        }
    }

    public void LJJJJIZL(View view, int i, int i2, int i3, int i4) {
        if (!LJLILLLLZI) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                LJLIL = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            LJLILLLLZI = true;
        }
        Method method = LJLIL;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
