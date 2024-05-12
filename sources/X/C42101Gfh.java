package X;

import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gfh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42101Gfh extends AbstractC42096Gfc {
    public final C42102Gfi LIZLLL = new C42102Gfi(null, null, null, null, null, 31);

    @Override // X.AbstractC42096Gfc
    public final /* bridge */ /* synthetic */ InterfaceC42095Gfb LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJFF(VideoPublishEditModel model, EnumC42099Gff enumC42099Gff) {
        String str;
        String str2;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct;
        MvModel mvModel;
        String propSource;
        ArrayList<TimeSpeedModelExtension> deepCopyFinalVideoList;
        JSONObject optJSONObject;
        o.LJIIIZ(model, "model");
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = model.creativeFlowData.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos == null || (str = autoSelectedAnchorInfos.getAnchorShootWay()) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String stickers = model.getStickers();
        if (stickers != null && stickers.length() != 0 && (propSource = model.getPropSource()) != null && propSource.length() != 0 && (deepCopyFinalVideoList = model.deepCopyFinalVideoList()) != null) {
            Iterator<TimeSpeedModelExtension> it = deepCopyFinalVideoList.iterator();
            while (it.hasNext()) {
                SimpleEffect effectInfo = it.next().getEffectInfo();
                if (effectInfo != null) {
                    String extra = effectInfo.getExtra();
                    if (extra != null && extra.length() != 0 && (optJSONObject = new JSONObject(extra).optJSONObject("linked_anchor")) != null) {
                        String optString = optJSONObject.optString("keyword");
                        o.LJIIIIZZ(optString, "anchor.optString(\"keyword\")");
                        arrayList.add(optString);
                    }
                    if (C78685UuP.LJJJZ(effectInfo.getResourceId())) {
                        arrayList2.add(effectInfo.getName());
                    }
                }
            }
        }
        if (model.isPhotoMvMode || (aVUploadMiscInfoStruct = model.uploadMiscInfoStruct) == null || (mvModel = aVUploadMiscInfoStruct.mvInfo) == null || (str2 = mvModel.getName()) == null) {
            str2 = "";
        }
        if (enumC42099Gff == EnumC42099Gff.BEFORE_REAL_PUBLISH) {
            List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLIIIZ(SFS.LIZJ(SFS.LJIIJ(arrayList2)), SFS.LJIIJ(arrayList)));
            if (str2.length() > 0) {
                ((ArrayList) LLJILJILJ).add(str2);
            }
            return new C42102Gfi(null, null, null, null, LLJILJILJ, 15);
        }
        return new C42102Gfi(SFS.LJIIJ(arrayList), SFS.LIZJ(SFS.LJIIJ(arrayList2)), str2, str, null, 16);
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJII(LinkedHashMap publishMap, EnumC42099Gff enumC42099Gff) {
        String str;
        o.LJIIIZ(publishMap, "publishMap");
        Object obj = publishMap.get("anchors");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            List LIZLLL = C75792yF.LIZLLL(CreateAnchorInfo[].class, str);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
            Iterator it = LIZLLL.iterator();
            while (it.hasNext()) {
                arrayList.add(((CreateAnchorInfo) it.next()).getKeyword());
            }
            return new C42102Gfi(null, null, null, null, SFS.LIZJ(arrayList), 15);
        }
        return this.LIZLLL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r4.equals("prop_link") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r6 == X.EnumC42099Gff.ENTER_PUBLISH) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r6 != X.EnumC42099Gff.ENTER_EDIT) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r4.equals("prop") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0013 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ(java.lang.String r4, X.EnumC42099Gff r5, X.EnumC42099Gff r6) {
        /*
            java.lang.String r0 = "lastNodeName"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "newNodeName"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r0 = r4.hashCode()
            r3 = 1
            r2 = 0
            switch(r0) {
                case -1655966961: goto L15;
                case -728339626: goto L2b;
                case 3497: goto L34;
                case 96673: goto L51;
                case 3449699: goto L63;
                default: goto L13;
            }
        L13:
            r3 = 0
        L14:
            return r3
        L15:
            java.lang.String r0 = "activity"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L1e
            goto L13
        L1e:
            java.util.List<X.Gff> r0 = X.C42100Gfg.LIZ
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L13
            X.Gff r0 = X.EnumC42099Gff.ENTER_RECORD
            if (r6 == r0) goto L13
            goto L14
        L2b:
            java.lang.String r0 = "prop_link"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L6c
            goto L13
        L34:
            java.lang.String r0 = "mv"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L3d
            goto L13
        L3d:
            r0 = 2
            X.Gff[] r1 = new X.EnumC42099Gff[r0]
            X.Gff r0 = X.EnumC42099Gff.ENTER_PUBLISH
            r1[r2] = r0
            X.Gff r0 = X.EnumC42099Gff.ENTER_EDIT
            r1[r3] = r0
            java.util.List r0 = X.C47261Igj.LJJIJIIJI(r1)
            boolean r3 = r0.contains(r6)
            goto L14
        L51:
            java.lang.String r0 = "all"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L5a
            goto L13
        L5a:
            X.Gff r0 = X.EnumC42099Gff.REAL_PUBLISH
            if (r6 != r0) goto L13
            X.Gff r0 = X.EnumC42099Gff.BEFORE_REAL_PUBLISH
            if (r5 != r0) goto L13
            goto L14
        L63:
            java.lang.String r0 = "prop"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L6c
            goto L13
        L6c:
            X.Gff r0 = X.EnumC42099Gff.ENTER_PUBLISH
            if (r6 == r0) goto L14
            X.Gff r0 = X.EnumC42099Gff.ENTER_EDIT
            if (r6 != r0) goto L13
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42101Gfh.LJIIIIZZ(java.lang.String, X.Gff, X.Gff):boolean");
    }

    @Override // X.AbstractC42096Gfc
    public final InterfaceC42095Gfb LJ(ShortVideoContext shortVideoContext, List<? extends InterfaceC42095Gfb> list, EnumC42099Gff enumC42099Gff) {
        String str;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = shortVideoContext.creativeFlowData.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos == null || (str = autoSelectedAnchorInfos.getAnchorShootWay()) == null) {
            str = "";
        }
        return new C42102Gfi(null, null, null, str, null, 23);
    }

    @Override // X.AbstractC42096Gfc
    public final List<Object> LIZJ(InterfaceC42095Gfb interfaceC42095Gfb, InterfaceC42095Gfb interfaceC42095Gfb2, EnumC42099Gff lastNodeName, EnumC42099Gff newNodeName) {
        o.LJIIIZ(lastNodeName, "lastNodeName");
        o.LJIIIZ(newNodeName, "newNodeName");
        if (!(interfaceC42095Gfb instanceof C42102Gfi) || !(interfaceC42095Gfb2 instanceof C42102Gfi)) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(lastNodeName);
        LIZ.append('-');
        LIZ.append(newNodeName);
        String LIZIZ = X1D.LIZIZ(LIZ);
        boolean z = true;
        if (newNodeName == EnumC42099Gff.REAL_PUBLISH && !e1.LIZ(31744, "enable_fund_safety_monitor_publish_dialog", true, true) && !C211898Th.LIZ()) {
            z = false;
        }
        C42102Gfi c42102Gfi = (C42102Gfi) interfaceC42095Gfb;
        C42102Gfi c42102Gfi2 = (C42102Gfi) interfaceC42095Gfb2;
        String LIZIZ2 = C42090GfW.LIZIZ(c42102Gfi.LJLIL, c42102Gfi2.LJLIL, LJIIIIZZ("prop_link", lastNodeName, newNodeName));
        if (LIZIZ2 != null) {
            arrayList.add(new C42571GnH("prop_link", LIZIZ2, LIZIZ, z));
        }
        String LIZIZ3 = C42090GfW.LIZIZ(c42102Gfi.LJLILLLLZI, c42102Gfi2.LJLILLLLZI, LJIIIIZZ("prop", lastNodeName, newNodeName));
        if (LIZIZ3 != null) {
            arrayList.add(new C42571GnH("prop", LIZIZ3, LIZIZ, z));
        }
        String LIZ2 = C42090GfW.LIZ(c42102Gfi.LJLJI, c42102Gfi2.LJLJI, LJIIIIZZ("mv", lastNodeName, newNodeName));
        if (LIZ2 != null) {
            arrayList.add(new C42571GnH("mv", LIZ2, LIZIZ, z));
        }
        String LIZ3 = C42090GfW.LIZ(c42102Gfi.LJLJJI, c42102Gfi2.LJLJJI, LJIIIIZZ("activity", lastNodeName, newNodeName));
        if (LIZ3 != null) {
            arrayList.add(new C42571GnH("activity", LIZ3, LIZIZ, z));
        }
        String LIZIZ4 = C42090GfW.LIZIZ(c42102Gfi.LJLJJL, c42102Gfi2.LJLJJL, LJIIIIZZ("all", lastNodeName, newNodeName));
        if (LIZIZ4 != null) {
            arrayList.add(new C42571GnH("all", LIZIZ4, LIZIZ, z));
        }
        return arrayList;
    }
}
