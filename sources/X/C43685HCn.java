package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HCn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43685HCn implements InterfaceC44444HcO {
    public final ShortVideoContext LIZ;
    public final I0N LIZIZ;
    public C43686HCo LIZJ;
    public final List<String> LIZLLL;
    public FaceStickerBean LJ;

    @Override // X.InterfaceC44444HcO
    public final void init() {
        List<InteractStickerStruct> stickerStructsByPage;
        java.util.Map map;
        NormalTrackTimeStamp[] normalTrackTimeStampArr;
        if (this.LIZJ == null) {
            C43686HCo c43686HCo = new C43686HCo();
            if (this.LIZ.LJJJI() || this.LIZ.LJJIJIIJI()) {
                c43686HCo.LJLJI = false;
            }
            if (!C38354F3m.LJ(this.LIZ.extraSession.mainBusinessData)) {
                ShortVideoContext shortVideoContext = this.LIZ;
                String str = shortVideoContext.extraSession.mainBusinessData;
                int i = (int) shortVideoContext.cameraComponentModel.mTotalRecordingTime;
                if (c43686HCo.LJLJI) {
                    c43686HCo.LJLJJLL = i;
                    EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_RECORD;
                    InteractStickerTracksContext LJIIIIZZ = C164826dS.LJIIIIZZ(str);
                    if (LJIIIIZZ == null) {
                        stickerStructsByPage = null;
                    } else {
                        stickerStructsByPage = LJIIIIZZ.getStickerStructsByPage(enumC164816dR);
                    }
                    if (!C79004UzY.LJJIFFI(stickerStructsByPage)) {
                        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                            if (interactStickerStruct.getType() == 2 && !C38354F3m.LJ(interactStickerStruct.getAttr()) && !C38354F3m.LJ(interactStickerStruct.getTrackList()) && (map = (java.util.Map) GsonProtectorUtils.fromJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), interactStickerStruct.getAttr(), java.util.Map.class)) != null && map.containsKey("interaction_extra")) {
                                try {
                                    RecordInteractExtra recordInteractExtra = (RecordInteractExtra) C44172HVg.LJIJI.getRetrofitFactoryGson().LJI(new JSONObject((java.util.Map) map.get("interaction_extra")).toString(), RecordInteractExtra.class);
                                    if (recordInteractExtra != null && !C38354F3m.LJ(recordInteractExtra.getStickerId()) && (normalTrackTimeStampArr = (NormalTrackTimeStamp[]) GsonProtectorUtils.fromJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class)) != null && normalTrackTimeStampArr.length != 0) {
                                        c43686HCo.LJLJJI.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        c43686HCo.LJLJJL.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
            this.LIZJ = c43686HCo;
        }
    }

    @Override // X.InterfaceC44444HcO
    public final List<String> LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44444HcO
    public final void LIZIZ(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(list);
    }

    @Override // X.InterfaceC44444HcO
    public final void LIZJ(ShortVideoContext context) {
        C164846dU c164846dU;
        o.LJIIIZ(context, "context");
        C43686HCo c43686HCo = this.LIZJ;
        if (c43686HCo == null || !c43686HCo.LJLJI) {
            return;
        }
        int i = (int) context.cameraComponentModel.mTotalRecordingTime;
        if (i - c43686HCo.LJLJJLL < -10) {
            c43686HCo.LIZIZ(i);
            c43686HCo.LJLJJLL = i;
        }
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : c43686HCo.LJLJJI.entrySet()) {
            ExtraParams extraParams = c43686HCo.LJLJJL.get(entry.getKey());
            List<NormalTrackTimeStamp> value = entry.getValue();
            if (!C79004UzY.LJJIFFI(value) && extraParams != null) {
                RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                recordInteractExtra.formatFromExtraParams(extraParams, entry.getKey());
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("interaction_extra", recordInteractExtra);
                interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), linkedHashMap));
                interactStickerStruct.setType(2);
                interactStickerStruct.setIndex(i2);
                interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), value));
                linkedList.add(interactStickerStruct);
                i2++;
            }
        }
        String str = context.extraSession.mainBusinessData;
        EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_RECORD;
        boolean z = c43686HCo.LJLJL;
        if (C38354F3m.LJ(str)) {
            c164846dU = new C164846dU();
        } else {
            try {
                c164846dU = (C164846dU) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJI(str, C164846dU.class);
            } catch (Exception unused) {
                c164846dU = new C164846dU();
            }
        }
        InteractStickerTracksContext interactStickerTracksContext = c164846dU.mInteractStickerContext;
        if (interactStickerTracksContext == null) {
            interactStickerTracksContext = new InteractStickerTracksContext();
        }
        interactStickerTracksContext.upDateStickerStructs(linkedList, enumC164816dR);
        c164846dU.setInteractStickerContext(interactStickerTracksContext);
        c164846dU.interactStickerCheckEffectSdk = z;
        context.extraSession.mainBusinessData = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), c164846dU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (ujb.o.LJJJLIIL(r1, "http", false) != false) goto L34;
     */
    @Override // X.InterfaceC44444HcO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(int r7) {
        /*
            r6 = this;
            X.HCo r3 = r6.LIZJ
            if (r3 == 0) goto L1c
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r4 = r6.LJ
            if (r4 != 0) goto Le
            X.I0N r0 = r6.LIZIZ
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r4 = r0.Z5()
        Le:
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r6.LJ
            if (r0 != 0) goto L14
            r6.LJ = r4
        L14:
            if (r4 != 0) goto L17
            return
        L17:
            boolean r0 = r3.LJLJI
            r5 = 0
            if (r0 != 0) goto L1d
        L1c:
            return
        L1d:
            int r0 = r3.LJLJJLL
            int r1 = r7 - r0
            r0 = -10
            if (r1 >= r0) goto L2b
            r3.LIZIZ(r7)
            r3.LJLJJLL = r7
            goto L1c
        L2b:
            java.lang.String r0 = r3.LJLIL
            boolean r0 = X.C38354F3m.LJ(r0)
            if (r0 == 0) goto L34
            goto L1c
        L34:
            int r1 = r3.LJLJJLL
            r0 = -1
            if (r1 == r0) goto L3f
            int r1 = r7 - r1
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 <= r0) goto L1c
        L3f:
            r3.LJLJJLL = r7
            X.EQd r0 = X.C44172HVg.LJIJI
            com.google.gson.Gson r2 = r0.getRetrofitFactoryGson()
            java.lang.String r1 = r4.getExtra()
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r0 = com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r2 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r2 = (com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r2
            if (r2 == 0) goto L1c
            boolean r0 = r2.isUrlInteractionStickerValid()
            if (r0 != 0) goto L5c
            goto L1c
        L5c:
            java.lang.String r0 = r2.getInteractionIcon()
            if (r0 == 0) goto L81
            java.lang.String r1 = r2.getInteractionIcon()
            java.lang.String r0 = "extraParams.interactionIcon"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "http"
            boolean r0 = ujb.o.LJJJLIIL(r1, r0, r5)
            if (r0 == 0) goto L81
        L73:
            long r0 = r4.getStickerId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.LJLILLLLZI = r0
            r3.LIZ(r7, r2)
            goto L1c
        L81:
            java.util.List<java.lang.String> r0 = r6.LIZLLL
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L73
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            java.lang.String r0 = r2.getInteractionIcon()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.setInteractionIcon(r0)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43685HCn.update(int):void");
    }

    public C43685HCn(ShortVideoContext shortVideoContext, C46193IAz stickerApiComponent) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        this.LIZ = shortVideoContext;
        this.LIZIZ = stickerApiComponent;
        this.LIZLLL = new ArrayList();
    }
}
